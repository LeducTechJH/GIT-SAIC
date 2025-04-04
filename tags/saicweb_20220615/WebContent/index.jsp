<%@ page import="java.util.*"%>
<%@ page import="net.maintrend.util.*" %>
<%

String conString = Configuration.getInstance ( ).get ( "ConnectionString" );

conString = conString.toUpperCase ( );

String message = "";
if ( conString.indexOf ( "SAICPROD" ) >= 0 )
{
  message = "<div style=\"position:absolute; left:314px; top:55px; font:14px Arial; color:#FF0000; aligh:center;\"><b>Producción!</b></div>";
}
%>

<!DOCTYPE html>

<html lang="es">

<head>

<meta name="author" content="MainTrend Ltd." />
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />

<title>Departamento de la Familia - SAIC-Web</title>

<link rel="stylesheet" href="css/style.css" type="text/css" />
<link href="css/subModal.css" rel="stylesheet" type="text/css">

<script language="JavaScript" src="js/actionBlocker.js"></script>
<script language="JavaScript" src="js/editorWindow.js"></script>
<script language="JavaScript" src="js/header.js"></script>
<script language="JavaScript" src="js/server.js"></script>
<script language="JavaScript" src="js/keyEventHandler.js"></script>
<script language="JavaScript" src="js/messages.js"></script>
<script language="JavaScript" src="js/jquery.js"></script>

<style type="text/css">

/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  padding-top: 100px; /* Location of the box */
  padding-left: 460px;
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
}

</style>


<script language="JavaScript">

function submitData( tr, fieldInstName )
{
	var ele = parent.document.getElementById("OFICINA");
	ele.innerHTML = tr.cells[3].innerHTML;
	document.getElementById('myModal').style.display='none';
	
	var rmo = tr.cells[1].innerHTML;
	
	//*********************************************************************************************************
	
	alert(rmo);
	
	var soapMessage = "<soap:Envelope xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'";
	soapMessage += "xmlns:xsd='http://www.w3.org/2001/XMLSchema'";
	soapMessage += "xmlns:soap='http://schemas.xmlsoap.org/soap/envelope/'>";
	soapMessage += "<soap:Body><setRMO xmlns='http://127.0.0.1:10000/SaicServer/'>";
	soapMessage += "<strRMO>'" + rmo + "'</strRMO></setRMO></soap:Body></soap:Envelope>'";
	
	var URL = "http://127.0.0.1:10000/SaicServer/setRMO?strRMO=" + rmo;
	
	soapMessage = "{ strRMO:'" + rmo + "'}"
	
	$.ajax({ url : URL,
		 type: "POST",
		    dataType: "JSONP", 
		    data: soapMessage, 
		    processData: false,
		    contentType: "application/json; charset=\"utf-8\"",
		 
		 success : function(data) {
		    alert(data[0]);
		    alert("F11");
	     	},
	     	
			error : function(jqXHR, textStatus, errorThrown) {
				alert("F9");
				alert(textStatus);
				alert(jqXHR.status);
				alert(jqXHR.responseText);
				alert("F10");
			},
			
			complete : function(jqXHR, textStatus) {
				//alert(textStatus);
				//alert(jqXHR.status);
				//alert(jqXHR.responseText);
			}

		});
	
	
	alert("F2");
	
	//*********************************************************************************************************
	
	
	var ascii = "";
	
	for ( x=0; x < rmo.length; x++ )
		{
		ascii = ascii + rmo.charCodeAt(x) + " ";	
		}
	
	var ofic = tr.cells[3].innerHTML;
	var ascii2 = "";
	
	for ( x=0; x < ofic.length; x++ )
	{
		ascii2 = ascii2 + ofic.charCodeAt(x) + " ";	
	}
	
	//var cmd = 'command=itemChanged&model=SEL_RMO_OFICINA_ALL_FR&changes=<?xml version="1.0" encoding="utf-8"?><changes><field name="RMO_OFICINA" value="' + ascii + '" /><field name="DSC_OFICINA" value="' + ascii2 + '" /></changes>'

	//var cmd = 'command=NOTIFYINSTANCE&model=SEL_RMO_OFICINA_ALL_FR&field=PARK&oldfield=RMO_OFICINA&value=' + ascii + '&changed=true'
	
	//formFrame.doAppRequest ( 'command=menuAction&actionId=4&action=CHAMA_CALENDARIO2_ADL&actionType=ADL&actionCall=CALL&menuClass=gov.dlf.facade.SAIC_MENU' );
	
	//var cmd = "command=appAction&action=UpdateForm;";
	
	//var cmd = "command=appAction&action=SET_RMO_GBL_ADL&actionType=ADL&attr=CONTESTACION_FR&value="+rmo;
	
    //doAppRequest ( cmd );
	
	//var iframe = document.getElementById("hiddeniframe");
	
	//iframe.contentWindow.pickListField = fieldInstName;
	//iframe.contentWindow.pickListFieldsList = "COD_RMO0;DSC_MUNIC0;DSC_OFICINA0;REGION";
	
	//alert(iframe.contentWindow.pickListFieldsList );
	
	//iframe.contentWindow.returnData( tr, fieldInstName );
	
	//doAppRequest('command=NOTIFYINSTANCE&model=SEL_RMO_OFICINA_ALL_FR&field=DSC_OFICINA&oldField=RMO_OFICINA&value=' + ascii + '&change=true')
	
	//var iframe = document.getElementById("hiddeniframe");
	//getMessageObject ( ).setTarget ( iframe );
	
	//var ifrDoc = iframe.contentDocument || iframe.contentWindow.document;
	
	//var elements = ifrDoc.getElementById( "SEL_RMO_OFICINA_ALL_FR" ).elements;

	//elements[1].value = rmo;
	//elements[2].value = ofic;
	//elements[3].click();
	
	//alert(elements[1].value);
	//alert(elements[2].value);
	
	//var cmd = 'command=itemChanged&model=SEL_RMO_OFICINA_ALL_FR&changes=<?xml version="1.0" encoding="utf-8"?><changes><field name="RMO_OFICINA" value="' + ascii + '" /><field name="DSC_OFICINA" value="' + ascii2 + '" /></changes>'
	//alert(cmd);
	//doAppRequest ( cmd );
	
	cmd = 'command=NOTIFYINSTANCE&model=SEL_RMO_OFICINA_ALL_FR"&field=PARK&oldfield=RMO_OFICINA&value=' + ascii + '&changed=true'
	alert(cmd);
	doAppRequest ( cmd );
	
    //cmd = "command=appAction&action=SET_RMO_GBL_ADL&actionType=ADL;
    //alert(cmd);
    //doAppRequest ( cmd );
    //lert(resp);
	
	alert("F4");
	return false;
	
	
}

function changeBackColor(el,n)
{
	if (n==0)
		{
			el.style.backgroundColor="white";
		}
	else
		{
			el.style.backgroundColor="yellow";
		}
}


var testMode  = false;
var finished  = false;
var queryMode = false;

var deleteConfirmation = "¿Usted quiere realmente eliminar récord?";


var ref = "" + window.location.href; 
testMode = ( ref.indexOf ( "testMode=true" ) > 0 );


/**
 * Uses functions from header.js, messages.js
 */
function init ( )
{
  var frame = getIFrame ( "formFrame" );
  if ( frame )
  {
    getMessageObject ( ).setTarget ( frame );
  }
  else
  {
    alert ( "Form Frame for messages can not be set" );
  }

  if ( ! testMode )
  {
    document.getElementById ( "debugIcons" ).style.visibility = "hidden";
  }
}


/**
 *
 */
function showMode ( msg )
{
	
  var e = sessionStorage.username;
  checkRMS_LOCK(e);
	
  var modeDiv = document.getElementById ( "modeDiv" );
  if ( modeDiv ) modeDiv.innerHTML = msg;
}

function checkRMS_LOCK(userName) 
{	
	
	//alert(userName);

	
	if (userName != "") {
		
		
			//Production
			var server = "http://10.200.10.79/rmsv2/";
			
			//QC
		//	var server = "http://10.200.10.79/rmsv2qc/";
			
			var URL = server + 'api/Sample/GetOverdue?email=' + userName + '@familia.pr.gov';
			
			$.ajax({ url : URL,
					 type : 'GET',
					 crossDomain : true,
					 dataType : 'json',
					 async: false,
					 accepts : 'application/json; charset=utf-8',
					 success : function(data) {
							
						 
					    //alert(data[0]);
						 
						if (data[0] != null)
						 {
						
					 		var sampleid = data[0].id;
					 		var tokenid = data[0].token.id;
													 	
					 		if (sampleid != undefined)
					 			{
									alert("Tiene una muestra de RMS pendiente. Completar la muestra para que pueda continuar trabajando con SAIC.");
								
									//window.location.href = server + 'index.html#!/TokenLogin?token=' + tokenid + '&sampleID=' + sampleid;
									
									var url = server + 'index.html#!/TokenLogin?token=' + tokenid + '&sampleID=' + sampleid;
									
									var win = window.open(url, '_blank');
									win.focus();
								
					 			}
						 }
							
				     	},
				     	
						error : function(jqXHR, textStatus, errorThrown) {
							alert(textStatus);
							alert(jqXHR.status);
							alert(jqXHR.responseText);
						},
						
						complete : function(jqXHR, textStatus) {
							//alert(textStatus);
							//alert(jqXHR.status);
							//alert(jqXHR.responseText);
						}

					});
			

		}
	
	}


/**
 *
 */
function debugMessage ( msg )
{
  if ( ! testMode ) return;

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
  if ( pTarget.printFormName && pTarget.printFormName.length > 0 && pTarget.doAppRequest )
  {
    pTarget.doAppRequest ( "command=printForm&printForm=" + pTarget.printFormName );
  }
  else if ( pTarget.backgroundAction && pTarget.backgroundAction.length > 0 && pTarget.doAppRequest )
  {
    pTarget.doAppRequest ( "command=backgroundAction&action=" + pTarget.backgroundAction );
  }
  else
  {
    pTarget.focus ( );
    pTarget.print ( );
  }
}


/**
 * Uses functions from header.js
 */
function printHtmlByIFrame ( html )
{
  setIFrameContent ( "printFrame", html );
  var frame = getIFrame ( "printFrame" );
  if ( frame )
  {
    frame.focus ( );
    frame.print ( );
  }

  frame = getIFrame ( "formFrame" );
  if ( frame ) frame.focus ( );
}


/**
 * 
 */
function printHtml ( html )
{
  var printWin = null;
  printWin = window.open ( "", null, "top=50000,height=0,width=0,status=no,toolbar=no,menubar=no,location=no" );
  if ( printWin )
  {
    printWin.document.open ( );
    printWin.document.write ( html );
    printWin.document.close ( );
    printWin.focus ( );
    printWin.print ( );
    printWin.close ( );
  }
  else
  {
    //alert ( "Printing is prevented by a popup-blocker. Please turn off all popup blockers" );
    printHtmlByIFrame ( html );
  }
}


/**
 *
 */
function redirectResponse ( response )
{
  if ( response )
  {
    var formFrame = getIFrame ( "formFrame" );
    if ( formFrame && formFrame.processRequestResponse )
    {
      formFrame.processRequestResponse ( response );
    }
  }
}


/**
 * Uses functions from header.js
 */
function cmd ( commandText )
{
  var formFrame = getIFrame ( "formFrame" );
  
  //alert(commandText);
  
  if ( commandText == "OFICINA" )
  {
  	var modal = document.getElementById("myModal");
  	modal.style.display = "block";
  }
  

  var waitingState = ( document.getElementById ( "waitingDiv" ).style.visibility == "visible" );
  if ( waitingState )
  {
    alert ( "Procesando!!!" );
    //return;
  }

  if ( formFrame != null )
  {
    if ( formFrame.getMode )
    {
      //alert ( formFrame.getMode ( ) );
    }
    if ( commandText == "QBE" )
    {
      if ( queryMode )
      {
        showMode ( "" );
        commandText = "QUERY";
      }
      else
      {
        showMode ( "Query Mode" );
      }
      queryMode = ! queryMode;
    }
    else
    {
      showMode ( "" );
      queryMode = false;
    }

    if ( commandText == "print" )
    {
      iPrint ( formFrame );
    }
    else if ( commandText == "lastMenu" )
    {
      finished = true;
      formFrame.doAppRequest ( 'command=lastMenu' );
    }
    else if ( commandText == "CALSIBIF" )
    {
      //finished = true;
      //formFrame.doAppRequest ( 'command=menuAction&actionId=4&action=CHAMA_CALENDARIO2_ADL&actionType=ADL&actionCall=CALL&menuClass=gov.dlf.facade.SAIC_MENU' );
      formFrame.doAppRequest ( 'command=appAction&action=UpdateForm;CALENDARIO_TEC_SIBIF2_PKT' );
      //document.getElementById ( "waitingDiv" ).style.visibility == "hidden";
      //cmd ( 'lastMenu' );
    }
    else if ( commandText == "DESEMPLEO" )
    {
      finished = true;
      var url = "http://desempleo.trabajo.pr.gov/UICertificate/language.aspx";
      var winTop = 100;
      var winLeft = 150;
      var winHeight =(screen.availHeight - 122).toString();
      var winWidth = (screen.availWidth - 10).toString();
      window.open ( url, null, "top=0, left=0, height=winHeight, width=winWidth, titlebar=no, menubar=no, resizable=yes, status=no, toolbar=no, scrollbars=yes" );
    }
    else if ( commandText == "CERTNACIM" )
    {
      finished = true;
      var url = "https://servidores.gobierno.pr/ELAF/IntranetSalud/Default.aspx";
      var winTop = 100;
      var winLeft = 150;
      var winHeight =(screen.availHeight - 122).toString();
      var winWidth = (screen.availWidth - 10).toString();
      window.open ( url, null, "top=0, left=0, height=winHeight, width=winWidth, titlebar=no, menubar=no, resizable=yes, status=no, toolbar=no, scrollbars=yes" );
    }
    else if ( commandText == "CERTSERV" )
    {
    	finished = true;
        var url = "http://10.200.255.159/certServicio.aspx";
        var winTop = 100;
        var winLeft = 150;
        var winHeight = screen.availHeight;
        var winWidth = 960;
        window.open ( url, null, "top=0, left=0, height=winHeight, width=winWidth, titlebar=yes, menubar=yes, resizable=yes, status=yes, toolbar=yes, scrollbars=yes" );
      	
    }
        else if ( commandText == "CERTAEE" )
    {
    	finished = true;
        var url = "http://www.aeepr.com/servicios/certificaciones.asp";
        var winTop = 100;
        var winLeft = 150;
        var winHeight = screen.availHeight;
        var winWidth = 960;
        window.open ( url, null, "top=0, left=0, height=winHeight, width=winWidth, titlebar=yes, menubar=yes, resizable=yes, status=yes, toolbar=yes, scrollbars=yes" );
      	
    }
    else if ( commandText == "mainMenu" )
    {
      finished = true;
      formFrame.doAppRequest ( 'command=mainMenu' );
    }
    else if ( commandText == "FINISH_APPLICATION" )
    {
      finished = true;
      doAppRequest ( 'command=closeApp' );
    }
    else if ( commandText == "CHANGE_RMO" )
    {
    	formFrame.doAppRequest ( 'command=appAction&action=UpdateForm;SEL_RMO_OFICINA_ALL_PKT' );
    }
    else if ( formFrame.applicationKeyUpEventHandler )
    {
      formFrame.applicationKeyUpEventHandler ( commandText );
    }
    else if ( formFrame.applicationEventHandler )
    {
      formFrame.applicationEventHandler ( commandText );
    }
    else
    {
      alert ( "No handler for the command [" + commandText + "]" );
    }
  }
}


/**
 * Uses functions from header.js
 *
 * KeyUp event handler
 */
function applicationKeyUpEventHandler ( response )
{
  var formFrame = getIFrame ( "formFrame" );
  if ( formFrame != null && formFrame.applicationKeyUpEventHandler )
  {
    formFrame.applicationKeyUpEventHandler ( response );
  }
}


/**
 * Uses functions from header.js
 *
 * Server Response handler
 */
function applicationResponseHandler ( response )
{
  var formFrame = getIFrame ( "formFrame" );

  if ( formFrame != null && formFrame.applicationResponseHandler )
  {
    formFrame.applicationResponseHandler ( response );
  }
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
    else if ( doc.getCurrentFieldId )
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


/**
 * Uses functions from messages.js
 */
function addContents ( contentCodes )
{
  if ( contentCodes == null || contentCodes.length == 0 ) return;

  var code = "";
  var ind = contentCodes.indexOf ( ';' );
  if ( ind > 0 )
  {
    code = contentCodes.substring ( 0, ind );
    contentCodes = contentCodes.substring ( ind + 1 );
  }
  else
  {
    code = contentCodes;
    contentCodes = "";
  }

  if ( code.length > 0 )
  {
    var inde = clientContentQueue.indexOf ( code );
    if ( inde < 0 )
    {
      clientContentQueue += ';';
      clientContentQueue += code;
    }
  }

  // recursion
  addContents ( contentCodes );
}


/**
 * Uses functions from messages.js
 */
function showContents ( contentCodes )
{
  addContents ( contentCodes ); 
  doClientContentQueue ( ); 
}


/**
 *
 */
function handleBeforeUnload ( )
{
  if ( ! finished )
  {
    cmd ( 'FINISH_APPLICATION' );
    finished = false;
    alert ( "Cerrando la aplicación SAIC-Web." );
  }
}

// -->
</script>


</head>


<body onbeforeunload="handleBeforeUnload ( );" onload="init ( );">
<input type="hidden" id="userdata" name="custId" value="3487">
 
<div id="dhtmltooltip"></div>

<script type="text/javascript" src="js/tooltips.js"></script>

<div id="page" align="left">


<h1></h1>
	<script>
		var browserComp = (function (agent) {
        switch (true) {
		    case agent.indexOf("edge") > -1: return "";
            case agent.indexOf("edg/") > -1: return "";
            case agent.indexOf("trident") > -1: return "";
 
            default: return alert ("Estas utilizando un browser no es compatible con el SAIC" )
        }
    })(window.navigator.userAgent.toLowerCase());
	
	

	if (browserComp == "Estas utilizando un browser no es compatible con el SAIC" )
	{
	
	
	  document.getElementById ( "newPasswordLabel"  ).style.visibility = "hidden";
	  document.getElementById ( "newPassword"       ).style.visibility = "hidden";
	  document.getElementById ( "confPasswordLabel" ).style.visibility = "hidden";
	  document.getElementById ( "confPassword"      ).style.visibility = "hidden";
	  document.getElementById ( "changeButton"      ).style.visibility = "hidden";
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


	</script>
	
<!-- Header Start -->


<div id="header2" style="width: 800px; position:relative; height: 100px;"><img src="images/BANNER01.gif" width="780px" height="70px" />

<div align="left" class="links_menu" id="menu" style="position:relative; top:1px; bottom:3px; right: 0px; width: 780px; height: 20px; ">
<table cellpadding="1" cellspacing="1" border="0"><tr>

<td style="vertical-align:top; ">
<img src="dlfImages/Search.png" onclick="cmd ( 'QBE' );"
onMouseover = "ddrivetip ( 'Buscar r&eacute;cord', '#FFFFCC', 110 );"
onMouseout  = "hideddrivetip ( );"/>
&nbsp;
</td>

<td style="vertical-align:top; ">&nbsp;&nbsp;</td>

<td style="vertical-align:top; ">
<img style="vertical-align:top; position:relative; top:3px;" src="dlfImages/PageUp.png" onclick="cmd ( 'PREVPAGE' );"
onMouseover = "ddrivetip ( 'Arriba', '#FFFFCC', 70 );"
onMouseout  = "hideddrivetip ( );"/>
&nbsp;
</td>

<td style="vertical-align:top; ">
<img style="vertical-align:top; position:relative; top:1px;" src="dlfImages/PageDown.png" onclick="cmd ( 'NEXTPAGE' );"
onMouseover = "ddrivetip ( 'Abajo', '#FFFFCC', 70 );"
onMouseout  = "hideddrivetip ( );"/>
&nbsp;
</td>

<td style="vertical-align:top; ">&nbsp;&nbsp;</td>

<td style="vertical-align:top; ">
<img src="dlfImages/Delete.png"    onclick="cmd ( 'DELINSTANCE' );"
onMouseover = "ddrivetip ( 'Eliminar r&eacute;cord', '#FFFFCC', 100 );"
onMouseout  = "hideddrivetip ( );"/>
&nbsp;
</td>

<td style="vertical-align:top; ">&nbsp;&nbsp;</td>

<td style="vertical-align:top; ">
<img src="dlfImages/Add.png"  onclick="cmd ( 'INSERTINSTANCE' );"
onMouseover = "ddrivetip ( 'A&ntilde;adir r&eacute;cord', '#FFFFCC', 100 );"
onMouseout  = "hideddrivetip ( );"/>
&nbsp;
</td>

<!--
<td style="vertical-align:top; ">
<img src="images/InsField.gif"  onclick="cmd ( 'ADDINSTANCE' );"
onMouseover = "ddrivetip ( 'Insertar r&eacute;cord', '#FFFFCC', 100 );";
onMouseout  = "hideddrivetip ( );"/>
&nbsp;
</td>
-->

<td style="vertical-align:top; ">
<img src="images/AddField.gif"  onclick="cmd ( 'INSERTINSTANCENEXTGROUP' );"
onMouseover = "ddrivetip ( 'A&ntilde;adir Nuevo Grupo', '#FFFFCC', 200 );"
onMouseout  = "hideddrivetip ( );"/>
&nbsp;
</td>

<td style="vertical-align:top; ">&nbsp;&nbsp;</td>

<!-- 
<td style="vertical-align:top; ">
<img src="images/Save.gif"  onclick="cmd ( 'UPDATE' );"
onMouseover = "ddrivetip ( 'Excepto', '#FFFFCC', 70 );";
onMouseout  = "hideddrivetip ( );"/>
&nbsp;
</td>

<td style="vertical-align:top; ">&nbsp;&nbsp;</td>
-->

<td style="vertical-align:top; ">
<img src="dlfImages/Enter.png"  onclick="cmd ( 'FINISH_ACTION' );"
onMouseover = "ddrivetip ( 'Continuar', '#FFFFCC', 70 );"
onMouseout  = "hideddrivetip ( );"/>
&nbsp;
</td>

<td style="vertical-align:top; ">
<img src="dlfImages/F8.png" onclick="cmd ( 'QUIT_ACTION' );"
onMouseover = "ddrivetip ( 'Regresar', '#FFFFCC', 70 );"
onMouseout  = "hideddrivetip ( );"/>
&nbsp;
</td>

<td style="vertical-align:top; ">&nbsp;&nbsp;</td>

<td style="vertical-align:top; ">
<img src="dlfImages/Editor.png"  onclick="showEditorOnButtonClick ( );"
onMouseover = "ddrivetip ( 'Text Editor', '#FFFFCC', 100 );"
onMouseout  = "hideddrivetip ( );"/>
&nbsp;
</td>

<!-- 
<td style="vertical-align:top; ">
<img style="vertical-align:top; position:relative; top:-2px;" src="dlfImages/HotKey.png"   onclick="cmd ( 'HOTKEYPRESS' );"
onMouseover = "ddrivetip ( 'Hot Key', '#FFFFCC', 100 );";
onMouseout  = "hideddrivetip ( );"/>
&nbsp;
</td>
-->
<td style="vertical-align:top; ">
<img src="dlfImages/Print.png"  onclick="cmd ( 'print' );"
onMouseover = "ddrivetip ( 'Imprimir', '#FFFFCC', 70 );"
onMouseout  = "hideddrivetip ( );"/>
&nbsp;
</td>

<td style="vertical-align:top; ">
<img src="dlfImages/Help.gif"  onclick="showHelpOnHelpButtonClick ( );"
onMouseover = "ddrivetip ( 'Help', '#FFFFCC', 70 );"
onMouseout  = "hideddrivetip ( );"/>
&nbsp;
</td>

<td style="vertical-align:top; ">
<img src="images/Refresh.gif" onclick="cmd ( 'SHOW' );" 
onMouseover = "ddrivetip ( 'Refrescar pantalla', '#FFFFCC', 70 );"
onMouseout  = "hideddrivetip ( );"/>
&nbsp;
</td>

<td style="vertical-align:top; ">
<img src="dlfImages/datepick.jpg" onclick="cmd ( 'CALSIBIF' );" 
onMouseover = "ddrivetip ( 'Calendario SIBIF', '#FFFFCC', 70 );"
onMouseout  = "hideddrivetip ( );"/>
&nbsp;
</td>

<td style="vertical-align:top; ">
<img src="dlfImages/user.png" onclick="cmd ( 'DESEMPLEO' );" 
onMouseover = "ddrivetip ( 'Servicios Desempleo', '#FFFFCC', 70 );"
onMouseout  = "hideddrivetip ( );"/>
&nbsp;
</td>

<td style="vertical-align:top; ">
<img src="dlfImages/ordersmall.png" onclick="cmd ( 'CERTNACIM' );" 
onMouseover = "ddrivetip ( 'Certificado Nacimiento', '#FFFFCC', 70 );"
onMouseout  = "hideddrivetip ( );"/>
&nbsp;
</td>

<td style="vertical-align:top; ">
<img src="dlfImages/certf.png" onclick="cmd ( 'CERTSERV' );" 
onMouseover = "ddrivetip ( 'Certificación de Servicio \(ADSEF 186\)', '#FFFFCC', 70 );"
onMouseout  = "hideddrivetip ( );"/>
&nbsp;
</td>

<!-- <td style="vertical-align:top; ">
<img src="dlfImages/aee.png" onclick="cmd ( 'CERTAEE' );" 
onMouseover = "ddrivetip ( 'Certificación de la AEE', '#FFFFCC', 70 );";
onMouseout  = "hideddrivetip ( );"/>
&nbsp;
</td>-->

<td style="vertical-align:top; horizontal-align:right;">
  <div style="vertical-align:top; horizontal-align:right; font:11px Arial; width:100px;">&nbsp;&nbsp;Build:20081121.01&nbsp;&nbsp;&nbsp;</div>
</td>


<td  style="vertical-align:top;" >
<img src="dlfImages/office.png" onclick="cmd ('CHANGE_RMO')";
onMouseover = "ddrivetip ( 'Cambiar RMO', '#FFFFCC', 70 );"
onMouseout  = "hideddrivetip ( );"/>
</td>

<td style="vertical-align:top; horizontal-align:right;">
  <div name="OFICINA" title="OFICINA" id="OFICINA" style="vertical-align:top; horizontal-align:right; font:11px Arial; width:100px;">RMO</div>
</td>


<td style="vertical-align:top; ">
<!-- <img src="dlfImages/office.png" onclick=" sendRequest ( 'AppManagerServlet.app', 'command=PICKLIST&model=SEL_RMO_OFICINA_ALL_FR&panelObject=RMO_OFICNA&field=RMO_OFICNA' );"-->

<!--<img src="dlfImages/office.png" onclick=" sendRequest ( 'AppManagerServlet.app', 'command=PICKLIST&model=SEL_RMO_OFICINA_ALL_FR' );"

onMouseover = "ddrivetip ( 'Cambiar RMO', '#FFFFCC', 70 );"
onMouseout  = "hideddrivetip ( );"/>
&nbsp;
</td>

<td style="vertical-align:top; horizontal-align:right;">
  <div id="office" style="vertical-align:top; horizontal-align:right; font:11px Arial; width:100px;">RMO</div>
</td>-->

<td style="vertical-align:top; " width="100%" align="right">

<div style="vertical-align:top; horizontal-align:right; font:12px Arial;">

<table cellspacing="0" cellpadding="0" border="0"><tr>
<td valign="top"><div id="waitingDiv" style="font:10px Arial; color:#FF0000; visibility:hidden;">
<table cellpadding="0" cellspacing="0" border="0"><tr>
<td valign="top"><div style="font:14px Arial;">Procesando</div></td>
<td valign="top"><img src="images/ajax-loader.gif"/></td>
</tr></table>
</div></td>
<!-- <td>&nbsp;&nbsp;&nbsp;</td>-->
<td valign="top"><div id="modeDiv" style="font:10px Arial; color:#FF0000;"></div></td>
<!-- <td>&nbsp;&nbsp;&nbsp;</td>-->
<td valign="top" onclick="cmd ( 'lastMenu' );"><div style="font:10px Arial;"><u>Menu Anterior</u></div></td>
<td>&nbsp;&nbsp;&nbsp;</td>
<td valign="top" onclick="cmd ( 'mainMenu' );"><div style="font:10px Arial;"><u>Menu Principal</u></div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td valign="top">
<img src="dlfImages/key.gif" onclick="cmd ( 'FINISH_APPLICATION' );"
onMouseover = "ddrivetip ( 'Salir', '#FFFFCC', 70 );"
onMouseout  = "hideddrivetip ( );"/>
</td>
<td valign="top" onclick="cmd ( 'FINISH_APPLICATION' );">&nbsp;<u>Salir</u>&nbsp;</td>
</tr></table>

</div>

</td>

</tr>
</table>

</div>
</div>

<%=message %>

<!-- Header End -->


<!-- Content Start -->
<table width="780px"><tr><td align="center">
<script language="JavaScript">
<!-- 
if ( ! testMode )
{
  document.write ( '<iframe id="formFrame" name="formFrame" frameborder="no" scroll="no" style="width:760px; height:500px; border:1px solid orange;" src="login.jsp"></iframe>\r\n' );
}
else
{
  document.write ( '<iframe id="formFrame" name="formFrame" frameborder="no" scroll="no" style="width:760px; height:500px; border:1px solid orange;" src="login.jsp?testMode=true"></iframe>\r\n' );
}
//-->
</script>
</td></tr></table>
<!-- Content End -->

<!-- The Modal -->
	<div id="myModal" class="modal">
    <div  style="left: 212px; top: 209px; width: 300px; height: 200px; display:block; z-index: 10001;">
    <div id="popupInner">
    <div id="popupTitleBar" style="padding: 0px; width: 297px; height: 17px;">
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tbody>
    <tr>
    <td width="100%" align="right">&nbsp;</td>
    <td valign="top"><img id="pListUp" style="top: 3px; visibility: hidden; position: relative;" onclick="pickListPrevPage ( );" src="images/PageUp.gif"></td>
    <td valign="top"><img id="pListDn" style="top: 2px; visibility: hidden; position: relative;" onclick="pickListNextPage ( );" src="images/PageDown.gif"></td>
    <td valign="top"><img style="left: -1px; top: 1px; position: relative;" onclick="document.getElementById('myModal').style.display='none';" src="images/closeSubmodal.gif"></td>
    </tr>
    </tbody>
    </table>
    </div>
    <div id="popupScrollable" style="border: 1px currentColor; border-image: none; width: 300px; height: 200px; display: block;">
    <form id="pickListForm"> 
    <table width="100%" id="pickListTable" border="0" cellspacing="1" cellpadding="1" name="data">
    <tbody id="RMOOficina">
    
  </tbody>
  </table>
<input id="pickListDummyInput" style="border: 1px currentColor; border-image: none; width: 1px; height: 1px;"></form></div></div></div>
  </div>
  </div>

<form id="debugForm">

<table id="debugIcons" width="780px">

<tr><td align="center" style="vertical-align:top; ">

<img src="images/Save.gif"   onclick="if ( window.clipboardData ) clipboardData.setData ( 'Text', document.getElementById ( 'debugArea' ).value ); else alert ( 'Only IE can copy to clipboard' );" />

<img src="images/Delete.gif" onclick="document.getElementById ( 'debugArea' ).value = '';" />

<img src="images/circle.png" onclick="doAppRequest ( 'command=debugStack' );"/>

<input id="debugGlobaVar" style="width:150px; height:16px; border:1px solid orange;" />

<img src="images/circle.png" onclick="doAppRequest ( 'command=debugGlobals&gblname=' + document.getElementById ( 'debugGlobaVar' ).value );"/>

<img src="images/JDP.gif" onclick="doAppRequest ( 'command=debugJDP' );"/>

<img src="images/Apply.gif" onclick="doAppRequest ( 'command=debugCommands' );"/>

</td></tr>

<tr><td align="center" style="vertical-align:top; ">
<textarea id="debugArea" style="width:760px; height:100px; border:1px solid orange;"></textarea>
</td></tr>

</table>

</form>


<iframe id="hiddeniframe" style="display:none" src="HiddenIFrame.html"></iframe>

<iframe id="printFrame" name="printFrame" frameborder="0" style="width:0px; height:0px; border:0px;" src=""></iframe>



</body>

</html>
