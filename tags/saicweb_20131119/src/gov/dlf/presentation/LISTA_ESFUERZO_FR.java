package gov.dlf.presentation;


import gov.dlf.facade.SAIC_DMQ_ORA_Application;
import gov.dlf.logic.CHECK_ESFUERZO_PARK_CMD_ADL;
import gov.dlf.logic.CHECK_NUM_ESFUERZO_ADL;
import gov.dlf.logic.PONER_FLECHA_LISTA_ESFUERZO_ADL;
import gov.dlf.logic.SELECT_ESFUERZO_ADL;

import net.maintrend.appmanager.Application;
import net.maintrend.interfaces.IObjectValueProvider;
import net.maintrend.jdatapanel.JDataPanelField;
import net.maintrend.jdatapanel.JDataPanelGroupArguments;
import net.maintrend.jdatapanel.JDataPanelListener;
import net.maintrend.rallyengine.Form;
import net.maintrend.rallyengine.RallyApplication;
import net.maintrend.util.Debug;
import net.maintrend.util.ResourceUtil;



/**
 * __Comment
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class LISTA_ESFUERZO_FR
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
  public LISTA_ESFUERZO_FR ( )
  {
    super ( );
    this.setName ( "LISTA_ESFUERZO_FR" );

    Debug.println ( Debug.TRACE, "LISTA_ESFUERZO_FR - constructor" );

    this.setDefinitionPath ( "gov/dlf/presentation/LISTA_ESFUERZO_FR.jdp" );
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

    JDataPanelField       field;

    this.setArguments ( "INFO_CLIENTES_GP", new LISTA_ESFUERZO_FR_INFO_CLIENTES_GP_Arguments ( this ) );

    this.setObjectEvents ( );
    field = ( JDataPanelField ) this.getInDepth ( "DESCRIPCION_OFICINA" );
    field.setValueProvider ( new LISTA_ESFUERZO_FR_DESCRIPCION_OFICINAProvider ( this ) );
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
    this.registerListener ( "PARK_CLIENTES", JDataPanelListener.BEFOREENTER, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; CHECK_NUM_ESFUERZO_ADL.exec ( app );
        return app.errorFlag;
      }
    } );
    this.registerListener ( "PARK_CLIENTES", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; CHECK_ESFUERZO_PARK_CMD_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "PARK_ESFUERZO", JDataPanelListener.BEFOREENTER, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; PONER_FLECHA_LISTA_ESFUERZO_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "PARK_ESFUERZO", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; CHECK_ESFUERZO_PARK_CMD_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "INFO_ESFUERZO_GP", JDataPanelListener.HOTKEYPRESS, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; SELECT_ESFUERZO_ADL.exec ( app ); return app.errorFlag;
      }
    } );
  }
}





/**
 *
 */
class LISTA_ESFUERZO_FR_INFO_CLIENTES_GP_Arguments extends JDataPanelGroupArguments
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public LISTA_ESFUERZO_FR_INFO_CLIENTES_GP_Arguments ( Form form )
  {
    this.model = form;

    this.setArgName ( "SSN_PAR" );
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
    else if ( argName.equals ( "SSN_PAR" ) )
    {
      return this.app.getSSN_GBL ( ); // Global Variable
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
class LISTA_ESFUERZO_FR_DESCRIPCION_OFICINAProvider implements IObjectValueProvider
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public LISTA_ESFUERZO_FR_DESCRIPCION_OFICINAProvider ( Form form )
  {
    this.model = form;
  }

  /**  */
  public Object getValue ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    return this.app.getOFICINA_GBL ( );
  }
}





