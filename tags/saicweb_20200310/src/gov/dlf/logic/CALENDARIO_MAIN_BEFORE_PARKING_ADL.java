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
public class CALENDARIO_MAIN_BEFORE_PARKING_ADL
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
  public static CALENDARIO_MAIN_BEFORE_PARKING_ADL get ( RallyApplication __app )
  {
    CALENDARIO_MAIN_BEFORE_PARKING_ADL adl = new CALENDARIO_MAIN_BEFORE_PARKING_ADL ( );
    __app.register ( adl, "CALENDARIO_MAIN_BEFORE_PARKING_ADL" );
    __app.setADL ( CALENDARIO_MAIN_BEFORE_PARKING_ADL.class, adl ); 
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
    CALENDARIO_MAIN_BEFORE_PARKING_ADL.get ( __app ).process ( ps );
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
    CALENDARIO_MAIN_BEFORE_PARKING_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "CALENDARIO_MAIN_BEFORE_PARKING_ADL" );
    if ( rObj != null && rObj instanceof CALENDARIO_MAIN_BEFORE_PARKING_ADL )
    {
      this.app.setADL ( CALENDARIO_MAIN_BEFORE_PARKING_ADL.class, ( CALENDARIO_MAIN_BEFORE_PARKING_ADL ) rObj );
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
    Debug.println ( Debug.TRACE, "CALENDARIO_MAIN_BEFORE_PARKING_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
      case 2:  { this.currentStep ++; this.step2 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "CALENDARIO_MAIN_BEFORE_PARKING_ADL ended" );
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

    if ( Compare.equals ( this.app.form ( "CALENDARIO_MAIN_FR" ).getStringItem ( "FLG_CONSOLIDAR" ), "T" ) ) 
    {
      this.doReturn ( );
      return;
    }
    if ( ! Compare.equals ( this.app.INFORMACION_REQUERIMIENTO_GBL, "" ) ) 
    {
      this._condition0 = true;
    }
    else
    {
      this._condition0 = false;
    }
    if ( this._condition0 )
    {
      this.app.PASSAGEM_GBL = "I";
      this.app.form ( "CALENDARIO_MAIN_FR" ).setItem ( "PARKING_FIELD", "-->"  );
      if ( ! Compare.equals ( this.app.INFORMACION_REQUERIMIENTO_GBL, "P" ) ) 
      {
        this._condition1 = true;
      }
      else
      {
        this._condition1 = false;
      }
      if ( this._condition1 )
      {
        this.app.executeCommand ( RallyAppCommandFactory.FRFUNCTION );
        return;
      }
    }

  }


  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( ! Compare.equals ( this.app.INFORMACION_REQUERIMIENTO_GBL, "" ) ) 
    {
      if ( this._condition1 )    //      if ( ! Compare.equals ( this.app.INFORMACION_REQUERIMIENTO_GBL, "P" ) ) 
      {
        return;
      }
    }
    else
    {
      this.app.form ( "CALENDARIO_MAIN_FR" ).setItem ( "PARKING_FIELD", "-->"  );
    }
    if ( Compare.gt ( this.app.CALENDARIO_SAVE_POSITION, 0 ) ) 
    {
      this._condition2 = true;
    }
    else
    {
      this._condition2 = false;
    }
    if ( this._condition2 )
    {
      if ( Compare.lt ( this.app.form ( "CALENDARIO_MAIN_FR" ).getDoubleItem ( "NUMERO_REGISTRO" ), this.app.CALENDARIO_SAVE_POSITION ) ) 
      {
        this._condition3 = true;
      }
      else
      {
        this._condition3 = false;
      }
      if ( this._condition3 )
      {
        this.app.form ( "CALENDARIO_MAIN_FR" ).setItem ( "PARKING_FIELD", "  "  );
        this.app.callCommand ( RallyAppCommandFactory.RNEXT );
        return;
      }
    }

  }


  /**
   *
   */
  protected void step2 ( ParameterSet ps )
  {
    if ( this._condition2 )    //    if ( Compare.gt ( this.app.CALENDARIO_SAVE_POSITION, 0 ) ) 
    {
      if ( this._condition3 )    //      if ( Compare.lt ( this.app.form ( "CALENDARIO_MAIN_FR" ).getDoubleItem ( "NUMERO_REGISTRO" ), this.app.CALENDARIO_SAVE_POSITION ) ) 
      {
      }
      else
      {
        this.app.CALENDARIO_SAVE_POSITION = 0;
      }
    }

  }
}



/* ---------------------------------------------------------------------


     
SET_TRACE();
IF CALENDARIO_MAIN_FR.FLG_CONSOLIDAR = 'T'
THEN RETURN;

IF INFORMACION_REQUERIMIENTO_GBL <> ''
THEN BEGIN
     PASSAGEM_GBL := 'I';
     CALENDARIO_MAIN_FR.PARKING_FIELD:='-->';
     IF INFORMACION_REQUERIMIENTO_GBL <> 'P'
     THEN EXECUTE_CMD('LOCAL_FUNCTION');
     END;
ELSE CALENDARIO_MAIN_FR.PARKING_FIELD:='-->';

IF CALENDARIO_SAVE_POSITION>0
   THEN BEGIN
         IF CALENDARIO_MAIN_FR.NUMERO_REGISTRO<CALENDARIO_SAVE_POSITION
            THEN BEGIN
                 CALENDARIO_MAIN_FR.PARKING_FIELD:='  ';
                 CALL_CMD('NEXT RECORD');
                 END;
            ELSE BEGIN
                 CALENDARIO_SAVE_POSITION:=0;
                 END;
        END;
SET_NOTRACE();
    



--------------------------------------------------------------------- */
