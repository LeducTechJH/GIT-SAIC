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
public class COMP_FAM_CHANGE_JEFE_FAM_ADL
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

 

  // -------------------------------------------------------------------
  // ----------   Instance Export Attributes   -------------------------

  public double UPDATE_CONFIRM = 0;

  public double FAM_ID = 0;

  public double FAM_STAT = 0;





  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setUPDATE_CONFIRM  ( RallyApplication __app, Parameter value )
  {
    ( ( COMP_FAM_CHANGE_JEFE_FAM_ADL ) __app.getADL ( COMP_FAM_CHANGE_JEFE_FAM_ADL.class ) ).UPDATE_CONFIRM = value.getDouble ( );
  }  

  
  /**  */
  public static void setFAM_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( COMP_FAM_CHANGE_JEFE_FAM_ADL ) __app.getADL ( COMP_FAM_CHANGE_JEFE_FAM_ADL.class ) ).FAM_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setFAM_STAT  ( RallyApplication __app, Parameter value )
  {
    ( ( COMP_FAM_CHANGE_JEFE_FAM_ADL ) __app.getADL ( COMP_FAM_CHANGE_JEFE_FAM_ADL.class ) ).FAM_STAT = value.getDouble ( );
  }  
    



  /**  */
  public static double getUPDATE_CONFIRM  ( RallyApplication __app )
  {
    return ( ( COMP_FAM_CHANGE_JEFE_FAM_ADL ) __app.getADL ( COMP_FAM_CHANGE_JEFE_FAM_ADL.class ) ).UPDATE_CONFIRM;
  }


  /**  */
  public static Double getUPDATE_CONFIRMDouble ( RallyApplication __app )
  {
    return new Double ( ( ( COMP_FAM_CHANGE_JEFE_FAM_ADL ) __app.getADL ( COMP_FAM_CHANGE_JEFE_FAM_ADL.class ) ).UPDATE_CONFIRM );
  }


  /**  */
  public static void setUPDATE_CONFIRM  ( RallyApplication __app, double value )
  {
    ( ( COMP_FAM_CHANGE_JEFE_FAM_ADL ) __app.getADL ( COMP_FAM_CHANGE_JEFE_FAM_ADL.class ) ).UPDATE_CONFIRM = value;
  }


  /**  */
  public static void setUPDATE_CONFIRM  ( RallyApplication __app, Object value )
  {
    ( ( COMP_FAM_CHANGE_JEFE_FAM_ADL ) __app.getADL ( COMP_FAM_CHANGE_JEFE_FAM_ADL.class ) ).UPDATE_CONFIRM = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getFAM_ID  ( RallyApplication __app )
  {
    return ( ( COMP_FAM_CHANGE_JEFE_FAM_ADL ) __app.getADL ( COMP_FAM_CHANGE_JEFE_FAM_ADL.class ) ).FAM_ID;
  }


  /**  */
  public static Double getFAM_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( COMP_FAM_CHANGE_JEFE_FAM_ADL ) __app.getADL ( COMP_FAM_CHANGE_JEFE_FAM_ADL.class ) ).FAM_ID );
  }


  /**  */
  public static void setFAM_ID  ( RallyApplication __app, double value )
  {
    ( ( COMP_FAM_CHANGE_JEFE_FAM_ADL ) __app.getADL ( COMP_FAM_CHANGE_JEFE_FAM_ADL.class ) ).FAM_ID = value;
  }


  /**  */
  public static void setFAM_ID  ( RallyApplication __app, Object value )
  {
    ( ( COMP_FAM_CHANGE_JEFE_FAM_ADL ) __app.getADL ( COMP_FAM_CHANGE_JEFE_FAM_ADL.class ) ).FAM_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getFAM_STAT  ( RallyApplication __app )
  {
    return ( ( COMP_FAM_CHANGE_JEFE_FAM_ADL ) __app.getADL ( COMP_FAM_CHANGE_JEFE_FAM_ADL.class ) ).FAM_STAT;
  }


  /**  */
  public static Double getFAM_STATDouble ( RallyApplication __app )
  {
    return new Double ( ( ( COMP_FAM_CHANGE_JEFE_FAM_ADL ) __app.getADL ( COMP_FAM_CHANGE_JEFE_FAM_ADL.class ) ).FAM_STAT );
  }


  /**  */
  public static void setFAM_STAT  ( RallyApplication __app, double value )
  {
    ( ( COMP_FAM_CHANGE_JEFE_FAM_ADL ) __app.getADL ( COMP_FAM_CHANGE_JEFE_FAM_ADL.class ) ).FAM_STAT = value;
  }


  /**  */
  public static void setFAM_STAT  ( RallyApplication __app, Object value )
  {
    ( ( COMP_FAM_CHANGE_JEFE_FAM_ADL ) __app.getADL ( COMP_FAM_CHANGE_JEFE_FAM_ADL.class ) ).FAM_STAT = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static COMP_FAM_CHANGE_JEFE_FAM_ADL get ( RallyApplication __app )
  {
    COMP_FAM_CHANGE_JEFE_FAM_ADL adl = new COMP_FAM_CHANGE_JEFE_FAM_ADL ( );
    __app.register ( adl, "COMP_FAM_CHANGE_JEFE_FAM_ADL" );
    __app.setADL ( COMP_FAM_CHANGE_JEFE_FAM_ADL.class, adl ); 
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
    COMP_FAM_CHANGE_JEFE_FAM_ADL.get ( __app ).process ( ps );
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
    COMP_FAM_CHANGE_JEFE_FAM_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "COMP_FAM_CHANGE_JEFE_FAM_ADL" );
    if ( rObj != null && rObj instanceof COMP_FAM_CHANGE_JEFE_FAM_ADL )
    {
      this.app.setADL ( COMP_FAM_CHANGE_JEFE_FAM_ADL.class, ( COMP_FAM_CHANGE_JEFE_FAM_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "COMP_FAM_CHANGE_JEFE_FAM_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "COMP_FAM_CHANGE_JEFE_FAM_ADL ended" );
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
    double oldVal = this.app.form ( "SOLIC_SERV_COMP_FAMILIAR_FR" ).getDoubleItem ( "SEGURO_SOCIAL_JEFE_FAM0" );
    ( ( SOLIC_SERV_COMP_FAMILIAR_FR ) this.app.form ( "SOLIC_SERV_COMP_FAMILIAR_FR" ) ).ssnOldValue = oldVal;      
    if ( Double.isNaN ( oldVal ) || oldVal <= 0 )
    {
      this.app.setError ( 0, 8000 );
      this.app.errorFlag = false;
      app.requireRefresh = true;
      this.doReturn ( );
      return;
    }
    
    this.callParms.clear ( );
    this.callParms.set ( UPDATE_CONFIRM  );
    SECURITY_CHECK_GBLS_ADL.exec ( this.app, this.callParms );
    return;

  }


  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {
    this.callParms.reset ( );
    UPDATE_CONFIRM  = this.callParms.getDouble ( );

    if ( Compare.equals ( UPDATE_CONFIRM, 0 ) ) 
    {
      this.app.setError ( 0, 1006 );
      this.app.errorFlag = false;
    }
    this.app.OLD_SSN_JEFE_FAM = this.app.form ( "SOLIC_SERV_COMP_FAMILIAR_FR" ).getDoubleItem ( "SEGURO_SOCIAL_JEFE_FAM0" );
    if ( Compare.equals ( this.app.form ( "SOLIC_SERV_COMP_FAMILIAR_FR" ).getDoubleItem ( "SEGURO_SOCIAL_JEFE_FAM0" ), this.app.SSN_JEFE_FAM_GBL ) ) 
    {
      this.doReturn ( );
      return;
    }
    this.app.SSN_JEFE_FAM_GBL = this.app.form ( "SOLIC_SERV_COMP_FAMILIAR_FR" ).getDoubleItem ( "SEGURO_SOCIAL_JEFE_FAM0" );

  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE COMP_FAM_CHANGE_JEFE_FAM_ADL;

VAR
UPDATE_CONFIRM  :       NUMBER(1,0);
        fam_id  : NUMBER;
        fam_stat: NUMBER;

BEGIN
SET_TRACE();
CALL SECURITY_CHECK_GBLS_ADL(UPDATE_CONFIRM);
IF UPDATE_CONFIRM = 0 THEN BEGIN
                       error(1006);
                       set_failure();
                        END;

OLD_SSN_JEFE_FAM:=SOLIC_SERV_COMP_FAMILIAR_FR.SEGURO_SOCIAL_JEFE_FAM0;


IF SOLIC_SERV_COMP_FAMILIAR_FR.SEGURO_SOCIAL_JEFE_FAM0=SSN_JEFE_FAM_GBL
   THEN RETURN;
SET_TRACE();

SSN_JEFE_FAM_GBL:=SOLIC_SERV_COMP_FAMILIAR_FR.SEGURO_SOCIAL_JEFE_FAM0;


{SSN_JEFE_FAM_GBL:=SOLIC_SERV_COMP_FAMILIAR_FR.SEGURO_SOCIAL_JEFE_FAM0;
CALL_CMD(QBE);
CALL_CMD(QUERY);
}

SET_NOTRACE();

END;

    



--------------------------------------------------------------------- */
