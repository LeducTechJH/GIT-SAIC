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

//***** START MODS BY J. OLMEDA - 8/13/2010 *****
  var names = new Array ( );
  k = 0;

  //names [ k ++ ] = "Representante";
  //names [ k ++ ] = "Dir. Servicio";

  var element = document.getElementById ( "COD_SERVICIO.0.0" );

  if ( element ) codServicio = element.value;
  if ( codServicio == "AE-C" )
  {
	//***** J. Olmeda - 12/16/2010
	//names [ k ++ ] = "Encargada(o) de los Menores";
	//names [ k ++ ] = "Reporte del P/M Ausente";
	element = document.getElementById ( "FLG_AEC_CLASSI.0.0" );

	//Create the panel object so we can reverse the disabling of the input field FLG_AEC_CLASSI.0.0.
	var panelObject = model.getInDepth ( element.name );

	if ( element )
	{
		//Enable the panel object
		panelObject.enabled = true;
		//Change back the panel object to JDataPanel Type. This will re-enable list of value functionality.
		panelObject.editManager.name = "JDataPanel";
		//Set the readonly flag of the object to false so it can be modified.
		element.setAttribute ( "readonly", false );
		//Make the element visible
		element.style.visibility="visible";
		//Paint the border with the list of value color.
		element.style.borderColor="#F000F0";
	}
	element = document.getElementById ( "DSC_AEC_CLAS.0.0" );
	if ( element )
	{
	  //element.style.visibility="visible";
	  element.readOnly = false;
	  element.setAttribute ( "readonly", false );
	}
  }
  else
  {
	element = document.getElementById ( "FLG_AEC_CLASSI.0.0" );
	if ( element ) element.style.visibility="hidden";
	element = document.getElementById ( "DSC_AEC_CLAS.0.0" );
	if ( element ) element.style.visibility="hidden";
  }

  if ( codServicio.substring ( 0, 4  ) == "PANE" )
  {
	element = document.getElementById ( "SERV_INFO_GP_TXT__91.0.0" );
	if ( element )
	{
	  element.style.visibility="visible";
	}
	element = document.getElementById ( "COD_RAZON_EMERGENCIA.0.0" );
	if ( element )
	{
	  element.style.visibility="visible";
	}
  }
  else
  {
	element = document.getElementById ( "SERV_INFO_GP_TXT__91.0.0" );
	if ( element )
	{
	  element.style.visibility="hidden";
	}
	element = document.getElementById ( "COD_RAZON_EMERGENCIA.0.0" );
	if ( element )
	{
	  element.style.visibility="hidden";
	}
  }

  var form = document.getElementById ( "SERV_NUCLEO_SERV_FRM" );
  var x = 3;

  for ( k = 0; k < names.length; k ++ )
  {
    x = createButton ( form, k, names [ k ], x, 450, buttonOnClick );
  }
  //***** END MODS BY J. OLMEDA - 8/13/2010 *****

	element = document.getElementById ( "ID_TECNICO.0.0" );
	if ( element )
	{
	  //element.style.visibility="visible";
	  element.readOnly = true;
	  element.setAttribute ( "readonly", true );
	}

}


/**
 * Overrides the empty function in jdp.js
 *
 * Occurs just at the start of the focusField ( )
 * function in jdp.js ( "onfocus" event handler ).
 */
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

/**
*
*/
function createButton ( form, index, name, x, y, onclick )
{
 var button = document.createElement ( "input" );
 button.id    = "button" + index;
 button.name  = name;
 button.type  = "button";
 button.style.position = "absolute";
 button.style.left = "" + x + "px";
 button.style.top = "" + y + "px";
 var w = name.length * 7.2 + 13;
 button.style.width = "" + w + "px";
 button.style.height = "22px";
 button.style.align = "center";
 button.style.textalign = "center";
 button.style.background = "#BBCCDD";
 button.style.fontFamily = "Arial";
 button.style.fontSize = "12px";
 button.style.borderWidth = "2px";
 button.style.borderTopColor = "#DDEEFF";
 button.style.borderLeftColor = "#DDEEFF";
 button.style.borderRightColor = "#778899";
 button.style.borderBottomColor = "#778899";
 button.value = name;
 button.onclick = buttonOnClick;

 form.appendChild ( button );

 button.style.visibility = "visible";
 button.style.display = "block";

 return x + w + 3;
}


/**
 *
 */
function buttonOnClick ( )
{
  var request = "command=appAction&action=UpdateForm;";

  switch ( this.id )
  {
/*    case "button0":
    {
      doAppRequest ( request + "REPRESENTANTE_SERV_FR_PKT" );
      break;
    }
    case "button1":
    {
      doAppRequest ( request + "DIR_SERV_FR_PKT" );
      break;
    } */
    case "button0":
    {
      doAppRequest ( request + "PADRE_AUSENTE_PERS_ENCARGADA_FRM_PKT" );
      break;
    }
    //case "button1":
    //{
    //  doAppRequest ( request + "ADSEF_106_ADL" );
    //  break;
    //}
  }
}
