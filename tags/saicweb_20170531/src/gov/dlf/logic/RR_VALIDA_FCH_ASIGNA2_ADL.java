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
public class RR_VALIDA_FCH_ASIGNA2_ADL
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



  public Date ND = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setCOMMAND  ( RallyApplication __app, Parameter value )
  {
    ( ( RR_VALIDA_FCH_ASIGNA2_ADL ) __app.getADL ( RR_VALIDA_FCH_ASIGNA2_ADL.class ) ).COMMAND = value.getDouble ( );
  }  

  
  /**  */
  public static void setND  ( RallyApplication __app, Parameter value )
  {
    ( ( RR_VALIDA_FCH_ASIGNA2_ADL ) __app.getADL ( RR_VALIDA_FCH_ASIGNA2_ADL.class ) ).ND = value.getDate ( );
  }  
    


  /**  */
  public static Date getND  ( RallyApplication __app )
  {
    return ( ( RR_VALIDA_FCH_ASIGNA2_ADL ) __app.getADL ( RR_VALIDA_FCH_ASIGNA2_ADL.class ) ).ND;
  }


  /**  */
  public static void setND  ( RallyApplication __app, Date value )
  {
    ( ( RR_VALIDA_FCH_ASIGNA2_ADL ) __app.getADL ( RR_VALIDA_FCH_ASIGNA2_ADL.class ) ).ND = value;
  }


  /**  */
  public static void setND  ( RallyApplication __app, Object value )
  {
    ( ( RR_VALIDA_FCH_ASIGNA2_ADL ) __app.getADL ( RR_VALIDA_FCH_ASIGNA2_ADL.class ) ).ND = ( Date ) value;
  }




  /**  */
  public static double getCOMMAND  ( RallyApplication __app )
  {
    return ( ( RR_VALIDA_FCH_ASIGNA2_ADL ) __app.getADL ( RR_VALIDA_FCH_ASIGNA2_ADL.class ) ).COMMAND;
  }


  /**  */
  public static Double getCOMMANDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( RR_VALIDA_FCH_ASIGNA2_ADL ) __app.getADL ( RR_VALIDA_FCH_ASIGNA2_ADL.class ) ).COMMAND );
  }


  /**  */
  public static void setCOMMAND  ( RallyApplication __app, double value )
  {
    ( ( RR_VALIDA_FCH_ASIGNA2_ADL ) __app.getADL ( RR_VALIDA_FCH_ASIGNA2_ADL.class ) ).COMMAND = value;
  }


  /**  */
  public static void setCOMMAND  ( RallyApplication __app, Object value )
  {
    ( ( RR_VALIDA_FCH_ASIGNA2_ADL ) __app.getADL ( RR_VALIDA_FCH_ASIGNA2_ADL.class ) ).COMMAND = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static RR_VALIDA_FCH_ASIGNA2_ADL get ( RallyApplication __app )
  {
    RR_VALIDA_FCH_ASIGNA2_ADL adl = new RR_VALIDA_FCH_ASIGNA2_ADL ( );
    __app.register ( adl, "RR_VALIDA_FCH_ASIGNA2_ADL" );
    __app.setADL ( RR_VALIDA_FCH_ASIGNA2_ADL.class, adl ); 
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
    RR_VALIDA_FCH_ASIGNA2_ADL.get ( __app ).process ( ps );
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
    RR_VALIDA_FCH_ASIGNA2_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "RR_VALIDA_FCH_ASIGNA2_ADL" );
    if ( rObj != null && rObj instanceof RR_VALIDA_FCH_ASIGNA2_ADL )
    {
      this.app.setADL ( RR_VALIDA_FCH_ASIGNA2_ADL.class, ( RR_VALIDA_FCH_ASIGNA2_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "RR_VALIDA_FCH_ASIGNA2_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "RR_VALIDA_FCH_ASIGNA2_ADL ended" );
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

    ND = TruncService.setNull ( ND  );
    COMMAND = RallyAppCommandFactory.translate ( this.app.getLastCommandName ( ) );
    if ( Compare.equals ( COMMAND, RallyAppCommandFactory.FPREV ) ) 
    {
      this.doReturn ( );
      return;
    }
    if ( Compare.equals ( this.app.form ( "RETRO_ASIGNA_FR" ).getDateItem ( "FATS" ), ND ) ) 
    {
      this.doReturn ( );
      return;
    }
    if ( Compare.gt ( this.app.form ( "RETRO_ASIGNA_FR" ).getDateItem ( "FCID" ), this.app.form ( "RETRO_ASIGNA_FR" ).getDateItem ( "FATS" )) ) 
    {
      this.app.setError ( 0, 7545 );
      this.app.errorFlag = false;
      this.doReturn ( );
      return; 
    }

  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE RR_VALIDA_FCH_ASIGNA2_ADL;

VAR     COMMAND :       NUMBER(9,0);
        ND      :       DATE;

SET_TRACE();

BEGIN

MAKE_NULL(ND);

COMMAND := GET_CMD();

IF COMMAND = FPREV
THEN 
RETURN;

IF RETRO_ASIGNA_FR.FATS = ND  
THEN 
RETURN;

IF RETRO_ASIGNA_FR.FCID > RETRO_ASIGNA_FR.FATS
THEN
        BEGIN
        ERROR(7545);
        SET_FAILURE();
        RETURN;
        END;

END;

SET_NOTRACE();

    



--------------------------------------------------------------------- */
