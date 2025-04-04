/**
 * Overrides the ancestor's script
 */
function preFocusField ( obj )
{
  if ( obj == null || ! obj || obj.id != "FECHA_RECLA_ORIGINAL.0" ) return false;

  objectInFocus = obj;
  notifyInstance ( obj );
  applicationEventHandler ( "PICKLIST" );

  return true;
}
