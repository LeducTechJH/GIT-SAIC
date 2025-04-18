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
public class FECHAS_SERVICIO_BEF_DELETE_ADL
     extends ADL
{
  // -------------------------------------------------------------------
  // ----------   Class Attributes   -----------------------------------

  /**  */
  public static boolean staticCall = true;



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

  public double COMMAND = 0;





  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setCOMMAND  ( RallyApplication __app, Parameter value )
  {
    ( ( FECHAS_SERVICIO_BEF_DELETE_ADL ) __app.getADL ( FECHAS_SERVICIO_BEF_DELETE_ADL.class ) ).COMMAND = value.getDouble ( );
  }  
    



  /**  */
  public static double getCOMMAND  ( RallyApplication __app )
  {
    return ( ( FECHAS_SERVICIO_BEF_DELETE_ADL ) __app.getADL ( FECHAS_SERVICIO_BEF_DELETE_ADL.class ) ).COMMAND;
  }


  /**  */
  public static Double getCOMMANDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( FECHAS_SERVICIO_BEF_DELETE_ADL ) __app.getADL ( FECHAS_SERVICIO_BEF_DELETE_ADL.class ) ).COMMAND );
  }


  /**  */
  public static void setCOMMAND  ( RallyApplication __app, double value )
  {
    ( ( FECHAS_SERVICIO_BEF_DELETE_ADL ) __app.getADL ( FECHAS_SERVICIO_BEF_DELETE_ADL.class ) ).COMMAND = value;
  }


  /**  */
  public static void setCOMMAND  ( RallyApplication __app, Object value )
  {
    ( ( FECHAS_SERVICIO_BEF_DELETE_ADL ) __app.getADL ( FECHAS_SERVICIO_BEF_DELETE_ADL.class ) ).COMMAND = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static FECHAS_SERVICIO_BEF_DELETE_ADL get ( RallyApplication __app )
  {
    FECHAS_SERVICIO_BEF_DELETE_ADL adl = new FECHAS_SERVICIO_BEF_DELETE_ADL ( );
    __app.register ( adl, "FECHAS_SERVICIO_BEF_DELETE_ADL" );
    __app.setADL ( FECHAS_SERVICIO_BEF_DELETE_ADL.class, adl ); 
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
    FECHAS_SERVICIO_BEF_DELETE_ADL.get ( __app ).process ( ps );
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
    FECHAS_SERVICIO_BEF_DELETE_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "FECHAS_SERVICIO_BEF_DELETE_ADL" );
    if ( rObj != null && rObj instanceof FECHAS_SERVICIO_BEF_DELETE_ADL )
    {
      this.app.setADL ( FECHAS_SERVICIO_BEF_DELETE_ADL.class, ( FECHAS_SERVICIO_BEF_DELETE_ADL ) rObj );
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
    Debug.println ( Debug.TRACE, "FECHAS_SERVICIO_BEF_DELETE_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "FECHAS_SERVICIO_BEF_DELETE_ADL ended" );
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
    if ( Compare.equals ( COMMAND, RallyAppCommandFactory.DELREC ) ) 
    {
      this.app.setError ( 0, 5524 );
      this.app.errorFlag = false;
      this.doReturn ( );
      return; 
    }

  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE FECHAS_SERVICIO_BEF_DELETE_ADL;

VAR
        COMMAND :       NUMBER;

BEGIN
set_trace();
        COMMAND := GET_CMD ();

        IF (COMMAND = DELREC) THEN
        BEGIN
                ERROR (5524);
                SET_FAILURE();
                RETURN;
        END;
set_notrace();
END;
    



--------------------------------------------------------------------- */
