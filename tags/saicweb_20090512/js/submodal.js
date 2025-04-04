document.write ( '<link rel="stylesheet" href="css/subModal.css" type="text/css" />\r\n' );
document.write ( '<link rel="stylesheet" href="css/ConfirmMenu.css" type="text/css" />\r\n' );
document.write ( '<script language="JavaScript" src="js/messages.js"></script>\r\n' );


var submodalMenuMaskDiv      = null;
var submodalMenuContainerDiv = null;
var submodalMenuShown        = false;



/**
 *
 */
function openMenuSubmodal ( html, title, left, top, w, menuH, scrollH, urlOrHtml )
{
  closeConfirmationSubmodal ( );

  var theBody = document.getElementsByTagName ( 'BODY' ) [ 0 ];

  theBody.focus ( );

  if ( submodalMenuMaskDiv == null )
  {
    submodalMenuMaskDiv = document.createElement ( "div" );
    submodalMenuMaskDiv.id = "popupMaskConfirm";
    submodalMenuMaskDiv.style.filter  = "alpha(opacity=20)";
    submodalMenuMaskDiv.style.float   = "left";
    submodalMenuMaskDiv.style.opacity = "0.40";
    submodalMenuMaskDiv.style.width   = "100%";
    submodalMenuMaskDiv.style.height  = "100%";
    theBody.appendChild ( submodalMenuMaskDiv );
  }

  if ( submodalMenuContainerDiv == null || ! ( submodalMenuContainerDiv ) )
  {
    var titlePopUp = "";
    if ( title.length > 120 )
    {
      titlePopUp = title;
      title = title.substring(0,120);
    }

    title = trimTitle ( title );

    submodalMenuContainerDiv = document.createElement ( 'div' );
    submodalMenuContainerDiv.id = 'popupContainerMenu';
    submodalMenuContainerDiv.innerHTML =
      '<div id="popupTitleBarConfirm">' +
      //'<table cellpadding="1" cellspacing="0" width="100%"><tr><td title="Click To Move" valign="top" align="right" onMouseMove = "mouser(event);" onmouseup="mouse_change ( event, \'popupContainerMenu\', \'off\');" onmousedown="mouse_change ( event, \'popupContainerMenu\', \'on\');" /><img src="images/closeSubmodal.gif" onclick="closeConfirmationSubmodal ( );" id="popCloseBox" />&nbsp;</td><td width="8px"></td></tr></table>' +
      '<table cellpadding="1" cellspacing="0" width="100%"><tr><td title="Click To Move" valign="top" align="right" onMouseMove = "mouser(event);" onmouseup="mouse_change ( event, \'popupContainerMenu\', \'off\');" onmousedown="mouse_change ( event, \'popupContainerMenu\', \'on\');" />&nbsp;</td><td width="8px"></td></tr></table>' +
      '</div>' +
      '<div id="popupMenuMessage" title=\"' + titlePopUp + '\" >' + title + '</div>' +
      '<span id="popupScrollableMenu"></span>';

    theBody.appendChild ( submodalMenuContainerDiv );
  }

  if ( w == null || w == 0 ) w = 300;
  if ( menuH == null || menuH == 0 ) h = 200;

  var screenWidth  = document.width;
  var screenHeight = document.height;

  if ( left >= 0 && top >= 0 )
  {
    // Adjust dialog
  }
  else
  {
    // Center dialog
    left = Math.abs ( screenWidth  - w ) / 2;
    top  = Math.abs ( screenHeight - menuH ) / 2;
  }

  var frameDiv = document.getElementById ( "popupScrollableMenu" );
  if ( frameDiv && html != null && html.length > 0 )
  if ( frameDiv && submodalMenuContainerDiv )
  {
    submodalMenuMaskDiv.style.display = "block";

    if ( urlOrHtml == "url" )
    {
      html = '<iframe src="' + html + '" style="width:100%;height:100%;background-color:transparent;" scrolling="auto" frameborder="0" allowtransparency="true" id="popupFrame" name="popupFrame" width="100%" height="100%"></iframe>';
    }
    frameDiv.innerHTML     = html;
    frameDiv.style.width   = "" + w + "px";
    frameDiv.style.height  = "" + scrollH + "px";
    frameDiv.style.display = "block";

    submodalMenuContainerDiv.style.left    = "" + left + "px";
    submodalMenuContainerDiv.style.top     = "" + top  + "px";
    submodalMenuContainerDiv.style.width   = "" + w + "px";
    submodalMenuContainerDiv.style.height  = "" + menuH + "px";
    submodalMenuContainerDiv.style.display = "block";
    submodalMenuContainerDiv.style.zIndex  = 20000;
    submodalMenuShown = true;
  }
  else
  {
    alert ( html );
  }
}


/**
 *
 */
function fixTitleText ( title )
{
  if ( title == "s" || title == "S" )
  {
    return "SI";
  }

  if ( title == "n" || title == "N" )
  {
    return "NO";
  }
  return title;
}


/**
 *
 */
function openConfirmModal ( title, left, top, option1Text, option2Text,option1Action, option2Action )
{
  closeConfirmationSubmodal ( );

  option1Text = fixTitleText ( option1Text );
  option2Text = fixTitleText ( option2Text );

  var theBody = document.getElementsByTagName ( 'BODY' ) [ 0 ];

  theBody.focus ( );

  if ( submodalMenuMaskDiv == null )
  {
    submodalMenuMaskDiv = document.createElement ( "div" );
    submodalMenuMaskDiv.id = "popupMaskConfirm";
    theBody.appendChild ( submodalMenuMaskDiv );
  }

  if ( left == 0 || top == 0 )
  {
    left = 100;
    top  = 100;
  }

  title = trimTitle ( title );

  submodalMenuContainerDiv = document.createElement ( 'div' );
  submodalMenuContainerDiv.id = 'popupContainerMenu';
  submodalMenuContainerDiv.innerHTML =
  '<table id="popupTitleBarConfirm" cellpadding="1" cellspacing="0" width="100%"><tr><td title="Click To Move" valign="top" align="right" onMouseMove = "mouser(event);" onmouseup="mouse_change ( event, \'popupContainerMenu\', \'off\');" onmousedown="mouse_change ( event, \'popupContainerMenu\', \'on\');" />&nbsp;</td><td width="8px"></td></tr></table>' +
  //'<table id="popupTitleBarConfirm" cellpadding="1" cellspacing="0" width="100%"><tr><td title="Click To Move" valign="top" align="right" onMouseMove = "mouser(event);" onmouseup="mouse_change ( event, \'popupContainerMenu\', \'off\');" onmousedown="mouse_change ( event, \'popupContainerMenu\', \'on\');" /><img src="images/closeSubmodal.gif" onclick="closeConfirmationSubmodal ( );" id="popCloseBox" />&nbsp;</td><td width="8px"></td></tr></table>' +
  '<div id="popupMessageConfirm">' + title + '</div>' +
  "<table width='100%' id='popuptxtConfirm'><tr><td><a id=\"confMenuButton1\" style='width:60px;position:relative' onclick='" + option1Action + "' >" + option1Text + "</a></td><td><a id=\"confMenuButton2\" style='width:60px;position:relative' onclick='" + option2Action + "' >" + option2Text + "</a></td></tr></table>";

  theBody.appendChild ( submodalMenuContainerDiv );

  submodalMenuMaskDiv.style.display = "block";
  submodalMenuContainerDiv.style.left    = "" + left + "px";
  submodalMenuContainerDiv.style.top     = "" + top  + "px";
  submodalMenuContainerDiv.style.width   = "" + 180 + "px";
  submodalMenuContainerDiv.style.height  = "" + 110 + "px";
  submodalMenuContainerDiv.style.display = "block";
  submodalMenuShown = true;
}


/**
 *
 */
function closeConfirmationSubmodal ( )
{
  var theBody = document.getElementsByTagName ( "BODY" ) [ 0 ];

  if ( theBody && submodalMenuMaskDiv != null )
  {
    //theBody.removeChild ( submodalMenuMaskDiv );
    //submodalMenuMaskDiv = null;
    submodalMenuMaskDiv.style.display = "none";
  }

  if ( theBody && submodalMenuContainerDiv != null )
  {
    //theBody.removeChild ( submodalMenuContainerDiv );
    //submodalMenuContainerDiv = null;
    submodalMenuContainerDiv.style.display = "none";
  }
  submodalMenuShown = false;
}


var mouseX;
var mouseY;

var element;
var being_dragged = false;


/**
 *
 */
function mouser ( event )
{
  if ( event.button != 1 )
  {
    mouse_change ( event,'popupContainerMenu', 'off');
   	return;
  }

  if( being_dragged == true)
  {
   var xx = 0;
   var yy = 0;
   if( event.clientX || event.clientY )
   {
     xx = event.clientX;
     yy = event.clientY;
   }
   else
   {
     xx = event.pageX;
     yy = event.pageY;
   }

   var x = document.getElementById(element).style.left.replace("px","");
   var y = document.getElementById(element).style.top.replace ("px","");

   if ( Math.abs ( xx - mouseX ) > 40 || Math.abs ( yy - mouseY ) > 40 )
   {
     mouse_change ( event,'popupContainerMenu', 'off');
   	 return;
   }

   x = parseInt( x ) + xx - mouseX;
   y = parseInt( y ) + yy - mouseY

   document.getElementById(element).style.left = x + "px";
   document.getElementById(element).style.top  = y + "px";
   mouseX = xx;
   mouseY = yy;
  }
}


/**
 *
 */
function mouse_change ( event,ele_name, state )
{
  if ( state == "on" )
  {
    being_dragged = true;
    element = ele_name;
    document.getElementById ( element ).style.cursor = 'move';
    if ( event )
    {
      if ( event.clientX || event.clientY )
      {
        mouseX = event.clientX;
        mouseY = event.clientY;
      }
      else
      {
        mouseX = event.pageX;
        mouseY = event.pageY;
      }
    }
  }
  else
  {
    being_dragged = false;

    document.getElementById(ele_name).style.cursor = 'auto';
  }
}


/**
 *
 */
function trimTitle ( title )
{
  var size = title.length;

  if ( size < 30 )
  {
    return title;
  }

  var indexer = title.substring ( size - 24 ).indexOf ( ' ' );
  var location = size - 24 + indexer;

  if ( indexer >= 0 )
  {
    var before = title.substring ( 0 , location );
    var after  = title.substring ( location );
    while ( after.charAt(0) == ' ' )
	{
	  after = after.substring ( 1 );
	}
	title = before + "<br>" + after;
  }
  return title;
}


/**
 *
 */
function trimTitleOld ( title )
{
  var size = title.length - 10;
  var i;
  try
  {
    for ( i = 24 ; i < size ; i = i + 24 )
    {
      var indexer = title.substring ( i - 6, i + 10 ).indexOf ( ' ' );
      if ( indexer > 0 )
      {
        var location = indexer + i - 6 ;
        var before = title.substring ( 0 , location );
        var after  = title.substring ( location );

        while ( after.charAt(0) == ' ' )
        {
          after = after.substring ( 1 );
        }

        title = before + "<br>" + after;
      }
    }
  }
  catch ( e )
  {
  }
  return title;
}


/**
 *
 */
function getLastElement ( id )
{
  var element = null;
  var list = document.getElementsByTagName ( "a" );
  if ( list != null && list.length > 0 )
  {
    for ( var k = list.length - 1; k >= 0; k -- )
    {
      if ( list [ k ].id && list [ k ].id == id )
      {
        element = list [ k ];
        break;
      }
    }
  }
  return element;
}


/**
 *
 */
function implementAppCommandToSubmenu ( code )
{
  var button;
  var func  = null;
  var found = false;

  if ( code == "FINISH_ACTION" || code == "QUIT_ACTION" )
  {
    doAppRequestCommand ( code );
    return;
  }

  button = getLastElement ( "confMenuButton1" );
  if ( button && ( code == "S" || code == "NEXTOBJECT" ) && ( button.innerHTML == "SI" || button.innerHTML == "YES" ) )
  {
    func = button.onclick;
  }

  if ( ! found )
  {
    button = getLastElement ( "confMenuButton2" );
    if ( button && ( code == "N" || code == "ESCAPE" ) && button.innerHTML == "NO" )
    {
      func = button.onclick;
    }
  }

  if ( func != null )
  {
    func = "" + func;
    var ind1 = func.indexOf ( "{" );
    if ( ind1 > 0 )
    {
      func = func.substring ( ind1 + 1 );
      func = func.substring ( 0, func.length - 1 );
      //alert ( func );
      eval ( func );
    }
  }
}
