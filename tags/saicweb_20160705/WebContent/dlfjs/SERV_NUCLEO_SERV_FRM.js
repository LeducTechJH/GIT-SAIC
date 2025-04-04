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

//	***** START MODS BY J. OLMEDA - 8/13/2010 *****
	var names = new Array ( );
	k = 0;

	//names [ k ++ ] = "Representante";
	//names [ k ++ ] = "Dir. Servicio";

	var element = document.getElementById ( "COD_SERVICIO.0.0" );

	if ( element ) codServicio = element.value;

	if ( codServicio == "PAN")
	{
		setNextObject ("FCH_SOLICITUD", "SEGURO_SOCIAL_ADMN");
	}

	if ( codServicio == "AE-C" )
	{
		//***** J. Olmeda - 12/16/2010
		names [ k ++ ] = "Encargada(o) de los Menores";
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

			//M. Acevedo 30-Apr-2012
			//Change the navigation to the proper fields
			setNextObject ("COD_SERVICIO", "FLG_AEC_CLASSI");
			setNextObject ("FLG_AEC_CLASSI", "ID_TECNICO");
			setNextObject ("FCH_SOLICITUD", "SEGURO_SOCIAL_ADMN");
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
	if (codServicio.substring(0,4) == "LICE" || codServicio == "LISE")
	{
		if (codServicio == "LICE1")
		{
			var elemento = document.getElementById("CANTIDAD_AUTO.0.0.0");
			if (elemento)
			{
				elemento.readOnly = true;
				elemento.setAttribute ( "readonly", true );
			}
		}
		//Hide dummy field when LICE
		if (codServicio.substring(0,4)  == "LICE")
		{
			var elementX = document.getElementById("EMERG_DUMMY_FIELD.0.0.0");
			if (elementX)
			{
				elementX.style.display="none";
			}	
		}
		if (!(codServicio == "LICE1"))
		{
			var element0 = document.getElementById("EMER_NUM_CUENTA.0.0.0");
			if (element0)
			{
				setNextObject("EMER_NUM_CUENTA","CANTIDAD_AUTO");
				element0.style.nextobject="CANTIDAD_AUTO.0.0.0";
			}
			var element19 = document.getElementById("NOMBRE_ABONADO.0.0.0");
			if (element19) 
			{
				element19.style.display = "none";
			}
			var element20 = document.getElementById("ULT_DIGITOS_SSN.0.0.0");
			if (element20) 
			{
				element20.style.display = "none";
			}
			var element21 = document.getElementById("DIRECCION.0.0.0");
			if (element21) 
			{
				element21.style.display = "none";
			}
			var element22 = document.getElementById("FCH_ULT_FACTURA.0.0.0");
			if (element22) 
			{
				element22.style.display = "none";
			}
			var element23 = document.getElementById("ULT_DIGITOS_SSN.0.0.0");
			if (element23) 
			{
				element23.style.display = "none";
			}
			var element24 = document.getElementById("NOTIF_CORTE_SERV.0.0.0");
			if (element24) 
			{
				element24.style.display = "none";
			}
			var element25 = document.getElementById("ORDEN_CORTE_SERV.0.0.0");
			if (element25) 
			{
				element25.style.display = "none";
			}
			var element26 = document.getElementById("PLAN_PAGO_FLG.0.0.0");
			if (element26) 
			{
				element26.style.display = "none";
			}
			var element27 = document.getElementById("FCH_ULT_PAGO_0.0.0.0");
			if (element27) 
			{
				element27.style.display = "none";
			}
			var element28 = document.getElementById("FCH_ULT_PAGO_1.0.0.0");
			if (element28) 
			{
				element28.style.display = "none";
			}
			var element29 = document.getElementById("FCH_ULT_PAGO_2.0.0.0");
			if (element29) 
			{
				element29.style.display = "none";
			}
			var element29 = document.getElementById("FCH_ULT_PAGO_3.0.0.0");
			if (element29) 
			{
				element29.style.display = "none";
			}
			var element30 = document.getElementById("FCH_ULT_PAGO_4.0.0.0");
			if (element30) 
			{
				element30.style.display = "none";
			}
			var element31 = document.getElementById("FCH_ULT_PAGO_5.0.0.0");
			if (element31) 
			{
				element31.style.display = "none";
			}
			var element32 = document.getElementById("ULT_PAGO_0.0.0.0");
			if (element32) 
			{
				element32.style.display = "none";
			}
			var element33 = document.getElementById("ULT_PAGO_1.0.0.0");
			if (element33) 
			{
				element33.style.display = "none";
			}
			var element34 = document.getElementById("ULT_PAGO_2.0.0.0");
			if (element34) 
			{
				element34.style.display = "none";
			}
			var element35 = document.getElementById("ULT_PAGO_3.0.0.0");
			if (element35) 
			{
				element35.style.display = "none";
			}
			var element36 = document.getElementById("ULT_PAGO_4.0.0.0");
			if (element36) 
			{
				element36.style.display = "none";
			}
			var element37 = document.getElementById("ULT_PAGO_5.0.0.0");
			if (element37) 
			{
				element37.style.display = "none";
			}
			var element38 = document.getElementById("DIR_EMER.0.0.0");
			if (element38) 
			{
				element38.style.display = "none";
			}
			var element39 = document.getElementById("FCHULTFAC.0.0.0");
			if (element39) 
			{
				element39.style.display = "none";
			}
			var element40 = document.getElementById("Text_1.0.0.0");
			if (element40) 
			{
				element40.style.display = "none";
			}
			var element41 = document.getElementById("Text_2.0.0.0");
			if (element41) 
			{
				element41.style.display = "none";
			}
			var element42 = document.getElementById("Text_3.0.0.0");
			if (element42) 
			{
				element42.style.display = "none";
			}
			var element44 = document.getElementById("texto3.0.0.0");
			if (element44) 
			{
				element44.style.display = "none";
			}
			var element45 = document.getElementById("texto5.0.0.0");
			if (element45) 
			{
				element45.style.display = "none";
			}
			var element46 = document.getElementById("Text_3.0.0.0");
			if (element46) 
			{
				element46.style.display = "none";
			}
			var element47 = document.getElementById("Text_4.0.0.0");
			if (element47) 
			{
				element47.style.display = "none";
			}
			var element48 = document.getElementById("Text_5.0.0.0");
			if (element48) 
			{
				element48.style.display = "none";
			}
			var element49 = document.getElementById("Text_6.0.0.0");
			if (element49) 
			{
				element49.style.display = "none";
			}
			var element50 = document.getElementById("Text_AA.0.0.0");
			if (element50) 
			{
				element50.style.display = "none";
			}
			var element51 = document.getElementById("Text_11.0.0.0");
			if (element51) 
			{
				element51.style.display = "none";
			}
			var element52 = document.getElementById("Text_SS.0.0.0");
			if (element52) 
			{
				element52.style.display = "none";
			}
			var element53 = document.getElementById("Text_22.0.0.0");
			if (element53) 
			{
				element53.style.display = "none";
			}
			var element54 = document.getElementById("ATRASOS.0.0.0");
			if (element54) 
			{
				element54.style.display = "none";
			}
			var element55 = document.getElementById("ATRASOS_TXT.0.0.0");
			if (element55) 
			{
				element55.style.display = "none";
			}
			var element56 = document.getElementById("DELINCUENT.0.0.0");
			if (element56) 
			{
				element56.style.display = "none";
			}
			var element57 = document.getElementById("TXT_DELINCUENT.0.0.0");
			if (element57) 
			{
				element57.style.display = "none";
			}
			var element58 = document.getElementById("BALANCE.0.0.0");
			if (element58) 
			{
				element58.style.display = "none";
			}
			var element59 = document.getElementById("txt_monto_deuda.0.0.0");
			if (element59) 
			{
				element59.style.display = "none";
			}
	}
		//Hide fields for LISE
		if (!(codServicio.substring(0,4)  == "LICE"))
		{
			var element0 = document.getElementById("EMER_NUM_CUENTA.0.0.0");
			if (element0)
			{
				setNextObject("EMER_NUM_CUENTA","EMERG_DUMMY_FIELD");
				element0.style.nextobject="EMERG_DUMMY_FIELD.0.0.0";
			}
			var element14 = document.getElementById("FACTURAS.0.0.0");
			if (element14) 
			{
				element14.style.display = "none";
			}
			var element15 = document.getElementById("CHEQUE_CANJEADO.0.0.0");
			if (element15) 
			{
				element15.style.display = "none";
			}
			var element16 = document.getElementById("PAGO_SERVICIO_PRESTADO.0.0.0");
			if (element16) 
			{
				element16.style.display = "none";
			}
			var element17 = document.getElementById("OTROS_DOCS.0.0.0");
			if (element17) 
			{
				element17.style.display = "none";
			}
			var element18 = document.getElementById("OTROS_DOCS_TXT.0.0.0");
			if (element18) 
			{
				element18.style.display = "none";
			}
			var element2 = document.getElementById("Text_0.0.0.0");
			if (element2) 
			{
				element2.style.display = "none";
			}
			var element4 = document.getElementById("CANTIDAD_AUTO.0.0.0");
			if (element4) 
			{
				element4.style.display = "none";
			}
			var element6 = document.getElementById("SERV_EMERG_GP_TXT__16.0.0.0");
			if (element6) 
			{
				element6.style.display = "none";
			}
			var element7 = document.getElementById("SERV_EMERG_GP_TXT__17.0.0.0");
			if (element7) 
			{
				element7.style.display = "none";
			}
			var element8 = document.getElementById("SERV_EMERG_GP_TXT__18.0.0.0");
			if (element8) 
			{
				element8.style.display = "none";
			}
			var element9 = document.getElementById("SERV_EMERG_GP_TXT__19.0.0.0");
			if (element9) 
			{
				element9.style.display = "none";
			}
			var element10 = document.getElementById("SERV_EMERG_GP_TXT__20.0.0.0");
			if (element10) 
			{
				element10.style.display = "none";
			}
			var element11 = document.getElementById("SERV_EMERG_GP_TXT__21.0.0.0");
			if (element11) 
			{
				element11.style.display = "none";
			}
		}
	}
	if( ( codServicio != "TANFS"||codServicio != "TANFE"))
	{
		var element0 = document.getElementById("SEGURO_SOCIAL_JEFE_SERV.0.0");
		if (element0)
		{
			setNextObject("SEGURO_SOCIAL_JEFE_SERV","SERV_SOST");
			element0.style.nextobject="SERV_SOST.0.0";
		}
		var element = document.getElementById("SS_TXT1.0.0");
		if (element) 
		{
			element.style.display = "none";
		}
		var element1 = document.getElementById("SS_TXT2.0.0");
		if (element1) 
		{
			element1.style.display = "none";
		}
		var element2 = document.getElementById("SS_TXT3.0.0");
		if (element2) 
		{
			element2.style.display = "none";
		}
		var element3 = document.getElementById("SS_TXT4.0.0");
		if (element3) 
		{
			element3.style.display = "none";
		}
		var element4 = document.getElementById("SS_TXT5.0.0");
		if (element4) 
		{
			element4.style.display = "none";
		}
		var element5 = document.getElementById("SS_TXT6.0.0");
		if (element5) 
		{
			element5.style.display = "none";
		}
		var element6 = document.getElementById("ID_ACTIVIDAD.0.0");
		if (element6) 
		{
			element6.style.display = "none";
		}
		var element7 = document.getElementById("SERV_SOST.0.0");
		if (element7) 
		{
			element7.style.display = "none";
		}
		var element8 = document.getElementById("TIPO_TRANS.0.0");
		if (element8) 
		{
			element8.style.display = "none";
		}
		var element9 = document.getElementById("TIPO_ALMU.0.0");
		if (element9) 
		{
			element9.style.display = "none";
		}
		var element10 = document.getElementById("NUM_DIAS_ACT.0.0");
		if (element10) 
		{
			element10.style.display = "none";
		}
		var element11 = document.getElementById("PAGO_SOST.0.0");
		if (element11) 
		{
			element11.style.display = "none";
		}
		var element12 = document.getElementById("ACTIVIDAD.0.0");
		if (element12) 
		{
			element12.style.display = "none";
		}
		var element13 = document.getElementById("SERV_DESC.0.0");
		if (element13) 
		{
			element13.style.display = "none";
		}
		var element14 = document.getElementById("TRAN_DESC.0.0");
		if (element14) 
		{
			element14.style.display = "none";
		}
		var element15 = document.getElementById("DIET_DESC.0.0");
		if (element15) 
		{
			element15.style.display = "none";
		}
		var element16 = document.getElementById("SS_TXT7.0.0");
		if (element16) 
		{
			element16.style.display = "none";
		}
		var element17 = document.getElementById("SS_TXT8.0.0");
		if (element17) 
		{
			element17.style.display = "none";
		}
		var element18 = document.getElementById("ESNEGATIVO.0.0");
		if (element18) 
		{
			element18.style.display = "none";
		}
		var element19 = document.getElementById("AJUSTE_SOST.0.0");
		if (element19) 
		{
			element19.style.display = "none";
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
