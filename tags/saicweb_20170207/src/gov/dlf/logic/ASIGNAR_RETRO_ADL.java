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
public class ASIGNAR_RETRO_ADL
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





  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------
    




  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static ASIGNAR_RETRO_ADL get ( RallyApplication __app )
  {
    ASIGNAR_RETRO_ADL adl = new ASIGNAR_RETRO_ADL ( );
    __app.register ( adl, "ASIGNAR_RETRO_ADL" );
    __app.setADL ( ASIGNAR_RETRO_ADL.class, adl ); 
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
    ASIGNAR_RETRO_ADL.get ( __app ).process ( ps );
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
    ASIGNAR_RETRO_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "ASIGNAR_RETRO_ADL" );
    if ( rObj != null && rObj instanceof ASIGNAR_RETRO_ADL )
    {
      this.app.setADL ( ASIGNAR_RETRO_ADL.class, ( ASIGNAR_RETRO_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "ASIGNAR_RETRO_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
      case 2:  { this.currentStep ++; this.step2 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "ASIGNAR_RETRO_ADL ended" );
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

    this.app.ACCESS_STATUS_GBL = "";
    this.app.COD_ACCESS_GBL = "RAUT";
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
      this.app.setError ( 0, 7500 );
      this.doReturn ( );
      return; 
    }
    this.app.RR_STATUS_GBL = "REFERIDO";
    this.app.RR_ACCION_GBL = "RETR";
    this.app.RR_RE_ACCION_GBL = "RRET";
    if ( Compare.equals ( this.app.SUPV_GBL, 1 ) ) 
    {
      this._condition0 = true;
    }
    else
    {
      this._condition0 = false;
    }
    if ( this._condition0 )
    {
      RR_LISTA_SEL_MNU_PKT.exec ( this.app );
      return;
    }

  }


  /**
   *
   */
  protected void step2 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( Compare.equals ( this.app.SUPV_GBL, 1 ) ) 
    {
    }
    else
    {
      this.app.setError ( 1, 5542 );
    }

  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE ASIGNAR_RETRO_ADL;

SET_TRACE();

BEGIN

ACCESS_STATUS_GBL:='';
COD_ACCESS_GBL:='RAUT';
CALL SECURITY_ADL;
IF ACCESS_STATUS_GBL = 'FAILURE' THEN 
        BEGIN
                ERROR(7500);
                RETURN;
        END;

RR_STATUS_GBL           :=      'REFERIDO';
RR_ACCION_GBL           :=      'RETR';
RR_RE_ACCION_GBL        :=      'RRET';

IF SUPV_GBL = 1
THEN
   CALL RR_LISTA_SEL_MNU_PKT;
ELSE
   ERROR(5542);

END;

SET_NOTRACE();
    



--------------------------------------------------------------------- */
