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
public class RESUMEN_SOL_LIHEAP_FRM
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
  public RESUMEN_SOL_LIHEAP_FRM ( )
  {
    super ( );
    this.setName ( "RESUMEN_SOL_LIHEAP_FRM" );

    Debug.println ( Debug.TRACE, "RESUMEN_SOL_LIHEAP_FRM - constructor" );

    this.setDefinitionPath ( "gov/dlf/presentation/RESUMEN_SOL_LIHEAP_FRM.jdp" );
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
    field = ( JDataPanelField ) this.getInDepth ( "TSS_ID" );
    field.setValueProvider ( new RESUMEN_SOL_LIHEAP_TSS_IDProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "NOMBRE_TECNICO" );
    field.setValueProvider ( new RESUMEN_SOL_LIHEAP_NOMBRE_TECNICOProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "FECHA" );
    field.setValueProvider ( new RESUMEN_SOL_LIHEAP_FECHAProvider ( this ) );



    calculator = new RESUMEN_SOL_LIHEAP_NOMBRE_CLIENTE1Calculator ( this );
    field = ( JDataPanelField ) this.getInDepth ( "NOMBRE_CLIENTE1" );
    field.setValueCalculator ( calculator );
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
class RESUMEN_SOL_LIHEAP_TSS_IDProvider implements IObjectValueProvider
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public RESUMEN_SOL_LIHEAP_TSS_IDProvider ( Form form )
  {
    this.model = form;
  }

  /**  */
  public Object getValue ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    return this.app.getID_TECNICO_GBL ( );
  }
}



/**
 *
 */
class RESUMEN_SOL_LIHEAP_NOMBRE_TECNICOProvider implements IObjectValueProvider
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public RESUMEN_SOL_LIHEAP_NOMBRE_TECNICOProvider ( Form form )
  {
    this.model = form;
  }

  /**  */
  public Object getValue ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    return this.app.getUSUARIO_GBL ( );
  }
}



/**
 *
 */
class RESUMEN_SOL_LIHEAP_FECHAProvider implements IObjectValueProvider
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public RESUMEN_SOL_LIHEAP_FECHAProvider ( Form form )
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
class RESUMEN_SOL_LIHEAP_NOMBRE_CLIENTE1Calculator implements ICalculator
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public RESUMEN_SOL_LIHEAP_NOMBRE_CLIENTE1Calculator ( Form form )
  {
    this.model = form;
  }

  /**  */
  public void calculate ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    NOMBRE_FULL_CLIENTE10.exec ( this.app );
    //this.app.exec ( "NOMBRE_FULL_CLIENTE10" );
  }
}


