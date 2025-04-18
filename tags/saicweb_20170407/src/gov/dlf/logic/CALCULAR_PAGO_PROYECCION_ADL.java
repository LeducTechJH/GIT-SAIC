package gov.dlf.logic;


import gov.dlf.external.*;
import gov.dlf.facade.*;
import gov.dlf.presentation.*;


import java.text.DecimalFormat;
import java.util.*;

import net.maintrend.appmanager.*;
import net.maintrend.datamanager.*;
import net.maintrend.interfaces.*;
import net.maintrend.interlink.*;
import net.maintrend.mdi.*;
import net.maintrend.rallyengine.*;
import net.maintrend.util.*;
import net.maintrend.util.format.*;



/**
 * __Comment
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class CALCULAR_PAGO_PROYECCION_ADL
extends ADL
{
	// -------------------------------------------------------------------
	// ----------   Class Attributes   -----------------------------------

	/**  */
	public static boolean staticCall = true;

	public int tipo =0;

	public boolean doc_activI = true;

	public boolean doc_activC = true;

	public boolean doc_activH = true;

	public double max_serv_prov_comp = 0;

	public double max_serv_prov_part = 0;

	public double OPEN_ID = 0;

	public double STATUS_ID = 0;

	public double OPEN1_ID = 0;

	public double STATUS1_ID = 0;

	public double EDAD = 0;

	public double PROVEEDORES_TABLE = 0;

	public double PROV_VIGENCIAS_TABLE = 0;

	public double CONTRATOS_CUIDO_TABLE = 0;

	public double PROVEEDORES_STATUS = 0;

	public double PROV_VIGENCIAS_STATUS = 0;

	public double CONTRATOS_CUIDO_STATUS = 0;

	public String TIPO_PROVEEDOR = "";

	public DataStore CLIENTES2_DSD = null;

	public DataStore PROVEEDORES_TBL_DSD = null;

	public DataStore PROV_VIGENCIAS2_DSD = null;

	public DataStore CONTRATO_CUIDO_DSD = null;

	public DataStore TARIFA_PROVEEDORES_DSD = null;

	// -------------------------------------------------------------------
	// ----------   Instance Attributes   --------------------------------

	/**  */
	public SAIC_DMQ_ORA_Application app;
	/**  */
	public RallyDataManager dm = null;



	// -------------------------------------------------------------------
	// ----------   Instance Condition Attributes   ----------------------



	// -------------------------------------------------------------------
	// ----------   Instance Export Attributes   -------------------------





	// -------------------------------------------------------------------
	// ----------   Instance Attributes' Access Methods   ----------------





	// -------------------------------------------------------------------
	// ----------   Methods   --------------------------------------------

	/**
	 * 
	 * @param __app
	 * @return
	 */
	public static CALCULAR_PAGO_PROYECCION_ADL get ( RallyApplication __app )
	{
		CALCULAR_PAGO_PROYECCION_ADL adl = new CALCULAR_PAGO_PROYECCION_ADL ( );
		__app.register ( adl, "CALCULAR_PAGO_PROYECCION_ADL" );
		__app.setADL ( CALCULAR_PAGO_PROYECCION_ADL.class, adl ); 
		adl.setApplication ( __app );
		return adl;
	}


	/**
	 *
	 * @param __app
	 * @param ps
	 *
	 * @return
	 */
	public static void exec ( RallyApplication __app, ParameterSet ps )
	{
		CALCULAR_PAGO_PROYECCION_ADL.get ( __app ).process ( ps );
	}


	/**
	 *
	 * @param __app
	 *
	 * @return
	 */
	public static void exec ( RallyApplication __app )
	{
		ParameterSet ps = null;
		CALCULAR_PAGO_PROYECCION_ADL.exec ( __app, ps );
	}


	/**
	 * Overrides the ancestor's method
	 * 
	 * @param __app
	 */
	public void setApplication ( RallyApplication __app )
	{
		this.app = ( SAIC_DMQ_ORA_Application ) __app;
		if ( this.app != null )
		{
			this.dm = ( RallyDataManager ) this.app.getDataManager ( );
		}
	}


	/**
	 * Overrides the ancestor's method
	 * 
	 * @param parms
	 */
	public void execute ( ParameterSet parms )
	{
		this.process ( parms );
	}




	/**
	 *
	 */
	protected void doReturn ( )
	{
		this.unregister ( );
	}


	/**
	 *
	 */
	public void unregister ( )
	{
		this.app.unregister ( this );
		IRegisteredObject rObj = this.app.get ( "CALCULAR_PAGO_PROYECCION_ADL" );
		if ( rObj != null && rObj instanceof CALCULAR_PAGO_PROYECCION_ADL )
		{
			this.app.setADL ( CALCULAR_PAGO_PROYECCION_ADL.class, ( CALCULAR_PAGO_PROYECCION_ADL ) rObj );
		}
	}


	/**
	 * Overrides the ancestor's method
	 * 
	 * @param ps
	 */
	protected void process ( ParameterSet ps )
	{
		Debug.println ( Debug.TRACE, "CALCULAR_PAGO_PROYECCION_ADL Step " + this.currentStep );
		super.process ( ps );
		switch ( this.currentStep ) 
		{
		case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
		case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
		case 2:  { this.currentStep ++; this.step2 ( this.keyParms ); break; }
		default: 
		{ 
			this.currentStep = 0;
			Debug.println ( Debug.TRACE, "CALCULAR_PAGO_PROYECCION_ADL ended" );
			this.unregister ( );
			break;
		}
		}
		if ( this.currentStep > 0 ) this.app.goOn ( );
	}
	protected void step0 ( ParameterSet ps )
	{
		this.app.ACCESS_STATUS_GBL = "";
		this.app.COD_ACCESS_GBL = "NINO";
		SECURITY_ADL.exec ( this.app );
		return;
	}
	protected void step1 ( ParameterSet ps )
	{

		PROVEEDORES_TBL_DSD = this.dm.create ( "PROVEEDORES_TBL_DSD" );
		PROVEEDORES_TABLE = PROVEEDORES_TBL_DSD.getId ( );
		PROVEEDORES_STATUS = RallyDataStoreException.getDefault ( );
		if ( ! Compare.equals ( PROVEEDORES_STATUS, 0 ) ) 
		{
			this.app.setError ( 0, PROVEEDORES_STATUS );
		}

		PROVEEDORES_STATUS  = this.dm.reset ( PROVEEDORES_TABLE );

		this.dm.setField ( this.dm.get ( "PROVEEDORES_TBL_DSD" ), "ID_PROVEEDOR", this.app.form ( "CONTRATO_PROYECCION_FR" ).getDoubleItem ( "ID_PROVEEDOR" ));
		PROVEEDORES_STATUS  = this.dm.limitQueryFromBuffer ( PROVEEDORES_TABLE );
		PROVEEDORES_STATUS  = this.dm.retrieve ( PROVEEDORES_TABLE );
		PROVEEDORES_STATUS  = this.dm.firstRow ( PROVEEDORES_TABLE );
		if ( Compare.equals ( PROVEEDORES_STATUS, 0 ) ) 
		{        
			TIPO_PROVEEDOR = this.dm.getFieldString ( this.dm.get ( "PROVEEDORES_TBL_DSD" ), "TIPO_PROVEEDOR" );

			//DOCUMENTS VALIDATION LOGIC

			if(Compare.equals(TIPO_PROVEEDOR, "CENTRO CUIDO"))
			{
				tipo=1;
			}
			else if(Compare.equals(TIPO_PROVEEDOR, "INFORMAL"))
			{
				tipo=2;
			}
			else if(Compare.equals(TIPO_PROVEEDOR, "HOGAR LIC."))
			{
				tipo=3;
			}
			switch (tipo)
			{
			case 1:
			{
				if (Compare.equals(this.dm.getFieldString ( this.dm.get ( "PROVEEDORES_TBL_DSD" ), "LIC_DPT_FAM_FLG" ), "X") )
				{
					if (( Compare.lt ( this.dm.getFieldDate ( this.dm.get ( "PROVEEDORES_TBL_DSD" ), "HASTA_LIC" ), this.app.SYSTEM_DATE ))   )
					{
						doc_activC = false;
					}
					else
					{
						doc_activC =true;
					}
				}
				else
				{
					this.app.setError("0", "A este Centro de Cuido le hace falta algun documento.");
					doc_activC = false;
				}
				break;
			}
			case 2:
			{
				if ( (Compare.equals(this.dm.getFieldString ( this.dm.get ( "PROVEEDORES_TBL_DSD" ), "CERT_COND_FLG" ), "X") &&
						(Compare.equals(this.dm.getFieldString ( this.dm.get ( "PROVEEDORES_TBL_DSD" ), "CERT_SALU_FLG" ), "X")) )
						)
				{
					if (( Compare.lt ( this.dm.getFieldDate ( this.dm.get ( "PROVEEDORES_TBL_DSD" ), "HASTA_COND" ), this.app.SYSTEM_DATE ))  ||
							(  Compare.lt ( this.dm.getFieldDate ( this.dm.get ( "PROVEEDORES_TBL_DSD" ), "HASTA_SALU" ), this.app.SYSTEM_DATE )) )
					{
						doc_activI = false;
					}
					else
					{
						doc_activI =true;
					}
				}
				else
				{
					this.app.setError("0", "A este proveedor informal le hace falta algun documento.");
					doc_activI = false;
				}
				break;
			}
			case 3:
			{
				if ( (Compare.equals(this.dm.getFieldString ( this.dm.get ( "PROVEEDORES_TBL_DSD" ), "CERT_COND_FLG" ), "X") &&
						(Compare.equals(this.dm.getFieldString ( this.dm.get ( "PROVEEDORES_TBL_DSD" ), "CERT_SALU_FLG" ), "X")) )
						)
				{
					if (( Compare.lt ( this.dm.getFieldDate ( this.dm.get ( "PROVEEDORES_TBL_DSD" ), "HASTA_COND" ), this.app.SYSTEM_DATE ))  &&
							(  Compare.lt ( this.dm.getFieldDate ( this.dm.get ( "PROVEEDORES_TBL_DSD" ), "HASTA_SALU" ), this.app.SYSTEM_DATE ) )
							)
					{
						doc_activH = false;
					}
					else
					{
						doc_activH =true;
					}		
				}
				else
				{
					this.app.setError("0", "A este Hogar Licenciado le hace falta algun documento.");
					doc_activH = false;
				}
				break;
			}
			default: 				 
				break;			
			}				
		}
		//DOCUMENTS VALIDATION LOGIC END

		//MAX BENEFIT PER SERVICE LOGIC
		CONTRATO_CUIDO_DSD = this.dm.create ( "CONTRATO_CUIDO_DSD" );
		CONTRATOS_CUIDO_TABLE = CONTRATO_CUIDO_DSD.getId ( );
		CONTRATOS_CUIDO_STATUS = RallyDataStoreException.getDefault ( );
		if ( ! Compare.equals ( CONTRATOS_CUIDO_STATUS, 0 ) ) 
		{
			this.app.setError ( 0, CONTRATOS_CUIDO_STATUS );
		}

		CONTRATOS_CUIDO_STATUS  = this.dm.reset ( CONTRATOS_CUIDO_TABLE );

		this.dm.setField ( this.dm.get ( "CONTRATO_CUIDO_DSD" ), "ID_PROVEEDOR", this.app.form ( "CONTRATO_PROYECCION_FR" ).getDoubleItem ( "ID_PROVEEDOR" ));
		CONTRATOS_CUIDO_STATUS  = this.dm.limitQueryFromBuffer ( CONTRATOS_CUIDO_TABLE );
		CONTRATOS_CUIDO_STATUS  = this.dm.retrieve ( CONTRATOS_CUIDO_TABLE );
		CONTRATOS_CUIDO_STATUS  = this.dm.firstRow ( CONTRATOS_CUIDO_TABLE );
		if (Compare.equals(CONTRATOS_CUIDO_STATUS, 0))
		{
			max_serv_prov_comp = this.dm.getFieldDouble( this.dm.get ( "CONTRATO_CUIDO_DSD" ), "TIEMPO_COMP" );
			max_serv_prov_part = this.dm.getFieldDouble( this.dm.get ( "CONTRATO_CUIDO_DSD" ), "TIEMPO_PART" );
		}
		else
		{
			this.app.setError("0", "El proveedor seleccionado no tiene servicios activos disponibles.");
		}

		CONTRATOS_CUIDO_STATUS = this.dm.dbClose(CONTRATOS_CUIDO_TABLE);
		//MAX BENEFIT PER SERVICE LOGIC END

		PROVEEDORES_STATUS  = this.dm.dbClose ( PROVEEDORES_TABLE );
		return;
	}

	protected void step2 ( ParameterSet ps )
	{
		double dias_asis = this.app.form ( "CONTRATO_PROYECCION_FR" ).getDoubleItem ( "DIAS_ASIS" );
		double dias_asis_part = this.app.form ( "CONTRATO_PROYECCION_FR" ).getDoubleItem ( "DIAS_ASIS_PART" );
		double dias_labs = this.app.form ( "CONTRATO_PROYECCION_FR" ).getDoubleItem ( "DIAS_LABORABLES" );
		double rate_comp = 0;
		double rate_part = 0;
		CLIENTES2_DSD = this.dm.create ( "CLIENTES2_DSD" );

		OPEN_ID = CLIENTES2_DSD.getId ( );
		STATUS_ID = RallyDataStoreException.getDefault ( );
		STATUS_ID  = this.dm.reset ( OPEN_ID );

		this.dm.setField ( this.dm.get ( "CLIENTES2_DSD" ), "SEGURO_SOCIAL_CLIENTE", this.app.form ( "CONTRATO_PROYECCION_FR" ).getDoubleItem ( "SEG_SOC_CLIENTE" ) );

		STATUS_ID  = this.dm.limitQueryFromBuffer ( OPEN_ID );
		STATUS_ID  = this.dm.retrieve ( OPEN_ID );
		STATUS_ID  = this.dm.firstRow ( OPEN_ID );

		if ( Compare.equals ( STATUS_ID, 0 ))
		{
			String categoria = "";
			double tarifa_comp = 0;
			double tarifa_part = 0;
			EDAD = DateUtil.monthsBetween ( this.app.SYSTEM_DATE, this.dm.getFieldDate ( this.dm.get ( "CLIENTES2_DSD" ), "FCH_NACIMIENTO" ) ) / 12;
			if  ( Compare.lt(  EDAD, 3 ) )  
			{
				categoria = "INFANTES 0-2 CON 11 MESES";
			}
			else if ( Compare.gt( EDAD, 2 ) &&  ( Compare.lt(  EDAD, 5 ) ) )  
			{
				categoria = "PRE_ESCOLARES 3-4 CON 11 MESES";
			}
			else if ( Compare.gt( EDAD, 4 ) &&  ( Compare.lt(  EDAD, 13 ) ) )  
			{
				categoria = "ESCOLARES 5-12 CON 11 MESES";
			}
			else
			{
				categoria = "NECESIDAD ESPECIAL";
			}
			//RATE CALCULATOR
			TARIFA_PROVEEDORES_DSD = this.dm.create ( "TARIFA_PROVEEDORES_DSD" );
			OPEN1_ID = TARIFA_PROVEEDORES_DSD.getId ( );
			STATUS1_ID = RallyDataStoreException.getDefault ( );
			if ( ! Compare.equals ( STATUS1_ID, 0 ) ) 
			{
				this.app.setError ( 0, STATUS1_ID );
			}

			STATUS1_ID  = this.dm.reset ( OPEN1_ID );

			this.dm.setField ( this.dm.get ( "TARIFA_PROVEEDORES_DSD" ), "TIPO_PROVEEDOR", TIPO_PROVEEDOR);
			this.dm.setField ( this.dm.get ( "TARIFA_PROVEEDORES_DSD" ), "CATEGORIA",categoria);

			STATUS1_ID  = this.dm.limitQueryFromBuffer ( OPEN1_ID );
			STATUS1_ID  = this.dm.retrieve ( OPEN1_ID );
			STATUS1_ID  = this.dm.firstRow ( OPEN1_ID );
			//TODO AJUSTE
			//COLUMNA AUTORIZACION
			if ( Compare.equals ( STATUS1_ID, 0 ) ) 
			{
				tarifa_comp = this.dm.getFieldDouble( this.dm.get ( "TARIFA_PROVEEDORES_DSD" ), "TARIFA_TIEMPO_COMP" );
				tarifa_part = this.dm.getFieldDouble( this.dm.get ( "TARIFA_PROVEEDORES_DSD" ), "TARIFA_TIEMPO_PART" );

				double costo_comp = this.app.form ( "CONTRATO_PROYECCION_FR" ).getDoubleItem("TIEMPO_COMP");
				double costo_part = this.app.form ( "CONTRATO_PROYECCION_FR" ).getDoubleItem("TIEMPO_PART");

				if(Compare.gt(costo_comp, tarifa_comp))
				{
					this.app.setError("0", "El costo por tiempo completo sobrepasa el limite establecido.");
					this.app.ACCESS_STATUS_GBL = "FAILURE";
				}
				else if(Compare.gt(costo_part, tarifa_part))
				{
					this.app.setError("0", "El costo por tiempo parcial sobrepasa el limite establecido.");
					this.app.ACCESS_STATUS_GBL = "FAILURE";
				}
				else if ( ! doc_activI )
				{
					this.app.setError("0", "La vigencia de los documentos de este proveedor Informal estan vencidas y/o incompletas.");
					this.app.ACCESS_STATUS_GBL = "FAILURE";
				}
				else if ( ! doc_activH )
				{
					this.app.setError("0", "La vigencia de los documentos de este Hogar Licenciado estan vencidas y/o incompletas.");
					this.app.ACCESS_STATUS_GBL = "FAILURE";
				}
				else if ( ! doc_activC )
				{
					this.app.setError("0", "La vigencia de los documentos de este Centro de Cuido estan vencidas y/o incompletas.");
					this.app.ACCESS_STATUS_GBL = "FAILURE";
				}
				else 
				{
					rate_comp = costo_comp  / dias_labs;
					rate_part = costo_part  / dias_labs;

					DecimalFormat df = new DecimalFormat("#.##");  
					rate_comp = Double.valueOf(df.format(rate_comp));
					rate_part = Double.valueOf(df.format(rate_part));
					double pago =0;
					if ( Compare.gt ( rate_comp, max_serv_prov_comp ) || Compare.gt ( rate_part, max_serv_prov_part ) )
					{
						this.app.setError("0", "Las tarifas calculados sobrepasan las establecidas en el contrato.");
					}
					else
					{
						if(Compare.equals(tipo, 1) || Compare.equals(tipo, 3))
						{
							pago = MathService.plus(TruncService.round (costo_comp),TruncService.round (costo_part));
							this.app.form ( "CONTRATO_PROYECCION_FR" ).setItem ( "PAGO", pago); 
						}
						else
						{
							pago = MathService.plus(TruncService.round (rate_comp * dias_asis),TruncService.round (rate_part * dias_asis_part));
							if(Compare.gt(this.app.form ( "CONTRATO_PROYECCION_FR" ).getDoubleItem("AJUSTE"),0 ))
							{
								double ajuste =this.app.form ( "CONTRATO_PROYECCION_FR" ).getDoubleItem("AJUSTE");
								if(Compare.equals(this.app.form ( "CONTRATO_PROYECCION_FR" ).getStringItem("ESNEGATIVO"),"D" ))
								{
									pago = MathService.minus(pago, ajuste);
								}
								else if(Compare.equals(this.app.form ( "CONTRATO_PROYECCION_FR" ).getStringItem("ESNEGATIVO"),"A" ))
								{
									pago = MathService.plus(pago, ajuste);
								}
							}
							this.app.form ( "CONTRATO_PROYECCION_FR" ).setItem ( "PAGO", pago); 
							//this.app.form ( "CONTRATO_PROYECCION_FR" ).setItem ( "ESTATUS", "ACTIVO");
						}
					}
				}				
			}
			else
			{
				this.app.setError("0", "Validar informacion sobre la tarifa y/o edad del participante.");
			}
			STATUS_ID  = this.dm.dbClose ( OPEN_ID );
			STATUS1_ID  = this.dm.dbClose ( OPEN1_ID );
		}
		if ( Compare.equals(this.app.ACCESS_STATUS_GBL, "FAILURE"))
		{
			this.app.form ( "CONTRATO_PROYECCION_FR" ).setItem ( "PAGO", 0);
			this.app.form ( "CONTRATO_PROYECCION_FR" ).setItem ( "DIAS_ASIS", 0);
			this.app.form ( "CONTRATO_PROYECCION_FR" ).setItem ( "DIAS_ASIS_PART", 0);
			return;
		}
	}
}



/* ---------------------------------------------------------------------



PROCEDURE QUITAR_GUIONES_ADL;
BEGIN
SET_TRACE();
  AGENCIAS_CLIENTE_FR.DSC_AGENCIA_NUM_CASO :=

  TO_CHAR(AGENCIAS_CLIENTE_FR.DSC_AGENCIA_CASO_SCREEN);


SET_NOTRACE();
END;





--------------------------------------------------------------------- */
