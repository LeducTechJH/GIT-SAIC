/**
 * Overrides the empty function in jdp.js
 */
function applicationPreEventHandler ( eventCode )
{
  if ( eventCode == "FINISH_ACTION" )
  {
    document.getElementById ( "PARK" ).focus ( );
    return true;
  }

  return false;
}
