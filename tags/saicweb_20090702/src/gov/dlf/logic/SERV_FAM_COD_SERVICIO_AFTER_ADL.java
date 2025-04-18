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
public class SERV_FAM_COD_SERVICIO_AFTER_ADL
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



  public String CHAR_AUX_0_2 = null;

  public String CHAR_AUX_3_1 = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setCHAR_AUX_0_2  ( RallyApplication __app, Parameter value )
  {
    ( ( SERV_FAM_COD_SERVICIO_AFTER_ADL ) __app.getADL ( SERV_FAM_COD_SERVICIO_AFTER_ADL.class ) ).CHAR_AUX_0_2 = value.getString ( );
  }  

  
  /**  */
  public static void setCHAR_AUX_3_1  ( RallyApplication __app, Parameter value )
  {
    ( ( SERV_FAM_COD_SERVICIO_AFTER_ADL ) __app.getADL ( SERV_FAM_COD_SERVICIO_AFTER_ADL.class ) ).CHAR_AUX_3_1 = value.getString ( );
  }  
    


  /**  */
  public static String getCHAR_AUX_0_2  ( RallyApplication __app )
  {
    return ( ( SERV_FAM_COD_SERVICIO_AFTER_ADL ) __app.getADL ( SERV_FAM_COD_SERVICIO_AFTER_ADL.class ) ).CHAR_AUX_0_2;
  }


  /**  */
  public static void setCHAR_AUX_0_2  ( RallyApplication __app, String value )
  {
    ( ( SERV_FAM_COD_SERVICIO_AFTER_ADL ) __app.getADL ( SERV_FAM_COD_SERVICIO_AFTER_ADL.class ) ).CHAR_AUX_0_2 = value;
  }


  /**  */
  public static void setCHAR_AUX_0_2  ( RallyApplication __app, Object value )
  {
    ( ( SERV_FAM_COD_SERVICIO_AFTER_ADL ) __app.getADL ( SERV_FAM_COD_SERVICIO_AFTER_ADL.class ) ).CHAR_AUX_0_2 = ( String ) value;
  }



  /**  */
  public static String getCHAR_AUX_3_1  ( RallyApplication __app )
  {
    return ( ( SERV_FAM_COD_SERVICIO_AFTER_ADL ) __app.getADL ( SERV_FAM_COD_SERVICIO_AFTER_ADL.class ) ).CHAR_AUX_3_1;
  }


  /**  */
  public static void setCHAR_AUX_3_1  ( RallyApplication __app, String value )
  {
    ( ( SERV_FAM_COD_SERVICIO_AFTER_ADL ) __app.getADL ( SERV_FAM_COD_SERVICIO_AFTER_ADL.class ) ).CHAR_AUX_3_1 = value;
  }


  /**  */
  public static void setCHAR_AUX_3_1  ( RallyApplication __app, Object value )
  {
    ( ( SERV_FAM_COD_SERVICIO_AFTER_ADL ) __app.getADL ( SERV_FAM_COD_SERVICIO_AFTER_ADL.class ) ).CHAR_AUX_3_1 = ( String ) value;
  }





  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static SERV_FAM_COD_SERVICIO_AFTER_ADL get ( RallyApplication __app )
  {
    SERV_FAM_COD_SERVICIO_AFTER_ADL adl = new SERV_FAM_COD_SERVICIO_AFTER_ADL ( );
    __app.register ( adl, "SERV_FAM_COD_SERVICIO_AFTER_ADL" );
    __app.setADL ( SERV_FAM_COD_SERVICIO_AFTER_ADL.class, adl ); 
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
    SERV_FAM_COD_SERVICIO_AFTER_ADL.get ( __app ).process ( ps );
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
    SERV_FAM_COD_SERVICIO_AFTER_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "SERV_FAM_COD_SERVICIO_AFTER_ADL" );
    if ( rObj != null && rObj instanceof SERV_FAM_COD_SERVICIO_AFTER_ADL )
    {
      this.app.setADL ( SERV_FAM_COD_SERVICIO_AFTER_ADL.class, ( SERV_FAM_COD_SERVICIO_AFTER_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "SERV_FAM_COD_SERVICIO_AFTER_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
      case 2:  { this.currentStep ++; this.step2 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "SERV_FAM_COD_SERVICIO_AFTER_ADL ended" );
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

    VERIFICAR_APEL_CON_SERV_ADL.exec ( this.app );
    return;

  }


  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {
    CHAR_AUX_0_2 = RallyStringService.subString ( this.app.form ( "SERV_FAM_FRM" ).getStringItem ( "COD_SERVICIO" ), 0, 2 );
    if ( Compare.equals ( CHAR_AUX_0_2, "AE" ) ) 
    {
      this._condition0 = true;
      CHAR_AUX_3_1 = RallyStringService.subString ( this.app.form ( "SERV_FAM_FRM" ).getStringItem ( "COD_SERVICIO" ), 3, 1 );
      if ( Compare.equals ( CHAR_AUX_3_1, "C" ) ) 
      {
        this._condition1 = true;
        this.app.TIPO_APLIC_GBL = "S";
        CLASSIF_AEC_FRM_UPDATE_PKT.exec ( this.app );
        return;
      }
      else
      {
        this._condition1 = false;
      }
    }
    else
    {
      this._condition0 = false;
    }
  }


  /**
   *
   */
  protected void step2 ( ParameterSet ps )
  {
    if ( this._condition0 && this._condition1 )    //    if ( Compare.equals ( CHAR_AUX_0_2, "AE" ) ) 
    {   
      if ( Compare.equals ( this.app.form ( "SERV_FAM_FRM" ).getStringItem ( "FLG_AEC_CLASSIF" ), "" ) ) 
      {
        this.app.setError ( 0, 5521 );
        this.app.errorFlag = false;
      }
    }
    this.app.form ( "SERV_FAM_FRM" ).resetChangeStatus ( );
    this.app.callCommand ( RallyAppCommandFactory.RGPREV );
    SERV_ASOC_FAM_BEFORE_INSERT_ADL.exec ( app );
    return;
  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE  SERV_FAM_COD_SERVICIO_AFTER_ADL;

VAR
        CHAR_AUX_0_2    :       CHAR (2);
        CHAR_AUX_3_1    :       CHAR (1);

BEGIN
        call verificar_apel_con_serv_adl;
        CHAR_AUX_0_2 := SUBSTR (SERV_FAM_FRM.COD_SERVICIO, 0, 2);

        IF (CHAR_AUX_0_2 = 'AE') THEN
        BEGIN
                CHAR_AUX_3_1 := SUBSTR (SERV_FAM_FRM.COD_SERVICIO, 3, 1);
                IF (CHAR_AUX_3_1 = 'C') THEN
                BEGIN
                        TIPO_APLIC_GBL := 'S';
                        CALL CLASSIF_AEC_FRM_UPDATE_PKT;
                        IF (SERV_FAM_FRM.FLG_AEC_CLASSIF = '') THEN
                        BEGIN
                                ERROR (5521);
                                SET_FAILURE();
                        END;                                            
                END;
        END;

        CALL_CMD (RGPREV);
END;                    
    



--------------------------------------------------------------------- */
