package gov.dlf.logic;


import gov.dlf.external.*;
import gov.dlf.facade.*;
import gov.dlf.presentation.*;


import java.awt.event.ActionEvent;

import net.maintrend.appmanager.*;
import net.maintrend.interlink.*;
import net.maintrend.interfaces.*;
import net.maintrend.mdi.*;
import net.maintrend.rallyengine.*;
import net.maintrend.util.*;



/**
 * 
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class SERVICIOS_COUNTER_PPKT0 
  implements IRegisteredObject 
{
  // -------------------------------------------------------------------
  // ----------   Instance Attributes   --------------------------------

  /**  */
  public ParameterSet parms;
  /**  */
  public SAIC_DMQ_ORA_Application app;



  // -------------------------------------------------------------------
  // ----------   Constructor   ----------------------------------------

  /**
   *
   */
  public SERVICIOS_COUNTER_PPKT0 ( )
  {
    this.parms = new ParameterSet ( );
  }



  // -------------------------------------------------------------------
  // ----------   Class Methods   --------------------------------------

  /**
   *
   */
  public static SERVICIOS_COUNTER_PPKT0 get ( RallyApplication __app )
  {
    SERVICIOS_COUNTER_PPKT0 pp = ( SERVICIOS_COUNTER_PPKT0 ) __app.getNewInstance ( "SERVICIOS_COUNTER_PPKT0" );
    return pp;
  }


  /**
   * 
   * @param __app
   * @return
   */
  public static boolean exec ( RallyApplication __app )
  {
    SERVICIOS_COUNTER_PPKT0 pp = ( SERVICIOS_COUNTER_PPKT0 ) __app.getNewInstance ( "SERVICIOS_COUNTER_PPKT0" );
    pp.execute ( __app, null );
    return true;
  }


  /**
   * 
   * @param __app
   * @return
   */
  public static boolean exec ( RallyApplication __app, ParameterSet ps )
  {
    return SERVICIOS_COUNTER_PPKT0.exec ( __app );
  }



  // -------------------------------------------------------------------
  // ----------   IRegisteredObject implementation   -------------------

  /**
   * 
   * @param rApp
   */
  public void setApplication ( Application rApp )
  {
    if ( rApp != null ) this.app = ( SAIC_DMQ_ORA_Application ) rApp;
  }


  /**
   * 
   * @return
   */
  public boolean isSelfClosing ( )
  {
    return true;
  }


  /**
   *
   */
  public ParameterSet getParameters ( )
  {
    return this.parms;
  }


  /**
   *
   */
  public void setParameters ( ParameterSet value )
  {
    this.parms = value;
  }


  /**
   *
   */
  public void execute ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "SERVICIOS_COUNTER_PPKT0" );
    this.prepareParms ( );
    REPORT_3_1_ADL.exec ( this.app, this.parms );
    this.returnParms  ( );
    this.app.unregister ( this, false );
  }


  /**
   * Occurs just after removing this object from the application registry
   */
  public void halt ( )
  {
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   *
   */
  protected void returnParms ( )
  {
    this.app.form ( "REPORT_3_1_FR" ).setValue ( "ID_SUPERVISOR0", this.parms.getDouble ( 0 ) );
    this.app.form ( "REPORT_3_1_FR" ).setValue ( "ID_TECNICO0", this.parms.getDouble ( 1 ) );
    this.app.form ( "REPORT_3_1_FR" ).setValue ( "SERVICIOS_COUNTER", this.parms.getDouble ( 2 ) );
    this.app.form ( "REPORT_3_1_FR" ).setValue ( "SERVICIOS_PAN_COUNTER", this.parms.getDouble ( 3 ) );
    this.app.form ( "REPORT_3_1_FR" ).setValue ( "SERVICIOS_AE_COUNTER", this.parms.getDouble ( 4 ) );
    this.app.form ( "REPORT_3_1_FR" ).setValue ( "VOLUMEN_COUNTER", this.parms.getDouble ( 5 ) );
  }


  /**
   *
   */
  protected void prepareParms ( )
  {
    this.parms.reset ( );
    this.parms.set ( this.app.form ( "REPORT_3_1_FR" ).getValue ( "ID_SUPERVISOR0" ) );
    this.parms.set ( this.app.form ( "REPORT_3_1_FR" ).getValue ( "ID_TECNICO0" ) );
    this.parms.set ( this.app.form ( "REPORT_3_1_FR" ).getValue ( "SERVICIOS_COUNTER" ) );
    this.parms.set ( this.app.form ( "REPORT_3_1_FR" ).getValue ( "SERVICIOS_PAN_COUNTER" ) );
    this.parms.set ( this.app.form ( "REPORT_3_1_FR" ).getValue ( "SERVICIOS_AE_COUNTER" ) );
    this.parms.set ( this.app.form ( "REPORT_3_1_FR" ).getValue ( "VOLUMEN_COUNTER" ) );
  }


  /**
   *
   */
  public void execute ( RallyApplication __app, ParameterSet ps )
  {
    this.app = ( SAIC_DMQ_ORA_Application ) __app;
    this.execute ( ps );
  }
}
