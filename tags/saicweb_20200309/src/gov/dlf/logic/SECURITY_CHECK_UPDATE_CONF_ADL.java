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
public class SECURITY_CHECK_UPDATE_CONF_ADL
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





  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setUPDATE_CONFIRM  ( RallyApplication __app, Parameter value )
  {
    ( ( SECURITY_CHECK_UPDATE_CONF_ADL ) __app.getADL ( SECURITY_CHECK_UPDATE_CONF_ADL.class ) ).UPDATE_CONFIRM = value.getDouble ( );
  }  
    



  /**  */
  public static double getUPDATE_CONFIRM  ( RallyApplication __app )
  {
    return ( ( SECURITY_CHECK_UPDATE_CONF_ADL ) __app.getADL ( SECURITY_CHECK_UPDATE_CONF_ADL.class ) ).UPDATE_CONFIRM;
  }


  /**  */
  public static Double getUPDATE_CONFIRMDouble ( RallyApplication __app )
  {
    return new Double ( ( ( SECURITY_CHECK_UPDATE_CONF_ADL ) __app.getADL ( SECURITY_CHECK_UPDATE_CONF_ADL.class ) ).UPDATE_CONFIRM );
  }


  /**  */
  public static void setUPDATE_CONFIRM  ( RallyApplication __app, double value )
  {
    ( ( SECURITY_CHECK_UPDATE_CONF_ADL ) __app.getADL ( SECURITY_CHECK_UPDATE_CONF_ADL.class ) ).UPDATE_CONFIRM = value;
  }


  /**  */
  public static void setUPDATE_CONFIRM  ( RallyApplication __app, Object value )
  {
    ( ( SECURITY_CHECK_UPDATE_CONF_ADL ) __app.getADL ( SECURITY_CHECK_UPDATE_CONF_ADL.class ) ).UPDATE_CONFIRM = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static SECURITY_CHECK_UPDATE_CONF_ADL get ( RallyApplication __app )
  {
    SECURITY_CHECK_UPDATE_CONF_ADL adl = new SECURITY_CHECK_UPDATE_CONF_ADL ( );
    __app.register ( adl, "SECURITY_CHECK_UPDATE_CONF_ADL" );
    __app.setADL ( SECURITY_CHECK_UPDATE_CONF_ADL.class, adl ); 
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
    SECURITY_CHECK_UPDATE_CONF_ADL.get ( __app ).process ( ps );
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
    SECURITY_CHECK_UPDATE_CONF_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "SECURITY_CHECK_UPDATE_CONF_ADL" );
    if ( rObj != null && rObj instanceof SECURITY_CHECK_UPDATE_CONF_ADL )
    {
      this.app.setADL ( SECURITY_CHECK_UPDATE_CONF_ADL.class, ( SECURITY_CHECK_UPDATE_CONF_ADL ) rObj );
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
    Debug.println ( Debug.TRACE, "SECURITY_CHECK_UPDATE_CONF_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
      case 2:  { this.currentStep ++; this.step2 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "SECURITY_CHECK_UPDATE_CONF_ADL ended" );
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

    if ( Compare.equals ( UPDATE_CONFIRM, 1 ) ) 
    {
      UPDATE_CONFIRM = 0;
      this.doReturn ( );
      return; 
    }
    else
    {
      this.app.setError ( 0, 1006 );
      this.app.callCommand ( RallyAppCommandFactory.DELREC );
      return;
    }

  }


  /**
   *
   */
  protected void step2 ( ParameterSet ps )
  {
    if ( Compare.equals ( UPDATE_CONFIRM, 1 ) ) 
    {
    }
    else
    {
      this.app.errorFlag = false;
    }

  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE SECURITY_CHECK_UPDATE_CONF_ADL;

VAR
UPDATE_CONFIRM  :       NUMBER(1,0);

BEGIN
SET_TRACE();
CALL SECURITY_CHECK_GBLS_ADL(UPDATE_CONFIRM);
IF UPDATE_CONFIRM = 1 THEN BEGIN
                        update_confirm := 0;
                        RETURN;
                        END;
ELSE BEGIN
        ERROR(1006);
        CALL_CMD(DELREC);
        SET_FAILURE();
        END;
SET_NOTRACE();
END;

    



--------------------------------------------------------------------- */
