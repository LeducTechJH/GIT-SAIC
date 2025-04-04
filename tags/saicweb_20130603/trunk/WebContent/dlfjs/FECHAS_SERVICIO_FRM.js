document.write ( '<script language="JavaScript" src="js/header.js"></script>\r\n' );



disableNotFocused = true;


/**
 * Overrides the empty function in jdp.js
 */
function afterInit ( )
{
  var elem = document.getElementById ( "ID_TECNICO.0" );

  if ( elem )
  {
    elem.readOnly = false;
    elem.setAttribute ( "readonly", false );    
  }
  var value = getElementValue ( "COD_SERVICIO.0" ); 

  if ( value == "LISE" || value == "LICR" )
  {
	  var element = document.getElementById("FCH_COMIENZO.0");
		if (element) 
		{
			element.setAttribute("readonly",true);
		}
		var element1 = document.getElementById("NUM_MESES.0");
		if (element1) 
		{
			element1.setAttribute("readonly",true);
		}
  }
}


/**
 * 
 */
function firstObject ( )
{
  if ( ! getElementExist ( 'MANT_ACCION_SERV_COPY.0' ) )
  {
    window.setTimeout ( "firstTry ( );", 300 );
    return;      
  }

  var objName = STATUS_COND ( );

  if ( objName.length > 0 )
  {
    //alert ( objName );
    notifyAppRequestCommand ( "FNEXT" );
    window.setTimeout ( "setField ( '" + objName + "' );", 200 );
  }
}


/**
 * 
 */
function firstTry ( )
{
  if ( ! getElementExist ( 'MANT_ACCION_SERV_COPY.0' ) )
  {
    window.setTimeout ( "setField ( 'PARK.0' );", 300 );
    return;      
  }
  firstObject ( );        
}


/**
 * replaces the definition in jdp.js
 */
function nextObject ( obj )
{
  var objName = "";
  
  var current = obj.name;

  if ( current == "COD_STATUS_SERVICIO.0" )
  {
    objName = "STATUS_OSI.0";
  }
  else if ( current == "FCH_COMIENZO.0" )
  {
    objName = "NUM_MESES.0";
  }
  else if ( current == "FCH_JUNTA_MEDICA.0" )
  {
    objName = TECNICO_ASIG_COND ( );
  }
  else if ( current == "FECHA_EFECTIVIDAD.0" )
  {
    objName = "FCH_JUNTA_MEDICA.0";
  }
  else if ( current == "ID_PROVEEDOR.0" )
  {
    objName = VLR_COND ( );
  }
  else if ( current == "NUM_MESES.0" )
  {
    objName = AEC_COND ( );
  }
  else if ( current == "RAZON_60_MESES.0" )
  {
    objName = "FECHA_EFECTIVIDAD.0";
  }
  else if ( current == "STATUS_OSI.0" )
  {
    objName = "PARK.0";
  }
  else if ( current == "VLR_BENEFICIOS.0" )
  {
    objName = FECHAS_COND ( );
  }
  else if ( current == "ID_TECNICO.0" )
  {
    objName = "PARK.0";
  }
 

  if ( objName.length > 0 )
  {
    notifyAppRequestCommand ( "FNEXT" );
    window.setTimeout ( "setField ( '" + objName + "' );", 200 );
  }
}


/**
 * Uses functions from header.js
 */
function STATUS_COND ( )
{
  var value = getElementValue ( "MANT_ACCION_SERV_COPY.0" ); 

  if ( value == "CS" )
  {
    return "COD_STATUS_SERVICIO.0";
  }
  else if ( value == "CE" )
  {
    return "STATUS_OSI.0";
  }
  else
  {
    return PROVEEDOR_COND ( );
  }
}


/**
 * 
 */
function FECHAS_COND ( )
{
  var value = getElementValue ( "MANT_ACCION_SERV_COPY.0" ); 

  if ( value == "FS" )
  {
    return "FCH_COMIENZO.0";
  }
  else if ( value == "RS" )
  {
    return "FCH_COMIENZO.0";
  }
  else if ( value == "RF" )
  {
    return "FCH_COMIENZO.0";
  }
  else if ( value == "RO" )
  {
    return "FCH_COMIENZO.0";
  }
  else
  {
    return TECNICO_ASIG_COND ( );
  }
}


/**
 * 
 */
function AEC_COND ( )
{
  var value = getElementValue ( "COD_SERVICIO.0" ); 

  if ( value == "AE-C" )
  {
    return RAZON_60 ( );
  }
  else
  {
    return "FECHA_EFECTIVIDAD.0";
  }
}


/**
 * 
 */
function PROVEEDOR_COND ( )
{
  var value = getElementValue ( "MANT_ACCION_SERV_COPY.0" ); 

  if ( value == "AP" )
  {
    return "ID_PROVEEDOR.0";
  }
  else if ( value == "RP" )
  {
    return "ID_PROVEEDOR.0";
  }
  else
  {
    return VLR_COND ( );
  }
}


/**
 * 
 */
function RAZON_60 ( )
{
  var value = getElementValue ( "TOTAL_MESES_TANF.0" ); 

  if ( value == "60" )
  {
    return "FECHA_EFECTIVIDAD.0";
  }
  else
  {
    return "RAZON_60_MESES.0";
  }
}


/**
 * 
 */
function TECNICO_ASIG_COND ( )
{
  var value = getElementValue ( "MANT_ACCION_SERV_COPY.0" ); 

  if ( value == "LI" )
  {
    return "ID_TECNICO.0";
  }
  else
  {
    return "PARK.0";
  }
}


/**
 * 
 */
function VLR_COND ( )
{
  var value = getElementValue ( "MANT_ACCION_SERV_COPY.0" ); 

  if ( value == "CB" )
  {
    return "VLR_BENEFICIOS.0";
  }
  else if ( value == "RO" )
  {
    return "VLR_BENEFICIOS.0";
  }
  else
  {
    return FECHAS_COND ( );
  }
}


/**
 * replaces the definition in jdp.js
 */
function prevObject ( obj )
{
  //notifyAppRequestCommand ( "FPREV" );
  //window.setTimeout ( "setField ( '" + objName + "' );", 200 );
  firstObject ( );
}


/*
The list of all fields:
"MANT_ACCION_SERV_COPY.0"
"PARK.0"
"SEGURO_SOCIAL_JEFE_FAM.0"
"NOMBRE_JEFE_FAM_VAR.0"
"SEGURO_SOCIAL_JEFE_SERV.0"
"NOMBRE_JEFE_SERV_VAR.0"
"COD_SERVICIO.0"
"DSC_SERVICIO_VAR.0"
"DIRECCION_LINEA1_VAR.0"
"DIRECCION_LINEA2_VAR.0"
"DSC_CIUDAD_VAR.0"
"DSC_ESTADO_VAR.0"
"ZIP_CODE_VAR.0"
"ZIP_PLUS_4_VAR.0"
"VLR_BENEFICIOS.0"
"SERV_MEDIDA_VAR.0"
"COD_STATUS_SERVICIO.0"
"FCH_SOLICITUD.0"
"FCH_DECISION.0"
"FCH_COMIENZO.0"
"FECHA_EFECTIVIDAD.0"
"FCH_JUNTA_MEDICA.0"
"ID_TECNICO_CERRADO.0"
"NOMBRE_TECNICO_CERRADO_VAR.0"
"FCH_CERRADO.0"
"NUM_MESES.0"
"FCH_TERMINACION.0"
"ID_PROVEEDOR.0"
"NOMBRE_ID_TECNICO_VAR.0"
"ID_TECNICO.0"
"ID_SUPERVISOR_COPY.0"
"ID_SUPERVISOR.0"
"NOMBRE_SUPERVISOR_VAR.0"
"FCH_STATUS_CAMBIO.0"
"FCH_CONTROLAR.0"
"FCH_AUTORIZACION.0"
"FCH_REVICION.0"
"ID_TECNICO_REVISA.0"
"ID_TECNICO_AUTORIZA.0"
"ID_TECNICO_DETER_ELEGIBILIDAD.0"
"FCH_VISITA.0"
"NOMBRE_TENICO_REVISA_VAR.0"
"COD_CICLO_VIDA.0"
"NOMBRE_TECNICO_AUTORIZA_VAR.0"
"FLG_WORK_PLAN_DONE.0"
"NOMBRE_TECNCICO_DETER_ELEG_VAR.0"
"NUM_WORK_PLAN_NOTIF_COUNT.0"
"SEGURO_SOCIAL_ADMN.0"
"PATERNO_ADMN.0"
"MATERNO_ADMN.0"
"NOMBRE_ADMN.0"
"INICIAL_ADMN.0"
"EMG_PAREO.0"
"EMG_RAZON.0"
"EMG_ESPECIFIQUE_1.0"
"EMG_ESPECIFIQUE_2.0"
"EMG_SERVICIO_PROVEYO.0"
"ACCION_TOMADA_AUTO.0"
"ACCION_TOMADA_DENE.0"
"ACCION_TOMADA_RETI.0"
"TIPO_SERVICIO.0"
"VLR_BENEFICIO_ANTERIOR.0"
"STATUS_OSI.0"
"RAZON_60_MESES.0"
"CONTEO_60_MESES_TANF_VAR.0"
"TOTAL_MESES_TANF.0"
"DSC_RAZON_60_MESES.0"
"ULT_BENEFICIO.0"
*/
