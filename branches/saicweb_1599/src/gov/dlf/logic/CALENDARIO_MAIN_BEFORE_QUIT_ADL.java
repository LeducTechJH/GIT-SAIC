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
public class CALENDARIO_MAIN_BEFORE_QUIT_ADL
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
 
  public boolean _condition1 = false;
 
  public boolean _condition2 = false;

 

  // -------------------------------------------------------------------
  // ----------   Instance Export Attributes   -------------------------

  public double COMMAND = 0;





  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setCOMMAND  ( RallyApplication __app, Parameter value )
  {
    ( ( CALENDARIO_MAIN_BEFORE_QUIT_ADL ) __app.getADL ( CALENDARIO_MAIN_BEFORE_QUIT_ADL.class ) ).COMMAND = value.getDouble ( );
  }  
    



  /**  */
  public static double getCOMMAND  ( RallyApplication __app )
  {
    return ( ( CALENDARIO_MAIN_BEFORE_QUIT_ADL ) __app.getADL ( CALENDARIO_MAIN_BEFORE_QUIT_ADL.class ) ).COMMAND;
  }


  /**  */
  public static Double getCOMMANDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CALENDARIO_MAIN_BEFORE_QUIT_ADL ) __app.getADL ( CALENDARIO_MAIN_BEFORE_QUIT_ADL.class ) ).COMMAND );
  }


  /**  */
  public static void setCOMMAND  ( RallyApplication __app, double value )
  {
    ( ( CALENDARIO_MAIN_BEFORE_QUIT_ADL ) __app.getADL ( CALENDARIO_MAIN_BEFORE_QUIT_ADL.class ) ).COMMAND = value;
  }


  /**  */
  public static void setCOMMAND  ( RallyApplication __app, Object value )
  {
    ( ( CALENDARIO_MAIN_BEFORE_QUIT_ADL ) __app.getADL ( CALENDARIO_MAIN_BEFORE_QUIT_ADL.class ) ).COMMAND = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static CALENDARIO_MAIN_BEFORE_QUIT_ADL get ( RallyApplication __app )
  {
    CALENDARIO_MAIN_BEFORE_QUIT_ADL adl = new CALENDARIO_MAIN_BEFORE_QUIT_ADL ( );
    __app.register ( adl, "CALENDARIO_MAIN_BEFORE_QUIT_ADL" );
    __app.setADL ( CALENDARIO_MAIN_BEFORE_QUIT_ADL.class, adl ); 
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
    CALENDARIO_MAIN_BEFORE_QUIT_ADL.get ( __app ).process ( ps );
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
    CALENDARIO_MAIN_BEFORE_QUIT_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "CALENDARIO_MAIN_BEFORE_QUIT_ADL" );
    if ( rObj != null && rObj instanceof CALENDARIO_MAIN_BEFORE_QUIT_ADL )
    {
      this.app.setADL ( CALENDARIO_MAIN_BEFORE_QUIT_ADL.class, ( CALENDARIO_MAIN_BEFORE_QUIT_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "CALENDARIO_MAIN_BEFORE_QUIT_ADL Step " + this.currentStep );
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
        Debug.println ( Debug.TRACE, "CALENDARIO_MAIN_BEFORE_QUIT_ADL ended" );
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

    if ( ( ! Compare.equals ( INVOCAR_CALENDARIO_ADL.getLOCAL_FUNCTION_REPUESTA ( this.app ), "A" ) ) && ( ! Compare.equals ( INVOCAR_CALENDARIO_ADL.getLOCAL_FUNCTION_REPUESTA ( this.app ), "R" ) )  && ( ! Compare.equals ( INVOCAR_CALENDARIO_ADL.getLOCAL_FUNCTION_REPUESTA ( this.app ), "C" ) )  ) 
    {
      this._condition0 = true;
    }
    else
    {
      this._condition0 = false;
    }
    if ( this._condition0 )
    {
      if ( Compare.equals ( this.app.INFORMACION_REQUERIMIENTO_GBL, "T" ) ) 
      {
        INVOCAR_CALENDARIO_ADL.setFIN_SOLICITUD ( this.app, "T" );
        INFORMACION_REFERIMIENTO_ADL.setCOMPLETION_STATUS ( this.app, "FAILURE" );
      }
      this.app.errorFlag = false;
      this.app.callCommand ( RallyAppCommandFactory.IGNORE );
      return;
    }

  }


  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( ( ! Compare.equals ( INVOCAR_CALENDARIO_ADL.getLOCAL_FUNCTION_REPUESTA ( this.app ), "A" ) ) && ( ! Compare.equals ( INVOCAR_CALENDARIO_ADL.getLOCAL_FUNCTION_REPUESTA ( this.app ), "R" ) )  && ( ! Compare.equals ( INVOCAR_CALENDARIO_ADL.getLOCAL_FUNCTION_REPUESTA ( this.app ), "C" ) )  ) 
    {
      //this.app.executeCommand ( RallyAppCommandFactory.EXITACTION );
      return;
    }

  }


  /**
   *
   */
  protected void step2 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( ( ! Compare.equals ( INVOCAR_CALENDARIO_ADL.getLOCAL_FUNCTION_REPUESTA ( this.app ), "A" ) ) && ( ! Compare.equals ( INVOCAR_CALENDARIO_ADL.getLOCAL_FUNCTION_REPUESTA ( this.app ), "R" ) )  && ( ! Compare.equals ( INVOCAR_CALENDARIO_ADL.getLOCAL_FUNCTION_REPUESTA ( this.app ), "C" ) )  ) 
    {
      return;/* 
      this.doReturn ( );
      return;*/ 
    }
    if ( Compare.equals ( INVOCAR_CALENDARIO_ADL.getLOCAL_FUNCTION_REPUESTA ( this.app ), "A" ) ) 
    {
      this._condition1 = true;
    }
    else
    {
      this._condition1 = false;
    }
    if ( this._condition1 )
    {
      INVOCAR_CALENDARIO_ADL.setLOCAL_FUNCTION_REPUESTA ( this.app, " " );
      this.app.callCommand ( RallyAppCommandFactory.IGNORE );
      return;
    }

  }


  /**
   *
   */
  protected void step3 ( ParameterSet ps )
  {
    if ( this._condition1 )    //    if ( Compare.equals ( INVOCAR_CALENDARIO_ADL.getLOCAL_FUNCTION_REPUESTA ( this.app ), "A" ) ) 
    {
      this.app.errorFlag = false;
      this.doReturn ( );
      return; 
    }
    if ( Compare.equals ( INVOCAR_CALENDARIO_ADL.getLOCAL_FUNCTION_REPUESTA ( this.app ), "R" ) ) 
    {
      this._condition2 = true;
    }
    else
    {
      this._condition2 = false;
    }
    if ( this._condition2 )
    {
      INVOCAR_CALENDARIO_ADL.setLOCAL_FUNCTION_REPUESTA ( this.app, " " );
      this.app.callCommand ( RallyAppCommandFactory.IGNORE );
      return;
    }

  }


  /**
   *
   */
  protected void step4 ( ParameterSet ps )
  {
    if ( this._condition2 )    //    if ( Compare.equals ( INVOCAR_CALENDARIO_ADL.getLOCAL_FUNCTION_REPUESTA ( this.app ), "R" ) ) 
    {
      this.app.errorFlag = false;
      this.doReturn ( );
      return; 
    }
    if ( Compare.equals ( this.app.INFORMACION_REQUERIMIENTO_GBL, "T" ) ) 
    {
      this.app.INFORMACION_REQUERIMIENTO_GBL = "";
      INFORMACION_REFERIMIENTO_ADL.setCOMPLETION_STATUS ( this.app, "FAILURE" );
      INVOCAR_CALENDARIO_ADL.setFIN_SOLICITUD ( this.app, "T" );
    }
    if ( Compare.equals ( this.app.INFORMACION_REQUERIMIENTO_GBL, "" ) ) 
    {
      INVOCAR_CALENDARIO_ADL.setFIN_SOLICITUD ( this.app, "T" );
      this.app.returnTo ( "INVOCAR_CALENDARIO_ADL" ); if ( true ) return;
    }
    if ( Compare.equals ( this.app.INFORMACION_REQUERIMIENTO_GBL, "P" ) ) 
    {
      PLAN_TRAB_PARK_CALEND_LF_ADL.setFECHA_ACTIV_RET ( this.app, this.app.form ( "CALENDARIO_MAIN_FR" ).getDateItem ( "FCH_ACTIVIDAD_HORA_MIN_CONTAC0" ));
      PLAN_TRAB_PARK_CALEND_LF_ADL.setDURACION_RET ( this.app, this.app.form ( "CALENDARIO_MAIN_FR" ).getDateItem ( "DURACION_HORA_MIN_CONTACTO" ));
      INVOCAR_CALENDARIO_ADL.setFIN_SOLICITUD ( this.app, "T" );
      PLAN_TRAB_PARK_CALEND_LF_ADL.setSTATUS_INS ( this.app, "F" );
      this.app.returnTo ( "PLAN_TRAB_PARK_CALEND_LF_ADL" ); if ( true ) return;
    }

  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE CALENDARIO_MAIN_BEFORE_QUIT_ADL;

VAR

        COMMAND:        NUMBER(9,0);


BEGIN

SET_TRACE();

IF (INVOCAR_CALENDARIO_ADL.LOCAL_FUNCTION_REPUESTA <> 'A') AND
   (INVOCAR_CALENDARIO_ADL.LOCAL_FUNCTION_REPUESTA <> 'R') AND
   (INVOCAR_CALENDARIO_ADL.LOCAL_FUNCTION_REPUESTA <> 'C') THEN
BEGIN
    IF INFORMACION_REQUERIMIENTO_GBL = 'T'
    THEN
        BEGIN
          INVOCAR_CALENDARIO_ADL.FIN_SOLICITUD := 'T';
          INFORMACION_REFERIMIENTO_ADL.COMPLETION_STATUS := 'FAILURE';
        END;
    SET_FAILURE();
    CALL_CMD(IGNORE);
    EXECUTE_CMD('FINISH ACTION');
    RETURN;
END;

IF (INVOCAR_CALENDARIO_ADL.LOCAL_FUNCTION_REPUESTA = 'A') THEN
    BEGIN
    INVOCAR_CALENDARIO_ADL.LOCAL_FUNCTION_REPUESTA := ' ';
    CALL_CMD('IGNORE');
    SET_FAILURE();
{   CALL_CMD(RGPREV);
    CALL_CMD(QBE);}
    RETURN;
    END;

IF (INVOCAR_CALENDARIO_ADL.LOCAL_FUNCTION_REPUESTA = 'R') THEN
    BEGIN
    INVOCAR_CALENDARIO_ADL.LOCAL_FUNCTION_REPUESTA := ' ';
    CALL_CMD('IGNORE');
    SET_FAILURE();
{   CALL_CMD(RGPREV);
    CALL_CMD(QBE);}
    RETURN;
    END;


IF INFORMACION_REQUERIMIENTO_GBL = 'T'
THEN BEGIN
        INFORMACION_REQUERIMIENTO_GBL:='';
        INFORMACION_REFERIMIENTO_ADL.COMPLETION_STATUS:='FAILURE';
        INVOCAR_CALENDARIO_ADL.FIN_SOLICITUD:='T';

{       RETURN_TO SAVE_CALEND_ACTIVITY_VALUES_ADL;}
     END;

if (informacion_requerimiento_gbl = '') then
begin
        INVOCAR_CALENDARIO_ADL.FIN_SOLICITUD := 'T';
        RETURN_TO INVOCAR_CALENDARIO_ADL;
END;

IF (INFORMACION_REQUERIMIENTO_GBL = 'P') THEN
BEGIN
        PLAN_TRAB_PARK_CALEND_LF_ADL.FECHA_ACTIV_RET := 
                CALENDARIO_MAIN_FR.FCH_ACTIVIDAD_HORA_MIN_CONTAC0;
        PLAN_TRAB_PARK_CALEND_LF_ADL.DURACION_RET :=
                CALENDARIO_MAIN_FR.DURACION_HORA_MIN_CONTACTO;
        INVOCAR_CALENDARIO_ADL.FIN_SOLICITUD:='T';
        PLAN_TRAB_PARK_CALEND_LF_ADL.STATUS_INS := 'F';
        RETURN_TO PLAN_TRAB_PARK_CALEND_LF_ADL;
END;
SET_NOTRACE();
END;
    



--------------------------------------------------------------------- */
