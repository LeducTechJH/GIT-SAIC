document.write ( '<script language="JavaScript" src="js/header.js"></script>\r\n' );

disableNotFocused = true;

/**
 * Overrides the empty function in jdp.js
 */
function afterInit ( )
{
  var fields = new Array ( );
  var k = 0;
  fields [ k ++ ] = "SEGURO_SOCIAL_JEFE_FAM1.0";
  fields [ k ++ ] = "SEGURO_SOCIAL_JEFE_SERV.0.0";
  fields [ k ++ ] = "SEGURO_SOCIAL_ADMN.0.0";
  fields [ k ++ ] = "SEGURO_SOCIAL_REPRE.0.0";
  
  for ( var m = 0; m < 10; m ++ )
  {
    fields [ k ++ ] = "SEGURO_SOCIAL_BENEFICIARIO.0.0." + m;
  }

  for ( k = 0; k < fields.length; k ++ )
  {
    var element = document.getElementById ( fields [ k ] );
    if ( element )
    {
      element.onkeydown = numericOnKeyDown;
      element.onkeyup   = numericOnKeyUp;
    }
  }

  for ( k = 0; k < 5; k ++ )
  {
    var index = fields [ k ].indexOf ( "." );
    if ( index > 0 ) fields [ k ] = fields [ k ].substring ( 0, index );
    setMinimum ( fields [ k ], "1" );
    setMaximum ( fields [ k ], "999999999" );
  }

  setArrowField ( "NUCLEO_PARK", "-->" );
}


/**
 * Overrides the empty function in jdp.js
 * 
 * Occurs just at the start of the focusField ( ) 
 * function in jdp.js ( "onfocus" event handler ).
 */
/**
function preFocusField ( obj )
{
  if ( obj == null || ! obj ) return false;

  var field = model.getInDepth ( obj.name );
  if ( field && field.name == "SEGURO_SOCIAL_BENEFICIARIO" )
  {
    var group = field.container;
    if ( group )
    {
      var index = obj.name.indexOf ( "." );
      var instPath = "";
      if ( index > 0 ) instPath = obj.name.substring ( index );
      var instance = document.getElementById ( group.name + instPath );
      if ( instance )
      {
        var rowState = instance.value;
        if ( rowState != "New" && rowState != "NewModified" )
        {
          if ( objectInFocus ) 
          {
            var ind = objectInFocus.name.indexOf ( "." );
            var insPath = "";
            if ( ind > 0 ) insPath = objectInFocus.name.substring ( 0, ind );
            if ( insPath == "NUCLEO_PARK" )
            {
              var cod_parent = document.getElementById ( "COD_PARENTESCO_RELACION_SERV" + instPath );
              if ( cod_parent )
              {
                cod_parent.focus ( );
              }
              else
              {
                objectInFocus.focus ( );
              }
            }
            else
            {
              objectInFocus.focus ( );
            }
          }
          return true;
        }
      }
    }
  }

  return false;
}
 */


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
  //if ( ! getElementExist ( 'MANT_ACCION_SERV_COPY.0' ) )
  //{
    //window.setTimeout ( "setField ( 'SEGURO_SOCIAL_JEFE_FAM1.0' );", 300 );
    //return;      
  //}
  //firstObject ( );        
/**
  var value = getElementValue ( "FLG_AEC_CLAS.0.0" ); 
  if ( value == "+" )
  {
    window.setTimeout ( "setField ( 'ID_TECNICO.0.0' );", 300 );
    return;
  }
  else if ( value == "-" )
  {
	window.setTimeout ( "setField ( 'SEGURO_SOCIAL_JEFE_SERV.0.0' );", 300 );
	return;      
  }
  else
  {
	window.setTimeout ( "setField ( 'SEGURO_SOCIAL_JEFE_FAM1.0' );", 300 );
	return;      
  }
 */
  window.setTimeout ( "setField ( 'SEGURO_SOCIAL_JEFE_FAM1.0' );", 300 );
  return;      
}

/**
 * replaces the definition in jdp.js
 */
function nextObject ( obj )
{
  var objName = "";
  
  var current = obj.name;
  //alert( current );
  //setElementValue ( "FLG_AEC_CLAS.0.0", "+" );

  if  ( current == "SEGURO_SOCIAL_JEFE_FAM1.0" )
  {
    objName = "SEGURO_SOCIAL_JEFE_SERV.0.0";
  }
  else if  ( current == "SEGURO_SOCIAL_JEFE_SERV.0.0" )
  {
    objName = "COD_SERVICIO.0.0";
  }
  else if ( current == "COD_SERVICIO.0.0" )
  {
	var value = getElementValue ( current ); 
    if ( value.substring ( 0, 3  ) == "PAN" )
    {
      objName = "ID_TECNICO.0.0";
    }
    else
    {
      objName = "FLG_AEC_CLASSI.0.0";
    }
  }
  else if ( current == "FLG_AEC_CLASSI.0.0" )
  {
    objName = "ID_TECNICO.0.0";
  }
  else if ( current == "ID_TECNICO.0.0" )
  {
    objName = "FCH_SOLICITUD.0.0";
  }
  else if ( current == "FCH_SOLICITUD.0.0" )
  {
	objName = PANE_COND ( );
  }
  else if ( current == "COD_RAZON_EMERGENCIA.0.0" )
  {
    objName = "SEGURO_SOCIAL_ADMN.0.0";
  }
  else if ( current == "SEGURO_SOCIAL_ADMN.0.0" )
  {
    objName = "PATERNO_ADMN.0.0";
  }
  else if ( current == "PATERNO_ADMN.0.0" )
  {
    objName = "MATERNO_ADMN.0.0";
  }
  else if ( current == "MATERNO_ADMN.0.0" )
  {
    objName = "NOMBRE_ADMN.0.0";
  }
  else if ( current == "NOMBRE_ADMN.0.0" )
  {
    objName = "INICIAL_ADMN.0.0";
  }
  else if ( current == "INICIAL_ADMN.0.0" )
  {
    objName = "SEGURO_SOCIAL_REPRE.0.0";
  }
  else if (current == "SEGURO_SOCIAL_REPRE.0.0")
  {     
    objName = "PATERNO_REPRE.0.0";
  }
  else if (current == "PATERNO_REPRE.0.0")
  { 
    objName = "MATERNO_REPRE.0.0";
  }
  else if (current == "MATERNO_REPRE.0.0")
  { 
    objName = "NOMBRE_REPRE.0.0";
  }
  else if (current == "NOMBRE_REPRE.0.0")
  { 
    objName = "INICIAL_REPRE.0.0";
  }
  else if (current == "INICIAL_REPRE.0.0")
  { 
    objName = "DSC_DIRECCION_1.0.0.0";
  }
  else if (current == "DSC_DIRECCION_1.0.0.0")
  {
    objName = "DSC_DIRECCION_2.0.0.0";
  }
  else if (current == "DSC_DIRECCION_2.0.0.0")
  {
    objName = "CIUDAD_VAR.0.0.0";
  }
  else if (current == "CIUDAD_VAR.0.0.0")
  {
    objName = "ZIP_CODE_4.0.0.0";
  }
  else if (current == "ZIP_CODE_4.0.0.0")
  {
    objName = "NUCLEO_PARK.0.0.0";
  }
  else
  {
    var index = current.indexOf ( "." );
    if ( index > 0 ) 
    {
      var fldName = current.substring ( 0, index );
      var instPath = current.substring ( index );
      if ( fldName == "NUCLEO_PARK" )
      {
	    objName = "SEGURO_SOCIAL_BENEFICIARIO" + instPath;
      }
      else if ( fldName == "SEGURO_SOCIAL_BENEFICIARIO" )
      {
  	    objName = "COD_PARENTESCO_RELACION_SERV" + instPath;
      }
      else if ( fldName == "COD_PARENTESCO_RELACION_SERV" )
      {
    	var last_char = parseInt(instPath.charAt(instPath.length-1))+1;
    	var newStr = instPath.substring(0, instPath.length-1);
  	    objName = "NUCLEO_PARK" + newStr + last_char;
      }
    }
  }  
  
  if ( objName.length > 0 )
  {
    notifyAppRequestCommand ( "FNEXT" );
    window.setTimeout ( "setField ( '" + objName + "' );", 200 );
  }
}

/**
 * 
 */
function PANE_COND ( )
{
  var value = getElementValue ( "COD_SERVICIO.0.0" ); 

  if ( value.substring ( 0, 4  ) == "PANE" )
  {
    return "COD_RAZON_EMERGENCIA.0.0";
  }
  else
  {
    return "SEGURO_SOCIAL_ADMN.0.0";
  }
}

/**
 * 
 */
function PANE_COND_PREV ( )
{
  var value = getElementValue ( "COD_SERVICIO.0.0" ); 

  if ( value.substring ( 0, 4  ) == "PANE" )
  {
    return "COD_RAZON_EMERGENCIA.0.0";
  }
  else
  {
    return "FCH_SOLICITUD.0.0";
  }
}


/**
 * replaces the definition in jdp.js
 */
function prevObject ( obj )
{
  var objName = "";
	  
  var current = obj.name;
  //alert( current );
  //setElementValue ( "FLG_AEC_CLAS.0.0", "-" );

  if  ( current == "SEGURO_SOCIAL_JEFE_SERV.0.0" )
  {
    objName = "SEGURO_SOCIAL_JEFE_FAM1.0";
  }
  else if  ( current == "COD_SERVICIO.0.0" )
  {
    objName = "SEGURO_SOCIAL_JEFE_SERV.0.0";
  }
  else if ( current == "FLG_AEC_CLASSI.0.0" )
  {
    objName = "COD_SERVICIO.0.0";
  }
  else if ( current == "ID_TECNICO.0.0" )
  {
    var value = getElementValue ( "COD_SERVICIO.0.0" ); 
    if ( value.substring ( 0, 3  ) == "PAN" )
    {
      objName = "COD_SERVICIO.0.0";
    }
    else
    {
      objName = "FLG_AEC_CLASSI.0.0";
    }
  }
  else if ( current == "FCH_SOLICITUD.0.0" )
  {
    objName = "ID_TECNICO.0.0";
  }
  else if ( current == "SEGURO_SOCIAL_ADMN.0.0" )
  {
	objName = PANE_COND_PREV ( );
  }
  else if ( current == "COD_RAZON_EMERGENCIA.0.0" )
  {
    objName = "FCH_SOLICITUD.0.0";
  }
  else if ( current == "PATERNO_ADMN.0.0" )
  {
    objName = "SEGURO_SOCIAL_ADMN.0.0";
  }
  else if ( current == "MATERNO_ADMN.0.0" )
  {
    objName = "PATERNO_ADMN.0.0";
  }
  else if ( current == "NOMBRE_ADMN.0.0" )
  {
    objName = "MATERNO_ADMN.0.0";
  }
  else if ( current == "INICIAL_ADMN.0.0" )
  {
    objName = "NOMBRE_ADMN.0.0";
  }
  else if ( current == "SEGURO_SOCIAL_REPRE.0.0" )
  {
    objName = "INICIAL_ADMN.0.0";
  }
  else if (current == "PATERNO_REPRE.0.0")
  {     
    objName = "SEGURO_SOCIAL_REPRE.0.0";
  }
  else if (current == "MATERNO_REPRE.0.0")
  { 
    objName = "PATERNO_REPRE.0.0";
  }
  else if (current == "NOMBRE_REPRE.0.0")
  { 
    objName = "MATERNO_REPRE.0.0";
  }
  else if (current == "INICIAL_REPRE.0.0")
  { 
    objName = "NOMBRE_REPRE.0.0";
  }
  else if (current == "DSC_DIRECCION_1.0.0.0")
  { 
    objName = "INICIAL_REPRE.0.0";
  }
  else if (current == "DSC_DIRECCION_2.0.0.0")
  {
    objName = "DSC_DIRECCION_1.0.0.0";
  }
  else if (current == "CIUDAD_VAR.0.0.0")
  {
    objName = "DSC_DIRECCION_2.0.0.0";
  }
  else if (current == "ZIP_CODE_4.0.0.0")
  {
    objName = "CIUDAD_VAR.0.0.0";
  }
  else if (current == "NUCLEO_PARK.0.0.0")
  {
    objName = "ZIP_CODE_4.0.0.0";
  }
  else
  {
    var index = current.indexOf ( "." );
    if ( index > 0 ) 
    {
      var fldName = current.substring ( 0, index );
      var instPath = current.substring ( index );
      if ( fldName == "SEGURO_SOCIAL_BENEFICIARIO" )
      {
	    objName = "NUCLEO_PARK" + instPath;
      }
      else if ( fldName == "COD_PARENTESCO_RELACION_SERV" )
      {
  	    objName = "SEGURO_SOCIAL_BENEFICIARIO" + instPath;
      }
      else if ( fldName == "NUCLEO_PARK" )
      {
    	var last_char = parseInt(instPath.charAt(instPath.length-1))-1;
    	var newStr = instPath.substring(0, instPath.length-1);
  	    objName = "COD_PARENTESCO_RELACION_SERV" + newStr + last_char;
      }
    }
  }  
  
  if ( objName.length > 0 )
  {
    notifyAppRequestCommand ( "FPREV" );
    window.setTimeout ( "setField ( '" + objName + "' );", 200 );
  }
}
