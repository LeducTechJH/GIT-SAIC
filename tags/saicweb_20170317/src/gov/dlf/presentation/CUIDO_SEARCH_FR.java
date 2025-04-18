package gov.dlf.presentation;


import gov.dlf.facade.*;
import gov.dlf.external.*;
import gov.dlf.logic.*;

import java.util.Date;


import net.maintrend.appmanager.*;
import net.maintrend.datamanager.*;
import net.maintrend.interfaces.*;
import net.maintrend.interlink.*;
import net.maintrend.jdatapanel.*;
import net.maintrend.jdatapanel.edit.*;
import net.maintrend.jdatapanel.commands.*;
import net.maintrend.mdi.*;
import net.maintrend.rallyengine.*;
import net.maintrend.util.*;



/**
 * __Comment
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class CUIDO_SEARCH_FR
     extends Form
{
  // -------------------------------------------------------------------
  // ----------   Instance Attributes   --------------------------------

  /**  */
  public SAIC_DMQ_ORA_Application app;



  // -------------------------------------------------------------------
  // ----------   Constructors and supporting methods   ----------------

  /**
   *
   */
  public CUIDO_SEARCH_FR ( )
  {
    super ( );
    this.setName ( "CUIDO_SEARCH_FR" );

    Debug.println ( Debug.TRACE, "CUIDO_SEARCH_FR - constructor" );

    this.setDefinitionPath ( "gov/dlf/presentation/CUIDO_SEARCH_FR.jdp" );
    String definition = ResourceUtil.getResourceText ( this.definitionPath );
    this.setDefinition     ( definition );

    this.setHighLightSelected   ( false );
    this.compressFieldLocations ( false, true );  // Compresses only Y-locations
  }
  
  
  /**
   * Overrides ancestor's script
   *
   * @param __app
   */
  public void setApplication ( Application __app )
  {
    this.app = ( SAIC_DMQ_ORA_Application ) __app;
    if ( this.app != null )
    {
      this.setDataManager ( this.app.getDataManager ( ) );
    }
    ICalculator           calculator;
    IBooleanValueProvider txtVisible;
    IBooleanValueProvider groupVisible;
    IObjectValueProvider  valueProvider;
    JDataPanelField       field;
    JDataPanelTextGroup   txtGroup;
    JDataPanelGroup       visGroup;
    this.setArguments ( "CUIDO_SEARCH_FR_GR", new CUIDO_SEARCH_FR_GROUP_Arguments ( this ) );
    this.setObjectEvents ( );
  }
  /**
   * Overrides ancestor's method
   * 
   * @return
   */
  public RallyApplication getApplication ( )
  {
    return this.app;
  }
  // -------------------------------------------------------------------
  // ----------   Action Sites   ---------------------------------------

  /**
   *
   */
  public void setObjectEvents ( )
  {
	  this.registerListener ( "CUIDO_SEARCH_FR", JDataPanelListener.AFTERLOAD, new JDataPanelListener ( )
	    {
	      public boolean eventFired ( String eventName )
	      {
	        app.errorFlag = true; 
	       if(Compare.equals(app.getSTATUS_GBL(), "ACTIVO"))
	       {
	    	   app.form("CUIDO_SEARCH_FR").setItem("TITULO", "MESES TRABAJADOS");
	       }
	       else if(Compare.equals(app.getSTATUS_GBL(), "INACTIVO"))
	       {
	    	   app.form("CUIDO_SEARCH_FR").setItem("TITULO", "MESES SIN TRABAJAR");
	       }
	       else if(Compare.equals(app.getSTATUS_GBL(), "DENEGADO"))
	       {
	    	   app.form("CUIDO_SEARCH_FR").setItem("TITULO", "MESES DENEGADOS");
	       }
	        return app.errorFlag;
	      }
	    } );
  }
}
/**
 *
 */
class CUIDO_SEARCH_FR_GROUP_Arguments extends JDataPanelGroupArguments
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public CUIDO_SEARCH_FR_GROUP_Arguments ( Form form )
  {
    this.model = form;

    this.setArgName ( "SSJS" );
    this.setArgName ( "STATUS" );

  }

  /**  */
  public Object getArgValue ( String argName )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    if ( argName == null )
    {
      return null;
    }
    else if ( argName.equals ( "SSJS" ) )
    {
      return this.app.getSS_SERV_GBL();
    }
    else if ( argName.equals ( "STATUS" ) )
    {
      return this.app.getSTATUS_GBL();
    }
    return null;
  }
}






