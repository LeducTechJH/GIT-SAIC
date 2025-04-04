document.write ( '<script src="js/set-phone-mask.js" type="text/javascript" charset="utf-8"></script>\r\n' );

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
 * Overrides the empty function in jdp.js
 *   <button name="Button_0" tag="" visible="true" enabled="true" container="GET_SSN_FR" nextobject="" objectType="button" pageStart="-1" pageType="0" forecolor="128" backcolor="12632256" border="0" x="47" y="70" width="87" height="29" alignment="0" fontfamily="Arial" fontsize="11" righttoleft="false" style="plain" text="sdsdgdssd" anchorObjectNameHorizontal="" anchorTypeHorizontal="0" anchorObjectNameVertical="" anchorTypeVertical="0" autosizeheight="false" autosizewidth="false" moveable="false" movex="0" movey="0" resizeable="false" stretchx="0" stretchy="0" actiontype="0" disabledpath="" enabledpath="" noprocessing="false" comment=""/>
 */
function afterInit ( )
{
  var names = new Array ( );
  var k = 0;

  names [ k ++ ] = "Sanciones";
  names [ k ++ ] = "Recursos";
  names [ k ++ ] = "Ingresos";
  names [ k ++ ] = "Gastos";
  names [ k ++ ] = "Documentos";
  names [ k ++ ] = "Empleo";
  names [ k ++ ] = "Antecedentes";
  names [ k ++ ] = "Agencias";
//  names [ k ++ ] = "P/M Ausente";

  var element = document.getElementById ( "COD_PARENTESCO_FAM.0" );
  if ( element ) codParentesco = element.value;
  if ( codParentesco == "PMAU" )
  {
    names [ k ++ ] = "P/M Ausente";
  } 
  
  var form = document.getElementById ( "INFOR_BIO_FRM" );
  var x = 3;

  for ( k = 0; k < names.length; k ++ )
  {
    x = createButton ( form, k, names [ k ], x, 520, buttonOnClick );
  }
}

/**
 * 
 */
function buttonOnClick ( )
{
  var planMedico = document.getElementById ( "NOMBRE_PLAN_MEDICO.0" );
  if ( planMedico )
  {
    if ( planMedico.style.visibility == "visible" )
    {
      //alert ( "NOMBRE_PLAN_MEDICO.0 is visible" );
    }
    else 
    {
      //alert ( "Estas funciones estan disponible desde la segunda pantalla de Información Biográfica." );
      //return;
    }
  }

  var request = "command=appAction&action=UpdateForm;";

  switch ( this.id )
  {
    case "button0":
    {
      doAppRequest ( request + "DESCALIFICADOS_CLIENTES_PKT" );
      break;
    }
    case "button1":
    {
      doAppRequest ( request + "RECURSOS_CLIENTES_FR_PKT" );
      break;
    }
    case "button2":
    {
      doAppRequest ( request + "INGRESOS_CLIENTES_FR_PKT" );
      break;
    }
    case "button3":
    {
      doAppRequest ( request + "GASTOS_CLIENTES_FR_PKT" );
      break;
    }
    case "button4":
    {
      doAppRequest ( request + "EMPLEOS_CLIENTE_PKT" );
      break;
    }
    case "button5":
    {
      doAppRequest ( request + "PTRA_CLIENTE_PKT" );
      break;
    }
    case "button6":
    {
      doAppRequest ( request + "ANTECEDENTE_CLIENTE_UPDATE_PKT" );
      break;
    }
    case "button7":
    {
      doAppRequest ( request + "AGENCIAS_CLIENTES_FR_PKT" );
      break;
    }
    case "button8":
    {
      doAppRequest ( request + "PADRE_MADRE_AUSENTE_CLIENTE_PKT" );
      break;
    }
  }
}
/*
document.write ( '<script language="javascript" charset="utf-8">\r\n' );
document.write ( '  $(document).ready(function() {\r\n' );
document.write ( '    $("input[id*=TELEFONO]").setMask();\r\n' );
//document.write ( '    $("input[id*=TELEFONO]").mask("(999) 999-9999");\r\n' );
document.write ( '  })\r\n' );
document.write ( '</script>\r\n' );
*/
