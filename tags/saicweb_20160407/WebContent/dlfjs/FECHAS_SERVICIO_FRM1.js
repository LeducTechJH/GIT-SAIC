disableNotFocused = true;


/**
 * replaces the definition in jdp.js
 */
function nextObject ( obj )
{
  var current = obj.name;
  var objName = "";

  if ( current == "SEGURO_SOCIAL_JEFE_FAM.0" )
  {
    objName = "NOMBRE_JEFE_FAM_VAR.0";
  }
  else if ( current == "NOMBRE_JEFE_FAM_VAR.0" )
  {
    objName = "SEGURO_SOCIAL_JEFE_SERV.0";
  }
  else if ( current == "SEGURO_SOCIAL_JEFE_SERV.0" )
  {
    objName = "NOMBRE_JEFE_SERV_VAR.0";
  }
  else if ( current == "NOMBRE_JEFE_SERV_VAR.0" )
  {
    objName = "COD_SERVICIO.0";
  }
  else if ( current == "COD_SERVICIO.0" )
  {
    objName = "DSC_SERVICIO_VAR.0";
  }
  else if ( current == "DSC_SERVICIO_VAR.0" )
  {
    objName = "DIRECCION_LINEA1_VAR.0";
  }
  else if ( current == "DIRECCION_LINEA1_VAR.0" )
  {
    objName = "DIRECCION_LINEA2_VAR.0";
  }

  if ( objName.length > 0 )
  {
    notifyAppRequestCommand ( "FNEXT" );
    window.setTimeout ( "setField ( '" + objName + "' );", 200 );
  }
}


/**
 * replaces the definition in jdp.js
 */
function prevObject ( obj )
{
  var current = obj.name;
  var objName = "";

  if      ( current == "DIRECCION_LINEA2_VAR.0" )
  {
    objName = "DIRECCION_LINEA1_VAR.0";
  }
  else if ( current == "DIRECCION_LINEA1_VAR.0" )
  {
    objName = "DSC_SERVICIO_VAR.0";
  }
  else if ( current = "DSC_SERVICIO_VAR.0" )
  {
    objName = "COD_SERVICIO.0";
  }
  else if ( current = "COD_SERVICIO.0" )
  {
    objName = "NOMBRE_JEFE_SERV_VAR.0";
  }
  else if ( current = "NOMBRE_JEFE_SERV_VAR.0" )
  {
    objName = "SEGURO_SOCIAL_JEFE_SERV.0";
  }
  else if ( current = "SEGURO_SOCIAL_JEFE_SERV.0" )
  {
    objName = "NOMBRE_JEFE_FAM_VAR.0";
  }
  else if ( current = "NOMBRE_JEFE_FAM_VAR.0" )
  {
    objName = "SEGURO_SOCIAL_JEFE_SERV.0";
  }

  if ( objName.length > 0 )
  {
    notifyAppRequestCommand ( "FPREV" );
    window.setTimeout ( "setField ( '" + objName + "' );", 200 );
  }
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
