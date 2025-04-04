<%@ page import="java.util.*"%>
<%@ page import="net.maintrend.util.*" %>
<%
String conString = Configuration.getInstance ( ).get ( "ConnectionString" );

conString = conString.toUpperCase ( );

String message = "";
if ( conString.indexOf ( "SAICWPRD" ) >= 0 )
{
  message = "<div style=\"width:70%; font:20px; aligh:center;\"><b>RECORDATORIO: <font color=red>AL ACCEDER ESTE SISTEMA, USTED ESTARÁ APLICANDO CAMBIOS A DOCUMENTOS OFICIALES</font></b><div>";
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
  var visibility = "hidden";
  if ( visible ) visibility = "visible";
  document.getElementById ( "newPasswordLabel"  ).style.visibility = visibility;
  document.getElementById ( "newPassword"       ).style.visibility = visibility;
  document.getElementById ( "confPasswordLabel" ).style.visibility = visibility;
  document.getElementById ( "confPassword"      ).style.visibility = visibility;
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
        message = "La contraseña esta expirada, favor contactar a Seguridad";
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
<td valign="top">Usuario:</td>
<td valign="top">
<input style="border: 1px solid #00A0FF;" id="userName" name="userName" type="text"/>
</td>
<td valign="top"><div id="newPasswordLabel" style="visibility:hidden;">&nbsp;&nbsp;&nbsp;Nueva Contrase&ntilde;a:</div></td>
<td valign="top"><input type="password" style="border: 1px solid #00A0FF; visibility:hidden;" id="newPassword" name="newPassword" type="text"/></td>
</tr>

<tr style="font:13px Arial; color: #005080;">
<td valign="top">Contrase&ntilde;a:</td>
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
<td valign="top">&nbsp;</td>
</tr>

</table>

</td>

<td>&nbsp;</td>

</tr>

</table>

<br/>
<br/>
<%= message %>

</center>

</form>

</body>

</html>
