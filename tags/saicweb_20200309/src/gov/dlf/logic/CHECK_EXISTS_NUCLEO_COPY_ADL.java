package gov.dlf.logic;


import gov.dlf.facade.*;
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
public class CHECK_EXISTS_NUCLEO_COPY_ADL
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

  public double OPEN_ID = 0;

  public double STATUS_ID = 0;

  public double OPEN2_ID = 0;

  public double STATUS2_ID = 0;



  public DataStore NUCLEO_READ_LOC_DSD = null;

  public DataStore SERVICIOS2_DSD = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setOPEN_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( CHECK_EXISTS_NUCLEO_COPY_ADL ) __app.getADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class ) ).OPEN_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setSTATUS_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( CHECK_EXISTS_NUCLEO_COPY_ADL ) __app.getADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class ) ).STATUS_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setOPEN2_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( CHECK_EXISTS_NUCLEO_COPY_ADL ) __app.getADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class ) ).OPEN2_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setSTATUS2_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( CHECK_EXISTS_NUCLEO_COPY_ADL ) __app.getADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class ) ).STATUS2_ID = value.getDouble ( );
  }  
    


  /**  */
  public static DataStore getNUCLEO_READ_LOC_DSD  ( RallyApplication __app )
  {
    return ( ( CHECK_EXISTS_NUCLEO_COPY_ADL ) __app.getADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class ) ).NUCLEO_READ_LOC_DSD;
  }


  /**  */
  public static void setNUCLEO_READ_LOC_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( CHECK_EXISTS_NUCLEO_COPY_ADL ) __app.getADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class ) ).NUCLEO_READ_LOC_DSD = value;
  }


  /**  */
  public static void setNUCLEO_READ_LOC_DSD  ( RallyApplication __app, Object value )
  {
    ( ( CHECK_EXISTS_NUCLEO_COPY_ADL ) __app.getADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class ) ).NUCLEO_READ_LOC_DSD = ( DataStore ) value;
  }



  /**  */
  public static DataStore getSERVICIOS2_DSD  ( RallyApplication __app )
  {
    return ( ( CHECK_EXISTS_NUCLEO_COPY_ADL ) __app.getADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class ) ).SERVICIOS2_DSD;
  }


  /**  */
  public static void setSERVICIOS2_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( CHECK_EXISTS_NUCLEO_COPY_ADL ) __app.getADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class ) ).SERVICIOS2_DSD = value;
  }


  /**  */
  public static void setSERVICIOS2_DSD  ( RallyApplication __app, Object value )
  {
    ( ( CHECK_EXISTS_NUCLEO_COPY_ADL ) __app.getADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class ) ).SERVICIOS2_DSD = ( DataStore ) value;
  }




  /**  */
  public static double getOPEN_ID  ( RallyApplication __app )
  {
    return ( ( CHECK_EXISTS_NUCLEO_COPY_ADL ) __app.getADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class ) ).OPEN_ID;
  }


  /**  */
  public static Double getOPEN_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CHECK_EXISTS_NUCLEO_COPY_ADL ) __app.getADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class ) ).OPEN_ID );
  }


  /**  */
  public static void setOPEN_ID  ( RallyApplication __app, double value )
  {
    ( ( CHECK_EXISTS_NUCLEO_COPY_ADL ) __app.getADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class ) ).OPEN_ID = value;
  }


  /**  */
  public static void setOPEN_ID  ( RallyApplication __app, Object value )
  {
    ( ( CHECK_EXISTS_NUCLEO_COPY_ADL ) __app.getADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class ) ).OPEN_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSTATUS_ID  ( RallyApplication __app )
  {
    return ( ( CHECK_EXISTS_NUCLEO_COPY_ADL ) __app.getADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class ) ).STATUS_ID;
  }


  /**  */
  public static Double getSTATUS_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CHECK_EXISTS_NUCLEO_COPY_ADL ) __app.getADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class ) ).STATUS_ID );
  }


  /**  */
  public static void setSTATUS_ID  ( RallyApplication __app, double value )
  {
    ( ( CHECK_EXISTS_NUCLEO_COPY_ADL ) __app.getADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class ) ).STATUS_ID = value;
  }


  /**  */
  public static void setSTATUS_ID  ( RallyApplication __app, Object value )
  {
    ( ( CHECK_EXISTS_NUCLEO_COPY_ADL ) __app.getADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class ) ).STATUS_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getOPEN2_ID  ( RallyApplication __app )
  {
    return ( ( CHECK_EXISTS_NUCLEO_COPY_ADL ) __app.getADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class ) ).OPEN2_ID;
  }


  /**  */
  public static Double getOPEN2_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CHECK_EXISTS_NUCLEO_COPY_ADL ) __app.getADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class ) ).OPEN2_ID );
  }


  /**  */
  public static void setOPEN2_ID  ( RallyApplication __app, double value )
  {
    ( ( CHECK_EXISTS_NUCLEO_COPY_ADL ) __app.getADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class ) ).OPEN2_ID = value;
  }


  /**  */
  public static void setOPEN2_ID  ( RallyApplication __app, Object value )
  {
    ( ( CHECK_EXISTS_NUCLEO_COPY_ADL ) __app.getADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class ) ).OPEN2_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSTATUS2_ID  ( RallyApplication __app )
  {
    return ( ( CHECK_EXISTS_NUCLEO_COPY_ADL ) __app.getADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class ) ).STATUS2_ID;
  }


  /**  */
  public static Double getSTATUS2_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CHECK_EXISTS_NUCLEO_COPY_ADL ) __app.getADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class ) ).STATUS2_ID );
  }


  /**  */
  public static void setSTATUS2_ID  ( RallyApplication __app, double value )
  {
    ( ( CHECK_EXISTS_NUCLEO_COPY_ADL ) __app.getADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class ) ).STATUS2_ID = value;
  }


  /**  */
  public static void setSTATUS2_ID  ( RallyApplication __app, Object value )
  {
    ( ( CHECK_EXISTS_NUCLEO_COPY_ADL ) __app.getADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class ) ).STATUS2_ID = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static CHECK_EXISTS_NUCLEO_COPY_ADL get ( RallyApplication __app )
  {
    CHECK_EXISTS_NUCLEO_COPY_ADL adl = new CHECK_EXISTS_NUCLEO_COPY_ADL ( );
    __app.register ( adl, "CHECK_EXISTS_NUCLEO_COPY_ADL" );
    __app.setADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class, adl ); 
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
    CHECK_EXISTS_NUCLEO_COPY_ADL.get ( __app ).process ( ps );
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
    CHECK_EXISTS_NUCLEO_COPY_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "CHECK_EXISTS_NUCLEO_COPY_ADL" );
    if ( rObj != null && rObj instanceof CHECK_EXISTS_NUCLEO_COPY_ADL )
    {
      this.app.setADL ( CHECK_EXISTS_NUCLEO_COPY_ADL.class, ( CHECK_EXISTS_NUCLEO_COPY_ADL ) rObj );
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
    Debug.println ( Debug.TRACE, "CHECK_EXISTS_NUCLEO_COPY_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "CHECK_EXISTS_NUCLEO_COPY_ADL ended" );
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

    if ( Compare.equals ( RallyStringService.subString ( this.app.form ( "SERV_NUCLEO_SERV_FRM" ).getStringItem ( "COD_SERVICIO" ), 0, 2 ), "99" ) ) 
    {
      if ( ( Compare.equals ( this.app.form ( "SERV_NUCLEO_SERV_FRM" ).getStringItem ( "COD_PARENTESCO_RELACION_SERV" ), "BNPR" ) ) || ( Compare.equals ( this.app.form ( "SERV_NUCLEO_SERV_FRM" ).getStringItem ( "COD_PARENTESCO_RELACION_SERV" ), "BNSC" ) ) ) 
      {
        NUCLEO_READ_LOC_DSD = this.dm.create ( "NUCLEO_READ_LOC_DSD" );
        OPEN_ID = NUCLEO_READ_LOC_DSD.getId ( );
        STATUS_ID = RallyDataStoreException.getDefault ( );
        if ( ! Compare.equals ( STATUS_ID, 0 ) ) 
        {
          this.app.setError ( 0, STATUS_ID );
        }
        SERVICIOS2_DSD = this.dm.create ( "SERVICIOS2_DSD" );
        OPEN2_ID = SERVICIOS2_DSD.getId ( );
        STATUS2_ID = RallyDataStoreException.getDefault ( );
        if ( ! Compare.equals ( STATUS2_ID, 0 ) ) 
        {
          this.app.setError ( 1, STATUS_ID );
        }

        STATUS_ID  = this.dm.reset ( OPEN_ID );

        this.dm.setField ( this.dm.get ( "NUCLEO_READ_LOC_DSD" ), "SEGURO_SOCIAL_BENEFICIARIO", this.app.form ( "SERV_NUCLEO_SERV_FRM" ).getDoubleItem ( "SEGURO_SOCIAL_BENEFICIARIO" ));
        this.dm.setField ( this.dm.get ( "NUCLEO_READ_LOC_DSD" ), "RMO_OFICINA", this.app.RMO_GBL );
        this.dm.setField ( this.dm.get ( "NUCLEO_READ_LOC_DSD" ), "RMO_OFICINA2", this.app.RMO_GBL );

        STATUS_ID  = this.dm.limitQueryFromBuffer ( OPEN_ID );
        STATUS_ID  = this.dm.retrieve ( OPEN_ID );

        STATUS_ID  = this.dm.firstRow ( OPEN_ID );

        while ( ! Compare.equals ( STATUS_ID, RallyDataStoreExceptionType.EOS ) ) 
        {
          STATUS2_ID  = this.dm.reset ( OPEN2_ID );

          this.dm.setField ( this.dm.get ( "SERVICIOS2_DSD" ), "SEGURO_SOCIAL_JEFE_FAM", this.dm.getFieldDouble ( this.dm.get ( "NUCLEO_READ_LOC_DSD" ), "SEGURO_SOCIAL_JEFE_FAM" ) );
          this.dm.setField ( this.dm.get ( "SERVICIOS2_DSD" ), "SEGURO_SOCIAL_JEFE_SERV", this.dm.getFieldDouble ( this.dm.get ( "NUCLEO_READ_LOC_DSD" ), "SEGURO_SOCIAL_JEFE_SERV" ) );
          this.dm.setField ( this.dm.get ( "SERVICIOS2_DSD" ), "COD_SERVICIO", this.dm.getFieldString ( this.dm.get ( "NUCLEO_READ_LOC_DSD" ), "COD_SERVICIO" ) );
          this.dm.setField ( this.dm.get ( "SERVICIOS2_DSD" ), "RMO_OFICINA", this.app.RMO_GBL );

          STATUS2_ID  = this.dm.limitQueryFromBuffer ( OPEN2_ID );
          STATUS2_ID  = this.dm.retrieve ( OPEN2_ID );

          STATUS2_ID  = this.dm.firstRow ( OPEN2_ID );

          if ( ( Compare.equals ( STATUS_ID, 0 ) ) && ( ! Compare.equals ( this.dm.getFieldString ( this.dm.get ( "NUCLEO_READ_LOC_DSD" ), "COD_PARENTESCO_RELACION_SERV" ), "****" ) )  && ( Compare.equals ( RallyStringService.subString ( this.dm.getFieldString ( this.dm.get ( "NUCLEO_READ_LOC_DSD" ), "COD_SERVICIO" ), 0, 5 ), RallyStringService.subString ( this.app.form ( "SERV_NUCLEO_SERV_FRM" ).getStringItem ( "COD_SERVICIO" ), 0, 5 ) ) )  && ( ( Compare.equals ( this.dm.getFieldString ( this.dm.get ( "NUCLEO_READ_LOC_DSD" ), "COD_PARENTESCO_RELACION_SERV" ), "BNPR" ) ) || ( Compare.equals ( this.dm.getFieldString ( this.dm.get ( "NUCLEO_READ_LOC_DSD" ), "COD_PARENTESCO_RELACION_SERV" ), "BNSC" ) ) )  && ( ( Compare.equals ( this.dm.getFieldString ( this.dm.get ( "SERVICIOS2_DSD" ), "COD_STATUS_SERVICIO" ), "ACTIVO" ) ) || ( Compare.equals ( this.dm.getFieldString ( this.dm.get ( "SERVICIOS2_DSD" ), "COD_STATUS_SERVICIO" ), "PENDELEG" ) ) || ( Compare.equals ( this.dm.getFieldString ( this.dm.get ( "SERVICIOS2_DSD" ), "COD_STATUS_SERVICIO" ), "PENDREVI" ) ) || ( Compare.equals ( this.dm.getFieldString ( this.dm.get ( "SERVICIOS2_DSD" ), "COD_STATUS_SERVICIO" ), "PENDCERT" ) ) || ( Compare.equals ( this.dm.getFieldString ( this.dm.get ( "SERVICIOS2_DSD" ), "COD_STATUS_SERVICIO" ), "PENDAUTO" ) ) || ( Compare.equals ( this.dm.getFieldString ( this.dm.get ( "SERVICIOS2_DSD" ), "COD_STATUS_SERVICIO" ), "ACCNEG" ) ) )  ) 
          {
            this.app.NO_E5528_FLG_GBL = "F";
            this.app.errorFlag = false;
            this.app.setError ( 2, 2758 );
            STATUS_ID  = this.dm.dbClose ( OPEN_ID );

            STATUS2_ID  = this.dm.dbClose ( OPEN2_ID );

            this.doReturn ( );
            return; 
          }

          STATUS_ID  = this.dm.nextRow ( OPEN_ID );

        }
        STATUS_ID  = this.dm.dbClose ( OPEN_ID );

        STATUS2_ID  = this.dm.dbClose ( OPEN2_ID );

      }
    }

  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE CHECK_EXISTS_NUCLEO_copy_ADL;

VAR
 
OPEN_ID :NUMBER(9,0);
STATUS_ID:      NUMBER(9,0);
OPEN2_ID        :NUMBER(9,0);
STATUS2_ID:     NUMBER(9,0);


BEGIN
SET_TRACE();
{ DOC. ISP 23/9/03}
{ LL 6/10/06 se incluye este if para que no ejecute rutina ya
 que el indice unico se encarga de hacer validacion de duplicados en servicios}
IF ( SUBSTR(SERV_NUCLEO_SERV_FRM.COD_SERVICIO,0,2)='99')
THEN BEGIN
     DEBUG_LOG(SERV_NUCLEO_SERV_FRM.COD_PARENTESCO_RELACION_SERV);
     IF (SERV_NUCLEO_SERV_FRM.COD_PARENTESCO_RELACION_SERV = 'BNPR') OR
        (SERV_NUCLEO_SERV_FRM.COD_PARENTESCO_RELACION_SERV = 'BNSC') 
     THEN BEGIN
          DB_OPEN(NUCLEO_READ_LOC_DSD,OPEN_ID,STATUS_ID);
          IF STATUS_ID <> 0
             THEN BEGIN
                   ERROR(STATUS_ID);
                  END;
          DB_OPEN(SERVICIOS2_DSD,OPEN2_ID,STATUS2_ID);
          IF STATUS2_ID <> 0
             THEN BEGIN
                   ERROR(STATUS_ID);
                  END;
          DB_RESET(OPEN_ID,STATUS_ID);
          NUCLEO_READ_LOC_DSD.SEGURO_SOCIAL_BENEFICIARIO:=
                   SERV_NUCLEO_SERV_FRM.SEGURO_SOCIAL_BENEFICIARIO;
          NUCLEO_READ_LOC_DSD.RMO_OFICINA := RMO_GBL;
          NUCLEO_READ_LOC_DSD.RMO_OFICINA2 := RMO_GBL;
          DB_QUERY(OPEN_ID,STATUS_ID);
          DB_GET_FIRST(OPEN_ID,STATUS_ID);
          WHILE (STATUS_ID <> DB_EOS) DO
          BEGIN 
          DB_RESET(OPEN2_ID,STATUS2_ID);
          SERVICIOS2_DSD.SEGURO_SOCIAL_JEFE_FAM := NUCLEO_READ_LOC_DSD.SEGURO_SO
CIAL_JEFE_FAM;
          SERVICIOS2_DSD.SEGURO_SOCIAL_JEFE_SERV := NUCLEO_READ_LOC_DSD.SEGURO_S
OCIAL_JEFE_SERV;
          SERVICIOS2_DSD.COD_SERVICIO := NUCLEO_READ_LOC_DSD.COD_SERVICIO;
          SERVICIOS2_DSD.RMO_OFICINA := RMO_GBL;
          DB_QUERY(OPEN2_ID,STATUS2_ID);
          DB_GET_FIRST(OPEN2_ID,STATUS2_ID);
          IF (STATUS_ID=0) AND (NUCLEO_READ_LOC_DSD.COD_PARENTESCO_RELACION_SERV
<>'****')
           AND (SUBSTR(NUCLEO_READ_LOC_DSD.COD_SERVICIO,0,5) =
            SUBSTR(SERV_NUCLEO_SERV_FRM.COD_SERVICIO,0,5))  
            and ((NUCLEO_READ_LOC_DSD.COD_PARENTESCO_RELACION_SERV = 'BNPR') OR
                (NUCLEO_READ_LOC_DSD.COD_PARENTESCO_RELACION_SERV = 'BNSC'))
            AND ((SERVICIOS2_DSD.COD_STATUS_SERVICIO = 'ACTIVO') OR
                 (SERVICIOS2_DSD.COD_STATUS_SERVICIO = 'PENDELEG') OR
                 (SERVICIOS2_DSD.COD_STATUS_SERVICIO = 'PENDREVI') OR
                 (SERVICIOS2_DSD.COD_STATUS_SERVICIO = 'PENDCERT') OR
                 (SERVICIOS2_DSD.COD_STATUS_SERVICIO = 'PENDAUTO') OR
                 (SERVICIOS2_DSD.COD_STATUS_SERVICIO = 'ACCNEG'))
                                        
          THEN BEGIN
           NO_E5528_FLG_GBL:='F';
{   CALL_CMD('Delete record');}
           SET_FAILURE();
           ERROR(2758);
           DB_CLOSE(OPEN_ID,STATUS_ID);
           DB_CLOSE(OPEN2_ID,STATUS2_ID);
           RETURN;
         END;
       DB_GET_NEXT(OPEN_ID,STATUS_ID);
       END;
       DB_CLOSE(OPEN_ID,STATUS_ID);
       DB_CLOSE(OPEN2_ID,STATUS2_ID);
   END;
END;
SET_NOTRACE();
END;

    



--------------------------------------------------------------------- */
