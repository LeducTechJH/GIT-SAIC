package gov.dlf.logic;


import gov.dlf.facade.*;
import gov.dlf.presentation.*;


import net.maintrend.datamanager.*;
import net.maintrend.interfaces.*;
import net.maintrend.interlink.*;
import net.maintrend.rallyengine.*;
import net.maintrend.util.*;



/**
 * __Comment
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class MANT_SAVE_SERV_TYPE_ADL
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

  public double UPDATE_CONFIRM = 0;

  public double FAM_ID = 0;

  public double FAM_STAT = 0;



  public DataStore FAMILIA_READ_LOC_DSD = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setUPDATE_CONFIRM  ( RallyApplication __app, Parameter value )
  {
    ( ( MANT_SAVE_SERV_TYPE_ADL ) __app.getADL ( MANT_SAVE_SERV_TYPE_ADL.class ) ).UPDATE_CONFIRM = value.getDouble ( );
  }  

  
  /**  */
  public static void setFAM_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( MANT_SAVE_SERV_TYPE_ADL ) __app.getADL ( MANT_SAVE_SERV_TYPE_ADL.class ) ).FAM_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setFAM_STAT  ( RallyApplication __app, Parameter value )
  {
    ( ( MANT_SAVE_SERV_TYPE_ADL ) __app.getADL ( MANT_SAVE_SERV_TYPE_ADL.class ) ).FAM_STAT = value.getDouble ( );
  }  
    


  /**  */
  public static DataStore getFAMILIA_READ_LOC_DSD  ( RallyApplication __app )
  {
    return ( ( MANT_SAVE_SERV_TYPE_ADL ) __app.getADL ( MANT_SAVE_SERV_TYPE_ADL.class ) ).FAMILIA_READ_LOC_DSD;
  }


  /**  */
  public static void setFAMILIA_READ_LOC_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( MANT_SAVE_SERV_TYPE_ADL ) __app.getADL ( MANT_SAVE_SERV_TYPE_ADL.class ) ).FAMILIA_READ_LOC_DSD = value;
  }


  /**  */
  public static void setFAMILIA_READ_LOC_DSD  ( RallyApplication __app, Object value )
  {
    ( ( MANT_SAVE_SERV_TYPE_ADL ) __app.getADL ( MANT_SAVE_SERV_TYPE_ADL.class ) ).FAMILIA_READ_LOC_DSD = ( DataStore ) value;
  }




  /**  */
  public static double getUPDATE_CONFIRM  ( RallyApplication __app )
  {
    return ( ( MANT_SAVE_SERV_TYPE_ADL ) __app.getADL ( MANT_SAVE_SERV_TYPE_ADL.class ) ).UPDATE_CONFIRM;
  }


  /**  */
  public static Double getUPDATE_CONFIRMDouble ( RallyApplication __app )
  {
    return new Double ( ( ( MANT_SAVE_SERV_TYPE_ADL ) __app.getADL ( MANT_SAVE_SERV_TYPE_ADL.class ) ).UPDATE_CONFIRM );
  }


  /**  */
  public static void setUPDATE_CONFIRM  ( RallyApplication __app, double value )
  {
    ( ( MANT_SAVE_SERV_TYPE_ADL ) __app.getADL ( MANT_SAVE_SERV_TYPE_ADL.class ) ).UPDATE_CONFIRM = value;
  }


  /**  */
  public static void setUPDATE_CONFIRM  ( RallyApplication __app, Object value )
  {
    ( ( MANT_SAVE_SERV_TYPE_ADL ) __app.getADL ( MANT_SAVE_SERV_TYPE_ADL.class ) ).UPDATE_CONFIRM = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getFAM_ID  ( RallyApplication __app )
  {
    return ( ( MANT_SAVE_SERV_TYPE_ADL ) __app.getADL ( MANT_SAVE_SERV_TYPE_ADL.class ) ).FAM_ID;
  }


  /**  */
  public static Double getFAM_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( MANT_SAVE_SERV_TYPE_ADL ) __app.getADL ( MANT_SAVE_SERV_TYPE_ADL.class ) ).FAM_ID );
  }


  /**  */
  public static void setFAM_ID  ( RallyApplication __app, double value )
  {
    ( ( MANT_SAVE_SERV_TYPE_ADL ) __app.getADL ( MANT_SAVE_SERV_TYPE_ADL.class ) ).FAM_ID = value;
  }


  /**  */
  public static void setFAM_ID  ( RallyApplication __app, Object value )
  {
    ( ( MANT_SAVE_SERV_TYPE_ADL ) __app.getADL ( MANT_SAVE_SERV_TYPE_ADL.class ) ).FAM_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getFAM_STAT  ( RallyApplication __app )
  {
    return ( ( MANT_SAVE_SERV_TYPE_ADL ) __app.getADL ( MANT_SAVE_SERV_TYPE_ADL.class ) ).FAM_STAT;
  }


  /**  */
  public static Double getFAM_STATDouble ( RallyApplication __app )
  {
    return new Double ( ( ( MANT_SAVE_SERV_TYPE_ADL ) __app.getADL ( MANT_SAVE_SERV_TYPE_ADL.class ) ).FAM_STAT );
  }


  /**  */
  public static void setFAM_STAT  ( RallyApplication __app, double value )
  {
    ( ( MANT_SAVE_SERV_TYPE_ADL ) __app.getADL ( MANT_SAVE_SERV_TYPE_ADL.class ) ).FAM_STAT = value;
  }


  /**  */
  public static void setFAM_STAT  ( RallyApplication __app, Object value )
  {
    ( ( MANT_SAVE_SERV_TYPE_ADL ) __app.getADL ( MANT_SAVE_SERV_TYPE_ADL.class ) ).FAM_STAT = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static MANT_SAVE_SERV_TYPE_ADL get ( RallyApplication __app )
  {
    MANT_SAVE_SERV_TYPE_ADL adl = new MANT_SAVE_SERV_TYPE_ADL ( );
    __app.register ( adl, "MANT_SAVE_SERV_TYPE_ADL" );
    __app.setADL ( MANT_SAVE_SERV_TYPE_ADL.class, adl ); 
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
    MANT_SAVE_SERV_TYPE_ADL.get ( __app ).process ( ps );
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
    MANT_SAVE_SERV_TYPE_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "MANT_SAVE_SERV_TYPE_ADL" );
    if ( rObj != null && rObj instanceof MANT_SAVE_SERV_TYPE_ADL )
    {
      this.app.setADL ( MANT_SAVE_SERV_TYPE_ADL.class, ( MANT_SAVE_SERV_TYPE_ADL ) rObj );
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
    Debug.println ( Debug.TRACE, "MANT_SAVE_SERV_TYPE_ADL Step " + this.currentStep );
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
        Debug.println ( Debug.TRACE, "MANT_SAVE_SERV_TYPE_ADL ended" );
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

    if ( Compare.equals ( this.app.SSN_JEFE_FAM_GBL, 0 ) ) 
    {
      this.app.setError ( 1, 2769 );
      this.doReturn ( );
      return; 
    }
     
    this.app.ACCESS_STATUS_GBL = "";
    this.app.COD_ACCESS_GBL = "SERV";
    SECURITY_ADL.exec ( this.app );
    return;

  }


  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {

    if ( Compare.equals ( this.app.ACCESS_STATUS_GBL, "FAILURE" ) ) 
    {
      this.app.setError ( 0, 1006 );
      this.doReturn ( );
      return; 
    }
    FAMILIA_READ_LOC_DSD = this.dm.create ( "FAMILIA_READ_LOC_DSD" );
    FAM_ID = FAMILIA_READ_LOC_DSD.getId ( );
    FAM_STAT = RallyDataStoreException.getDefault ( );

    FAM_STAT  = this.dm.reset ( FAM_ID );

    this.dm.setField ( this.dm.get ( "FAMILIA_READ_LOC_DSD" ), "SEGURO_SOCIAL_JEFE_FAM", this.app.SSN_JEFE_FAM_GBL );
    this.dm.setField ( this.dm.get ( "FAMILIA_READ_LOC_DSD" ), "RMO_OFICINA", this.app.RMO_GBL );

    FAM_STAT  = this.dm.limitQueryFromBuffer ( FAM_ID );
    FAM_STAT  = this.dm.retrieve ( FAM_ID );

    FAM_STAT  = this.dm.firstRow ( FAM_ID );

    if ( ! Compare.equals ( FAM_STAT, 0 ) ) 
    {
      FAM_STAT  = this.dm.rollBack ( );
      FAM_STAT  = this.dm.dbClose ( FAM_ID );

      this.app.setError ( 1, 2769 );
      this.doReturn ( );
      return; 
    }

    FAM_STAT  = this.dm.rollBack ( );
    FAM_STAT  = this.dm.dbClose ( FAM_ID );

    this.app.MANT_SAVE_SELECT_TYPE_GBL = "SER";
    if ( Compare.equals ( this.app.RUTINA_GBL, "AC" ) ) 
    {
      APERTURA_DE_CASO_ADL.setCOMPLETION_STATUS ( this.app, "SUCCESS" );
    }
    else
    {
      MANTENIMIENTO_DE_CASOS_ADL.setCOMPLETION_STATUS ( this.app, "SUCCESS" );
    }
    UPDATE_CONFIRM = 0;

    this.callParms.clear ( );
    this.callParms.set ( UPDATE_CONFIRM  );
    SECURITY_CHECK_GBLS_ADL.exec ( this.app, this.callParms );
    return;

  }


  /**
   *
   */
  protected void step2 ( ParameterSet ps )
  {
    this.callParms.reset ( );
    UPDATE_CONFIRM  = this.callParms.getDouble ( );

    if ( Compare.equals ( UPDATE_CONFIRM, 1 ) || Compare.equals ( this.app.MACA_GBL, 1)) 
    {
      this._condition0 = true;
    }
    else
    {
      this._condition0 = false;
    }
    if ( this._condition0 )
    {
      SERV_FAM_UPD_PKT.exec ( this.app );
      return;
    }

  }


  /**
   *
   */
  protected void step3 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( Compare.equals ( UPDATE_CONFIRM, 1 ) ) 
    {
    }
    else
    {
      SERV_FAM_RO_PKT.exec ( this.app );
      return;
    }

  }


  /**
   *
   */
  protected void step4 ( ParameterSet ps )
  {
    if ( Compare.equals ( this.app.RUTINA_GBL, "AC" ) ) 
    {
      APERTURA_DE_CASO_ADL.setCOMPLETION_STATUS ( this.app, "FAILURE" );
    }
    else
    {
      MANTENIMIENTO_DE_CASOS_ADL.setCOMPLETION_STATUS ( this.app, "FAILURE" );
    }
    if ( Compare.equals ( this.app.TRANSF_STATUS, "S" ) ) 
    {
      MANTENIMIENTO_DE_CASOS_ADL.setPHASE_COUNT ( this.app, 1 );
      this.app.returnTo ( "MANTENIMIENTO_DE_CASOS_ADL" ); if ( true ) return;
    }

  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE MANT_SAVE_SERV_TYPE_ADL;
var
    update_confirm      : number(1,0);

    fam_id              : number(9,0);
    fam_stat            : number(9,0);

BEGIN

SET_TRACE();
ACCESS_STATUS_GBL :='';
COD_ACCESS_GBL:='SERV';
CALL SEcurity_ADL;
IF ACCESS_STATUS_GBL = 'FAILURE' THEN BEGIN
                        error(1006);
                        return;
                        end;


db_open(FAMILIA_READ_LOC_DSD,fam_id,fam_stat);
db_reset(fam_id,fam_stat);
FAMILIA_READ_LOC_DSD.seguro_social_jefe_fam:=SSN_JEFE_FAM_GBL;
FAMILIA_READ_LOC_DSD.RMO_OFICINA:=RMO_GBL;
db_query(fam_id,fam_stat);
db_get_first(fam_id,fam_stat);
if (fam_stat<>0)
   then begin
         db_rollback(fam_stat);
         db_close(fam_id,fam_stat);
         error(2769);
         return;
        end;
db_rollback(fam_stat);
db_close(fam_id,fam_stat);

MANT_SAVE_SELECT_TYPE_GBL:='SER';
IF RUTINA_GBL='AC'
   THEN APERTURA_DE_CASO_ADL.COMPLETION_STATUS:='SUCCESS';
   ELSE MANTENIMIENTO_DE_CASOS_ADL.COMPLETION_STATUS:='SUCCESS';
UPDATE_CONFIRM := 0;
call SECURITY_CHECK_GBLS_ADL(update_confirm);
DEBUG_LOG(TO_CHAR(UPDATE_CONFIRM));
     if (update_confirm=1) then caLL SERV_FAM_UPD_PKT;
     else call serv_fam_ro_pkt;
IF RUTINA_GBL='AC'
   THEN APERTURA_DE_CASO_ADL.COMPLETION_STATUS:='FAILURE';
   ELSE MANTENIMIENTO_DE_CASOS_ADL.COMPLETION_STATUS:='FAILURE';

IF TRANSF_STATUS = 'S'
THEN 
BEGIN
MANTENIMIENTO_DE_CASOS_ADL.PHASE_COUNT := 1;
RETURN_TO MANTENIMIENTO_DE_CASOS_ADL;
END;

SET_NOTRACE();

END;

    



--------------------------------------------------------------------- */
