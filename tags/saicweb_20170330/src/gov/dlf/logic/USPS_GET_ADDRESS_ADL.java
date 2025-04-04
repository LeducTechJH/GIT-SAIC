/**
 *
 */
package gov.dlf.logic;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
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
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import javax.xml.ws.WebServiceException;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import gov.dlf.facade.SAIC_DMQ_ORA_Application;


public class USPS_GET_ADDRESS_ADL extends ADL {

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

	  public int USPS_STATUS = -9;

	 public String username = "982ADSEF2002";

	 public String password = "246KZ32WD244";
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
	   * @param ps
	   *
	   * @return
	   */
	  public int getUSPS_STATUS() {
			return USPS_STATUS;
		}

	  /**
	   *
	   * @param __app
	   * @param ps
	   *
	   * @return
	   */
		public void setUSPS_STATUS(int status) {
			USPS_STATUS = status;
		}

	  /**
	   *
	   * @param __app
	   * @return
	   */
	  public static USPS_GET_ADDRESS_ADL get ( RallyApplication __app )
	  {
	    USPS_GET_ADDRESS_ADL adl = new USPS_GET_ADDRESS_ADL ( );
	    __app.register ( adl, "USPS_GET_ADDRESS_ADL" );
	    __app.setADL ( USPS_GET_ADDRESS_ADL.class, adl );
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
		  USPS_GET_ADDRESS_ADL.get ( __app ).process ( ps );
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
	    USPS_GET_ADDRESS_ADL.get ( __app ).process ( ps );
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
	    IRegisteredObject rObj = this.app.get ( "USPS_GET_ADDRESS_ADL" );
	    if ( rObj != null && rObj instanceof USPS_GET_ADDRESS_ADL )
	    {
	      this.app.setADL ( USPS_GET_ADDRESS_ADL.class, ( USPS_GET_ADDRESS_ADL ) rObj );
	    }
	  }

	  protected void returnParms ( ParameterSet ps, String url, String Username,String Id,String Address1,String Address2,String City,String State,String Zipcode,String ZipcodeExtension )
	  {
	    ps.reset ( );
	    ps.set(url);
	    ps.set(Username);
	    ps.set(Id);
	    ps.set(Address1);
	    ps.set(Address2);
	    ps.set(City);
	    ps.set(State);
	    ps.set(Zipcode);
	    ps.set(ZipcodeExtension);

	  }


	  /**
	   * Overrides the ancestor's method
	   *
	   * @param ps
	   */
	  protected void process ( ParameterSet ps )
	  {
	    Debug.println ( Debug.TRACE, "USPS_GET_ADDRESS_ADL Step " + this.currentStep );
	    super.process ( ps );
	    switch ( this.currentStep )
	    {
	      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
	      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
	      case 2:  { this.currentStep ++; this.step2 ( this.keyParms ); break; }
	      default:
	      {
	        this.currentStep = 0;
	        Debug.println ( Debug.TRACE, "USPS_GET_ADDRESS_ADL ended" );
	        this.unregister ( );
	        break;
	      }
	    }
	    if ( this.currentStep > 0 ) this.app.goOn ( );
	  }

	  protected void step0 ( ParameterSet ps )
	  {
		  String Address1 = this.app.form ( "SOLIC_SERV_COMP_FAMILIAR_FR" ).getStringItem ( "DSC_DIRECCION_11" );
		  String Address2 = this.app.form ( "SOLIC_SERV_COMP_FAMILIAR_FR" ).getStringItem ( "DSC_DIRECCION_21" );
		  String City = this.app.form ( "SOLIC_SERV_COMP_FAMILIAR_FR" ).getStringItem ( "DSC_COMO2" );
		  String State = this.app.form ( "SOLIC_SERV_COMP_FAMILIAR_FR" ).getStringItem ( "ESTADO" );
		  double Zipcode = this.app.form ( "SOLIC_SERV_COMP_FAMILIAR_FR" ).getDoubleItem ( "ZIP_CODE1" );
		  double ZipcodeExtension = this.app.form ( "SOLIC_SERV_COMP_FAMILIAR_FR" ).getDoubleItem ( "ZIP_CODE_41" );
		  String serviceUrlProduction = "http://production.shippingapis.com/ShippingAPI.dll?API=Verify&XML=<AddressValidateRequest USERID=\""+username+"\"><Address ID=\"0\"><Address1>"+Address1+"</Address1><Address2>"+Address2+"</Address2><City>"+City +"</City><State>"+State+"</State><Zip5>"+Zipcode+"</Zip5><Zip4>"+ZipcodeExtension+"</Zip4></Address></AddressValidateRequest>";
		  DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		  DocumentBuilder db = null;
		try {
			db = dbf.newDocumentBuilder();
		} catch (ParserConfigurationException e1) {
			e1.printStackTrace();
		}
		  try {
			Document doc = db.parse(new URL(serviceUrlProduction).openStream());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		  return;

	  }
	  /**
	   *
	   */
	  protected void step1 ( ParameterSet ps )
	  {
		  
		  return;

	  }

	  protected void step2 ( ParameterSet ps )
	  {

		  return;

	  }

}//class closing brace
