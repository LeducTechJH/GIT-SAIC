/**
 * Overrides the empty function in jdp.js
 */
function afterInit ( )
{
  var inst = document.getElementById ( "BIOGRAFICA_TECNICO.0" );
  if ( inst )
  {
    if ( inst.value != "New" && inst.value != "NewModified" && inst.value != "Undefined" )
    {
      var elem = document.getElementById ( "ID_TECNICO.0" );
      elem.readOnly = true;
      elem.setAttribute ( "readonly", true );
    }
  }
}
