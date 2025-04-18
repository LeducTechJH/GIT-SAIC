/**
 * COMMON DHTML FUNCTIONS
 * These are handy functions I use all the time.
 *
 * By Seth Banks (webmaster at subimage dot com)
 * http://www.subimage.com/
 *
 * Up to date code can be found at http://www.subimage.com/dhtml/
 *
 * This code is free for you to use anywhere, just keep this comment block.
 */


/**
 * X-browser event handler attachment and detachment
 * TH: Switched first true to false per http://www.onlinetools.org/articles/unobtrusivejavascript/chapter4.html
 *
 * @argument obj - the object to attach event to
 * @argument evType - name of the event - DONT ADD "on", pass only "mouseover", etc
 * @argument fn - function to call
 */
function addEvent ( obj, evType, fn )
{
  if ( obj.addEventListener )
  {
    obj.addEventListener ( evType, fn, false );
    return true;
  } 
  else if ( obj.attachEvent )
  {
    var r = obj.attachEvent ( "on" + evType, fn );
    return r;
  } 
  else 
  {
    return false;
  }
}


/**
 * 
 */
function removeEvent ( obj, evType, fn, useCapture )
{
  if ( obj.removeEventListener )
  {
    obj.removeEventListener ( evType, fn, useCapture );
    return true;
  } 
  else if ( obj.detachEvent )
  {
    var r = obj.detachEvent ( "on" + evType, fn );
    return r;
  } 
  else 
  {
    alert ( "Handler could not be removed" );
  }
}


/**
 * Gets the full height because it's different for most browsers.
 */
function getViewportHeight ( )
{
  if ( window.innerHeight != window.undefined ) return window.innerHeight;
  if ( document.compatMode == 'CSS1Compat' ) return document.documentElement.clientHeight;
  if ( document.body ) return document.body.clientHeight;
  return window.undefined;
}


/**
 * Gets the full width because it's different for most browsers.
 */
function getViewportWidth ( )
{
  if ( window.innerWidth != window.undefined ) return window.innerWidth; 
  if ( document.compatMode == 'CSS1Compat' ) return document.documentElement.clientWidth; 
  if ( document.body ) return document.body.clientWidth; 
  return window.undefined;
}


/**
 * Gets the real scroll top
 */
function getScrollTop ( )
{
  if ( self.pageYOffset ) // all except Explorer
  {
    return self.pageYOffset;
  }
  else if ( document.documentElement && document.documentElement.scrollTop )
  {
    // Explorer 6 Strict
    return document.documentElement.scrollTop;
  }
  else if ( document.body ) // all other Explorers
  {
    return document.body.scrollTop;
  }
  return 0;
}


/**
 * Gets the real scroll left
 */
function getScrollLeft ( ) 
{
  if ( self.pageXOffset ) // all except Explorer
  {
    return self.pageXOffset;
  }
  else if ( document.documentElement && document.documentElement.scrollLeft )
  {
    // Explorer 6 Strict
    return document.documentElement.scrollLeft;
  }
  else if ( document.body ) // all other Explorers
  {
    return document.body.scrollLeft;
  }
  return 0;
}