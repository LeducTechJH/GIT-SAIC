/**
 *
 */
package gov.dlf.logic;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.xml.bind.DatatypeConverter;

import net.maintrend.datamanager.DataStore;
import net.maintrend.interfaces.IRegisteredObject;
import net.maintrend.interlink.ParameterSet;
import net.maintrend.jdatapanel.JDataPanelField;
import net.maintrend.jdatapanel.JDataPanelGroupInstance;
import net.maintrend.jdatapanel.JDataPanelGroupInstanceList;
import net.maintrend.rallyengine.*;
import net.maintrend.util.Compare;
import net.maintrend.util.Debug;
import net.maintrend.util.MathService;
import net.maintrend.util.StringService;

import javax.xml.datatype.XMLGregorianCalendar;
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

	  Element cantidadElem;
	  Element fechasElem;

	  Element docElement;

	  NodeList fechasList;

	  NodeList cantidadList;
	  // -------------------------------------------------------------------
	  // ----------   Instance Condition Attributes   ----------------------





	  // -------------------------------------------------------------------
	  // ----------   Instance Export Attributes   -------------------------

	  Bpelprocess2ClientEp service = null;


	  // -------------------------------------------------------------------
	  // ----------   Instance Attributes' Access Methods   ----------------

	  ObjectFactory factory = new ObjectFactory ( );

	  ProcessResponse aeeObj = factory.createProcessResponse();




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
			  System.setProperty("proxySet", "true");
			  System.setProperty("http.proxyHost", "10.201.10.1");
			  System.setProperty("http.proxyPort", "8080");
			  System.setProperty("https.proxyHost", "10.201.10.1");
			  System.setProperty("https.proxyPort", "8080");
			  System.out.println("System Set");
//			  System.setProperty("https.proxyUser", "ADSEF\\esuarez");
//			  System.setProperty("https.proxyUser", "rhapsody7");
//			  System.getProperties().put( "proxySet", "true" );
//			  System.getProperties().put( "proxyHost", "10.201.10.1" );
//			  System.getProperties().put( "proxyPort", "8080" );
//			  String password = "ADSEF\\esuarez:rhapsody7";
//			  String encodedPassword=null;
//			try {
//				encodedPassword = DatatypeConverter.printBase64Binary((password).getBytes("UTF-8"));
//			} catch (UnsupportedEncodingException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			  System.getProperties().put(  "Proxy-Authorization", encodedPassword );
			  service = new Bpelprocess2ClientEp ( );
			  System.out.println("Instanciate Service");
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
		  requestContext.put(bind.PASSWORD_PROPERTY, "F@m1l1@ws");
		  
		  //Bpelprocess2ClientEp client = new Bpelprocess2ClientEp();

		  Process request = factory.createProcess();
		  
		  String cta = app.form("SERV_NUCLEO_SERV_FRM").getStringItem( "EMER_NUM_CUENTA");
		  Holder<String> acct_id = new Holder<String>();
		  Holder<String> ssn = new Holder<String>();
		  Holder<String> primaryName = new Holder<String>();
		  Holder<String> primaryPhone = new Holder<String>();
		  Holder<String> secondaryPhone = new Holder<String>();
		  Holder<BigDecimal> lastPayAmount = new Holder<BigDecimal>();
		  Holder<XMLGregorianCalendar> lastPayDate = new Holder<XMLGregorianCalendar>();
		  Holder<String> lastBillId = new Holder<String>();
		  Holder<XMLGregorianCalendar> lastBillDate = new Holder<XMLGregorianCalendar>();
		  Holder<BigDecimal> lastBillAmount = new Holder<BigDecimal>();
		  Holder<XMLGregorianCalendar> lastBillDueDate = new Holder<XMLGregorianCalendar>();
		  Holder<BigDecimal> currentBalance = new Holder<BigDecimal>();
		  Holder<BigDecimal> payoffBalance = new Holder<BigDecimal>();
		  Holder<XMLGregorianCalendar> nextBillDate = new Holder<XMLGregorianCalendar>();
		  Holder<String> cashOnlyFlag = new Holder<String>();
		  Holder<String> languageCode = new Holder<String>();
		  Holder<String> billRouteType = new Holder<String>();
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
				  secondaryPhone, 
				  lastPayAmount,
				  lastPayDate, 
				  lastBillId,
				  lastBillDate, 
				  lastBillAmount,
				  lastBillDueDate, 
				  currentBalance, 
				  payoffBalance, 
				  nextBillDate, 
				  cashOnlyFlag, 
				  languageCode,
				  billRouteType, 
				  delinquentAmount,
				  activeCollProcFlag, 
				  activeSevProcFlag, 
				  multiplePremise, 
				  allServInActive,
				  activePa,
				  cmwssPaymentHistory,
				  premList
				  );
		  if (!(Compare.equals(primaryName, "" )||Compare.equals(primaryName, null)))
		  {
			  app.form("SERV_NUCLEO_SERV_FRM").setItem("ATRASOS", "X");
		  }
		  else
		  {
			  this.app.setError("0", "No tiene servicios Activos en AEE.");
		  }
		  app.form("SERV_NUCLEO_SERV_FRM").setItem("CANTIDAD_AUTO", currentBalance.value);
		  System.out.println(acct_id.value);
		  app.form("SERV_NUCLEO_SERV_FRM").setItem("ULT_DIGITOS_SSN",ssn.value);
		  app.form("SERV_NUCLEO_SERV_FRM").setItem("NOMBRE_ABONADO",primaryName.value);
		  System.out.println(primaryPhone.value);
		  System.out.println(secondaryPhone.value);
		  System.out.println(lastPayAmount.value);
		  System.out.println(lastPayDate.value);
		  System.out.println(lastBillId.value);
		  app.form("SERV_NUCLEO_SERV_FRM").setItem("FCH_ULT_FACTURA", lastBillDate.value);
		  System.out.println( lastBillAmount.value);
		  System.out.println(lastBillDueDate.value);
		  System.out.println(payoffBalance.value);
		  System.out.println(nextBillDate.value);
		  System.out.println(cashOnlyFlag.value);
		  System.out.println(languageCode.value);
		  System.out.println(billRouteType.value);
		  System.out.println( delinquentAmount.value);
		  app.form("SERV_NUCLEO_SERV_FRM").setItem("NOTIF_CORTE_SERV",activeCollProcFlag.value);
		  app.form("SERV_NUCLEO_SERV_FRM").setItem("ORDEN_CORTE_SERV", activeSevProcFlag.value);
		  System.out.println( multiplePremise.value); 
		  System.out.println( allServInActive.value);
		  System.out.println( activePa.value);
		  Iterator<CMWSSPaymentHistory> it =cmwssPaymentHistory.value.iterator();
		  int n=0;
		  while(it.hasNext())
		  {
			  Iterator<PayList> payit1 =cmwssPaymentHistory.value.get(n).getPayList().iterator();
			  int n1=0;
			  while(payit1.hasNext())
			  {
				  app.form("SERV_NUCLEO_SERV_FRM").setItem("FCH_ULT_PAGO_"+n1, cmwssPaymentHistory.value.get(0).getPayList().get(n1).getPayDate());
				  app.form("SERV_NUCLEO_SERV_FRM").setItem("ULT_PAGO_"+n1, cmwssPaymentHistory.value.get(0).getPayList().get(n1).getPayAmount());
				  payit1.next();
				  n1++;
			  }
			  it.next();
			  n++;
		  }
		  Iterator<PremList> premit =premList.value.iterator();
		  int pren=0;
		  Form frm = this.app.form("AEE_SERV_LOV_FR");
		  JDataPanelField field = ( JDataPanelField ) frm.getInDepth ( "DIRECCION" );
		  JDataPanelGroupInstanceList list = frm.getGroupInstanceList ( "AEE_SERV_GP" );
		  while(premit.hasNext())
		  {
			  if(Compare.equals(premList.value.get(pren).getSaStatusFlg(), "Servicio Activo"))
			  {
				  System.out.println( premList.value.get(pren).getPremiseInfo());
				  JDataPanelGroupInstance inst = list.get ( pren );    
				  field.set(inst,premList.value.get(pren).getPremiseInfo());
				  premit.next();
				  pren++;
			  }
			  else
				  this.app.setError("0", "No tiene servicios Activos en AEE.");
			  premit.next();
		  }
		  return;

	  }

	  protected void step2 ( ParameterSet ps )
	  {

		  return;

	  }

}//class closing brace
