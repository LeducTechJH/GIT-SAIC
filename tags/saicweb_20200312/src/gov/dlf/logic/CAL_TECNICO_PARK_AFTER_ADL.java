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
public class CAL_TECNICO_PARK_AFTER_ADL
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

  public double COMANDO = 0;

  public double ID_TECNICO_ANT = 0;





  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setCOMANDO  ( RallyApplication __app, Parameter value )
  {
    ( ( CAL_TECNICO_PARK_AFTER_ADL ) __app.getADL ( CAL_TECNICO_PARK_AFTER_ADL.class ) ).COMANDO = value.getDouble ( );
  }  

  
  /**  */
  public static void setID_TECNICO_ANT  ( RallyApplication __app, Parameter value )
  {
    ( ( CAL_TECNICO_PARK_AFTER_ADL ) __app.getADL ( CAL_TECNICO_PARK_AFTER_ADL.class ) ).ID_TECNICO_ANT = value.getDouble ( );
  }  
    



  /**  */
  public static double getCOMANDO  ( RallyApplication __app )
  {
    return ( ( CAL_TECNICO_PARK_AFTER_ADL ) __app.getADL ( CAL_TECNICO_PARK_AFTER_ADL.class ) ).COMANDO;
  }


  /**  */
  public static Double getCOMANDODouble ( RallyApplication __app )
  {
    return new Double ( ( ( CAL_TECNICO_PARK_AFTER_ADL ) __app.getADL ( CAL_TECNICO_PARK_AFTER_ADL.class ) ).COMANDO );
  }


  /**  */
  public static void setCOMANDO  ( RallyApplication __app, double value )
  {
    ( ( CAL_TECNICO_PARK_AFTER_ADL ) __app.getADL ( CAL_TECNICO_PARK_AFTER_ADL.class ) ).COMANDO = value;
  }


  /**  */
  public static void setCOMANDO  ( RallyApplication __app, Object value )
  {
    ( ( CAL_TECNICO_PARK_AFTER_ADL ) __app.getADL ( CAL_TECNICO_PARK_AFTER_ADL.class ) ).COMANDO = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getID_TECNICO_ANT  ( RallyApplication __app )
  {
    return ( ( CAL_TECNICO_PARK_AFTER_ADL ) __app.getADL ( CAL_TECNICO_PARK_AFTER_ADL.class ) ).ID_TECNICO_ANT;
  }


  /**  */
  public static Double getID_TECNICO_ANTDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CAL_TECNICO_PARK_AFTER_ADL ) __app.getADL ( CAL_TECNICO_PARK_AFTER_ADL.class ) ).ID_TECNICO_ANT );
  }


  /**  */
  public static void setID_TECNICO_ANT  ( RallyApplication __app, double value )
  {
    ( ( CAL_TECNICO_PARK_AFTER_ADL ) __app.getADL ( CAL_TECNICO_PARK_AFTER_ADL.class ) ).ID_TECNICO_ANT = value;
  }


  /**  */
  public static void setID_TECNICO_ANT  ( RallyApplication __app, Object value )
  {
    ( ( CAL_TECNICO_PARK_AFTER_ADL ) __app.getADL ( CAL_TECNICO_PARK_AFTER_ADL.class ) ).ID_TECNICO_ANT = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static CAL_TECNICO_PARK_AFTER_ADL get ( RallyApplication __app )
  {
    CAL_TECNICO_PARK_AFTER_ADL adl = new CAL_TECNICO_PARK_AFTER_ADL ( );
    __app.register ( adl, "CAL_TECNICO_PARK_AFTER_ADL" );
    __app.setADL ( CAL_TECNICO_PARK_AFTER_ADL.class, adl ); 
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
    CAL_TECNICO_PARK_AFTER_ADL.get ( __app ).process ( ps );
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
    CAL_TECNICO_PARK_AFTER_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "CAL_TECNICO_PARK_AFTER_ADL" );
    if ( rObj != null && rObj instanceof CAL_TECNICO_PARK_AFTER_ADL )
    {
      this.app.setADL ( CAL_TECNICO_PARK_AFTER_ADL.class, ( CAL_TECNICO_PARK_AFTER_ADL ) rObj );
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
    Debug.println ( Debug.TRACE, "CAL_TECNICO_PARK_AFTER_ADL Step " + this.currentStep );
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
        Debug.println ( Debug.TRACE, "CAL_TECNICO_PARK_AFTER_ADL ended" );
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

    COMANDO = RallyAppCommandFactory.translate ( this.app.getLastCommandName ( ) );
    if ( ( ! Compare.equals ( COMANDO, RallyAppCommandFactory.FPREV ) ) && ( ! Compare.equals ( COMANDO, RallyAppCommandFactory.FNEXT ) )  && ( ! Compare.equals ( COMANDO, RallyAppCommandFactory.EXITACTION ) )  ) 
    {
      this.app.setError ( 0, 5504 );
      this.app.errorFlag = false;
      this.doReturn ( );
      return; 
    }
    if ( ( Compare.equals ( COMANDO, RallyAppCommandFactory.FNEXT ) ) || ( Compare.equals ( COMANDO, RallyAppCommandFactory.EXITACTION ) ) ) 
    {
      this._condition0 = true;
    }
    else
    {
      this._condition0 = false;
    }
    if ( this._condition0 )
    {
      ID_TECNICO_ANT = this.app.ID_TECNICO_GBL;
      this.app.ID_TECNICO_GBL = this.app.form ( "CAL_TECNICO_FRM" ).getDoubleItem ( "ID_TECNICO" );
      INVOCAR_CALENDARIO_ADL.exec ( this.app );
      return;
    }

  }


  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( ( Compare.equals ( COMANDO, RallyAppCommandFactory.FNEXT ) ) || ( Compare.equals ( COMANDO, RallyAppCommandFactory.EXITACTION ) ) ) 
    {
      COMANDO = RallyAppCommandFactory.translate ( this.app.getLastCommandName ( ) );
      if ( Compare.equals ( COMANDO, RallyAppCommandFactory.ABORTACTION ) ) 
      {
        this._condition1 = true;
      }
      else
      {
        this._condition1 = false;
      }
      if ( this._condition1 )
      {
        this.app.callCommand ( RallyAppCommandFactory.RGPREV );
        return;
      }
    }

  }


  /**
   *
   */
  protected void step2 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( ( Compare.equals ( COMANDO, RallyAppCommandFactory.FNEXT ) ) || ( Compare.equals ( COMANDO, RallyAppCommandFactory.EXITACTION ) ) ) 
    {
      if ( this._condition1 )    //      if ( Compare.equals ( COMANDO, RallyAppCommandFactory.ABORTACTION ) ) 
      {
      }
      this.app.ID_TECNICO_GBL = ID_TECNICO_ANT;
      this.app.callCommand ( RallyAppCommandFactory.IGNORE );
      return;
    }

  }


  /**
   *
   */
  protected void step3 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( ( Compare.equals ( COMANDO, RallyAppCommandFactory.FNEXT ) ) || ( Compare.equals ( COMANDO, RallyAppCommandFactory.EXITACTION ) ) ) 
    {
      this.app.callCommand ( RallyAppCommandFactory.FPREV );
      return;
    }

  }


  /**
   *
   */
  protected void step4 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( ( Compare.equals ( COMANDO, RallyAppCommandFactory.FNEXT ) ) || ( Compare.equals ( COMANDO, RallyAppCommandFactory.EXITACTION ) ) ) 
    {
      this.app.callCommand ( RallyAppCommandFactory.FNEXT );
      return;
    }

  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE CAL_TECNICO_PARK_AFTER_ADL;

VAR
        COMANDO                 :       NUMBER;
        ID_TECNICO_ANT          :       NUMBER(4);

BEGIN
        COMANDO := GET_CMD();

        IF (COMANDO <> FPREV) AND (COMANDO <> FNEXT) AND
           (COMANDO <> EXITACTION) THEN
        BEGIN
                ERROR (5504);
                SET_FAILURE();
                RETURN;
        END;

        IF (COMANDO = FNEXT) OR (COMANDO = EXITACTION) THEN
        BEGIN
                ID_TECNICO_ANT := ID_TECNICO_GBL;
                ID_TECNICO_GBL := CAL_TECNICO_FRM.ID_TECNICO;
                CALL INVOCAR_CALENDARIO_ADL;
                COMANDO := GET_CMD();
                IF (COMANDO = ABORTACTION) THEN CALL_CMD(RGPREV);
                ID_TECNICO_GBL := ID_TECNICO_ANT;
                CALL_CMD('IGNORE');
                CALL_CMD(FPREV);
                CALL_CMD(FNEXT);
DEBUG_LOG ('ID_TECNICO_GBL = '||TO_CHAR(ID_TECNICO_GBL));
        END;
END;
    



--------------------------------------------------------------------- */
