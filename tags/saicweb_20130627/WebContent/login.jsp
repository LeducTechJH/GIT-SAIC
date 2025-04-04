<%@ page import="java.util.*"%>
<%@ page import="net.maintrend.util.*" %>
<%
String conString = Configuration.getInstance ( ).get ( "ConnectionString" );

conString = conString.toUpperCase ( );

String message = "";
if ( conString.indexOf ( "SAICWPRD" ) >= 0 )
{
	message = "<div style=\"width:70%; font:20px; aligh:center;\"><b>RECORDATORIO: <font color=red>AL ACCEDER ESTE SISTEMA, USTED ESTARÁ APLICANDO CAMBIOS A DOCUMENTOS OFICIALES</font></b><div> </br> <b><font color=red>EL AJUSTE PORCENTUAL DEL MES DE JULIO 2013 ES DE 0.2129. </b></br><b><font color=red>LA FECHA DE CORTE PARA CASOS DE SUBSIDIO DE ENERGIA ES EL 28 DE JUNIO DEL 2013. </b>";
}
%>
<html>

<head>

<meta name="author" content="MainTrend Ltd." />
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />


<title>SAIC Login</title>


<script language="JavaScript" src="js/header.js"></script>
<script language="JavaScript" src="js/md5.js"></script>
<script language="JavaScript" src="js/server.js"></script>
<script language="JavaScript" src="js/xml.js"></script>


<script language="JavaScript">
<!--

var testMode = false;
var attemptsCount = 0;


/**
 *
 */
function inputOnKeyUp ( e )
{
  var intVal = 0;

  if ( window.event )
  {
    intVal = parseInt ( window.event.keyCode );
  }
  else if ( e.which )
  {
    intVal = parseInt ( e.which );
  }

  if ( intVal == 13 )
  {
    var input;
    if ( this.name == "userName" )
    {
      input = document.getElementById ( "userPassword" );
      if ( input ) input.focus ( );
    }
    else if ( this.name == "userPassword" )
    {
      input = document.getElementById ( "submitButton" );
      if ( input ) input.focus ( );
    }
  }
}


/**
 * Uses functions from server.js
 */
function init ( )
{
  var ref = "" + window.location.href;
  testMode = ( ref.indexOf ( "testMode=true" ) > 0 );

  if ( ! testMode )
  {
    document.getElementById ( "userNames" ).style.visibility = "hidden";
  }

  var input = document.getElementById ( "userName" );
  if ( input ) input.onkeyup = inputOnKeyUp;

  input = document.getElementById ( "userPassword" );
  if ( input ) input.onkeyup = inputOnKeyUp;
}


/**
 *
 */
function setNewPasswordVisibility ( visible )
{


  if ( visible ){

  document.getElementById ( "newPasswordLabel"  ).style.visibility = "visible";
  document.getElementById ( "newPassword"       ).style.visibility = "visible";
  document.getElementById ( "confPasswordLabel" ).style.visibility = "visible";
  document.getElementById ( "confPassword"      ).style.visibility = "visible";
  document.getElementById ( "changeButton"      ).style.visibility = "visible";
  document.getElementById ( "userName"          ).style.visibility = "hidden";
  document.getElementById ( "userPassword"      ).style.visibility = "hidden";
  document.getElementById ( "userLabel"         ).style.visibility = "hidden";
  document.getElementById ( "passLabel"         ).style.visibility = "hidden";
  document.getElementById ( "submitButton"      ).style.visibility = "hidden";
  }
  else {

  document.getElementById ( "newPasswordLabel"  ).style.visibility = "hidden";
  document.getElementById ( "newPassword"       ).style.visibility = "hidden";
  document.getElementById ( "confPasswordLabel" ).style.visibility = "hidden";
  document.getElementById ( "confPassword"      ).style.visibility = "hidden";
  document.getElementById ( "changeButton"      ).style.visibility = "hidden";
  document.getElementById ( "userName"          ).style.visibility = "visible";
  document.getElementById ( "userPassword"      ).style.visibility = "visible";
  document.getElementById ( "userLabel"         ).style.visibility = "visible";
  document.getElementById ( "passLabel"         ).style.visibility = "visible";
  document.getElementById ( "submitButton"      ).style.visibility = "visible";

  }
}


/**
 * Uses functions from header.js, server.js
 */
function login ( )
{
  if ( attemptsCount > 2 )
  {
    alert ( "No more login attempts are allowed" );
    return;
  }

  // Trimming the userName and password values
  var userName = getElementValue ( "userName" ).replace(/^\s+|\s+$/g,"");
  var password = getElementValue ( "userPassword" ).replace(/^\s+|\s+$/g,"");

  if ( userName == null || userName.length == 0 )
  {
    alert ( "El nombre del usuario es un campo requerido" );
    return;
  }

  if ( ! testMode && ( password == null || password.length == 0 ) )
  {
    alert ( "El contraseña del usuario es un campo requerido" );
    return;
  }

  userName = userName.toUpperCase ( );
  password = password.toUpperCase ( );

  if ( password == "SAIC" )
  {
    //setNewPasswordVisibility ( true );
    //return;
  }
  //alert ( hex_md5 ( password ) );

  doAppRequest ( "loginPage=true&command=login&usr=" + userName + "&pwd=" + password );
}

function changePwd ( )
{

	var userName = getElementValue ( "userName" ).replace(/^\s+|\s+$/g,"");
	var oldPassWd = getElementValue ( "userPassword" ).replace(/^\s+|\s+$/g,"");
	var passWd = getElementValue ( "newPassword" ).replace(/^\s+|\s+$/g,"");
	var confPassWd = getElementValue ( "confPassword" ).replace(/^\s+|\s+$/g,"");

	if ( passWd == null || passWd.length == 0 )
  {
    alert ( "La Nueva Contraseña es un campo requerido" );
    return;
  }

  if ( confPassWd == null || confPassWd.length == 0 )
  {
    alert ( "El campo de Confirmar Contraseña es requerido" );
    return;
  }

  if ( passWd != confPassWd )
  {
  	alert ( "La contraseña debe ser la misma en ambos campos." );
  	return;
  }

  if ( passWd == oldPassWd )
  {
  	alert ( "La contraseña debe ser distinta a la contraseña anterior expirada." );
  	return;
  }

  userName = userName.toUpperCase ( );
  passWd = passWd.toUpperCase ( );

  var url = "jsp/password.jsp?uName="+ userName + "&pWd=" + passWd;

  xmlHttp.open('GET', url, true);
  setWaitingMode ( true );

  xmlHttp.onreadystatechange = function( ) {

      if (xmlHttp.readyState == 4)
      {
      	if (xmlHttp.status == 200)
      	{
      		if (xmlHttp.responseText.indexOf ( "EXEC" ) >= 0 )
      		{
      			alert( "Su contraseña fue cambiada exitosamente!" );
				setWaitingMode ( false );
				doAppRequest ( "loginPage=true&command=login&usr=" + userName + "&pwd=" + passWd );
			}
			else
			{
				setWaitingMode ( false );

				alert ( "Error ejecutando cambio de password: " + xmlHttp.responseText );
			}
		}
	  }
 }

     xmlHttp.send(null);

}



/**
 *
 * Server Response handler
 */
function applicationResponseHandler ( root )
{
  var command = root.getAttributeValue ( "command" );

  if ( command == "start" )
  {
    doAppCommand ( "SHOW" );
  }
  else if ( command == "failure" )
  {
    var message = root.getAttributeValue ( "message" );
    if ( message != null )
    {
      if ( message.indexOf ( "ORA-01017" ) == 0 )
      {
        message = "El nombre o la contraseña del usuario es inválida";
      }
      else if ( message.indexOf ( "ORA-28000" ) == 0 )
      {
        message = "El usuario o contraseña esta bloqueado, favor contactar a Seguridad";
      }
      else if ( message.indexOf ( "ORA-28001" ) == 0 )
      {
        message = "La contraseña esta expirada, favor cambiar contraseña";
        setNewPasswordVisibility ( true );
      }
      else
      {
        message = "Error con la base de datos, favor contactar al Administrador del sistema\r\n" + message;
      }
    }
    alert ( message );
    attemptsCount ++;
  }
  else
  {
    //alert ( root.getXmlDoc ( ) );
  }
}


/**
 *
 */
function applicationKeyUpEventHandler ( eventCode )
{
  alert ( "applicationKeyUpEventHandler: " + eventCode );
}


// -->
</script>

</head>

<body onload="init ( );">

<br/>
<br/>

<form id="controlForm" name="controlForm" action="" method="post">
<input type="hidden" id="command" name="command" value="login"/>

<center>

<p align="center>">
<select id="userNames" style="width:130px; height:16px; font:11px Arial;" onChange="document.getElementById ( 'userName' ).value = this.value;">
  <option value=" ">&nbsp;</option>
  <option value="FJ2737">Tecnico (2737)</option>
  <option value="FJ2764">Tecnico (2764)</option>
  <option value="FJ7011">Tecnico (7011)</option>
  <option value="FJ2746">Oficinista de reclamaciones (2746)</option>
  <option value="FJ2740">Supervisor (2740)</option>
  <option value="FJ2748">Recaudador (2748)</option>
  <option value="MTREND">MTREND</option>
</select>
</p>

<table cellpadding="1" cellspacing="1" style="background:#FFCC33; border: 1px solid #00A0FF;">

<tr valign="bottom" style="font:13px Arial; color: #005080;">
<td colspan="2" valign="top">
<img src="images/DLFLoginHeader.gif"/>
<b>
Sistema de Administraci&oacute;n e Informaci&oacute;n de Casos
&nbsp;
</b>
</td>
</tr>

<tr>
<td>

<table cellpadding="1" cellspacing="2" border="0">

<tr style="font:13px Arial; color: #005080;">
<td valign="top"><div id="userLabel" style="visibility:visible;">Usuario:</div></td>

<td valign="top"><input style="border: 1px solid #00A0FF;" id="userName" name="userName" type="text"/></td>

<td valign="top"><div id="newPasswordLabel" style="visibility:hidden;">&nbsp;&nbsp;&nbsp;Nueva Contrase&ntilde;a:</div></td>
<td valign="top"><input type="password" style="border: 1px solid #00A0FF; visibility:hidden;" id="newPassword" name="newPassword" type="text"/></td>
</tr>

<tr style="font:13px Arial; color: #005080;">
<td valign="top"><div id="passLabel" style="visibility:visible";>Contrase&ntilde;a:</div></td>
<td valign="top">
<input type="password" style="border: 1px solid #00A0FF;" id="userPassword" name="userPassword" type="text"/>
</td>
<td valign="top"><div id="confPasswordLabel" style="visibility:hidden;">&nbsp;&nbsp;&nbsp;Confirme la Contrase&ntilde;a:</div></td>
<td valign="top"><input type="password" style="border: 1px solid #00A0FF; visibility:hidden;" id="confPassword" name="confPassword" type="text"/></td>
</tr>

<tr style="font:13px Arial; color: #005080;">
<td valign="top">&nbsp;</td>
<td valign="top"><input type="button" id="submitButton" value="Entrar" onclick="login ( );"/></td>
<td valign="top">&nbsp;</td>
<td valign="top"><input type="button" id="changeButton" value="Cambiar" style="visibility:hidden;" onclick="changePwd ( );"/></td>
<td valign="top">&nbsp;</td>
</tr>

</table>

</td>

<td>&nbsp;</td>

</tr>

</table>

<br/>
<br/>
<div style=\"width:70%; font:20px; aligh:center;\"><b>RECORDATORIO: <font color=red>AL ACCEDER ESTE SISTEMA, USTED ESTARÁ APLICANDO CAMBIOS A DOCUMENTOS OFICIALES</font></b><div> </br> <b><font color=red>EL AJUSTE PORCENTUAL DEL MES DE JULIO 2013 ES DE 0.2129. </b></br><b><font color=red>LA FECHA DE CORTE PARA CASOS DE SUBSIDIO DE ENERGIA ES EL 28 DE JUNIO DEL 2013. </b>

</center>

</form>

</body>

</html>
