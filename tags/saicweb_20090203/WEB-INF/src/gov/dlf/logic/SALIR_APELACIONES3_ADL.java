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
public class SALIR_APELACIONES3_ADL
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

  public double COUNTER = 0;





  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setCOUNTER  ( RallyApplication __app, Parameter value )
  {
    ( ( SALIR_APELACIONES3_ADL ) __app.getADL ( SALIR_APELACIONES3_ADL.class ) ).COUNTER = value.getDouble ( );
  }  
    



  /**  */
  public static double getCOUNTER  ( RallyApplication __app )
  {
    return ( ( SALIR_APELACIONES3_ADL ) __app.getADL ( SALIR_APELACIONES3_ADL.class ) ).COUNTER;
  }


  /**  */
  public static Double getCOUNTERDouble ( RallyApplication __app )
  {
    return new Double ( ( ( SALIR_APELACIONES3_ADL ) __app.getADL ( SALIR_APELACIONES3_ADL.class ) ).COUNTER );
  }


  /**  */
  public static void setCOUNTER  ( RallyApplication __app, double value )
  {
    ( ( SALIR_APELACIONES3_ADL ) __app.getADL ( SALIR_APELACIONES3_ADL.class ) ).COUNTER = value;
  }


  /**  */
  public static void setCOUNTER  ( RallyApplication __app, Object value )
  {
    ( ( SALIR_APELACIONES3_ADL ) __app.getADL ( SALIR_APELACIONES3_ADL.class ) ).COUNTER = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static SALIR_APELACIONES3_ADL get ( RallyApplication __app )
  {
    SALIR_APELACIONES3_ADL adl = new SALIR_APELACIONES3_ADL ( );
    __app.register ( adl, "SALIR_APELACIONES3_ADL" );
    __app.setADL ( SALIR_APELACIONES3_ADL.class, adl ); 
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
    SALIR_APELACIONES3_ADL.get ( __app ).process ( ps );
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
    SALIR_APELACIONES3_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "SALIR_APELACIONES3_ADL" );
    if ( rObj != null && rObj instanceof SALIR_APELACIONES3_ADL )
    {
      this.app.setADL ( SALIR_APELACIONES3_ADL.class, ( SALIR_APELACIONES3_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "SALIR_APELACIONES3_ADL Step " + this.currentStep );
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
        Debug.println ( Debug.TRACE, "SALIR_APELACIONES3_ADL ended" );
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

    COUNTER = 1;
    this.process ( ps );

  }


  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {

    if ( Compare.le ( COUNTER, 3 ) ) 
    {
      this._condition0 = true;
    }
    else
    {
      this._condition0 = false;
    }
    if ( this._condition0 )
    {
      if ( Compare.equals ( this.app.RETIRO_APELACION_GBL, "S" ) ) 
      {
        this._condition1 = true;
      }
      else
      {
        this._condition1 = false;
      }
      if ( this._condition1 )
      {
        REPORT_RETIRO_APELACION_PKT.exec ( this.app );
        return;
      }
    }

  }


  /**
   *
   */
  protected void step2 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    while ( Compare.le ( COUNTER, 3 ) ) 
    {
      if ( this._condition1 )    //      if ( Compare.equals ( this.app.RETIRO_APELACION_GBL, "S" ) ) 
      {
      }
      if ( Compare.equals ( this.app.RETIRO_APELACION_GBL, "N" ) ) 
      {
        this._condition2 = true;
      }
      else
      {
        this._condition2 = false;
      }
      if ( this._condition2 )
      {
        REPORT_SOLICITUD_APELACION_PKT.exec ( this.app );
        return;
      }
    }

  }


  /**
   *
   */
  protected void step3 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    while ( Compare.le ( COUNTER, 3 ) ) 
    {
      if ( this._condition2 )    //      if ( Compare.equals ( this.app.RETIRO_APELACION_GBL, "N" ) ) 
      {
      }
      COUNTER = MathService.plus ( COUNTER, 1  );
      this.currentStep = 1;
      return;
    }

  }
}



/* ---------------------------------------------------------------------


     
procedure salir_apelaciones3_adl;
var
        counter    : number(1,0);
begin
set_trace();
counter := 1;

        while (counter <= 3) do
        begin
        if RETIRO_APELACION_GBL = 'S'
        then
        call REPORT_RETIRO_APELACION_PKT;
        {endif}
        
        if RETIRO_APELACION_GBL = 'N'
        then
        call REPORT_SOLICITUD_APELACION_PKT;
        {endif}
        counter := counter + 1;
        end;

set_notrace();
end;
    



--------------------------------------------------------------------- */
