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
public class BEFORE_VISIT_PARK_INFO_RECLA_ADL
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
  public static BEFORE_VISIT_PARK_INFO_RECLA_ADL get ( RallyApplication __app )
  {
    BEFORE_VISIT_PARK_INFO_RECLA_ADL adl = new BEFORE_VISIT_PARK_INFO_RECLA_ADL ( );
    __app.register ( adl, "BEFORE_VISIT_PARK_INFO_RECLA_ADL" );
    __app.setADL ( BEFORE_VISIT_PARK_INFO_RECLA_ADL.class, adl ); 
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
    BEFORE_VISIT_PARK_INFO_RECLA_ADL.get ( __app ).process ( ps );
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
    BEFORE_VISIT_PARK_INFO_RECLA_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "BEFORE_VISIT_PARK_INFO_RECLA_ADL" );
    if ( rObj != null && rObj instanceof BEFORE_VISIT_PARK_INFO_RECLA_ADL )
    {
      this.app.setADL ( BEFORE_VISIT_PARK_INFO_RECLA_ADL.class, ( BEFORE_VISIT_PARK_INFO_RECLA_ADL ) rObj );
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
    Debug.println ( Debug.TRACE, "BEFORE_VISIT_PARK_INFO_RECLA_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "BEFORE_VISIT_PARK_INFO_RECLA_ADL ended" );
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

    if ( Compare.gt ( this.app.form ( "DETERMINAR_RECLAMACION_FR" ).getDoubleItem ( "COUNT_BASE" ), 0 ) ) 
    {
      this._condition0 = true;
    }
    else
    {
      this._condition0 = false;
    }
    if ( this._condition0 )
    {
      this.app.callCommand ( RallyAppCommandFactory.RGNEXT );
      return;
    }

  }


  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( Compare.gt ( this.app.form ( "DETERMINAR_RECLAMACION_FR" ).getDoubleItem ( "COUNT_BASE" ), 0 ) ) 
    {
    }
    else
    {
      this.app.callCommand ( RallyAppCommandFactory.FINSNEXT );
      return;
    }

  }
}



/* ---------------------------------------------------------------------


     
procedure before_visit_park_info_recla_adl;

begin
 if DETERMINAR_RECLAMACION_FR.COUNT_BASE > 0
 then call_cmd('next group');
 ELSE CALL_CMD('INSERT RECORD NEXT_GROUP');
end;
    



--------------------------------------------------------------------- */
