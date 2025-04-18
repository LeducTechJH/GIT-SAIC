package gov.dlf.presentation;


import gov.dlf.facade.SAIC_DMQ_ORA_Application;
import gov.dlf.logic.PRE_MENU_ADL;
import gov.dlf.logic.SERV_AFTER_PARK_SERV_ADL;
import gov.dlf.logic.SERV_BEFORE_PARK_SERV_ADL;
import gov.dlf.logic.SERV_CHECK_NUM_SERVICIOS_ADL;
import gov.dlf.logic.SERV_CHECK_NUM_SERVICIOS_AF_ADL;
import gov.dlf.logic.SERV_FAM_BV_ADL;
import gov.dlf.logic.SERV_FAM_COD_SERVICIO_AFTER_ADL;

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
public class SERV_FAM_FRM
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
  public SERV_FAM_FRM ( )
  {
    super ( );
    this.setName ( "SERV_FAM_FRM" );

    Debug.println ( Debug.TRACE, "SERV_FAM_FRM - constructor" );

    this.setDefinitionPath ( "gov/dlf/presentation/SERV_FAM_FRM.jdp" );
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

    this.setArguments ( "SERV_JEFE_FAM_INFO_GP", new SERV_FAM_FRM_SERV_JEFE_FAM_INFO_GP_Arguments ( this ) );
    this.setArguments ( "SERV_SERV_ASOC_FAM_GP", new SERV_FAM_FRM_SERV_SERV_ASOC_FAM_GP_Arguments ( this ) );

    this.setObjectEvents ( );
    field = ( JDataPanelField ) this.getInDepth ( "RMO_SERV" );
    field.setValueProvider ( new SERV_FAM_FRM_RMO_SERVProvider ( this ) );



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
    this.registerListener ( "FAM_PARK", JDataPanelListener.BEFOREENTER, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; SERV_CHECK_NUM_SERVICIOS_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "FAM_PARK", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; SERV_CHECK_NUM_SERVICIOS_AF_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "PARK_SERV", JDataPanelListener.BEFOREENTER, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; SERV_BEFORE_PARK_SERV_ADL.exec ( app ); return app.errorFlag;
      }
    } );
   /* this.registerListener ( "PARK_SERV", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; SERV_AFTER_PARK_SERV_ADL.exec ( app ); return app.errorFlag;
      }
    } );*/
    this.registerListener ( "COD_SERVICIO", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; SERV_FAM_COD_SERVICIO_AFTER_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    /*this.registerListener ( "SERV_SERV_ASOC_FAM_GP", JDataPanelListener.BEFOREINSERT, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; SERV_ASOC_FAM_BEFORE_INSERT_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    */this.registerListener ( "SERV_SERV_ASOC_FAM_GP", JDataPanelListener.AFTERNEWINSTANCE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        //setItem ( "SEGURO_SOCIAL_JEFE_SERV", getDoubleItem ( "SEGURO_SOCIAL_CLIENTE" ) );
        resetChangeStatus ( ); return app.errorFlag;
      }
    } );
    /*this.registerListener ( "SERV_SERV_ASOC_FAM_GP", JDataPanelListener.BEFOREENTER, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; SERV_FAM_BV_ADL.exec ( app ); return app.errorFlag;
      }
    } );*/
    /*this.registerListener ( "SERV_SERV_ASOC_FAM_GP", JDataPanelListener.AFTERENTER, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; SERV_FAM_BV_ADL.exec ( app ); return app.errorFlag;
      }
    } );*/
    this.registerListener ( "SERV_SERV_ASOC_FAM_GP", JDataPanelListener.HOTKEYPRESS, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; PRE_MENU_ADL.exec ( app ); return app.errorFlag;
      }
    } );
  }
}





/**
 *
 */
class SERV_FAM_FRM_SERV_JEFE_FAM_INFO_GP_Arguments extends JDataPanelGroupArguments
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public SERV_FAM_FRM_SERV_JEFE_FAM_INFO_GP_Arguments ( Form form )
  {
    this.model = form;

    this.setArgName ( "SSN_JEFE_PAR" );
  }

  /**  */
  public Object getArgValue ( String argName )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    if ( argName == null )
    {
      return null;
    }
    else if ( argName.equals ( "SSN_JEFE_PAR" ) )
    {
      return this.app.getSSN_JEFE_FAM_GBL ( ); // Global Variable
    }
    return null;
  }
}



/**
 *
 */
class SERV_FAM_FRM_SERV_SERV_ASOC_FAM_GP_Arguments extends JDataPanelGroupArguments
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public SERV_FAM_FRM_SERV_SERV_ASOC_FAM_GP_Arguments ( Form form )
  {
    this.model = form;

    this.setArgName ( "SSN_JEFE_PAR" );
  }

  /**  */
  public Object getArgValue ( String argName )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    if ( argName == null )
    {
      return null;
    }
    else if ( argName.equals ( "SSN_JEFE_PAR" ) )
    {
      return this.app.getSSN_JEFE_FAM_GBL ( ); // Global Variable
    }
    return null;
  }
}




/**
 *
 */
class SERV_FAM_FRM_RMO_SERVProvider implements IObjectValueProvider
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public SERV_FAM_FRM_RMO_SERVProvider ( Form form )
  {
    this.model = form;
  }

  /**  */
  public Object getValue ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    return this.app.getRMO_GBL ( );
  }
}





