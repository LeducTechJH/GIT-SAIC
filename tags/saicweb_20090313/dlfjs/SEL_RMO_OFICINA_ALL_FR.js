/**
 * Overrides the empty function in jdp.js
 * 
 * Occurs just at the start of the focusField ( ) 
 * function in jdp.js ( "onfocus" event handler ).
 */
function preFocusField ( obj )
{
  if ( obj == null || ! obj ) return false;

  var field = model.getInDepth ( obj.name );
  if ( field && field.name == "PARK" )
  {
    if ( ! validate ( ) ) return true;
  }

  return false;
}
