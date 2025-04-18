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
public class REPORT_6_6_RP
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
  public REPORT_6_6_RP ( )
  {
    super ( );
    this.setName ( "REPORT_6_6_RP" );

    Debug.println ( Debug.TRACE, "REPORT_6_6_RP - constructor" );

    this.setDefinitionPath ( "gov/dlf/presentation/REPORT_6_6_RP.jdp" );
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


    this.setObjectEvents ( );
    field = ( JDataPanelField ) this.getInDepth ( "FECHA" );
    field.setValueProvider ( new REPORT_6_6_RP_FECHAProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "FECHA_DESDE" );
    field.setValueProvider ( new REPORT_6_6_RP_FECHA_DESDEProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "FECHA_HASTA" );
    field.setValueProvider ( new REPORT_6_6_RP_FECHA_HASTAProvider ( this ) );



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
  }
}






/**
 *
 */
class REPORT_6_6_RP_FECHAProvider implements IObjectValueProvider
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public REPORT_6_6_RP_FECHAProvider ( Form form )
  {
    this.model = form;
  }

  /**  */
  public Object getValue ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    return this.app.getSYSTEM_DATE ( );
  }
}



/**
 *
 */
class REPORT_6_6_RP_FECHA_DESDEProvider implements IObjectValueProvider
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public REPORT_6_6_RP_FECHA_DESDEProvider ( Form form )
  {
    this.model = form;
  }

  /**  */
  public Object getValue ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    return this.app.form ( "REPORT_6_6_FR" ).getValue ( "INPUT_START_DATE" );
  }
}



/**
 *
 */
class REPORT_6_6_RP_FECHA_HASTAProvider implements IObjectValueProvider
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public REPORT_6_6_RP_FECHA_HASTAProvider ( Form form )
  {
    this.model = form;
  }

  /**  */
  public Object getValue ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    return this.app.form ( "REPORT_6_6_FR" ).getValue ( "INPUT_END_DATE" );
  }
}





