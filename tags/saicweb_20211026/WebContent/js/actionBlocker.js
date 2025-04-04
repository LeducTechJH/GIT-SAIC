
//'esc':27, 'escape':27, 'tab':9, 'space':32, 'return':13, 'enter':13, 'backspace':8,	
//'scrolllock':145, 'scroll_lock':145, 'scroll':145, 'capslock':20, 'caps_lock':20,
//'caps':20, 'numlock':144, 'num_lock':144, 'num':144, 'pause':19, 'break':19, 'insert':45,
//'home':36, 'delete':46, 'end':35,	'pageup':33, 'page_up':33, 'pu':33,	'pagedown':34,
//'page_down':34, 'pd':34, 'left':37, 'up':38, 'right':39, 'down':40,	
//'f1':112, 'f2':113, 'f3':114, 'f4':115, 'f5':116, 'f6':117, 'f7':118,
//'f8':119, 'f9':120, 'f10':121, 'f11':122, 'f12':123
  
//document.write ( '<script language="JavaScript" src="js/header.js"></script>\r\n' );

// ---------------- Control parameters ----------

var blockRightMouseButtonAction = true;
var blockKeyAction = true;
var FButtons = new Array ( 'f1', 'f3', 'f4', 'f5', 'f6', 'f11' );
var keyCodes = new Array ( 112, 114, 115, 116, 117, 122 );



// ---------------- Messages --------------------

var clickmessage = "Right click is disabled";



// ---------------- Methods ---------------------

/**
 * 
 */
function disableclick ( e ) 
{
  if ( document.all ) //IE
  {
    if ( event.button == 2 || event.button == 3 ) 
    {
      alert ( clickmessage );
      return false;
    }
  }
  else if ( document.getElementById ) //FF
  {
   if ( e.which == 3 )
     setTimeout ( "alert ( clickmessage )", 0 )
     return false;
  }
}


/**
 * 
 */
function disableButton ( e ) 
{
  if ( document.all ) //IE
  { 
    for( var i = 0; i < keyCodes.length; i++ ) 
    {
      if ( keyCodes [ i ] == event.keyCode )
      {
        if ( event.keyCode == 112 ) //F1 
        {
          document.onhelp = new Function("return false;");
        }
        else
        {
          event.keyCode = 0;
          event.cancelBubble = true;
        }
        return false;
      }
    }
    return true;
  }
  else if ( document.getElementById ) //FF
  {
    for ( i in FButtons )
    {
      if ( e.keyCode == eval ( "e.DOM_VK_" + String.toUpperCase ( FButtons [ i ] ) ) ) //F1
      { 
        e.preventDefault ( );
        e.stopPropagation ( );
        return false;
      }
    }
    return true;
  }  
}

   
if ( blockRightMouseButtonAction == true )
{
  if ( document.all )
  {
    document.onmousedown = disableclick; 
  }
  else if ( document.getElementById )
  {
    document.onmouseup = disableclick;
  }
}
if ( blockKeyAction == true )
{
  if ( document.all )
  {
    document.onkeydown = disableButton;
  }
  else if ( document.getElementById )
  {
    window.captureEvents ( Event.KEYPRESS );
    window.addEventListener ( "keypress", disableButton, true );
  }    
}

