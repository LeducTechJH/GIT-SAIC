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
public class TANF_SSTEMP_FR
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
  public TANF_SSTEMP_FR ( )
  {
    super ( );
    this.setName ( "TANF_SSTEMP_FR" );

    Debug.println ( Debug.TRACE, "TANF_SSTEMP_FR - constructor" );

    this.setDefinitionPath ( "gov/dlf/presentation/TANF_SSTEMP_FR.jdp" );
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

    this.setArguments ( "DESGLOSE", new TANF_SSTEMP_FR_DESGLOSE_Arguments ( this ) );

    this.setObjectEvents ( );
    field = ( JDataPanelField ) this.getInDepth ( "FECHA" );
    field.setValueProvider ( new TANF_SSTEMP_FR_FECHAProvider ( this ) );



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
class TANF_SSTEMP_FR_DESGLOSE_Arguments extends JDataPanelGroupArguments
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public TANF_SSTEMP_FR_DESGLOSE_Arguments ( Form form )
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
class TANF_SSTEMP_FR_FECHAProvider implements IObjectValueProvider
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public TANF_SSTEMP_FR_FECHAProvider ( Form form )
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





