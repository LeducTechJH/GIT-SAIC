package gov.dlf.logic;


import gov.dlf.external.*;
import gov.dlf.facade.*;
import gov.dlf.presentation.*;


import java.util.*;

import net.maintrend.appmanager.*;
import net.maintrend.datamanager.*;
import net.maintrend.interfaces.*;
import net.maintrend.interlink.*;
import net.maintrend.mdi.*;
import net.maintrend.rallyengine.*;
import net.maintrend.util.*;
import net.maintrend.util.format.*;



/**
 * __Comment
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class DSS109_MENU_ADL
     extends ADL
{
  // -------------------------------------------------------------------
  // ----------   Class Attributes   -----------------------------------

  /**  */
  public static boolean staticCall = false;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes   --------------------------------

  /**  */
  public SAIC_DMQ_ORA_Application app;
  /**  */
  public RallyDataManager dm = null;



  // -------------------------------------------------------------------
  // ----------   Instance Condition Attributes   ----------------------

 

  // -------------------------------------------------------------------
  // ----------   Instance Export Attributes   -------------------------

  public double COMM = 0;





  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setCOMM  ( RallyApplication __app, Parameter value )
  {
    ( ( DSS109_MENU_ADL ) __app.getADL ( DSS109_MENU_ADL.class ) ).COMM = value.getDouble ( );
  }  
    



  /**  */
  public static double getCOMM  ( RallyApplication __app )
  {
    return ( ( DSS109_MENU_ADL ) __app.getADL ( DSS109_MENU_ADL.class ) ).COMM;
  }


  /**  */
  public static Double getCOMMDouble ( RallyApplication __app )
  {
    return new Double ( ( ( DSS109_MENU_ADL ) __app.getADL ( DSS109_MENU_ADL.class ) ).COMM );
  }


  /**  */
  public static void setCOMM  ( RallyApplication __app, double value )
  {
    ( ( DSS109_MENU_ADL ) __app.getADL ( DSS109_MENU_ADL.class ) ).COMM = value;
  }


  /**  */
  public static void setCOMM  ( RallyApplication __app, Object value )
  {
    ( ( DSS109_MENU_ADL ) __app.getADL ( DSS109_MENU_ADL.class ) ).COMM = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static DSS109_MENU_ADL get ( RallyApplication __app )
  {
    DSS109_MENU_ADL adl = new DSS109_MENU_ADL ( );
    __app.register ( adl, "DSS109_MENU_ADL" );
    __app.setADL ( DSS109_MENU_ADL.class, adl ); 
    adl.setApplication ( __app );
    return adl;
  }


  /**
   *
   * @param __app
   * @param ps
   *
   * @return
   */
  public static void exec ( RallyApplication __app, ParameterSet ps )
  {
    DSS109_MENU_ADL.get ( __app ).process ( ps );
  }


  /**
   *
   * @param __app
   *
   * @return
   */
  public static void exec ( RallyApplication __app )
  {
    ParameterSet ps = null;
    DSS109_MENU_ADL.exec ( __app, ps );
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param __app
   */
  public void setApplication ( RallyApplication __app )
  {
    this.app = ( SAIC_DMQ_ORA_Application ) __app;
    if ( this.app != null )
    {
      this.dm = ( RallyDataManager ) this.app.getDataManager ( );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param parms
   */
  public void execute ( ParameterSet parms )
  {
    this.process ( parms );
  }




  /**
   *
   */
  protected void doReturn ( )
  {
    this.unregister ( );
  }


  /**
   *
   */
  public void unregister ( )
  {
    this.app.unregister ( this );
    IRegisteredObject rObj = this.app.get ( "DSS109_MENU_ADL" );
    if ( rObj != null && rObj instanceof DSS109_MENU_ADL )
    {
      this.app.setADL ( DSS109_MENU_ADL.class, ( DSS109_MENU_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "DSS109_MENU_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "DSS109_MENU_ADL ended" );
        this.unregister ( );
        break;
      }
    }
    if ( this.currentStep > 0 ) this.app.goOn ( );
  }



  /**
   *
   */
  protected void step0 ( ParameterSet ps )
  {

    COMM = RallyAppCommandFactory.translate ( this.app.getLastCommandName ( ) );
    if ( Compare.equals ( COMM, RallyAppCommandFactory.FPREV ) ) 
    {
      this.doReturn ( );
      return;
    }
    this.app.SS_JEFE_SERVICIO_GBL = this.app.form ( "DSS109_MENU_FR" ).getDoubleItem ( "DSS109_SSES" );
    this.app.SS_JEFE_FAMILIA_GBL = this.app.form ( "DSS109_MENU_FR" ).getDoubleItem ( "DSS109_SSJF" );
    this.app.COD_SERVICIO_GBL = this.app.form ( "DSS109_MENU_FR" ).getStringItem ( "DSS109_CS" );
    this.app.RR_ACCION_GBL = this.app.form ( "DSS109_MENU_FR" ).getStringItem ( "DSS109_ACCI" );
    this.app.RR_FCH_IDN = this.app.form ( "DSS109_MENU_FR" ).getDateItem ( "DSS109_FCHI" );
    this.app.FECHA_PLUS_15_GBL = MathService.plus ( this.app.SYSTEM_DATE, 15  );
    REPORT_9_14_PKT.exec ( this.app );
    return;

  }


  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {
    REPORT_9_14_PKT.exec ( this.app );
    return;

  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE DSS109_MENU_ADL;

VAR     COMM    :       NUMBER;

SET_TRACE();

COMM := GET_CMD();

IF COMM = FPREV
THEN
RETURN;

ss_jefe_servicio_gbl := dss109_menu_fr.dss109_sses;
ss_jefe_familia_gbl  := dss109_menu_fr.dss109_ssjf;
cod_servicio_gbl     := dss109_menu_fr.dss109_cs;
RR_ACCION_GBL        := dss109_menu_fr.dss109_acci;
RR_FCH_IDN           := dss109_menu_fr.dss109_fchi;
fecha_plus_15_gbl    := system_date + 15;

CALL report_9_14_pkt;
CALL report_9_14_pkt;

SET_NOTRACE();
    



--------------------------------------------------------------------- */
