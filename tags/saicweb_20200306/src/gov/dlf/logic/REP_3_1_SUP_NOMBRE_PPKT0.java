package gov.dlf.logic;


import gov.dlf.facade.*;
import net.maintrend.appmanager.*;
import net.maintrend.interlink.*;
import net.maintrend.interfaces.*;
import net.maintrend.rallyengine.*;
import net.maintrend.util.*;



/**
 * 
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class REP_3_1_SUP_NOMBRE_PPKT0 
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
  public REP_3_1_SUP_NOMBRE_PPKT0 ( )
  {
    this.parms = new ParameterSet ( );
  }



  // -------------------------------------------------------------------
  // ----------   Class Methods   --------------------------------------

  /**
   *
   */
  public static REP_3_1_SUP_NOMBRE_PPKT0 get ( RallyApplication __app )
  {
    REP_3_1_SUP_NOMBRE_PPKT0 pp = ( REP_3_1_SUP_NOMBRE_PPKT0 ) __app.getNewInstance ( "REP_3_1_SUP_NOMBRE_PPKT0" );
    return pp;
  }


  /**
   * 
   * @param __app
   * @return
   */
  public static boolean exec ( RallyApplication __app )
  {
    REP_3_1_SUP_NOMBRE_PPKT0 pp = ( REP_3_1_SUP_NOMBRE_PPKT0 ) __app.getNewInstance ( "REP_3_1_SUP_NOMBRE_PPKT0" );
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
    return REP_3_1_SUP_NOMBRE_PPKT0.exec ( __app );
  }



  // -------------------------------------------------------------------
  // ----------   IRegisteredObject implementation   -------------------

  /**
   * 
   * @param rApp
   */
  @Override
public void setApplication ( Application rApp )
  {
    if ( rApp != null ) this.app = ( SAIC_DMQ_ORA_Application ) rApp;
  }


  /**
   * 
   * @return
   */
  @Override
public boolean isSelfClosing ( )
  {
    return true;
  }


  /**
   *
   */
  @Override
public ParameterSet getParameters ( )
  {
    return this.parms;
  }


  /**
   *
   */
  @Override
public void setParameters ( ParameterSet value )
  {
    this.parms = value;
  }


  /**
   *
   */
  @Override
public void execute ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "REP_3_1_SUP_NOMBRE_PPKT0" );
    this.prepareParms ( );
    TECNICO_NOMBRE_ADL.exec ( this.app, this.parms );
    this.returnParms  ( );
    this.app.unregister ( this, false );
  }


  /**
   * Occurs just after removing this object from the application registry
   */
  @Override
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
    this.app.form ( "REPORT_3_1_FR" ).setValue ( "ID_SUPERVISOR", this.parms.getDouble ( 0 ) );
    this.app.form ( "REPORT_3_1_FR" ).setValue ( "NOMBRE_COMPLETO", this.parms.getString ( 1 ) );
  }


  /**
   *
   */
  protected void prepareParms ( )
  {
    this.parms.reset ( );
    this.parms.set ( this.app.form ( "REPORT_3_1_FR" ).getValue ( "ID_SUPERVISOR" ) );
    this.parms.set ( this.app.form ( "REPORT_3_1_FR" ).getValue ( "NOMBRE_COMPLETO" ) );
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
