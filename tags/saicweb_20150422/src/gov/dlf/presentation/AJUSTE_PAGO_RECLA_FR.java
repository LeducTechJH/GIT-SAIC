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
public class AJUSTE_PAGO_RECLA_FR
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
  public AJUSTE_PAGO_RECLA_FR ( )
  {
    super ( );
    this.setName ( "AJUSTE_PAGO_RECLA_FR" );

    Debug.println ( Debug.TRACE, "AJUSTE_PAGO_RECLA_FR - constructor" );

    this.setDefinitionPath ( "gov/dlf/presentation/AJUSTE_PAGO_RECLA_FR.jdp" );
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

    this.setArguments ( "INFO_COMPROMISO_GP", new AJUSTE_PAGO_RECLA_FR_INFO_COMPROMISO_GP_Arguments ( this ) );

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
    this.registerListener ( "CANTIDAD_DEDUCIR", JDataPanelListener.BEFOREENTER, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; BEF_CANT_DEDUCIR_AJUSTE_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "CANTIDAD_DEDUCIR", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; AFTER_CANT_DEDUCIR_AJUSTE_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "PARK_PAGO", JDataPanelListener.BEFOREENTER, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; CALCULAR_AJUSTE_PAGO_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "INFO_COMPROMISO_GP", JDataPanelListener.BEFOREENTER, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; LLENAR_AJUSTE_PAGO_ADL.exec ( app ); return app.errorFlag;
      }
    } );
  }
}





/**
 *
 */
class AJUSTE_PAGO_RECLA_FR_INFO_COMPROMISO_GP_Arguments extends JDataPanelGroupArguments
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public AJUSTE_PAGO_RECLA_FR_INFO_COMPROMISO_GP_Arguments ( Form form )
  {
    this.model = form;

    this.setArgName ( "COD_SERV_GBL" );
    this.setArgName ( "SS_JEFE_FAMILIA_GBL" );
    this.setArgName ( "SS_JEFE_SERVICIO_GBL" );
    this.setArgName ( "FECHA_RECLA_ORIGINAL_GBL" );
    this.setArgName ( "RMO_PAR" );
  }

  /**  */
  public Object getArgValue ( String argName )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    if ( argName == null )
    {
      return null;
    }
    else if ( argName.equals ( "COD_SERV_GBL" ) )
    {
      return this.app.getCOD_SERV_GBL ( ); // Global Variable
    }
    else if ( argName.equals ( "SS_JEFE_FAMILIA_GBL" ) )
    {
      return this.app.getSS_JEFE_FAMILIA_GBL ( ); // Global Variable
    }
    else if ( argName.equals ( "SS_JEFE_SERVICIO_GBL" ) )
    {
      return this.app.getSS_JEFE_SERVICIO_GBL ( ); // Global Variable
    }
    else if ( argName.equals ( "FECHA_RECLA_ORIGINAL_GBL" ) )
    {
      return this.app.getFECHA_RECLA_ORIG_GBL ( ); // Global Variable
    }
    else if ( argName.equals ( "RMO_PAR" ) )
    {
      return this.app.getRMO_GBL ( ); // Global Variable
    }
    return null;
  }
}






