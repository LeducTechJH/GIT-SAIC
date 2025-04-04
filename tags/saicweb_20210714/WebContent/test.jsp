<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="es" lang="es">


<head>


<meta name="author" content="MainTrend Ltd." />
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />


<title>Departamento De La Familia - SAIC - test</title>


<link rel="stylesheet" href="css/poc.css" type="text/css" />

<script language="JavaScript" src="js/actionBlocker.js"></script>
<script language="JavaScript" src="js/editorWindow.js"></script>
<script language="JavaScript" src="js/header.js"></script>
<script language="JavaScript" src="js/keyEventHandler.js"></script>
<script language="JavaScript" src="js/messages.js"></script>

<script language="JavaScript">
<!--

var queryMode = false;

var jdpCode     = "";
var dsdCode     = "";
var menCode     = "";

var servletPath = "TestServlet.process";

var lastClicked = null;

var currentList = "DataFormList";

var objectLists = new Array ( );

objectLists [ "DataFormList" ] = new Array 
(
  'JDP',
  'ACCION_TOMADA_FRAUDE_FR',
  'ACCNEG_FR',
  'ACTUALIZAR_RECLA_FR',
  'ACTUALIZAR_RETRO_FR',
  'AD220A_A2_FR',
  'AD220B_A2_FR',
  'ADSEF155_FR',
  'ADSEF183_FR',
  'ADSEF184_FR',
  'ADSEF_PAN_04_FR',
  'ADSEF_PPT_1A_RP',
  'ADSEF_PPT_1_RP',
  'ADSEF_PPT_4_RP',
  'AGENCIAS_CLIENTE_FR',
  'AJUSTE_PAGO_RECLA_FR',
  'AJUSTE_PAG_RPT_B_FR',
  'AJUSTE_PAG_RPT_C_FR',
  'AJUSTE_PAN_FR',
  'AJUSTE_PAN_RPT_FR',
  'ANTECEDENTE_CLIENTE_FR',
  'APELACIONES2_FR',
  'APELACIONES3_FR',
  'APELACIONES_FR',
  'ASIG_RPT',
  'AUTPAG_FR',
  'BAJAS_EMPLEO_RP',
  'BILLETES_FR',
  'BUSCAR_POR_NOMBRE_FR',
  'BUSCAR_POR_SOUNDEX_FR',
  'CALENDARIO_BUSQUEDA_FR',
  'CALENDARIO_LF_FR',
  'CALENDARIO_LOCAL_FUNCTION_FR',
  'CALENDARIO_MAIN_FR',
  'CALEND_TECNICO_DISP_MANT_FR',
  'CAMBIO_OWNER_FR',
  'CASOS_HISTORICOS_PRINT_FR',
  'CASOS_HISTORICOS_RP',
  'CASOS_HISTORICOS_SUB_FR',
  'CASOS_HISTO_RECLARETRO_RP',
  'CASOS_HIST_60MESES_RP',
  'CASOS_HIST_ESFUERZO_RP',
  'CASOS_HIST_SERV_RP',
  'CENTRAL_DESEA_ESTE_CLIENTE_FR',
  'CIERRE_MES_RP',
  'CITAS_FR',
  'CLASSIF_AEC_FRM',
  'CODIGOS_AGENCIAS_RPT',
  'CODIGOS_BENEF_PAN_RPT',
  'CODIGOS_GENERALES_RPT',
  'CODIGOS_GEN_GBL_RPT',
  'CODIGOS_NOMBRE_GENERAL_RPT',
  'CODIGOS_NOTIF_RPT',
  'CODIGOS_POSTALES_RPT',
  'CODIGOS_RMO_RPT',
  'CODIGOS_SEGURIDAD_RPT',
  'CODIGOS_SERVICIOS_RPT',
  'CODIGOS_SERVICIO_INGRESO_RPT',
  'CODIGOS_SERVICIO_RECURSO_RPT',
  'CODIGOS_SERV_PROVEEDOR_RPT',
  'CODIGOS_STATUS_RPT',
  'CODIGO_GANBILL_RPT',
  'CODIGO_GASTOS_RPT',
  'CODIGO_INGRESOS_RPT',
  'CODIGO_NEW_TECNICO_RPT',
  'CODIGO_PLAN_TRABAJO_RPT',
  'CODIGO_PROVEEDOR_RPT',
  'CODIGO_RECURSO_RPT',
  'CODIGO_SERVICIO_GASTOS_RPT',
  'CODIGO_SORBILL_RPT',
  'CODIGO_TECNICO_RPT',
  'COMPROMISO_PAGO_RECLA_FR',
  'COMPUTO_BILLETES_FR',
  'COMP_FAM_INFORMES_FR',
  'CONTACTO_FRM',
  'CUENTA_RPT',
  'DESCALIFICADOS_CLIENTE_FR',
  'DESEA_ESTE_CLIENTE_FR',
  'DETERMINAR_RECLAMACION_FR',
  'DET_REC_FR',
  'DSS109_REC_FR',
  'DSS172_FR',
  'DSS173_FR',
  'DSS174_FR',
  'DSS180_RPT_FR',
  'DSS180_SCR_FR',
  'EMPLEOS_CLIENTE_FR',
  'ESFUERZO_FR',
  'ESFU_ELEG_RP',
  'ESFU_REFERIDAS_FRM',
  'EVALUACION_SITUACION_TANF',
  'FECHAS_SERVICIO_FRM',
  'FONDO_RPT',
  'GASTOS_CLIENTE_FR',
  'GRANT_RPT',
  'INACTIVOS_FR',
  'INFORMACION_REFERIMIENTO_REPORT_FRM',
  'INFORMACION_SERV_TANF_FR',
  'INFORME_ESTADISTICO_APEL_FR',
  'INFORME_VISTA_APELACIONES_FR',
  'INFOR_BIO_FRM',
  'INFOR_CITAS_FR',
  'INF_FECHAS_VENCE24_FR',
  'INF_FECHAS_VENCE_FR',
  'INF_FECHA_VENCE_RECLA_FR',
  'INF_NINOS_CUMPLIERON_18_FR',
  'INF_NINOS_CUMPLIRAN_18_FR',
  'INGRESOS_CLIENTE_FR',
  'JUNTA_MEDICA_FR',
  'LISTADO_TECNICO_ASIGNADO_FR',
  'LISTA_ACCION_TOMADA_FRAUDE_FRM',
  'LISTA_APELACIONES_FR',
  'LISTA_CAMBIO_OWNER_FRM',
  'LISTA_ESFUERZO_FR',
  'LISTA_RECLA_FR',
  'LISTA_REFERIDO_FRAUDE_FRM',
  'LISTA_RETRO_FR',
  'MANTENIMIENTO_AGENCIAS_FR',
  'MANTENIMIENTO_ASIG_FR',
  'MANTENIMIENTO_BENEFICIO_PAN_FR',
  'MANTENIMIENTO_CUENTA_FR',
  'MANTENIMIENTO_DEDUCC_FR',
  'MANTENIMIENTO_FONDO_FR',
  'MANTENIMIENTO_GANBIL_FR',
  'MANTENIMIENTO_GENERAL_FR',
  'MANTENIMIENTO_GRANT_FR',
  'MANTENIMIENTO_INGRESO_FR',
  'MANTENIMIENTO_NOMBRE_GEN_FR',
  'MANTENIMIENTO_NOTIFIC_FR',
  'MANTENIMIENTO_ORG_FR',
  'MANTENIMIENTO_PLAN_TRABAJO_FRM',
  'MANTENIMIENTO_PROVEEDOR_FR',
  'MANTENIMIENTO_RECURSOS_FR',
  'MANTENIMIENTO_REMOVER_CLIENTE_CENTRAL_FRM',
  'MANTENIMIENTO_REMOVER_CLIENTE_FRM',
  'MANTENIMIENTO_RMO_FRM',
  'MANTENIMIENTO_SECTOR_FR',
  'MANTENIMIENTO_SEGURIDAD_FRM',
  'MANTENIMIENTO_SEGURIDAD_MODULOS_FRM',
  'MANTENIMIENTO_SERVICIOS_FR',
  'MANTENIMIENTO_SERVICIO_DEC_FR',
  'MANTENIMIENTO_SERVICIO_ING_FR',
  'MANTENIMIENTO_SERVICIO_REC_FR',
  'MANTENIMIENTO_SERV_PROV_FRM',
  'MANTENIMIENTO_SORBIL_FR',
  'MANTENIMIENTO_STATUS_TBL_FRM',
  'MANTENIMIENTO_TECNICO_FR',
  'MANTENIMIENTO_ZIPCODE_FR',
  'NOTIFICACIONES_FAM_FR',
  'NUCLEO_FULL_REPORT_FRM',
  'NUCLEO_REPORT_FRM',
  'ORG_RPT',
  'OTRPAG_A2_FR',
  'OTRPAG_A3_SUB_FR',
  'PENDAUTO_FR',
  'PENDLECT_FR',
  'PLAN_TRABAJO_FRM',
  'PRE_MENU_MANT_SERV_FR',
  'PRINT_COMPROMISO_PAGO_FR',
  'PTRA_CLIENTE_FR',
  'PTRA_EMPLEO_FR',
  'RECLA_BENE_FR',
  'RECLA_DETERMINADAS_FRM',
  'RECLA_PENDCOBR_FRM',
  'RECLA_REFERIDAS_FRM',
  'RECOFI_A_FR',
  'RECURSOS_CLIENTE_FR',
  'REFERIDOS_FRM',
  'REFERIDO_RECLA_AUTO_FR',
  'REFERIDO_RECLA_FR',
  'REGISTROS_OCUP_RP',
  'REGISTRO_APELACIONES_RPT',
  'REGISTRO_EMPLEOS_FR',
  'REGISTRO_NOTIFICACIONES_FR',
  'REGPAG_A2_FR',
  'REGPAG_FR',
  'REGPAG_PRN_FR',
  'REPORT_2_1_RP',
  'REPORT_2_4_RP',
  'REPORT_2_5_RP',
  'REPORT_3_1_FR',
  'REPORT_3_2_FR',
  'REPORT_6_1_RP',
  'REPORT_6_2_RP',
  'REPORT_6_3_RP',
  'REPORT_6_4_RP',
  'REPORT_6_5_RP',
  'REPORT_6_6_RP',
  'REPORT_9_10A_FR',
  'REPORT_9_10_FR',
  'REPORT_9_13_FR',
  'REPORT_9_14_FR',
  'REPORT_9_17_FR',
  'REPORT_9_18_FR',
  'REPORT_9_22_FR',
  'REPORT_9_23_FR',
  'REPORT_9_24_B_FR',
  'REPORT_9_26A_2_FR',
  'REPORT_9_4_FR',
  'REPORT_9_6B_FR',
  'REPORT_9_6_FR',
  'REPORT_9_7B_FR',
  'REPORT_9_7_FR',
  'REPORT_9_8_FR',
  'REPORT_9_9_1_FR',
  'RETRO_ASIGNA_FR',
  'RETRO_AUTORI2_FR',
  'RETRO_AUTORI_FR',
  'RETRO_INSERT_FR',
  'RETRO_PAEX_FR',
  'RETRO_REFERIDAS_FRM',
  'RETRO_SELECT_FR',
  'RR_LISTA_ASI_MNU_FR',
  'RR_LISTA_AUT_MNU_FR',
  'RR_LISTA_SEL_MNU_FR',
  'SAIR_RPT_FR',
  'SC1035_FR',
  'SC1035_PRN_FR',
  'SC1071_FR',
  'SC1072_FR',
  'SC1218_PRN_FR',
  'SC1218_RPT_FR',
  'SC1230_FR',
  'SC1230_PRN_FR',
  'SC724_FR',
  'SC776_FR',
  'SECTOR_RPT',
  'SEG_GESTION_EMPLEO_RP',
  'SEL_SERVICIO_APELACIONES_FR',
  'SEL_SERVICIO_ESFUERZO_FR',
  'SERVICIOS_CLIENTE_FRM',
  'SERV_FAM_FRM',
  'SERV_NUCLEO_SERV_FRM',
  'SOLICITUD_SERVICIO_FR',
  'SOLIC_PROGRAMA_POTENCIAL_FR',
  'SOLIC_SERV_COMP_FAMILIAR_FR',
  'SOLIC_SERV_COMP_FAM_PROB_FAM_FR',
  'SOLIC_SERV_VISITAS_PARA_HOY_FR',
  'STATUS_REC_RPT_B_FR',
  'STATUS_REC_RPT_C_FR',
  'TANF_SSA_FR',
  'TANF_SSTEMP_FR',
  'TARJETA_REF_RP',
  'TECNICOS_DISPONIBLES_ENTREVISTA_FR',
  'TRANSFER_COPY_FR',
  'TRANSFER_COPY_PRINT_FR',
  'TRANSFER_COPY_SUB_FR',
  'TRANSFER_FIX_FR'
);

objectLists [ "FormatFormList" ] = new Array 
(
  'JDP',
  'AD220A_A1_FR',
  'AD220A_A3_FR',
  'AD220B_A1_FR',
  'AD220B_A3_FR',
  'ADSEF_111_FR',
  'ADSEF_147_FR',
  'ADSEF_AN_3_FR',
  'ADSEF_PPT_15_FR',
  'ADSEF_PPT_5A_FR',
  'ADSEF_PPT_6_FR',
  'ADSEF_TANF_03_FR',
  'ADSEF_TANF_06A_FR',
  'ADSEF_TANF_10_FR',
  'ADSEF_TANF_12_A_FR',
  'AE115_FR',
  'AE_5_FR',
  'AJUSTE_EMERGENCIA_FR',
  'AJUSTE_PAG_RPT_A_FR',
  'ANS_FR',
  'AUTO_PAGO_FRM',
  'BUSCAR_3_NOMBRE_PEDIR_APELLIDOS_FRM',
  'BUSCAR_SOUNDEX_PEDIR_APELLIDOS_FRM',
  'CALENDARIO_PLOT_FR',
  'CAL_TECNICO_FRM',
  'CARTA_CERTIFICACION_FR',
  'CARTA_CERTI_GET_SSN_FAM_FR',
  'COMPENSACION_RECLA_FR',
  'COMP_FAM_INF_SSN_FR',
  'DETERMINACION_AEA',
  'DETERMINACION_FR',
  'DETERMINACION_PANB_FR',
  'DSS108_A1_FR',
  'DSS108_MENU_FR',
  'DSS109_MENU_FR',
  'DSS170_MENU_FR',
  'DSS170_RPT_FR',
  'DSS171_MENU_FR',
  'DSS171_RMENU_FR',
  'DSS171_RPT_FR',
  'DSS172_MENU_FR',
  'DSS172_RMENU_FR',
  'DSS180_MENU_FR',
  'DSS220_RPT_FR',
  'DSS221_MENU_FR',
  'DSS221_RPT_FR',
  'ENTREVISTA_BLANCO_FR',
  'GET_ADSEF155_FR',
  'GET_ADSEF183_FR',
  'GET_ADSEF184_FR',
  'GET_AE115_FR',
  'GET_COMPROMISO_PAGO_FR',
  'GET_DSS173_FR',
  'GET_DSS174_FR',
  'GET_FECHA_VENCE_RECLA_FR',
  'GET_IEVS_R',
  'GET_SC1071_FR',
  'GET_SC1072_FR',
  'GET_SC724_FACTURA_FR',
  'GET_SC724_FR',
  'GET_SC776_FR',
  'GET_SSN_FR',
  'GET_SSN_INF_REFE_RPT_FRM',
  'INFORME_RECLA_IEVS_FR',
  'INF_FECHAS_VENCE24_PRE_FR',
  'INF_FECHAS_VENCE_PRE_FR',
  'INF_TECNICO_FR',
  'LISTA_DOCUM_FR',
  'LISTA_VERIFICACION_FR',
  'NOTIFICACIONES_GET_SSN_FR',
  'NUEVO_JEFE_FAM_FRM',
  'OTRPAG_A1_FR',
  'OTRPAG_A3_FR',
  'PERS_REFERIDA_TANF03_FR',
  'PREP_ENCARGADO_NEC_FR',
  'PREP_PADRASTRO_FR',
  'PRI_TANF_FR',
  'PSE_2_FR',
  'RECOFI_PRN_FR',
  'REDETERMINACION_RECLA_FR',
  'REFERIR_CASO_FRAUDE_RECLA_FR',
  'REGPAG_A1_FR',
  'REPORTE_IND_GENEAL_TBL_FR',
  'REPORT_2_1_FR',
  'REPORT_2_4_FR',
  'REPORT_2_5_FR',
  'REPORT_3_2_1_FR',
  'REPORT_5_3_FR',
  'REPORT_6_1_FR',
  'REPORT_6_2_FR',
  'REPORT_6_3_FR',
  'REPORT_6_4_FR',
  'REPORT_6_5_FR',
  'REPORT_6_6_FR',
  'REPORT_9_21_FR',
  'REPORT_9_30_FR',
  'REPORT_DSS171_RP',
  'REPORT_RETIRO_APELACION_PRT',
  'REPORT_SOLICITUD_APELACION',
  'RESUMEN_SITUACION_FRM',
  'RR_INS_DSS171_FR',
  'SAIR_MENU_FR',
  'SC1218_MENU_FR',
  'SELECCION_FECHA_VISTA_APEL_FR',
  'SEL_FECHAS_REP_APELACIONES_FR',
  'SEL_FECHA_PTRA_FR',
  'SEL_MES_PTRA_FR',
  'SEL_OCUP_PTRA_FR',
  'SEL_RMO_OFICINA_ALL_FR',
  'SEL_RMO_OFICINA_FR',
  'SEL_SSN_PTRA_FR',
  'STATUS_REC_RPT_A_FR',
  'TRANSFER_COPY_ANS_FR',
  'TRANSFER_FR',
  'TRANSFER_MSG_RP'
);

objectLists [ "LOVFormList" ] = new Array 
(
  'JDP',
  'ACCION_APELADA_LOV_FR',
  'ACCION_LOV_FRM',
  'ACCION_TOMADA_FRAUDE_LOV_FR',
  'ACCION_TOMADA_LOV_FR',
  'ACC_RECLARETRO_LOV_FR',
  'ACC_RECLA_LOV_FR',
  'ACC_RETRO_LOV_FR',
  'ACC_RREC_LOV_FR',
  'AGENCIA_LOV_FR',
  'AJUSTE_60MESES_LOV_FR',
  'CIUDAD_LOV_FR',
  'CLASIFICACION_LOV_FR',
  'CLASI_RECLA_LOV_FR',
  'COD_ACTIVIDADES_CALEND_LOV_FR',
  'COD_SERVICIOS_LOV_FR',
  'DECISION_HACIENDA_FRAUDE_LOV_FR',
  'DECISION_JUNTA_LOV_FR',
  'DECISION_JUSTICIA_FRAUDE_LOV_FR',
  'DECISION_RECONSIDERACION_LOV_FR',
  'DEDUCCIONES_LOV_FR',
  'DIVISION_LOV_FR',
  'EMPRESAS_LOV_FR',
  'FAM_LOV_FR',
  'FCH_FACTURA_LOV_FR',
  'FECHAS_SERV_PROVEED_LOV_FR',
  'FORMA_RADICA_LOV_FR',
  'GEN_ADEL_LOV_FR',
  'GEN_BILLETERO_LOV_FR',
  'GEN_CAT_ESFU_LOV_FR',
  'GEN_CIUD_LOV_FR',
  'GEN_CLAVE_ACCION_FR',
  'GEN_COD_REGISTRO_LOV_FR',
  'GEN_DESCALIF_LOV_FR',
  'GEN_DIAT_LOV_FR',
  'GEN_EMPLE0_LOV_FR',
  'GEN_ESCI_LOV_FR',
  'GEN_ESCOLARIDAD_LOV_FR',
  'GEN_ESTATUS_PART_TRAB_LOV_FR',
  'GEN_FACT_ELEG_AEC_LOV_FR',
  'GEN_IDIOMA_LOV_FR',
  'GEN_INCAPACIDAD_LOV_FR',
  'GEN_INSTITUCION_LOV_FR',
  'GEN_LOV_TBL_PARF_FR',
  'GEN_MODU_LOV_FR',
  'GEN_MOTI_ELEG_LOV_FR',
  'GEN_MUNI_LOV_FR',
  'GEN_OCUPACION2_LOV_FR',
  'GEN_OCUPACION3_LOV_FR',
  'GEN_OCUPACION_LOV_FR',
  'GEN_PARC_LOV_FR',
  'GEN_PARF_LOV_FR',
  'GEN_PAR_CIUD_LOV_FR',
  'GEN_PAR_ESCI_LOV_FR',
  'GEN_PAR_PROB_LOV_FR',
  'GEN_PASOS_LOV_FR',
  'GEN_PATRONO_LOV_FR',
  'GEN_PRESUNTIVO_LOV_FR',
  'GEN_PROB_LOV_FR',
  'GEN_RAZON_BAJA_LOV_FR',
  'GEN_RECHAZO_ESFU_LOV_FR',
  'GEN_RZVS_LOV_FR',
  'GEN_SECO_LOV_FR',
  'GEN_SEGU_LOV_FR',
  'GEN_TBL_PSM_LOV_FR',
  'GEN_TENE_LOV_FR',
  'GEN_TIPO_REGISTRO_LOV_FR',
  'GEN_TLIC_LOV_FR',
  'GEN_UBICACION_LOV_FR',
  'GEN_ZONA_LOV_FR',
  'INFOR_OCUPACION_LOV_FR',
  'INGRESOS_LOV_FR',
  'LOV_COD_SERV_FR',
  'LOV_MODO_PAGO_ADSEF220_FR',
  'LOV_MODO_PAGO_FR',
  'LOV_PAGO_RECIBIDO_FR',
  'LOV_RECIBIDO_EN_FR',
  'METODO_LOV_FRM',
  'METODO_PAGO_LOV_FR',
  'NOMBRE_GENERAL_LOV_FR',
  'RAZON_60_MESES_TANF',
  'RAZON_AJUSTE_BASE_CORRECTA_LOV_FR',
  'RAZON_APELACION_LOV_FR',
  'RAZON_DENEGADA_ATEM_LOV_FR',
  'RAZON_REFERIDO_FRAUDE_LOV_FR',
  'RAZON_RETRO_LOV_FR',
  'RECURSOS_LOV_FR',
  'REFERIDO_A_LOV_FR',
  'REFERIDO_LOV_FRM',
  'RMO_LOV_FR',
  'RMO_TBL_LOV_FR',
  'SEL_RMO_LOV_FR',
  'SERVICIO2_LOV_FR',
  'SERVICIO_LOV_FR',
  'SIST_VERIFICA_RECLA_LOV_FR',
  'SOLICITADO_POR_LOV_FR1',
  'SOL_RECONSIDERACION_LOV_FR',
  'STATUS_APELACION_FR',
  'STATUS_RECLA_LOV_FR',
  'STATUS_REFERIDO_FRAUDE_LOV_FR',
  'STATUS_SERV_LOV_FR',
  'TECNICO_LOV1',
  'TECNICO_LOV2',
  'TECNICO_LOV3',
  'TECNICO_LOV4',
  'TECNICO_LOV5',
  'TECNICO_LOV6',
  'TECNICO_LOV_FR',
  'TECNICO_RECLA_LOV_FR',
  'TECNICO_RESTR_LOV_FRM',
  'TECNICO_RETRO_LOV_FR',
  'TIPO_SERV_ATEM_LOV_FR',
  'TRAN_FAM_LOV_FR',
  'ZIPCODE_LOV_FR',
  'ZIP_LOV_FR',
  'ZIP_SERV_LOV_FR'
);

objectLists [ "DSDList" ] = new Array 
(
  'DSD',
  'ACCION_APELADA_LOV_DSD',
  'ACCION_JUNTA_LOV_DSD',
  'ACCION_TOMADA_FRAUDE_LOV_DSD',
  'ACCNEG_DSD',
  'ACTIVIDADES_DISPONIBLES_DSD',
  'ACTIVIDADES_DSD',
  'ACTIVIDADES_LOC_DSD',
  'ACTUALIZAR_RECLA_DSD',
  'AD220A_AG1_DSD',
  'AD220A_AG2_V2_DSD',
  'AD220A_BG2_DSD',
  'AD220A_BG2_PAR_DSD',
  'AD220A_BG2_RO_DSD',
  'ADSEF155_DSD',
  'ADSEF183_DSD',
  'ADSEF184_DSD',
  'ADSEF_PPT_1A_DSD',
  'ADSEF_PPT_4_DSD',
  'AE115_RECAUDACIONES_DSD',
  'AE115_RECLA_RETRO_DSD',
  'AGENCIA_LOC_DSD',
  'AGENCIA_TBL_DSD',
  'AGENCIA_TBL_LOV_DSD',
  'AGENCIA_TBL_RO_DSD',
  'AJUSTE_60MESES_DSD',
  'AJUSTE_PAN_DSD',
  'AJUSTE_PAN_ROR_DSD',
  'AJUSTE_PAN_RO_DSD',
  'ANTECEDENTES_DSD',
  'ANTECENDES_CERRAR_SERVICIO_DSD',
  'APELACIONES2_DSD',
  'APELACIONES3_DSD',
  'APELACIONES4_DSD',
  'APELACIONES_DSD',
  'APELACIONES_LOC_DSD',
  'APELACIONES_RO_DSD',
  'ASIGNACION_DSD',
  'ASIGNACION_RO_DSD',
  'AUTPAG_AG1_DSD',
  'AUTPAG_AG2_DSD',
  'AUTPAG_AG2_RO_DSD',
  'AUTPAG_RECLA_DSD',
  'BAJAS_EMPLEO_DSD',
  'BASE_CORRECTA_DSD',
  'BASE_CORRECTA_NOPARA_DSD',
  'BASE_CORRECTA_RO_DSD',
  'BASE_INCORRECTA_DSD',
  'BASE_INCORRECTA_NOPARA2_DSD',
  'BASE_INCORRECTA_NOPARA_DSD',
  'BASE_INCORRECTA_RO_DSD',
  'BENEFICIOS_PAN_DSD',
  'BENEFICIOS_PAN_RO_DSD',
  'BILLETES_DSD',
  'BILLETES_FIX',
  'BILLETES_FIX_RO',
  'BILLETES_LOC_DSD',
  'BILLETES_READ_LOC_DSD',
  'BILLETES_UPD_DSD',
  'BUSCAR_DIRECCION_DSD',
  'BUSCAR_POR_NOMBRE_DSD',
  'BUSCAR_POR_SOUNDEX_DSD2',
  'CALENDARIO2_DSD',
  'CALENDARIO_CAL_RW_DSD',
  'CALENDARIO_DSD',
  'CALENDARIO_LF_DSD',
  'CALENDARIO_RECLA_RO_DSD',
  'CALEND_TECNICO_AVAIL_MANT_DSD',
  'CAMBIO_OWNER_DSD',
  'CASOS_ESFUERZO_DSD',
  'CASOS_HISTORICOS_DSD',
  'CASOS_HISTORICOS_SUB_DSD',
  'CASOS_HISTO_RECLARETRO_DSD',
  'CASOS_HIST_60MESES',
  'CASOS_HIST_SERV_DSD',
  'CENTRAL_CLIENTES2_DSD',
  'CENTRAL_CLIENTES_RO2_DSD',
  'CENTRAL_CLIENTES_RO_DSD',
  'CENTRAL_DESEA_CLIENTE3_DSD',
  'CENTRAL_NUCLEO_EXISTE3_DSD',
  'CENTRAL_NUCLEO_EXISTE_ADL2_DSD',
  'CIERRE_MES_DSD',
  'CITAS_DSD',
  'CIUDAD_LOV_DSD',
  'CLASIFICACION_LOV_DSD',
  'CLASI_RECLA_DSD',
  'CLASSIF_AEC_RO_DSD',
  'CLC_STAT_RPT_RO_DSD',
  'CLC_STAT_TBL_DSD',
  'CLC_STAT_TBL_LOV_RO_DSD',
  'CLIENTES2_DSD',
  'CLIENTES2_RO_DSD',
  'CLIENTES_DSD',
  'CLIENTES_FIX_DSD',
  'CLIENTES_FIX_RO_DSD',
  'CLIENTES_LOC_DSD',
  'CLIENTES_PARM_DSD',
  'CLIENTES_READ_DSD',
  'CLIENTES_READ_LOC_DSD',
  'CLIENTES_RO_DSD',
  'CLIENTE_AGENCIA2_DSD',
  'CLIENTE_AGENCIA_DSD',
  'CLIENTE_R_DSD',
  'CLIENT_INFO_SOLICITUD_SERVICO_DSD',
  'COD_ACTIVIDADES_CALEND_LOV_DSD',
  'COD_SERVICIOS_LOV_RO_DSD',
  'COMPROMISO_PAGO_RECLA_AJUSTE_DSD',
  'COMPROMISO_PAGO_RECLA_DSD',
  'COMPUTO_BILLETES_DSD',
  'CONTACTO_DSD',
  'CONTROL_PLAN_TRABAJO_DSD',
  'CONTROL_PLAN_TRABAJO_RO_DSD',
  'CONTROL_PLAN_TRABAJO_RPT_RO_DSD',
  'CUENTA_DSD',
  'CUENTA_RO_DSD',
  'CURSOS_ADIESTRAMIENTOS_DSD',
  'CURSOS_ADIESTRAMIENTOS_RO_DSD',
  'CURSOS_LOC_DSD',
  'DECISION_HACIENDA_FRAUDE_LOV_DSD',
  'DECISION_JUNTA_LOV_DSD',
  'DECISION_JUSTICIA_FRAUDE_LOV_DSD',
  'DECISION_RECONSIDERACION_LOV_DSD',
  'DEDUCCIONES_CLIENTE2_DSD',
  'DEDUCCIONES_CLIENTE2_RO_DSD',
  'DEDUCCIONES_CLIENTE_DSD',
  'DEDUCCIONES_CLIENTE_FIX',
  'DEDUCCIONES_CLIENTE_FIX_RO',
  'DEDUCCIONES_LOC_DSD',
  'DEDUCCIONES_READ_LOC_DSD',
  'DEDUCCIONES_TBL_DSD',
  'DEDUCCIONES_TBL_LOV_DSD',
  'DEDUCCIONES_TBL_RO_DSD',
  'DESCALIFICADOS2_DSD',
  'DESCALIFICADOS_DSD',
  'DESCALIFICADOS_LOC_DSD',
  'DESCALIFICADOS_LOC_RO_DSD',
  'DESCALIFICADOS_READ_LOC_DSD',
  'DESCALIFICADOS_RO_DSD',
  'DESEA_CLIENTE_DSD',
  'DESGLOSE_MIEMBROS',
  'DESGLOSE_READ_MIEMBROS',
  'DETERMINA_RO_DSD',
  'DIRECCIONES_DSD',
  'DIRECCIONES_FAMILIA_DSD',
  'DIRECCIONES_LOC_DSD',
  'DIRECCIONES_LOC_RO_DSD',
  'DIRECCIONES_RO_DSD',
  'DIRECCIONES_R_DSD',
  'DIRECCION_SOLICITUD_SERVICO_DSD',
  'DIR_POST_SOLICITUD_DSD',
  'DIR_RESI_SOLICITUD_DSD',
  'DIVISION_LOV_DSD',
  'DSS173_DSD',
  'DSS174_DSD',
  'DSS221_RPT_DSD',
  'EMPLEOS_CLIENTE_DSD',
  'EMPLEOS_CLIENTE_RO_DSD',
  'EMPLEO_PTRA_LOC_DSD',
  'EMPRESAS_RO_DSD',
  'ESFU_AUTORIZADAS_RO_DSD',
  'ESFU_REFERIDAS_DSD',
  'ESFU_REFERIDAS_RO_DSD',
  'EXPERIENCIAS_DSD',
  'EXPERIENCIAS_LOC_DSD',
  'EXPERIENCIAS_RO_DSD',
  'FACTURAS_DSD',
  'FACTURAS_LOC_DSD',
  'FACTURAS_RO_DSD',
  'FAMILIAS_DSD',
  'FAMILIAS_RO_DSD',
  'FAMILIA_LOC_DSD',
  'FAMILIA_READ_LOC_DSD',
  'FAMILIA_RMO_DSD',
  'FAMILIA_RMO_READ_DSD',
  'FAM_JEFE_DSD',
  'FAM_LOV_DSD',
  'FECHAS_SERVICIO_DSD',
  'FECHAS_SERV_PROVEEDORES_DSD',
  'FECHAS_VENCE24_INF_DSD',
  'FECHAS_VENCE_INF_DSD',
  'FONDO_DSD',
  'FONDO_RO_DSD',
  'FORMA_RADICA_LOV_DSD',
  'GANBIL_DSD',
  'GANBIL_RO_DSD',
  'GANBIL_RPT_DSD',
  'GASTOS_NUCLEO_DSD',
  'GASTOS_NUCLEO_RO_DSD',
  'GENERAL_GBL_RPT_DSD',
  'GENERAL_PRT_DSD',
  'GENERAL_TBL_DSD',
  'GENERAL_TBL_LOV_DSD',
  'GENERAL_TBL_PARF_RO_DSD',
  'GENERAL_TBL_RO_DSD',
  'GEN_ADEL_DSD',
  'GEN_BILLETERO_DSD',
  'GEN_CAT_ESFU_RO_DSD',
  'GEN_CIUD_LOV_RO_DSD',
  'GEN_CIVIL_DSD',
  'GEN_CLAVE_ACCION_DSD',
  'GEN_CLLA_DSD',
  'GEN_COD_REGISTRO_ROD_DSD',
  'GEN_DIAT_LOV_RO_DSD',
  'GEN_EMPLEO_DSD',
  'GEN_ESCI_LOV_RO_DSD',
  'GEN_ESCOLARIDAD_DSD',
  'GEN_ESTATUS_PART_TRAB_DSD',
  'GEN_FACT_ELEG_AEC_DSD',
  'GEN_IDIOMA_RO_DSD',
  'GEN_INCAPACIDAD_PRI_DSD',
  'GEN_INSTITUCION_DSD',
  'GEN_MODU_LOV_DSD',
  'GEN_MODU_RO_DSD',
  'GEN_MOTI_ELEG_DSD',
  'GEN_OCUPACION_DSD',
  'GEN_PARC_LOV_DSD',
  'GEN_PARF_LOV_RO_DSD',
  'GEN_PAR_CIUD_RO_DSD',
  'GEN_PATRONO_RO_DSD',
  'GEN_PRESUNTIVO_DSD',
  'GEN_PROBLEMA_DSD',
  'GEN_PROB_LOV_RO_DSD',
  'GEN_RAZON_BAJA_DSD',
  'GEN_RECHAZO_ESFU_RO_DSD',
  'GEN_RZVS_LOV_RO_DSD',
  'GEN_SECO_DSD',
  'GEN_SEGU_LOV_DSD',
  'GEN_TBL_DESCALIFICADOS_LOV_DSD',
  'GEN_TBL_PASOS_LOV_DSD',
  'GEN_TBL_PSM_LOV_DSD',
  'GEN_TENE_LOV_RO_DSD',
  'GEN_TIPO_REGISTRO_RO_DSD',
  'GEN_TLIC_RO_DSD',
  'GEN_UBICACION_DSD',
  'GEN_ZONA_LOV_RO_DSD',
  'GRANT_DSD',
  'GRANT_RO_DSD',
  'HEADER_NOTIFICACION_2_DSD',
  'HEADER_NOTIFICACION_DSD',
  'IDIOMAS_DSD',
  'IDIOMAS_LOC_DSD',
  'IDIOMAS_RO_DSD',
  'INACTIVOS_DSD',
  'INCORRECTA_LOC_DSD',
  'INFORME_EST_APEL_DSD',
  'INFOR_CITAS_DSD',
  'INFO_CLIENTE_RECLA_DSD',
  'INFO_REFER_CALEND_VISITA_DSD',
  'INFO_REPRE_DSD',
  'INF_FECHAS_VENCE_RECLA_DSD',
  'INF_NINOS_CUMPLIERON_18_DSD',
  'INF_NINOS_CUMPLIRAN_18_DSD',
  'INGRESOS_CLIENTE_2_DSD',
  'INGRESOS_CLIENTE_2_RO_DSD',
  'INGRESOS_CLIENTE_DSD',
  'INGRESOS_CLIENTE_FIX',
  'INGRESOS_CLIENTE_FIX_RO',
  'INGRESOS_LOC_DSD',
  'INGRESOS_NUCLEO_DSD',
  'INGRESOS_NUCLEO_RO_DSD',
  'INGRESOS_READ_LOC_DSD',
  'INGRESOS_TBL_DSD',
  'INGRESOS_TBL_LOV_DSD',
  'INGRESOS_TBL_RO_DSD',
  'JEFE_SERVICIOS_DSD',
  'JUNTA_MEDICA_DSD',
  'LICENCIAS_DSD',
  'LICENCIAS_LOC_DSD',
  'LICENCIAS_RO_DSD',
  'LISTADO_TECNICO_ASIGNADO_DSD',
  'LISTA_ACCION_FRAUDE_DSD',
  'LISTA_APELACIONES2_DSD',
  'LISTA_APELACIONES_DSD',
  'LISTA_CAMBIO_OWNER_DSD',
  'LISTA_EMISION_ESFUERZO2_DSD',
  'LISTA_EMISION_ESFUERZO_DSD',
  'LISTA_ESFUERZO_DSD',
  'LISTA_REFERIDO_FRAUDE_DSD',
  'LOV_COD_SERV_DSD',
  'LOV_MODO_PAGO_ADSEF220_DSD',
  'LOV_MODO_PAGO_DSD',
  'LOV_PAGO_RECIBIDO_DSD',
  'LOV_RECIBIDO_EN_DSD',
  'LOV_TECNICO_DSD',
  'MAIL_CREATE_DSD',
  'METODO_PAGO_DSD',
  'MODULOS_GEN_TBL_RO_DSD',
  'MODULO_ACCESS_UPD_DSD',
  'NOMBRE_CLIENTES_2_DSD',
  'NOMBRE_CLIENTE_DSD',
  'NOMBRE_GENERAL_TBL_DSD',
  'NOMBRE_GENERAL_TBL_RO_DSD',
  'NOTIFICACIONES_DSD',
  'NOTIFICACIONES_RO_DSD',
  'NOTIFICACIONES_TBL_DSD',
  'NOTIFICACIONES_TBL_RO_DSD',
  'NOTIFICA_LOC_DSD',
  'NUCLEOS_EXISTE2_DSD',
  'NUCLEOS_EXISTE_DSD',
  'NUCLEO_CLIENTE_DSD',
  'NUCLEO_LOC_DSD',
  'NUCLEO_READ_LOC_DSD',
  'NUCLEO_SERVICIOS_CROSS_DSD',
  'NUCLEO_SERVICIO_DSD',
  'NUCLEO_SERVICIO_FIX',
  'NUCLEO_SERVICIO_FIX_RO',
  'NUCLEO_SERVICIO_RO_DSD',
  'NUCLEO_SERVICIO_UPD_DSD',
  'NUCLEO_SERVICIO_UPD_RO_DSD',
  'ORG_DSD',
  'ORG_RO_DSD',
  'PENDAUTO_DSD',
  'PENDLECT_DSD',
  'PRESUPUESTO_LOC_DSD',
  'PRE_MENU_MANT_SERV_DSD',
  'PRE_MENU_SERV_SERV_DSD',
  'PROVEEDORES_TBL_DSD',
  'PROVEEDORES_TBL_RO_DSD',
  'PTRA_CLIENTE_2_DSD',
  'PTRA_CLIENTE_DSD',
  'PTRA_CLIENTE_RO_DSD',
  'PTRA_EMPLEOS2_DSD',
  'PTRA_EMPLEOS_DSD',
  'PTRA_TBL_RO_DSD',
  'PT_CALENDARIO_R_DSD',
  'PT_CALEND_W_DSD',
  'PT_PLAN_TRABAJO_R_DSD',
  'RAZON_60_MESES_TANF_DSD',
  'RAZON_AJUSTE_BASE_CORRECTA_LOV_DSD',
  'RAZON_APELACION_LOV_DSD',
  'RAZON_DENEGADA_ATEM_DSD',
  'RAZON_REFERIDO_FRAUDE_LOV_DSD',
  'RAZON_RETRO_DSD',
  'RECAUDACIONES_LOC_DSD',
  'RECAUDACIONES_RO_DSD',
  'RECLARETRO_ACCION_DSD',
  'RECLARETRO_LOC_DSD',
  'RECLA_ACCION_DSD',
  'RECLA_BENEFICIO2_DSD',
  'RECLA_BENEFICIO_AUTO_DSD',
  'RECLA_BENEFICIO_DSD',
  'RECLA_DETERMINADAS_DSD',
  'RECLA_PENDCOBR_DSD',
  'RECLA_REFERIDAS_DSD',
  'RECLA_RETRO_AJUSTE_DSD',
  'RECLA_RETRO_AJUS_DSD',
  'RECLA_RETRO_DSD',
  'RECLA_RETRO_LIST2_DSD',
  'RECLA_RETRO_LIST_DSD',
  'RECLA_RETRO_RO_DSD',
  'RECLA_RETRO_STATUS_DSD',
  'RECLA_RETRO_TABLE_DSD',
  'RECLA_RETRO_TBL_NOPAR_DSD',
  'RECLA_RETRO_TBL_NOPAR_RO_DSD',
  'RECOFI_DSD',
  'RECURSOS_CLIENTE_2_DSD',
  'RECURSOS_CLIENTE_2_RO_DSD',
  'RECURSOS_CLIENTE_DSD',
  'RECURSOS_CLIENTE_FIX',
  'RECURSOS_CLIENTE_FIX_RO',
  'RECURSOS_LOC_DSD',
  'RECURSOS_NUCLEO_DSD',
  'RECURSOS_NUCLEO_RO_DSD',
  'RECURSOS_READ_LOC_DSD',
  'RECURSOS_TBL_DSD',
  'RECURSOS_TBL_LOV_DSD',
  'RECURSOS_TBL_RO_DSD',
  'REFERIDO_A_LOV_DSD',
  'REFERIDO_FRAUDE_DSD',
  'REFERIDO_FRAUDE_NOPAR_DSD',
  'REFERIDO_LOC_DSD',
  'REFERIDO_LOV_DSD',
  'REFERIDO_PARM_DSD',
  'REGISTRO_APELACIONES_DSD',
  'REGISTRO_EMPLEO_DSD',
  'REGISTRO_EMPLEO_RO_DSD',
  'REGISTRO_OCUP_DSD',
  'REGPAG_AG1_2_DSD',
  'REGPAG_AG1_PAR_DSD',
  'REGPAG_AG2_DSD',
  'REGPAG_AG2_V2_DSD',
  'REG_EMPLEO_DSD',
  'REG_EMPLEO_LOC_DSD',
  'REMOVER_CLIENTE_AGEN_RO_DSD',
  'REMOVER_CLIENTE_DIR_RO_DSD',
  'REMOVER_CLIENTE_FAM_RO_DSD',
  'REMOVER_CLIENTE_GAS_RO_DSD',
  'REMOVER_CLIENTE_ING_RO_DSD',
  'REMOVER_CLIENTE_NUC_RO_DSD',
  'REMOVER_CLIENTE_REC_RO_DSD',
  'REMOVER_CLIENTE_SERV_RO_DSD',
  'REPORT_2_1_CREATE_DSD',
  'REPORT_2_1_DSD',
  'REPORT_2_3_CREATE_DSD',
  'REPORT_2_3_DSD',
  'REPORT_2_4_CREATE_DSD',
  'REPORT_2_5_CREATE_DSD',
  'REPORT_3_1_ADL_DSD',
  'REPORT_3_1_FR_DSD',
  'REPORT_3_2_ADL_DSD',
  'REPORT_3_2_FR_DSD',
  'REPORT_6_1_DSD',
  'REPORT_6_1_FIX_DSD',
  'REPORT_6_2_DSD',
  'REPORT_6_2_FIX_DSD',
  'REPORT_6_3_DSD',
  'REPORT_6_3_FIX_DSD',
  'REPORT_6_4_DSD',
  'REPORT_6_4_FIX_DSD',
  'REPORT_6_5_DSD',
  'REPORT_6_5_FIX_DSD',
  'REPORT_6_6_DSD',
  'REPORT_6_6_FIX_DSD',
  'RESUMEN_NUCLEO_RO_DSD',
  'RETROACTIVO_DSD',
  'RETRO_ACCION_DSD',
  'RETRO_BASE_CORR_DSD',
  'RETRO_BASE_INCO_DSD',
  'RETRO_DSS170_DSD',
  'RETRO_PAEX_DSD',
  'RETRO_REFERIDAS_DSD',
  'RETRO_RPT172_DSD',
  'RETRO_RPT180_DSD',
  'RETRO_RPT_DSD',
  'RETRO_RPT_RO_DSD',
  'RMO_DSD',
  'RMO_READ_DSD',
  'RMO_READ_PARM_DSD',
  'RMO_ROR_DSD',
  'RMO_RO_DSD',
  'RMO_TBL_LOV_DSD',
  'RREC_DSD',
  'RR_INSERT_DSD',
  'RR_INSERT_RO_DSD',
  'RR_LISTA_AUT_MNU_DSD',
  'RR_LISTA_INS_MNU_DSD',
  'RR_LISTA_SEL_MNU_DSD',
  'RR_NOTI_INSERT_DSD',
  'SAIR_AG1_DSD',
  'SC1035_AG1_DSD',
  'SC1035_AG2_DSD',
  'SC1035_PRN_DSD',
  'SC1071_DSD',
  'SC1072_DSD',
  'SC1218_AG1_DSD',
  'SC1230_AG1_DSD',
  'SC1230_AG2_DSD',
  'SC1230_PRN_DSD',
  'SC724_DSD',
  'SC724_READ_DSD',
  'SC776_DSD',
  'SC776_EMPLEO_DSD',
  'SECTOR_DSD',
  'SEGURIDAD_RO_DSD',
  'SEGURO_SOCIAL_SUST_DSD',
  'SEG_GESTION_EMP_DSD',
  'SEG_GESTION_LOC_DSD',
  'SEG_GESTION_LOC_RO_DSD',
  'SEL_SERVICIO_APELACIONES_DSD',
  'SEL_SERVICIO_ESFUERZO_DSD',
  'SERVICIOS2_DSD',
  'SERVICIOS2_RO_DSD',
  'SERVICIOS_ATEM_DSD',
  'SERVICIOS_DSD',
  'SERVICIOS_EMERGENCIA2_DSD',
  'SERVICIOS_EMERGENCIA2_RO_DSD',
  'SERVICIOS_EMERGENCIA_DSD',
  'SERVICIOS_EMERGENCIA_PAR_DSD',
  'SERVICIOS_LOC2_DSD',
  'SERVICIOS_LOC2_RO_DSD',
  'SERVICIOS_LOC_DSD',
  'SERVICIOS_LOV_DSD',
  'SERVICIOS_READ_LOC2_DSD',
  'SERVICIOS_READ_LOC_DSD',
  'SERVICIOS_TBL_DSD',
  'SERVICIOS_TBL_LOV_DSD',
  'SERVICIOS_TBL_ROR_DSD',
  'SERVICIOS_TBL_RO_DSD',
  'SERVICIO_DEDUCCIONES_DSD',
  'SERVICIO_GASTOS_MAIN_RO_DSD',
  'SERVICIO_INGRESOS_DSD',
  'SERVICIO_INGRESO_MAIN_DSD',
  'SERVICIO_PROVEEDORES_DSD',
  'SERVICIO_PROVEEDORES_RO_DSD',
  'SERVICIO_PROVEEDORES_R_DSD',
  'SERVICIO_RECURSOS_DSD',
  'SERVICIO_RECURSO_MAIN_DSD',
  'SERVICIO_TANF_DSD',
  'SERVICIO_TBL_RO_DSD',
  'SERV_AUTOR_DSD',
  'SERV_DIRECCIONES_DSD',
  'SERV_EMER_LOC_DSD',
  'SERV_FAM_INFO_DSD',
  'SERV_INFO_SERV_DSD',
  'SERV_NUCLEO_SERV2_DSD',
  'SERV_NUCLEO_SERV_DSD',
  'SERV_RCLA_DSD',
  'SERV_RECLA_NOPARAM_DSD',
  'SERV_RECLA_UPDATE_DSD',
  'SERV_RETRO_DSD',
  'SERV_SERV_FAM_DSD',
  'SISTEMA_VERIFICA_REFERIDO_DSD',
  'SOLICITADO_POR_LOV_DSD',
  'SOLICITUD_VISITAS_UPD2_DSD',
  'SOLIC_SERV_COMP_FAM_DSD',
  'SOLIC_SERV_COMP_FAM_INFO_DSD',
  'SOLIC_SERV_COMP_FAM_JEFE_FAM_DSD',
  'SOLIC_SERV_COMP_FAM_PROB_FAM_DSD',
  'SOLIC_SERV_VISITAS_PARA_HOY_DSD',
  'SOL_RECONSIDERACION_LOV_DSD',
  'SORBIL_DSD',
  'SORBIL_ROR_DSD',
  'SORBIL_RO_DSD',
  'STATUS_APELACION_LOV_DSD',
  'STATUS_RECLA_LOV_RO_DSD',
  'STATUS_REFERIDO_FRAUDE_LOV_DSD',
  'TANF_60_DSD',
  'TANF_SSA_DSD',
  'TANF_SSTEMP_DSD',
  'TARJETA_REF_DSD',
  'TARJETA_REF_SUB_DSD',
  'TECNICO_DISPONIBLE_DSD',
  'TECNICO_DSD',
  'TECNICO_LOV_DSD',
  'TECNICO_READ_DSD',
  'TECNICO_RECLA_DSD',
  'TECNICO_RESTR_LOV_DSD',
  'TECNICO_ROR_DSD',
  'TECNICO_RO_DSD',
  'TIENE_SERVICIO_ADL_DSD',
  'TIPO_SERV_ATEM_LOV_DSD',
  'TOTAL_CASOS_HIST_60MESES',
  'TRANSFERS_DSD',
  'TRANSFER_CREATE_DSD',
  'TRANSFER_READ_DSD',
  'TRANS_SUM_SERV_READ_DSD',
  'TRAN_FAM_LOV_DSD',
  'TSS_ACCESS_RO_DSD',
  'TSS_ACCESS_UPD_DSD',
  'TSS_RO_DSD',
  'VISTA_APELACIONES_RO_DSD',
  'ZIPCODE_DSD',
  'ZIP_RO_RO_DSD',
  'ZIP_TBL_DSD',
  'ZIP_TBL_LOV_DSD',
  'ZIP_TBL_LOV_FLTR_DSD',
  'ZIP_TBL_ROR_DSD',
  'ZIP_TBL_RO_DSD',
  'ZIP_TBL_SERV_LOV_DSD'
);

objectLists [ "MenuList" ] = new Array 
(
  'MEN',
  'ACEPTA_COMPROMISO_MENU',
  'AD220A1_MENU',
  'AD220B1_MENU',
  'AJUSTE_PAGO_MENSUAL_MENU',
  'AJUSTE_PAG_RPT_B_MENU',
  'AUTORIZAR_DSS108_MENU',
  'AUTORIZAR_DSS171_MENU',
  'AUTORIZAR_ESFU_MENU',
  'AUTORIZAR_PAEX_MENU',
  'AUTORIZAR_RECLA_MENU',
  'AUTORIZAR_RETRO_MENU',
  'BUSCAR_EN_CENTRAL_MENU',
  'CALENDARIZO_CITA_MENU',
  'CASOS_HISTORICOS_MENU',
  'COMPLETAR_TRANSACCION_MENU',
  'COMP_NUCLEO_DETER_MENU',
  'CONFIRMACION_DELECION_CLIENTE_MENU',
  'CONTACTO_CERRAR_MENU',
  'DESEA_ACTUALIZAR_FCH_REG_MENU',
  'DESEA_ACTUALIZAR_RESERVAR_MENU',
  'DESEA_BORRAR_BENE_MENU',
  'DESEA_CAMBIO_SS_MENU',
  'DESEA_CERRAD47_MENU',
  'DESEA_CERRAD_SEGGEST_MENU',
  'DESEA_COMPLETAR_MENU',
  'DESEA_COMPROMISO_PAGO_MENU',
  'DESEA_CONTINUAR_MENU',
  'DESEA_ESTE_CLIENTE_MENU',
  'DESEA_IMPRIMIR_ACCNEG_MENU',
  'DESEA_IMPRIMIR_ADSEF_TANF_10_MENU',
  'DESEA_IMPRIMIR_AE5_MENU',
  'DESEA_IMPRIMIR_AN_3_MENU',
  'DESEA_IMPRIMIR_APEL_MENU',
  'DESEA_IMPRIMIR_BAJAS_MENU',
  'DESEA_IMPRIMIR_CASOS_VENCE24_MENU',
  'DESEA_IMPRIMIR_CASOS_VENCE_MENU',
  'DESEA_IMPRIMIR_CIERRE_MES_MENU',
  'DESEA_IMPRIMIR_CUMPLIERON_18_MENU',
  'DESEA_IMPRIMIR_CUMPLIRAN_18_MENU',
  'DESEA_IMPRIMIR_ESFU_ELEG_MENU',
  'DESEA_IMPRIMIR_FCH_VENCE_MENU',
  'DESEA_IMPRIMIR_INACTIVOS_MENU',
  'DESEA_IMPRIMIR_JUNTAMEDICA_MENU',
  'DESEA_IMPRIMIR_NOTI_CONVICTO_MENU',
  'DESEA_IMPRIMIR_PARTREG_MENU',
  'DESEA_IMPRIMIR_PENDAUTO_MENU',
  'DESEA_IMPRIMIR_PENDLECT_MENU',
  'DESEA_IMPRIMIR_PPT_15_MENU',
  'DESEA_IMPRIMIR_PPT_1A_MENU',
  'DESEA_IMPRIMIR_PPT_1_MENU',
  'DESEA_IMPRIMIR_PPT_4_MENU',
  'DESEA_IMPRIMIR_PPT_5A_MENU',
  'DESEA_IMPRIMIR_PPT_6_MENU',
  'DESEA_IMPRIMIR_REGPAG_MENU',
  'DESEA_IMPRIMIR_SEGGEST_MENU',
  'DESEA_IMPRIMIR_TARREF_MENU',
  'DESEA_IMPRIMIR_TRANS_COPY_MENU',
  'DESEA_MIEMBRO_CERRAD14_MENU',
  'DESEA_MIEMBRO_RECLARETRO_MENU',
  'DESEA_RECHAZ17_MENU',
  'DESEA_RECHAZ30_MENU',
  'DESEA_SEGURO_SOCIAL_SUST_MENU',
  'DETERMINACION_FINAL_MENU',
  'DETERMINAR_RECLA_MENU',
  'IMPRIMIR_AUTO_PAGO_EMER_MENU',
  'IMPRIMIR_BILLETES_MENU',
  'IMPRIMIR_CERT_SERV_MENU',
  'IMPRIMIR_PLAN_RESP_IND_MENU',
  'IMPRIMIR_REGISTRO_APEL_MENU',
  'IMPRIMIR_RESUMEN_SERV_MENU',
  'IMPRIMIR_RETIRO_APEL_MENU',
  'IMPRIMIR_SC776_MENU',
  'IMPRIMIR_SOLICITUD_APEL_MENU',
  'IMPRIMIR_VISTA_APELACIONES_MENU',
  'INFORMES_ESPECIALES_MENU',
  'INFORMES_MAIN_MENU',
  'INFORMES_PTRA_MENU',
  'INTAKE_O_MANTENIMIENTO_MENU',
  'LECTURA_SUPERVISOR_MENU',
  'LLENAR_APELACIONES_MENU',
  'MAIN_MENU_1',
  'MAIN_MENU_10',
  'MAIN_MENU_2',
  'MAIN_MENU_3',
  'MAIN_MENU_4',
  'MAIN_MENU_5',
  'MAIN_MENU_6',
  'MAIN_MENU_7',
  'MAIN_MENU_8',
  'MAIN_MENU_9',
  'MANTENIMIENO_PRINCIPAL_MENU',
  'MANTENIMIENTO_AGENCIAS_MENU',
  'MANTENIMIENTO_AJUSTE_PAN_MENU',
  'MANTENIMIENTO_ASIG_MENU',
  'MANTENIMIENTO_BENEFICIO_PAN_MENU',
  'MANTENIMIENTO_CONTABILIDAD_MENU',
  'MANTENIMIENTO_CUENTA_MENU',
  'MANTENIMIENTO_DEDUCCION_MENU',
  'MANTENIMIENTO_DE_CASOS_MENU',
  'MANTENIMIENTO_FONDO_MENU',
  'MANTENIMIENTO_GAN_BILL_MENU',
  'MANTENIMIENTO_GENERAL_MENU',
  'MANTENIMIENTO_GRANT_MENU',
  'MANTENIMIENTO_INGRESO_MENU',
  'MANTENIMIENTO_MAIN_MENU',
  'MANTENIMIENTO_NOMBRE_GENERAL_MENU',
  'MANTENIMIENTO_NOTIFIC_MENU',
  'MANTENIMIENTO_ORG_MENU',
  'MANTENIMIENTO_PAN_SEG_MENU',
  'MANTENIMIENTO_PLAN_TRABAJO_MENU',
  'MANTENIMIENTO_PROVEEDOR_MENU',
  'MANTENIMIENTO_RECURSO_MENU',
  'MANTENIMIENTO_RMO_MENU',
  'MANTENIMIENTO_SECTOR_MENU',
  'MANTENIMIENTO_SEGURIDAD_MENU',
  'MANTENIMIENTO_SERVICIOS_MENU',
  'MANTENIMIENTO_SERVICIO_DEDU_MENU',
  'MANTENIMIENTO_SERVICIO_ING_MENU',
  'MANTENIMIENTO_SERVICIO_REC_MENU',
  'MANTENIMIENTO_SERV_PROV_MENU',
  'MANTENIMIENTO_SOR_BILL_MENU',
  'MANTENIMIENTO_STATUS_MENU',
  'MANTENIMIENTO_TECNICO_MENU',
  'MANTENIMIENTO_ZIPCODE_MENU',
  'MANT_SERV_MENU',
  'MANT_SERV_MENU_OPCION_RECERTIFICACION',
  'MENU_APELACIONES',
  'NOTIFICACIONES_PRI_MENU',
  'NOTIFICACION_ACCION_NEG_MENU',
  'NOTIFICA_PTRA_MENU',
  'OTRPAG2_MENU',
  'RECAUDA_MAIN_MENU',
  'RECERTIFICACION_MENU',
  'RECHAZAR_ESFU_MENU',
  'RECLA_NOTI_MENU',
  'RECOFI_PRN_MENU',
  'REFERIDO_ESFUERZO_COMPENSADO_MENU',
  'REMOVER_CLIENTE_MENU',
  'REPORT_DSS171_MENU',
  'RESUMEN_SITUACION_MENU',
  'RETROACTIVO_MAIN_MENU',
  'RETRO_NOTI_MENU',
  'SAIC_MENU',
  'SC1035_PRN_MENU',
  'SC1218_PRN_MENU',
  'SC1230_PRN_MENU',
  'SEGURIDAD_TSS_MODULO_MENU',
  'STATUS_REC_RPT_B_MENU',
  'SUB_MENU_9',
  'TECNICO_RECLAMACIONES_MENU',
  'TERMINO_BASE_CORRECTA_MENU',
  'TRANSFER_MENU',
  'VISTA_APELACIONES_MENU'
);


/**
 *
 */
function buildListHtml ( listName )
{
  var list = objectLists [ listName ];
  if ( ! list )
  {
    alert ( "List for name " + listName + " is not defined" );
    return "";
  }

  var html = "<table align=\"left\" style=\"font-family: Verdana,Helvetica,Arial; background-color:white; color:#005080; width: 240px; border:1px solid gray;\">";
  var max  = list.length;
  var listType = list [ 0 ];

  for ( var k = 1; k < max; k ++ )
  { 
    html += "<tr><td align=\"left\"><img src=\"images/circle.png\" onclick=\"showObject ( this, '";
    html += listType;
    html += ":";
    html += list [ k ];
    html += "' );\"/><span class=\"news_text\">";
    html += list [ k ];
    html += "</span></td></tr>";
  }

  html += "</table>";

  return html;
}


/**
 * Uses functions from header.js, messages.js
 *
 */
function init ( )
{
  getMessages ( );
  var frame = getIFrame ( "formFrame" );
  if ( frame )
  {
    getMessageObject ( ).setTarget ( frame );
  }
  else
  {
    alert ( "Form Frame for messages can not be set" );
  }
  selectList ( "DataFormList" );
  setName ( "", false );
}


/**
 *
 */
function debugMessage ( msg )
{
  var area = document.getElementById ( "debugArea" );
  if ( area && msg != null )
  {
    area.value += "\r\n" + msg + "\r\n";
  }
}


/**
 *
 */
function iPrint ( pTarget )
{
  pTarget.focus ( );
  pTarget.print ( );
}


/**
 *
 */
function setButton ( arg )
{
  var mainDiv = document.getElementById ( "buttons_menu" );
  if ( mainDiv )
  {
    for ( var i = 0; i < mainDiv.rows [ 0 ].childNodes.length; i ++ )
    {
      var comp = mainDiv.rows [ 0 ].childNodes [ i ];
      if ( comp && comp.style != null )
      {
        if ( comp.id == "" ) continue;
        if ( arg == 'JDP' )
        {
          comp.style.visibility = 'visible';
        }
        else if ( arg == 'hidden' )
        {
          comp.style.visibility = 'hidden';
        }  
        else
        {
          if ( comp.id != 'Retrieve' && comp.id != 'PrintPage' && comp.id != 'SQL' ) comp.style.visibility = 'hidden';
        }
      }
    }
  }
}


/**
 *
 */
function setName ( objName, flag )
{
  var col = "white";
  var nameDiv = document.getElementById ( "forName" );
  if ( nameDiv ) 
  {
    if ( flag ) 
    {
      col = "#005080";
    }
    else
    {
      objName = "This is for border visibility";
    }
    objName += "     ";
    nameDiv.innerHTML   = objName + "&nbsp;";
    nameDiv.style.color = col;
  }
}


/**
 *
 */
function showObject ( img, objName )
{
  if ( lastClicked && lastClicked.style )
  {
    lastClicked.style.border = "";
    lastClicked.style.color  = "";
    var parentElem = lastClicked.parentNode.childNodes;
    if ( parentElem ) 
    {
      parentElem [ 1 ].style.color = "";
    }
  }

  if ( img && img != null )
  {
    lastClicked = img;
    lastClicked.style.border = "1px solid";
    lastClicked.style.color  = "orange";

    var parentElem = img.parentNode.childNodes;
    if ( parentElem ) 
    {
      parentElem [ 1 ].style.color = '#990033';
    }
  }

  jdpCode = "";
  dsdCode = "";
  menCode = "";

  var realObjName = objName.substring ( 4 );

  if ( objName.indexOf ( "DSD:" ) == 0 )
  {
    dsdCode = realObjName;
    cmd ( "retrieve" );
    setName ( realObjName, true );
    setButton ( "DSD" );
  }
  else if ( objName.indexOf ( "JDP:" ) == 0 )
  {
    jdpCode = realObjName;
    cmd ( "retrieve" );
    setName ( realObjName, true );
    setButton ( "JDP" );
  }
  else if ( objName.indexOf ( "MEN:" ) == 0 )
  {
    menCode = realObjName;
    cmd ( "retrieve" );
    setName ( realObjName, true );
    setButton ( "JDP" );
  }
  else if ( objName.indexOf ( "HEL:" ) == 0 )
  {
    this.getMessageDetails ( realObjName ); 
    setName ( realObjName, true );
    setButton ( "hidden" ); 
  }
  else if ( objName.indexOf ( "ERR:" ) == 0 )
  {
    this.getMessageDetails ( realObjName ); 
    setName ( realObjName, true );
    setButton ( "hidden" ); 
  }
  else if ( objName.indexOf ( "LEG:" ) == 0 )
  {
    this.getMessageDetails ( realObjName ); 
    setName ( realObjName, true );
    setButton ( "hidden" ); 
  }
  else
  {
    alert ( "Invalid object name to be shown: " + objName );
  }
}


/**
 * Uses functions from messages.js
 */
function getMessageDetails ( name )
{
  var pos = name.indexOf ( ":" );
  if ( pos > -1 )
  {
    var id = name.substr ( pos + 1 );
    if ( id )
    {
      showMessage ( id );
    }
  }
}


/**
 *
 */
function cmdA ( elem, commandText )
{
  setSelected ( elem );
  cmd ( commandText );
}



/**
 * Uses functions from header.js
 */
function submitAction ( command )
{
  var doc = getIFrameDocument ( "formFrame" );
  if ( ! doc )
  {
    alert ( "No [document] attribute for the [formFrame] frame" );
    return;
  }

  doc.open ( );
  doc.write ( '<html><body>' );
  doc.write ( '<form id="controlForm" name="controlForm" action="TestServlet.process" method="post">' );
  doc.write ( '<input type="hidden" id="command" name="command" value="' + command + '"/>' );
  doc.write ( '<input type="hidden" id="jdp" name="jdp" value="' + jdpCode + '"/>' );
  doc.write ( '<input type="hidden" id="dsd" name="dsd" value="' + dsdCode + '"/>' );
  doc.write ( '<input type="hidden" id="men" name="men" value="' + menCode + '"/>' );
  doc.write ( '</form></body></html>' );
  doc.close ( );

  var form = doc.getElementById ( "controlForm" );
  if ( form ) form.submit ( );
}


/**
 * Uses functions from header.js
 */
function cmd ( commandText )
{
  var formFrame = getIFrame ( "formFrame" );

  if ( commandText == "QBE" )
  {
    if ( queryMode ) commandText = "QUERY";
    queryMode = ! queryMode;
  }

  if ( commandText == "print" )
  {
    if ( formFrame ) iPrint ( formFrame );
  }
  else
  {
    if ( commandText == 'sqlDebug' ) 
    {
      setName ( "", false );
      if ( lastClicked )
      {
        lastClicked.style.border = "";
        var parentElem = lastClicked.parentNode.childNodes;
        if ( parentElem ) 
        {
          parentElem [ 1 ].style.color = "";
        }
      }
    }
    submitAction ( commandText );
  }
}


/**
 * Uses functions from header.js
 */
function selectList ( listId )
{
  lastClicked = null;
  var target = document.getElementById ( "objectContent" );
  if ( target )
  {
    var html = buildListHtml ( listId );
    if ( html )
    {
      target.innerHTML = "<div>" + html + "</div>";
    }
  }

  var frame = getIFrame ( "formFrame" );
  if ( frame )
  {
    var doc = getIFrameDocument ( "formFrame" );
    if ( doc )
    {
      doc.open ( );
      doc.write ( '<html><head><link rel="stylesheet" href="css/poc.css" type="text/css" /></head><body></body></html>' );
      doc.close ( );
    }
    else
    {
      frame.src = "html/blank.html";
    }
    setName ( "", false );
  }
  else
  {
    alert ( "Unit test preview area [formFrame] is not valid" );
  }

  setButton ( 'JDP' );
}


/**
 *
 */
function openNewWindow ( )
{
  var oldLocation = "" + window.location;
  var newLocation = oldLocation.substring ( 0, oldLocation.indexOf ( "poc.jsp" ) ) + "index.jsp";
  window.open ( newLocation );
}


/**
 *
 */
function setOver ( elem )
{
  if ( elem == null ) return;
  elem.style.border = "ridge 1px #ff9900";
}


/**
 *
 */
function setOut ( elem )
{
  if ( elem == null ) return;
  elem.style.border = "solid 1px orange";
}


/**
 *
 */
function setSelected ( elem )
{
  if ( elem == null ) return;
  elem.style.border = "groove 1px #ff9900";
}


/**
 * Uses functions from header.js
 */
function showHelpOnHelpButtonClick ( )
{
  try 
  {
    var id = 0;
    var frame = getIFrame ( "formFrame" );
    if ( frame.getCurrentHelpId )
    {
      id = frame.getCurrentHelpId ( );
    }
    else
    {
      var doc = getIFrameDocument ( "formFrame" );
      id = doc.getCurrentHelpId ( );
    }
    if ( ! id || id == 0 )
    {
      alert ( "No help is provided for the current object" );
    }
    else
    {
      showMessage ( id );
    }
  }
  catch ( e )
  {
    alert ( "No helps support for the current page" );
  }
}


/**
 * Uses functions from header.js, editorWindow.js
 */
function showEditorOnButtonClick ( )
{
  var id = "";
  try 
  {
    var frame = getIFrame ( "formFrame" ); 
    var doc   = getIFrameDocument ( "formFrame" );
    if ( frame.getCurrentFieldId )
    {
      id = frame.getCurrentFieldId ( );
    }
    else
    {
      id = doc.getCurrentFieldId ( );
    }
    if ( id )
    {
      var elem = doc.getElementById ( id );
      if ( elem )
      {
        openEditorWindow ( id, elem.value );
      }
    }
  }
  catch ( e )
  {
    alert ( e );
  }
}

// -->
</script>

</head>


<body onload="init ( );">

<div id="dhtmltooltip"></div>

<script type="text/javascript" src="js/tooltips.js"></script>

<table id="page" align="center" width="1000px" cellspacing="0" cellpadding="0">
  <tr>
    <td colspan="3">
      <img src="images/BANNER01.gif" width="1000px" height="70px" />
    </td>
  </tr>
  <tr>
  <td  align="left" colspan="3" >
    <table id="buttons_menu" width="100%" height="18px" cellspacing="0" cellpadding="0">
      <tr>
        <td width="10px">
          &nbsp;
        </td>
        <td id="Search" width="3%" align="center" valign="top" style="visibility:visible;">
          <img src="dlfImages/Search.png" style="border:none;" onclick="cmd ( 'QBE' );"
           onMouseover = "ddrivetip ( 'Buscar r&eacute;cord', '#FFFFCC', 110 );";
           onMouseout  = "hideddrivetip ( );"
          />  
        </td>  
        <td id="PageUp" width="3%" align="center" valign="top" style="visibility:visible;">
          <img src="dlfImages/PageUp.png" style="border:none;" onclick="cmd ( 'PREVPAGE' );"
           onMouseover = "ddrivetip ( 'Arriba', '#FFFFCC', 70 );";
           onMouseout  = "hideddrivetip ( );"
          />   
        </td>  
        <td id="PageDown" width="3%" align="center" valign="top" style="visibility:visible;">
          <img src="dlfImages/PageDown.png" style="border:none;" onclick="cmd ( 'NEXTPAGE' );"
           onMouseover = "ddrivetip ( 'Abajo', '#FFFFCC', 70 );";
           onMouseout  = "hideddrivetip ( );"
          /> 
        </td>      
        <td id="Delete" width="3%" align="center" valign="top" style="visibility:visible;">
          <img src="dlfImages/Delete.png" style="border:none;" onclick="cmd ( 'DELINSTANCE' );"
           onMouseover = "ddrivetip ( 'Eliminar r&eacute;cord', '#FFFFCC', 100 );";
           onMouseout  = "hideddrivetip ( );"
          /> 
        </td>      
        <td id="Add" width="3%" align="center" valign="top" style="visibility:visible;">
          <img src="dlfImages/Add.png" style="border:none;" onclick="cmd ( 'ADDINSTANCE' );"
           onMouseover = "ddrivetip ( 'A&ntilde;adir r&eacute;cord', '#FFFFCC', 100 );";
           onMouseout  = "hideddrivetip ( );"
          />
        </td>
        <td id="Update" width="3%" align="center" valign="top" style="visibility:visible;">
          <img src="images/Save.gif" style="border:none;" onclick="cmd ( 'UPDATE' );"
           onMouseover = "ddrivetip ( 'Update', '#FFFFCC', 100 );";
           onMouseout  = "hideddrivetip ( );"
          />
        </td>
        <td id="Enter" width="3%" align="center" valign="top" style="visibility:visible;">
          <img src="dlfImages/Enter.png" style="border:none;" onclick="cmd ( 'FINISH_ACTION' );"
           onMouseover = "ddrivetip ( 'Continuar', '#FFFFCC', 100 );";
           onMouseout  = "hideddrivetip ( );"
          />
        </td>
        <td id="F8" width="3%" align="center" valign="top" style="visibility:visible;">
          <img src="dlfImages/F8.png" style="border:none;" onclick="cmd ( 'QUIT_ACTION' );"
           onMouseover = "ddrivetip ( 'Regresar', '#FFFFCC', 100 );";
           onMouseout  = "hideddrivetip ( );"
          />
        </td>
        <td id="Editor" width="3%" align="center" valign="top" style="visibility:visible;">
          <img src="dlfImages/Editor.png" style="border:none;" onclick="showEditorOnButtonClick ( );"
           onMouseover = "ddrivetip ( 'Text Editor', '#FFFFCC', 100 );";
           onMouseout  = "hideddrivetip ( );"
          />
        </td>      
        <td id="PrintPage" width="3%" align="center" valign="top" style="visibility:visible;">
          <img src="dlfImages/Print.png" style="border:none;" onclick="cmd ( 'print' );"
           onMouseover = "ddrivetip ( 'Imprimir', '#FFFFCC', 70 );";
           onMouseout  = "hideddrivetip ( );"
          />                  
        </td>
        <td id="Help" width="3%" align="center" valign="top" style="visibility:visible;">
          <img src="dlfImages/Help.gif" style="border:none;" onclick="showHelpOnHelpButtonClick ( );"
           onMouseover = "ddrivetip ( 'Help', '#FFFFCC', 70 );";
           onMouseout  = "hideddrivetip ( );"
          />                  
        </td>          
        <td width="62%">
          &nbsp;
        </td>     
        <td id="Retrieve" width="3%" align="center" valign="top" style="visibility:visible;">
          <img src="dlfImages/Refresh.png" style="border:none;" onclick="cmd ( 'retrieve' );"
           onMouseover = "ddrivetip ( 'Refresh', '#FFFFCC', 80 );";
           onMouseout  = "hideddrivetip ( );"
          />
        <td id="ShowDefinition" width="3%" align="center" valign="top" style="visibility:visible;">
          <img src="dlfImages/Definition.gif" style="border:none;" onclick="cmd ( 'showDef' );"
           onMouseover = "ddrivetip ( 'Show Definition', '#FFFFCC', 110 );";
           onMouseout  = "hideddrivetip ( );"
          />
        </td>
        <td id="ShowJDPDebug" width="3%" align="center" valign="top" style="visibility:visible;">
          <img src="dlfImages/JDP.gif" style="none;" onclick="cmd ( 'jdpDebug' );"
           onMouseover = "ddrivetip ( 'Show JDP Debug', '#FFFFCC', 110 );";
           onMouseout  = "hideddrivetip ( );"
          />
        </td>
        <td id="SQL" width="3%" align="center" valign="top" style="visibility:visible;">
          <img src="dlfImages/Sql.gif" style="border:none;" onclick="cmd ( 'sqlDebug' );"
           onMouseover = "ddrivetip ( 'SQL Debug', '#FFFFCC', 80 );";
           onMouseout  = "hideddrivetip ( );"
          />
        </td>
       <td width="10px">
          &nbsp;
        </td>
      </tr>
    </table>
  </td>  
  </tr>
  <tr>
    <td colspan="3" style="font-size: 3px;"> &nbsp;
    </td>
  </tr> 
</table>
<table align="center" width="940px" cellspacing="0" cellpadding="0"> 
  <tr>
    <td align="center" valign="top" style="width:230px; background-color:#ffffcc; border:1px solid orange; height:480px;">
        <table width="230px;" border="0" cellspacing="0" cellpadding="0" >
          <tr>
            <td align="center" style="height:24px; background-image: url(images/DLFTemporaryHeader2.gif); background-repeat:repeat;"> 
              <span class="title_panel">
                <select onChange="selectList ( this.value );" style="width:190px; height:20px; font:12px Arial; color:#005080;">
                  <option value="DataFormList">Data Forms</option>
                  <option value="FormatFormList">Format Forms</option>
                  <option value="LOVFormList">LOV Forms</option>
                  <option value="DSDList">DSDs</option>
                  <option value="MenuList">Menus</option>
                  <option value="ErrorList">Errors</option>
                  <option value="HelpList">Helps</option>
                  <option value="LegendList">Legends</option>
                </select>
              </span>
            </td>
          </tr>
          <tr>
            <td style="font-size: 6px;">&nbsp;
            </td>
          </tr>
          <tr>
            <td align="center">
              <div id="objectContent" style="border:5px solid #ffffcc; width: 215px; height: 465px; OVERFLOW: auto; color:#005080;"></div>
           </td>
          </tr>
        </table>
    </td>
    <td style="width: 20px; font-size: 3px;">&nbsp;
    </td>
    <td valign="top" style="width:700px; height:480px;">
      <table width="692px" cellspacing="0" cellpadding="0">
        <tr>
          <td width="400px" style="border-top:orange 1px solid; border-right:orange 1px solid; border-left:orange 1px solid; border-bottom:none;  background-image: url(images/DLFTemporaryHeader2.gif); background-repeat:no-repeat; text-align: right; overflow:hidden; height: 24px; color:#005080; font-family: Verdana, Arial, Helvetica, sans-serif; font-size: 12px;">
            <div id="forName">
              &nbsp;
            </div>
          </td>
          <td width="292px" align="center" valign="top" style="border-bottom:orange 1px solid; color:#005080; font-family: Verdana, Arial, Helvetica, sans-serif; font-size: 15px;">
            <b>SAIC - Unit Test</b>
          </td>
        </tr>
        <tr>
          <td colspan="2" style="height:480px; border-top:none; border-right:orange 1px solid; border-left:orange 1px solid; border-bottom:orange 1px solid;">
            <iframe name="formFrame" frameborder="0" id="formFrame" src="html/blank.html" style="width:690px; height:480px;border:none;"></iframe>
          </td>
        </tr>
      </table>    
    </td>
  </tr>
</table>

<div id="helpText" style="visibility:hidden; display:none;"></div>


<form id="debugForm">

<table width="780px">

<tr><td align="center" style="vertical-align:top; ">

<img src="images/Save.gif"   onclick="if ( window.clipboardData ) clipboardData.setData ( 'Text', document.getElementById ( 'debugArea' ).value ); else alert ( 'Only IE can copy to clipboard' );" />

<img src="images/Delete.gif" onclick="document.getElementById ( 'debugArea' ).value = '';" />

<img src="images/circle.png" onclick="doAppRequest ( 'command=debugStack' );"/>

<input id="debugGlobaVar" style="width:150px; height:16px; border:1px solid orange;" />

<img src="images/circle.png" onclick="doAppRequest ( 'command=debugGlobals&gblname=' + document.getElementById ( 'debugGlobaVar' ).value );"/>

</td></tr>

<tr><td align="center" style="vertical-align:top; ">
<textarea id="debugArea" style="width:790px; height:100px; border:1px solid orange;"></textarea>
</td></tr>

</table>

</form>



</body>

</html>
