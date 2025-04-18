package gov.dlf.logic;


import gov.dlf.facade.*;
import java.util.*;

import net.maintrend.interfaces.*;
import net.maintrend.interlink.*;
import net.maintrend.rallyengine.*;
import net.maintrend.util.*;
import net.maintrend.jdatapanel.JDataPanelGroup;


/**
 * __Comment
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class CALENDARIO_MAIN_EXECUTE_QUERY_ADL
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



  public Date NULL_DATE = null;

  public String NULL_CHAR = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------


  /**  */
  public static Date getNULL_DATE  ( RallyApplication __app )
  {
    return ( ( CALENDARIO_MAIN_EXECUTE_QUERY_ADL ) __app.getADL ( CALENDARIO_MAIN_EXECUTE_QUERY_ADL.class ) ).NULL_DATE;
  }


  /**  */
  public static void setNULL_DATE  ( RallyApplication __app, Date value )
  {
    ( ( CALENDARIO_MAIN_EXECUTE_QUERY_ADL ) __app.getADL ( CALENDARIO_MAIN_EXECUTE_QUERY_ADL.class ) ).NULL_DATE = value;
  }


  /**  */
  public static void setNULL_DATE  ( RallyApplication __app, Object value )
  {
    ( ( CALENDARIO_MAIN_EXECUTE_QUERY_ADL ) __app.getADL ( CALENDARIO_MAIN_EXECUTE_QUERY_ADL.class ) ).NULL_DATE = ( Date ) value;
  }



  /**  */
  public static String getNULL_CHAR  ( RallyApplication __app )
  {
    return ( ( CALENDARIO_MAIN_EXECUTE_QUERY_ADL ) __app.getADL ( CALENDARIO_MAIN_EXECUTE_QUERY_ADL.class ) ).NULL_CHAR;
  }


  /**  */
  public static void setNULL_CHAR  ( RallyApplication __app, String value )
  {
    ( ( CALENDARIO_MAIN_EXECUTE_QUERY_ADL ) __app.getADL ( CALENDARIO_MAIN_EXECUTE_QUERY_ADL.class ) ).NULL_CHAR = value;
  }


  /**  */
  public static void setNULL_CHAR  ( RallyApplication __app, Object value )
  {
    ( ( CALENDARIO_MAIN_EXECUTE_QUERY_ADL ) __app.getADL ( CALENDARIO_MAIN_EXECUTE_QUERY_ADL.class ) ).NULL_CHAR = ( String ) value;
  }





  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static CALENDARIO_MAIN_EXECUTE_QUERY_ADL get ( RallyApplication __app )
  {
    CALENDARIO_MAIN_EXECUTE_QUERY_ADL adl = new CALENDARIO_MAIN_EXECUTE_QUERY_ADL ( );
    __app.register ( adl, "CALENDARIO_MAIN_EXECUTE_QUERY_ADL" );
    __app.setADL ( CALENDARIO_MAIN_EXECUTE_QUERY_ADL.class, adl ); 
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
    CALENDARIO_MAIN_EXECUTE_QUERY_ADL.get ( __app ).process ( ps );
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
    CALENDARIO_MAIN_EXECUTE_QUERY_ADL.exec ( __app, ps );
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param __app
   */
  @Override
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
  @Override
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
    IRegisteredObject rObj = this.app.get ( "CALENDARIO_MAIN_EXECUTE_QUERY_ADL" );
    if ( rObj != null && rObj instanceof CALENDARIO_MAIN_EXECUTE_QUERY_ADL )
    {
      this.app.setADL ( CALENDARIO_MAIN_EXECUTE_QUERY_ADL.class, ( CALENDARIO_MAIN_EXECUTE_QUERY_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  @Override
protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "CALENDARIO_MAIN_EXECUTE_QUERY_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
      case 2:  { this.currentStep ++; this.step2 ( this.keyParms ); break; }
      case 3:  { this.currentStep ++; this.step3 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "CALENDARIO_MAIN_EXECUTE_QUERY_ADL ended" );
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

    NULL_DATE = TruncService.setNull ( NULL_DATE  );
    NULL_CHAR = TruncService.setNull ( NULL_CHAR  );
    if ( ( Compare.equals ( this.app.RUTINA_GBL, "IR" ) ) && ( Compare.equals ( this.app.RESPUESTA_A_Y_IR_GBL, "Y" ) )  ) 
    {
      this.app.returnTo ( "SAVE_CALEND_ACTIVITY_VALUES_ADL" ); if ( true ) return;
    }
    if ( ! Compare.equals ( this.app.form ( "CALENDARIO_MAIN_FR" ).getDateItem ( "FCH_ACTIVIDAD_HORA_MIN_CONTAC0" ), NULL_DATE ) ) 
    {
      this._condition0 = true;
    }
    else
    {
      this._condition0 = false;
    }
    if ( this._condition0 )
    {
      this.app.form ( "CALENDARIO_MAIN_FR" ).setItem ( "FECHA_NUEVA", INVOCAR_CALENDARIO_ADL.getFECHA_PEDIDA ( this.app )  );
      if ( ! Compare.equals ( this.app.INFORMACION_REQUERIMIENTO_GBL, "" ) ) 
      {
        this._condition1 = true;
      }
      else
      {
        this._condition1 = false;
      }
      if ( this._condition1 )
      {
        this.app.executeCommand ( RallyAppCommandFactory.FNEXT );
        return;
      }
    }

  }


  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( ! Compare.equals ( this.app.form ( "CALENDARIO_MAIN_FR" ).getDateItem ( "FCH_ACTIVIDAD_HORA_MIN_CONTAC0" ), NULL_DATE ) ) 
    {
      if ( this._condition1 )    //      if ( ! Compare.equals ( this.app.INFORMACION_REQUERIMIENTO_GBL, "" ) ) 
      {
        return;
      }
      else if ( Compare.gt ( this.app.CALENDARIO_SAVE_POSITION, 0 )  )
      {
        this._condition2 = true;
      }
      else
      {
        this._condition2 = false;
      }
      if ( this._condition2 )
      {
        this.app.executeCommand ( RallyAppCommandFactory.FNEXT );
        return;
      }
    }

  }


  /**
   *
   */
  protected void step2 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( ! Compare.equals ( this.app.form ( "CALENDARIO_MAIN_FR" ).getDateItem ( "FCH_ACTIVIDAD_HORA_MIN_CONTAC0" ), NULL_DATE ) ) 
    {
      if ( this._condition1 )    //      if ( ! Compare.equals ( this.app.INFORMACION_REQUERIMIENTO_GBL, "" ) ) 
      {
      }
      else if ( this._condition2 )    //      else if ( Compare.gt ( this.app.CALENDARIO_SAVE_POSITION, 0 )  )
      {
        return;
      }
      else
      {
        this.doReturn ( );
        return;
      }
    }
    else
    {
      if ( this.app.FCH_INICIO_GBL == null )
      {
        this.app.FCH_INICIO_GBL =  TruncService.trunc ( new java.util.Date ( ), "DDD" );
        this.app.FCH_FINAL_GBL = MathService.plus ( this.app.FCH_INICIO_GBL, 7  );
        INVOCAR_CALENDARIO_ADL.setFECHA_PEDIDA ( this.app,  this.app.FCH_INICIO_GBL );
      }
      if ( ! Compare.equals ( this.app.INFORMACION_REQUERIMIENTO_GBL, "P" ) ) 
      {
        this.app.COD_RAZON_GBL = NULL_CHAR;
      }
      this.app.executeCommand ( RallyAppCommandFactory.QUERY );
      
      Form form = this.app.getLastForm ( "CALENDARIO_MAIN_FR" );
      if ( form != null )
      {
        JDataPanelGroup group = ( JDataPanelGroup ) form.getInDepth ( "CALENDARIO_GRP" );
        if ( group != null && group.getData ( ) != null && group.getData ( ).size ( ) <= 0 )
        {          
          this.app.setError ( 0, 4511 );
          INVOCAR_CALENDARIO_ADL.setFIN_SOLICITUD ( this.app, "T" );
          this.app.executeCommand ( RallyAppCommandFactory.EXITACTION );       
        }
      }
      
      return;
    }

  }



  /**
   *
   */
  protected void step3 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( ! Compare.equals ( this.app.form ( "CALENDARIO_MAIN_FR" ).getDateItem ( "FCH_ACTIVIDAD_HORA_MIN_CONTAC0" ), NULL_DATE ) ) 
    {
    }
    else
    {
      return; 
    }

  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE CALENDARIO_MAIN_EXECUTE_QUERY_ADL;

VAR
                NULL_DATE       :       DATE;
                NULL_CHAR       :       CHAR;
BEGIN
SET_TRACE();
MAKE_NULL(NULL_DATE);
MAKE_NULL(NULL_CHAR);
IF (RUTINA_GBL='IR') AND (RESPUESTA_A_Y_IR_GBL='Y')
   THEN BEGIN
          RETURN_TO SAVE_CALEND_ACTIVITY_VALUES_ADL;
        END;

IF CALENDARIO_MAIN_FR.FCH_ACTIVIDAD_HORA_MIN_CONTAC0 <> NULL_DATE
THEN BEGIN
        CALENDARIO_MAIN_FR.FECHA_NUEVA:=INVOCAR_CALENDARIO_ADL.FECHA_PEDIDA;
        IF INFORMACION_REQUERIMIENTO_GBL <> ''
        THEN EXECUTE_CMD('NEXT FIELD');
        ELSE IF CALENDARIO_SAVE_POSITION>0 THEN EXECUTE_CMD('NEXT FIELD');
             ELSE RETURN;
     END;
ELSE BEGIN
        IF (INFORMACION_REQUERIMIENTO_GBL <> 'P') THEN
                COD_RAZON_GBL := NULL_CHAR;
        EXECUTE_CMD('EXECUTE QUERY');
     END;
SET_NOTRACE();
END;
    



--------------------------------------------------------------------- */
