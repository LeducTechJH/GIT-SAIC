/**
 * Overrides the empty function in jdp.js
 */
function afterInit ( )
{
  var element = document.getElementById ( "SEGURO_SOCIAL_JEFE_FAMILIA" );
  if ( element )
  {
    element.onkeydown = numericOnKeyDown;
    element.onkeyup   = numericOnKeyUp;
  }
}
