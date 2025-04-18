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
public class LLENAR_REFERIDO_FRAUDE_ADL
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

  public double RECLA_ID = 0;

  public double RECLA_STATUS = 0;



  public DataStore RECLA_RETRO_TABLE_DSD = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setRECLA_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( LLENAR_REFERIDO_FRAUDE_ADL ) __app.getADL ( LLENAR_REFERIDO_FRAUDE_ADL.class ) ).RECLA_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setRECLA_STATUS  ( RallyApplication __app, Parameter value )
  {
    ( ( LLENAR_REFERIDO_FRAUDE_ADL ) __app.getADL ( LLENAR_REFERIDO_FRAUDE_ADL.class ) ).RECLA_STATUS = value.getDouble ( );
  }  
    


  /**  */
  public static DataStore getRECLA_RETRO_TABLE_DSD  ( RallyApplication __app )
  {
    return ( ( LLENAR_REFERIDO_FRAUDE_ADL ) __app.getADL ( LLENAR_REFERIDO_FRAUDE_ADL.class ) ).RECLA_RETRO_TABLE_DSD;
  }


  /**  */
  public static void setRECLA_RETRO_TABLE_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( LLENAR_REFERIDO_FRAUDE_ADL ) __app.getADL ( LLENAR_REFERIDO_FRAUDE_ADL.class ) ).RECLA_RETRO_TABLE_DSD = value;
  }


  /**  */
  public static void setRECLA_RETRO_TABLE_DSD  ( RallyApplication __app, Object value )
  {
    ( ( LLENAR_REFERIDO_FRAUDE_ADL ) __app.getADL ( LLENAR_REFERIDO_FRAUDE_ADL.class ) ).RECLA_RETRO_TABLE_DSD = ( DataStore ) value;
  }




  /**  */
  public static double getRECLA_ID  ( RallyApplication __app )
  {
    return ( ( LLENAR_REFERIDO_FRAUDE_ADL ) __app.getADL ( LLENAR_REFERIDO_FRAUDE_ADL.class ) ).RECLA_ID;
  }


  /**  */
  public static Double getRECLA_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( LLENAR_REFERIDO_FRAUDE_ADL ) __app.getADL ( LLENAR_REFERIDO_FRAUDE_ADL.class ) ).RECLA_ID );
  }


  /**  */
  public static void setRECLA_ID  ( RallyApplication __app, double value )
  {
    ( ( LLENAR_REFERIDO_FRAUDE_ADL ) __app.getADL ( LLENAR_REFERIDO_FRAUDE_ADL.class ) ).RECLA_ID = value;
  }


  /**  */
  public static void setRECLA_ID  ( RallyApplication __app, Object value )
  {
    ( ( LLENAR_REFERIDO_FRAUDE_ADL ) __app.getADL ( LLENAR_REFERIDO_FRAUDE_ADL.class ) ).RECLA_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getRECLA_STATUS  ( RallyApplication __app )
  {
    return ( ( LLENAR_REFERIDO_FRAUDE_ADL ) __app.getADL ( LLENAR_REFERIDO_FRAUDE_ADL.class ) ).RECLA_STATUS;
  }


  /**  */
  public static Double getRECLA_STATUSDouble ( RallyApplication __app )
  {
    return new Double ( ( ( LLENAR_REFERIDO_FRAUDE_ADL ) __app.getADL ( LLENAR_REFERIDO_FRAUDE_ADL.class ) ).RECLA_STATUS );
  }


  /**  */
  public static void setRECLA_STATUS  ( RallyApplication __app, double value )
  {
    ( ( LLENAR_REFERIDO_FRAUDE_ADL ) __app.getADL ( LLENAR_REFERIDO_FRAUDE_ADL.class ) ).RECLA_STATUS = value;
  }


  /**  */
  public static void setRECLA_STATUS  ( RallyApplication __app, Object value )
  {
    ( ( LLENAR_REFERIDO_FRAUDE_ADL ) __app.getADL ( LLENAR_REFERIDO_FRAUDE_ADL.class ) ).RECLA_STATUS = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static LLENAR_REFERIDO_FRAUDE_ADL get ( RallyApplication __app )
  {
    LLENAR_REFERIDO_FRAUDE_ADL adl = new LLENAR_REFERIDO_FRAUDE_ADL ( );
    __app.register ( adl, "LLENAR_REFERIDO_FRAUDE_ADL" );
    __app.setADL ( LLENAR_REFERIDO_FRAUDE_ADL.class, adl ); 
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
    LLENAR_REFERIDO_FRAUDE_ADL.get ( __app ).process ( ps );
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
    LLENAR_REFERIDO_FRAUDE_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "LLENAR_REFERIDO_FRAUDE_ADL" );
    if ( rObj != null && rObj instanceof LLENAR_REFERIDO_FRAUDE_ADL )
    {
      this.app.setADL ( LLENAR_REFERIDO_FRAUDE_ADL.class, ( LLENAR_REFERIDO_FRAUDE_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "LLENAR_REFERIDO_FRAUDE_ADL Step " + this.currentStep );
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
        Debug.println ( Debug.TRACE, "LLENAR_REFERIDO_FRAUDE_ADL ended" );
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

    RECLA_RETRO_TABLE_DSD = this.dm.create ( "RECLA_RETRO_TABLE_DSD" );
    RECLA_ID = RECLA_RETRO_TABLE_DSD.getId ( );
    RECLA_STATUS = RallyDataStoreException.getDefault ( );

    RECLA_STATUS  = this.dm.reset ( RECLA_ID );

    this.dm.setField ( this.dm.get ( "RECLA_RETRO_TABLE_DSD" ), "SEGURO_SOCIAL_JEFE_FAM", this.app.SS_JEFE_FAMILIA_GBL );
    this.dm.setField ( this.dm.get ( "RECLA_RETRO_TABLE_DSD" ), "SEGURO_SOCIAL_JEFE_SERV", this.app.SS_JEFE_SERVICIO_GBL );
    this.dm.setField ( this.dm.get ( "RECLA_RETRO_TABLE_DSD" ), "COD_SERVICIO", this.app.COD_SERV_GBL );
    this.dm.setField ( this.dm.get ( "RECLA_RETRO_TABLE_DSD" ), "FECHA_IDENTIFICADO", this.app.FECHA_IDENTIFICADO_GBL );
    this.dm.setField ( this.dm.get ( "RECLA_RETRO_TABLE_DSD" ), "RMO_OFICINA", this.app.RMO_GBL );

    RECLA_STATUS  = this.dm.limitQueryFromBuffer ( RECLA_ID );
    RECLA_STATUS  = this.dm.retrieve ( RECLA_ID );

    RECLA_STATUS  = this.dm.firstRow ( RECLA_ID );

    this.app.form ( "REFERIR_CASO_FRAUDE_RECLA_FR" ).setItem ( "SS_JEFE_FAMILIA", this.app.SS_JEFE_FAMILIA_GBL  );
    this.app.form ( "REFERIR_CASO_FRAUDE_RECLA_FR" ).setItem ( "SS_JEFE_SERVICIO", this.app.SS_JEFE_SERVICIO_GBL  );
    this.app.form ( "REFERIR_CASO_FRAUDE_RECLA_FR" ).setItem ( "CODIGO_SERVICIO", this.app.COD_SERV_GBL  );
    this.app.form ( "REFERIR_CASO_FRAUDE_RECLA_FR" ).setItem ( "SS_JEFE_RECLAMACION", this.dm.getFieldDouble ( this.dm.get ( "RECLA_RETRO_TABLE_DSD" ), "SS_DUENO" )  );
    this.app.form ( "REFERIR_CASO_FRAUDE_RECLA_FR" ).setItem ( "BALANCE_ORIGINAL", this.dm.getFieldDouble ( this.dm.get ( "RECLA_RETRO_TABLE_DSD" ), "CANTIDAD_RECLA_RETRO" )  );
    this.app.form ( "REFERIR_CASO_FRAUDE_RECLA_FR" ).setItem ( "BALANCE_ACTUAL", this.dm.getFieldDouble ( this.dm.get ( "RECLA_RETRO_TABLE_DSD" ), "VLR_BALANCE" )  );
    this.app.form ( "REFERIR_CASO_FRAUDE_RECLA_FR" ).setItem ( "NUM_FACTURA", this.dm.getFieldDouble ( this.dm.get ( "RECLA_RETRO_TABLE_DSD" ), "NUMERO_FACTURA" )  );
    RECLA_STATUS  = this.dm.dbClose ( RECLA_ID );

    this.app.form ( "REFERIR_CASO_FRAUDE_RECLA_FR" ).setItem ( "NUM_TECNICO", this.app.ID_TECNICO_GBL  );

    this.callParms.clear ( );
    this.callParms.set ( this.app.ID_TECNICO_GBL  );
    this.callParms.set ( this.app.form ( "REFERIR_CASO_FRAUDE_RECLA_FR" ).getStringItem ( "NOMBRE_TECNICO" ) );
    BUSCAR_NOMBRE_TECNICO_ADL.exec ( this.app, this.callParms );
    return;

  }


  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {
    this.callParms.reset ( );
    this.app.ID_TECNICO_GBL  = this.callParms.getDouble ( );
    this.app.form ( "REFERIR_CASO_FRAUDE_RECLA_FR" ).setItem ( "NOMBRE_TECNICO", this.callParms.getString ( ) );

    this.callParms.clear ( );
    this.callParms.set ( this.app.SS_JEFE_FAMILIA_GBL  );
    this.callParms.set ( this.app.form ( "REFERIR_CASO_FRAUDE_RECLA_FR" ).getStringItem ( "NOMBRE_JEFE_FAMILIA" ) );
    BUSCAR_NOMBRE_COMPLETO_ADL.exec ( this.app, this.callParms );
    return;

  }


  /**
   *
   */
  protected void step2 ( ParameterSet ps )
  {
    this.callParms.reset ( );
    this.app.SS_JEFE_FAMILIA_GBL  = this.callParms.getDouble ( );
    this.app.form ( "REFERIR_CASO_FRAUDE_RECLA_FR" ).setItem ( "NOMBRE_JEFE_FAMILIA", this.callParms.getString ( ) );

    this.callParms.clear ( );
    this.callParms.set ( this.app.SS_JEFE_SERVICIO_GBL  );
    this.callParms.set ( this.app.form ( "REFERIR_CASO_FRAUDE_RECLA_FR" ).getStringItem ( "NOMBRE_JEFE_SERVICIO" ) );
    BUSCAR_NOMBRE_COMPLETO_ADL.exec ( this.app, this.callParms );
    return;

  }


  /**
   *
   */
  protected void step3 ( ParameterSet ps )
  {
    this.callParms.reset ( );
    this.app.SS_JEFE_SERVICIO_GBL  = this.callParms.getDouble ( );
    this.app.form ( "REFERIR_CASO_FRAUDE_RECLA_FR" ).setItem ( "NOMBRE_JEFE_SERVICIO", this.callParms.getString ( ) );

    this.callParms.clear ( );
    this.callParms.set ( this.app.form ( "REFERIR_CASO_FRAUDE_RECLA_FR" ).getDoubleItem ( "SS_JEFE_RECLAMACION" ) );
    this.callParms.set ( this.app.form ( "REFERIR_CASO_FRAUDE_RECLA_FR" ).getStringItem ( "NOMBRE_JEFE_RECLAMACION" ) );
    BUSCAR_NOMBRE_COMPLETO_ADL.exec ( this.app, this.callParms );
    return;

  }


  /**
   *
   */
  protected void step4 ( ParameterSet ps )
  {
    this.callParms.reset ( );
    this.app.form ( "REFERIR_CASO_FRAUDE_RECLA_FR" ).setItem ( "SS_JEFE_RECLAMACION", this.callParms.getDouble ( ) );
    this.app.form ( "REFERIR_CASO_FRAUDE_RECLA_FR" ).setItem ( "NOMBRE_JEFE_RECLAMACION", this.callParms.getString ( ) );

  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE LLENAR_REFERIDO_FRAUDE_ADL;
VAR
        RECLA_ID        : NUMBER(9,0);
        RECLA_STATUS    : NUMBER(9,0);

BEGIN
SET_TRACE();
DB_OPEN(RECLA_RETRO_TABLE_DSD,RECLA_ID,RECLA_STATUS);
DB_RESET(RECLA_ID,RECLA_STATUS);

RECLA_RETRO_TABLE_DSD.SEGURO_SOCIAL_JEFE_FAM := SS_JEFE_FAMILIA_GBL;
RECLA_RETRO_TABLE_DSD.SEGURO_SOCIAL_JEFE_SERV := SS_JEFE_SERVICIO_GBL;
RECLA_RETRO_TABLE_DSD.COD_SERVICIO := COD_SERV_GBL;
RECLA_RETRO_TABLE_DSD.FECHA_IDENTIFICADO := FECHA_IDENTIFICADO_GBL;
RECLA_RETRO_TABLE_DSD.RMO_OFICINA := RMO_GBL;
DB_QUERY(RECLA_ID,RECLA_STATUS);
DB_GET_FIRST(RECLA_ID,RECLA_STATUS);

REFERIR_CASO_FRAUDE_RECLA_FR.SS_JEFE_FAMILIA := SS_JEFE_FAMILIA_GBL;
REFERIR_CASO_FRAUDE_RECLA_FR.SS_JEFE_SERVICIO := SS_JEFE_SERVICIO_GBL;
REFERIR_CASO_FRAUDE_RECLA_FR.CODIGO_SERVICIO := COD_SERV_GBL;
REFERIR_CASO_FRAUDE_RECLA_FR.SS_JEFE_RECLAMACION := RECLA_RETRO_TABLE_DSD.SS_DUE
NO;
REFERIR_CASO_FRAUDE_RECLA_FR.BALANCE_ORIGINAL := RECLA_RETRO_TABLE_DSD.CANTIDAD_
RECLA_RETRO;
REFERIR_CASO_FRAUDE_RECLA_FR.BALANCE_ACTUAL := RECLA_RETRO_TABLE_DSD.VLR_BALANCE
;
REFERIR_CASO_FRAUDE_RECLA_FR.NUM_FACTURA := RECLA_RETRO_TABLE_DSD.NUMERO_FACTURA
;

DB_CLOSE(RECLA_ID,RECLA_STATUS);
REFERIR_CASO_FRAUDE_RECLA_FR.NUM_TECNICO := ID_TECNICO_GBL;

CALL BUSCAR_NOMBRE_TECNICO_ADL(ID_TECNICO_GBL,REFERIR_CASO_FRAUDE_RECLA_FR.NOMBR
E_TECNICO);

CALL BUSCAR_NOMBRE_COMPLETO_ADL(SS_JEFE_FAMILIA_GBL, REFERIR_CASO_FRAUDE_RECLA_F
R.NOMBRE_JEFE_FAMILIA);
CALL BUSCAR_NOMBRE_COMPLETO_ADL(SS_JEFE_SERVICIO_GBL,REFERIR_CASO_FRAUDE_RECLA_F
R.NOMBRE_JEFE_SERVICIO);
CALL BUSCAR_NOMBRE_COMPLETO_ADL(REFERIR_CASO_FRAUDE_RECLA_FR.SS_JEFE_RECLAMACION
,REFERIR_CASO_FRAUDE_RECLA_FR.NOMBRE_JEFE_RECLAMACION);

SET_NOTRACE();
END;
    



--------------------------------------------------------------------- */
