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
public class REFERIDO_PCK_ADL
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

  public double UPDATE_CONFIRM = 0;





  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setUPDATE_CONFIRM  ( RallyApplication __app, Parameter value )
  {
    ( ( REFERIDO_PCK_ADL ) __app.getADL ( REFERIDO_PCK_ADL.class ) ).UPDATE_CONFIRM = value.getDouble ( );
  }  
    



  /**  */
  public static double getUPDATE_CONFIRM  ( RallyApplication __app )
  {
    return ( ( REFERIDO_PCK_ADL ) __app.getADL ( REFERIDO_PCK_ADL.class ) ).UPDATE_CONFIRM;
  }


  /**  */
  public static Double getUPDATE_CONFIRMDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REFERIDO_PCK_ADL ) __app.getADL ( REFERIDO_PCK_ADL.class ) ).UPDATE_CONFIRM );
  }


  /**  */
  public static void setUPDATE_CONFIRM  ( RallyApplication __app, double value )
  {
    ( ( REFERIDO_PCK_ADL ) __app.getADL ( REFERIDO_PCK_ADL.class ) ).UPDATE_CONFIRM = value;
  }


  /**  */
  public static void setUPDATE_CONFIRM  ( RallyApplication __app, Object value )
  {
    ( ( REFERIDO_PCK_ADL ) __app.getADL ( REFERIDO_PCK_ADL.class ) ).UPDATE_CONFIRM = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static REFERIDO_PCK_ADL get ( RallyApplication __app )
  {
    REFERIDO_PCK_ADL adl = new REFERIDO_PCK_ADL ( );
    __app.register ( adl, "REFERIDO_PCK_ADL" );
    __app.setADL ( REFERIDO_PCK_ADL.class, adl ); 
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
    REFERIDO_PCK_ADL.get ( __app ).process ( ps );
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
    REFERIDO_PCK_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "REFERIDO_PCK_ADL" );
    if ( rObj != null && rObj instanceof REFERIDO_PCK_ADL )
    {
      this.app.setADL ( REFERIDO_PCK_ADL.class, ( REFERIDO_PCK_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "REFERIDO_PCK_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
      case 2:  { this.currentStep ++; this.step2 ( this.keyParms ); break; }
      case 3:  { this.currentStep ++; this.step3 ( this.keyParms ); break; }
      case 4:  { this.currentStep ++; this.step4 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "REFERIDO_PCK_ADL ended" );
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

    this.app.COD_ACCESS_GBL = "REFE";
    SECURITY_ADL.exec ( this.app );
    return;

  }


  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {

    if ( Compare.equals ( this.app.ACCESS_STATUS_GBL, "FAILURE" ) ) 
    {
      this.app.setError ( 0, 1006 );
      this.doReturn ( );
      return; 
    }

    this.callParms.clear ( );
    this.callParms.set ( UPDATE_CONFIRM  );
    SECURITY_CHECK_GBLS_ADL.exec ( this.app, this.callParms );
    return;

  }


  /**
   *
   */
  protected void step2 ( ParameterSet ps )
  {
    this.callParms.reset ( );
    UPDATE_CONFIRM  = this.callParms.getDouble ( );

    if ( Compare.equals ( UPDATE_CONFIRM, 1 ) ) 
    {
      this._condition0 = true;
    }
    else
    {
      this._condition0 = false;
    }
    if ( this._condition0 )
    {
      REFERIDO_PCK.exec ( this.app );
      return;
    }

  }


  /**
   *
   */
  protected void step3 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( Compare.equals ( UPDATE_CONFIRM, 1 ) ) 
    {
    }
    else
    {
      REFERIDO_RO_PCK.exec ( this.app );
      return;
    }

  }


  /**
   *
   */
  protected void step4 ( ParameterSet ps )
  {
    UPDATE_CONFIRM = 0;

  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE REFERIDO_PCK_ADL;
VAR
   UPDATE_CONFIRM       : NUMBER(1,0);

BEGIN
SET_TRACE();
cod_acceSs_gbl := 'REFE';
CALL SECURITY_ADL;
IF ACCESS_STATUS_GBL = 'FAILURE' 
   THEN BEGIN
        ERROR(1006);
        RETURN;
        END;
CALL SECURITY_CHECK_GBLS_ADL(UPDATE_CONFIRM);
     IF (UPDATE_CONFIRM = 1) THEN CALL REFERIDO_PCK;
     ELSE CALL REFERIDO_RO_PCK;
UPDATE_CONFIRM := 0;

SET_NOTRACE();
END;

    



--------------------------------------------------------------------- */
