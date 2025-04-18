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
public class FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL
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

  public double SERV_ID = 0;

  public double STAT_CODE = 0;



  public DataStore SERVICIO_PROVEEDORES_R_DSD = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setSERV_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL ) __app.getADL ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL.class ) ).SERV_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setSTAT_CODE  ( RallyApplication __app, Parameter value )
  {
    ( ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL ) __app.getADL ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL.class ) ).STAT_CODE = value.getDouble ( );
  }  
    


  /**  */
  public static DataStore getSERVICIO_PROVEEDORES_R_DSD  ( RallyApplication __app )
  {
    return ( ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL ) __app.getADL ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL.class ) ).SERVICIO_PROVEEDORES_R_DSD;
  }


  /**  */
  public static void setSERVICIO_PROVEEDORES_R_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL ) __app.getADL ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL.class ) ).SERVICIO_PROVEEDORES_R_DSD = value;
  }


  /**  */
  public static void setSERVICIO_PROVEEDORES_R_DSD  ( RallyApplication __app, Object value )
  {
    ( ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL ) __app.getADL ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL.class ) ).SERVICIO_PROVEEDORES_R_DSD = ( DataStore ) value;
  }




  /**  */
  public static double getSERV_ID  ( RallyApplication __app )
  {
    return ( ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL ) __app.getADL ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL.class ) ).SERV_ID;
  }


  /**  */
  public static Double getSERV_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL ) __app.getADL ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL.class ) ).SERV_ID );
  }


  /**  */
  public static void setSERV_ID  ( RallyApplication __app, double value )
  {
    ( ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL ) __app.getADL ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL.class ) ).SERV_ID = value;
  }


  /**  */
  public static void setSERV_ID  ( RallyApplication __app, Object value )
  {
    ( ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL ) __app.getADL ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL.class ) ).SERV_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSTAT_CODE  ( RallyApplication __app )
  {
    return ( ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL ) __app.getADL ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL.class ) ).STAT_CODE;
  }


  /**  */
  public static Double getSTAT_CODEDouble ( RallyApplication __app )
  {
    return new Double ( ( ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL ) __app.getADL ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL.class ) ).STAT_CODE );
  }


  /**  */
  public static void setSTAT_CODE  ( RallyApplication __app, double value )
  {
    ( ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL ) __app.getADL ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL.class ) ).STAT_CODE = value;
  }


  /**  */
  public static void setSTAT_CODE  ( RallyApplication __app, Object value )
  {
    ( ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL ) __app.getADL ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL.class ) ).STAT_CODE = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL get ( RallyApplication __app )
  {
    FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL adl = new FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL ( );
    __app.register ( adl, "FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL" );
    __app.setADL ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL.class, adl ); 
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
    FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL.get ( __app ).process ( ps );
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
    FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL" );
    if ( rObj != null && rObj instanceof FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL )
    {
      this.app.setADL ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL.class, ( FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL ended" );
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

    if ( Compare.equals ( this.app.MANT_ACCION_SERV_GBL, "IS" ) ) 
    {
      this.doReturn ( );
      return;
    }
    if ( ! Compare.equals ( RallyStringService.subString ( this.app.COD_SERV_GBL, 0, 2 ), "LI" ) && ! Compare.equals ( RallyStringService.subString ( this.app.COD_SERV_GBL, 0, 4 ), "CLIM" ) ) 
    {
      this.app.VLR_ANTERIOR_GBL = this.app.form ( "FECHAS_SERVICIO_FRM" ).getDoubleItem ( "VLR_BENEFICIOS" );
      SERVICIO_PROVEEDORES_R_DSD = this.dm.create ( "SERVICIO_PROVEEDORES_R_DSD" );
      SERV_ID = SERVICIO_PROVEEDORES_R_DSD.getId ( );
      STAT_CODE = RallyDataStoreException.getDefault ( );

      STAT_CODE  = this.dm.reset ( SERV_ID );

      this.dm.setField ( this.dm.get ( "SERVICIO_PROVEEDORES_R_DSD" ), "COD_SERVICIO", this.app.form ( "FECHAS_SERVICIO_FRM" ).getStringItem ( "COD_SERVICIO" ));
      this.dm.setField ( this.dm.get ( "SERVICIO_PROVEEDORES_R_DSD" ), "ID_PROVEEDOR", this.app.form ( "FECHAS_SERVICIO_FRM" ).getDoubleItem ( "ID_PROVEEDOR" ));

      STAT_CODE  = this.dm.limitQueryFromBuffer ( SERV_ID );
      STAT_CODE  = this.dm.retrieve ( SERV_ID );

      STAT_CODE  = this.dm.firstRow ( SERV_ID );

      this.app.VLR_BENEFICIO_MAX_GBL = MathService.plus ( this.dm.getFieldDouble ( this.dm.get ( "SERVICIO_PROVEEDORES_R_DSD" ), "UNIDADES_DISPONIBLES" ), this.app.form ( "FECHAS_SERVICIO_FRM" ).getDoubleItem ( "VLR_BENEFICIOS" ) );

      STAT_CODE  = this.dm.rollBack ( );
      STAT_CODE  = this.dm.dbClose ( SERV_ID );

    }

  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE FECHAS_SERV_VLR_BENEF_BEF_CHANGE_ADL;

VAR
        SERV_ID                 :       NUMBER;
        STAT_CODE               :       NUMBER;

BEGIN   
SET_TRACE();
IF MANT_ACCION_SERV_GBL='IS'
   THEN RETURN;
IF SUBSTR(COD_SERV_GBL,0,2) <> 'AT'
THEN BEGIN
        VLR_ANTERIOR_GBL := FECHAS_SERVICIO_FRM.VLR_BENEFICIOS;
        DB_OPEN (SERVICIO_PROVEEDORES_R_DSD, SERV_ID, STAT_CODE);
        DB_RESET (SERV_ID, STAT_CODE);
        SERVICIO_PROVEEDORES_R_DSD.COD_SERVICIO := FECHAS_SERVICIO_FRM.COD_SERVI
CIO;
        SERVICIO_PROVEEDORES_R_DSD.ID_PROVEEDOR := FECHAS_SERVICIO_FRM.ID_PROVEE
DOR;
        DB_QUERY (SERV_ID, STAT_CODE);
        DB_GET_FIRST (SERV_ID, STAT_CODE);
        VLR_BENEFICIO_MAX_GBL := SERVICIO_PROVEEDORES_R_DSD.UNIDADES_DISPONIBLES
 +
                        FECHAS_SERVICIO_FRM.VLR_BENEFICIOS;                     
    
        DB_ROLLBACK (STAT_CODE);
        DB_CLOSE (SERV_ID, STAT_CODE);
     END;
SET_NOTRACE();
END;
    



--------------------------------------------------------------------- */
