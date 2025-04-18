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
public class CALCULAR_PAGO_RECLA_ADL
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

 

  // -------------------------------------------------------------------
  // ----------   Instance Export Attributes   -------------------------

  public double SERV_ID = 0;

  public double SERV_STATUS = 0;

  public double CANT_BENE = 0;

  public double NUM_MESES = 0;



  public String STATUS_SERV = null;

  public DataStore SERVICIOS2_DSD = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setSERV_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).SERV_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setSERV_STATUS  ( RallyApplication __app, Parameter value )
  {
    ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).SERV_STATUS = value.getDouble ( );
  }  

  
  /**  */
  public static void setCANT_BENE  ( RallyApplication __app, Parameter value )
  {
    ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).CANT_BENE = value.getDouble ( );
  }  

  
  /**  */
  public static void setSTATUS_SERV  ( RallyApplication __app, Parameter value )
  {
    ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).STATUS_SERV = value.getString ( );
  }  

  
  /**  */
  public static void setNUM_MESES  ( RallyApplication __app, Parameter value )
  {
    ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).NUM_MESES = value.getDouble ( );
  }  
    


  /**  */
  public static String getSTATUS_SERV  ( RallyApplication __app )
  {
    return ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).STATUS_SERV;
  }


  /**  */
  public static void setSTATUS_SERV  ( RallyApplication __app, String value )
  {
    ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).STATUS_SERV = value;
  }


  /**  */
  public static void setSTATUS_SERV  ( RallyApplication __app, Object value )
  {
    ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).STATUS_SERV = ( String ) value;
  }



  /**  */
  public static DataStore getSERVICIOS2_DSD  ( RallyApplication __app )
  {
    return ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).SERVICIOS2_DSD;
  }


  /**  */
  public static void setSERVICIOS2_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).SERVICIOS2_DSD = value;
  }


  /**  */
  public static void setSERVICIOS2_DSD  ( RallyApplication __app, Object value )
  {
    ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).SERVICIOS2_DSD = ( DataStore ) value;
  }




  /**  */
  public static double getSERV_ID  ( RallyApplication __app )
  {
    return ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).SERV_ID;
  }


  /**  */
  public static Double getSERV_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).SERV_ID );
  }


  /**  */
  public static void setSERV_ID  ( RallyApplication __app, double value )
  {
    ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).SERV_ID = value;
  }


  /**  */
  public static void setSERV_ID  ( RallyApplication __app, Object value )
  {
    ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).SERV_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSERV_STATUS  ( RallyApplication __app )
  {
    return ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).SERV_STATUS;
  }


  /**  */
  public static Double getSERV_STATUSDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).SERV_STATUS );
  }


  /**  */
  public static void setSERV_STATUS  ( RallyApplication __app, double value )
  {
    ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).SERV_STATUS = value;
  }


  /**  */
  public static void setSERV_STATUS  ( RallyApplication __app, Object value )
  {
    ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).SERV_STATUS = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getCANT_BENE  ( RallyApplication __app )
  {
    return ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).CANT_BENE;
  }


  /**  */
  public static Double getCANT_BENEDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).CANT_BENE );
  }


  /**  */
  public static void setCANT_BENE  ( RallyApplication __app, double value )
  {
    ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).CANT_BENE = value;
  }


  /**  */
  public static void setCANT_BENE  ( RallyApplication __app, Object value )
  {
    ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).CANT_BENE = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getNUM_MESES  ( RallyApplication __app )
  {
    return ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).NUM_MESES;
  }


  /**  */
  public static Double getNUM_MESESDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).NUM_MESES );
  }


  /**  */
  public static void setNUM_MESES  ( RallyApplication __app, double value )
  {
    ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).NUM_MESES = value;
  }


  /**  */
  public static void setNUM_MESES  ( RallyApplication __app, Object value )
  {
    ( ( CALCULAR_PAGO_RECLA_ADL ) __app.getADL ( CALCULAR_PAGO_RECLA_ADL.class ) ).NUM_MESES = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static CALCULAR_PAGO_RECLA_ADL get ( RallyApplication __app )
  {
    CALCULAR_PAGO_RECLA_ADL adl = new CALCULAR_PAGO_RECLA_ADL ( );
    __app.register ( adl, "CALCULAR_PAGO_RECLA_ADL" );
    __app.setADL ( CALCULAR_PAGO_RECLA_ADL.class, adl ); 
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
    CALCULAR_PAGO_RECLA_ADL.get ( __app ).process ( ps );
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
    CALCULAR_PAGO_RECLA_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "CALCULAR_PAGO_RECLA_ADL" );
    if ( rObj != null && rObj instanceof CALCULAR_PAGO_RECLA_ADL )
    {
      this.app.setADL ( CALCULAR_PAGO_RECLA_ADL.class, ( CALCULAR_PAGO_RECLA_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "CALCULAR_PAGO_RECLA_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "CALCULAR_PAGO_RECLA_ADL ended" );
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

    NUM_MESES = 0;
    CANT_BENE = 0;
    SERVICIOS2_DSD = this.dm.create ( "SERVICIOS2_DSD" );
    SERV_ID = SERVICIOS2_DSD.getId ( );
    SERV_STATUS = RallyDataStoreException.getDefault ( );

    SERV_STATUS  = this.dm.reset ( SERV_ID );

    this.dm.setField ( this.dm.get ( "SERVICIOS2_DSD" ), "SEGURO_SOCIAL_JEFE_FAM", this.app.SSN_JEFE_FAM_GBL );
    this.dm.setField ( this.dm.get ( "SERVICIOS2_DSD" ), "SEGURO_SOCIAL_JEFE_SERV", this.app.SS_JEFE_SERVICIO_GBL );
    this.dm.setField ( this.dm.get ( "SERVICIOS2_DSD" ), "RMO_OFICINA", this.app.RMO_GBL );
    if ( Compare.equals ( RallyStringService.subString ( this.app.COD_SERV_GBL, 0, 4 ), "PANE" ) ) 
    {
      this.dm.setField ( this.dm.get ( "SERVICIOS2_DSD" ), "COD_SERVICIO", "PAN" );
    }
    else
    {
      this.dm.setField ( this.dm.get ( "SERVICIOS2_DSD" ), "COD_SERVICIO", this.app.COD_SERV_GBL );
    }

    SERV_STATUS  = this.dm.limitQueryFromBuffer ( SERV_ID );
    SERV_STATUS  = this.dm.retrieve ( SERV_ID );

    SERV_STATUS  = this.dm.firstRow ( SERV_ID );

    CANT_BENE = this.dm.getFieldDouble ( this.dm.get ( "SERVICIOS2_DSD" ), "VLR_BENEFICIOS" );
    STATUS_SERV = this.dm.getFieldString ( this.dm.get ( "SERVICIOS2_DSD" ), "COD_STATUS_SERVICIO" );
    SERV_STATUS  = this.dm.dbClose ( SERV_ID );

    if ( Compare.equals ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getStringItem ( "METODO_PAGO" ), "PAGL" ) ) 
    {
      this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).setItem ( "NUM_MESES_DEDUCIR", 1  );
      this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).setItem ( "CANTIDAD_DEDUCIR", this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getDoubleItem ( "VLR_BALANCE" ) );
      this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).setItem ( "VLR_REMANENTE", 0  );
    }
    if ( Compare.equals ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getStringItem ( "METODO_PAGO" ), "PLPA" ) ) 
    {
      NUM_MESES = this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getDoubleItem ( "VLR_BALANCE" )/ this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getDoubleItem ( "CANTIDAD_DEDUCIR" );
      NUM_MESES = TruncService.trunc ( NUM_MESES ) ;
      if ( Compare.gt ( NUM_MESES, 60 ) ) 
      {
        this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).setItem ( "NUM_MESES_DEDUCIR", 60  );
        // *** BEGIN MODS By JOR 11/25/2008 ***
        //this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).setItem ( "VLR_REMANENTE", MathService.minus ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getDoubleItem ( "VLR_BALANCE" ), ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getDoubleItem ( "CANTIDAD_DEDUCIR" )* ( 60 ) )  )  );
        this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).setItem ( "VLR_REMANENTE", MathService.minus ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getDoubleItem ( "VLR_BALANCE" ), this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getDoubleItem ( "CANTIDAD_DEDUCIR" ) * 60)  );
        // *** END MODS By JOR 11/25/2008 ***
      }
      else
      {
        this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).setItem ( "NUM_MESES_DEDUCIR", NUM_MESES  );
        // *** BEGIN MODS By JOR 11/25/2008 ***
        this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).setItem ( "VLR_REMANENTE", MathService.minus ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getDoubleItem ( "VLR_BALANCE" ), this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getDoubleItem ( "CANTIDAD_DEDUCIR" ) * NUM_MESES)  );
        // *** END MODS By JOR 11/25/2008 ***
        if ( Compare.gt ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getDoubleItem ( "VLR_REMANENTE" ), 0 ) ) 
        {
          NUM_MESES = MathService.plus ( NUM_MESES, 1  );
          this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).setItem ( "NUM_MESES_DEDUCIR", NUM_MESES  );
        }
        else
        {
          this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).setItem ( "VLR_REMANENTE", 0  );
        }
      }
    }
    if ( Compare.equals ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getStringItem ( "METODO_PAGO" ), "REDU" ) ) 
    {
      if ( Compare.equals ( RallyStringService.subString ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getStringItem ( "COD_SERVICIO" ), 0, 3 ), "PAN" ) ) 
      {
        this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).setItem ( "CANTIDAD_DEDUCIR", TruncService.trunc ( ( CANT_BENE * 20 ) / 100 )   );
      }
      if ( Compare.equals ( RallyStringService.subString ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getStringItem ( "COD_SERVICIO" ), 0, 2 ), "AE" ) ) 
      {
        this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).setItem ( "CANTIDAD_DEDUCIR", TruncService.trunc ( ( CANT_BENE * 10 ) / 100 )   );
      }
      NUM_MESES = this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getDoubleItem ( "VLR_BALANCE" )/ this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getDoubleItem ( "CANTIDAD_DEDUCIR" );
      NUM_MESES = TruncService.trunc ( NUM_MESES ) ;
      if ( Compare.gt ( NUM_MESES, 0 ) ) 
      {
        this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).setItem ( "VLR_REMANENTE", MathService.minus ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getDoubleItem ( "VLR_BALANCE" ), ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getDoubleItem ( "CANTIDAD_DEDUCIR" )* NUM_MESES )  )  );
      }
      else
      {
        this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).setItem ( "CANTIDAD_DEDUCIR", this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getDoubleItem ( "VLR_BALANCE" ) );
        this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).setItem ( "VLR_REMANENTE", 0  );
        NUM_MESES = 1;
      }
      if ( ( Compare.gt ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getDoubleItem ( "VLR_REMANENTE" ), 0 ) ) && ( ( Compare.equals ( RallyStringService.subString ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getStringItem ( "SERVICIO_STATUS" ), 0, 4 ), "CERR" ) ) || ( Compare.equals ( RallyStringService.subString ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getStringItem ( "SERVICIO_STATUS" ), 0, 4 ), "RECH" ) ) )  ) 
      {
        this.app.setError ( 0, 1049 );
        this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).setItem ( "NUM_MESES_DEDUCIR", MathService.plus ( NUM_MESES, 1  )  );
      }
      else if ( Compare.gt ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getDoubleItem ( "VLR_REMANENTE" ), 0 ) ) 
      {
        this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).setItem ( "NUM_MESES_DEDUCIR", MathService.plus ( NUM_MESES, 1  )  );
      }
      else
      {
        this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).setItem ( "NUM_MESES_DEDUCIR", NUM_MESES  );
      }
    }
    CALCULAR_NUM_MESES_ADL.exec ( this.app );
    return;

  }
}



/* ---------------------------------------------------------------------


     
PRocedure calcular_pago_recla_adl;
var
        serv_id         : number(9,0);
        serv_status     : number(9,0);
        cant_bene       : number(9,0);
        STATUS_SERV     : CHAR;
        NUM_MESES       : NUMBER;
begin
set_trace();
NUM_MESES := 0;
cant_bene := 0;
db_open(SERVICIOS2_DSD,serv_id,serv_status);
db_reset(serv_id,serv_status);
        SERVICIOS2_DSD.SEGURO_SOCIAL_JEFE_FAM := ssn_jefe_fam_gbl;
        SERVICIOS2_DSD.SEGURO_SOCIAL_JEFE_SERV := ss_jefe_servicio_gbl;
        SERVICIOS2_DSD.RMO_OFICINA := RMO_GBL;
        if substr(cod_serv_gbl,0,4) = 'PANE'
        then
                SERVICIOS2_DSD.COD_SERVICIO := 'PAN';
        ELSE    
                SERVICIOS2_DSD.COD_SERVICIO := cod_serv_gbl;
        {ENDIF}

db_query(serv_id,serv_status);
db_get_first(serv_id,serv_status);

        cant_bene := SERVICIOS2_DSD.VLR_BENEFICIOS;
        STATUS_SERV := SERVICIOS2_DSD.COD_STATUS_SERVICIO;

db_close(serv_id,serv_status);

{****************** Pago Global *************}

        if COMPROMISO_PAGO_RECLA_FR.METODO_PAGO = 'PAGL'
        then
           begin
                COMPROMISO_PAGO_RECLA_FR.NUM_MESES_DEDUCIR := 1;
                COMPROMISO_PAGO_RECLA_FR.CANTIDAD_DEDUCIR := COMPROMISO_PAGO_REC
LA_FR.VLR_BALANCE;
                COMPROMISO_PAGO_RECLA_FR.VLR_REMANENTE := 0;            
           end;
        {endif metodo_pago = 'PAGL'}

{*************** P l a n  d e  P a g o **************************}

        if COMPROMISO_PAGO_RECLA_FR.METODO_PAGO = 'PLPA'
        then
           begin
              NUM_MESES := COMPROMISO_PAGO_RECLA_FR.VLR_BALANCE / 
                                COMPROMISO_PAGO_RECLA_FR.CANTIDAD_DEDUCIR;      
        
              NUM_MESES := TRUNC(NUM_MESES);

{Cambio efectivo abril 2007 por nueva reglamentacion}
              IF NUM_MESES > 60
              THEN
                BEGIN
                   COMPROMISO_PAGO_RECLA_FR.NUM_MESES_DEDUCIR := 60;
                   COMPROMISO_PAGO_RECLA_FR.VLR_REMANENTE := COMPROMISO_PAGO_REC
LA_FR.VLR_BALANCE
{          - (COMPROMISO_PAGO_RECLA_FR.CANTIDAD_DEDUCIR * (NUM_MESES-60));}
           - (COMPROMISO_PAGO_RECLA_FR.CANTIDAD_DEDUCIR * (60));
                END;
              ELSE
                BEGIN
                   COMPROMISO_PAGO_RECLA_FR.NUM_MESES_DEDUCIR := NUM_MESES;
                   COMPROMISO_PAGO_RECLA_FR.VLR_REMANENTE := COMPROMISO_PAGO_REC
LA_FR.VLR_BALANCE
                   - (COMPROMISO_PAGO_RECLA_FR.CANTIDAD_DEDUCIR * (NUM_MESES));

                   IF COMPROMISO_PAGO_RECLA_FR.VLR_REMANENTE > 0
                   THEN
                        BEGIN
                          NUM_MESES := NUM_MESES + 1;
                          COMPROMISO_PAGO_RECLA_FR.NUM_MESES_DEDUCIR := NUM_MESE
S;
                        END;
                   ELSE
                        COMPROMISO_PAGO_RECLA_FR.VLR_REMANENTE := 0;
                   {ENDIF}
                END;
              {ENDIF}   
           end;
        {endif metodo_pago = 'PLPA'}

{*************** Reduccion de beneficios *******************************}

        if COMPROMISO_PAGO_RECLA_FR.METODO_PAGO = 'REDU'
        then
           begin
              if SUBSTR(COMPROMISO_PAGO_RECLA_FR.COD_SERVICIO,0,3) = 'PAN'
              then
                begin
                    COMPROMISO_PAGO_RECLA_FR.CANTIDAD_DEDUCIR := 
                        TRUNC((cant_bene * 20) / 100);
                                end;
              {endif cod_servicio = 'PAN'}

              if substr(COMPROMISO_PAGO_RECLA_FR.COD_SERVICIO,0,2) = 'AE'
              then
                begin
                    COMPROMISO_PAGO_RECLA_FR.CANTIDAD_DEDUCIR :=
                        TRUNC((cant_bene * 10) / 100);
                end;
              {endif cod_servicio = 'AE'}

              NUM_MESES := COMPROMISO_PAGO_RECLA_FR.VLR_BALANCE / 
                                COMPROMISO_PAGO_RECLA_FR.CANTIDAD_DEDUCIR;      
        
              NUM_MESES := TRUNC(NUM_MESES);
        IF NUM_MESES > 0 THEN
           BEGIN
            COMPROMISO_PAGO_RECLA_FR.VLR_REMANENTE := COMPROMISO_PAGO_RECLA_FR.V
LR_BALANCE - (COMPROMISO_PAGO_RECLA_FR.CANTIDAD_DEDUCIR * NUM_MESES);
           END;
        ELSE
           BEGIN
                    COMPROMISO_PAGO_RECLA_FR.CANTIDAD_DEDUCIR := COMPROMISO_PAGO
_RECLA_FR.VLR_BALANCE;
                    COMPROMISO_PAGO_RECLA_FR.VLR_REMANENTE :=0;
                    NUM_MESES := 1;
           END;
                   if (COMPROMISO_PAGO_RECLA_FR.VLR_REMANENTE > 0) and ((substr(
COMPROMISO_PAGO_RECLA_FR.SERVICIO_STATUS,0,4) = 'CERR') OR
(substr(COMPROMISO_PAGO_RECLA_FR.SERVICIO_STATUS,0,4) = 'RECH'))
                         then 
                        begin
                        error(1049);
                        COMPROMISO_PAGO_RECLA_FR.NUM_MESES_DEDUCIR := NUM_MESES 
+ 1;
                        end;
                   else
                        if (COMPROMISO_PAGO_RECLA_FR.VLR_REMANENTE > 0)
                        then
                           begin
                           COMPROMISO_PAGO_RECLA_FR.NUM_MESES_DEDUCIR := NUM_MES
ES + 1;
                           end;
                        else
                           BEGIN
                            COMPROMISO_PAGO_RECLA_FR.NUM_MESES_DEDUCIR := NUM_ME
SES;
                           END;
                    

                {endif vlr_remanente > 0}
           {endif vlr_remanente > 0 and status_servicio <> 'ACTIVO'}    
        end;
        {endif metodo_pago = 'REDU'}

CALL CALCULAR_NUM_MESES_ADL;
set_notrace();
end; 

    



--------------------------------------------------------------------- */
