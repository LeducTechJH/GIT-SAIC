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
public class DSS220_RPT_FR
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
  public DSS220_RPT_FR ( )
  {
    super ( );
    this.setName ( "DSS220_RPT_FR" );

    Debug.println ( Debug.TRACE, "DSS220_RPT_FR - constructor" );

    this.setDefinitionPath ( "gov/dlf/presentation/DSS220_RPT_FR.jdp" );
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
    field = ( JDataPanelField ) this.getInDepth ( "DSS220_OFI_LOC" );
    field.setValueProvider ( new DSS220_RPT_FR_DSS220_OFI_LOCProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "DSS220_REGION" );
    field.setValueProvider ( new DSS220_RPT_FR_DSS220_REGIONProvider ( this ) );



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
class DSS220_RPT_FR_DSS220_OFI_LOCProvider implements IObjectValueProvider
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public DSS220_RPT_FR_DSS220_OFI_LOCProvider ( Form form )
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



/**
 *
 */
class DSS220_RPT_FR_DSS220_REGIONProvider implements IObjectValueProvider
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public DSS220_RPT_FR_DSS220_REGIONProvider ( Form form )
  {
    this.model = form;
  }

  /**  */
  public Object getValue ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    return this.app.getREG_GBL ( );
  }
}





