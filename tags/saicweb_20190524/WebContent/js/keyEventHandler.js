// ---------------------------------------------------------------------
// ----------   Key Event Handler   ------------------------------------
//
// applicationKeyUpEventHandler ( keyEventCode ) should be defined in
// the application which uses this script
//

var VK_BACKSPACE  =   8;
var VK_D          =  68;
var VK_DELETE     =  46;
var VK_DOWN       =  40;
var VK_END        =  35;
var VK_ENTER      =  13;
var VK_ESC        =  27;
var VK_F          =  70;
var VK_HOME       =  36; // "GOLD"
var VK_INSERT     =  45;
var VK_K          =  75;
var VK_LEFT       =  37;
var VK_N          =  78;
var VK_PAGE_DOWN  =  34;
var VK_PAGE_UP    =  33;
var VK_Q          =  81;
var VK_RIGHT      =  39;
var VK_S          =  83;
var VK_TAB        =   9;
var VK_UNDERSCORE = 523;
var VK_UP         =  38;
var VK_W          =  87;

var VK_F1         = 112;
var VK_F2         = 113;
var VK_F3         = 114;
var VK_F4         = 115;
var VK_F5         = 116;
var VK_F6         = 117;
var VK_F7         = 118;
var VK_F8         = 119;
var VK_F9         = 120;
var VK_F10        = 121;
var VK_F11        = 122;
var VK_F12        = 123;


var keyUpCode      = 0;
var keyControl     = false;
var keyShift       = false;
var keyEventCode   = "";
var keyEventStatus = 0;


/**
 * Not a function!
 */
if ( document.getElementById && ! document.all )
{
  window.onkeypress   = enterKeyEventHandler;
  window.onkeyup      = keyEventHandler;
}
else
{
  document.onkeypress = enterKeyEventHandler;
  document.onkeyup    = keyEventHandler;
}


/**
 *
 */
function cancelKey ( e )
{
  if ( window.event )
  {
    //window.event.cancelBubble = true;
    window.event.returnValue = false;
  }
  else if ( e.cancelable )
  {
    e.preventDefault ( );
  }
  else
  {
    alert ( "Event can not be cancelled: " + e );
  }
}


/**
 * Window / document "key press" event handler
 */
function enterKeyEventHandler ( e )
{
  var keyCode;
  if ( window.event )
  {
    keyCode = window.event.keyCode;
  }
  else
  {
    keyCode = e.which;
  }

  if ( keyCode == VK_ENTER )
  {
    if ( applicationKeyUpEventHandler ) applicationKeyUpEventHandler ( "NEXTOBJECT" );
  }
}


/**
 * Window / document "key up" event handler
 */
function keyEventHandler ( e )
{
  if ( window.event )
  {
    e = window.event;
    keyUpCode  = e.keyCode;
    keyShift   = e.shiftKey;
    keyControl = e.ctrlKey;
  }
  else
  {
    keyUpCode  = e.which;
    keyShift   = e.shiftKey;
    keyControl = e.ctrlKey;
  }

  //alert ( "keyEventHandler ( " + keyUpCode + " )" );

  keyEventCode = "";
  if ( keyEventStatus == 0 )
  {
    switch ( keyUpCode )
    {
      case VK_HOME:
      {
        //keyEventStatus = 1;
        keyEventCode = "PICKLIST";
        cancelKey ( e );
        break;
      }
      case VK_LEFT:
      {
        keyEventCode = "LEFTARROW";
        break;
      }
      case VK_RIGHT:
      {
        keyEventCode = "RIGHTARROW";
        break;
      }
      case VK_ESC:
      {
        keyEventCode = "ESCAPE";
        break;
      }
      case VK_ENTER:
      {
        //keyEventCode = "NEXTOBJECT";
        break;
      }
      case VK_TAB:
      {
        if ( keyShift )
        {
          keyEventCode = "PREVOBJECT";
        }
        else
        {
          keyEventCode = "NEXTOBJECT";
        }
        cancelKey ( e );
        break;
      }
      case VK_PAGE_UP:
      {
        if ( keyShift )
        {
          keyEventCode = "PREVIOUS_CHAPTER";
        }
        else
        {
          keyEventCode = "PREVIOUS_PAGE";
        }
        break;
      }
      case VK_PAGE_DOWN:
      {
        if ( keyShift )
        {
          keyEventCode = "NEXT_CHAPTER";
        }
        else
        {
          keyEventCode = "NEXT_PAGE";
        }
        break;
      }
      case VK_END:
      {
        keyEventCode = "HOTKEYPRESS";
        break;
      }
      case VK_UP:
      {
        keyEventCode = "PREVINSTANCE";
        break;
      }
      case VK_DOWN:
      {
        keyEventCode = "NEXTINSTANCE";
        break;
      }
      case VK_DELETE:
      case VK_D:
      {
        if ( keyControl )
        {
          cancelKey ( e );
          keyEventCode = "DELINSTANCE";
        }
        break;
      }
      case VK_N:
      {
        //keyEventCode = "N";
        break;
      }
      case VK_S:
      {
        if ( keyControl )
        {
          keyEventCode = "UPDATE";
          cancelKey ( e );
        }
        else
        {
          //keyEventCode = "S";
        }
        break;
      }
      case VK_INSERT:
      {
        if ( keyShift )
        {
          keyEventCode = "INSERTINSTANCENEXTGROUP";
        }
        else
        {
          keyEventCode = "INSERTINSTANCE";
        }
        cancelKey ( e );
        break;
      }
      case VK_F2:
      {
        break;
      }
      case VK_F3:
      {
        cancelKey ( e );
        keyEventCode = "QBE";
        if ( keyShift ) keyEventCode = "QUERY";
        break;
      }
      case VK_F4:
      {
        cancelKey ( e );
        keyEventCode = "QBE";
        if ( keyShift ) keyEventCode = "QUERY";
        break;
      }
      case VK_F8:        // ( 119 )
      {
        keyEventCode = "QUIT_ACTION";
        break;
      }
      case VK_F9:        // ( 120 )
      {
        keyEventCode = "FINISH_ACTION";
        break;
      }
      case VK_F10:       // ( 121 )
      {
        keyEventCode = "QUERY";
        //cancelKey ( e );
        break;
      }
      case VK_F11:       // ( 122 )
      {
        break;
      }
      case VK_F12:       // ( 123 )
      {
        keyEventCode = "PREVOBJECT";
        break;
      }
    }
  }
  else
  {
    switch ( keyUpCode )
    {
      case VK_LEFT:
      {
        keyEventCode = "FIRSTOBJECT";
        break;
      }
      case VK_PAGE_UP:
      {
        keyEventCode = "FIRSTPAGE";
        break;
      }
      case VK_UP:
      {
        keyEventCode = "FIRSTINSTANCE";
        break;
      }
      case VK_RIGHT:
      {
        keyEventCode = "LASTOBJECT";
        break;
      }
      case VK_PAGE_DOWN:
      {
        keyEventCode = "LASTPAGE";
        break;
      }
      case VK_DOWN:
      {
        keyEventCode = "LASTINSTANCE";
        break;
      }
      case VK_F1:
      {
        cancelKey ( e );
        keyEventCode = "EXTENDQUERY";
        break;
      }
      case VK_F:
      {
        keyEventCode = "FINISH_ACTION";
        break;
      }
      case VK_UNDERSCORE:
      case VK_INSERT:
      {
        keyEventCode = "INSERTINSTANCENEXTGROUP";
        break;
      }
      case VK_END:         // List of values
      {
        keyEventCode = "PICKLIST";
        break;
      }
      case VK_K:
      case VK_Q:
      {
        keyEventCode = "PICKLISTPREVGROUP";
        break;
      }
      case VK_DELETE:
      {
        cancelKey ( e );
        keyEventCode = "UNDELETEINSTANCEBEFORE";
        break;
      }
      case VK_S: // GOLD - S
      {
        if ( keyControl )
        {
          keyEventCode = "UPDATE";
        }
        break;
      }
      case VK_W:
      {
        keyEventCode = "WRITETEXTFILE";
        break;
      }
    }
    keyEventStatus = 0;
  }

  if ( keyEventCode.length > 0 && applicationKeyUpEventHandler )
  {
    applicationKeyUpEventHandler ( keyEventCode );
  }
}
