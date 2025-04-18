package gov.dlf.logic;


import gov.dlf.facade.SAIC_DMQ_ORA_Application;

import net.maintrend.datamanager.DataStore;
import net.maintrend.interfaces.IRegisteredObject;
import net.maintrend.interlink.Parameter;
import net.maintrend.interlink.ParameterSet;
import net.maintrend.rallyengine.ADL;
import net.maintrend.rallyengine.RallyApplication;
import net.maintrend.rallyengine.RallyDataManager;
import net.maintrend.rallyengine.RallyDataStoreException;
import net.maintrend.util.Compare;
import net.maintrend.util.Debug;



/**
 * __Comment
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class UPDATE_SERV_DIRECCION_ADL
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

  public double OPEN_ID2 = 0;

  public double STATUS_ID2 = 0;

  public double EMERG_ID = 0;

  public double EMERG_CODE = 0;



  public DataStore DIRECCIONES_DSD = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setOPEN_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).OPEN_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setSTATUS_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).STATUS_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setOPEN_ID2  ( RallyApplication __app, Parameter value )
  {
    ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).OPEN_ID2 = value.getDouble ( );
  }  

  
  /**  */
  public static void setSTATUS_ID2  ( RallyApplication __app, Parameter value )
  {
    ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).STATUS_ID2 = value.getDouble ( );
  }  

  
  /**  */
  public static void setEMERG_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).EMERG_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setEMERG_CODE  ( RallyApplication __app, Parameter value )
  {
    ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).EMERG_CODE = value.getDouble ( );
  }  
    


  /**  */
  public static DataStore getDIRECCIONES_DSD  ( RallyApplication __app )
  {
    return ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).DIRECCIONES_DSD;
  }


  /**  */
  public static void setDIRECCIONES_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).DIRECCIONES_DSD = value;
  }


  /**  */
  public static void setDIRECCIONES_DSD  ( RallyApplication __app, Object value )
  {
    ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).DIRECCIONES_DSD = ( DataStore ) value;
  }




  /**  */
  public static double getOPEN_ID  ( RallyApplication __app )
  {
    return ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).OPEN_ID;
  }


  /**  */
  public static Double getOPEN_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).OPEN_ID );
  }


  /**  */
  public static void setOPEN_ID  ( RallyApplication __app, double value )
  {
    ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).OPEN_ID = value;
  }


  /**  */
  public static void setOPEN_ID  ( RallyApplication __app, Object value )
  {
    ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).OPEN_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSTATUS_ID  ( RallyApplication __app )
  {
    return ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).STATUS_ID;
  }


  /**  */
  public static Double getSTATUS_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).STATUS_ID );
  }


  /**  */
  public static void setSTATUS_ID  ( RallyApplication __app, double value )
  {
    ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).STATUS_ID = value;
  }


  /**  */
  public static void setSTATUS_ID  ( RallyApplication __app, Object value )
  {
    ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).STATUS_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getOPEN_ID2  ( RallyApplication __app )
  {
    return ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).OPEN_ID2;
  }


  /**  */
  public static Double getOPEN_ID2Double ( RallyApplication __app )
  {
    return new Double ( ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).OPEN_ID2 );
  }


  /**  */
  public static void setOPEN_ID2  ( RallyApplication __app, double value )
  {
    ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).OPEN_ID2 = value;
  }


  /**  */
  public static void setOPEN_ID2  ( RallyApplication __app, Object value )
  {
    ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).OPEN_ID2 = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSTATUS_ID2  ( RallyApplication __app )
  {
    return ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).STATUS_ID2;
  }


  /**  */
  public static Double getSTATUS_ID2Double ( RallyApplication __app )
  {
    return new Double ( ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).STATUS_ID2 );
  }


  /**  */
  public static void setSTATUS_ID2  ( RallyApplication __app, double value )
  {
    ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).STATUS_ID2 = value;
  }


  /**  */
  public static void setSTATUS_ID2  ( RallyApplication __app, Object value )
  {
    ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).STATUS_ID2 = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getEMERG_ID  ( RallyApplication __app )
  {
    return ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).EMERG_ID;
  }


  /**  */
  public static Double getEMERG_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).EMERG_ID );
  }


  /**  */
  public static void setEMERG_ID  ( RallyApplication __app, double value )
  {
    ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).EMERG_ID = value;
  }


  /**  */
  public static void setEMERG_ID  ( RallyApplication __app, Object value )
  {
    ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).EMERG_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getEMERG_CODE  ( RallyApplication __app )
  {
    return ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).EMERG_CODE;
  }


  /**  */
  public static Double getEMERG_CODEDouble ( RallyApplication __app )
  {
    return new Double ( ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).EMERG_CODE );
  }


  /**  */
  public static void setEMERG_CODE  ( RallyApplication __app, double value )
  {
    ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).EMERG_CODE = value;
  }


  /**  */
  public static void setEMERG_CODE  ( RallyApplication __app, Object value )
  {
    ( ( UPDATE_SERV_DIRECCION_ADL ) __app.getADL ( UPDATE_SERV_DIRECCION_ADL.class ) ).EMERG_CODE = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static UPDATE_SERV_DIRECCION_ADL get ( RallyApplication __app )
  {
    UPDATE_SERV_DIRECCION_ADL adl = new UPDATE_SERV_DIRECCION_ADL ( );
    __app.register ( adl, "UPDATE_SERV_DIRECCION_ADL" );
    __app.setADL ( UPDATE_SERV_DIRECCION_ADL.class, adl ); 
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
    UPDATE_SERV_DIRECCION_ADL.get ( __app ).process ( ps );
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
    UPDATE_SERV_DIRECCION_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "UPDATE_SERV_DIRECCION_ADL" );
    if ( rObj != null && rObj instanceof UPDATE_SERV_DIRECCION_ADL )
    {
      this.app.setADL ( UPDATE_SERV_DIRECCION_ADL.class, ( UPDATE_SERV_DIRECCION_ADL ) rObj );
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
    Debug.println ( Debug.TRACE, "UPDATE_SERV_DIRECCION_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "UPDATE_SERV_DIRECCION_ADL ended" );
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
    DIRECCIONES_DSD = this.dm.create ( "DIRECCIONES_DSD" );
    OPEN_ID = DIRECCIONES_DSD.getId ( );
    STATUS_ID = RallyDataStoreException.getDefault ( );
    if ( ! Compare.equals ( STATUS_ID, 0 ) ) 
    {
      this.app.setError ( 0, STATUS_ID );

      STATUS_ID  = this.dm.rollBack ( );
      this.doReturn ( );
      return; 
    }

    STATUS_ID  = this.dm.reset ( OPEN_ID );

    this.dm.setField ( this.dm.get ( "DIRECCIONES_DSD" ), "SEGURO_SOCIAL_JEFE_SERV", this.app.form ( "SERV_NUCLEO_SERV_FRM" ).getDoubleItem ( "SEGURO_SOCIAL_JEFE_SERV" ));
    this.dm.setField ( this.dm.get ( "DIRECCIONES_DSD" ), "COD_SERVICIO", this.app.form ( "SERV_NUCLEO_SERV_FRM" ).getStringItem ( "COD_SERVICIO" ));
    this.dm.setField ( this.dm.get ( "DIRECCIONES_DSD" ), "COD_TIPO_DIRECCION", "SERV" );

    STATUS_ID  = this.dm.limitQueryFromBuffer ( OPEN_ID );
    STATUS_ID  = this.dm.retrieve ( OPEN_ID );

    STATUS_ID  = this.dm.firstRow ( OPEN_ID );

    if ( ! Compare.equals ( STATUS_ID, 0 ) ) 
    {
      this.dm.setField ( this.dm.get ( "DIRECCIONES_DSD" ), "SEGURO_SOCIAL_JEFE_FAM", this.app.form ( "SERV_NUCLEO_SERV_FRM" ).getDoubleItem ( "SEGURO_SOCIAL_JEFE_FAM" ));
      this.dm.setField ( this.dm.get ( "DIRECCIONES_DSD" ), "SEGURO_SOCIAL_JEFE_SERV", this.app.form ( "SERV_NUCLEO_SERV_FRM" ).getDoubleItem ( "SEGURO_SOCIAL_JEFE_SERV" ));
      this.dm.setField ( this.dm.get ( "DIRECCIONES_DSD" ), "COD_SERVICIO", this.app.form ( "SERV_NUCLEO_SERV_FRM" ).getStringItem ( "COD_SERVICIO" ));
      this.dm.setField ( this.dm.get ( "DIRECCIONES_DSD" ), "COD_TIPO_DIRECCION", "SERV" );
      this.dm.setField ( this.dm.get ( "DIRECCIONES_DSD" ), "RMO_OFICINA", this.app.RMO_GBL );

      boolean tempBool = this.dm.getLogEnabled ( );          
      this.dm.setLogEnabled ( false );

      STATUS_ID  = this.dm.insertRow ( OPEN_ID );

      this.dm.setLogEnabled ( tempBool );

      if ( ! Compare.equals ( STATUS_ID, 0 ) ) 
      {
        this.app.setError ( 1, STATUS_ID );

        STATUS_ID  = this.dm.rollBack ( );
        this.doReturn ( );
        return; 
      }
      if ( Compare.equals ( STATUS_ID, 0 ) ) 
      {
        this.app.setError ( 2, 2756 );
      }

      STATUS_ID  = this.dm.dbCommit ( );
    }
    else
    {
      if ( !Compare.equals ( this.dm.getField ( this.dm.get ( "DIRECCIONES_DSD" ), "SEGURO_SOCIAL_JEFE_FAM" ), this.app.form ( "SERV_NUCLEO_SERV_FRM" ).getDoubleItem ( "SEGURO_SOCIAL_JEFE_FAM" ) ) || 
           !Compare.equals ( this.dm.getField ( this.dm.get ( "DIRECCIONES_DSD" ), "RMO_OFICINA" ), this.app.RMO_GBL ) )
      {
        this.dm.setField ( this.dm.get ( "DIRECCIONES_DSD" ), "SEGURO_SOCIAL_JEFE_FAM", this.app.form ( "SERV_NUCLEO_SERV_FRM" ).getDoubleItem ( "SEGURO_SOCIAL_JEFE_FAM" ));
        this.dm.setField ( this.dm.get ( "DIRECCIONES_DSD" ), "SEGURO_SOCIAL_JEFE_SERV", this.app.form ( "SERV_NUCLEO_SERV_FRM" ).getDoubleItem ( "SEGURO_SOCIAL_JEFE_SERV" ));
        this.dm.setField ( this.dm.get ( "DIRECCIONES_DSD" ), "COD_SERVICIO", this.app.form ( "SERV_NUCLEO_SERV_FRM" ).getStringItem ( "COD_SERVICIO" ));
        this.dm.setField ( this.dm.get ( "DIRECCIONES_DSD" ), "COD_TIPO_DIRECCION", "SERV" );
        this.dm.setField ( this.dm.get ( "DIRECCIONES_DSD" ), "RMO_OFICINA", this.app.RMO_GBL );

        boolean tempBool1 = this.dm.getLogEnabled ( );          
        this.dm.setLogEnabled ( false );
        
        STATUS_ID  = this.dm.update ( OPEN_ID );

        this.dm.setLogEnabled ( tempBool1 );
        
        if ( ! Compare.equals ( STATUS_ID, 0 ) ) 
        {
          this.app.setError ( 3, STATUS_ID );

          STATUS_ID  = this.dm.rollBack ( );
          this.doReturn ( );
          return; 
        }

        STATUS_ID  = this.dm.dbCommit ( );
        if ( Compare.equals ( STATUS_ID, 0 ) ) 
        {
          this.app.setError ( 4, 2756 );
        }
      }
    }
    STATUS_ID  = this.dm.dbClose ( OPEN_ID );
  }
}



/* ---------------------------------------------------------------------


     

VAR

OPEN_ID:        NUMBER(9,0);
STATUS_ID:      NUMBER(9,0);
OPEN_ID2:       NUMBER(9,0);
STATUS_ID2:     NUMBER(9,0);
EMERG_ID:       NUMBER(9,0);
EMERG_CODE:     NUMBER(9,0);

BEGIN
SET_TRACE();

DB_OPEN(DIRECCIONES_DSD,OPEN_ID,STATUS_ID);
IF (STATUS_ID <> 0) THEN BEGIN
       ERROR(STATUS_ID);
       DB_ROLLBACK(STATUS_ID);
       RETURN;
       END;

DB_RESET(OPEN_ID,STATUS_ID);
DIRECCIONES_DSD.SEGURO_SOCIAL_JEFE_SERV:=
   SERV_NUCLEO_SERV_FRM.SEGURO_SOCIAL_JEFE_SERV;
DIRECCIONES_DSD.COD_SERVICIO:=
        SERV_NUCLEO_SERV_FRM.COD_SERVICIO;
DIRECCIONES_DSD.COD_TIPO_DIRECCION:='SERV';
DB_QUERY(OPEN_ID,STATUS_ID);
DB_GET_FIRST(OPEN_ID,STATUS_ID);
IF (STATUS_ID <> 0) 
THEN BEGIN
        DIRECCIONES_DSD.SEGURO_SOCIAL_JEFE_FAM :=
        SERV_NUCLEO_SERV_FRM.SEGURO_SOCIAL_JEFE_FAM;
        DIRECCIONES_DSD.SEGURO_SOCIAL_JEFE_SERV:=
        SERV_NUCLEO_SERV_FRM.SEGURO_SOCIAL_JEFE_SERV;
        DIRECCIONES_DSD.COD_SERVICIO:=
        SERV_NUCLEO_SERV_FRM.COD_SERVICIO;
        DIRECCIONES_DSD.COD_TIPO_DIRECCION:='SERV';
        DIRECCIONES_DSD.RMO_OFICINA := RMO_GBL;
        DB_INSERT(OPEN_ID,STATUS_ID);
        IF (STATUS_ID <> 0) THEN BEGIN
                ERROR(STATUS_ID);
                DB_ROLLBACK(STATUS_ID);
                RETURN;
                END;
if (status_id = 0) then
                        error(2756);
        DB_COMMIT(STATUS_ID);
END;
{***}
ELSE BEGIN
        DIRECCIONES_DSD.SEGURO_SOCIAL_JEFE_FAM :=
        SERV_NUCLEO_SERV_FRM.SEGURO_SOCIAL_JEFE_FAM;
        DIRECCIONES_DSD.SEGURO_SOCIAL_JEFE_SERV:=
         SERV_NUCLEO_SERV_FRM.SEGURO_SOCIAL_JEFE_SERV;
        DIRECCIONES_DSD.COD_SERVICIO:=
         SERV_NUCLEO_SERV_FRM.COD_SERVICIO;
        DIRECCIONES_DSD.COD_TIPO_DIRECCION:='SERV';
        DIRECCIONES_DSD.RMO_OFICINA := RMO_GBL;
        DB_UPDATE(OPEN_ID,STATUS_ID);
        IF (STATUS_ID <> 0) THEN BEGIN
                ERROR(STATUS_ID);
                DB_ROLLBACK(STATUS_ID);
                RETURN;
        END;
        DB_COMMIT(STATUS_ID);

if (status_id = 0) then
                        error(2756);
END;

DB_CLOSE(OPEN_ID,STATUS_ID);
SET_NOTRACE();
END;
    



--------------------------------------------------------------------- */
