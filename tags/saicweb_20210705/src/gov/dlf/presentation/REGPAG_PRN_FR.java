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
public class REGPAG_PRN_FR
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
  public REGPAG_PRN_FR ( )
  {
    super ( );
    this.setName ( "REGPAG_PRN_FR" );

    Debug.println ( Debug.TRACE, "REGPAG_PRN_FR - constructor" );

    this.setDefinitionPath ( "gov/dlf/presentation/REGPAG_PRN_FR.jdp" );
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

    this.setArguments ( "REGPAG_AG1", new REGPAG_PRN_FR_REGPAG_AG1_Arguments ( this ) );
    this.setArguments ( "REGPAG_AG2", new REGPAG_PRN_FR_REGPAG_AG2_Arguments ( this ) );

    this.setObjectEvents ( );
    field = ( JDataPanelField ) this.getInDepth ( "REGPAG_NOMBRE" );
    field.setValueProvider ( new REGPAG_PRN_FR_REGPAG_NOMBREProvider ( this ) );



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
    this.registerListener ( "SERVICIOS_SEGURO_SOCIAL_JEFE_FAM", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; BUSCAR_NOMBRE_REGISTRO_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "SERVICIOS_SEGURO_SOCIAL_JEFE_SERV", JDataPanelListener.BEFOREENTER, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; BUSCAR_NOMBRE_REGISTRO_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "FCH_PAGO", JDataPanelListener.HOTKEYPRESS, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; 
        app.setError ( 0, 7100 );
        REGPAG_PRN_PKT.exec ( app ); 
        return app.errorFlag;
      }
    } );
  }
}





/**
 *
 */
class REGPAG_PRN_FR_REGPAG_AG1_Arguments extends JDataPanelGroupArguments
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public REGPAG_PRN_FR_REGPAG_AG1_Arguments ( Form form )
  {
    this.model = form;

    this.setArgName ( "PCODSERV" );
    this.setArgName ( "PNUMFACT" );
    this.setArgName ( "PSSJF" );
    this.setArgName ( "PSSJS" );
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
    else if ( argName.equals ( "PCODSERV" ) )
    {
      return this.app.form ( "REGPAG_A2_FR" ).getValue ( "COD_SERVICIO" );
    }
    else if ( argName.equals ( "PNUMFACT" ) )
    {
      return this.app.form ( "REGPAG_A2_FR" ).getValue ( "NUMERO_FACTURA" );
    }
    else if ( argName.equals ( "PSSJF" ) )
    {
      return this.app.form ( "REGPAG_A2_FR" ).getValue ( "SEGURO_SOCIAL_JEFE_FAM" );
    }
    else if ( argName.equals ( "PSSJS" ) )
    {
      return this.app.form ( "REGPAG_A2_FR" ).getValue ( "SEGURO_SOCIAL_JEFE_SERV" );
    }
    else if ( argName.equals ( "RMO_PAR" ) )
    {
      return this.app.getRMO_GBL ( ); // Global Variable
    }
    return null;
  }
}



/**
 *
 */
class REGPAG_PRN_FR_REGPAG_AG2_Arguments extends JDataPanelGroupArguments
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public REGPAG_PRN_FR_REGPAG_AG2_Arguments ( Form form )
  {
    this.model = form;

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
    else if ( argName.equals ( "RMO_PAR" ) )
    {
      return this.app.getRMO_GBL ( ); // Global Variable
    }
    return null;
  }
}




/**
 *
 */
class REGPAG_PRN_FR_REGPAG_NOMBREProvider implements IObjectValueProvider
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public REGPAG_PRN_FR_REGPAG_NOMBREProvider ( Form form )
  {
    this.model = form;
  }

  /**  */
  public Object getValue ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    return this.app.form ( "REGPAG_A2_FR" ).getValue ( "F5" );
  }
}





