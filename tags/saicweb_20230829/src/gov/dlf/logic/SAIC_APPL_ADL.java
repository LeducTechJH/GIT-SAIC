package gov.dlf.logic;


import gov.dlf.external.GET_USERNAME;
import gov.dlf.facade.SAIC_DMQ_ORA_Application;
import gov.dlf.facade.SAIC_MENU;
import gov.dlf.presentation.SEL_RMO_OFICINA_ALL_PKT;
import gov.dlf.presentation.SEL_RMO_OFICINA_PKT;

import net.maintrend.datamanager.DataStore;
import net.maintrend.interfaces.IRegisteredObject;
import net.maintrend.interlink.Parameter;
import net.maintrend.interlink.ParameterSet;
import net.maintrend.rallyengine.ADL;
import net.maintrend.rallyengine.RallyAppCommandFactory;
import net.maintrend.rallyengine.RallyApplication;
import net.maintrend.rallyengine.RallyDataManager;
import net.maintrend.rallyengine.RallyDataStoreException;
import net.maintrend.rallyengine.RallyStringService;
import net.maintrend.util.Compare;
import net.maintrend.util.Debug;
import net.maintrend.util.StringService;
import net.maintrend.util.TruncService;



/**
 * __Comment
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class SAIC_APPL_ADL
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
 
  public boolean _condition2 = false;
 
  public boolean _condition3 = false;
 
  public boolean _condition4 = false;
 
  public boolean _condition5 = false;
 
  public boolean _condition6 = false;
 
  public boolean _condition7 = false;

 

  // -------------------------------------------------------------------
  // ----------   Instance Export Attributes   -------------------------

  public double TECNICO_TABLE = 0;

  public double TECNICO_STATUS_ID = 0;



  public DataStore TECNICO_RO_DSD = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setTECNICO_TABLE  ( RallyApplication __app, Parameter value )
  {
    ( ( SAIC_APPL_ADL ) __app.getADL ( SAIC_APPL_ADL.class ) ).TECNICO_TABLE = value.getDouble ( );
  }  

  
  /**  */
  public static void setTECNICO_STATUS_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( SAIC_APPL_ADL ) __app.getADL ( SAIC_APPL_ADL.class ) ).TECNICO_STATUS_ID = value.getDouble ( );
  }  
    


  /**  */
  public static DataStore getTECNICO_RO_DSD  ( RallyApplication __app )
  {
    return ( ( SAIC_APPL_ADL ) __app.getADL ( SAIC_APPL_ADL.class ) ).TECNICO_RO_DSD;
  }


  /**  */
  public static void setTECNICO_RO_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( SAIC_APPL_ADL ) __app.getADL ( SAIC_APPL_ADL.class ) ).TECNICO_RO_DSD = value;
  }


  /**  */
  public static void setTECNICO_RO_DSD  ( RallyApplication __app, Object value )
  {
    ( ( SAIC_APPL_ADL ) __app.getADL ( SAIC_APPL_ADL.class ) ).TECNICO_RO_DSD = ( DataStore ) value;
  }




  /**  */
  public static double getTECNICO_TABLE  ( RallyApplication __app )
  {
    return ( ( SAIC_APPL_ADL ) __app.getADL ( SAIC_APPL_ADL.class ) ).TECNICO_TABLE;
  }


  /**  */
  public static Double getTECNICO_TABLEDouble ( RallyApplication __app )
  {
    return new Double ( ( ( SAIC_APPL_ADL ) __app.getADL ( SAIC_APPL_ADL.class ) ).TECNICO_TABLE );
  }


  /**  */
  public static void setTECNICO_TABLE  ( RallyApplication __app, double value )
  {
    ( ( SAIC_APPL_ADL ) __app.getADL ( SAIC_APPL_ADL.class ) ).TECNICO_TABLE = value;
  }


  /**  */
  public static void setTECNICO_TABLE  ( RallyApplication __app, Object value )
  {
    ( ( SAIC_APPL_ADL ) __app.getADL ( SAIC_APPL_ADL.class ) ).TECNICO_TABLE = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getTECNICO_STATUS_ID  ( RallyApplication __app )
  {
    return ( ( SAIC_APPL_ADL ) __app.getADL ( SAIC_APPL_ADL.class ) ).TECNICO_STATUS_ID;
  }


  /**  */
  public static Double getTECNICO_STATUS_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( SAIC_APPL_ADL ) __app.getADL ( SAIC_APPL_ADL.class ) ).TECNICO_STATUS_ID );
  }


  /**  */
  public static void setTECNICO_STATUS_ID  ( RallyApplication __app, double value )
  {
    ( ( SAIC_APPL_ADL ) __app.getADL ( SAIC_APPL_ADL.class ) ).TECNICO_STATUS_ID = value;
  }


  /**  */
  public static void setTECNICO_STATUS_ID  ( RallyApplication __app, Object value )
  {
    ( ( SAIC_APPL_ADL ) __app.getADL ( SAIC_APPL_ADL.class ) ).TECNICO_STATUS_ID = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static SAIC_APPL_ADL get ( RallyApplication __app )
  {
    SAIC_APPL_ADL adl = new SAIC_APPL_ADL ( );
    __app.register ( adl, "SAIC_APPL_ADL" );
    __app.setADL ( SAIC_APPL_ADL.class, adl ); 
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
    SAIC_APPL_ADL.get ( __app ).process ( ps );
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
    SAIC_APPL_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "SAIC_APPL_ADL" );
    if ( rObj != null && rObj instanceof SAIC_APPL_ADL )
    {
      this.app.setADL ( SAIC_APPL_ADL.class, ( SAIC_APPL_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "SAIC_APPL_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
      case 2:  { this.currentStep ++; this.step2 ( this.keyParms ); break; }
      case 3:  { this.currentStep ++; this.step3 ( this.keyParms ); break; }
      case 4:  { this.currentStep ++; this.step4 ( this.keyParms ); break; }
      case 5:  { this.currentStep ++; this.step5 ( this.keyParms ); break; }
      case 6:  { this.currentStep ++; this.step6 ( this.keyParms ); break; }
      case 7:  { this.currentStep ++; this.step7 ( this.keyParms ); break; }
      case 8:  { this.currentStep ++; this.step8 ( this.keyParms ); break; }
      case 9:  { this.currentStep ++; this.step9 ( this.keyParms ); break; }
      case 10:  { this.currentStep ++; this.step10 ( this.keyParms ); break; }
      case 11:  { this.currentStep ++; this.step11 ( this.keyParms ); break; }
      case 12:  { this.currentStep ++; this.step12 ( this.keyParms ); break; }
      case 13:  { this.currentStep ++; this.step13 ( this.keyParms ); break; }
      case 14:  { this.currentStep ++; this.step14 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "SAIC_APPL_ADL ended" );
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
    GET_USERNAME.exec ( this.app, this.callParms );
    return;

  }


  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {

    this.app.SAICLOOP_GBL = 0;
    this.process ( ps );

  }


  /**
   *
   */
  protected void step2 ( ParameterSet ps )
  {

    if ( Compare.equals ( this.app.SAICLOOP_GBL, 0 )  )
    {
      this._condition0 = true;
    }
    else
    {
      this._condition0 = false;
    }
    if ( this._condition0 )
    {
      TECNICO_RO_DSD = this.dm.create ( "TECNICO_RO_DSD" );
      TECNICO_TABLE = TECNICO_RO_DSD.getId ( );
      TECNICO_STATUS_ID = RallyDataStoreException.getDefault ( );
      if ( ! Compare.equals ( TECNICO_STATUS_ID, 0 ) ) 
      {
        this._condition1 = true;
      }
      else
      {
        this._condition1 = false;
      }
      if ( this._condition1 )
      {
        this.app.setError ( 0, TECNICO_STATUS_ID );
        this.app.callCommand ( RallyAppCommandFactory.ABORTAPPL );
        return;
      }
    }

  }


  /**
   *
   */
  protected void step3 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    while ( Compare.equals ( this.app.SAICLOOP_GBL, 0 )  )
    {
      if ( this._condition1 )    //      if ( ! Compare.equals ( TECNICO_STATUS_ID, 0 ) ) 
      {
      }

      TECNICO_STATUS_ID  = this.dm.reset ( TECNICO_TABLE );

      if ( ! Compare.equals ( TECNICO_STATUS_ID, 0 ) ) 
      {
        this._condition2 = true;
      }
      else
      {
        this._condition2 = false;
      }
      if ( this._condition2 )
      {
        this.app.setError ( 1, TECNICO_STATUS_ID );
        this.app.callCommand ( RallyAppCommandFactory.ABORTAPPL );
        return;
      }
    }

  }


  /**
   *
   */
  protected void step4 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    while ( Compare.equals ( this.app.SAICLOOP_GBL, 0 )  )
    {
      this.dm.setField ( this.dm.get ( "TECNICO_RO_DSD" ), "COD_SEGURIDAD", this.app.USERNAME.toUpperCase ( ) );

      TECNICO_STATUS_ID = this.dm.limitQueryFromBuffer ( TECNICO_TABLE );
      TECNICO_STATUS_ID = this.dm.retrieve ( TECNICO_TABLE );

      if ( ! Compare.equals ( TECNICO_STATUS_ID, 0 ) ) 
      {
        this._condition3 = true;
      }
      else
      {
        this._condition3 = false;
      }
      if ( this._condition3 )
      {
        this.app.setError ( 2, TECNICO_STATUS_ID );
        this.app.callCommand ( RallyAppCommandFactory.ABORTAPPL );
        return;
      }
    }

  }


  /**
   *
   */
  protected void step5 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    while ( Compare.equals ( this.app.SAICLOOP_GBL, 0 )  )
    {
      if ( this._condition3 )    //      if ( ! Compare.equals ( TECNICO_STATUS_ID, 0 ) ) 
      {
      }

      TECNICO_STATUS_ID  = this.dm.firstRow ( TECNICO_TABLE );

      if ( ! Compare.equals ( TECNICO_STATUS_ID, 0 ) ) 
      {
        this._condition4 = true;
      }
      else
      {
        this._condition4 = false;
      }
      if ( this._condition4 )
      {
        this.app.setError ( 3, TECNICO_STATUS_ID );
        this.app.callCommand ( RallyAppCommandFactory.ABORTAPPL );
        return;
      }
    }

  }


  /**
   *
   */
  protected void step6 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    while ( Compare.equals ( this.app.SAICLOOP_GBL, 0 )  )
    {
      if ( this._condition4 )    //      if ( ! Compare.equals ( TECNICO_STATUS_ID, 0 ) ) 
      {
      }
      this.app.ID_TECNICO_GBL = this.dm.getFieldDouble ( this.dm.get ( "TECNICO_RO_DSD" ), "ID_TECNICO" );
      this.app.TECNICO_NUM_GBL = this.app.ID_TECNICO_GBL;
      this.app.ID_SUPERVISOR_GBL = this.dm.getFieldDouble ( this.dm.get ( "TECNICO_RO_DSD" ), "ID_SUPERVISOR" );
      this.app.RMO_GBL = this.dm.getFieldDouble ( this.dm.get ( "TECNICO_RO_DSD" ), "COD_RMO" );
      this.app.getUser ( ).setUserId  ( this.app.ID_TECNICO_GBL );
      if ( Compare.equals ( this.app.RMO_GBL, 0 ) ) 
      {
        this._condition5 = true;
      }
      else
      {
    	   this.app.getUser ( ).setGroupId ( this.app.RMO_GBL );
    	     this._condition5 = true;  //activa todas las oficinas
   //     this._condition5 = false;
      }
      if ( this._condition5 )
      {
        SEL_RMO_OFICINA_ALL_PKT.exec ( this.app );
        return;
      }
    }
  }


  /**
   *
   */
  protected void step7 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    while ( Compare.equals ( this.app.SAICLOOP_GBL, 0 )  )
    {
      if ( this._condition5 )    //      if ( Compare.equals ( this.app.RMO_GBL, 0 ) ) 
      {
      }
      else if ( ( Compare.equals ( RallyStringService.subString ( StringService.toStringValue  ( this.app.RMO_GBL ), 2, 4 ), "0000" ) ) || ( Compare.equals ( RallyStringService.subString ( StringService.toStringValue  ( this.app.RMO_GBL ), 2, 4 ), "000" ) )  )
      {
        this._condition6 = true;
      }
      else
      {
        this._condition6 = false;
      }
      if ( this._condition6 )
      {
        this.app.RMO_GBL = TruncService.trunc ( this.app.RMO_GBL * 0.0001 ) ;
        SEL_RMO_OFICINA_PKT.exec ( this.app );
        return;
      }
    }
  }


  /**
   *
   */
  protected void step8 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    while ( Compare.equals ( this.app.SAICLOOP_GBL, 0 )  )
    {
      if ( this._condition5 )    //      if ( Compare.equals ( this.app.RMO_GBL, 0 ) ) 
      {
      }
      else if ( this._condition6 )    //      else if ( ( Compare.equals ( RallyStringService.subString ( StringService.toStringValue  ( this.app.RMO_GBL ), 2, 4 ), "0000" ) ) || ( Compare.equals ( RallyStringService.subString ( StringService.toStringValue  ( this.app.RMO_GBL ), 2, 4 ), "000" ) )  )
      {
      }
      else if ( Compare.equals ( RallyStringService.subString ( StringService.toStringValue  ( this.app.RMO_GBL ), 4, 2 ), "00" )  )
      {
        this._condition7 = true;
      }
      else
      {
        this._condition7 = false;
      }
      if ( this._condition7 )
      {
        this.app.RMO_GBL = TruncService.trunc ( this.app.RMO_GBL * 0.01 ) ;
        SEL_RMO_OFICINA_PKT.exec ( this.app );
        return;
      }
    }
  }


  /**
   *
   */
  protected void step9 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    while ( Compare.equals ( this.app.SAICLOOP_GBL, 0 )  )
    {
      if ( this._condition5 )    //      if ( Compare.equals ( this.app.RMO_GBL, 0 ) ) 
      {
      }
      else if ( this._condition6 )    //      else if ( ( Compare.equals ( RallyStringService.subString ( StringService.toStringValue  ( this.app.RMO_GBL ), 2, 4 ), "0000" ) ) || ( Compare.equals ( RallyStringService.subString ( StringService.toStringValue  ( this.app.RMO_GBL ), 2, 4 ), "000" ) )  )
      {
      }
      else if ( this._condition7 )    //      else if ( Compare.equals ( RallyStringService.subString ( StringService.toStringValue  ( this.app.RMO_GBL ), 4, 2 ), "00" )  )
      {
      }
      else
      {
        this.app.RMO_GBL = this.dm.getFieldDouble ( this.dm.get ( "TECNICO_RO_DSD" ), "COD_RMO" );
      this.app.getUser ( ).setUserId ( this.app.ID_TECNICO_GBL );
        this.app.SAICLOOP_GBL = 1;
      }
      this.app.REGION_GBL = TruncService.trunc ( this.app.RMO_GBL * 0.0001 ) ;// ( "SYS$PRINT", this.dm.getFieldString ( this.dm.get ( "TECNICO_RO_DSD" ), "PRINTER_QUEUE" ) ) 
      SECURITY_SET_GBLS_ADL.exec ( this.app );
      return;
    }
  }


  /**
   *
   */
  protected void step10 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    while ( Compare.equals ( this.app.SAICLOOP_GBL, 0 )  )
    {
      TECNICO_STATUS_ID  = this.dm.dbClose ( TECNICO_TABLE );

      USUARIO_GBL_PPKT.exec ( this.app );
      return;
    }
  }


  /**
   *
   */
  protected void step11 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    while ( Compare.equals ( this.app.SAICLOOP_GBL, 0 )  )
    {
      GET_RMO_FOR_SAIC_LOGO_ADL.exec ( this.app );
      return;
    }
  }


  /**
   *
   */
  protected void step12 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    while ( Compare.equals ( this.app.SAICLOOP_GBL, 0 )  )
    {
      //SET_CACHE_SIZE ( "SAIC_DB:", 5 ) 
      SAIC_MENU.exec ( this.app );
      return;
    }
  }


  /**
   *
   */
  protected void step13 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    while ( Compare.equals ( this.app.SAICLOOP_GBL, 0 )  )
    {
      this.currentStep = 2;
      return;
    }
  }


  /**
   *
   */
  protected void step14 ( ParameterSet ps )
  {
    this.app.errorFlag = false;
    //SET_CACHE_SIZE ( "SAIC_DB:", 2 ) 
  }
}



/* ---------------------------------------------------------------------


     
procedure saic_appl_adl;
var     tecnico_table:          number(9,0);
        tecnico_status_id:      number(9,0);
begin
    set_trace();

    CALL GET_USERNAME;
    SAICLOOP_GBL := 0;
  WHILE SAICLOOP_GBL = 0 DO 
   BEGIN 
        DB_OPEN(TECNICO_RO_DSD,TECNICO_TABLE,TECNICO_STATUS_ID);
        IF TECNICO_STATUS_ID <> 0
                THEN BEGIN
                        ERROR(TECNICO_STATUS_ID);
                        CALL_CMD(ABORTAPPL);
                     END;
        {ENDIF}

        DB_RESET(TECNICO_TABLE,TECNICO_STATUS_ID);
        IF TECNICO_STATUS_ID <> 0
                THEN BEGIN
                        ERROR(TECNICO_STATUS_ID);
                        CALL_CMD(ABORTAPPL);
                     END;
        {ENDIF}

        TECNICO_RO_DSD.COD_SEGURIDAD := USERNAME;
        DB_QUERY(TECNICO_TABLE,TECNICO_STATUS_ID);
        IF TECNICO_STATUS_ID <> 0
                THEN BEGIN
                        ERROR(TECNICO_STATUS_ID);
                        CALL_CMD(ABORTAPPL);
                     END;
        {ENDIF}

        DB_GET_FIRST(TECNICO_TABLE,TECNICO_STATUS_ID);
        IF TECNICO_STATUS_ID <> 0
                THEN BEGIN
                        ERROR(TECNICO_STATUS_ID);
                        CALL_CMD(ABORTAPPL);
                     END;
        {ENDIF}

        ID_TECNICO_GBL := TECNICO_RO_DSD.ID_TECNICO;
        TECNICO_NUM_GBL := ID_TECNICO_GBL;
        ID_SUPERVISOR_GBL:= TECNICO_RO_DSD.ID_SUPERVISOR;
        RMO_GBL := TECNICO_RO_DSD.COD_RMO;
IF RMO_GBL= 0 THEN
                BEGIN
                CALL SEL_RMO_OFICINA_ALL_PKT;
                END;
        ELSE
                IF (SUBSTR(TO_CHAR(RMO_GBL),2,4) = '0000') OR
                   (SUBSTR(TO_CHAR(RMO_GBL),2,4) = '000')                    
                THEN
                        BEGIN
                        RMO_GBL :=  TRUNC(RMO_GBL*0.0001);
                        CALL SEL_RMO_OFICINA_PKT;
                        END;
                ELSE
                        IF SUBSTR(TO_CHAR(RMO_GBL),4,2) = '00' THEN
                                BEGIN
                                RMO_GBL :=  TRUNC(RMO_GBL*0.01);
                                CALL SEL_RMO_OFICINA_PKT;
                                END;
                        ELSE
                           BEGIN
                                RMO_GBL := TECNICO_RO_DSD.COD_RMO;
                                SAICLOOP_GBL := 1;
                           END;
        REGION_GBL := TRUNC(RMO_GBL*0.0001); 
        DEFINE_LOGICAL('SYS$PRINT', TECNICO_RO_DSD.PRINTER_QUEUE);
        CALL SECURITY_SET_GBLS_ADL;
        DB_CLOSE (TECNICO_TABLE,TECNICO_STATUS_ID);
        CALL USUARIO_GBL_PPKT;

        call get_rmo_for_saic_logo_adl;
{CALL MAIL_NOTIFICACIONES;}
        SET_CACHE_SIZE('SAIC_DB:',5);

        call saic_menu;
   END; 
        SET_FAILURE();
        SET_CACHE_SIZE('SAIC_DB:',2);
        SET_NOTRACE();
end;

    



--------------------------------------------------------------------- */
