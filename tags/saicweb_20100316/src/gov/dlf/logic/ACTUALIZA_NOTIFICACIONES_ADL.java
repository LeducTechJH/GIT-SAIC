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
public class ACTUALIZA_NOTIFICACIONES_ADL
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

  public double NOTIFICACIONES_TABLE = 0;

  public double NOTIFICACIONES_STATUS = 0;

  public double DESC_NOTIFIC_TABLE = 0;

  public double DESC_NOTIFIC_STATUS = 0;



  public String COD_NOTIFICACION = null;

  public String COD_REVISION = null;

  public DataStore NOTIFICACIONES_DSD = null;

  public DataStore NOTIFICACIONES_TBL_DSD = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setCOD_NOTIFICACION  ( RallyApplication __app, Parameter value )
  {
    ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).COD_NOTIFICACION = value.getString ( );
  }  

  
  /**  */
  public static void setCOD_REVISION  ( RallyApplication __app, Parameter value )
  {
    ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).COD_REVISION = value.getString ( );
  }  

  
  /**  */
  public static void setNOTIFICACIONES_TABLE  ( RallyApplication __app, Parameter value )
  {
    ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).NOTIFICACIONES_TABLE = value.getDouble ( );
  }  

  
  /**  */
  public static void setNOTIFICACIONES_STATUS  ( RallyApplication __app, Parameter value )
  {
    ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).NOTIFICACIONES_STATUS = value.getDouble ( );
  }  

  
  /**  */
  public static void setDESC_NOTIFIC_TABLE  ( RallyApplication __app, Parameter value )
  {
    ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).DESC_NOTIFIC_TABLE = value.getDouble ( );
  }  

  
  /**  */
  public static void setDESC_NOTIFIC_STATUS  ( RallyApplication __app, Parameter value )
  {
    ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).DESC_NOTIFIC_STATUS = value.getDouble ( );
  }  
    


  /**  */
  public static String getCOD_NOTIFICACION  ( RallyApplication __app )
  {
    return ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).COD_NOTIFICACION;
  }


  /**  */
  public static void setCOD_NOTIFICACION  ( RallyApplication __app, String value )
  {
    ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).COD_NOTIFICACION = value;
  }


  /**  */
  public static void setCOD_NOTIFICACION  ( RallyApplication __app, Object value )
  {
    ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).COD_NOTIFICACION = ( String ) value;
  }



  /**  */
  public static String getCOD_REVISION  ( RallyApplication __app )
  {
    return ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).COD_REVISION;
  }


  /**  */
  public static void setCOD_REVISION  ( RallyApplication __app, String value )
  {
    ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).COD_REVISION = value;
  }


  /**  */
  public static void setCOD_REVISION  ( RallyApplication __app, Object value )
  {
    ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).COD_REVISION = ( String ) value;
  }



  /**  */
  public static DataStore getNOTIFICACIONES_DSD  ( RallyApplication __app )
  {
    return ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).NOTIFICACIONES_DSD;
  }


  /**  */
  public static void setNOTIFICACIONES_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).NOTIFICACIONES_DSD = value;
  }


  /**  */
  public static void setNOTIFICACIONES_DSD  ( RallyApplication __app, Object value )
  {
    ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).NOTIFICACIONES_DSD = ( DataStore ) value;
  }



  /**  */
  public static DataStore getNOTIFICACIONES_TBL_DSD  ( RallyApplication __app )
  {
    return ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).NOTIFICACIONES_TBL_DSD;
  }


  /**  */
  public static void setNOTIFICACIONES_TBL_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).NOTIFICACIONES_TBL_DSD = value;
  }


  /**  */
  public static void setNOTIFICACIONES_TBL_DSD  ( RallyApplication __app, Object value )
  {
    ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).NOTIFICACIONES_TBL_DSD = ( DataStore ) value;
  }




  /**  */
  public static double getNOTIFICACIONES_TABLE  ( RallyApplication __app )
  {
    return ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).NOTIFICACIONES_TABLE;
  }


  /**  */
  public static Double getNOTIFICACIONES_TABLEDouble ( RallyApplication __app )
  {
    return new Double ( ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).NOTIFICACIONES_TABLE );
  }


  /**  */
  public static void setNOTIFICACIONES_TABLE  ( RallyApplication __app, double value )
  {
    ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).NOTIFICACIONES_TABLE = value;
  }


  /**  */
  public static void setNOTIFICACIONES_TABLE  ( RallyApplication __app, Object value )
  {
    ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).NOTIFICACIONES_TABLE = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getNOTIFICACIONES_STATUS  ( RallyApplication __app )
  {
    return ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).NOTIFICACIONES_STATUS;
  }


  /**  */
  public static Double getNOTIFICACIONES_STATUSDouble ( RallyApplication __app )
  {
    return new Double ( ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).NOTIFICACIONES_STATUS );
  }


  /**  */
  public static void setNOTIFICACIONES_STATUS  ( RallyApplication __app, double value )
  {
    ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).NOTIFICACIONES_STATUS = value;
  }


  /**  */
  public static void setNOTIFICACIONES_STATUS  ( RallyApplication __app, Object value )
  {
    ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).NOTIFICACIONES_STATUS = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getDESC_NOTIFIC_TABLE  ( RallyApplication __app )
  {
    return ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).DESC_NOTIFIC_TABLE;
  }


  /**  */
  public static Double getDESC_NOTIFIC_TABLEDouble ( RallyApplication __app )
  {
    return new Double ( ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).DESC_NOTIFIC_TABLE );
  }


  /**  */
  public static void setDESC_NOTIFIC_TABLE  ( RallyApplication __app, double value )
  {
    ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).DESC_NOTIFIC_TABLE = value;
  }


  /**  */
  public static void setDESC_NOTIFIC_TABLE  ( RallyApplication __app, Object value )
  {
    ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).DESC_NOTIFIC_TABLE = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getDESC_NOTIFIC_STATUS  ( RallyApplication __app )
  {
    return ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).DESC_NOTIFIC_STATUS;
  }


  /**  */
  public static Double getDESC_NOTIFIC_STATUSDouble ( RallyApplication __app )
  {
    return new Double ( ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).DESC_NOTIFIC_STATUS );
  }


  /**  */
  public static void setDESC_NOTIFIC_STATUS  ( RallyApplication __app, double value )
  {
    ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).DESC_NOTIFIC_STATUS = value;
  }


  /**  */
  public static void setDESC_NOTIFIC_STATUS  ( RallyApplication __app, Object value )
  {
    ( ( ACTUALIZA_NOTIFICACIONES_ADL ) __app.getADL ( ACTUALIZA_NOTIFICACIONES_ADL.class ) ).DESC_NOTIFIC_STATUS = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static ACTUALIZA_NOTIFICACIONES_ADL get ( RallyApplication __app )
  {
    ACTUALIZA_NOTIFICACIONES_ADL adl = new ACTUALIZA_NOTIFICACIONES_ADL ( );
    __app.register ( adl, "ACTUALIZA_NOTIFICACIONES_ADL" );
    __app.setADL ( ACTUALIZA_NOTIFICACIONES_ADL.class, adl ); 
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
    ACTUALIZA_NOTIFICACIONES_ADL.get ( __app ).process ( ps );
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
    ACTUALIZA_NOTIFICACIONES_ADL.exec ( __app, ps );
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
   * Populating the parameter set object with return values
   */
  protected void returnParms ( ParameterSet ps, String COD_NOTIFICACION, String COD_REVISION )
  {
    ps.reset ( );
    ps.set ( COD_NOTIFICACION );
    ps.set ( COD_REVISION );
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
    IRegisteredObject rObj = this.app.get ( "ACTUALIZA_NOTIFICACIONES_ADL" );
    if ( rObj != null && rObj instanceof ACTUALIZA_NOTIFICACIONES_ADL )
    {
      this.app.setADL ( ACTUALIZA_NOTIFICACIONES_ADL.class, ( ACTUALIZA_NOTIFICACIONES_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "ACTUALIZA_NOTIFICACIONES_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "ACTUALIZA_NOTIFICACIONES_ADL ended" );
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
    ps.reset ( );
    COD_NOTIFICACION = ps.getString( );
    COD_REVISION = ps.getString( );
    
    NOTIFICACIONES_TBL_DSD = this.dm.create ( "NOTIFICACIONES_TBL_DSD" );
    DESC_NOTIFIC_TABLE = NOTIFICACIONES_TBL_DSD.getId ( );
    DESC_NOTIFIC_STATUS = RallyDataStoreException.getDefault ( );

    DESC_NOTIFIC_STATUS  = this.dm.reset ( DESC_NOTIFIC_TABLE );

    this.dm.setField ( this.dm.get ( "NOTIFICACIONES_TBL_DSD" ), "COD_NOTIFICACION", COD_NOTIFICACION );

    DESC_NOTIFIC_STATUS  = this.dm.limitQueryFromBuffer ( DESC_NOTIFIC_TABLE );
    DESC_NOTIFIC_STATUS  = this.dm.retrieve ( DESC_NOTIFIC_TABLE );

    DESC_NOTIFIC_STATUS  = this.dm.firstRow ( DESC_NOTIFIC_TABLE );

    if ( Compare.equals ( DESC_NOTIFIC_STATUS, 0 ) ) 
    {
      COD_REVISION = this.dm.getFieldString ( this.dm.get ( "NOTIFICACIONES_TBL_DSD" ), "COD_REVISION" );
    }
    else
    {
      COD_REVISION = "**********";
    }
    
    ACTUALIZA_NOTIFICACIONES_CHECK_ADL anca = new ACTUALIZA_NOTIFICACIONES_CHECK_ADL ( );
    boolean notificactionExist = anca.checkNotificacionesExist 
               ( this.app,
                 this.app.SS_JEFE_FAMILIA_GBL,
                 this.app.SS_JEFE_SERVICIO_GBL,
                 this.app.COD_SERVICIO_GBL,
                 this.app.RMO_GBL, 
                 COD_NOTIFICACION, 
                 this.app.SYSTEM_DATE );

    if ( notificactionExist ) 
    {
      this.returnParms ( ps, COD_NOTIFICACION, COD_REVISION );
      this.doReturn ( );
      return;
    }

    NOTIFICACIONES_DSD = this.dm.create ( "NOTIFICACIONES_DSD" );
    NOTIFICACIONES_TABLE = NOTIFICACIONES_DSD.getId ( );
    NOTIFICACIONES_STATUS = RallyDataStoreException.getDefault ( );

    this.dm.setField ( this.dm.get ( "NOTIFICACIONES_DSD" ), "SEGURO_SOCIAL_JEFE_FAM", this.app.SS_JEFE_FAMILIA_GBL );
    this.dm.setField ( this.dm.get ( "NOTIFICACIONES_DSD" ), "SEGURO_SOCIAL_JEFE_SERV", this.app.SS_JEFE_SERVICIO_GBL );
    this.dm.setField ( this.dm.get ( "NOTIFICACIONES_DSD" ), "COD_SERVICIO", this.app.COD_SERVICIO_GBL );
    this.dm.setField ( this.dm.get ( "NOTIFICACIONES_DSD" ), "FCH_NOTIFICACION", this.app.SYSTEM_DATE );
    this.dm.setField ( this.dm.get ( "NOTIFICACIONES_DSD" ), "COD_NOTIFICACION", COD_NOTIFICACION );
    this.dm.setField ( this.dm.get ( "NOTIFICACIONES_DSD" ), "COD_REVISION", COD_REVISION );
    this.dm.setField ( this.dm.get ( "NOTIFICACIONES_DSD" ), "RMO_OFICINA", this.app.RMO_GBL );

    NOTIFICACIONES_STATUS  = this.dm.insertRow ( NOTIFICACIONES_TABLE );

    if ( ! Compare.equals ( NOTIFICACIONES_STATUS, 0 ) ) 
    {
      this.returnParms ( ps, COD_NOTIFICACION, COD_REVISION );
      this.doReturn ( );
      return;
    }

    NOTIFICACIONES_STATUS  = this.dm.dbCommit ( );
    NOTIFICACIONES_STATUS  = this.dm.dbClose ( NOTIFICACIONES_TABLE );

    DESC_NOTIFIC_STATUS  = this.dm.dbClose ( DESC_NOTIFIC_TABLE );

    this.returnParms ( ps, COD_NOTIFICACION, COD_REVISION );
  }
}



/* ---------------------------------------------------------------------


     
procedure actualiza_notificaciones_adl( var     cod_notificacion: char(4);
                                        var     cod_revision:     char(10););

var     notificaciones_table: number(9,0);
        notificaciones_status:number(9,0);
        desc_notific_table:   number(9,0);
        desc_notific_status:  number(9,0);

begin
cod_revision:=cod_revision;
cod_notificacion:=cod_notificacion;

db_open(notificaciones_dsd,notificaciones_table,notificaciones_status);
        db_open(notificaciones_tbl_dsd,desc_notific_table,desc_notific_status);

{ Get Notification description and revision. }
db_reset(desc_notific_table,desc_notific_status);
        notificaciones_tbl_dsd.cod_notificacion:=cod_notificacion;
        db_query(desc_notific_table,desc_notific_status);
        db_get_first(desc_notific_table,desc_notific_status);
        if desc_notific_status = 0
        then    begin

                        cod_revision:= notificaciones_tbl_dsd.cod_revision;
                end;
        else
                        cod_revision:= '**********';
        {end-if}

{ Update notifcaciones table. }
notificaciones_dsd.seguro_social_jefe_fam:=ss_jefe_familia_gbl;
        notificaciones_dsd.seguro_social_jefe_serv:=ss_jefe_servicio_gbl;
        notificaciones_dsd.cod_servicio:=cod_servicio_gbl;
        notificaciones_dsd.fch_notificacion:=system_date;
        notificaciones_dsd.cod_notificacion:=cod_notificacion;
        notificaciones_dsd.cod_revision:=cod_revision;
        NOTIFICACIONES_DSD.RMO_OFICINA := RMO_GBL;
        db_insert(notificaciones_table,notificaciones_status);
        if notificaciones_status <> 0
        then
                return;
        {end-if}
db_commit(notificaciones_status);
        db_close(notificaciones_table,notificaciones_status);
        db_close(desc_notific_table,desc_notific_status);
end;
    



--------------------------------------------------------------------- */
