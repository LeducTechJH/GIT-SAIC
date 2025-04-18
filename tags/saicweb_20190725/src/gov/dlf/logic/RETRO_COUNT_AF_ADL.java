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
public class RETRO_COUNT_AF_ADL
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

 

  // -------------------------------------------------------------------
  // ----------   Instance Export Attributes   -------------------------

  public double COMMAND = 0;





  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setCOMMAND  ( RallyApplication __app, Parameter value )
  {
    ( ( RETRO_COUNT_AF_ADL ) __app.getADL ( RETRO_COUNT_AF_ADL.class ) ).COMMAND = value.getDouble ( );
  }  
    



  /**  */
  public static double getCOMMAND  ( RallyApplication __app )
  {
    return ( ( RETRO_COUNT_AF_ADL ) __app.getADL ( RETRO_COUNT_AF_ADL.class ) ).COMMAND;
  }


  /**  */
  public static Double getCOMMANDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( RETRO_COUNT_AF_ADL ) __app.getADL ( RETRO_COUNT_AF_ADL.class ) ).COMMAND );
  }


  /**  */
  public static void setCOMMAND  ( RallyApplication __app, double value )
  {
    ( ( RETRO_COUNT_AF_ADL ) __app.getADL ( RETRO_COUNT_AF_ADL.class ) ).COMMAND = value;
  }


  /**  */
  public static void setCOMMAND  ( RallyApplication __app, Object value )
  {
    ( ( RETRO_COUNT_AF_ADL ) __app.getADL ( RETRO_COUNT_AF_ADL.class ) ).COMMAND = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static RETRO_COUNT_AF_ADL get ( RallyApplication __app )
  {
    RETRO_COUNT_AF_ADL adl = new RETRO_COUNT_AF_ADL ( );
    __app.register ( adl, "RETRO_COUNT_AF_ADL" );
    __app.setADL ( RETRO_COUNT_AF_ADL.class, adl ); 
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
    RETRO_COUNT_AF_ADL.get ( __app ).process ( ps );
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
    RETRO_COUNT_AF_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "RETRO_COUNT_AF_ADL" );
    if ( rObj != null && rObj instanceof RETRO_COUNT_AF_ADL )
    {
      this.app.setADL ( RETRO_COUNT_AF_ADL.class, ( RETRO_COUNT_AF_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "RETRO_COUNT_AF_ADL Step " + this.currentStep );
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
        Debug.println ( Debug.TRACE, "RETRO_COUNT_AF_ADL ended" );
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

    COMMAND = RallyAppCommandFactory.translate ( this.app.getLastCommandName ( ) );
    this.app.STATUS_SERV_GBL = this.app.form ( "LISTA_RETRO_FR" ).getStringItem ( "COD_STATUS_SERVICIO" );
    if ( Compare.equals ( COMMAND, RallyAppCommandFactory.INSAFTER ) ) 
    {
      this._condition0 = true;
    }
    else
    {
      this._condition0 = false;
    }
    if ( this._condition0 )
    {
      if ( Compare.equals ( this.app.SUPV_GBL, 1 ) ) 
      {
        this._condition1 = true;
      }
      else
      {
        this._condition1 = false;
      }
      if ( this._condition1 )
      {
        this.app.setError ( 0, 5542 );
        this.app.callCommand ( RallyAppCommandFactory.IGNORE );
        return;
      }
    }

  }


  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( Compare.equals ( COMMAND, RallyAppCommandFactory.INSAFTER ) ) 
    {
      if ( this._condition1 )    //      if ( Compare.equals ( this.app.SUPV_GBL, 1 ) ) 
      {
        this.app.errorFlag = false;
      }
      else
      {
        RETRO_INSERT_PKT.exec ( this.app );
        return;
      }
    }

  }


  /**
   *
   */
  protected void step2 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( Compare.equals ( COMMAND, RallyAppCommandFactory.INSAFTER ) ) 
    {
      if ( this._condition1 )    //      if ( Compare.equals ( this.app.SUPV_GBL, 1 ) ) 
      {
      }
      else
      {
        this.app.callCommand ( RallyAppCommandFactory.IGNORE );
        return;
      }
    }

  }


  /**
   *
   */
  protected void step3 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( Compare.equals ( COMMAND, RallyAppCommandFactory.INSAFTER ) ) 
    {
      if ( this._condition1 )    //      if ( Compare.equals ( this.app.SUPV_GBL, 1 ) ) 
      {
      }
      else
      {
        this.app.callCommand ( RallyAppCommandFactory.QBE );
        return;
      }
    }

  }


  /**
   *
   */
  protected void step4 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( Compare.equals ( COMMAND, RallyAppCommandFactory.INSAFTER ) ) 
    {
      if ( this._condition1 )    //      if ( Compare.equals ( this.app.SUPV_GBL, 1 ) ) 
      {
      }
      else
      {
        this.app.callCommand ( RallyAppCommandFactory.QUERY );
        return;
      }
    }

  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE retro_count_af_adl;

var
        command:        number(9,0);

begin
set_trace();
     command:=get_cmd();
     status_serv_gbl := LISTA_REtro_FR.COD_STATUS_SERVICIO;
     if command=INSAFTER
        then begin
                IF SUPV_GBL = 1 
                THEN
                   begin
                         ERROR(5542);
                         call_cmd(IGNORE);
                         set_failure();
                   end;
                ELSE
                begin
                        CALL RETRO_INSERT_PKT;
                        call_cmd(IGNORE);
                        call_cmd(QBE);
                        call_cmd(QUERY);
                end;
             end;
{
LISTA_REtro_FR.PARKING_FIELD_RECLA := '  ';
}
set_notrace();
end;


    



--------------------------------------------------------------------- */
