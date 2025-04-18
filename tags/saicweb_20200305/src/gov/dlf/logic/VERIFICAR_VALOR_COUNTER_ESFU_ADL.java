package gov.dlf.logic;


import gov.dlf.facade.*;
import net.maintrend.interfaces.*;
import net.maintrend.interlink.*;
import net.maintrend.rallyengine.*;
import net.maintrend.util.*;



/**
 * __Comment
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class VERIFICAR_VALOR_COUNTER_ESFU_ADL
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

  public double COMMAND = 0;





  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setCOMMAND  ( RallyApplication __app, Parameter value )
  {
    ( ( VERIFICAR_VALOR_COUNTER_ESFU_ADL ) __app.getADL ( VERIFICAR_VALOR_COUNTER_ESFU_ADL.class ) ).COMMAND = value.getDouble ( );
  }  
    



  /**  */
  public static double getCOMMAND  ( RallyApplication __app )
  {
    return ( ( VERIFICAR_VALOR_COUNTER_ESFU_ADL ) __app.getADL ( VERIFICAR_VALOR_COUNTER_ESFU_ADL.class ) ).COMMAND;
  }


  /**  */
  public static Double getCOMMANDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( VERIFICAR_VALOR_COUNTER_ESFU_ADL ) __app.getADL ( VERIFICAR_VALOR_COUNTER_ESFU_ADL.class ) ).COMMAND );
  }


  /**  */
  public static void setCOMMAND  ( RallyApplication __app, double value )
  {
    ( ( VERIFICAR_VALOR_COUNTER_ESFU_ADL ) __app.getADL ( VERIFICAR_VALOR_COUNTER_ESFU_ADL.class ) ).COMMAND = value;
  }


  /**  */
  public static void setCOMMAND  ( RallyApplication __app, Object value )
  {
    ( ( VERIFICAR_VALOR_COUNTER_ESFU_ADL ) __app.getADL ( VERIFICAR_VALOR_COUNTER_ESFU_ADL.class ) ).COMMAND = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static VERIFICAR_VALOR_COUNTER_ESFU_ADL get ( RallyApplication __app )
  {
    VERIFICAR_VALOR_COUNTER_ESFU_ADL adl = new VERIFICAR_VALOR_COUNTER_ESFU_ADL ( );
    __app.register ( adl, "VERIFICAR_VALOR_COUNTER_ESFU_ADL" );
    __app.setADL ( VERIFICAR_VALOR_COUNTER_ESFU_ADL.class, adl ); 
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
    VERIFICAR_VALOR_COUNTER_ESFU_ADL.get ( __app ).process ( ps );
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
    VERIFICAR_VALOR_COUNTER_ESFU_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "VERIFICAR_VALOR_COUNTER_ESFU_ADL" );
    if ( rObj != null && rObj instanceof VERIFICAR_VALOR_COUNTER_ESFU_ADL )
    {
      this.app.setADL ( VERIFICAR_VALOR_COUNTER_ESFU_ADL.class, ( VERIFICAR_VALOR_COUNTER_ESFU_ADL ) rObj );
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
    Debug.println ( Debug.TRACE, "VERIFICAR_VALOR_COUNTER_ESFU_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "VERIFICAR_VALOR_COUNTER_ESFU_ADL ended" );
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
    if ( Compare.equals ( COMMAND, RallyAppCommandFactory.ABORTACTION ) ) 
    {
      FLUJO_ESFUERZO_ADL.setESFU_STATUS ( this.app, "FAILURE" );
      this.app.returnTo ( "FLUJO_ESFUERZO_ADL" ); if ( true ) return;
    }
    if ( Compare.equals ( this.app.form ( "SEL_SERVICIO_ESFUERZO_FR" ).getDoubleItem ( "SERVICIOS_COUNTER" ), 0 ) ) 
    {
      this._condition0 = true;
    }
    else
    {
      this._condition0 = false;
    }
    if ( this._condition0 )
    {
      SELECT_SERVICIO_ESFUERZO_ADL.exec ( this.app );
      return;
    }

  }
}



/* ---------------------------------------------------------------------


     
procedure verificar_valor_counter_esfu_adl;
var 
        command : number(9,0);
begin
set_trace();
command := get_cmd();
if command = abortaction 
then
        begin
        flujo_esfuerzo_adl.esfu_status :='FAILURE';
        return_to flujo_esfuerzo_adl;
        end;
{endif}
if SEL_SERVICIO_ESFUERZO_FR.SERVICIOS_COUNTER = 0 
then  
    call select_servicio_esfuerzo_adl;
{endif}
set_notrace();
end;
    



--------------------------------------------------------------------- */
