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
public class CERRAR_SERVICIO_ADL
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

  public double ANTECEDENTES_ID = 0;

  public double SERV_ID = 0;

  public double STAT_CODE = 0;

  public double STAT_CODE2 = 0;

  public double STAT_CODE3 = 0;

  public double NUCLEO_SERV_ID = 0;



  public DataStore ANTECENDES_CERRAR_SERVICIO_DSD = null;

  public DataStore NUCLEO_READ_LOC_DSD = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setANTECEDENTES_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).ANTECEDENTES_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setSERV_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).SERV_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setSTAT_CODE  ( RallyApplication __app, Parameter value )
  {
    ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).STAT_CODE = value.getDouble ( );
  }  

  
  /**  */
  public static void setSTAT_CODE2  ( RallyApplication __app, Parameter value )
  {
    ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).STAT_CODE2 = value.getDouble ( );
  }  

  
  /**  */
  public static void setSTAT_CODE3  ( RallyApplication __app, Parameter value )
  {
    ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).STAT_CODE3 = value.getDouble ( );
  }  

  
  /**  */
  public static void setNUCLEO_SERV_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).NUCLEO_SERV_ID = value.getDouble ( );
  }  
    


  /**  */
  public static DataStore getANTECENDES_CERRAR_SERVICIO_DSD  ( RallyApplication __app )
  {
    return ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).ANTECENDES_CERRAR_SERVICIO_DSD;
  }


  /**  */
  public static void setANTECENDES_CERRAR_SERVICIO_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).ANTECENDES_CERRAR_SERVICIO_DSD = value;
  }


  /**  */
  public static void setANTECENDES_CERRAR_SERVICIO_DSD  ( RallyApplication __app, Object value )
  {
    ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).ANTECENDES_CERRAR_SERVICIO_DSD = ( DataStore ) value;
  }



  /**  */
  public static DataStore getNUCLEO_READ_LOC_DSD  ( RallyApplication __app )
  {
    return ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).NUCLEO_READ_LOC_DSD;
  }


  /**  */
  public static void setNUCLEO_READ_LOC_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).NUCLEO_READ_LOC_DSD = value;
  }


  /**  */
  public static void setNUCLEO_READ_LOC_DSD  ( RallyApplication __app, Object value )
  {
    ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).NUCLEO_READ_LOC_DSD = ( DataStore ) value;
  }




  /**  */
  public static double getANTECEDENTES_ID  ( RallyApplication __app )
  {
    return ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).ANTECEDENTES_ID;
  }


  /**  */
  public static Double getANTECEDENTES_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).ANTECEDENTES_ID );
  }


  /**  */
  public static void setANTECEDENTES_ID  ( RallyApplication __app, double value )
  {
    ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).ANTECEDENTES_ID = value;
  }


  /**  */
  public static void setANTECEDENTES_ID  ( RallyApplication __app, Object value )
  {
    ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).ANTECEDENTES_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSERV_ID  ( RallyApplication __app )
  {
    return ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).SERV_ID;
  }


  /**  */
  public static Double getSERV_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).SERV_ID );
  }


  /**  */
  public static void setSERV_ID  ( RallyApplication __app, double value )
  {
    ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).SERV_ID = value;
  }


  /**  */
  public static void setSERV_ID  ( RallyApplication __app, Object value )
  {
    ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).SERV_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSTAT_CODE  ( RallyApplication __app )
  {
    return ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).STAT_CODE;
  }


  /**  */
  public static Double getSTAT_CODEDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).STAT_CODE );
  }


  /**  */
  public static void setSTAT_CODE  ( RallyApplication __app, double value )
  {
    ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).STAT_CODE = value;
  }


  /**  */
  public static void setSTAT_CODE  ( RallyApplication __app, Object value )
  {
    ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).STAT_CODE = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSTAT_CODE2  ( RallyApplication __app )
  {
    return ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).STAT_CODE2;
  }


  /**  */
  public static Double getSTAT_CODE2Double ( RallyApplication __app )
  {
    return new Double ( ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).STAT_CODE2 );
  }


  /**  */
  public static void setSTAT_CODE2  ( RallyApplication __app, double value )
  {
    ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).STAT_CODE2 = value;
  }


  /**  */
  public static void setSTAT_CODE2  ( RallyApplication __app, Object value )
  {
    ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).STAT_CODE2 = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSTAT_CODE3  ( RallyApplication __app )
  {
    return ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).STAT_CODE3;
  }


  /**  */
  public static Double getSTAT_CODE3Double ( RallyApplication __app )
  {
    return new Double ( ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).STAT_CODE3 );
  }


  /**  */
  public static void setSTAT_CODE3  ( RallyApplication __app, double value )
  {
    ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).STAT_CODE3 = value;
  }


  /**  */
  public static void setSTAT_CODE3  ( RallyApplication __app, Object value )
  {
    ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).STAT_CODE3 = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getNUCLEO_SERV_ID  ( RallyApplication __app )
  {
    return ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).NUCLEO_SERV_ID;
  }


  /**  */
  public static Double getNUCLEO_SERV_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).NUCLEO_SERV_ID );
  }


  /**  */
  public static void setNUCLEO_SERV_ID  ( RallyApplication __app, double value )
  {
    ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).NUCLEO_SERV_ID = value;
  }


  /**  */
  public static void setNUCLEO_SERV_ID  ( RallyApplication __app, Object value )
  {
    ( ( CERRAR_SERVICIO_ADL ) __app.getADL ( CERRAR_SERVICIO_ADL.class ) ).NUCLEO_SERV_ID = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static CERRAR_SERVICIO_ADL get ( RallyApplication __app )
  {
    CERRAR_SERVICIO_ADL adl = new CERRAR_SERVICIO_ADL ( );
    __app.register ( adl, "CERRAR_SERVICIO_ADL" );
    __app.setADL ( CERRAR_SERVICIO_ADL.class, adl ); 
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
    CERRAR_SERVICIO_ADL.get ( __app ).process ( ps );
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
    CERRAR_SERVICIO_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "CERRAR_SERVICIO_ADL" );
    if ( rObj != null && rObj instanceof CERRAR_SERVICIO_ADL )
    {
      this.app.setADL ( CERRAR_SERVICIO_ADL.class, ( CERRAR_SERVICIO_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "CERRAR_SERVICIO_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
      case 2:  { this.currentStep ++; this.step2 ( this.keyParms ); break; }
      case 3:  { this.currentStep ++; this.step3 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "CERRAR_SERVICIO_ADL ended" );
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

    this.app.COD_ACCESS_GBL = "CSER";
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
    if ( Compare.equals ( this.app.RUTINA_GBL, "MC" ) ) 
    {
      MANTENIMIENTO_DE_CASOS_ADL.setCOMPLETION_STATUS ( this.app, "SUCCESS" );
    }
    else if ( Compare.equals ( this.app.RUTINA_GBL, "AC" )  )
    {
      APERTURA_DE_CASO_ADL.setCOMPLETION_STATUS ( this.app, "SUCCESS" );
    }
    this.app.MANT_ACCION_SERV_GBL = "CS";
    this.app.FLAG_UPD_GBL = "N";
    QFECHAS_SERVICIO_PKT.exec ( this.app );
    return;

  }


  /**
   *
   */
  protected void step2 ( ParameterSet ps )
  {
    if ( Compare.equals ( this.app.RUTINA_GBL, "MC" ) ) 
    {
      if ( Compare.equals ( MANTENIMIENTO_DE_CASOS_ADL.getCOMPLETION_STATUS ( this.app ), "FAILURE" ) ) 
      {
        this.doReturn ( );
        return;
      }
    }
    else
    {
      if ( Compare.equals ( this.app.RUTINA_GBL, "AC" ) ) 
      {
        if ( Compare.equals ( APERTURA_DE_CASO_ADL.getCOMPLETION_STATUS ( this.app ), "FAILURE" ) ) 
        {
          this.doReturn ( );
          return;
        }
      }
    }
    if ( Compare.equals ( this.app.FLAG_UPD_GBL, "S" ) ) 
    {
      this._condition0 = true;
    }
    else
    {
      this._condition0 = false;
    }
    if ( this._condition0 )
    {
      ANTECENDES_CERRAR_SERVICIO_DSD = this.dm.create ( "ANTECENDES_CERRAR_SERVICIO_DSD" );
      ANTECEDENTES_ID = ANTECENDES_CERRAR_SERVICIO_DSD.getId ( );
      STAT_CODE = RallyDataStoreException.getDefault ( );
      if ( ! Compare.equals ( STAT_CODE, 0 ) ) 
      {
        this.app.setError ( 1, STAT_CODE );

        STAT_CODE  = this.dm.rollBack ( );
        this.doReturn ( );
        return; 
      }
      NUCLEO_READ_LOC_DSD = this.dm.create ( "NUCLEO_READ_LOC_DSD" );
      NUCLEO_SERV_ID = NUCLEO_READ_LOC_DSD.getId ( );
      STAT_CODE3 = RallyDataStoreException.getDefault ( );
      if ( ! Compare.equals ( STAT_CODE3, 0 ) ) 
      {
        this.app.setError ( 2, STAT_CODE3 );

        STAT_CODE3  = this.dm.rollBack ( );
        this.doReturn ( );
        return; 
      }

      STAT_CODE3  = this.dm.reset ( NUCLEO_SERV_ID );

      this.dm.setField ( this.dm.get ( "NUCLEO_READ_LOC_DSD" ), "SEGURO_SOCIAL_JEFE_FAM", this.app.form ( "SERV_FAM_FRM" ).getDoubleItem ( "SEGURO_SOCIAL_JEFE_FAM" ));
      this.dm.setField ( this.dm.get ( "NUCLEO_READ_LOC_DSD" ), "SEGURO_SOCIAL_JEFE_SERV", this.app.form ( "SERV_FAM_FRM" ).getDoubleItem ( "SEGURO_SOCIAL_JEFE_SERV" ));
      this.dm.setField ( this.dm.get ( "NUCLEO_READ_LOC_DSD" ), "COD_SERVICIO", this.app.form ( "SERV_FAM_FRM" ).getStringItem ( "COD_SERVICIO" ));
      this.dm.setField ( this.dm.get ( "NUCLEO_READ_LOC_DSD" ), "RMO_OFICINA", this.app.RMO_GBL );
      this.dm.setField ( this.dm.get ( "NUCLEO_READ_LOC_DSD" ), "RMO_OFICINA2", this.app.RMO_GBL );

      STAT_CODE3  = this.dm.limitQueryFromBuffer ( NUCLEO_SERV_ID );
      STAT_CODE3  = this.dm.retrieve ( NUCLEO_SERV_ID );

      STAT_CODE3  = this.dm.firstRow ( NUCLEO_SERV_ID );

      while ( Compare.equals ( STAT_CODE3, 0 )  )
      {
        if ( ( Compare.equals ( this.dm.getFieldString ( this.dm.get ( "NUCLEO_READ_LOC_DSD" ), "COD_PARENTESCO_RELACION_SERV" ), "BNPR" ) ) || ( Compare.equals ( this.dm.getFieldString ( this.dm.get ( "NUCLEO_READ_LOC_DSD" ), "COD_PARENTESCO_RELACION_SERV" ), "BNSC" ) ) || ( Compare.equals ( this.dm.getFieldString ( this.dm.get ( "NUCLEO_READ_LOC_DSD" ), "COD_PARENTESCO_RELACION_SERV" ), "NA" ) ) || ( Compare.equals ( this.dm.getFieldString ( this.dm.get ( "NUCLEO_READ_LOC_DSD" ), "COD_PARENTESCO_RELACION_SERV" ), "NCAL" ) ) ) 
        {
          STAT_CODE  = this.dm.reset ( ANTECEDENTES_ID );

          if ( ! Compare.equals ( STAT_CODE, 0 ) ) 
          {
            this.app.setError ( 3, STAT_CODE );

            STAT_CODE  = this.dm.rollBack ( );
            this.doReturn ( );
            return; 
          }
          this.dm.setField ( this.dm.get ( "ANTECENDES_CERRAR_SERVICIO_DSD" ), "SEGURO_SOCIAL_CLIENTE", this.dm.getFieldDouble ( this.dm.get ( "NUCLEO_READ_LOC_DSD" ), "SEGURO_SOCIAL_BENEFICIARIO" ) );
          this.dm.setField ( this.dm.get ( "ANTECENDES_CERRAR_SERVICIO_DSD" ), "RMO_OFICINA", this.app.RMO_GBL );

          STAT_CODE  = this.dm.limitQueryFromBuffer ( ANTECEDENTES_ID );
          STAT_CODE  = this.dm.retrieve ( ANTECEDENTES_ID );

          if ( ! Compare.equals ( STAT_CODE, 0 ) ) 
          {
            this.app.setError ( 4, STAT_CODE );

            STAT_CODE  = this.dm.rollBack ( );
            this.doReturn ( );
            return; 
          }

          STAT_CODE  = this.dm.firstRow ( ANTECEDENTES_ID );

          if ( ! Compare.equals ( STAT_CODE, 0 ) ) 
          {
            this.app.setError ( 5, STAT_CODE );

            STAT_CODE  = this.dm.rollBack ( );
            this.doReturn ( );
            return; 
          }
          this.dm.setField ( this.dm.get ( "ANTECENDES_CERRAR_SERVICIO_DSD" ), "COD_ANTECEDENTES_PROGRAMA", this.app.form ( "SERV_FAM_FRM" ).getStringItem ( "COD_SERVICIO" ));
          this.dm.setField ( this.dm.get ( "ANTECENDES_CERRAR_SERVICIO_DSD" ), "ANTECEDE_PROGRAMA_NUM_CASO", this.app.form ( "SERV_FAM_FRM" ).getStringItem ( "COD_STATUS_SERVICIO" ));
          this.dm.setField ( this.dm.get ( "ANTECENDES_CERRAR_SERVICIO_DSD" ), "ANTECEDE_PROGRAMA_OFIC_LOCAL", this.app.RMO_GBL );
          this.dm.setField ( this.dm.get ( "ANTECENDES_CERRAR_SERVICIO_DSD" ), "ANTECEDE_FECHAS_CIERRE", this.app.SYSTEM_DATE );

          STAT_CODE  = this.dm.update ( ANTECEDENTES_ID );

          if ( ! Compare.equals ( STAT_CODE, 0 ) ) 
          {
            this.app.setError ( 6, STAT_CODE );

            STAT_CODE  = this.dm.rollBack ( );
            this.doReturn ( );
            return; 
          }
        }

        STAT_CODE3  = this.dm.nextRow ( NUCLEO_SERV_ID );

      }

      STAT_CODE  = this.dm.dbCommit ( );
      if ( ! Compare.equals ( STAT_CODE, 0 ) ) 
      {
        this.app.setError ( 7, STAT_CODE );

        STAT_CODE  = this.dm.rollBack ( );
        this.doReturn ( );
        return; 
      }
      STAT_CODE  = this.dm.dbClose ( ANTECEDENTES_ID );

      if ( ! Compare.equals ( STAT_CODE, 0 ) ) 
      {
        this.app.setError ( 8, STAT_CODE );

        STAT_CODE  = this.dm.rollBack ( );
        this.doReturn ( );
        return; 
      }

      this.callParms.clear ( );
      this.callParms.set ( this.app.SS_JEFE_GBL  );
      this.callParms.set ( this.app.SS_SERV_GBL  );
      this.callParms.set ( this.app.COD_SERV_GBL  );
      INFOR_BIO_NCAL_ADL.exec ( this.app, this.callParms );
      return;
    }

  }


  /**
   *
   */
  protected void step3 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( Compare.equals ( this.app.FLAG_UPD_GBL, "S" ) ) 
    {
      this.callParms.reset ( );
      this.app.SS_JEFE_GBL  = this.callParms.getDouble ( );
      this.app.SS_SERV_GBL  = this.callParms.getDouble ( );
      this.app.COD_SERV_GBL  = this.callParms.getString ( );

    }

  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE CERRAR_SERVICIO_ADL;

VAR
        antecedentes_id :       number;
        SERV_ID         :       NUMBER;
        STAT_CODE       :       NUMBER;
        STAT_CODE2      :       NUMBER;
        STAT_CODE3      :       NUMBER;
        NUCLEO_SERV_ID  :       NUMBER;

BEGIN
SET_TRACE();
cod_acceSs_gbl := 'CSER';
CALL SECURITY_ADL;
IF ACCESS_STATUS_GBL = 'FAILURE' 
   THEN BEGIN
        ERROR(1006);
        RETURN;
        END;

{IF   SERV_FAM_FRM.COD_STATUS_SERVICIO = 'CERRAD14' THEN
       BEGIN
                ERROR (4001);
                SET_FAILURE();
                RETURN;
        END;
}

  
{IF (SUBSTR(SERV_FAM_FRM.COD_STATUS_SERVICIO,0,4) <> 'SUSP') AND
   (SUBSTR(SERV_FAM_FRM.COD_STATUS_SERVICIO,0,4) <> 'ACTI') AND        
   (SUBSTR(SERV_FAM_FRM.COD_STATUS_SERVICIO,0,4) <> 'CERR') AND        
   (SUBSTR(SERV_FAM_FRM.COD_STATUS_SERVICIO,0,4) <> 'RECH')         
   THEN BEGIN
          ERROR(4001);
          RETURN;
        END;
}


IF RUTINA_GBL='MC'
   THEN MANTENIMIENTO_DE_CASOS_ADL.COMPLETION_STATUS:='SUCCESS';
   ELSE IF RUTINA_GBL='AC'
        THEN APERTURA_DE_CASO_ADL.COMPLETION_STATUS:='SUCCESS';

MANT_ACCION_SERV_GBL:='CS';
FLAG_UPD_GBL := 'N';
CALL QFECHAS_SERVICIO_PKT;


IF RUTINA_GBL='MC'
   THEN BEGIN
        IF MANTENIMIENTO_DE_CASOS_ADL.COMPLETION_STATUS='FAILURE'
        THEN RETURN;
        END;
   ELSE BEGIN
        IF RUTINA_GBL='AC'
        THEN IF APERTURA_DE_CASO_ADL.COMPLETION_STATUS='FAILURE'
             THEN RETURN;
        END;


{ Update Service status to next level }

        IF (FLAG_UPD_GBL = 'S') THEN
        BEGIN

{*******************************************************************************
*}
{ esta seccion actualizara la informacion de antecedentes en la tabla de cliente
s}
{*******************************************************************************
*}
{saic_db}

 
            
  
        DB_OPEN (ANTECENDES_CERRAR_SERVICIO_DSD,antecedentes_id, STAT_CODE);
        IF (STAT_CODE <> 0) THEN
        BEGIN
                ERROR (STAT_CODE);
                DB_ROLLBACK (STAT_CODE);
                RETURN;
        END;                                                          
        
        DB_OPEN(NUCLEO_READ_LOC_DSD,NUCLEO_SERV_ID,STAT_CODE3);
        IF (STAT_CODE3 <> 0) THEN
        BEGIN
                ERROR (STAT_CODE3);
                DB_ROLLBACK (STAT_CODE3);
                RETURN;
        END;

     
        DB_RESET(NUCLEO_SERV_ID,STAT_CODE3);
        NUCLEO_READ_LOC_DSD.SEGURO_SOCIAL_JEFE_FAM:=
         SERV_FAM_FRM.SEGURO_SOCIAL_JEFE_FAM;
        NUCLEO_READ_LOC_DSD.SEGURO_SOCIAL_JEFE_SERV:=
         SERV_FAM_FRM.SEGURO_SOCIAL_JEFE_SERV;
        NUCLEO_READ_LOC_DSD.COD_SERVICIO:=
         SERV_FAM_FRM.COD_SERVICIO;
        NUCLEO_READ_LOC_DSD.RMO_OFICINA := RMO_GBL;
        NUCLEO_READ_LOC_DSD.RMO_OFICINA2 := RMO_GBL;
        DB_QUERY(NUCLEO_SERV_ID,STAT_CODE3);
        DB_GET_FIRST(NUCLEO_SERV_ID,STAT_CODE3);

        WHILE STAT_CODE3 = 0 DO
        BEGIN
         IF (NUCLEO_READ_LOC_DSD.COD_PARENTESCO_RELACION_SERV='BNPR') OR
            (NUCLEO_READ_LOC_DSD.COD_PARENTESCO_RELACION_SERV='BNSC') OR
            (NUCLEO_READ_LOC_DSD.COD_PARENTESCO_RELACION_SERV='NA') OR
            (NUCLEO_READ_LOC_DSD.COD_PARENTESCO_RELACION_SERV='NCAL')
        THEN BEGIN       
        DB_RESET (antecedentes_id, STAT_CODE);
        IF (STAT_CODE <> 0) THEN
        BEGIN
                ERROR (STAT_CODE);
                DB_ROLLBACK (STAT_CODE);
                RETURN;
        END;
ANTECENDES_CERRAR_SERVICIO_DSD.SEGURO_SOCIAL_CLIENTE :=
        NUCLEO_READ_LOC_DSD.SEGURO_SOCIAL_BENEFICIARIO;        
ANTECENDES_CERRAR_SERVICIO_DSD.RMO_OFICINA := RMO_GBL;
         DB_QUERY (antecedentes_id, STAT_CODE);
        IF (STAT_CODE <> 0) THEN
        BEGIN
                ERROR (STAT_CODE);
                DB_ROLLBACK (STAT_CODE);
                RETURN;
        END;                                                          

        DB_GET_FIRST (antecedentes_id, STAT_CODE);
        IF (STAT_CODE <> 0) THEN
        BEGIN
                ERROR (STAT_CODE);
                DB_ROLLBACK (STAT_CODE);
                RETURN;
        END;        
    
{***informacion para actualizar los antecedentesen saic_db****}
                                                  
ANTECENDES_CERRAR_SERVICIO_DSD.COD_ANTECEDENTES_PROGRAMA :=
        SERV_FAM_FRM.COD_SERVICIO;       
ANTECENDES_CERRAR_SERVICIO_DSD.ANTECEDE_PROGRAMA_NUM_CASO :=
        SERV_FAM_FRM.COD_STATUS_SERVICIO;
ANTECENDES_CERRAR_SERVICIO_DSD.ANTECEDE_PROGRAMA_OFIC_LOCAL:=
        rmo_gbl;
 ANTECENDES_CERRAR_SERVICIO_DSD.ANTECEDE_FECHAS_CIERRE :=
        system_date;

        DB_UPDATE (antecedentes_id, STAT_CODE);
        IF (STAT_CODE <> 0) THEN
        BEGIN
                ERROR (STAT_CODE);
                DB_ROLLBACK (STAT_CODE);
                RETURN;
        END;
                                                          
{ Next end belongs to IF THEN BEGIN }
        END;
{ Next end belongs to DO WHILE }
        DB_GET_NEXT(NUCLEO_SERV_ID,STAT_CODE3);
        END;
{*****de vuelta a lo que aqui era antes***}


        DB_COMMIT (STAT_CODE);
        IF (STAT_CODE <> 0) THEN
        BEGIN
                ERROR (STAT_CODE);
                DB_ROLLBACK (STAT_CODE);
                RETURN;
        END;

        dB_CLOSE (antecedentes_id, STAT_CODE);
        IF (STAT_CODE <> 0) THEN
        BEGIN
                ERROR (STAT_CODE);
                DB_ROLLBACK (STAT_CODE);
                RETURN;
        END;

        call INFOR_BIO_NCAL_ADL(ss_jefe_gbl,ss_serv_gbl,cod_serv_gbl);
END;
SET_NOTRACE();
END;

    



--------------------------------------------------------------------- */
