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
public class PLAN_TRAB_PARK_PLAN_BEF_ADL
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
 
  public boolean _condition0 = false;
 
  public boolean _condition1 = false;
 
  public boolean _condition2 = false;
 
  public boolean _condition3 = false;
 
  public boolean _condition4 = false;
 
  public boolean _condition5 = false;
 
  public boolean _condition6 = false;
 
  public boolean _condition7 = false;
 
  public boolean _condition8 = false;
 
  public boolean _condition9 = false;

 

  // -------------------------------------------------------------------
  // ----------   Instance Export Attributes   -------------------------





  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------
    




  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static PLAN_TRAB_PARK_PLAN_BEF_ADL get ( RallyApplication __app )
  {
    PLAN_TRAB_PARK_PLAN_BEF_ADL adl = new PLAN_TRAB_PARK_PLAN_BEF_ADL ( );
    __app.register ( adl, "PLAN_TRAB_PARK_PLAN_BEF_ADL" );
    __app.setADL ( PLAN_TRAB_PARK_PLAN_BEF_ADL.class, adl ); 
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
    PLAN_TRAB_PARK_PLAN_BEF_ADL.get ( __app ).process ( ps );
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
    PLAN_TRAB_PARK_PLAN_BEF_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "PLAN_TRAB_PARK_PLAN_BEF_ADL" );
    if ( rObj != null && rObj instanceof PLAN_TRAB_PARK_PLAN_BEF_ADL )
    {
      this.app.setADL ( PLAN_TRAB_PARK_PLAN_BEF_ADL.class, ( PLAN_TRAB_PARK_PLAN_BEF_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "PLAN_TRAB_PARK_PLAN_BEF_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
      case 2:  { this.currentStep ++; this.step2 ( this.keyParms ); break; }
      case 3:  { this.currentStep ++; this.step3 ( this.keyParms ); break; }
      case 4:  { this.currentStep ++; this.step4 ( this.keyParms ); break; }
      case 5:  { this.currentStep ++; this.step5 ( this.keyParms ); break; }
      case 6:  { this.currentStep ++; this.step6 ( this.keyParms ); break; }
      case 7:  { this.currentStep ++; this.step7 ( this.keyParms ); break; }
      case 8:  { this.currentStep ++; this.step8 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "PLAN_TRAB_PARK_PLAN_BEF_ADL ended" );
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

    if ( Compare.equals ( this.app.FIRST_TIME_GBL, "S" ) ) 
    {
      this._condition0 = true;
    }
    else
    {
      this._condition0 = false;
    }
    if ( this._condition0 )
    {
      this.app.executeCommand ( RallyAppCommandFactory.RGPREV );
      return;
    }

  }


  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( Compare.equals ( this.app.FIRST_TIME_GBL, "S" ) ) 
    {
      return; 
    }
    if ( Compare.equals ( this.app.COMANDO_GBL, RallyAppCommandFactory.RNEXT ) ) 
    {
      this._condition1 = true;
    }
    else
    {
      this._condition1 = false;
    }
    if ( this._condition1 )
    {
      if ( ( Compare.gt ( this.app.form ( "PLAN_TRABAJO_FRM" ).getDoubleItem ( "PLAN_COUNT" ), 1 ) ) && ( Compare.equals ( this.app.CONT_AUX_GBL, 1 ) )  ) 
      {
        this._condition2 = true;
      }
      else
      {
        this._condition2 = false;
      }
      if ( this._condition2 )
      {
        this.app.executeCommand ( RallyAppCommandFactory.RHOME );
        return;
      }
    }

  }


  /**
   *
   */
  protected void step2 ( ParameterSet ps )
  {
    if ( this._condition1 )    //    if ( Compare.equals ( this.app.COMANDO_GBL, RallyAppCommandFactory.RNEXT ) ) 
    {
      if ( this._condition2 )    //      if ( ( Compare.gt ( this.app.form ( "PLAN_TRABAJO_FRM" ).getDoubleItem ( "PLAN_COUNT" ), 1 ) ) && ( Compare.equals ( this.app.CONT_AUX_GBL, 1 ) )  ) 
      {
        return; 
      }
      if ( ! Compare.equals ( this.app.CONT_AUX_GBL, this.app.form ( "PLAN_TRABAJO_FRM" ).getDoubleItem ( "CALEND_CONT" )) ) 
      {
        this._condition3 = true;
      }
      else
      {
        this._condition3 = false;
      }
      if ( this._condition3 )
      {
        this.app.CONT_AUX_GBL = MathService.plus ( this.app.CONT_AUX_GBL, 1  );
        this.app.executeCommand ( RallyAppCommandFactory.RNEXT );
        return;
      }
    }

  }


  /**
   *
   */
  protected void step3 ( ParameterSet ps )
  {
    if ( this._condition1 )    //    if ( Compare.equals ( this.app.COMANDO_GBL, RallyAppCommandFactory.RNEXT ) ) 
    {
      if ( this._condition3 )    //      if ( ! Compare.equals ( this.app.CONT_AUX_GBL, this.app.form ( "PLAN_TRABAJO_FRM" ).getDoubleItem ( "CALEND_CONT" )) ) 
      {
        return; 
      }
    }
    if ( Compare.equals ( this.app.COMANDO_GBL, RallyAppCommandFactory.RPREV ) ) 
    {
      this._condition4 = true;
    }
    else
    {
      this._condition4 = false;
    }
    if ( this._condition4 )
    {
      if ( ! Compare.equals ( this.app.form ( "PLAN_TRABAJO_FRM" ).getDoubleItem ( "PLAN_COUNT" ), this.app.FIRST_GBL ) ) 
      {
        this._condition5 = true;
      }
      else
      {
        this._condition5 = false;
      }
      if ( this._condition5 )
      {
        this.app.executeCommand ( RallyAppCommandFactory.FPREV );
        return;
      }
    }

  }


  /**
   *
   */
  protected void step4 ( ParameterSet ps )
  {
    if ( this._condition4 )    //    if ( Compare.equals ( this.app.COMANDO_GBL, RallyAppCommandFactory.RPREV ) ) 
    {
      if ( this._condition5 )    //      if ( ! Compare.equals ( this.app.form ( "PLAN_TRABAJO_FRM" ).getDoubleItem ( "PLAN_COUNT" ), this.app.FIRST_GBL ) ) 
      {
        return;
      }
    }
    this.app.FIRST_TIME_GBL = "S";
    if ( Compare.equals ( this.app.COMANDO_GBL, RallyAppCommandFactory.RNEXT ) ) 
    {
      this._condition6 = true;
    }
    else
    {
      this._condition6 = false;
    }
    if ( this._condition6 )
    {
      this.app.executeCommand ( RallyAppCommandFactory.RNEXT );
      return;
    }

  }


  /**
   *
   */
  protected void step5 ( ParameterSet ps )
  {
    if ( this._condition6 )    //    if ( Compare.equals ( this.app.COMANDO_GBL, RallyAppCommandFactory.RNEXT ) ) 
    {
      return; 
    }
    if ( Compare.equals ( this.app.COMANDO_GBL, RallyAppCommandFactory.RPREV ) ) 
    {
      this._condition7 = true;
    }
    else
    {
      this._condition7 = false;
    }
    if ( this._condition7 )
    {
      this.app.executeCommand ( RallyAppCommandFactory.RPREV );
      return;
    }

  }


  /**
   *
   */
  protected void step6 ( ParameterSet ps )
  {
    if ( this._condition7 )    //    if ( Compare.equals ( this.app.COMANDO_GBL, RallyAppCommandFactory.RPREV ) ) 
    {
      return; 
    }
    if ( Compare.equals ( this.app.COMANDO_GBL, RallyAppCommandFactory.PRNEXT ) ) 
    {
      this._condition8 = true;
    }
    else
    {
      this._condition8 = false;
    }
    if ( this._condition8 )
    {
      this.app.executeCommand ( RallyAppCommandFactory.PRNEXT );
      return;
    }

  }


  /**
   *
   */
  protected void step7 ( ParameterSet ps )
  {
    if ( this._condition8 )    //    if ( Compare.equals ( this.app.COMANDO_GBL, RallyAppCommandFactory.PRNEXT ) ) 
    {
      return; 
    }
    if ( Compare.equals ( this.app.COMANDO_GBL, RallyAppCommandFactory.PRPREV ) ) 
    {
      this._condition9 = true;
    }
    else
    {
      this._condition9 = false;
    }
    if ( this._condition9 )
    {
      this.app.executeCommand ( RallyAppCommandFactory.PRPREV );
      return;
    }

  }


  /**
   *
   */
  protected void step8 ( ParameterSet ps )
  {
    if ( this._condition9 )    //    if ( Compare.equals ( this.app.COMANDO_GBL, RallyAppCommandFactory.PRPREV ) ) 
    {
      return; 
    }

  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE PLAN_TRAB_PARK_PLAN_BEF_ADL;

BEGIN
SET_TRACE();
        IF (FIRST_TIME_GBL = 'S') THEN
        BEGIN
                EXECUTE_CMD (RGPREV);
        END;

        IF (COMANDO_GBL = RNEXT) THEN
        BEGIN
        IF (PLAN_TRABAJO_FRM.PLAN_COUNT > 1) AND
           (CONT_AUX_GBL = 1) THEN
        BEGIN
                EXECUTE_CMD (RHOME);
        END;

        IF (CONT_AUX_GBL <> PLAN_TRABAJO_FRM.CALEND_CONT)
        THEN BEGIN
                CONT_AUX_GBL := CONT_AUX_GBL + 1;
                EXECUTE_CMD (RNEXT);
        END;
        END;

        IF (COMANDO_GBL = RPREV) THEN
        BEGIN
                IF (PLAN_TRABAJO_FRM.PLAN_COUNT <> FIRST_GBL) THEN
                        EXECUTE_CMD (FPREV);
        END;

        FIRST_TIME_GBL := 'S';
                
        IF (COMANDO_GBL = RNEXT) THEN
        BEGIN
                EXECUTE_CMD (RNEXT);
        END;                  
         
        IF (COMANDO_GBL = RPREV) THEN
        BEGIN
                EXECUTE_CMD (RPREV);
        END;                            

        IF (COMANDO_GBL = PRNEXT) THEN
        BEGIN
                EXECUTE_CMD (PRNEXT);
        END;                            

        IF (COMANDO_GBL = PRPREV) THEN
        BEGIN
                EXECUTE_CMD (PRPREV);
        END;                           
SET_NOTRACE();
END;
    



--------------------------------------------------------------------- */
