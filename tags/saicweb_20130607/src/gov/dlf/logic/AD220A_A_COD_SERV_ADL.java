/*
 *
 */
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
public class AD220A_A_COD_SERV_ADL
     extends ADL
{
  // -------------------------------------------------------------------
  // ----------   Class Attributes   -----------------------------------

  /** The static call. */
  public static boolean staticCall = false;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes   --------------------------------

  /** The app. */
  public SAIC_DMQ_ORA_Application app;

  /** The dm. */
  public RallyDataManager dm = null;



  // -------------------------------------------------------------------
  // ----------   Instance Condition Attributes   ----------------------

  /** The _condition0. */
  public boolean _condition0 = false;



  // -------------------------------------------------------------------
  // ----------   Instance Export Attributes   -------------------------

  /** The TK. */
  public double TK = 0;





  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------


  /**
   * Sets the tk.
   *
   * @param __app the __app
   * @param value the value
   */
  public static void setTK  ( RallyApplication __app, Parameter value )
  {
    ( ( AD220A_A_COD_SERV_ADL ) __app.getADL ( AD220A_A_COD_SERV_ADL.class ) ).TK = value.getDouble ( );
  }




  /**
   * Gets the tK.
   *
   * @param __app the __app
   *
   * @return the tK
   */
  public static double getTK  ( RallyApplication __app )
  {
    return ( ( AD220A_A_COD_SERV_ADL ) __app.getADL ( AD220A_A_COD_SERV_ADL.class ) ).TK;
  }


  /**
   * Gets the tK double.
   *
   * @param __app the __app
   *
   * @return the tK double
   */
  public static Double getTKDouble ( RallyApplication __app )
  {
    return new Double ( ( ( AD220A_A_COD_SERV_ADL ) __app.getADL ( AD220A_A_COD_SERV_ADL.class ) ).TK );
  }


  /**
   * Sets the tk.
   *
   * @param __app the __app
   * @param value the value
   */
  public static void setTK  ( RallyApplication __app, double value )
  {
    ( ( AD220A_A_COD_SERV_ADL ) __app.getADL ( AD220A_A_COD_SERV_ADL.class ) ).TK = value;
  }


  /**
   * Sets the tk.
   *
   * @param __app the __app
   * @param value the value
   */
  public static void setTK  ( RallyApplication __app, Object value )
  {
    ( ( AD220A_A_COD_SERV_ADL ) __app.getADL ( AD220A_A_COD_SERV_ADL.class ) ).TK = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * Gets the.
   *
   * @param __app the __app
   *
   * @return the a d220 a_ a_ co d_ ser v_ adl
   */
  public static AD220A_A_COD_SERV_ADL get ( RallyApplication __app )
  {
    AD220A_A_COD_SERV_ADL adl = new AD220A_A_COD_SERV_ADL ( );
    __app.register ( adl, "AD220A_A_COD_SERV_ADL" );
    __app.setADL ( AD220A_A_COD_SERV_ADL.class, adl );
    adl.setApplication ( __app );
    return adl;
  }


  /**
   * Exec.
   *
   * @param __app the __app
   * @param ps the ps
   */
  public static void exec ( RallyApplication __app, ParameterSet ps )
  {
    AD220A_A_COD_SERV_ADL.get ( __app ).process ( ps );
  }


  /**
   * Exec.
   *
   * @param __app the __app
   */
  public static void exec ( RallyApplication __app )
  {
    ParameterSet ps = null;
    AD220A_A_COD_SERV_ADL.exec ( __app, ps );
  }


  /**
   * Overrides the ancestor's method.
   *
   * @param __app the __app
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
   * Overrides the ancestor's method.
   *
   * @param parms the parms
   */
  @Override
  public void execute ( ParameterSet parms )
  {
    this.process ( parms );
  }




  /**
   * Do return.
   */
  protected void doReturn ( )
  {
    this.unregister ( );
  }


  /**
   * Unregister.
   */
  public void unregister ( )
  {
    this.app.unregister ( this );
    IRegisteredObject rObj = this.app.get ( "AD220A_A_COD_SERV_ADL" );
    if ( rObj != null && rObj instanceof AD220A_A_COD_SERV_ADL )
    {
      this.app.setADL ( AD220A_A_COD_SERV_ADL.class, ( AD220A_A_COD_SERV_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method.
   *
   * @param ps the ps
   */
  @Override
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "AD220A_A_COD_SERV_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep )
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      default:
      {
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "AD220A_A_COD_SERV_ADL ended" );
        this.unregister ( );
        break;
      }
    }
    if ( this.currentStep > 0 ) this.app.goOn ( );
  }



  /**
   * Step0.
   *
   * @param ps the ps
   */
  protected void step0 ( ParameterSet ps )
  {

    TK = RallyAppCommandFactory.translate ( this.app.getLastCommandName ( ) );
    if ( Compare.equals ( TK, RallyAppCommandFactory.EXITACTION ) )
    {
      this._condition0 = true;
    }
    else
    {
      this._condition0 = false;
    }
    if ( this._condition0 )
    {
      AD220A_A_DB_FIND_ADL.exec ( this.app );
      return;
    }

  }
}



/* ---------------------------------------------------------------------



PROCEDURE AD220A_A_COD_SERV_ADL;

VAR     TK      :       NUMBER(6,0);

SET_TRACE();

BEGIN

TK      := GET_CMD();

IF (TK =  exitaction) THEN
        CALL AD220A_A_DB_FIND_ADL;

END;

SET_NOTRACE();




--------------------------------------------------------------------- */
