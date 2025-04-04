
/**
 * 
 */
function getGroupName ( obj )
{
  if ( obj )
  {
    var field = model.getInDepth ( obj.name );
    if ( field )
    {
      var group = field.container;
      if ( group )
      { 
        return group.name;
      }
    }
  }
  return "";
}


/**
 * Overrides the empty function in jdp.js
 *
 * Occurs just at the start of the focusField ( )
 * function in jdp.js ( "onfocus" event handler ).
 *
 * objectInFocus is still a field, being in focus previously
 */
function preFocusField ( obj )
{
  if ( obj )
  {
    var group      = getGroupName ( obj );
    if ( ( group == "NOMBRE_CLIENTE" ) && ( obj.id.indexOf ( 'PARK' ) < 0 ) )
    {
      return true;
    }
  }

  return false;
}