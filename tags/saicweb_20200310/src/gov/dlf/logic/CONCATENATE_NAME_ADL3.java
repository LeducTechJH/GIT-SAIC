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
public class CONCATENATE_NAME_ADL3
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





  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------
    




  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static CONCATENATE_NAME_ADL3 get ( RallyApplication __app )
  {
    CONCATENATE_NAME_ADL3 adl = new CONCATENATE_NAME_ADL3 ( );
    __app.register ( adl, "CONCATENATE_NAME_ADL3" );
    __app.setADL ( CONCATENATE_NAME_ADL3.class, adl ); 
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
    CONCATENATE_NAME_ADL3.get ( __app ).process ( ps );
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
    CONCATENATE_NAME_ADL3.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "CONCATENATE_NAME_ADL3" );
    if ( rObj != null && rObj instanceof CONCATENATE_NAME_ADL3 )
    {
      this.app.setADL ( CONCATENATE_NAME_ADL3.class, ( CONCATENATE_NAME_ADL3 ) rObj );
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
    Debug.println ( Debug.TRACE, "CONCATENATE_NAME_ADL3 Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "CONCATENATE_NAME_ADL3 ended" );
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

    this.app.form ( "FAM_LOV_FR3" ).setItem ( "DSC_NOMBRE_COMPUTE", this.app.form ( "FAM_LOV_FR3" ).getStringItem ( "DSC_NOMBRE" )+ " " + this.app.form ( "FAM_LOV_FR3" ).getStringItem ( "DSC_INICIAL" )+ " " + this.app.form ( "FAM_LOV_FR3" ).getStringItem ( "DSC_APELLIDO_PATERNO" ) );

  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE CONCATENATE_NAME_ADL;

SET_TRACE();

FAM_LOV_FR.DSC_NOMBRE_COMPUTE:=FAM_LOV_FR.DSC_NOMBRE||' '||
                               FAM_LOV_FR.DSC_INICIAL||' '||
                               FAM_LOV_FR.DSC_APELLIDO_PATERNO;

SET_NOTRACE();

    



--------------------------------------------------------------------- */
