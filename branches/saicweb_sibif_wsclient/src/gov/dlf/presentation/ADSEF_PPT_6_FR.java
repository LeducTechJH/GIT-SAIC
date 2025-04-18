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
public class ADSEF_PPT_6_FR
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
  public ADSEF_PPT_6_FR ( )
  {
    super ( );
    this.setName ( "ADSEF_PPT_6_FR" );

    Debug.println ( Debug.TRACE, "ADSEF_PPT_6_FR - constructor" );

    this.setDefinitionPath ( "gov/dlf/presentation/ADSEF_PPT_6_FR.jdp" );
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
    field.setValueProvider ( new ADSEF_PPT_6_FR_FECHAProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "SSJF" );
    field.setValueProvider ( new ADSEF_PPT_6_FR_SSJFProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "SSMF" );
    field.setValueProvider ( new ADSEF_PPT_6_FR_SSMFProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "NOMBRE" );
    field.setValueProvider ( new ADSEF_PPT_6_FR_NOMBREProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "DIR1" );
    field.setValueProvider ( new ADSEF_PPT_6_FR_DIR1Provider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "DIR2" );
    field.setValueProvider ( new ADSEF_PPT_6_FR_DIR2Provider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "PATERNO" );
    field.setValueProvider ( new ADSEF_PPT_6_FR_PATERNOProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "FCITA" );
    field.setValueProvider ( new ADSEF_PPT_6_FR_FCITAProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "HCITA" );
    field.setValueProvider ( new ADSEF_PPT_6_FR_HCITAProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "LCITA" );
    field.setValueProvider ( new ADSEF_PPT_6_FR_LCITAProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "OCITA" );
    field.setValueProvider ( new ADSEF_PPT_6_FR_OCITAProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "MESES" );
    field.setValueProvider ( new ADSEF_PPT_6_FR_MESESProvider ( this ) );



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
class ADSEF_PPT_6_FR_FECHAProvider implements IObjectValueProvider
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public ADSEF_PPT_6_FR_FECHAProvider ( Form form )
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
class ADSEF_PPT_6_FR_SSJFProvider implements IObjectValueProvider
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public ADSEF_PPT_6_FR_SSJFProvider ( Form form )
  {
    this.model = form;
  }

  /**  */
  public Object getValue ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    return PPT_6_ADL.getSSJFDouble ( this.app );
  }
}



/**
 *
 */
class ADSEF_PPT_6_FR_SSMFProvider implements IObjectValueProvider
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public ADSEF_PPT_6_FR_SSMFProvider ( Form form )
  {
    this.model = form;
  }

  /**  */
  public Object getValue ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    return PPT_6_ADL.getSSMFDouble ( this.app );
  }
}



/**
 *
 */
class ADSEF_PPT_6_FR_NOMBREProvider implements IObjectValueProvider
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public ADSEF_PPT_6_FR_NOMBREProvider ( Form form )
  {
    this.model = form;
  }

  /**  */
  public Object getValue ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    return PPT_6_ADL.getNOMBRE ( this.app );
  }
}



/**
 *
 */
class ADSEF_PPT_6_FR_DIR1Provider implements IObjectValueProvider
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public ADSEF_PPT_6_FR_DIR1Provider ( Form form )
  {
    this.model = form;
  }

  /**  */
  public Object getValue ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    return PPT_6_ADL.getDIR1 ( this.app );
  }
}



/**
 *
 */
class ADSEF_PPT_6_FR_DIR2Provider implements IObjectValueProvider
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public ADSEF_PPT_6_FR_DIR2Provider ( Form form )
  {
    this.model = form;
  }

  /**  */
  public Object getValue ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    return PPT_6_ADL.getDIR2 ( this.app );
  }
}



/**
 *
 */
class ADSEF_PPT_6_FR_PATERNOProvider implements IObjectValueProvider
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public ADSEF_PPT_6_FR_PATERNOProvider ( Form form )
  {
    this.model = form;
  }

  /**  */
  public Object getValue ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    return PPT_6_ADL.getPATERNO ( this.app );
  }
}



/**
 *
 */
class ADSEF_PPT_6_FR_FCITAProvider implements IObjectValueProvider
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public ADSEF_PPT_6_FR_FCITAProvider ( Form form )
  {
    this.model = form;
  }

  /**  */
  public Object getValue ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    return PPT_6_ADL.getFCITA ( this.app );
  }
}



/**
 *
 */
class ADSEF_PPT_6_FR_HCITAProvider implements IObjectValueProvider
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public ADSEF_PPT_6_FR_HCITAProvider ( Form form )
  {
    this.model = form;
  }

  /**  */
  public Object getValue ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    return PPT_6_ADL.getHCITA ( this.app );
  }
}



/**
 *
 */
class ADSEF_PPT_6_FR_LCITAProvider implements IObjectValueProvider
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public ADSEF_PPT_6_FR_LCITAProvider ( Form form )
  {
    this.model = form;
  }

  /**  */
  public Object getValue ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    return PPT_6_ADL.getLCITA ( this.app );
  }
}



/**
 *
 */
class ADSEF_PPT_6_FR_OCITAProvider implements IObjectValueProvider
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public ADSEF_PPT_6_FR_OCITAProvider ( Form form )
  {
    this.model = form;
  }

  /**  */
  public Object getValue ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    return PPT_6_ADL.getOCITA ( this.app );
  }
}



/**
 *
 */
class ADSEF_PPT_6_FR_MESESProvider implements IObjectValueProvider
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public ADSEF_PPT_6_FR_MESESProvider ( Form form )
  {
    this.model = form;
  }

  /**  */
  public Object getValue ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    return PPT_6_ADL.getMESESDouble ( this.app );
  }
}





