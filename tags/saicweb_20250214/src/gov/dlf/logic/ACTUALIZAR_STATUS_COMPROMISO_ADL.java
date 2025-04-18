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
public class ACTUALIZAR_STATUS_COMPROMISO_ADL
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

  public double RECLA_ID = 0;

  public double RECLA_STATUS = 0;

  public double LAST_KEY = 0;



  public Date FCH_RECLA_ORIGINAL = null;

  public DataStore RECLA_RETRO_TABLE_DSD = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setRECLA_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( ACTUALIZAR_STATUS_COMPROMISO_ADL ) __app.getADL ( ACTUALIZAR_STATUS_COMPROMISO_ADL.class ) ).RECLA_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setRECLA_STATUS  ( RallyApplication __app, Parameter value )
  {
    ( ( ACTUALIZAR_STATUS_COMPROMISO_ADL ) __app.getADL ( ACTUALIZAR_STATUS_COMPROMISO_ADL.class ) ).RECLA_STATUS = value.getDouble ( );
  }  

  
  /**  */
  public static void setLAST_KEY  ( RallyApplication __app, Parameter value )
  {
    ( ( ACTUALIZAR_STATUS_COMPROMISO_ADL ) __app.getADL ( ACTUALIZAR_STATUS_COMPROMISO_ADL.class ) ).LAST_KEY = value.getDouble ( );
  }  

  
  /**  */
  public static void setFCH_RECLA_ORIGINAL  ( RallyApplication __app, Parameter value )
  {
    ( ( ACTUALIZAR_STATUS_COMPROMISO_ADL ) __app.getADL ( ACTUALIZAR_STATUS_COMPROMISO_ADL.class ) ).FCH_RECLA_ORIGINAL = value.getDate ( );
  }  
    


  /**  */
  public static Date getFCH_RECLA_ORIGINAL  ( RallyApplication __app )
  {
    return ( ( ACTUALIZAR_STATUS_COMPROMISO_ADL ) __app.getADL ( ACTUALIZAR_STATUS_COMPROMISO_ADL.class ) ).FCH_RECLA_ORIGINAL;
  }


  /**  */
  public static void setFCH_RECLA_ORIGINAL  ( RallyApplication __app, Date value )
  {
    ( ( ACTUALIZAR_STATUS_COMPROMISO_ADL ) __app.getADL ( ACTUALIZAR_STATUS_COMPROMISO_ADL.class ) ).FCH_RECLA_ORIGINAL = value;
  }


  /**  */
  public static void setFCH_RECLA_ORIGINAL  ( RallyApplication __app, Object value )
  {
    ( ( ACTUALIZAR_STATUS_COMPROMISO_ADL ) __app.getADL ( ACTUALIZAR_STATUS_COMPROMISO_ADL.class ) ).FCH_RECLA_ORIGINAL = ( Date ) value;
  }



  /**  */
  public static DataStore getRECLA_RETRO_TABLE_DSD  ( RallyApplication __app )
  {
    return ( ( ACTUALIZAR_STATUS_COMPROMISO_ADL ) __app.getADL ( ACTUALIZAR_STATUS_COMPROMISO_ADL.class ) ).RECLA_RETRO_TABLE_DSD;
  }


  /**  */
  public static void setRECLA_RETRO_TABLE_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( ACTUALIZAR_STATUS_COMPROMISO_ADL ) __app.getADL ( ACTUALIZAR_STATUS_COMPROMISO_ADL.class ) ).RECLA_RETRO_TABLE_DSD = value;
  }


  /**  */
  public static void setRECLA_RETRO_TABLE_DSD  ( RallyApplication __app, Object value )
  {
    ( ( ACTUALIZAR_STATUS_COMPROMISO_ADL ) __app.getADL ( ACTUALIZAR_STATUS_COMPROMISO_ADL.class ) ).RECLA_RETRO_TABLE_DSD = ( DataStore ) value;
  }




  /**  */
  public static double getRECLA_ID  ( RallyApplication __app )
  {
    return ( ( ACTUALIZAR_STATUS_COMPROMISO_ADL ) __app.getADL ( ACTUALIZAR_STATUS_COMPROMISO_ADL.class ) ).RECLA_ID;
  }


  /**  */
  public static Double getRECLA_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( ACTUALIZAR_STATUS_COMPROMISO_ADL ) __app.getADL ( ACTUALIZAR_STATUS_COMPROMISO_ADL.class ) ).RECLA_ID );
  }


  /**  */
  public static void setRECLA_ID  ( RallyApplication __app, double value )
  {
    ( ( ACTUALIZAR_STATUS_COMPROMISO_ADL ) __app.getADL ( ACTUALIZAR_STATUS_COMPROMISO_ADL.class ) ).RECLA_ID = value;
  }


  /**  */
  public static void setRECLA_ID  ( RallyApplication __app, Object value )
  {
    ( ( ACTUALIZAR_STATUS_COMPROMISO_ADL ) __app.getADL ( ACTUALIZAR_STATUS_COMPROMISO_ADL.class ) ).RECLA_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getRECLA_STATUS  ( RallyApplication __app )
  {
    return ( ( ACTUALIZAR_STATUS_COMPROMISO_ADL ) __app.getADL ( ACTUALIZAR_STATUS_COMPROMISO_ADL.class ) ).RECLA_STATUS;
  }


  /**  */
  public static Double getRECLA_STATUSDouble ( RallyApplication __app )
  {
    return new Double ( ( ( ACTUALIZAR_STATUS_COMPROMISO_ADL ) __app.getADL ( ACTUALIZAR_STATUS_COMPROMISO_ADL.class ) ).RECLA_STATUS );
  }


  /**  */
  public static void setRECLA_STATUS  ( RallyApplication __app, double value )
  {
    ( ( ACTUALIZAR_STATUS_COMPROMISO_ADL ) __app.getADL ( ACTUALIZAR_STATUS_COMPROMISO_ADL.class ) ).RECLA_STATUS = value;
  }


  /**  */
  public static void setRECLA_STATUS  ( RallyApplication __app, Object value )
  {
    ( ( ACTUALIZAR_STATUS_COMPROMISO_ADL ) __app.getADL ( ACTUALIZAR_STATUS_COMPROMISO_ADL.class ) ).RECLA_STATUS = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getLAST_KEY  ( RallyApplication __app )
  {
    return ( ( ACTUALIZAR_STATUS_COMPROMISO_ADL ) __app.getADL ( ACTUALIZAR_STATUS_COMPROMISO_ADL.class ) ).LAST_KEY;
  }


  /**  */
  public static Double getLAST_KEYDouble ( RallyApplication __app )
  {
    return new Double ( ( ( ACTUALIZAR_STATUS_COMPROMISO_ADL ) __app.getADL ( ACTUALIZAR_STATUS_COMPROMISO_ADL.class ) ).LAST_KEY );
  }


  /**  */
  public static void setLAST_KEY  ( RallyApplication __app, double value )
  {
    ( ( ACTUALIZAR_STATUS_COMPROMISO_ADL ) __app.getADL ( ACTUALIZAR_STATUS_COMPROMISO_ADL.class ) ).LAST_KEY = value;
  }


  /**  */
  public static void setLAST_KEY  ( RallyApplication __app, Object value )
  {
    ( ( ACTUALIZAR_STATUS_COMPROMISO_ADL ) __app.getADL ( ACTUALIZAR_STATUS_COMPROMISO_ADL.class ) ).LAST_KEY = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static ACTUALIZAR_STATUS_COMPROMISO_ADL get ( RallyApplication __app )
  {
    ACTUALIZAR_STATUS_COMPROMISO_ADL adl = new ACTUALIZAR_STATUS_COMPROMISO_ADL ( );
    __app.register ( adl, "ACTUALIZAR_STATUS_COMPROMISO_ADL" );
    __app.setADL ( ACTUALIZAR_STATUS_COMPROMISO_ADL.class, adl ); 
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
    ACTUALIZAR_STATUS_COMPROMISO_ADL.get ( __app ).process ( ps );
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
    ACTUALIZAR_STATUS_COMPROMISO_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "ACTUALIZAR_STATUS_COMPROMISO_ADL" );
    if ( rObj != null && rObj instanceof ACTUALIZAR_STATUS_COMPROMISO_ADL )
    {
      this.app.setADL ( ACTUALIZAR_STATUS_COMPROMISO_ADL.class, ( ACTUALIZAR_STATUS_COMPROMISO_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "ACTUALIZAR_STATUS_COMPROMISO_ADL Step " + this.currentStep );
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
        Debug.println ( Debug.TRACE, "ACTUALIZAR_STATUS_COMPROMISO_ADL ended" );
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
    LAST_KEY = RallyAppCommandFactory.translate ( this.app.getLastCommandName ( ) );
    if ( Compare.equals ( LAST_KEY, RallyAppCommandFactory.EXITACTION ) ) 
    {
      this.app.callCommand ( "IGNORE" );
      this._condition1 = true;
    }
    else
    {
      this._condition1 = false;
    } 
  }

  
  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {

    this.app.FCH_FINAL_GBL = this.app.FECHA_IDENTIFICADO_GBL;
    if ( Compare.equals ( LAST_KEY, RallyAppCommandFactory.FPREV ) ) 
    {
      this.app.browseToField ( "COMPROMISO_PAGO_RECLA_FR", "METODO_PAGO" ); 
    }
    if ( Compare.gt ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getDoubleItem ( "VLR_BALANCE" ), 0 ) ) 
    {
      this._condition0 = true;
    }
    else
    {
      this._condition0 = false;
    }
    if ( this._condition0 )
    {
      if ( this._condition1 )
      {
        ACEPTA_COMPROMISO_MENU.exec ( this.app );
        return;
      }
    }

  }


  /**
   *
   */
  protected void step2 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( Compare.gt ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getDoubleItem ( "VLR_BALANCE" ), 0 ) ) 
    {
      if ( this._condition1 )    //      if ( Compare.equals ( LAST_KEY, RallyAppCommandFactory.EXITACTION ) ) 
      {
        if ( Compare.equals ( this.app.ANSWER_GBL, "Y" ) ) 
        {
          if ( ( Compare.equals ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getStringItem ( "SERVICIO_STATUS" ), "ACTIVO" ) ) || ( Compare.equals ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getStringItem ( "SERVICIO_STATUS" ), "ACCNEG" ) ) || ( Compare.equals ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getStringItem ( "SERVICIO_STATUS" ), "PENDREVI" ) )  || ( Compare.equals ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getStringItem ( "SERVICIO_STATUS" ), "JUNTAMED" ) ) || ( Compare.equals ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getStringItem ( "SERVICIO_STATUS" ), "PENDJMED" ) )) 
          {
            if ( Compare.equals ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getStringItem ( "METODO_PAGO" ), "PAGL" ) ) 
            {
              this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).setItem ( "STATUS", "PAGOGLOB"  );
            }
            if ( Compare.equals ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getStringItem ( "METODO_PAGO" ), "REDU" ) ) 
            {
              this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).setItem ( "STATUS", "REDUBENE"  );
            }
          }
          if ( ( Compare.equals ( RallyStringService.subString ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getStringItem ( "SERVICIO_STATUS" ), 0, 6 ), "CERRAD" ) ) || ( Compare.equals ( RallyStringService.subString ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getStringItem ( "SERVICIO_STATUS" ), 0, 6 ), "RECHAZ" ) ) ) 
          {
            if ( Compare.equals ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getStringItem ( "METODO_PAGO" ), "PAGL" ) ) 
            {
              this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).setItem ( "STATUS", "PAGOGLOB"  );
            }
            if ( Compare.equals ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getStringItem ( "METODO_PAGO" ), "PLPA" ) ) 
            {
              this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).setItem ( "STATUS", "PLANPAGO"  );
            }
          }
          RECLA_RETRO_TABLE_DSD = this.dm.create ( "RECLA_RETRO_TABLE_DSD" );
          RECLA_ID = RECLA_RETRO_TABLE_DSD.getId ( );
          RECLA_STATUS = RallyDataStoreException.getDefault ( );

          RECLA_STATUS  = this.dm.reset ( RECLA_ID );

          this.dm.setField ( this.dm.get ( "RECLA_RETRO_TABLE_DSD" ), "SEGURO_SOCIAL_JEFE_FAM", this.app.SS_JEFE_FAMILIA_GBL );
          this.dm.setField ( this.dm.get ( "RECLA_RETRO_TABLE_DSD" ), "SEGURO_SOCIAL_JEFE_SERV", this.app.SS_JEFE_SERVICIO_GBL );
          this.dm.setField ( this.dm.get ( "RECLA_RETRO_TABLE_DSD" ), "COD_SERVICIO", this.app.COD_SERV_GBL );
          this.dm.setField ( this.dm.get ( "RECLA_RETRO_TABLE_DSD" ), "RMO_OFICINA", this.app.RMO_GBL );

          RECLA_STATUS  = this.dm.limitQueryFromBuffer ( RECLA_ID );
          RECLA_STATUS  = this.dm.retrieve ( RECLA_ID );

          RECLA_STATUS  = this.dm.firstRow ( RECLA_ID );

          while ( Compare.equals ( RECLA_STATUS, 0 )  )
          {
            if ( ( ( Compare.equals ( this.dm.getFieldString ( this.dm.get ( "RECLA_RETRO_TABLE_DSD" ), "ACCION" ), "RECL" ) ) || ( Compare.equals ( this.dm.getFieldString ( this.dm.get ( "RECLA_RETRO_TABLE_DSD" ), "ACCION" ), "RREC" ) ) ) && ( ( Compare.equals ( this.dm.getFieldString ( this.dm.get ( "RECLA_RETRO_TABLE_DSD" ), "STATUS" ), "REDUBENE" ) ) || ( Compare.equals ( this.dm.getFieldString ( this.dm.get ( "RECLA_RETRO_TABLE_DSD" ), "STATUS" ), "PLANPAGO" ) ) || ( Compare.equals ( this.dm.getFieldString ( this.dm.get ( "RECLA_RETRO_TABLE_DSD" ), "STATUS" ), "PAGOGLOB" ) ) )  ) 
            {
              this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).setItem ( "STATUS", "PENDCOBR"  );
            }

            RECLA_STATUS  = this.dm.nextRow ( RECLA_ID );

          }
          RECLA_STATUS  = this.dm.dbClose ( RECLA_ID );

          this.app.METODO_PAGO_GBL = this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getStringItem ( "METODO_PAGO" );
          this.app.CLASI_RECLA_GBL = this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getStringItem ( "CLASIFICACION_RECLA" );
          this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).setItem ( "FECHA_STATUS", this.app.SYSTEM_DATE  );
          this.app.setError ( 0, 1020 );
        }
        if ( Compare.equals ( this.app.ANSWER_GBL, "N" ) ) 
        {
          if ( ( ! Compare.equals ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getStringItem ( "SERVICIO_STATUS" ), "ACTIVO" ) ) && ( ! Compare.equals ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getStringItem ( "SERVICIO_STATUS" ), "ACCNEG" ) )  && ( ! Compare.equals ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getStringItem ( "SERVICIO_STATUS" ), "JUNTAMED" ) ) && ( ! Compare.equals ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getStringItem ( "SERVICIO_STATUS" ), "PENDREVI" ) ) && ( ! Compare.equals ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getStringItem ( "SERVICIO_STATUS" ), "PENDJMED" ) ) ) 
          {
            this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).setItem ( "STATUS", "NOCOMPAG"  );
            this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).setItem ( "FECHA_STATUS", this.app.SYSTEM_DATE  );
          }
        }
      }
    }

  }

  
  /**
   *
   */
  protected void step3 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( Compare.gt ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getDoubleItem ( "VLR_BALANCE" ), 0 ) ) 
    {
      if ( this._condition1 )    //      if ( Compare.equals ( LAST_KEY, RallyAppCommandFactory.EXITACTION ) ) 
      {
        if ( Compare.equals ( this.app.ANSWER_GBL, "Y" ) ) 
        {
          this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).update ( );
          PRINT_COMPROMISO_PAGO_PKT.exec ( this.app );
        }
      }
    }   
  }

  
  /**
  *
  */
  protected void step4 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( Compare.gt ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ).getDoubleItem ( "VLR_BALANCE" ), 0 ) ) 
    {
      if ( this._condition1 )    //      if ( Compare.equals ( LAST_KEY, RallyAppCommandFactory.EXITACTION ) ) 
      {
        if ( Compare.equals ( this.app.ANSWER_GBL, "Y" ) ) 
        {
          this.app.requireRefresh = true;
          this.app.unregister ( this.app.form ( "COMPROMISO_PAGO_RECLA_FR" ) );          
        }
      }
    }   
  }
}



/* ---------------------------------------------------------------------


     
procedure actualizar_status_compromiso_adl;

var
        recla_id        : number(9,0);
        recla_status    : number(9,0);

        LAST_KEY        : NUMBER;
        FCH_RECLA_ORIGINAL : DATE;


begin
set_trace();
last_key := get_cmd();
fch_final_gbl := fecha_identificado_gbl;

if last_key = fprev
then
   set_current_field(COMPROMISO_PAGO_RECLA_FR.METODO_PAGO);
{endif}
if COMPROMISO_PAGO_RECLA_FR.VLR_BALANCE > 0 THEN
BEGIN
if last_key = exitaction
then
   begin
        call acepta_compromiso_menu;
        if answer_gbl = 'Y'
        then
        begin
        if (COMPROMISO_PAGO_RECLA_FR.SERVICIO_STATUS = 'ACTIVO') OR
           (COMPROMISO_PAGO_RECLA_FR.SERVICIO_STATUS = 'ACCNEG') OR
           (COMPROMISO_PAGO_RECLA_FR.SERVICIO_STATUS = 'PENDREVI') 
        then
           begin
                if COMPROMISO_PAGO_RECLA_FR.METODO_PAGO = 'PAGL'
                then
                   COMPROMISO_PAGO_RECLA_FR.STATUS := 'PAGOGLOB';
                {endif metodo_pago = 'PAGL'}

                if COMPROMISO_PAGO_RECLA_FR.METODO_PAGO = 'REDU'
                then
                   COMPROMISO_PAGO_RECLA_FR.STATUS := 'REDUBENE';
                {endif metodo_pago = 'REDU'}

           end;
        {endif compromiso_pago.servicio_status = 'ACTIVO'}

        if (substr(COMPROMISO_PAGO_RECLA_FR.SERVICIO_STATUS,0,6) = 'CERRAD')
         or (substr(COMPROMISO_PAGO_RECLA_FR.SERVICIO_STATUS,0,6) = 'RECHAZ')
        then
           begin
                if COMPROMISO_PAGO_RECLA_FR.METODO_PAGO = 'PAGL'
                then
                   COMPROMISO_PAGO_RECLA_FR.STATUS := 'PAGOGLOB';
                {endif metodo_pago = 'PAGL'}

                if COMPROMISO_PAGO_RECLA_FR.METODO_PAGO = 'PLPA'
                then
                   COMPROMISO_PAGO_RECLA_FR.STATUS := 'PLANPAGO';
                {endif metodo_pago = 'PLPA'}

           end;
        {endif compromiso_pago.servicio_status = 'CERRADO'}

           db_open(recla_retro_table_dsd,recla_id,recla_status);
           Db_reset(recla_id,recla_status);
           RECLA_RETRO_TABLE_DSD.SEGURO_SOCIAL_JEFE_FAM := SS_JEFE_FAMILIA_GBL;
           RECLA_RETRO_TABLE_DSD.SEGURO_SOCIAL_JEFE_SERV := SS_JEFE_SERVICIO_GBL
;
           RECLA_RETRO_TABLE_DSD.COD_SERVICIO := COD_SERV_GBL;
           RECLA_RETRO_TABLE_DSD.RMO_OFICINA:=rmo_gbl;
           DB_QUERY(RECLA_ID,RECLA_STATUS);
           DB_GET_FIRST(RECLA_ID,RECLA_STATUS);
           WHILE RECLA_STATUS = 0 DO
            BEGIN
            IF ((RECLA_RETRO_TABLE_DSD.ACCION = 'RECL') OR
             (RECLA_RETRO_TABLE_DSD.ACCION = 'RREC'))  AND
             ((RECLA_RETRO_TABLE_DSD.STATUS = 'REDUBENE') OR
             (RECLA_RETRO_TABLE_DSD.STATUS = 'PLANPAGO') OR
             (RECLA_RETRO_TABLE_DSD.STATUS = 'PAGOGLOB')) 
            THEN
                BEGIN
                   COMPROMISO_PAGO_RECLA_FR.STATUS := 'PENDCOBR';
                END;
             DB_GET_NEXT(RECLA_ID,RECLA_STATUS);
            END;
           DB_CLOSE(RECLA_ID,RECLA_STATUS);

        metodo_pago_gbl := COMPROMISO_PAGO_RECLA_FR.METODO_PAGO;
        clasi_recla_gbl := COMPROMISO_PAGO_RECLA_FR.CLASIFICACION_RECLA;
        COMPROMISO_PAGO_RECLA_FR.FECHA_STATUS := system_date;
        error(1020);
        end;
        {endif answer_gbl 'Y'}

        if answer_gbl = 'N'
        then
           begin
                if (COMPROMISO_PAGO_RECLA_FR.SERVICIO_STATUS <> 'ACTIVO') AND
                   (COMPROMISO_PAGO_RECLA_FR.SERVICIO_STATUS <> 'ACCNEG') AND
                   (COMPROMISO_PAGO_RECLA_FR.SERVICIO_STATUS <> 'PENDREVI') 
                then            
                        begin
                                COMPROMISO_PAGO_RECLA_FR.STATUS := 'NOCOMPAG';
                                COMPROMISO_PAGO_RECLA_FR.FECHA_STATUS := system_
date;
                        end;
           end;
        {endif answer_gbl = 'N'}

   end;
{endif last_key}
END;
set_notrace();
end;
    



--------------------------------------------------------------------- */
