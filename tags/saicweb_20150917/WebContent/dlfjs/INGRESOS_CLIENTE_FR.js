/**
 * Overrides the empty function in jdp.js
 * 
 * Occurs just at the start of the focusField ( ) 
 * function in jdp.js ( "onfocus" event handler ).
 *
 * users validate ( ) function from jdp.js
 */
function preFocusField ( obj )
{
  if ( obj == null || ! obj ) return false;

  var field = model.getInDepth ( obj.name );
  if ( field && field.name == "PARKING" )
  {
    if ( ! validate ( ) ) return true; 
  }

  return false;
}
