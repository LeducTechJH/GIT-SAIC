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
public class ACCION_LOV_FRM
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
  public ACCION_LOV_FRM ( )
  {
    super ( );
    this.setName ( "ACCION_LOV_FRM" );

    Debug.println ( Debug.TRACE, "ACCION_LOV_FRM - constructor" );

    this.setDefinitionPath ( "gov/dlf/presentation/ACCION_LOV_FRM.jdp" );
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

    this.setArguments ( "ACCION_GRP", new ACCION_LOV_FRM_ACCION_GRP_Arguments ( this ) );

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
  }
}





/**
 *
 */
class ACCION_LOV_FRM_ACCION_GRP_Arguments extends JDataPanelGroupArguments
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public ACCION_LOV_FRM_ACCION_GRP_Arguments ( Form form )
  {
    this.model = form;

    this.setArgName ( "COD_GENERAL_PRM" );
  }

  /**  */
  public Object getArgValue ( String argName )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    if ( argName == null )
    {
      return null;
    }
    else if ( argName.equals ( "COD_GENERAL_PRM" ) )
    {
      return this.app.getPARENTESCO_VAR ( ); // Global Variable
    }
    return null;
  }
}






