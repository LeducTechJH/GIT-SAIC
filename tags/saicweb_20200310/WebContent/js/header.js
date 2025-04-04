// ---------------------------------------------------------------------
// ----------   Event Handlers' Variables and Script   -----------------

var mouseX       = 0;
var mouseY       = 0;
var mousePageX   = 0;
var mousePageY   = 0;
var scrollShiftX = 0;
var scrollShiftY = 0;


/**
 * Not a function!
 */
if ( document.getElementById && ! document.all )
{
  document.onmousemove   = mouseMoveHandler;
  //document.captureEvents ( Event.MOUSEMOVE );
}


/**
 *
 */
function mouseMoveHandler ( e )
{
  if ( e != null )
  {
    mouseX = e.screenX;
    mouseY = e.screenY;
    mousePageX = e.pageX;
    mousePageY = e.pageY;
  }
}



// ---------------------------------------------------------------------
// ----------   Utility Methods Section   ------------------------------

/**
 *
 */
function initScrollShift ( )
{
  if ( document.body && document.body.scrollLeft )
  {
    scrollShiftX = document.body.scrollLeft;
    scrollShiftY = document.body.scrollTop;
  }
}


/**
 * Constructor and definition of the class "Point"
 */
function Point ( pointX, pointY )
{
  this.x = pointX;
  this.y = pointY;
}


/**
 *
 */
function getClientWidth ( )
{
  if ( window.screen && window.screen.availWidth ) return window.screen.availWidth;
  if ( document.body.clientWidth ) return document.body.clientWidth;
  return 0;
}


/**
 *
 */
function getClientHeight ( )
{
  if ( window.screen && window.screen.availHeight ) return window.screen.availHeight;
  if ( document.body.clientHeight ) return document.body.clientHeight;
  return 0;
}


/**
 *
 */
function getScrollX ( )
{
  if ( document.body.scrollLeft ) return document.body.scrollLeft;
  if ( document.body.offsetLeft ) return document.body.offsetLeft;
  if ( document.documentElement ) return document.documentElement.scrollLeft;
  if ( window.pageXOffset       ) return window.pageXOffset;
  return 0;
}


/**
 *
 */
function getScrollY ( )
{
  if ( document.body.scrollTop  ) return document.body.scrollTop;
  if ( document.body.offsetTop  ) return document.body.offsetTop;
  if ( document.documentElement ) return document.documentElement.scrollTop;
  if ( window.pageYOffset       ) return window.pageYOffset;
  return 0;
}


/**
 *
 */
function getClickedPoint ( )
{
  var x = 0;
  var y = 0;
  if ( window.event )
  {
    //x = window.event.clientX + this.getScrollX ( );
    //y = window.event.clientY + this.getScrollY ( );
    x = window.event.clientX + document.documentElement.scrollLeft + document.body.scrollLeft - document.body.clientLeft - scrollShiftX;
    y = window.event.clientY + document.documentElement.scrollTop  + document.body.scrollTop  - document.body.clientTop  - scrollShiftY;
  }
  else
  {
    x = mousePageX; //- this.getScrollX ( );
    y = mousePageY; //- this.getScrollY ( );
  }
  return new Point ( x + 3, y + 3 );
}


/**
 * Can be used as showPopupDiv ( divId )
 * Also can be used as showPopupDiv ( divId, offsetLeft, offsetTop )
 */
function showPopupDiv ( )
{
  var argv  = showPopupDiv.arguments;
  var divId = argv [ 0 ];
  var point = this.getClickedPoint ( );
  if ( argv.length == 3 )
  {
    point.x = argv [ 1 ] + 5;
    point.y = argv [ 2 ] + 5;
  }

  var dir;
  var pos;
  var popupDiv = document.getElementById ( divId );
  var divWidth = 0;

  if ( popupDiv )
  {
    if ( popupDiv.style.visibility == "visible" )
    {
      popupDiv.style.visibility = "hidden";
    }
    else
    {
      popupDiv.style.position = "absolute";
      dir   = document.body.dir.toLowerCase ( );
      divWidth = popupDiv.style.width;
      if ( dir != 'rtl' )
      {
        var pos = divWidth.indexOf ( 'px' );
        if ( pos > 0 ) divWidth = divWidth.substring ( 0, pos );
        if ( divWidth > point.x ) divWidth = point.x;
        point.x = point.x - divWidth;
      }
      var cWidth;
      if ( document.body.clientWidth )
      {
        cWidth = document.body.clientWidth;
        //alert ( "cWidth = " + cWidth + "; divWidth = " + divWidth + "; x = " + point.x );
        var bWidth = cWidth - divWidth;
        if ( point.x > bWidth ) point.x = bWidth;
      }
      if ( point.x < 0 ) point.x = 0;
      popupDiv.style.left = point.x;
      popupDiv.style.top  = point.y + 3;
      popupDiv.style.visibility = "visible";
    }
  }
  else
  {
    alert ( "Popup " + divId + " is unavailable" );
  }
}


/**
 *
 */
function getIFrame ( frame )
{
  var iFrameObj = null;
  if ( document.frames )
  {
    iFrameObj = document.frames [ frame ];
  }
  else if ( window.frames )
  {
    iFrameObj = window.frames [ frame ];
  }
  else if ( document.all )
  {
    iFrameObj = document.all ( frame );
  }
  else
  {
    iFrameObj = document.getElementById ( frame );
  }
  if ( iFrameObj == null )
  {
    alert ( "No frame object for '" + frame + "' frame" );
  }
  return iFrameObj;
}


/**
 *
 */
function getIFrameDocument ( frame )
{
  var iFrameDoc = null;
  var iFrameObj = getIFrame ( frame );
  if ( iFrameObj )
  {
    if ( iFrameObj.contentDocument )    // For NS6
    {
      iFrameDoc = iFrameObj.contentDocument; 
    }
    else if ( iFrameObj.contentWindow )    // For IE5.5 and IE6
    {
      iFrameDoc = iFrameObj.contentWindow.document;
    }
    else if ( iFrameObj.document )    // For IE5
    {
      iFrameDoc = iFrameObj.document;
    }
    if ( iFrameDoc == null )
    {
      alert ( "No document object for '" + frame + "' frame" );
    }
    return iFrameDoc;
  }
}


/**
 *
 */
function setIFrameContent ( frame, html )
{
  var iFrameDoc = getIFrameDocument ( frame );
  if ( iFrameDoc != null )
  {
    iFrameDoc.open ( );
    iFrameDoc.write ( html );
    iFrameDoc.close ( );
  }
}


/**
 *
 */
function getElementValue ( id )
{
  var element = null;
  if ( document.getElementById )
  {
    element = document.getElementById ( id );
  }
  else if ( document.all )
  {
    element = document.all ( id );
  }
  if ( ! element )
  {
    alert ( "getElementValue ( '" + id + "' ): No such element" ); 
    return null;
  }
  return element.value;
}


/**
 *
 */
function getElementExist ( id )
{
  var element = null;
  if ( document.getElementById )
  {
    element = document.getElementById ( id );
  }
  else if ( document.all )
  {
    element = document.all ( id );
  }
  if ( ! element )
  {
    return false;
  }
  return true;
}

 
/**
 *
 */
function setElementValue ( id, value )
{
  var element = null;
  if ( document.getElementById )
  {
    element = document.getElementById ( id );
  }
  else if ( document.all )
  {
    element = document.all ( id );
  }
  if ( element ) element.value = value;
}


/**
 *
 */
function validateEmail ( email )
{
  if ( email == null || email.length == 0 ) return false;
  var reg1 = /(@.*@)|(\.\.)|(@\.)|(\.@)|(^\.)/; // not valid
  var reg2 = /^.+\@(\[?)[a-zA-Z0-9\-\.]+\.([a-zA-Z]{2,3}|[0-9]{1,3})(\]?)$/; // valid
  return ( ! reg1.test ( email ) && reg2.test ( email ) );
}



