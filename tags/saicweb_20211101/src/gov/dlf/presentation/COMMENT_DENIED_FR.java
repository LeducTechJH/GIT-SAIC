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
public class COMMENT_DENIED_FR
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
  public COMMENT_DENIED_FR ( )
  {
    super ( );
    this.setName ( "COMMENT_DENIED_FR" );

    Debug.println ( Debug.TRACE, "COMMENT_DENIED_FR - constructor" );

    this.setDefinitionPath ( "gov/dlf/presentation/COMMENT_DENIED_FR.jdp" );
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

    this.setArguments ( "COMMENT_GP", new COMMENT_DENIED_Arguments ( this ) );

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
  { this.registerListener ( "COMMENT_DENIED_FR", JDataPanelListener.AFTEREXIT, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true;    app.returnTo ( "CONTRATO_PROYECCION_FR" ); return app.errorFlag;
      }
    } );
  }
}


class COMMENT_DENIED_Arguments extends JDataPanelGroupArguments
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public COMMENT_DENIED_Arguments ( Form form )
  {
    this.model = form;

	this.setArgName ( "SSN_PAR" );
	this.setArgName ( "PROVEEDORID" );
	this.setArgName ( "TIPOCUIDO" );
	this.setArgName ( "DESDE_P" );
	this.setArgName ( "HASTA_P" );
	this.setArgName ( "MESPROYECTADO_P" );
  }

  /**  */
  public Object getArgValue ( String argName )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    if ( argName == null )
    {
      return null;
    }
    else if ( argName.equals ( "SSN_PAR" ) )
	{
		return this.app.form ( "CONTRATO_PROYECCION_FR" ).getValue ( "SEG_SOC_CLIENTE" );
	}
	else if ( argName.equals ( "PROVEEDORID" ) )
	{
		return this.app.form ( "CONTRATO_PROYECCION_FR" ).getValue ( "ID_PROVEEDOR" );
	}
	else if ( argName.equals ( "DESDE_P" ) )
	{
		return this.app.form ( "CONTRATO_PROYECCION_FR" ).getValue ( "DESDE" );
	}
	else if ( argName.equals ( "HASTA_P" ) )
	{
		return this.app.form ( "CONTRATO_PROYECCION_FR" ).getValue ( "HASTA" );
	}
	else if ( argName.equals ( "MESPROYECTADO_P" ) )
	{
		return this.app.form ( "CONTRATO_PROYECCION_FR" ).getValue ( "MESPROYECTADO" );
	}
    return null;
  }
}




