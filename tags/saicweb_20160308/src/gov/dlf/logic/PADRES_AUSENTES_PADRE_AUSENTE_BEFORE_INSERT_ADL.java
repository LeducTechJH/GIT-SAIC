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
public class PADRES_AUSENTES_PADRE_AUSENTE_BEFORE_INSERT_ADL
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
  public static PADRES_AUSENTES_PADRE_AUSENTE_BEFORE_INSERT_ADL get ( RallyApplication __app )
  {
    PADRES_AUSENTES_PADRE_AUSENTE_BEFORE_INSERT_ADL adl = new PADRES_AUSENTES_PADRE_AUSENTE_BEFORE_INSERT_ADL ( );
    __app.register ( adl, "PADRES_AUSENTES_PADRE_AUSENTE_BEFORE_INSERT_ADL" );
    __app.setADL ( PADRES_AUSENTES_PADRE_AUSENTE_BEFORE_INSERT_ADL.class, adl ); 
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
    PADRES_AUSENTES_PADRE_AUSENTE_BEFORE_INSERT_ADL.get ( __app ).process ( ps );
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
    PADRES_AUSENTES_PADRE_AUSENTE_BEFORE_INSERT_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "PADRES_AUSENTES_PADRE_AUSENTE_BEFORE_INSERT_ADL" );
    if ( rObj != null && rObj instanceof PADRES_AUSENTES_PADRE_AUSENTE_BEFORE_INSERT_ADL )
    {
      this.app.setADL ( PADRES_AUSENTES_PADRE_AUSENTE_BEFORE_INSERT_ADL.class, ( PADRES_AUSENTES_PADRE_AUSENTE_BEFORE_INSERT_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "PADRES_AUSENTES_PADRE_AUSENTE_BEFORE_INSERT_ADL Step " + this.currentStep );
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
        Debug.println ( Debug.TRACE, "PADRES_AUSENTES_PADRE_AUSENTE_BEFORE_INSERT_ADL ended" );
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

    //this.app.errorFlag = false;
    //this.app.callCommand ( RallyAppCommandFactory.IGNORE );
    return;

  }

 /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {
    this.app.COMPLETION_STATUS_GBL = "SUCCESS";
    this.app.SS_SERV_GBL = this.app.form ( "PADRES_AUSENTES_FRM" ).getDoubleItem ( "SEGURO_SOCIAL_JEFE_SERV" );
    this.app.SS_PADRE_AUSENTE_GBL = this.app.form ( "PADRES_AUSENTES_FRM" ).getDoubleItem ( "SEGURO_SOCIAL_PADRE_AUSENTE" );
    PADRE_MADRE_AUSENTE_CLIENTE_PKT.exec ( this.app );
    return;

  }


  /**
   *
   */
  protected void step2 ( ParameterSet ps )
  {
    this.app.callCommand ( RallyAppCommandFactory.QBE );
    return;

  }


  /**
   *
   */
  protected void step3 ( ParameterSet ps )
  {
    this.app.callCommand ( RallyAppCommandFactory.QUERY );
    return;

  }


  /**
   *
   */
  protected void step4 ( ParameterSet ps )
  {
      return;

  }

}
