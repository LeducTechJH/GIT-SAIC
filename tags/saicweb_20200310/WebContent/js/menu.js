// ---------------------------------------------------------------------
// ----------   Including Other JavaScripts Section   ------------------

//alert ( "Menu.js" )

document.write ( '<script language="JavaScript" src="js/keyEventHandler.js"></script>\r\n' );
document.write ( '<script language="JavaScript" src="js/server.js"></script>\r\n' );
document.write ( '<script language="JavaScript" src="js/xml.js"></script>\r\n' );
document.write ( '<script language="JavaScript" src="js/messages.js"></script>\r\n' );



// ---------------------------------------------------------------------
// ----------   Application-specific Event Handlers   ------------------

/**
 *
 */
function applicationKeyUpEventHandler ( eventCode )
{
	console.log("3- running event code " + eventCode);
  if ( eventCode == null || eventCode == "" ) return;

  if ( submodalMenuShown )
  {
    if ( implementAppCommandToSubmenu ) implementAppCommandToSubmenu ( eventCode );
    return;
  }

  if ( eventCode == "ESCAPE" )
  {
    doAppRequestCommand ( "QUIT_ACTION" );
  }
  else if ( eventCode == "QUIT_ACTION" )
  {
    doAppRequestCommand ( eventCode );
  }
  else if ( eventCode == "FINISH_ACTION" )
  {
    doAppRequestCommand ( eventCode );
  }
  else if ( eventCode == "FINISH_APPLICATION" )
  {
    doAppCommandByCode ( eventCode );
  }
  else if ( eventCode == "LEFTARROW" )
  {
    left ( );
  }
  else if ( eventCode == "RIGHTARROW" )
  {
    right ( );
  }
  else if ( eventCode == "PREVINSTANCE" ) // Arrow Up
  {
    up ( );
  }
  else if ( eventCode == "NEXTINSTANCE" ) // Arrow Down
  {
    down ( );
  }
  else if ( eventCode == "NEXTOBJECT" )   // Enter
  {
    fire ( );
  }
  else if ( eventCode == "SHOW" )   // Enter
  {
    doAppCommand ( 'SHOW' );
  }
  else
  {
    alert ( "Illegal event: applicationKeyUpEventHandler ( " + eventCode + " )" );
  }
}


/**
 * Uses functions defined in server.js
 */
function applicationResponseHandler ( root )
{
  var command = root.getAttributeValue ( "command" );

  if ( command == "ConfirmationMenu" )
  {
    showConfirmationMenu ( root,"yes" );
  }
  else
  {
    //alert ( root.getXmlDoc ( ) );
  }
}


/**
 * Dummy implementation
 */
function setField ( dummy )
{
}


/**
 * Dummy implementation
 */
function setRowState ( dummy )
{
}



// ---------------------------------------------------------------------
// ----------   Menu-specific Script   ---------------------------------

var buttonsSize   = 0;
var currentButton = -1;
var buttonBackground;
var buttonForeground;


/**
 *
 */
function getElement ( id )
{
  var element = null;
  if ( document.getElementById )
  {
    element = document.getElementById ( id );
  }
  if ( element == null && document.all )
  {
    element = document.all [ id ];
  }
  if ( element == null && document.getElementsByName )
  {
    var x = document.getElementsByName ( id );
    if ( x && x.length > 0 ) element = x [ 0 ];
  }
  return element;
}


/**
 *
 */
function getMenuButton ( index )
{
  var id = "choice" + index;
  return getElement ( id );
}


/**
 *
 */
function changeButtonStyle ( e )
{ 
  var targ;
  if (!e)
  {
    var e=window.event;
  }
  if (e.target)
  {
    targ=e.target;
  }
  else if (e.srcElement)
  {
    targ=e.srcElement;
  } 
  var id = targ.id;
 
  if ( id.indexOf ( "choice" ) == 0 )
  {
    var index = id.substring ( 6 );
    for ( var i = 0; i < buttonsSize; i ++ )
    {
      var button = getMenuButton ( i );
      if ( button ) 
      {
        if ( i == index )
        {
          button.style.border ='2px solid red';
        }
        else
        {
          button.style.border = '2px solid orange';
        }
      }
    }
  } 
}


/**
 *
 */
function init ( index, size )
{
  if ( parent.queryMode ) parent.queryMode = false;
  if ( parent.showMode  ) parent.showMode ( "" );

  buttonsSize = size;

  for ( var i = 0; i < size; i ++ )
  {
    var button = getMenuButton ( i );
    if ( button )
    {
      if ( button.addEventListener )
      {
        button.addEventListener ( 'mouseover', changeButtonStyle, false );
      } 
      else if ( button.attachEvent )
      {
        button.attachEvent ( 'onmouseover', changeButtonStyle );
      }
      else 
      {
        break;
      }
    }
  }
  
  // Initial button
  setCurrentButton ( index );
}


/**
 *
 */
function notify ( index )
{
  doAppRequest ( "command=menuNotify&button=" + index );
}


/**
 *
 */
function setCurrentButton ( index )
{
  if ( index < 0 || index >= buttonsSize )
  {
    alert ( "Button index " + index + " is out of range" );
    return;
  }

  var button;
  if ( currentButton >= 0 )
  {
    button = getMenuButton ( currentButton );
    if ( button )
    {
      //button.style.background = "#456789";
      button.style.color = "#FFFFFF";
    }
  }

  button = getMenuButton ( index );
  if ( button )
  {
    //button.style.background = "#FFFFFF";
    //button.style.color = "#456789";
    button.style.color = "#006789";
  }
  currentButton = index;
}


/**
 *
 */
function up ( )
{
  if ( currentButton > 0 )
  {
    setCurrentButton ( currentButton - 1 );
    notify ( currentButton );
  }
}


/**
 *
 */
function down ( )
{
  if ( currentButton < buttonsSize - 1 )
  {
    setCurrentButton ( currentButton + 1 );
    notify ( currentButton );
  }
}


/**
 *
 */
function left ( )
{
  var button = getMenuButton ( currentButton );
  if ( button && button.parentNode )
  {
    var tr = button.parentNode;
    var cells = tr.getElementsByTagName ( "td" );
    var index = -1;
    for ( var k = 0; k < cells.length; k ++ )
    {
      if ( cells [ k ] == button )
      {
        index = k;
        break;
      }
    }
    
    if ( index > 0 && index < cells.length )
    {
      button = cells [ index - 1 ];
      var id = button.id;
      if ( id && id.indexOf ( "choice" ) == 0 )
      {
        index = parseInt ( id.substring ( 6 ) );
        setCurrentButton ( index );
        notify ( currentButton );
      }
    }
  }
}


/**
 *
 */
function right ( )
{
  var button = getMenuButton ( currentButton );
  if ( button && button.parentNode )
  {
    var tr = button.parentNode;
    var cells = tr.getElementsByTagName ( "td" );
    var index = -1;
    for ( var k = 0; k < cells.length; k ++ )
    {
      if ( cells [ k ] == button )
      {
        index = k;
        break;
      }
    }
    
    if ( index >= 0 && index < ( cells.length - 1 ) )
    {
      button = cells [ index + 1 ];
      var id = button.id;
      if ( id && id.indexOf ( "choice" ) == 0 )
      {
        index = parseInt ( id.substring ( 6 ) );
        setCurrentButton ( index );
        notify ( currentButton );
      }
    }
  }
}


/**
 *
 */
function fire ( )
{
  var button = getMenuButton ( currentButton );
  if ( button )
  {
    var script = "" + button.onclick;
    var ind;
    ind = script.indexOf ( '{' );
    if ( ind >= 0 ) script = script.substring ( ind + 1 );
    ind = script.indexOf ( '}' );
    if ( ind >= 0 ) script = script.substring ( 0, ind );
    ind = script.indexOf ( 'doAppRequest ( ' );
    //alert ( script );
    eval ( script );
  }
}


/**
 * Required by help functionality
 */
function getCurrentHelpId ( )
{
  var x = document.getElementById ( "menuHelpCode" );
  if ( x )
  {
    return x.value;
  }
  return 0;
}
