/**
 *
 */
package gov.dlf.logic;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.xml.bind.DatatypeConverter;

import net.maintrend.datamanager.DataManager;
import net.maintrend.datamanager.DataStore;
import net.maintrend.interfaces.IRegisteredObject;
import net.maintrend.interlink.ParameterSet;
import net.maintrend.jdatapanel.JDataPanelField;
import net.maintrend.jdatapanel.JDataPanelGroupInstance;
import net.maintrend.jdatapanel.JDataPanelGroupInstanceList;
import net.maintrend.rallyengine.*;
import net.maintrend.util.Compare;
import net.maintrend.util.Configuration;
import net.maintrend.util.Debug;
import net.maintrend.util.MathService;
import net.maintrend.util.StringService;
import net.maintrend.util.TruncService;

import javax.xml.datatype.*;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import javax.xml.ws.WebServiceException;

import org.w3c.dom.*;

import gov.dlf.facade.SAIC_DMQ_ORA_Application;
import gov.dlf.webservice.AEE.*;
import gov.dlf.webservice.AEE.Process;
import gov.dlf.webservice.AEE.ProcessResponse.CMWSSPaymentHistory;
import gov.dlf.webservice.AEE.ProcessResponse.CMWSSPaymentHistory.PayList;
import gov.dlf.webservice.AEE.ProcessResponse.PremList;



public class AEE_GET_ACCT_NUM_ADL extends ADL {

	// -------------------------------------------------------------------
	  // ----------   Class Attributes   -----------------------------------

	/**  */
	  public static boolean staticCall = true;

	  // -------------------------------------------------------------------
	  // ----------   Instance Attributes   --------------------------------

	  /**  */
	  public SAIC_DMQ_ORA_Application app;
	  /**  */
	  public RallyDataManager dm = null;
	  public double OPEN_ID = 0;

		public double STATUS_CODE = 0;
		public DataStore CLIENTE_AGENCIA_RO_DSD = null;

	  // -------------------------------------------------------------------
	  // ----------   Instance Condition Attributes   ----------------------


	  // -------------------------------------------------------------------
	  // ----------   Instance Export Attributes   -------------------------


	  // -------------------------------------------------------------------
	  // ----------   Instance Attributes' Access Methods   ----------------


	  // -------------------------------------------------------------------
	  // ----------   Methods   --------------------------------------------

		public static DataStore getCLIENTE_AGENCIA_RO_DSD  ( RallyApplication __app )
		{
			return ( ( DETERMINAR_ELEGIBILIDAD_PAN_2 ) __app.getADL ( DETERMINAR_ELEGIBILIDAD_PAN_2.class ) ).CLIENTE_AGENCIA_RO_DSD;
		}


		/**  */
		public static void setCLIENTE_AGENCIA_RO_DSD  ( RallyApplication __app, DataStore value )
		{
			( ( DETERMINAR_ELEGIBILIDAD_PAN_2 ) __app.getADL ( DETERMINAR_ELEGIBILIDAD_PAN_2.class ) ).CLIENTE_AGENCIA_RO_DSD = value;
		}


		/**  */
		public static void setCLIENTE_AGENCIA_RO_DSD  ( RallyApplication __app, Object value )
		{
			( ( DETERMINAR_ELEGIBILIDAD_PAN_2 ) __app.getADL ( DETERMINAR_ELEGIBILIDAD_PAN_2.class ) ).CLIENTE_AGENCIA_RO_DSD = ( DataStore ) value;
		}

	  /**
	   *
	   * @param __app
	   * @return
	   */
	  public static AEE_GET_ACCT_NUM_ADL get ( RallyApplication __app )
	  {
	    AEE_GET_ACCT_NUM_ADL adl = new AEE_GET_ACCT_NUM_ADL ( );
	    __app.register ( adl, "AEE_GET_ACCT_NUM_ADL" );
	    __app.setADL ( AEE_GET_ACCT_NUM_ADL.class, adl );
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
		  AEE_GET_ACCT_NUM_ADL.get ( __app ).process ( ps );
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
	    AEE_GET_ACCT_NUM_ADL.get ( __app ).process ( ps );
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
	    IRegisteredObject rObj = this.app.get ( "AEE_GET_ACCT_NUM_ADL" );
	    if ( rObj != null && rObj instanceof AEE_GET_ACCT_NUM_ADL )
	    {
	      this.app.setADL ( AEE_GET_ACCT_NUM_ADL.class, ( AEE_GET_ACCT_NUM_ADL ) rObj );
	    }
	  }

	  protected void returnParms ( )
	  {

	  }


	  /**
	   * Overrides the ancestor's method
	   *
	   * @param ps
	   */
	  protected void process ( ParameterSet ps )
	  {
	    Debug.println ( Debug.TRACE, "AEE_GET_ACCT_NUM_ADL Step " + this.currentStep );
	    super.process ( ps );
	    switch ( this.currentStep )
	    {
	      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
	      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
	      default:
	      {
	        this.currentStep = 0;
	        Debug.println ( Debug.TRACE, "AEE_GET_ACCT_NUM_ADL ended" );
	        this.unregister ( );
	        break;
	      }
	    }
	    if ( this.currentStep > 0 ) this.app.goOn ( );
	  }

	  protected void step0 ( ParameterSet ps )
	  {
			CLIENTE_AGENCIA_RO_DSD = this.dm.create ( "CLIENTE_AGENCIA_RO_DSD" );
			OPEN_ID = CLIENTE_AGENCIA_RO_DSD.getId ( );
			STATUS_CODE = RallyDataStoreException.getDefault ( );
		  return;

	  }
	  protected void step1 ( ParameterSet ps )
	  {
		  STATUS_CODE  = this.dm.reset ( OPEN_ID );
			this.dm.setField ( this.dm.get ( "CLIENTE_AGENCIA_RO_DSD" ), "SEGURO_SOCIAL_CLIENTE", this.app.form("SERV_NUCLEO_SERV_FRM").getItem("SEGURO_SOCIAL_JEFE_SERV"));
			this.dm.setField ( this.dm.get ( "CLIENTE_AGENCIA_RO_DSD" ), "COD_AGENCIA","AUEE");
			STATUS_CODE  = this.dm.limitQueryFromBuffer ( OPEN_ID );
			STATUS_CODE  = this.dm.retrieve ( OPEN_ID );

			STATUS_CODE  = this.dm.firstRow ( OPEN_ID );
			while ( Compare.equals ( STATUS_CODE, 0 )  )
			{
				this.app.form("SERV_NUCLEO_SERV_FRM").setItem("EMER_NUM_CUENTA", this.dm.getFieldString ( this.dm.get ( "CLIENTE_AGENCIA_RO_DSD" ), "DSC_AGENCIA_NUM_CASO" ));
				STATUS_CODE  = this.dm.nextRow ( OPEN_ID );
			}
			STATUS_CODE = this.dm.dbClose(OPEN_ID);
		  return;
	  }

}//class closing brace
