// ---------------------------------------------------------------------
// ----------   Including Other JavaScripts Section   ------------------
//
// requires getObjectInFocusHelpCode ( ) function in the target frame
//

document.write ( '<script language="JavaScript" src="js/xml.js"></script>\r\n' );



// ---------------------------------------------------------------------
// ----------   Constants   --------------------------------------------

/**  */
var legendDivId = "legendDiv";



// ---------------------------------------------------------------------
// ----------   Variables   --------------------------------------------

var msgXmlHttp;
var messageObject = new MessageManipulation ( );
var messageCashe  = new MessageCashe ( );
var messageQueue  = "";
var remote;
var waitingMessage = false;



// ---------------------------------------------------------------------
// ----------   Common Methods   ---------------------------------------

/**
 *
 */
function getMessageObject ( )
{
  if ( ! messageObject ) messageObject = new MessageManipulation ( );
  return messageObject;
}


/**
 *
 */
function getMessages ( )
{
  getMessageObject ( ).doMessageList ( );
}


/**
 *
 */
function showMessage ( code )
{
  //alert ( code );
  var msg = getMessageObject ( );
  msg.setMessageId ( code );
  msg.doMessage ( );
}


/**
 *
 */
function hideMessage ( )
{
  var msg = getMessageObject ( );
  msg.hideLegend ( );
}


/**
 *
 */
function showMessageNoTarget ( code )
{
  var msg = getMessageObject ( );
  if ( code && code.length > 0 )
  {
    msg.setMessageId ( code );
    msg.doMessage ( );
  }
  else
  {
    msg.hideLegend ( );
  }
}


/**
 *
 */
function waitingMessageResponse ( )
{
  return waitingMessage;
}


/**
 *
 */
function doQueue ( )
{
  if ( messageQueue.length > 0 )
  {
    var code = "";
    var ind = messageQueue.indexOf ( ';' );
    if ( ind > 0 )
    {
      code = messageQueue.substring ( 0, ind );
      messageQueue = messageQueue.substring ( ind + 1 );
    }
    else
    {
      code = messageQueue;
    }
    showMessage ( code );
  }
}


/**
 *
 */
function showMessages ( list )
{
  if ( list != null && list.length > 0 ) messageQueue += list;
  doQueue ( );
}



// ---------------------------------------------------------------------
// ----------   Classes   ----------------------------------------------

/**
 *
 */
function MessageManipulation ( )
{
  // ---------------------------------------------------------------------
  // ----------   Instance attributes   ----------------------------------

  this.messageId;
  this.target;



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   *
   */
  this.setMessageId = function ( id )
  {
    this.messageId = id;
  }


  /**
   *
   */
  this.setTarget = function ( value )
  {
    this.target = value;
  }


  /**
   *
   */
  this.createXMLHttpRequest = function ( )
  {
    if ( msgXmlHttp ) return;

    if ( window.ActiveXObject )
    {
      msgXmlHttp = new ActiveXObject ( "Microsoft.XMLHTTP" );
    }
    else if ( window.XMLHttpRequest )
    {
      msgXmlHttp = new XMLHttpRequest ( );
    }
  }


  /**
   *
   */
  this.doMessage = function ( )
  {
    //debugger;
    if ( ! messageCashe ) messageCashe = new MessageCashe ( );
    var resIndex = messageCashe.checkMessage ( this.messageId );

    if ( resIndex != -1 && ! this.target )
    {
      var result = messageCashe.getMessage ( resIndex );
      this.chooseView ( result );
    }
    else
    {
      if ( ! msgXmlHttp ) this.createXMLHttpRequest ( );

      var url = "MessageService.mes?getMessageAction=" + this.messageId;

      waitingMessage = true;
      msgXmlHttp.open ( "POST", url, true );
      msgXmlHttp.onreadystatechange = this.setMessage;
      msgXmlHttp.setRequestHeader ( "Content-Type", "application/x-www-form-urlencoded" );
      msgXmlHttp.setRequestHeader ( "Content-Length", url.length );
      msgXmlHttp.setRequestHeader ( "Connection", "close" );
      msgXmlHttp.send ( null  );
    }
  }


  /**
   *
   */
  this.doMessageList = function ( )
  {
    if ( ! msgXmlHttp ) this.createXMLHttpRequest ( );

    var url = "MessageService.mes?getMessages=0";
    msgXmlHttp.open ( "POST", url, true );
    msgXmlHttp.onreadystatechange = this.setMessageList;
    msgXmlHttp.send ( null );
  }


  /**
   *
   */
  this.setMessageList = function ( )
  {
    if ( msgXmlHttp.readyState == 4 )
    {
      if ( msgXmlHttp.status == 200 )
      {
        var result = msgXmlHttp.responseText;
        if ( result && result.length > 0 )
        {
          var list = result.split ( "," );
          objectLists [ "HelpList" ] = new Array ( );
          objectLists [ "HelpList" ] [ 0 ] = "HEL";
          var helpCount = 1;
          objectLists [ "ErrorList" ] = new Array ( );
          objectLists [ "ErrorList" ] [ 0 ] = "ERR";
          var errorCount = 1;
          objectLists [ "LegendList" ] = new Array ( );
          objectLists [ "LegendList" ] [ 0 ] = "LEG";
          var legendCount = 1;
          var secondChar = "";
          for ( var i = 0; i < list.length; i++ )
          {
            secondChar = list [ i ].charAt ( 1 );
            if ( secondChar == 'H' )
            {
              objectLists [ "HelpList" ] [ helpCount ] = list [ i ];
              helpCount ++;
            }
            else if ( secondChar == 'E' )
            {
              objectLists [ "ErrorList" ] [ errorCount ] = list [ i ];
              errorCount ++;
            }
            else if ( secondChar == 'L' )
            {
              objectLists [ "LegendList" ] [ legendCount ] = list [ i ];
              legendCount ++;
            }
          }
        }
      }
    }
  }


  /**
   *
   */
  this.setMessage = function ( )
  {
    if ( msgXmlHttp.readyState == 4 )
    {
      if ( msgXmlHttp.status == 200 )
      {
        var result = msgXmlHttp.responseText;
        if ( result && result.length > 0 )
        {
          var node = new XmlNode ( "", "" );
          node.parse ( result );
          var messageArray = new Array ( 7 );
          messageArray [ 0 ] = node.getName ( );
          messageArray [ 1 ] = node.getAttributeValue ( "type" );
          messageArray [ 2 ] = node.getAttributeValue ( "x" );
          messageArray [ 3 ] = node.getAttributeValue ( "y" );
          messageArray [ 4 ] = node.getAttributeValue ( "width" );
          messageArray [ 5 ] = node.getAttributeValue ( "height" );
          messageArray [ 6 ] = node.getValue ( );
          messageCashe.setMessage ( messageArray );
          messageObject.chooseView ( messageArray );
          waitingMessage = false;
          window.setTimeout ( "doQueue ( );", 300 );
        }
      }
    }
  }


  /**
   *
   */
  this.chooseView = function ( messageArray )
  {
    var type = messageArray [ 1 ];
    if      ( type == "help"   ) this.viewHelp   ( messageArray );
    else if ( type == "error"  ) this.viewError  ( messageArray );
    else if ( type == "legend" ) this.viewLegend ( messageArray );
  }


  /**
   *
   */
  this.viewHelp = function ( messageArray )
  {
    elem = document.getElementById ( "helpText" );
    if ( elem )
    {
      elem.innerHTML = "";
      elem.innerHTML = "<pre>" + messageArray [ 6 ] + "</pre>";
    }

    var winTop = ( screen.height - 400 ) / 2;
    var winLeft = ( screen.width - 600 ) / 2;
    remote = window.open ( "html/help.html" , null, "top=" + winTop + ", left=" + winLeft + ", height=400,width=600, titlebar=no, menubar=no, resizable=no, status=no, toolbar=no" );
    if ( remote )
    {
      remote.opener = window;
      remote.focus ( );
    }
  }


  /**
   *
   */
  this.replaceUnicodeChars = function ( str )
  {
    var pos;
    while ( ( pos = str.indexOf ( "&#" ) ) > -1 )
    {
      var pos1 = str.indexOf ( ";", pos );
      if ( pos1 > -1 )
      {
        str = str.replace ( str.substring ( pos, pos1 + 1 ), String.fromCharCode ( str.substring ( pos + 2, pos1 ) ) );
      }
    }
    return str;
  }


  /**
   *
   */
  this.viewError = function ( messageArray )
  {
    var strBefore = messageArray [ 6 ];
    var strAfter = this.replaceUnicodeChars ( strBefore );

    strBefore = strAfter;
    strAfter  = strBefore.replace ( "=%s", "" );
    while ( strAfter != strBefore )
    {
      strBefore = strAfter;
      strAfter  = strBefore.replace ( "=%s", "" );
    }

    strBefore = strAfter;
    strAfter  = strBefore.replace ( "%s", "" );
    while ( strAfter != strBefore )
    {
      strBefore = strAfter;
      strAfter  = strBefore.replace ( "%s", "" );
    }

    if ( debugMessage )
    {
      debugMessage ( "\r\nError " + messageArray [ 0 ] + ":\r\n" + strAfter + "\r\n" );
    }

    alert ( strAfter );
  }


  /**
   *
   */
  this.getDocument = function ( )
  {
    var doc = document;
    if ( this.target )
    {
      if ( this.target.contentWindow && this.target.contentWindow.document )
      {
        doc = this.target.contentWindow.document;
      }
      else
      if ( this.target.contentDocument )
      {
        doc = this.target.contentDocument;
      }
      else if ( this.target.document )
      {
        doc = this.target.document;
      }
      else
      {
        alert ( "The target [" + this.target.name + "] has no document property" );
      }
    }
    else
    {
      alert ( "The target is not defined" );
    }
    return doc;
  }


  /**
   *
   */
  this.viewLegend = function ( messageArray )
  {
    var elem = this.getDocument ( );

    if ( ! elem.getElementById ( legendDivId ) )
    {
      var style = "position:absolute; ";
      style += "margin-top: 0px; padding: 0px; ";
      style += "visibility: hidden; display:block; ";
      style += "font: 11px Courier New; ";
      var newLegendComponent = elem.createElement ( "div" );
      try
      {
        elem.body.appendChild ( newLegendComponent );
        newLegendComponent.setAttribute ( "id", legendDivId );
        newLegendComponent.setAttribute ( "lang", "es" );
        newLegendComponent.style.backgroundColor = "#FFFFF0";
        newLegendComponent.style.border = "1px solid orange";
      }
      catch ( e )
      {
      
      }
    }
    else
    {
      this.hideLegend ( );
    }

    var text = messageArray [ 6 ];

    var k;
    for ( k = text.length - 1; k > 0; k -- )
    {
      if ( text [ k ] != ' ' && text [ k ] != '\r' && text [ k ] != '\n' ) break;
    }
    text = text.substring ( 0, k + 1 );

    /*
    if ( document.all )
    {
      var chars = "\r\n" || "\\s";
      text = text.replace ( new RegExp ( "[" + chars + "]+$", "g" ), "" );
      var chars = " " || "\\s";
      text = text.replace ( new RegExp ( "[" + chars + "]+$", "g" ), "" );
    }
    else
    {
      var chars = "\r\n" || "\\s";
      text = text.replace ( new RegExp ( "^[" + chars + "]+", "g" ), "" );
      chars = " " || "\\s";
      text = text.replace ( new RegExp ( "^[" + chars + "]+", "g"), "" );
    }
    */

    var lines = text.split ( "\n" );
    var firstNotEmpty = 0;
    var max = 0;

    for ( var k = 0; k < lines.length; k ++ )
    {
      var j;
      var len = lines [ k ].length  - 1;
      if ( len >= 0 && lines [ k ].charAt ( len ) == '\r' )
      {
        lines [ k ] = lines [ k ].substring ( 0, len );
      }
      for ( j = lines [ k ].length - 1; j >= 0 && lines [ k ].charAt ( j ) == ' '; j-- );
      lines [ k ] = lines [ k ].substring ( 0, j + 1 );
      if ( firstNotEmpty == 0 && lines [ k ].length > 0 )
      {
        firstNotEmpty = k;
      }
      if ( lines [ k ].length > max ) max = lines [ k ].length;
    }

    var lastNotEmpty = lines.length - 1;
    while ( lastNotEmpty > 0 && lines [ lastNotEmpty ].length == 0 ) lastNotEmpty --;

	text = "";
	for ( var k = firstNotEmpty; k <= lastNotEmpty; k ++ )
	{
	  if ( k > firstNotEmpty ) text += "\r\n";
	  text += lines [ k ];// + " <br/>";
	}
    text = '<pre style="position:relative; top:0px; left:0px; padding:0px; margin:0px;">' + text + '</pre>';

    max = ( max + 1 ) * 7;
    if ( messageArray [ 4 ] < max ) messageArray [ 4 ] = max;

    //max = lines.length * 12;
    max = ( lastNotEmpty - firstNotEmpty + 2 ) * 12;
    //if ( messageArray [ 5 ] < max )
    messageArray [ 5 ] = max;

    var legendComponent = elem.getElementById ( legendDivId );
    if ( legendComponent )
    {
      legendComponent.style.left   = messageArray [ 2 ] + "px";
      legendComponent.style.top    = messageArray [ 3 ] + "px";
      legendComponent.style.width  = messageArray [ 4 ] + "px";
      legendComponent.style.height = messageArray [ 5 ] + "px";
      legendComponent.style.margin.top = "0px";
      legendComponent.style.padding = "0px";
      legendComponent.style.zIndex = 100;
      legendComponent.innerHTML = text;
      legendComponent.style.visibility = "visible";
      legendComponent.style.display = "block";
    }
  }


  /**
   *
   */
  this.hideLegend = function ( )
  {
    var elem = this.getDocument ( );
    var legendComponent = elem.getElementById ( legendDivId );
    if ( legendComponent )
    {
      legendComponent.style.visibility = "hidden";
      legendComponent.style.display = "none";
    }
  }
}


/**
 *
 */
function MessageCashe ( )
{
  // ---------------------------------------------------------------------
  // ----------   Instance attributes   ----------------------------------

  this.name = new Array ( );
  this.type = new Array ( );
  this.x = new Array ( );
  this.y = new Array ( );
  this.width = new Array ( );
  this.height = new Array ( );
  this.message = new Array ( );


  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   *
   */
  this.getLength = function ( )
  {
    return this.name.length;
  }


  /**
   *
   */
  this.setMessage = function ( messageArray )
  {
    var length = this.getLength ( );
    this.name [ length ] = messageArray [ 0 ];
    this.type [ length ] = messageArray [ 1 ];
    this.x [ length ] = messageArray [ 2 ];
    this.y [ length ] = messageArray [ 3 ];
    this.width [ length ] = messageArray [ 4 ];
    this.height [ length ] = messageArray [ 5 ];
    this.message [ length ] = messageArray [ 6 ];
  }


  /**
   *
   */
  this.checkMessage = function ( id )
  {
    var count = this.getLength ( );
    for ( var i = 0; i < count; i ++ )
    {
      if ( this.name [ i ] == id  ) return i;
    }
    return -1;
  }


  /**
   *
   */
  this.getMessage = function ( index )
  {
    var result = new Array ( 7 );
    result [ 0 ] = this.name [ index ];
    result [ 1 ] = this.type [ index ];
    result [ 2 ] = this.x [ index ];
    result [ 3 ] = this.y [ index ];
    result [ 4 ] = this.width [ index ];
    result [ 5 ] = this.height [ index ];
    result [ 6 ] = this.message [ index ];
    return result;
  }
}



// ---------------------------------------------------------------------
// ----------   Client Content Service Methods   -----------------------

var clientContentQueue = "";
var bodyText = "";
var editFileName = "";
var transp;


/**
 *
 */
function showContent  ( type, body )
{
  bodyText = body;

  var winTop = ( screen.height - 450 ) / 2;
  var winLeft = ( screen.width - 600 ) / 2;

  //if ( type == 'printStr' )
  //{
  //  printHtml ( bodyText );
  //}
  if ( type == 'print' )
  {
    remote = window.open ( "html/print.html" , null, "top=" + winTop + ", left=" + winLeft + ", height=450,width=600, titlebar=no; menubar=no, resizable=no, status=no, scrollbars=yes, toolbar=no" );
  }
  else if ( type == 'mail' )
  {
    window.focus ( );
    remote = window.open ( "html/mail.html" , null, "top=" + winTop + ", left=" + winLeft + ", height=400,width=600, titlebar=no; menubar=no, modal=yes, resizable=no, status=no, scrollbars=yes, toolbar=no" );
  }
  else if ( type == 'edit' )
  {
    var width   = 640;
    var height  = 480;
    winTop  = ( screen.height - height ) / 2;
    winLeft = ( screen.width  - width  ) / 2;
    var pos = body.indexOf ( '\r\n' );
    if ( pos == -1 ) return;
    editFileName = body.substring ( 0, pos );
    bodyText = body.substring ( pos + 2 );
    remote = window.open ( "texteditor/clientContentEditor.html" , null, "toolbar=no, directories=no, status=no, menubar=no, resizable=yes, modal=yes, scrollbars=no, height=" + height + "px;, width=" + width + "px;, top=" + winTop + ", left=" + winLeft );
  }

  if ( remote )
  {
    remote.opener = window;
    remote.focus ( );
  }
}

var printWin;


/**
 *
 */
function printForm  ( code )
{

  if (document.body.all) 
  {  
    try
    {
      var pw = printWin.name;
      var method = 'printForm  (' + code + ')';
      window.setTimeout ( method, 2000 );
      return;    
    }
    catch ( e ) { }
  }
  else
  {
    window.open ( "PrintFormAction.mes?printFormAction=" + code );
    return;      
  }
  
  
  printWin = window.open ( "PrintFormAction.mes?printFormAction=" + code, null, "top=50000,height=0,width=0,status=no,toolbar=no,menubar=no,location=no,scrollbars=no", false );
  
  if ( printWin )
  {
    printWin.opener = window;
    //printWin.document.open ( );
    //printWin.document.write ( html );
    //printWin.document.close ( );
    //printWin.focus ( );
    //printWin.print ( );
    //printWin.close ( );
    //printWin.onafterprint( ) { window.close ( ); }
    //printWin.onload ( ) { window.print ( ); }
  }
}


/**
 * 
 */
function printIDByIFrame ( code )
{
  var frame = getIFrame ( "printFrame" );
  if ( frame )
  {
    var location = "PrintFormAction.mes?printFormAction=" + code;
    alert ( location );
    frame.open ( location,'_self' );
    frame.focus ( );
    frame.print ( );
    frame.close ( );
    frame.focus ( );
  }
}


/**
 *
 */
function setContent ( )
{
  if ( transp.readyState == 4 )
  {
    if ( transp.status == 200 )
    {
      var result = transp.responseText;
      if ( result && result.length > 0 )
      {
        var ind = result.indexOf ( '\r\n' );
        if ( ind == -1 ) return;
        var type = result.substring ( 0, ind );
        var body = result.substring ( ind + 1 );
        
        if ( type == 'printStr' )
        {
          printForm ( body );
        }
        else
        {
          showContent ( type, body );
        }
      }
      doClientContentQueue ( );
    }
  }
}


/**
 *
 */
function getContent  ( code )
{
  if ( ! transp )
  {
    if ( window.ActiveXObject )
    {
      transp = new ActiveXObject ( "Microsoft.XMLHTTP" );
    }
    else if ( window.XMLHttpRequest )
    {
      transp = new XMLHttpRequest ( );
    }
  }

  var url = "ClientContentService.mes?getContentAction=" + code;
  transp.open ( "POST", url, true );
  transp.send ( null  );
  transp.onreadystatechange = this.setContent;
}



/**
 *
 */
function doClientContentQueue ( )
{
  
  if ( clientContentQueue.length > 0 )
  {
   
    var code = "";
    var ind = clientContentQueue.indexOf ( ';' );
    if ( ind >= 0 )
    {
      code = clientContentQueue.substring ( 0, ind );
      clientContentQueue = clientContentQueue.substring ( ind + 1 );
    }
    else
    {
      code = clientContentQueue;
      clientContentQueue = "";
    }
   
    if ( code.length > 0 )
    {
      getContent ( code );
    }
  }
}
