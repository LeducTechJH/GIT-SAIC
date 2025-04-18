package gov.dlf.facade;


import net.maintrend.interlink.ParameterSet;
import net.maintrend.rallyengine.Menu;
import net.maintrend.rallyengine.RallyApplication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.xml.bind.JAXBException;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Endpoint;

import gov.dif.webservice.endpoint.SaicServer;
import gov.dif.webservice.endpoint.SaicServerImpl;
import gov.dif.webservice.endpoint.SaicServerAdapter;



/**
 * 
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class SAIC_MENU
     extends Menu
{
  // -------------------------------------------------------------------
  // ----------   Constructors   ---------------------------------------

  /**
   *
   */
  public SAIC_MENU ( )
  {
    super ( "SAIC_MENU" );
    this.backgroundPath = "gov/dlf/images/DLFBackground.gif";
    this.setActions ( new _SAIC_MENU ( this ) );
    this.setMenuTitleText  ( "<i><b><center><br>SAIC-Web DEPARTAMENTO DE LA FAMILIA<br>SISTEMA DE ADMINISTRACION E INFORMACION DE CASOS<br>MENU PRINCIPAL<br></center></b></i>" );
    this.setMenuLegendText ( "" );
    this.setHelpCode   ( "1" );
    this.setLegendCode ( "2001" );
  }



  // -------------------------------------------------------------------
  // ----------   Static Methods   -------------------------------------

  /**
   *
   * @param __app
   * @return
   */
  public static SAIC_MENU get ( RallyApplication __app )
  {
    return ( SAIC_MENU ) __app.menu ( "SAIC_MENU" );
  }


  /**
   *
   * @param __app
   * @return
   */
  public static Menu exec ( RallyApplication __app )
  {
    Menu menu = SAIC_MENU.get ( __app );
    menu.execute ( );
    return menu;
  }


  /**
   *
   * @param __app
   * @return
   */
  public static Menu exec ( RallyApplication __app, ParameterSet ps )
  {
    return SAIC_MENU.exec ( __app );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * Overrides the ancestor's method
   */
  public void before ( )
  {
  }


  /**
   * Overrides the ancestor's method
   */
  public void after ( )
  {
  }


  /**
   * Overrides the ancestor's method
   */
public String getHtml ( )
  {
    ( ( SAIC_DMQ_ORA_Application ) this.app ).ID_TECNICO_GBL = this.app.getUser ( ).getUserId ( );
    
    SaicServerAdapter.Adapter ssa = new SaicServerAdapter.Adapter();
    
    SaicServer ss = null;
	try {
		ss = ssa.marshal(new SaicServerImpl());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    SaicServerImpl ssl = null;
	try {
		ssl = (SaicServerImpl) ssa.unmarshal(ss);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
    ssl.setApp((SAIC_DMQ_ORA_Application) this.app);
       
    
    return super.getHtml ( );
    
  }
}
