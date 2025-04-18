package gov.dlf.logic;


import gov.dlf.external.*;
import gov.dlf.facade.*;
import gov.dlf.presentation.*;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

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
public class BUSCAR_BASE_INCORRECTA_ADL
extends ADL
{
	// -------------------------------------------------------------------
	// ----------   Class Attributes   -----------------------------------

	/**  */
	public static boolean staticCall = false;



	// -------------------------------------------------------------------
	// ----------   Instance Attributes   --------------------------------

	/**  */
	public SAIC_DMQ_ORA_Application app;
	/**  */
	public RallyDataManager dm = null;



	// -------------------------------------------------------------------
	// ----------   Instance Condition Attributes   ----------------------

	public boolean _condition0 = false;

	public boolean _condition1 = false;

	public boolean _condition2 = false;

	public boolean _condition3 = false;



	// -------------------------------------------------------------------
	// ----------   Instance Export Attributes   -------------------------

	public double INCORRECTA_ID = 0;

	public double INCORRECTA_STATUS = 0;

	public double CORRECTA_ID = 0;

	public double CORRECTA_STATUS = 0;

	public double CENTRAL_ID = 0;

	public double CENTRAL_STATUS = 0;

	public double RECLA_ID = 0;

	public double RECLA_STATUS = 0;

	public double NUM_MIEMBROS = 0;

	public double NUM_NULO = 0;
	public double NUM_AUTO = 0;
	public double BENEFICIO_CALCULADO = 0;
	public double COUNT=0;
	public double BENE_REC_ID = 0;
	public double BENE_REC_STATUS = 0;
	public String TIPO_EMISION=null;

	public DataStore LLENA_BENE_REC_DSD = null;

	public Date FECHA_BENEFICIO = null;

	public Date FECHA = null;

	public Date FECHA_RECLA_ORIGINAL = null;



	// -------------------------------------------------------------------
	// ----------   Instance Attributes' Access Methods   ----------------


	/**  */
	public static void setINCORRECTA_ID  ( RallyApplication __app, Parameter value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).INCORRECTA_ID = value.getDouble ( );
	}


	/**  */
	public static void setINCORRECTA_STATUS  ( RallyApplication __app, Parameter value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).INCORRECTA_STATUS = value.getDouble ( );
	}


	/**  */
	public static void setCORRECTA_ID  ( RallyApplication __app, Parameter value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).CORRECTA_ID = value.getDouble ( );
	}


	/**  */
	public static void setCORRECTA_STATUS  ( RallyApplication __app, Parameter value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).CORRECTA_STATUS = value.getDouble ( );
	}


	/**  */
	public static void setCENTRAL_ID  ( RallyApplication __app, Parameter value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).CENTRAL_ID = value.getDouble ( );
	}


	/**  */
	public static void setCENTRAL_STATUS  ( RallyApplication __app, Parameter value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).CENTRAL_STATUS = value.getDouble ( );
	}


	/**  */
	public static void setRECLA_ID  ( RallyApplication __app, Parameter value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).RECLA_ID = value.getDouble ( );
	}


	/**  */
	public static void setRECLA_STATUS  ( RallyApplication __app, Parameter value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).RECLA_STATUS = value.getDouble ( );
	}


	/**  */
	public static void setNUM_MIEMBROS  ( RallyApplication __app, Parameter value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).NUM_MIEMBROS = value.getDouble ( );
	}


	/**  */
	public static void setFECHA  ( RallyApplication __app, Parameter value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).FECHA = value.getDate ( );
	}


	/**  */
	public static void setNUM_NULO  ( RallyApplication __app, Parameter value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).NUM_NULO = value.getDouble ( );
	}


	/**  */
	public static void setFECHA_RECLA_ORIGINAL  ( RallyApplication __app, Parameter value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).FECHA_RECLA_ORIGINAL = value.getDate ( );
	}



	/**  */
	public static Date getFECHA  ( RallyApplication __app )
	{
		return ( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).FECHA;
	}


	/**  */
	public static void setFECHA  ( RallyApplication __app, Date value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).FECHA = value;
	}


	/**  */
	public static void setFECHA  ( RallyApplication __app, Object value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).FECHA = ( Date ) value;
	}
	//TODO
	public static void setNUM_AUTO  ( RallyApplication __app, Parameter value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).NUM_AUTO = value.getDouble();
	}

	public static double getNUM_AUTO  ( RallyApplication __app )
	{
		return ( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).NUM_AUTO;
	}


	/**  */
	public static void setNUM_AUTO  ( RallyApplication __app, double value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).NUM_AUTO = value;
	}


	/**  */
	public static void setNUM_AUTO  ( RallyApplication __app, Object value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).NUM_AUTO = ( double ) value;
	}
	////////
	public static void setBENEFICIO_CALCULADO  ( RallyApplication __app, Parameter value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).BENEFICIO_CALCULADO = value.getDouble();
	}

	public static double getBENEFICIO_CALCULADO  ( RallyApplication __app )
	{
		return ( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).BENEFICIO_CALCULADO;
	}


	/**  */
	public static void setBENEFICIO_CALCULADO  ( RallyApplication __app, double value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).BENEFICIO_CALCULADO = value;
	}


	/**  */
	public static void setBENEFICIO_CALCULADO  ( RallyApplication __app, Object value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).BENEFICIO_CALCULADO = ( double ) value;
	}
	///////
	public static void setTIPO_EMISION  ( RallyApplication __app, Parameter value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).TIPO_EMISION = value.getString();
	}

	public static String getTIPO_EMISION  ( RallyApplication __app )
	{
		return ( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).TIPO_EMISION;
	}


	/**  */
	public static void setTIPO_EMISION  ( RallyApplication __app, String value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).TIPO_EMISION = value;
	}


	/**  */
	public static void setTIPO_EMISION  ( RallyApplication __app, Object value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).TIPO_EMISION = ( String ) value;
	}
	//TODO


	/**  */
	public static Date getFECHA_RECLA_ORIGINAL  ( RallyApplication __app )
	{
		return ( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).FECHA_RECLA_ORIGINAL;
	}


	/**  */
	public static void setFECHA_RECLA_ORIGINAL  ( RallyApplication __app, Date value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).FECHA_RECLA_ORIGINAL = value;
	}


	/**  */
	public static void setFECHA_RECLA_ORIGINAL  ( RallyApplication __app, Object value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).FECHA_RECLA_ORIGINAL = ( Date ) value;
	}




	/**  */
	public static double getINCORRECTA_ID  ( RallyApplication __app )
	{
		return ( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).INCORRECTA_ID;
	}


	/**  */
	public static Double getINCORRECTA_IDDouble ( RallyApplication __app )
	{
		return new Double ( ( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).INCORRECTA_ID );
	}


	/**  */
	public static void setINCORRECTA_ID  ( RallyApplication __app, double value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).INCORRECTA_ID = value;
	}


	/**  */
	public static void setINCORRECTA_ID  ( RallyApplication __app, Object value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).INCORRECTA_ID = ( ( Double ) value ).doubleValue ( );
	}


	/**  */
	public static double getINCORRECTA_STATUS  ( RallyApplication __app )
	{
		return ( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).INCORRECTA_STATUS;
	}


	/**  */
	public static Double getINCORRECTA_STATUSDouble ( RallyApplication __app )
	{
		return new Double ( ( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).INCORRECTA_STATUS );
	}


	/**  */
	public static void setINCORRECTA_STATUS  ( RallyApplication __app, double value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).INCORRECTA_STATUS = value;
	}


	/**  */
	public static void setINCORRECTA_STATUS  ( RallyApplication __app, Object value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).INCORRECTA_STATUS = ( ( Double ) value ).doubleValue ( );
	}


	/**  */
	public static double getCORRECTA_ID  ( RallyApplication __app )
	{
		return ( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).CORRECTA_ID;
	}


	/**  */
	public static Double getCORRECTA_IDDouble ( RallyApplication __app )
	{
		return new Double ( ( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).CORRECTA_ID );
	}


	/**  */
	public static void setCORRECTA_ID  ( RallyApplication __app, double value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).CORRECTA_ID = value;
	}


	/**  */
	public static void setCORRECTA_ID  ( RallyApplication __app, Object value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).CORRECTA_ID = ( ( Double ) value ).doubleValue ( );
	}


	/**  */
	public static double getCORRECTA_STATUS  ( RallyApplication __app )
	{
		return ( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).CORRECTA_STATUS;
	}


	/**  */
	public static Double getCORRECTA_STATUSDouble ( RallyApplication __app )
	{
		return new Double ( ( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).CORRECTA_STATUS );
	}


	/**  */
	public static void setCORRECTA_STATUS  ( RallyApplication __app, double value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).CORRECTA_STATUS = value;
	}


	/**  */
	public static void setCORRECTA_STATUS  ( RallyApplication __app, Object value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).CORRECTA_STATUS = ( ( Double ) value ).doubleValue ( );
	}


	/**  */
	public static double getCENTRAL_ID  ( RallyApplication __app )
	{
		return ( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).CENTRAL_ID;
	}


	/**  */
	public static Double getCENTRAL_IDDouble ( RallyApplication __app )
	{
		return new Double ( ( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).CENTRAL_ID );
	}


	/**  */
	public static void setCENTRAL_ID  ( RallyApplication __app, double value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).CENTRAL_ID = value;
	}


	/**  */
	public static void setCENTRAL_ID  ( RallyApplication __app, Object value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).CENTRAL_ID = ( ( Double ) value ).doubleValue ( );
	}


	/**  */
	public static double getCENTRAL_STATUS  ( RallyApplication __app )
	{
		return ( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).CENTRAL_STATUS;
	}


	/**  */
	public static Double getCENTRAL_STATUSDouble ( RallyApplication __app )
	{
		return new Double ( ( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).CENTRAL_STATUS );
	}


	/**  */
	public static void setCENTRAL_STATUS  ( RallyApplication __app, double value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).CENTRAL_STATUS = value;
	}


	/**  */
	public static void setCENTRAL_STATUS  ( RallyApplication __app, Object value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).CENTRAL_STATUS = ( ( Double ) value ).doubleValue ( );
	}


	/**  */
	public static double getRECLA_ID  ( RallyApplication __app )
	{
		return ( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).RECLA_ID;
	}


	/**  */
	public static Double getRECLA_IDDouble ( RallyApplication __app )
	{
		return new Double ( ( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).RECLA_ID );
	}


	/**  */
	public static void setRECLA_ID  ( RallyApplication __app, double value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).RECLA_ID = value;
	}


	/**  */
	public static void setRECLA_ID  ( RallyApplication __app, Object value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).RECLA_ID = ( ( Double ) value ).doubleValue ( );
	}


	/**  */
	public static double getRECLA_STATUS  ( RallyApplication __app )
	{
		return ( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).RECLA_STATUS;
	}


	/**  */
	public static Double getRECLA_STATUSDouble ( RallyApplication __app )
	{
		return new Double ( ( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).RECLA_STATUS );
	}


	/**  */
	public static void setRECLA_STATUS  ( RallyApplication __app, double value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).RECLA_STATUS = value;
	}


	/**  */
	public static void setRECLA_STATUS  ( RallyApplication __app, Object value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).RECLA_STATUS = ( ( Double ) value ).doubleValue ( );
	}


	/**  */
	public static double getNUM_MIEMBROS  ( RallyApplication __app )
	{
		return ( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).NUM_MIEMBROS;
	}


	/**  */
	public static Double getNUM_MIEMBROSDouble ( RallyApplication __app )
	{
		return new Double ( ( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).NUM_MIEMBROS );
	}


	/**  */
	public static void setNUM_MIEMBROS  ( RallyApplication __app, double value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).NUM_MIEMBROS = value;
	}


	/**  */
	public static void setNUM_MIEMBROS  ( RallyApplication __app, Object value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).NUM_MIEMBROS = ( ( Double ) value ).doubleValue ( );
	}


	/**  */
	public static double getNUM_NULO  ( RallyApplication __app )
	{
		return ( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).NUM_NULO;
	}


	/**  */
	public static Double getNUM_NULODouble ( RallyApplication __app )
	{
		return new Double ( ( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).NUM_NULO );
	}


	/**  */
	public static void setNUM_NULO  ( RallyApplication __app, double value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).NUM_NULO = value;
	}


	/**  */
	public static void setNUM_NULO  ( RallyApplication __app, Object value )
	{
		( ( BUSCAR_BASE_INCORRECTA_ADL ) __app.getADL ( BUSCAR_BASE_INCORRECTA_ADL.class ) ).NUM_NULO = ( ( Double ) value ).doubleValue ( );
	}



	// -------------------------------------------------------------------
	// ----------   Methods   --------------------------------------------

	/**
	 *
	 * @param __app
	 * @return
	 */
	public static BUSCAR_BASE_INCORRECTA_ADL get ( RallyApplication __app )
	{
		BUSCAR_BASE_INCORRECTA_ADL adl = new BUSCAR_BASE_INCORRECTA_ADL ( );
		__app.register ( adl, "BUSCAR_BASE_INCORRECTA_ADL" );
		__app.setADL ( BUSCAR_BASE_INCORRECTA_ADL.class, adl );
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
		BUSCAR_BASE_INCORRECTA_ADL.get ( __app ).process ( ps );
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
		BUSCAR_BASE_INCORRECTA_ADL.exec ( __app, ps );
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
		IRegisteredObject rObj = this.app.get ( "BUSCAR_BASE_INCORRECTA_ADL" );
		if ( rObj != null && rObj instanceof BUSCAR_BASE_INCORRECTA_ADL )
		{
			this.app.setADL ( BUSCAR_BASE_INCORRECTA_ADL.class, ( BUSCAR_BASE_INCORRECTA_ADL ) rObj );
		}
	}


	/**
	 * Overrides the ancestor's method
	 *
	 * @param ps
	 */
	protected void process ( ParameterSet ps )
	{
		Debug.println ( Debug.TRACE, "BUSCAR_BASE_INCORRECTA_ADL Step " + this.currentStep );
		super.process ( ps );
		switch ( this.currentStep )
		{
		case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
		case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
		case 2:  { this.currentStep ++; this.step2 ( this.keyParms ); break; }
		case 3:  { this.currentStep ++; this.step3 ( this.keyParms ); break; }
		case 4:  { this.currentStep ++; this.step4 ( this.keyParms ); break; }
		case 5:  { this.currentStep ++; this.step5 ( this.keyParms ); break; }
		case 6:  { this.currentStep ++; this.step6 ( this.keyParms ); break; }
		case 7:  { this.currentStep ++; this.step7 ( this.keyParms ); break; }
		default:
		{
			this.currentStep = 0;
			Debug.println ( Debug.TRACE, "BUSCAR_BASE_INCORRECTA_ADL ended" );
			this.unregister ( );
			break;
		}
		}
		if ( this.currentStep > 0 ) this.app.goOn ( );
	}



	/**
	 *
	 */
	protected void step0 ( ParameterSet ps )
	{

		NUM_MIEMBROS = 0;
		NUM_NULO = TruncService.setNull ( NUM_NULO  );
		UPLOAD_TABLES_ADL.exec ( this.app );
		return;

	}


	/**
	 *
	 */
	protected void step1 ( ParameterSet ps )
	{

		if ( ! Compare.equals ( this.app.STATUS_RECLA_GBL, "REFERIDO" ) )
		{
			this._condition0 = true;
		}
		else
		{
			this._condition0 = false;
		}
		if ( this._condition0 )
		{
			if ( ! Compare.equals ( this.app.RAZON_RETRO_GBL, "PAEX" ) )
			{
				this._condition1 = true;
			}
			else
			{
				this._condition1 = false;
			}
			if ( this._condition1 )
			{
				DETERMINAR_RECLAMACION_PKT.exec ( this.app );
				return;
			}
		}

	}


	/**
	 *
	 */
	protected void step2 ( ParameterSet ps )
	{
		if ( this._condition0 )    //    if ( ! Compare.equals ( this.app.STATUS_RECLA_GBL, "REFERIDO" ) )
		{
			if ( this._condition1 )    //      if ( ! Compare.equals ( this.app.RAZON_RETRO_GBL, "PAEX" ) )
			{
			}
			else
			{
				RETRO_PAEX_PKT.exec ( this.app );
				return;
			}
		}

	}


	/**
	 *
	 */
	protected void step3 ( ParameterSet ps )
	{
		if ( this._condition0 )    //    if ( ! Compare.equals ( this.app.STATUS_RECLA_GBL, "REFERIDO" ) )
		{
			if ( this._condition1 )    //      if ( ! Compare.equals ( this.app.RAZON_RETRO_GBL, "PAEX" ) )
			{
			}
			else
			{
			}
		}
		else if ( ! Compare.equals ( this.app.RAZON_RETRO_GBL, "PAEX" )  )
		{
			this._condition2 = true;
		}
		else
		{
			this._condition2 = false;
		}
		if ( this._condition2 )
		{
			// Mod. by JOR - KPG, Inc. on 3/3/2010
			if ( this.app.GBL_DESDE == null )
			{
				this.app.setError ( 1, 1056 );
				this.doReturn ( );
				return;
			}
			// End Mod. by JOR - KPG, Inc. on 3/3/2010
			FECHA = this.app.GBL_DESDE;
			this.process ( ps );
		}

	}


	/**
	 *
	 */
	protected void step4 ( ParameterSet ps )
	{
		if ( this._condition0 )    //    if ( ! Compare.equals ( this.app.STATUS_RECLA_GBL, "REFERIDO" ) )
		{
		}
		else if ( this._condition2 )    //    else if ( ! Compare.equals ( this.app.RAZON_RETRO_GBL, "PAEX" )  )
		{
			if ( Compare.le ( FECHA, this.app.GBL_HASTA ) )
			{
				this._condition3 = true;
			}
			else
			{
				this._condition3 = false;
			}
			if ( this._condition3 )
			{
				DateFormat formatter;
				String fchemipar;
				try 
				{
					Date fechaemision =  FECHA;
					formatter = new SimpleDateFormat("yyyyMM");
					fchemipar = formatter.format(fechaemision);
					LLENA_BENE_REC_DSD = this.dm.create ( "LLENA_BENE_REC_DSD" );
					BENE_REC_ID = LLENA_BENE_REC_DSD.getId ( );
					BENE_REC_STATUS = RallyDataStoreException.getDefault ( );

					BENE_REC_STATUS  = this.dm.reset ( BENE_REC_ID );

					this.dm.setField ( this.dm.get ( "LLENA_BENE_REC_DSD" ), "SEGURO_SOCIAL_JEFE_SERV", this.app.SS_JEFE_SERVICIO_GBL);
					this.dm.setField ( this.dm.get ( "LLENA_BENE_REC_DSD" ), "SEGURO_SOCIAL_JEFE_FAM", this.app.SS_JEFE_FAMILIA_GBL);
					this.dm.setField ( this.dm.get ( "LLENA_BENE_REC_DSD" ), "COD_SERVICIO", this.app.COD_SERV_GBL);
					this.dm.setField ( this.dm.get ( "LLENA_BENE_REC_DSD" ), "FECHA_EMISION_PARAM", fchemipar);
					this.dm.setField ( this.dm.get ( "LLENA_BENE_REC_DSD" ), "ESTATUS_EMISION","EMITIDO");

					BENE_REC_STATUS  = this.dm.limitQueryFromBuffer ( BENE_REC_ID );
					BENE_REC_STATUS  = this.dm.retrieve ( BENE_REC_ID );

					BENE_REC_STATUS  = this.dm.firstRow ( BENE_REC_ID );

					if (  Compare.equals (BENE_REC_STATUS, 0 ))  
					{
						while (Compare.equals (BENE_REC_STATUS, 0 ))
						{
							NUM_MIEMBROS = this.dm.getFieldDouble(this.dm.get ("LLENA_BENE_REC_DSD"), "MIEMBROS");
							NUM_AUTO = this.dm.getFieldDouble(this.dm.get ("LLENA_BENE_REC_DSD"), "NUMERO_AUTORIZACION");

							if(Compare.equals( this.dm.getFieldString(this.dm.get ("LLENA_BENE_REC_DSD"),"TIPO_EMISION_PARAM"),"EME"))
							{
								TIPO_EMISION="E";
								BENEFICIO_CALCULADO  = this.dm.getFieldDouble(this.dm.get ("LLENA_BENE_REC_DSD"), "BENEFICIO_CALCULADO");
							}
							else if(Compare.equals( this.dm.getFieldString(this.dm.get ("LLENA_BENE_REC_DSD"),"TIPO_EMISION_PARAM"),"BON"))
							{
								TIPO_EMISION="B";
							}
							else 
							{
								TIPO_EMISION="R";
								BENEFICIO_CALCULADO  = this.dm.getFieldDouble(this.dm.get ("LLENA_BENE_REC_DSD"), "BENEFICIO_CALCULADO");
							}
							//						if(Compare.lt(NUM_AUTO,0))
							//						{
							//							BENEFICIO_CALCULADO = 0;
							//							TIPO_EMISION="R";
							//							NUM_AUTO=0;
							//							NUM_MIEMBROS=0;
							//						}
							BENE_REC_STATUS  = this.dm.nextRow ( BENE_REC_ID );
						}
					}
					else
					{
						BENEFICIO_CALCULADO = 0;
						TIPO_EMISION="R";
						NUM_AUTO=0;
						NUM_MIEMBROS=0;
					}
				} 
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				this.callParms.clear ( );
				SACP510SP_EPL.exec ( this.app, this.callParms );
				return;
			}
		}

	}


	/**
	 *
	 */
	protected void step5 ( ParameterSet ps )
	{
		if ( this._condition0 )    //    if ( ! Compare.equals ( this.app.STATUS_RECLA_GBL, "REFERIDO" ) )
		{
		}
		else if ( this._condition2 )    //    else if ( ! Compare.equals ( this.app.RAZON_RETRO_GBL, "PAEX" )  )
		{
			if ( this._condition3 )    //      while ( Compare.le ( FECHA, this.app.GBL_HASTA ) )
			{
				FECHA = DateUtil.addMonths ( FECHA, 1 );
				this.currentStep = 4;

				return;
			}
		}

	}


	/**
	 *
	 */
	protected void step6 ( ParameterSet ps )
	{
		if ( this._condition0 )    //    if ( ! Compare.equals ( this.app.STATUS_RECLA_GBL, "REFERIDO" ) )
		{
		}
		else if ( this._condition2 )    //    else if ( ! Compare.equals ( this.app.RAZON_RETRO_GBL, "PAEX" )  )
		{
			DETERMINAR_RECLAMACION_PKT.exec ( this.app );
			return;
		}

	}


	/**
	 *
	 */
	protected void step7 ( ParameterSet ps )
	{
		BENE_REC_STATUS = this.dm.dbClose(BENE_REC_ID);
		if ( this._condition0 )    //    if ( ! Compare.equals ( this.app.STATUS_RECLA_GBL, "REFERIDO" ) )
		{
		}
		else if ( this._condition2 )    //    else if ( ! Compare.equals ( this.app.RAZON_RETRO_GBL, "PAEX" )  )
		{
		}
		else
		{
			// Mod. by JOR - KPG, Inc. on 4/6/2010
			//Before was calling RETRO_INSERT_PKT.exec ( this.app, ps )
			//changed to RETRO_PAEX_PKT.exec ( this.app, ps ).
			//This was opening the same form but in insert mode preventing it from
			//updating the record.
			RETRO_PAEX_PKT.exec ( this.app, ps );
			return;
		}

	}
}



/* ---------------------------------------------------------------------



procedure buscar_base_incorrecta_adl;
var
        incorrecta_id           : number(9,0);
        incorrecta_status       : number(9,0);

        correcta_id             : number(9,0);
        correcta_status         : number(9,0);

        central_id              : number(9,0);
        central_status          : number(9,0);

        recla_id                : number(9,0);
        recla_status            : number(9,0);
        num_miembros            : number(9,0);
        fecha                   : date export;

        num_nulo                : number(9,2);
        fecha_recla_original    : date;


begin
set_trace();
num_miembros := 0;
make_null(num_nulo);
{******* Busqueda de Reclamacion o Retroactivo ********}
call upload_tables_adl;

 if  (STATUS_RECLA_GBL <> 'REFERIDO')
 then
        begin
                if RAZON_RETRO_GBL <> 'PAEX' THEN
                        call DETERMINAR_RECLAMACION_PKT;
                ELSE
                        CALL RETRO_PAEX_PKT;
        end;
 else
  if RAZON_RETRO_GBL <> 'PAEX' THEN
  begin
    fecha := gbl_desde;
    while  (FECHA <= gbl_hasta)

        do begin
                call SACP510SP_EPL;
                fecha := add_months(fecha,1);
           end;
    call DETERMINAR_RECLAMACION_PKT;

 end; {if STATUS_RECLA_GBL}
ELSE
        CALL RETRO_PAEX_INS_PKT;



set_notrace();
end;




--------------------------------------------------------------------- */
