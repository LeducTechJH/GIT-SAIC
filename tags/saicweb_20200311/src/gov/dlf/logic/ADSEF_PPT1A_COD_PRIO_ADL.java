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
public class ADSEF_PPT1A_COD_PRIO_ADL
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
  public static ADSEF_PPT1A_COD_PRIO_ADL get ( RallyApplication __app )
  {
    ADSEF_PPT1A_COD_PRIO_ADL adl = new ADSEF_PPT1A_COD_PRIO_ADL ( );
    __app.register ( adl, "ADSEF_PPT1A_COD_PRIO_ADL" );
    __app.setADL ( ADSEF_PPT1A_COD_PRIO_ADL.class, adl ); 
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
    ADSEF_PPT1A_COD_PRIO_ADL.get ( __app ).process ( ps );
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
    ADSEF_PPT1A_COD_PRIO_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "ADSEF_PPT1A_COD_PRIO_ADL" );
    if ( rObj != null && rObj instanceof ADSEF_PPT1A_COD_PRIO_ADL )
    {
      this.app.setADL ( ADSEF_PPT1A_COD_PRIO_ADL.class, ( ADSEF_PPT1A_COD_PRIO_ADL ) rObj );
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
    Debug.println ( Debug.TRACE, "ADSEF_PPT1A_COD_PRIO_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "ADSEF_PPT1A_COD_PRIO_ADL ended" );
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

    if ( Compare.equals ( this.app.form ( "ADSEF_PPT_1A_RP" ).getStringItem ( "TANF" ), "S" ) ) 
    {
      this.app.form ( "ADSEF_PPT_1A_RP" ).setItem ( "COD_PRIORIDAD", "1"  );
    }
    else
    {
      this.app.form ( "ADSEF_PPT_1A_RP" ).setItem ( "COD_PRIORIDAD", " "  );
    }
    if ( Compare.equals ( this.app.form ( "ADSEF_PPT_1A_RP" ).getStringItem ( "PRES" ), "S" ) ) 
    {
      if ( Compare.equals ( this.app.form ( "ADSEF_PPT_1A_RP" ).getStringItem ( "COD_PRIORIDAD" ), " " ) ) 
      {
        this.app.form ( "ADSEF_PPT_1A_RP" ).setItem ( "COD_PRIORIDAD", "2"  );
      }
      else
      {
        this.app.form ( "ADSEF_PPT_1A_RP" ).setItem ( "COD_PRIORIDAD", this.app.form ( "ADSEF_PPT_1A_RP" ).getStringItem ( "COD_PRIORIDAD" )+ "2"  );
      }
    }
    if ( Compare.equals ( this.app.form ( "ADSEF_PPT_1A_RP" ).getStringItem ( "RV" ), "S" ) ) 
    {
      if ( Compare.equals ( this.app.form ( "ADSEF_PPT_1A_RP" ).getStringItem ( "COD_PRIORIDAD" ), " " ) ) 
      {
        this.app.form ( "ADSEF_PPT_1A_RP" ).setItem ( "COD_PRIORIDAD", "3"  );
      }
      else
      {
        this.app.form ( "ADSEF_PPT_1A_RP" ).setItem ( "COD_PRIORIDAD", this.app.form ( "ADSEF_PPT_1A_RP" ).getStringItem ( "COD_PRIORIDAD" )+ "3"  );
      }
    }
    if ( Compare.equals ( this.app.form ( "ADSEF_PPT_1A_RP" ).getStringItem ( "VET" ), "S" ) ) 
    {
      if ( Compare.equals ( this.app.form ( "ADSEF_PPT_1A_RP" ).getStringItem ( "COD_PRIORIDAD" ), " " ) ) 
      {
        this.app.form ( "ADSEF_PPT_1A_RP" ).setItem ( "COD_PRIORIDAD", "4"  );
      }
      else
      {
        this.app.form ( "ADSEF_PPT_1A_RP" ).setItem ( "COD_PRIORIDAD", this.app.form ( "ADSEF_PPT_1A_RP" ).getStringItem ( "COD_PRIORIDAD" )+ "4"  );
      }
    }
    this.app.form ( "ADSEF_PPT_1A_RP" ).setItem ( "COD_PRIO1", RallyStringService.subString ( this.app.form ( "ADSEF_PPT_1A_RP" ).getStringItem ( "COD_PRIORIDAD" ), 0, 1 )  );
    this.app.form ( "ADSEF_PPT_1A_RP" ).setItem ( "COD_PRIO2", RallyStringService.subString ( this.app.form ( "ADSEF_PPT_1A_RP" ).getStringItem ( "COD_PRIORIDAD" ), 1, 1 )  );
    this.app.form ( "ADSEF_PPT_1A_RP" ).setItem ( "COD_PRIO3", RallyStringService.subString ( this.app.form ( "ADSEF_PPT_1A_RP" ).getStringItem ( "COD_PRIORIDAD" ), 2, 1 )  );
    this.app.form ( "ADSEF_PPT_1A_RP" ).setItem ( "COD_PRIO4", RallyStringService.subString ( this.app.form ( "ADSEF_PPT_1A_RP" ).getStringItem ( "COD_PRIORIDAD" ), 3, 1 )  );

  }
}



/* ---------------------------------------------------------------------


     
BEGIN

IF ADSEF_PPT_1A_RP.TANF = 'S' THEN
   ADSEF_PPT_1A_RP.COD_PRIORIDAD :=  '1';
ELSE
   ADSEF_PPT_1A_RP.COD_PRIORIDAD :=  ' ';

IF ADSEF_PPT_1A_RP.PRES = 'S' THEN
  BEGIN
   IF ADSEF_PPT_1A_RP.COD_PRIORIDAD =  ' ' THEN
     ADSEF_PPT_1A_RP.COD_PRIORIDAD :=  '2';   
   ELSE
     ADSEF_PPT_1A_RP.COD_PRIORIDAD :=  ADSEF_PPT_1A_RP.COD_PRIORIDAD||'2';
  END;

IF ADSEF_PPT_1A_RP.RV = 'S' THEN
  BEGIN
   IF ADSEF_PPT_1A_RP.COD_PRIORIDAD =  ' ' THEN
     ADSEF_PPT_1A_RP.COD_PRIORIDAD :=  '3';   
   ELSE
     ADSEF_PPT_1A_RP.COD_PRIORIDAD :=  ADSEF_PPT_1A_RP.COD_PRIORIDAD||'3';
  END;

IF ADSEF_PPT_1A_RP.VET = 'S' THEN
 BEGIN
   IF ADSEF_PPT_1A_RP.COD_PRIORIDAD =  ' ' THEN
     ADSEF_PPT_1A_RP.COD_PRIORIDAD :=  '4';   
   ELSE
     ADSEF_PPT_1A_RP.COD_PRIORIDAD :=  ADSEF_PPT_1A_RP.COD_PRIORIDAD||'4';
 END;

 ADSEF_PPT_1A_RP.COD_PRIO1 :=  SUBSTR(ADSEF_PPT_1A_RP.COD_PRIORIDAD,0,1);
 ADSEF_PPT_1A_RP.COD_PRIO2 :=  SUBSTR(ADSEF_PPT_1A_RP.COD_PRIORIDAD,1,1);
 ADSEF_PPT_1A_RP.COD_PRIO3 :=  SUBSTR(ADSEF_PPT_1A_RP.COD_PRIORIDAD,2,1);
 ADSEF_PPT_1A_RP.COD_PRIO4 :=  SUBSTR(ADSEF_PPT_1A_RP.COD_PRIORIDAD,3,1);

END;
    



--------------------------------------------------------------------- */
