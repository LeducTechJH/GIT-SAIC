/**
 * Overrides the empty function in jdp.js
 */
function afterInit ( )
{
	setArrowField ( "PARK_CORRECTA",   ">" );
	setArrowField ( "PARK_INCORRECTA", ">" );
}

function nextObject ( obj )
{
	var objName = "";

	var current = obj.name;

	var value = getElementValue ( "SERVICIOS_COD_SERVICIO.0" ); 

	if ( value == "TANFS" || value == "TANFE" )
	{
		if ( current == "PARK_CORRECTA.0" )
		{
			objName = "BENEFICIO_CALCULADO.0";
		}
	}
}