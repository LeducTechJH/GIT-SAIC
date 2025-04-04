/**
 *
 */
package gov.dlf.logic;

import net.maintrend.datamanager.DataStore;
import net.maintrend.interfaces.IRegisteredObject;
import net.maintrend.interlink.ParameterSet;
import net.maintrend.rallyengine.*;
import net.maintrend.util.Compare;
import net.maintrend.util.Debug;
import net.maintrend.util.MathService;
import net.maintrend.util.StringService;

import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

import com.sun.org.apache.xerces.internal.dom.ElementNSImpl;

import gov.dlf.facade.SAIC_DMQ_ORA_Application;
import gov.dlf.webservice.client.asume.*;
import gov.dlf.webservice.client.asume.Adsefresponse.PagosEfectuados;
import gov.dlf.util.SaicProxyAuth;
import gov.dlf.util.SaicProxySelector;

/**
 * @author Marcos Acevedo, KPG Inc.
 *
 */
public class ASUME_INFO_GET_ADL extends ADL {


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

	  public int ASUME_STATUS = -9;

	  // -------------------------------------------------------------------
	  // ----------   Instance Condition Attributes   ----------------------





	  // -------------------------------------------------------------------
	  // ----------   Instance Export Attributes   -------------------------

	  ADSEF service = null;



	  // -------------------------------------------------------------------
	  // ----------   Instance Attributes' Access Methods   ----------------

	  ObjectFactory factory = new ObjectFactory ( );

	  Adsefresponse asumeObj = factory.createAdsefresponse();
	  PagosEfectuados pagos = factory.createAdsefresponsePagosEfectuados();

	  // -------------------------------------------------------------------
	  // ----------   Methods   --------------------------------------------

	  public int getASUME_STATUS() {
			return ASUME_STATUS;
		}


		public void setASUME_STATUS(int aSUMESTATUS) {
			ASUME_STATUS = aSUMESTATUS;
		}

	  /**
	   *
	   * @param __app
	   * @return
	   */
	  public static ASUME_INFO_GET_ADL get ( RallyApplication __app )
	  {
	    ASUME_INFO_GET_ADL adl = new ASUME_INFO_GET_ADL ( );
	    __app.register ( adl, "ASUME_INFO_GET_ADL" );
	    __app.setADL ( ASUME_INFO_GET_ADL.class, adl );
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
		  ASUME_INFO_GET_ADL.get ( __app ).process ( ps );
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
	    ASUME_INFO_GET_ADL.get ( __app ).process ( ps );
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
	    IRegisteredObject rObj = this.app.get ( "ASUME_INFO_GET_ADL" );
	    if ( rObj != null && rObj instanceof ASUME_INFO_GET_ADL )
	    {
	      this.app.setADL ( ASUME_INFO_GET_ADL.class, ( ASUME_INFO_GET_ADL ) rObj );
	    }
	  }

	  protected void returnParms ( ParameterSet ps, int ASUME_STATUS )
	  {
	    ps.reset ( );
	    ps.set ( ASUME_STATUS );
	  }


	  /**
	   * Overrides the ancestor's method
	   *
	   * @param ps
	   */
	  protected void process ( ParameterSet ps )
	  {
	    Debug.println ( Debug.TRACE, "ASUME_INFO_GET_ADL Step " + this.currentStep );
	    super.process ( ps );
	    switch ( this.currentStep )
	    {
	      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
	      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
	      case 2:  { this.currentStep ++; this.step2 ( this.keyParms ); break; }
	      default:
	      {
	        this.currentStep = 0;
	        Debug.println ( Debug.TRACE, "ASUME_INFO_GET_ADL ended" );
	        this.unregister ( );
	        break;
	      }
	    }
	    if ( this.currentStep > 0 ) this.app.goOn ( );
	  }

	  protected void step0 ( ParameterSet ps )
	  {

		//  System.setProperty("java.net.useSystemProxies","true");

		//  ProxySelector selector = new SaicProxySelector (ProxySelector.getDefault());

		//  ProxySelector.setDefault(selector);

		  // Authenticator.setDefault(new SaicProxyAuth("ADSEF\\maracevedo", "marcos2011" ));

	  }
	  /**
	   *
	   */
	  protected void step1 ( ParameterSet ps )
	  {
		  int i = (int)this.app.SS_SERV_GBL;
		  String ss = StringService.toStringValue(i);

		  try
		  {
			  service = new ADSEF ( );
		  }
		  catch (WebServiceException ex)
		  {

			  this.app.setError("-1", "No se pudo accesar el sistema de ASUME");
			  System.out.print(ex.toString());

			  this.doReturn();
			  return;

		  }
		 ADSEFSoap soap = service.getADSEFSoap();

		  Adsefrequest request = factory.createAdsefrequest();

		  request.setSegurosocial(ss);



		  this.asumeObj = soap.verificarCaso(request);

		  Adsefresponse respObj = factory.createAdsefresponse();

		  respObj.setEstatus(asumeObj.getEstatus());
		 // respObj.setPagosEfectuados(asumeObj.getPagosEfectuados());
		  
		  pagos = asumeObj.getPagosEfectuados();
		  
		  switch ( respObj.getEstatus() )
		  {
		  case 0:
			  //this.app.setError("0", "Lo encontro activo");
			  if ( pagos.getAny().isEmpty() )
			  {
				  break;
			  }
			  else
			  {

				  Iterator<Object> pagosIter = pagos.getAny().iterator();
				  StringBuilder sb = new StringBuilder();
				  /*
				  for (; pagosIter.hasNext();)
				  {
					 // ElementNSImpl pago = (ElementNSImpl) pagosIter.next();
					 // System.out.print(pago.getElementsByTagName("Table"));

				  }
	*/
				  this.app.setError("0", "0 El caso esta activo en ASUME:\n" + sb);

				  this.setASUME_STATUS(0);
				  this.returnParms(ps, ASUME_STATUS);

			  }
			  this.doReturn();
			  break;
		  case 1:
			  this.app.setError("1", "1 Cliente contiene caso cerrado en ASUME");
			  this.setASUME_STATUS(1);
			  this.returnParms(ps, ASUME_STATUS);
			  this.doReturn();
			  break;
		  case 2:
			  this.app.setError("2", "2 Favor de pasar a registrarse por la oficina de ASUME");
			  this.setASUME_STATUS(2);
			  this.returnParms(ps, ASUME_STATUS);
			  this.doReturn();
			  break;
		  case 3:
			  this.app.setError("4", "4 El caso esta registrado en ASUME");
			  this.setASUME_STATUS(3);
			  this.returnParms(ps, ASUME_STATUS);
			  this.doReturn();
			  break;

		  }

		 // ProxySelector.setDefault(null);
		  this.doReturn();
		  return;

	  }

	  protected void step2 ( ParameterSet ps )
	  {

		 // ProxySelector.setDefault(null);
		  this.doReturn();
		  return;

	  }

}//class closing brace
