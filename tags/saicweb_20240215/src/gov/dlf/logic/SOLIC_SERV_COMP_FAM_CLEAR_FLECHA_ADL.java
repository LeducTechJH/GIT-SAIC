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
public class SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL
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

  public double UPDATE_CONFIRM = 0;





  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setCOMMAND  ( RallyApplication __app, Parameter value )
  {
    ( ( SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL ) __app.getADL ( SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL.class ) ).COMMAND = value.getDouble ( );
  }  

  
  /**  */
  public static void setUPDATE_CONFIRM  ( RallyApplication __app, Parameter value )
  {
    ( ( SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL ) __app.getADL ( SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL.class ) ).UPDATE_CONFIRM = value.getDouble ( );
  }  
    



  /**  */
  public static double getCOMMAND  ( RallyApplication __app )
  {
    return ( ( SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL ) __app.getADL ( SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL.class ) ).COMMAND;
  }


  /**  */
  public static Double getCOMMANDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL ) __app.getADL ( SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL.class ) ).COMMAND );
  }


  /**  */
  public static void setCOMMAND  ( RallyApplication __app, double value )
  {
    ( ( SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL ) __app.getADL ( SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL.class ) ).COMMAND = value;
  }


  /**  */
  public static void setCOMMAND  ( RallyApplication __app, Object value )
  {
    ( ( SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL ) __app.getADL ( SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL.class ) ).COMMAND = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getUPDATE_CONFIRM  ( RallyApplication __app )
  {
    return ( ( SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL ) __app.getADL ( SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL.class ) ).UPDATE_CONFIRM;
  }


  /**  */
  public static Double getUPDATE_CONFIRMDouble ( RallyApplication __app )
  {
    return new Double ( ( ( SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL ) __app.getADL ( SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL.class ) ).UPDATE_CONFIRM );
  }


  /**  */
  public static void setUPDATE_CONFIRM  ( RallyApplication __app, double value )
  {
    ( ( SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL ) __app.getADL ( SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL.class ) ).UPDATE_CONFIRM = value;
  }


  /**  */
  public static void setUPDATE_CONFIRM  ( RallyApplication __app, Object value )
  {
    ( ( SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL ) __app.getADL ( SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL.class ) ).UPDATE_CONFIRM = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL get ( RallyApplication __app )
  {
    SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL adl = new SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL ( );
    __app.register ( adl, "SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL" );
    __app.setADL ( SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL.class, adl ); 
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
    SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL.get ( __app ).process ( ps );
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
    SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL" );
    if ( rObj != null && rObj instanceof SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL )
    {
      this.app.setADL ( SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL.class, ( SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL Step " + this.currentStep );
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
        Debug.println ( Debug.TRACE, "SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL ended" );
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
    UPDATE_CONFIRM = 0;
    if ( ( Compare.equals ( COMMAND, RallyAppCommandFactory.INSAFTER ) ) || ( Compare.equals ( COMMAND, RallyAppCommandFactory.DELREC ) ) ) 
    {
      this._condition0 = true;
    }
    else
    {
      this._condition0 = false;
    }
    if ( this._condition0 )
    {
      this.callParms.clear ( );
      this.callParms.set ( UPDATE_CONFIRM  );
      SECURITY_CHECK_GBLS_ADL.exec ( this.app, this.callParms );
      return;
    }

  }


  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( ( Compare.equals ( COMMAND, RallyAppCommandFactory.INSAFTER ) ) || ( Compare.equals ( COMMAND, RallyAppCommandFactory.DELREC ) ) ) 
    {
      this.callParms.reset ( );
      UPDATE_CONFIRM  = this.callParms.getDouble ( );

      if ( Compare.equals ( UPDATE_CONFIRM, 0 ) ) 
      {
        this._condition1 = true;
      }
      else
      {
        this._condition1 = false;
      }
      if ( this._condition1 )
      {
        this.app.setError ( 0, 1006 );
        this.app.form ( "SOLIC_SERV_COMP_FAMILIAR_FR" ).setItem ( "PARK", "->"  );
        this.app.callCommand ( RallyAppCommandFactory.IGNORE );
        return;
      }
    }

  }


  /**
   *
   */
  protected void step2 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( ( Compare.equals ( COMMAND, RallyAppCommandFactory.INSAFTER ) ) || ( Compare.equals ( COMMAND, RallyAppCommandFactory.DELREC ) ) ) 
    {
      if ( this._condition1 )    //      if ( Compare.equals ( UPDATE_CONFIRM, 0 ) ) 
      {
        this.app.errorFlag = false;
      }
    }
    CHECK_FOR_FIRST_NUC_MEMBER_INFO_ADL.exec ( this.app );
    return;

  }


  /**
   *
   */
  protected void step3 ( ParameterSet ps )
  {

    this.app.form ( "SOLIC_SERV_COMP_FAMILIAR_FR" ).setItem ( "PARK", "   "  );

  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE SOLIC_SERV_COMP_FAM_CLEAR_FLECHA_ADL;
VAR
        COMMAND:        NUMBER(9,0);
        update_confirm : number(1,0);
BEGIN;
SET_TRACE();
COMMAND:=GET_CMD();
update_confirm := 0;

IF ((COMMAND=INSAFTER) or (command = delrec))
   THEN BEGIN
        CALL SECURITY_CHECK_GBLS_ADL(UPDATE_CONFIRM);
        IF (UPDATE_CONFIRM = 0) THEN BEGIN
                               error(1006);
                               SOLIC_SERV_COMP_FAMILIAR_FR.PARK:='->';
                               call_cmd(ignore);
                               set_failure();
                                END;

        END;
CALL CHECK_FOR_FIRST_NUC_MEMBER_INFO_ADL;
SOLIC_SERV_COMP_FAMILIAR_FR.PARK:='   ';
SET_NOTRACE();
END;

    



--------------------------------------------------------------------- */
