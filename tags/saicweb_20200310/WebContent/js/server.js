// ---------------------------------------------------------------------
// ----------   Server Communication Section   -------------------------
//
// This script uses objects defined in "xml.js" script
//
// applicationResponseHandler ( rootXmlNode ) should be defined in
// the application which uses this script
//


var servletPath      = "AppManagerServlet.app";

var xmlHttp          = null;
var XML_HTTP_UNSENT  = 0;
var XML_HTTP_OPEN    = 1;
var XML_HTTP_SENT    = 2;
var XML_HTTP_LOADING = 3;
var XML_HTTP_DONE    = 4;
var HTTP_STATUS_OK   = 200; 

var urlQueue         = new Array ( );
var cmdQueue         = new Array ( );
var responseQueue    = new Array ( );
var waitingMaskDiv   = null;


/**
 *
 */
function showWaiting ( visible )
{
  var waitingDiv = document.getElementById ( "waitingDiv" );
  if ( ( waitingDiv == null || ! waitingDiv ) && parent )
  {
    waitingDiv = parent.document.getElementById ( "waitingDiv" );
  }
  if ( waitingDiv )
  {
    var visibility = "hidden";
    if ( visible ) visibility = "visible";
    waitingDiv.style.visibility = visibility;
  }
}


/**
 *
 */
function showWaitingMaskDiv ( )
{
  var theBody = document.getElementsByTagName ( 'BODY' ) [ 0 ];
  if ( waitingMaskDiv == null )
  {
    waitingMaskDiv = document.createElement ( "div" );
    waitingMaskDiv.id = "waitingMaskDiv";
    waitingMaskDiv.style.filter  = "alpha(opacity=20)";
    waitingMaskDiv.style.float   = "left";
    waitingMaskDiv.style.opacity = "0.20";
    waitingMaskDiv.style.width   = "100%";
    waitingMaskDiv.style.height  = "100%";
    waitingMaskDiv.style.zIndex = "20000";
    waitingMaskDiv.innerHTML = "<br><br><br><br><br><br><br><center><font size=5>Procesando</font></cener>";
    theBody.appendChild ( waitingMaskDiv );
  }
  if ( waitingMaskDiv != null )
  {
    waitingMaskDiv.style.visibility = "visible";
    waitingMaskDiv.style.display = "block";
  }
}


/**
 *
 */
function closeWaitingMaskDiv ( )
{
  var theBody = document.getElementsByTagName ( "BODY" ) [ 0 ];
  if ( theBody && waitingMaskDiv != null )
  {
    waitingMaskDiv.style.visibility = "hidden";
    waitingMaskDiv.style.display = "none";
  }
}


/**
 *
 */
function setWaitingMode ( mode )
{
  if ( mode )
  {
    showWaitingMaskDiv ( );
  }
  else
  {
    closeWaitingMaskDiv ( );
  }
  showWaiting ( mode );
}


/**
 *
 */
function getRequestResponse ( )
{
  setWaitingMode ( false );

  var response = "";

  if ( xmlHttp && xmlHttp.readyState == XML_HTTP_DONE )
  {
    try
    {
      if ( xmlHttp.status == HTTP_STATUS_OK )
      {
        response = xmlHttp.responseText;
        
        //alert("response");
        //alert(response);
        
        
      }
      else
      {
        //alert ( "XMLHttp status is " + xmlHttp.status + " [ " + xmlHttp.statusTest + " ]" );
      }
    }
    catch ( e )
    {
      //alert ( e );
      return;
    }
  }

  dequeueRequest ( );

  if ( response == null || response.length == 0 || response == "\r\n" )
  {
    return;
  }

  enqueueResponse ( response );
}


/**
 *
 */
function processRequestResponse ( response )
{
  setWaitingMode ( false );

  closeConfirmationSubmodal ( );

  if ( parent.debugMessage )
  {
    parent.debugMessage ( "RequestResponse=" + response );
  }

  if ( response.indexOf ( "<html" ) == 0 )
  {
    var index = response.indexOf ( "onload=\"" );
    if ( index > 0 ) index = response.indexOf ( "alert ( '" );
    if ( index < 0 ) index = response.indexOf ( "showA ( '" );
    var index2 = response.indexOf ( "' );" );
    if ( index > 0 && index2 > index )
    {
      alert ( response.substring ( index + 9, index2 ) );
    }

    index = response.indexOf ( "<?xml" );
    if ( index > 0 ) response = response.substring ( index );
  }

  if ( response.indexOf ( "<?" ) != 0 )
  {
    var msg = "Illegal response [" + response + "]";
    window.status = msg;
    //alert ( msg );
    dequeueResponse ( );
    return;
  }

  var root = new XmlNode ( "", "" );
  root.parse ( response );

  var error = root.getAttributeValue ( "alert" );
  if ( error != null && error.length > 0 ) alert ( error );

  var errors = root.getAttributeValue ( "errors" );
  if ( errors != null && errors.length > 0 )
  {
    if ( parent.debugMessage ) parent.debugMessage ( "errors=" + errors );
    if ( parent.showMessages ) parent.showMessages ( errors );
  }

  var contentCodes = root.getAttributeValue ( "contentCodes" );
  if ( contentCodes != null && contentCodes.length > 0 && parent.showContents )
  {
    parent.showContents ( contentCodes );
  }

  var fieldName = root.getAttributeValue ( "fieldAtFocus" );
  if ( fieldName != null && fieldName.length > 0 && setField )
  {
    setField ( fieldName );
  }
  fieldName = root.getAttributeValue ( "returnToField" );
  if ( fieldName != null && fieldName.length > 0 && returnToField )
  {
    returnToField ( fieldName );
  }
  var rowState = root.getAttributeValue ( "rowState" );
  if ( rowState != null && rowState.length > 0 && setRowState )
  {
    setRowState ( rowState );
  }

  var command = root.getAttributeValue ( "command" );

  if ( command == null || command == "" )
  {
    //Bug in <xml.js>: excessive level of xml nodes hierarchy
    root = root.get ( 0 );
    command = root.getAttributeValue ( "command" );
  }

  if ( command == null || command == "" )
  {
    alert ( "No Command: " + root.getXmlDoc ( ) );
  }
  else if ( command == "ResetField" )
  {
    if ( root && root.getValue && resetField )
    {
      resetField ( root.getValue ( ) );
    }
  }
  else if ( command == "Restart" )
  {
    if ( parent.debugMessage ) parent.debugMessage ( "window.location = index.jsp" );
    var loc = "" + parent.window.location;
    console.log("processRequestResponse ");
    console.log(command);
    console.log("navigating to " + loc);
    parent.window.location = loc;
  }
  else if ( command == "debugJDP" )
  {
    if ( parent.debugMessage ) parent.debugMessage ( "\r\n" + response + "\r\n" );
  }
  else if ( command == "debugCommands" )
  {
    alert ( root.getValue ( ) );
  }
  else if ( command == "debugStack" )
  {
    alert ( response );
  }
  else if ( command == "debugGlobals" )
  {
    alert ( response );
  }
  else if ( command == "debuggingMessage" )
  {
    if ( root && root.getValue && parent.debugMessage )
    {
      parent.debugMessage ( "\r\n" + root.getValue ( ) + "\r\n" );
    }
  }
  else if ( command == "Alert" )
  {
    if ( root && root.getValue )
    {
      alert ( root.getValue ( ) );
    }
  }
  else if ( command == "ConfirmationMenu" )
  {
    showConfirmationMenu ( root, "yes" );
  }
  else if ( command == "Refresh" )
  {
    doAppCommand ( "SHOW" );
  }
  else if ( command == "Refresh2" )
  {
    doAppCommand ( "SHOW2" );
  }
  else if ( command == "ShowErrors" )
  {
    if ( root && parent.showMessages )
    {
      parent.showMessages ( root.getValue ( ) );
    }
  }
  else if ( parent.showSubMenu && command == "SubMenu" )
  {
    var menuResponse = parent.showSubMenu ( root );
  }
  else if ( applicationResponseHandler )
  {
    applicationResponseHandler ( root );
  }
  else
  {
    alert ( "command=[" + command + "]\r\n" + response );
  }

  dequeueResponse ( );
}


/**
 *
 */
function getXMLHttpRequest ( )
{
  if ( window.XMLHttpRequest )
  {
    xmlHttp = new XMLHttpRequest ( );
  }
  else if ( window.ActiveXObject )
  {
    xmlHttp = new ActiveXObject ( "Microsoft.XMLHTTP" );
  }
  else
  {
    alert ( "Your browser does not support XMLHttpRequest" );
  }
}


/**
 *
 */
function sendRequest ( url, request )
{
	//alert("request");
	//alert(request);
	//alert(url);
	
	
  if ( xmlHttp == null )
  {
    getXMLHttpRequest ( );
  }

  try
  {
    xmlHttp.open ( "POST", url, true );  // async
    xmlHttp.onreadystatechange = getRequestResponse;
    if ( xmlHttp.readyState != XML_HTTP_OPEN )
    {
      window.setTimeout ( "sendRequest ( '" + url + "', '" + request + "' );", 100 );
      return;
    }
    xmlHttp.setRequestHeader ( "Content-Type", "application/x-www-form-urlencoded" );
    xmlHttp.setRequestHeader ( "Content-Length", request.length );
    xmlHttp.setRequestHeader ( "Connection", "close" );
  }
  catch ( e )
  {
    alert ( e + "\r\n" + url + "\r\n" + request );
    return;
  }

  xmlHttp.send ( request );

  setWaitingMode ( true );

  if ( parent.debugMessage ) parent.debugMessage ( url + "?" + request );
}


/**
 *
 */
function enqueueRequest ( url, cmd )
{
  var k = urlQueue.length;
  urlQueue [ k ] = url;
  cmdQueue [ k ] = cmd;
}


/**
 *
 */
function dequeueRequest ( )
{
  if ( urlQueue.length > 0 )
  {
    var url = urlQueue [ 0 ];
    var cmd = cmdQueue [ 0 ];
    urlQueue.splice ( 0, 1 );
    cmdQueue.splice ( 0, 1 );
    sendRequest ( url, cmd );
  }
}


/**
 *
 */
function enqueueResponse ( res )
{
  responseQueue [ responseQueue.length ] = res;
  if ( responseQueue.length == 1 ) dequeueResponse ( );
}


/**
 *
 */
function dequeueResponse ( )
{
  if ( parent && parent.waitingMessageResponse && parent.waitingMessageResponse ( ) )
  {
    window.setTimeout ( 'dequeueResponse ( );', 200 );
    return;
  }

  if ( responseQueue.length > 0 )
  {
    var response = responseQueue [ 0 ];
    responseQueue.splice ( 0, 1 );
    processRequestResponse ( response );
  }
}


/**
 *
 */
function doRequest ( url, request )
{
  enqueueRequest ( url, request );
  if ( urlQueue.length == 1 ) dequeueRequest ( );
}


/**
 *
 */
function doAppRequest ( cmd )
{
  if ( cmd != null && cmd.length > 0 )
  {
    doRequest ( servletPath, cmd );
  }
}


/**
 *
 */
function doAppRequestCommand ( cmd )
{
  if ( cmd != null && cmd.length > 0 )
  {
    doRequest ( servletPath, "command=callCommand&appCommand=" + cmd );
  }
}


/**
 *
 */
function notifyAppRequestCommand ( cmd )
{
  if ( cmd != null && cmd.length > 0 )
  {
    doRequest ( servletPath, "command=notifyCommand&appCommand=" + cmd );
  }
}


/**
 *
 */
function doAppCommand ( cmd )
{
  if ( cmd != null && cmd.length > 0 )
  {
    var newLocation = servletPath + "?command=" + cmd;

    //alert ( "doAppCommand: " + newLocation );
    if ( parent.debugMessage ) parent.debugMessage ( "window.location = " + newLocation );
    console.log("doAppCommand ");
    console.log(cmd);
    console.log("navigating to " + newLocation);
    window.location = newLocation;
  }
}


/**
 *
 */
function doAppCommandByCode ( code )
{
  if ( code != null && code.length > 0 )
  {
    var newLocation = servletPath + "?command=callCommand&appCommand=" + code;
    //var newLocation = servletPath + "?command=executeCommand&appCommand=" + code;
    if ( parent.debugMessage ) parent.debugMessage ( "window.location = " + newLocation );
    console.log("doAppCommandByCode");
    console.log(cmd);
    console.log("navigating to " + newLocation);
    window.location = newLocation;
  }
}


/**
 *
 */
function doAppCommandAction ( cmd, code )
{
  if ( cmd != null && cmd.length > 0 && code != null && code.length > 0 )
  {
    var newLocation = servletPath + "?command=" + cmd + "&action=" + code;
    if ( parent.debugMessage ) parent.debugMessage ( "window.location = " + newLocation );
    console.log("doAppCommandAction");
    console.log(cmd);
    console.log("navigating to " + newLocation);
    window.location = newLocation;
  }
}



// ---------------------------------------------------------------------
// ----------   Confirmation Menu Section   ----------------------------

document.write ( '<script language="JavaScript" src="js/submodal.js"></script>\r\n' );


/**
 *
 */
function showConfirmationMenuXml ( xmlData, includeCmd )
{
  var root = new XmlNode ( "", "" );
  root.parse ( xmlData );
  showConfirmationMenu ( root, includeCmd );
}


/**
 *
 */
function showConfirmationMenu ( root, includeCmd )
{
  var choices = new Array ( );
  var message = "";
  var node;
  var size = root.size ( );

  for ( var k = 0; k < size; k ++ )
  {
    node = root.get ( k );
    var obj = node.getObject ( );
    if ( "message" == obj )
    {
      message = node.getValue ( );
    }
    else if ( "choice" == obj )
    {
      choices [ parseInt ( node.getAttributeValue ( "id" ) ) ] = node;
    }
  }

  /*if ( message == "" )
  {
    alert ( root.getXmlDoc ( ) );
    return;
  }*/

  buildConfirmationMenu ( message, choices, includeCmd );
}


/**
 *
 */
function buildConfirmationMenu ( message, choices, includeCmd )
{
  var size = choices.length;

  if ( size == 2 )
  {
    var actionTitle1 = choices [ 0 ].getAttributeValue ( "actionTitle" );
    var cmd1 = buildConfirmationMenuCmd ( choices [ 0 ],0 , includeCmd );
    var actionTitle2 = choices [ 1 ].getAttributeValue ( "actionTitle" );
    var cmd2 = buildConfirmationMenuCmd ( choices [ 1 ],1 , includeCmd );

    openConfirmModal ( message, 450, 30, actionTitle1, actionTitle2, cmd1, cmd2 );
    return;
  }

  var html = "<table cellpadding='1' cellspacing='1' border='1'>";
  for ( var id = 0; id < size; id ++ )
  {
    var actionTitle = choices [ id ].getAttributeValue ( "actionTitle" );
    var cmd = buildConfirmationMenuCmd ( choices [ id ], id, includeCmd );
    var tdText = "<td class='menuChoice' id='choice" + id + "' align='right' onclick='" + cmd + "' >&nbsp;" + actionTitle + "</td>";

    html = html + "<tr>" + tdText + "</tr>";
  }

  html = html + "</table>";
  var scrH = ( size * 20 ) + 15;
  var h = 75 + scrH;
  if ( scrH > 140 )
  {
    h = 220;
    scrH = 145;
  }

  openMenuSubmodal ( html, message, 450, 30, 200, h, scrH, 'html' );
}


/**
 *
 */
function buildConfirmationMenuCmd  ( choice, id, includeCmd )
{
  var action      = choice.getAttributeValue ( "action"      );
  var actionType  = choice.getAttributeValue ( "actionType"  );
  var actionCall  = choice.getAttributeValue ( "actionCall"  );
  var cmd ="command=confMenuAction&actionId=" + id + "&action=" + action + "&actionType=" + actionType + "&actionCall=" + actionCall;
  if ( includeCmd == "yes" )
  {
    cmd = "var cmd=\"" + cmd + "\"; doAppRequest ( cmd );"
  }
  else
  {
    cmd = "var cmd=\"" + cmd + "\"; alert ( cmd );'";
  }
  return cmd;
}
