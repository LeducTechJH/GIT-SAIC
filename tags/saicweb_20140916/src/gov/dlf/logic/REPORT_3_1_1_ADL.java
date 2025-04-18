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
public class REPORT_3_1_1_ADL
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
 
  public boolean _condition0 = false;

 

  // -------------------------------------------------------------------
  // ----------   Instance Export Attributes   -------------------------

  public double SUPERVISOR_SERVICIOS_TABLE = 0;

  public double STATUS = 0;



  public DataStore REPORT_3_1_FR_DSD = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setSUPERVISOR_SERVICIOS_TABLE  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_3_1_1_ADL ) __app.getADL ( REPORT_3_1_1_ADL.class ) ).SUPERVISOR_SERVICIOS_TABLE = value.getDouble ( );
  }  

  
  /**  */
  public static void setSTATUS  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_3_1_1_ADL ) __app.getADL ( REPORT_3_1_1_ADL.class ) ).STATUS = value.getDouble ( );
  }  
    


  /**  */
  public static DataStore getREPORT_3_1_FR_DSD  ( RallyApplication __app )
  {
    return ( ( REPORT_3_1_1_ADL ) __app.getADL ( REPORT_3_1_1_ADL.class ) ).REPORT_3_1_FR_DSD;
  }


  /**  */
  public static void setREPORT_3_1_FR_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( REPORT_3_1_1_ADL ) __app.getADL ( REPORT_3_1_1_ADL.class ) ).REPORT_3_1_FR_DSD = value;
  }


  /**  */
  public static void setREPORT_3_1_FR_DSD  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_3_1_1_ADL ) __app.getADL ( REPORT_3_1_1_ADL.class ) ).REPORT_3_1_FR_DSD = ( DataStore ) value;
  }




  /**  */
  public static double getSUPERVISOR_SERVICIOS_TABLE  ( RallyApplication __app )
  {
    return ( ( REPORT_3_1_1_ADL ) __app.getADL ( REPORT_3_1_1_ADL.class ) ).SUPERVISOR_SERVICIOS_TABLE;
  }


  /**  */
  public static Double getSUPERVISOR_SERVICIOS_TABLEDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REPORT_3_1_1_ADL ) __app.getADL ( REPORT_3_1_1_ADL.class ) ).SUPERVISOR_SERVICIOS_TABLE );
  }


  /**  */
  public static void setSUPERVISOR_SERVICIOS_TABLE  ( RallyApplication __app, double value )
  {
    ( ( REPORT_3_1_1_ADL ) __app.getADL ( REPORT_3_1_1_ADL.class ) ).SUPERVISOR_SERVICIOS_TABLE = value;
  }


  /**  */
  public static void setSUPERVISOR_SERVICIOS_TABLE  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_3_1_1_ADL ) __app.getADL ( REPORT_3_1_1_ADL.class ) ).SUPERVISOR_SERVICIOS_TABLE = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSTATUS  ( RallyApplication __app )
  {
    return ( ( REPORT_3_1_1_ADL ) __app.getADL ( REPORT_3_1_1_ADL.class ) ).STATUS;
  }


  /**  */
  public static Double getSTATUSDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REPORT_3_1_1_ADL ) __app.getADL ( REPORT_3_1_1_ADL.class ) ).STATUS );
  }


  /**  */
  public static void setSTATUS  ( RallyApplication __app, double value )
  {
    ( ( REPORT_3_1_1_ADL ) __app.getADL ( REPORT_3_1_1_ADL.class ) ).STATUS = value;
  }


  /**  */
  public static void setSTATUS  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_3_1_1_ADL ) __app.getADL ( REPORT_3_1_1_ADL.class ) ).STATUS = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static REPORT_3_1_1_ADL get ( RallyApplication __app )
  {
    REPORT_3_1_1_ADL adl = new REPORT_3_1_1_ADL ( );
    __app.register ( adl, "REPORT_3_1_1_ADL" );
    __app.setADL ( REPORT_3_1_1_ADL.class, adl ); 
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
    REPORT_3_1_1_ADL.get ( __app ).process ( ps );
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
    REPORT_3_1_1_ADL.exec ( __app, ps );
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
      this.dm.setMaxRetrieveLimit(10000);
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
    IRegisteredObject rObj = this.app.get ( "REPORT_3_1_1_ADL" );
    if ( rObj != null && rObj instanceof REPORT_3_1_1_ADL )
    {
      this.app.setADL ( REPORT_3_1_1_ADL.class, ( REPORT_3_1_1_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "REPORT_3_1_1_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "REPORT_3_1_1_ADL ended" );
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

    REPORT_3_1_FR_DSD = this.dm.create ( "REPORT_3_1_FR_DSD" );
    SUPERVISOR_SERVICIOS_TABLE = REPORT_3_1_FR_DSD.getId ( );
    STATUS = RallyDataStoreException.getDefault ( );

    STATUS  = this.dm.reset ( SUPERVISOR_SERVICIOS_TABLE );

    if ( Compare.equals ( STATUS, 0 ) ) 
    {
      this._condition0 = true;
    }
    else
    {
      this._condition0 = false;
    }
    if ( this._condition0 )
    {
      REPORT_3_1_PKT_NEW.exec ( this.app );
      return;
    }

  }


  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {

    STATUS  = this.dm.rollBack ( );
    STATUS  = this.dm.dbClose ( SUPERVISOR_SERVICIOS_TABLE );

  }
}



/* ---------------------------------------------------------------------


     



procedure report_3_1_1_adl;
  

var   supervisor_servicios_table    : number(9,0)  export;
      status              : number(9,0);

begin

SET_TRACE();

    DB_OPEN(REPORT_3_1_ADL_DSD,SUPERVISOR_SERVICIOS_TABLE,STATUS);
    DB_RESET(SUPERVISOR_SERVICIOS_TABLE,STATUS);

IF (STATUS = 0) THEN             CALL REPORT_3_1_PKT;
            
DB_ROLLBACK(STATUS);
DB_CLOSE(SUPERVISOR_SERVICIOS_TABLE,STATUS);
SET_NOTRACE();
END;

    



--------------------------------------------------------------------- */
