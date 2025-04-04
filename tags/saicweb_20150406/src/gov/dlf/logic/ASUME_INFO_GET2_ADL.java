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
import net.maintrend.util.StringService;

import javax.xml.ws.WebServiceException;

import org.w3c.dom.*;

import com.sun.org.apache.xerces.internal.dom.DeepNodeListImpl;
import com.sun.org.apache.xerces.internal.dom.ElementNSImpl;

import gov.dlf.facade.SAIC_DMQ_ORA_Application;
import gov.dlf.webservice.client.asume.*;
import gov.dlf.webservice.client.asume.Adsefresponse.PagosEfectuados;


/**
 * @author Marcos Acevedo, KPG Inc.
 *
 */
public class ASUME_INFO_GET2_ADL extends ADL {


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

	  Element cantidadElem;
	  Element fechasElem;

	  Element docElement;

	  NodeList fechasList;

	  NodeList cantidadList;

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

	  /**
	   *
	   * @param __app
	   * @param ps
	   *
	   * @return
	   */
	  public int getASUME_STATUS() {
			return ASUME_STATUS;
		}

	  /**
	   *
	   * @param __app
	   * @param ps
	   *
	   * @return
	   */
		public void setASUME_STATUS(int status) {
			ASUME_STATUS = status;
		}

	  /**
	   *
	   * @param __app
	   * @return
	   */
	  public static ASUME_INFO_GET2_ADL get ( RallyApplication __app )
	  {
	    ASUME_INFO_GET2_ADL adl = new ASUME_INFO_GET2_ADL ( );
	    __app.register ( adl, "ASUME_INFO_GET2_ADL" );
	    __app.setADL ( ASUME_INFO_GET2_ADL.class, adl );
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
		  ASUME_INFO_GET2_ADL.get ( __app ).process ( ps );
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
	    ASUME_INFO_GET2_ADL.get ( __app ).process ( ps );
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
	    IRegisteredObject rObj = this.app.get ( "ASUME_INFO_GET2_ADL" );
	    if ( rObj != null && rObj instanceof ASUME_INFO_GET2_ADL )
	    {
	      this.app.setADL ( ASUME_INFO_GET2_ADL.class, ( ASUME_INFO_GET2_ADL ) rObj );
	    }
	  }

	  protected void returnParms ( ParameterSet ps, int ASUME_STATUS, String ASUME_RAZON )
	  {
	    ps.reset ( );
	    ps.set ( ASUME_STATUS );
	    ps.set ( ASUME_RAZON );
	  }


	  /**
	   * Overrides the ancestor's method
	   *
	   * @param ps
	   */
	  protected void process ( ParameterSet ps )
	  {
	    Debug.println ( Debug.TRACE, "ASUME_INFO_GET2_ADL Step " + this.currentStep );
	    super.process ( ps );
	    switch ( this.currentStep )
	    {
	      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
	      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
	      case 2:  { this.currentStep ++; this.step2 ( this.keyParms ); break; }
	      default:
	      {
	        this.currentStep = 0;
	        Debug.println ( Debug.TRACE, "ASUME_INFO_GET2_ADL ended" );
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
			  service = new ADSEF ( );
		  }
		  catch (WebServiceException ex)
		  {
			  ps.set( "ASUME_STATUS", -9 );
			  this.app.setError(0, 8509); //NO SE PUDO ACCESSAR EL SISTEMA DE ASUME.
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

		  ADSEFSoap soap = service.getADSEFSoap();

		  Adsefrequest request = factory.createAdsefrequest();
		  
		  String ss = StringService.toStringValue ( (int) ps.getDouble ( "SEGURO_SOCIAL" ) );
		  
		  while ( ss.length() < 9 )
		  {
			  ss = "0" + ss;
		  }

		  request.setSegurosocial( ss );

		  this.asumeObj = soap.verificarCaso(request);

		  Adsefresponse respObj = factory.createAdsefresponse();

		  respObj.setEstatus(asumeObj.getEstatus());
		  
		  respObj.setMensaje(asumeObj.getMensaje());

		  pagos = asumeObj.getPagosEfectuados();

		  ps.set( "ASUME_STATUS", respObj.getEstatus () );
		  
		  ps.set( "ASUME_RAZON", respObj.getMensaje() );
		  
		  if (respObj.getEstatus () != 0)
		  {
			  ps.set("PAGOS", 0);
			  return;
		  }
		  
		  if (pagos.getAny() != null)
		  {
			  docElement = (Element) pagos.getAny();
			  
			  fechasList = docElement.getElementsByTagName("FechaReciboPago");
			  cantidadList = docElement.getElementsByTagName("CantidadPago");
			  
			  if ( Compare.equals( fechasList.getLength(), 0 ) )
			  {
				  ps.set("PAGOS", 0);
			  }
			  else
			  {
				  StringBuilder sb = new StringBuilder();

				  if ( fechasList.getLength() > 6 )
				  {
					  for (int i=0; i<6; i++)
					  {
						  fechasElem = (Element) fechasList.item(i);
						  cantidadElem = (Element) cantidadList.item(i);

						  sb.append("Fecha: " + fechasElem.getTextContent().substring(0, 10) + " " + "    Cantidad: $" + cantidadElem.getTextContent().replaceAll("00\\b$", "") + "|");

					  }

					  ps.set( "PAGOS", sb.toString() );
				  }
				  else
				  {
					  for (int i=0; i<fechasList.getLength(); i++)
					  {
						  fechasElem = (Element) fechasList.item(i);
						  cantidadElem = (Element) cantidadList.item(i);

						  sb.append("Fecha: " + fechasElem.getTextContent().substring(0, 10) + " " + "    Cantidad: $" + cantidadElem.getTextContent().replaceAll("00\\b$", "") + "|");

					  }

					  ps.set( "PAGOS", sb.toString() );
				  }
			  }
		  }
		  else
		  {
			  return;
		  }
		  

		  return;

	  }

	  protected void step2 ( ParameterSet ps )
	  {

		  return;

	  }

}//class closing brace
