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
public class DSS108_MENU_ADL
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





  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------
    




  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static DSS108_MENU_ADL get ( RallyApplication __app )
  {
    DSS108_MENU_ADL adl = new DSS108_MENU_ADL ( );
    __app.register ( adl, "DSS108_MENU_ADL" );
    __app.setADL ( DSS108_MENU_ADL.class, adl ); 
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
    DSS108_MENU_ADL.get ( __app ).process ( ps );
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
    DSS108_MENU_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "DSS108_MENU_ADL" );
    if ( rObj != null && rObj instanceof DSS108_MENU_ADL )
    {
      this.app.setADL ( DSS108_MENU_ADL.class, ( DSS108_MENU_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "DSS108_MENU_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "DSS108_MENU_ADL ended" );
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

    this.app.SS_JEFE_FAMILIA_GBL = this.app.form ( "DSS108_MENU_FR" ).getDoubleItem ( "DSS108_SSJF" );
    this.app.SS_JEFE_SERVICIO_GBL = this.app.form ( "DSS108_MENU_FR" ).getDoubleItem ( "DSS108_SSES" );
    this.app.COD_SERVICIO_GBL = this.app.form ( "DSS108_MENU_FR" ).getStringItem ( "DSS108_CS" );
    REPORT_9_10A_PKT.exec ( this.app );
    return;

  }


  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {
    REPORT_9_10A_PKT.exec ( this.app );
    return;

  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE DSS108_MENU_ADL;

SET_TRACE();

BEGIN

SS_JEFE_FAMILIA_GBL := DSS108_MENU_FR.DSS108_SSJF;
SS_JEFE_SERVICIO_GBL := DSS108_MENU_FR.DSS108_SSES;
COD_SERVICIO_GBL := DSS108_MENU_FR.DSS108_CS;   

CALL REPORT_9_10A_PKT;
CALL REPORT_9_10A_PKT;

END;

{
CALL DSS108_RPT_PKT;
}
SET_NOTRACE();
    



--------------------------------------------------------------------- */
