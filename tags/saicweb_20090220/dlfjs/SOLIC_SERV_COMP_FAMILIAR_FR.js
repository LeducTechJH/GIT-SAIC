/**
 *
 * "ZIP_CODE1.0.0"
 * "ZIP_CODE_41.0.0"
 */
 /*
function showCESI ( )
{

  var ssn = "";
  var element = document.getElementById ( "SEGURO_SOCIAL_JEFE_FAM0.0" );
  if ( element ) ssn = element.value;
  var url = "http://10.200.15.23/cesi2008/DialogoConsulta.aspx?S=" + ssn.replace(/-/gi, "");

  //window.open ( url, null, "width=640,height=420,toolbar=yes,location=yes,directories=yes,status=yes,menubar=yes,scrollbars=yes,copyhistory=yes,resizable=yes" );
  var winTop = 100;
  var winLeft = 150;
  window.open ( url, null, "top=" + winTop + ", left=" + winLeft + ", height=420,width=420, titlebar=no, menubar=no, resizable=yes, status=no, toolbar=no, scrollbars=yes" );
}
*/

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
  button.style.visibility = "visible";
  button.style.display = "block";
  button.value = name;
  button.onclick = onclick;

  form.appendChild ( button );
}

function showMap1 ( )
{
  var element;
  var city = "";
  var state = "";

  element = document.getElementById ( "CIUDAD.0.0" );
  if ( element ) city = element.value;
  element = document.getElementById ( "ESTADO.0.0" );
  if ( element ) state = element.value;

  var url = "html/map.html?location=" + city + "," + state;
  //alert ( url );
  var winTop = 100;
  var winLeft = 150;
  window.open ( url, null, "top=" + winTop + ", left=" + winLeft + ", height=420,width=420, titlebar=no, menubar=no, resizable=no, status=no, toolbar=no" );
}

/**
 *
 */
function setReadonly ( id )
{
  var elem = document.getElementById ( id );
  if ( elem )
  {
    elem.readOnly = true;
    elem.setAttribute ( "readonly", true );
  }
}


/**
 * Overrides the empty function in jdp.js
 */
function afterInit ( )
{
  //var form = document.getElementById ( "SOLIC_SERV_COMP_FAMILIAR_FR" );
  //createButton ( form, 0, "Consulta CESI", 273, 96, showCESI );

  var parent = document.getElementsByTagName ( 'BODY' ) [ 0 ];
  var button = document.createElement ( "img" );
  button.id = "mapButton1";
  button.src = "images/wi0064-32.gif";
  button.style.left = "535px";
  button.style.top  = "140px";
  parent.appendChild ( button );
  button.style.visibility = "visible";
  button.style.display = "block";

  button = document.getElementById ( "mapButton1" );
  button.onclick = showMap1;

  setMaximum ( "SEGURO_SOCIAL_JEFE_FAM0", "999999999" );

  var element = document.getElementById ( "SEGURO_SOCIAL_JEFE_FAM0.0" );
  if ( element )
  {
    element.onkeydown = numericOnKeyDown;
    element.onkeyup   = numericOnKeyUp;
  }

  setArrowField ( "PARK", "-->" );

  for ( var k = 0; k < 20; k ++ )
  {
    var inst = ".0." + k;
    var instance = document.getElementById ( "COMP_FAMILIAR_GP" + inst );
    if ( instance )
    {
      var rowState = instance.value;
      if ( rowState != "New" && rowState != "NewModified" )
      {
        setReadonly ( "SEGURO_SOCIAL_CLIENTE" + inst );
        setReadonly ( "NOMBRE_COMPLETO" + inst );
        setReadonly ( "COD_PARENTESCO_FAM" + inst );
        setReadonly ( "DSC_PARENTESCO_FAM" + inst );
        setReadonly ( "EDAD" + inst );
      }
    }
    else
    {
      break;
    }
  }
}


/**
 * Overrides the empty function in jdp.js
 */
function applicationPreEventHandler ( eventCode )
{
  if ( eventCode == "FINISH_ACTION" )
  {
    var panelObject = null;
    if ( objectInFocus != null )
    {
      panelObject = model.getInDepth ( objectInFocus.name );
    }
    if ( panelObject == null || ! panelObject ) return false;

    if ( panelObject.name == "PARK" || panelObject.name == "SEGURO_SOCIAL_CLIENTE" )
    {
      var index = objectInFocus.name.indexOf ( "." );
      var inst = objectInFocus.name.substring ( index );
      var ssn = document.getElementById ( "SEGURO_SOCIAL_CLIENTE" + inst );
      if ( ssn ) // if ( ssn && ssn.value == "" )      
      {
        var group = panelObject.container;
        if ( group )
        {
          var instance = document.getElementById ( group.name + inst );
          if ( instance )
          {
            var rowState = instance.value;
            if ( rowState == "New" || rowState == "NewModified" )
            {
              doAppRequest ( "appCommand=FNEXT&command=JDPEVENT&event=" + prepareCommand ( "BEFORELEAVE", ssn, model.getInDepth ( "SEGURO_SOCIAL_CLIENTE" ) ) );
              return true;
            }
          }
        }
      }
    }

    var cmd = prepareCommand ( eventCode, objectInFocus, panelObject );
    if ( validate ( ) ) doAppRequestCommand ( cmd );
    return true;
  }

  return false;
}
