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
public class PROV_CHECK_NUM_SERVICIOS_ADL
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
  public static PROV_CHECK_NUM_SERVICIOS_ADL get ( RallyApplication __app )
  {
    PROV_CHECK_NUM_SERVICIOS_ADL adl = new PROV_CHECK_NUM_SERVICIOS_ADL ( );
    __app.register ( adl, "PROV_CHECK_NUM_SERVICIOS_ADL" );
    __app.setADL ( PROV_CHECK_NUM_SERVICIOS_ADL.class, adl ); 
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
    PROV_CHECK_NUM_SERVICIOS_ADL.get ( __app ).process ( ps );
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
    PROV_CHECK_NUM_SERVICIOS_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "PROV_CHECK_NUM_SERVICIOS_ADL" );
    if ( rObj != null && rObj instanceof PROV_CHECK_NUM_SERVICIOS_ADL )
    {
      this.app.setADL ( PROV_CHECK_NUM_SERVICIOS_ADL.class, ( PROV_CHECK_NUM_SERVICIOS_ADL ) rObj );
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
    Debug.println ( Debug.TRACE, "PROV_CHECK_NUM_SERVICIOS_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "PROV_CHECK_NUM_SERVICIOS_ADL ended" );
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

    if ( Compare.gt ( this.app.form ( "MANTENIMIENTO_PROVEEDOR_FR" ).getDoubleItem ( "PROV_COUNT_AGGREGATE" ), 0 ) ) 
    {
      this.app.callCommand ( RallyAppCommandFactory.RGNEXT );
      return;
    }
    else
    {
    	 this.app.callCommand ( RallyAppCommandFactory.FINSNEXT );
         return;
    }

  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE SERV_CHECK_NUM_SERVICIOS_ADL;
begin
SET_TRACE();

IF (SERV_FAM_FRM.SERV_COUNT_AGGREGATE >0)
   THEN CALL_CMD('Next group');
SET_NOTRACE();
end;
    



--------------------------------------------------------------------- */
