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
public class SERV_NUCLEO_SERV_BEF_DEL_ADL
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

  public double COMMAND = 0;

  public double NULLNUMBER = 0;





  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setCOMMAND  ( RallyApplication __app, Parameter value )
  {
    ( ( SERV_NUCLEO_SERV_BEF_DEL_ADL ) __app.getADL ( SERV_NUCLEO_SERV_BEF_DEL_ADL.class ) ).COMMAND = value.getDouble ( );
  }  

  
  /**  */
  public static void setNULLNUMBER  ( RallyApplication __app, Parameter value )
  {
    ( ( SERV_NUCLEO_SERV_BEF_DEL_ADL ) __app.getADL ( SERV_NUCLEO_SERV_BEF_DEL_ADL.class ) ).NULLNUMBER = value.getDouble ( );
  }  
    



  /**  */
  public static double getCOMMAND  ( RallyApplication __app )
  {
    return ( ( SERV_NUCLEO_SERV_BEF_DEL_ADL ) __app.getADL ( SERV_NUCLEO_SERV_BEF_DEL_ADL.class ) ).COMMAND;
  }


  /**  */
  public static Double getCOMMANDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( SERV_NUCLEO_SERV_BEF_DEL_ADL ) __app.getADL ( SERV_NUCLEO_SERV_BEF_DEL_ADL.class ) ).COMMAND );
  }


  /**  */
  public static void setCOMMAND  ( RallyApplication __app, double value )
  {
    ( ( SERV_NUCLEO_SERV_BEF_DEL_ADL ) __app.getADL ( SERV_NUCLEO_SERV_BEF_DEL_ADL.class ) ).COMMAND = value;
  }


  /**  */
  public static void setCOMMAND  ( RallyApplication __app, Object value )
  {
    ( ( SERV_NUCLEO_SERV_BEF_DEL_ADL ) __app.getADL ( SERV_NUCLEO_SERV_BEF_DEL_ADL.class ) ).COMMAND = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getNULLNUMBER  ( RallyApplication __app )
  {
    return ( ( SERV_NUCLEO_SERV_BEF_DEL_ADL ) __app.getADL ( SERV_NUCLEO_SERV_BEF_DEL_ADL.class ) ).NULLNUMBER;
  }


  /**  */
  public static Double getNULLNUMBERDouble ( RallyApplication __app )
  {
    return new Double ( ( ( SERV_NUCLEO_SERV_BEF_DEL_ADL ) __app.getADL ( SERV_NUCLEO_SERV_BEF_DEL_ADL.class ) ).NULLNUMBER );
  }


  /**  */
  public static void setNULLNUMBER  ( RallyApplication __app, double value )
  {
    ( ( SERV_NUCLEO_SERV_BEF_DEL_ADL ) __app.getADL ( SERV_NUCLEO_SERV_BEF_DEL_ADL.class ) ).NULLNUMBER = value;
  }


  /**  */
  public static void setNULLNUMBER  ( RallyApplication __app, Object value )
  {
    ( ( SERV_NUCLEO_SERV_BEF_DEL_ADL ) __app.getADL ( SERV_NUCLEO_SERV_BEF_DEL_ADL.class ) ).NULLNUMBER = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static SERV_NUCLEO_SERV_BEF_DEL_ADL get ( RallyApplication __app )
  {
    SERV_NUCLEO_SERV_BEF_DEL_ADL adl = new SERV_NUCLEO_SERV_BEF_DEL_ADL ( );
    __app.register ( adl, "SERV_NUCLEO_SERV_BEF_DEL_ADL" );
    __app.setADL ( SERV_NUCLEO_SERV_BEF_DEL_ADL.class, adl ); 
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
    SERV_NUCLEO_SERV_BEF_DEL_ADL.get ( __app ).process ( ps );
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
    SERV_NUCLEO_SERV_BEF_DEL_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "SERV_NUCLEO_SERV_BEF_DEL_ADL" );
    if ( rObj != null && rObj instanceof SERV_NUCLEO_SERV_BEF_DEL_ADL )
    {
      this.app.setADL ( SERV_NUCLEO_SERV_BEF_DEL_ADL.class, ( SERV_NUCLEO_SERV_BEF_DEL_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "SERV_NUCLEO_SERV_BEF_DEL_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "SERV_NUCLEO_SERV_BEF_DEL_ADL ended" );
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

    COMMAND = RallyAppCommandFactory.translate ( this.app.getLastCommandName ( ) );
    NULLNUMBER = TruncService.setNull ( NULLNUMBER  );
    if ( Compare.equals ( this.app.form ( "SERV_NUCLEO_SERV_FRM" ).getDoubleItem ( "SEGURO_SOCIAL_BENEFICIARIO" ), NULLNUMBER ) ) 
    {
      this.doReturn ( );
      return;
    }
    if ( Compare.equals ( this.app.form ( "SERV_NUCLEO_SERV_FRM" ).getDoubleItem ( "COUNT_NUCLEO_AGGREGATE" ), 1 ) ) 
    {
      this.app.errorFlag = false;
      this.app.setError ( 0, 5535 );
      this.doReturn ( );
      return; 
    }
    if ( Compare.equals ( this.app.NUCLEO_BEF_INSERT_GBL, "FAIL" ) ) 
    {
      this.app.NUCLEO_BEF_INSERT_GBL = "OK";
    }
    else
    {
      if ( Compare.equals ( this.app.form ( "SERV_NUCLEO_SERV_FRM" ).getDoubleItem ( "SEGURO_SOCIAL_JEFE_SERV" ), this.app.form ( "SERV_NUCLEO_SERV_FRM" ).getDoubleItem ( "SEGURO_SOCIAL_BENEFICIARIO" )) ) 
      {
        this.app.errorFlag = false;
        this.app.setError ( 1, 4021 );
        this.doReturn ( );
        return; 
      }
      if ( Compare.equals ( this.app.NO_E5528_FLG_GBL, "T" ) ) 
      {
        this.app.setError ( 2, 5528 );
      }
      this.app.NO_E5528_FLG_GBL = "T";
    }

  }
}



/* ---------------------------------------------------------------------


     
procedure serv_nucleo_serv_bef_del_adl;

VAR

COMMAND :       NUMBER;
nullnumber:     number;
begin
SET_TRACE();


COMMAND:=GET_CMD();

make_null(nullnumber);
if (SERV_NUCLEO_SERV_FRM.SEGURO_SOCIAL_BENEFICIARIO = nullnumber) 
        then return;

IF SERV_NUCLEO_SERV_FRM.COUNT_NUCLEO_AGGREGATE =1
            THEN BEGIN
                  SET_FAILURE();
                  ERROR(5535);
                  RETURN;
                 END;

       if NUCLEO_BEF_INSERT_GBL = 'FAIL' then
               begin
               nucleo_bef_insert_gbl := 'OK';
               end;
       else begin
        IF SERV_NUCLEO_SERV_FRM.SEGURO_SOCIAL_JEFE_SERV = 
           SERV_NUCLEO_SERV_FRM.SEGURO_SOCIAL_BENEFICIARIO
        THEN
        BEGIN
            SET_FAILURE();
            ERROR(4021);
            RETURN;
        END;
            if no_e5528_flg_gbl='T'
               then begin
                     error (5528);
                    end;
            no_e5528_flg_gbl:='T';
            end;
SET_NOTRACE();
end;
    



--------------------------------------------------------------------- */
