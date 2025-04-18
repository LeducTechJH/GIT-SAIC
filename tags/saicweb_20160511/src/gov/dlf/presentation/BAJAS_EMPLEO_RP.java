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
public class BAJAS_EMPLEO_RP
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
  public BAJAS_EMPLEO_RP ( )
  {
    super ( );
    this.setName ( "BAJAS_EMPLEO_RP" );

    Debug.println ( Debug.TRACE, "BAJAS_EMPLEO_RP - constructor" );

    this.setDefinitionPath ( "gov/dlf/presentation/BAJAS_EMPLEO_RP.jdp" );
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

    this.setArguments ( "REGISTRO_GP", new BAJAS_EMPLEO_RP_REGISTRO_GP_Arguments ( this ) );

    this.setObjectEvents ( );
    field = ( JDataPanelField ) this.getInDepth ( "FCH_DESDE" );
    field.setValueProvider ( new BAJAS_EMPLEO_RP_FCH_DESDEProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "FCH_HASTA" );
    field.setValueProvider ( new BAJAS_EMPLEO_RP_FCH_HASTAProvider ( this ) );



    calculator = new BAJAS_EMPLEO_RP_OFICINACalculator ( this );
    field = ( JDataPanelField ) this.getInDepth ( "OFICINA" );
    field.setValueCalculator ( calculator );
    calculator = new BAJAS_EMPLEO_RP_NOMBRE_COMPLETOCalculator ( this );
    field = ( JDataPanelField ) this.getInDepth ( "NOMBRE_COMPLETO" );
    field.setValueCalculator ( calculator );
    calculator = new BAJAS_EMPLEO_RP_MESESCalculator ( this );
    field = ( JDataPanelField ) this.getInDepth ( "MESES" );
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
class BAJAS_EMPLEO_RP_REGISTRO_GP_Arguments extends JDataPanelGroupArguments
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public BAJAS_EMPLEO_RP_REGISTRO_GP_Arguments ( Form form )
  {
    this.model = form;

    this.setArgName ( "PFCH_HASTA" );
    this.setArgName ( "RMO_PAR" );
    this.setArgName ( "PFCH_DESDE" );
  }

  /**  */
  public Object getArgValue ( String argName )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    if ( argName == null )
    {
      return null;
    }
    else if ( argName.equals ( "PFCH_HASTA" ) )
    {
      return this.app.getFECHA_HASTA_GBL ( ); // Global Variable
    }
    else if ( argName.equals ( "RMO_PAR" ) )
    {
      return this.app.getRMO_GBL ( ); // Global Variable
    }
    else if ( argName.equals ( "PFCH_DESDE" ) )
    {
      return this.app.getFECHA_DESDE_GBL ( ); // Global Variable
    }
    return null;
  }
}




/**
 *
 */
class BAJAS_EMPLEO_RP_FCH_DESDEProvider implements IObjectValueProvider
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public BAJAS_EMPLEO_RP_FCH_DESDEProvider ( Form form )
  {
    this.model = form;
  }

  /**  */
  public Object getValue ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    return this.app.getFECHA_DESDE_GBL ( );
  }
}



/**
 *
 */
class BAJAS_EMPLEO_RP_FCH_HASTAProvider implements IObjectValueProvider
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public BAJAS_EMPLEO_RP_FCH_HASTAProvider ( Form form )
  {
    this.model = form;
  }

  /**  */
  public Object getValue ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    return this.app.getFECHA_HASTA_GBL ( );
  }
}






/**
 *
 */
class BAJAS_EMPLEO_RP_OFICINACalculator implements ICalculator
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public BAJAS_EMPLEO_RP_OFICINACalculator ( Form form )
  {
    this.model = form;
  }

  /**  */
  public void calculate ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    this.app.exec ( "BAJAS_EMPLEO_OFC_PPKT" );
  }
}



/**
 *
 */
class BAJAS_EMPLEO_RP_NOMBRE_COMPLETOCalculator implements ICalculator
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public BAJAS_EMPLEO_RP_NOMBRE_COMPLETOCalculator ( Form form )
  {
    this.model = form;
  }

  /**  */
  public void calculate ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    this.app.exec ( "BAJAS_EMPLEO_NOM_PPKT" );
  }
}



/**
 *
 */
class BAJAS_EMPLEO_RP_MESESCalculator implements ICalculator
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public BAJAS_EMPLEO_RP_MESESCalculator ( Form form )
  {
    this.model = form;
  }

  /**  */
  public void calculate ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    BAJAS_MESES_EMP_ADL.exec ( this.app, null );
  }
}


