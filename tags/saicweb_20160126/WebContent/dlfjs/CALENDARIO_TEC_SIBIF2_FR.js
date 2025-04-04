/**
 *
 * Jorge Olmeda 5/10/2011
 * KPG INC.
 */

/**
 * Overrides the empty function in jdp.js
 */
function afterInit ( )
{
  var form = document.getElementById ( "CALENDARIO_TEC_SIBIF2_FR" );
  //var formFrame = getIFrame ( "formFrame" );
  //formFrame.doAppRequest ( 'command=lastMenu' );
  //createButton ( form, 0, "SIBIF #2", 223, 96, showCalendar );
//}
 
//function showCalendar ( )
//{

  var tecnico = "";
  var element = document.getElementById ( "COD_SEGURIDAD" );
  if ( element ) tecnico = element.value;
  var token = "";
  element = document.getElementById ( "SIBIF_TOKEN" );
  if ( element ) token = element.value;
  var url = "http://10.201.11.3/sisca/SaiCRedircet.aspx?param1=" + token + "&param2=" + tecnico;

  //window.open ( url, null, "width=640,height=420,toolbar=yes,location=yes,directories=yes,status=yes,menubar=yes,scrollbars=yes,copyhistory=yes,resizable=yes" );
  var winTop = 100;
  var winLeft = 150;
  var winHeight =(screen.availHeight - 122).toString();
  var winWidth = (screen.availWidth - 10).toString();
  //window.open ( url, null, "top=" + winTop + ", left=" + winLeft + ", height=420,width=420, titlebar=no, menubar=no, resizable=yes, status=no, toolbar=no, scrollbars=yes" );
  window.open ( url, null, "top=0, left=0, height=winHeight, width=winWidth, titlebar=no, menubar=no, resizable=yes, status=no, toolbar=no, scrollbars=yes" );
  //window.open ( url, null, "top=" + winTop + ", left=" + winLeft + ", height=420,width=420, titlebar=yes, menubar=yes, resizable=yes, status=yes, toolbar=yes, scrollbars=yes" );
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
  button.style.visibility = "visible";
  button.style.display = "block";
  button.value = name;
  button.onclick = onclick;

  form.appendChild ( button );
}
