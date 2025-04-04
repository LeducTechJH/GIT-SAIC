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



public class AEE_INFO_GET_ADL extends ADL {

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

	  public int AEE_STATUS = -9;

	  // -------------------------------------------------------------------
	  // ----------   Instance Condition Attributes   ----------------------


	  // -------------------------------------------------------------------
	  // ----------   Instance Export Attributes   -------------------------

	  Bpelprocess2ClientEp service = null;

	  // -------------------------------------------------------------------
	  // ----------   Instance Attributes' Access Methods   ----------------

	  ObjectFactory factory = new ObjectFactory ( );

	  // -------------------------------------------------------------------
	  // ----------   Methods   --------------------------------------------

	  /**
	   *
	   * @param __app
	   * @param ps
	   *
	   * @return
	   */
	  public int getAEE_STATUS() {
			return AEE_STATUS;
		}

	  /**
	   *
	   * @param __app
	   * @param ps
	   *
	   * @return
	   */
		public void setAEE_STATUS(int status) {
			AEE_STATUS = status;
		}

	  /**
	   *
	   * @param __app
	   * @return
	   */
	  public static AEE_INFO_GET_ADL get ( RallyApplication __app )
	  {
	    AEE_INFO_GET_ADL adl = new AEE_INFO_GET_ADL ( );
	    __app.register ( adl, "AEE_INFO_GET_ADL" );
	    __app.setADL ( AEE_INFO_GET_ADL.class, adl );
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
		  AEE_INFO_GET_ADL.get ( __app ).process ( ps );
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
	    AEE_INFO_GET_ADL.get ( __app ).process ( ps );
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
	    IRegisteredObject rObj = this.app.get ( "AEE_INFO_GET_ADL" );
	    if ( rObj != null && rObj instanceof AEE_INFO_GET_ADL )
	    {
	      this.app.setADL ( AEE_INFO_GET_ADL.class, ( AEE_INFO_GET_ADL ) rObj );
	    }
	  }

	  protected void returnParms ( ParameterSet ps, String ACCT_ID, String USER_ID,String USER_NAME,String IP_ADDR )
	  {
	    ps.reset ( );
	    ps.set(ACCT_ID);
	    ps.set(USER_ID);
	    ps.set(USER_NAME);
	    ps.set(IP_ADDR);

	  }


	  /**
	   * Overrides the ancestor's method
	   *
	   * @param ps
	   */
	  protected void process ( ParameterSet ps )
	  {
	    Debug.println ( Debug.TRACE, "AEE_INFO_GET_ADL Step " + this.currentStep );
	    super.process ( ps );
	    switch ( this.currentStep )
	    {
	      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
	      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
	      case 2:  { this.currentStep ++; this.step2 ( this.keyParms ); break; }
	      default:
	      {
	        this.currentStep = 0;
	        Debug.println ( Debug.TRACE, "AEE_INFO_GET_ADL ended" );
	        this.unregister ( );
	        break;
	      }
	    }
	    if ( this.currentStep > 0 ) this.app.goOn ( );
	  }

	  protected void step0 ( ParameterSet ps )
	  {
		  try
		  {
//			  System.setProperty("proxySet", "true");
//			  System.setProperty("http.proxyHost", "10.201.10.1");
//			  System.setProperty("http.proxyPort", "8080");
//			  System.setProperty("https.proxyHost", "10.201.10.1");
//			  System.setProperty("https.proxyPort", "8080");
			  service = new Bpelprocess2ClientEp ( );
		  }
		  catch (WebServiceException ex)
		  {
			  ps.set( "AEE_STATUS", -9 );
			  this.app.setError(0, 8509); //NO SE PUDO ACCESSAR EL SISTEMA DE AEE.
			  System.out.println(ex.toString());

			  this.doReturn();
			  return;

		  }

		  return;

	  }
	  /**
	   *
	   */
	  protected void step1 ( ParameterSet ps )
	  {
		  BPELProcess2 soap = service.getBPELProcess2Pt();
		  BindingProvider bind = (BindingProvider) soap;
		  Map<String,Object> requestContext = bind.getRequestContext();
		  requestContext.put(bind.USERNAME_PROPERTY, "deptfam01");
		  requestContext.put(bind.PASSWORD_PROPERTY, "F@m1l1@prd");
		  
		  String cta = app.form("SERV_NUCLEO_SERV_FRM").getStringItem( "EMER_NUM_CUENTA");
		  Holder<String> acct_id = new Holder<String>();
		  Holder<String> ssn = new Holder<String>();
		  Holder<String> primaryName = new Holder<String>();
		  Holder<String> primaryPhone = new Holder<String>();
		  Holder<String> lastBillDate = new Holder<String>();
		  Holder<BigDecimal> lastBillAmount = new Holder<BigDecimal>();
		  Holder<XMLGregorianCalendar> lastBillDueDate = new Holder<XMLGregorianCalendar>();
		  Holder<BigDecimal> currentBalance = new Holder<BigDecimal>();
		  Holder<BigDecimal> delinquentAmount = new Holder<BigDecimal>();
		  Holder<String> activeCollProcFlag = new Holder<String>();
		  Holder<String> activeSevProcFlag = new Holder<String>();
		  Holder<String> multiplePremise = new Holder<String>();
		  Holder<String> allServInActive = new Holder<String>();
		  Holder<String> activePa = new Holder<String>();
		  Holder <List<CMWSSPaymentHistory>> cmwssPaymentHistory = new Holder <List<CMWSSPaymentHistory>>();
		  Holder <List<PremList>> premList = new Holder <List<PremList>>();
		  soap.process(
				  cta,
				  "SAIC",
				  "SAIC", 
				  "10.17.9.1",
				  acct_id, 
				  ssn, 
				  primaryName, 
				  primaryPhone, 
				  lastBillDate, 
				  lastBillAmount,
				  lastBillDueDate, 
				  currentBalance, 
				  delinquentAmount,
				  activeCollProcFlag, 
				  activeSevProcFlag, 
				  multiplePremise, 
				  allServInActive,
				  activePa,
				  cmwssPaymentHistory,
				  premList
				  );
		  String regex = "[0-9]+";
		  String checkws = acct_id.value;
		  if (checkws.matches(regex) )
		  {
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("ATRASOS", "X");
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("BALANCE", currentBalance.value.toString());
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("DELINCUENT", delinquentAmount.value.toString());
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("CANTIDAD_AUTO", delinquentAmount.value);
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("ULT_DIGITOS_SSN",ssn.value);
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("NOMBRE_ABONADO",primaryName.value);
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("FCH_ULT_FACTURA", lastBillDate.value);
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("NOTIF_CORTE_SERV",activeCollProcFlag.value);
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("ORDEN_CORTE_SERV", activeSevProcFlag.value);
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("PLAN_PAGO_FLG",activePa.value);
			  Iterator<CMWSSPaymentHistory> it =cmwssPaymentHistory.value.iterator();
			  int n=0;
			  while(it.hasNext())
			  {
				  Iterator<PayList> payit1 =cmwssPaymentHistory.value.get(n).getPayList().iterator();
				  int n1=0;
				  while(payit1.hasNext())
				  {
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("FCH_ULT_PAGO_"+n1,cmwssPaymentHistory.value.get(0).getPayList().get(n1).getPayDate());
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("ULT_PAGO_"+n1, cmwssPaymentHistory.value.get(0).getPayList().get(n1).getPayAmount());
					  payit1.next();
					  n1++;
				  }
				  it.next();
				  n++;
			  }
				  if(Compare.equals(multiplePremise.value, "Y"))
				  {
					  this.app.setError("0", "Cuenta no cualifica. Tiene multiples predios.");
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("ATRASOS", "");
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("CANTIDAD_AUTO", 0);
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("BALANCE", "");
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("DELINCUENT", "");
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("ULT_DIGITOS_SSN","");
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("NOMBRE_ABONADO","");
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("FCH_ULT_FACTURA", "");
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("NOTIF_CORTE_SERV","");
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("ORDEN_CORTE_SERV", "");
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("PLAN_PAGO_FLG","");
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("FCH_ULT_PAGO_0", "");
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("FCH_ULT_PAGO_1", "");
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("FCH_ULT_PAGO_2" , ""); 
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("FCH_ULT_PAGO_3" , "");
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("FCH_ULT_PAGO_4" , ""); 
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("FCH_ULT_PAGO_5", "");
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("ULT_PAGO_0","");
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("ULT_PAGO_1","");
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("ULT_PAGO_2","");
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("ULT_PAGO_3","");
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("ULT_PAGO_4","");
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("ULT_PAGO_5","");
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("DIRECCION","");
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("FACTURAS","");
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("CHEQUE_CANJEADO","");
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("PAGO_SERVICIO_PRESTADO","");
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("OTROS_DOCS","");
					  return;
				  }
				  else
					  app.form("SERV_NUCLEO_SERV_FRM").setItem("DIRECCION",premList.value.get(0).getPremiseInfo());
			  }
		  else
		  {
			  this.app.setError("0", acct_id.value);
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("ATRASOS", "");
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("CANTIDAD_AUTO", 0);
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("BALANCE", "");
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("DELINCUENT", "");
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("ULT_DIGITOS_SSN","");
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("NOMBRE_ABONADO","");
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("FCH_ULT_FACTURA", "");
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("NOTIF_CORTE_SERV","");
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("ORDEN_CORTE_SERV", "");
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("PLAN_PAGO_FLG","");
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("FCH_ULT_PAGO_0", "");
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("FCH_ULT_PAGO_1", "");
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("FCH_ULT_PAGO_2" , ""); 
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("FCH_ULT_PAGO_3" , "");
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("FCH_ULT_PAGO_4" , ""); 
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("FCH_ULT_PAGO_5", "");
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("ULT_PAGO_0","");
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("ULT_PAGO_1","");
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("ULT_PAGO_2","");
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("ULT_PAGO_3","");
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("ULT_PAGO_4","");
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("ULT_PAGO_5","");
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("DIRECCION","");
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("FACTURAS","");
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("CHEQUE_CANJEADO","");
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("PAGO_SERVICIO_PRESTADO","");
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("OTROS_DOCS","");
		  }
		  return;

	  }

	  protected void step2 ( ParameterSet ps )
	  {

		  return;

	  }

}//class closing brace
