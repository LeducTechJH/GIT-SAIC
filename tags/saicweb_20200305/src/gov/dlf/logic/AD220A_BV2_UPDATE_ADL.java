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
public class AD220A_BV2_UPDATE_ADL
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

  public double ID = 0;

  public double CD = 0;



  public DataStore AD220A_BG2_DSD = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setID  ( RallyApplication __app, Parameter value )
  {
    ( ( AD220A_BV2_UPDATE_ADL ) __app.getADL ( AD220A_BV2_UPDATE_ADL.class ) ).ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setCD  ( RallyApplication __app, Parameter value )
  {
    ( ( AD220A_BV2_UPDATE_ADL ) __app.getADL ( AD220A_BV2_UPDATE_ADL.class ) ).CD = value.getDouble ( );
  }  
    


  /**  */
  public static DataStore getAD220A_BG2_DSD  ( RallyApplication __app )
  {
    return ( ( AD220A_BV2_UPDATE_ADL ) __app.getADL ( AD220A_BV2_UPDATE_ADL.class ) ).AD220A_BG2_DSD;
  }


  /**  */
  public static void setAD220A_BG2_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( AD220A_BV2_UPDATE_ADL ) __app.getADL ( AD220A_BV2_UPDATE_ADL.class ) ).AD220A_BG2_DSD = value;
  }


  /**  */
  public static void setAD220A_BG2_DSD  ( RallyApplication __app, Object value )
  {
    ( ( AD220A_BV2_UPDATE_ADL ) __app.getADL ( AD220A_BV2_UPDATE_ADL.class ) ).AD220A_BG2_DSD = ( DataStore ) value;
  }




  /**  */
  public static double getID  ( RallyApplication __app )
  {
    return ( ( AD220A_BV2_UPDATE_ADL ) __app.getADL ( AD220A_BV2_UPDATE_ADL.class ) ).ID;
  }


  /**  */
  public static Double getIDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( AD220A_BV2_UPDATE_ADL ) __app.getADL ( AD220A_BV2_UPDATE_ADL.class ) ).ID );
  }


  /**  */
  public static void setID  ( RallyApplication __app, double value )
  {
    ( ( AD220A_BV2_UPDATE_ADL ) __app.getADL ( AD220A_BV2_UPDATE_ADL.class ) ).ID = value;
  }


  /**  */
  public static void setID  ( RallyApplication __app, Object value )
  {
    ( ( AD220A_BV2_UPDATE_ADL ) __app.getADL ( AD220A_BV2_UPDATE_ADL.class ) ).ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getCD  ( RallyApplication __app )
  {
    return ( ( AD220A_BV2_UPDATE_ADL ) __app.getADL ( AD220A_BV2_UPDATE_ADL.class ) ).CD;
  }


  /**  */
  public static Double getCDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( AD220A_BV2_UPDATE_ADL ) __app.getADL ( AD220A_BV2_UPDATE_ADL.class ) ).CD );
  }


  /**  */
  public static void setCD  ( RallyApplication __app, double value )
  {
    ( ( AD220A_BV2_UPDATE_ADL ) __app.getADL ( AD220A_BV2_UPDATE_ADL.class ) ).CD = value;
  }


  /**  */
  public static void setCD  ( RallyApplication __app, Object value )
  {
    ( ( AD220A_BV2_UPDATE_ADL ) __app.getADL ( AD220A_BV2_UPDATE_ADL.class ) ).CD = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static AD220A_BV2_UPDATE_ADL get ( RallyApplication __app )
  {
    AD220A_BV2_UPDATE_ADL adl = new AD220A_BV2_UPDATE_ADL ( );
    __app.register ( adl, "AD220A_BV2_UPDATE_ADL" );
    __app.setADL ( AD220A_BV2_UPDATE_ADL.class, adl ); 
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
    AD220A_BV2_UPDATE_ADL.get ( __app ).process ( ps );
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
    AD220A_BV2_UPDATE_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "AD220A_BV2_UPDATE_ADL" );
    if ( rObj != null && rObj instanceof AD220A_BV2_UPDATE_ADL )
    {
      this.app.setADL ( AD220A_BV2_UPDATE_ADL.class, ( AD220A_BV2_UPDATE_ADL ) rObj );
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
    Debug.println ( Debug.TRACE, "AD220A_BV2_UPDATE_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "AD220A_BV2_UPDATE_ADL ended" );
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

    if ( Compare.equals ( this.app.CHEQ, "UP" ) ) 
    {
      AD220A_BG2_DSD = this.dm.create ( "AD220A_BG2_DSD" );
      ID = AD220A_BG2_DSD.getId ( );
      CD = RallyDataStoreException.getDefault ( );
      if ( ! Compare.equals ( CD, 0 ) ) 
      {
        this.app.setError ( 0, CD );
        this.app.errorFlag = false;
        this.doReturn ( );
        return; 
      }

      CD  = this.dm.reset ( ID );

      if ( ! Compare.equals ( CD, 0 ) ) 
      {
        this.app.setError ( 1, CD );
        this.doReturn ( );
        return; 
      }
      this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "SEGURO_SOCIAL_JEFE_FAM", this.app.form ( "AD220A_A3_FR" ).getDoubleItem ( "SSJF" ));
      this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "SEGURO_SOCIAL_JEFE_SERV", this.app.form ( "AD220A_A3_FR" ).getDoubleItem ( "SSJS" ));
      this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "COD_SERVICIO", this.app.form ( "AD220A_A3_FR" ).getStringItem ( "SERV" ));
      this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "FECHA_IDENTIFICADO", AD220A_A_STATUS_ADL.getFCID ( this.app ) );
      this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "FCH_PAGO", this.app.form ( "AD220A_A3_FR" ).getDateItem ( "FECH" ));
      this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "NUMERO_FACTURA", AD220A_A_STATUS_ADL.getNFACTURA ( this.app ) );
      //this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "RMO_OFICINA", this.app.RMO_GBL );

      CD  = this.dm.limitQueryFromBuffer ( ID );
      CD  = this.dm.retrieve ( ID );

      if ( ! Compare.equals ( CD, 0 ) ) 
      {
        this.app.setError ( 2, CD );
        this.doReturn ( );
        return; 
      }

      CD  = this.dm.firstRow ( ID );

      if ( ! Compare.equals ( CD, 0 ) ) 
      {
        this.app.setError ( 3, CD );
        this.app.errorFlag = false;
        this.doReturn ( );
        return; 
      }
      this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "PAGO_A_EFECTUAR", this.app.form ( "AD220A_A3_FR" ).getDoubleItem ( "CANT" ));
      this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "RECIBIDO_EN", this.app.form ( "AD220A_A3_FR" ).getStringItem ( "RECI" ));
      this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "OBSER_A", this.app.form ( "AD220A_A3_FR" ).getStringItem ( "OBSE" ));
      this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "TSS_A", this.app.form ( "AD220A_A3_FR" ).getDoubleItem ( "TSSA" ));

      CD  = this.dm.update ( ID );

      if ( ! Compare.equals ( CD, 0 ) ) 
      {
        this.app.setError ( 4, CD );
        this.app.errorFlag = false;
        this.doReturn ( );
        return; 
      }

      CD  = this.dm.dbCommit ( );
      if ( ! Compare.equals ( CD, 0 ) ) 
      {
        this.app.setError ( 5, CD );
        this.app.errorFlag = false;
        this.doReturn ( );
        return; 
      }
      CD  = this.dm.dbClose ( ID );

      if ( ! Compare.equals ( CD, 0 ) ) 
      {
        this.app.setError ( 6, CD );
        this.app.errorFlag = false;
        this.doReturn ( );
        return; 
      }
    }
    else if ( Compare.equals ( this.app.CHEQ, "IN" ) ) 
    {
      AD220A_BG2_DSD = this.dm.create ( "AD220A_BG2_DSD" );
      ID = AD220A_BG2_DSD.getId ( );
      CD = RallyDataStoreException.getDefault ( );
      if ( ! Compare.equals ( CD, 0 ) ) 
      {
        this.app.setError ( 7, CD );
        this.app.errorFlag = false;
        this.doReturn ( );
        return; 
      }

      CD  = this.dm.reset ( ID );

      if ( ! Compare.equals ( CD, 0 ) ) 
      {
        this.app.setError ( 8, CD );
        this.doReturn ( );
        return; 
      }
      this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "SEGURO_SOCIAL_JEFE_FAM", this.app.form ( "AD220A_A3_FR" ).getDoubleItem ( "SSJF" ));
      this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "SEGURO_SOCIAL_JEFE_SERV", this.app.form ( "AD220A_A3_FR" ).getDoubleItem ( "SSJS" ));
      this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "JEFE_RECLA", this.app.form ( "AD220A_A3_FR" ).getDoubleItem ( "SSJR" ));
      this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "COD_SERVICIO", this.app.form ( "AD220A_A3_FR" ).getStringItem ( "SERV" ));
      this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "FECHA_IDENTIFICADO", AD220A_A_STATUS_ADL.getFCID ( this.app ) );
      this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "FCH_PAGO", this.app.form ( "AD220A_A3_FR" ).getDateItem ( "FECH" ));
      this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "NUMERO_FACTURA", AD220A_A_STATUS_ADL.getNFACTURA ( this.app ) );
      //this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "RMO_OFICINA", this.app.RMO_GBL );

      CD  = this.dm.limitQueryFromBuffer ( ID );
      CD  = this.dm.retrieve ( ID );

      if ( ! Compare.equals ( CD, 0 ) ) 
      {
        this.app.setError ( 9, CD );
        this.doReturn ( );
        return; 
      }

      CD  = this.dm.firstRow ( ID );

      if ( Compare.equals ( CD, RallyDataStoreExceptionType.EOS ) ) 
      {
        this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "SEGURO_SOCIAL_JEFE_FAM", this.app.form ( "AD220A_A3_FR" ).getDoubleItem ( "SSJF" ));
        this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "SEGURO_SOCIAL_JEFE_SERV", this.app.form ( "AD220A_A3_FR" ).getDoubleItem ( "SSJS" ));
        this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "JEFE_RECLA", this.app.form ( "AD220A_A3_FR" ).getDoubleItem ( "SSJR" ));
        this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "COD_SERVICIO", this.app.form ( "AD220A_A3_FR" ).getStringItem ( "SERV" ));
        this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "FECHA_IDENTIFICADO", AD220A_A_STATUS_ADL.getFCID ( this.app ) );
        this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "FCH_PAGO", this.app.form ( "AD220A_A3_FR" ).getDateItem ( "FECH" ));
        this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "PAGO_A_EFECTUAR", this.app.form ( "AD220A_A3_FR" ).getDoubleItem ( "CANT" ));
        this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "RECIBIDO_EN", this.app.form ( "AD220A_A3_FR" ).getStringItem ( "RECI" ));
        this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "OBSER_A", this.app.form ( "AD220A_A3_FR" ).getStringItem ( "OBSE" ));
        this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "TSS_A", this.app.form ( "AD220A_A3_FR" ).getDoubleItem ( "TSSA" ));
        this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "NUMERO_FACTURA", AD220A_A_STATUS_ADL.getNFACTURA ( this.app ) );
        this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "RECAU_AUTO", "N" );
        //this.dm.setField ( this.dm.get ( "AD220A_BG2_DSD" ), "RMO_OFICINA", this.app.RMO_GBL );
      }

      boolean tempBool = this.dm.getLogEnabled ( );          
      this.dm.setLogEnabled ( false );
      
      CD  = this.dm.insertRow ( ID );

      this.dm.setLogEnabled ( tempBool );
      
      if ( ! Compare.equals ( CD, 0 ) ) 
      {
        this.app.setError ( 10, CD );
        this.doReturn ( );
        return; 
      }

      CD  = this.dm.dbCommit ( );
      if ( ! Compare.equals ( CD, 0 ) ) 
      {
        this.app.setError ( 11, CD );
        this.doReturn ( );
        return; 
      }
      CD  = this.dm.dbClose ( ID );

      if ( ! Compare.equals ( CD, 0 ) ) 
      {
        this.app.setError ( 12, CD );
        this.doReturn ( );
        return; 
      }
    }

  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE AD220A_BV2_UPDATE_ADL;

VAR     ID      :       NUMBER;
        CD      :       NUMBER;

SET_TRACE();

BEGIN
IF (CHEQ='UP') THEN
BEGIN
DB_OPEN(AD220A_BG2_DSD, ID, CD);
IF (CD<>0) THEN
        BEGIN
                ERROR(CD);
                SET_FAILURE();
                RETURN;
        END;

DB_RESET(ID,CD);
IF (CD<>0) THEN
        BEGIN
                ERROR(CD);
                RETURN;
        END;

AD220A_BG2_DSD.SEGURO_SOCIAL_JEFE_FAM   :=      AD220A_A3_FR.SSJF;
AD220A_BG2_DSD.SEGURO_SOCIAL_JEFE_SERV  :=      AD220A_A3_FR.SSJS;
{AD220A_BG2_DSD.JEFE_RECLA              :=      AD220A_A3_FR.SSJR;}
AD220A_BG2_DSD.COD_SERVICIO             :=      AD220A_A3_FR.SERV;
AD220A_BG2_DSD.FECHA_IDENTIFICADO       :=      AD220A_A_STATUS_ADL.FCID;
AD220A_BG2_DSD.FCH_PAGO                 :=      AD220A_A3_FR.FECH;
AD220A_BG2_DSD.NUMERO_FACTURA           :=      AD220A_A_STATUS_ADL.NFACTURA;
AD220A_BG2_DSD.RMO_OFICINA              :=      RMO_GBL;
DB_QUERY(ID,CD);
IF (CD <> 0)    THEN
        BEGIN
                ERROR(CD);
                RETURN;
        END;

DB_GET_FIRST(ID,CD);
IF (CD <> 0)    THEN
        BEGIN
                ERROR(CD);
                SET_FAILURE();
                RETURN;   
        END;

{UPDATE DATABASE RECORD}

AD220A_BG2_DSD.PAGO_A_EFECTUAR  :=      AD220A_A3_FR.CANT;
AD220A_BG2_DSD.RECIBIDO_EN      :=      AD220A_A3_FR.RECI;
AD220A_BG2_DSD.OBSER_A          :=      AD220A_A3_FR.OBSE;
AD220A_BG2_DSD.TSS_A            :=      AD220A_A3_FR.TSSA;

DB_UPDATE(ID,CD);
IF (CD <> 0)    THEN
        BEGIN
                ERROR(CD);
                SET_FAILURE();
                RETURN;
        END;

DB_COMMIT(CD);
IF (CD <> 0)    THEN
        BEGIN
                ERROR(CD);
                SET_FAILURE();
                RETURN;
        END;

DB_CLOSE(ID,CD);
IF (CD <> 0)    THEN
        BEGIN
                ERROR(CD);
                SET_FAILURE();
                RETURN;
        END;
END;
ELSE
IF (CHEQ='IN') THEN
BEGIN
DB_OPEN(AD220A_BG2_DSD, ID, CD);
IF (CD<>0) THEN
        BEGIN
                ERROR(CD);
                SET_FAILURE();
                RETURN;
        END;

DB_RESET(ID,CD);
IF (CD<>0) THEN
        BEGIN
                ERROR(CD);
                RETURN;
        END;

AD220A_BG2_DSD.SEGURO_SOCIAL_JEFE_FAM   :=      AD220A_A3_FR.SSJF;
AD220A_BG2_DSD.SEGURO_SOCIAL_JEFE_SERV  :=      AD220A_A3_FR.SSJS;
AD220A_BG2_DSD.JEFE_RECLA               :=      AD220A_A3_FR.SSJR;
AD220A_BG2_DSD.COD_SERVICIO             :=      AD220A_A3_FR.SERV;
AD220A_BG2_DSD.FECHA_IDENTIFICADO       :=      AD220A_A_STATUS_ADL.FCID;
AD220A_BG2_DSD.FCH_PAGO                 :=      AD220A_A3_FR.FECH;
AD220A_BG2_DSD.NUMERO_FACTURA           :=      AD220A_A_STATUS_ADL.NFACTURA;
AD220A_BG2_DSD.RMO_OFICINA              :=      RMO_GBL;
DB_QUERY(ID,CD);
IF (CD <> 0)    THEN
        BEGIN
                ERROR(CD);
                RETURN;
        END;

DB_GET_FIRST(ID,CD);
IF (CD = DB_EOS)        THEN
        BEGIN
AD220A_BG2_DSD.SEGURO_SOCIAL_JEFE_FAM   :=      AD220A_A3_FR.SSJF;
AD220A_BG2_DSD.SEGURO_SOCIAL_JEFE_SERV  :=      AD220A_A3_FR.SSJS;
AD220A_BG2_DSD.JEFE_RECLA               :=      AD220A_A3_FR.SSJR;
AD220A_BG2_DSD.COD_SERVICIO             :=      AD220A_A3_FR.SERV;
AD220A_BG2_DSD.FECHA_IDENTIFICADO       :=      AD220A_A_STATUS_ADL.FCID;
AD220A_BG2_DSD.FCH_PAGO                 :=      AD220A_A3_FR.FECH;
AD220A_BG2_DSD.PAGO_A_EFECTUAR          :=      AD220A_A3_FR.CANT;
AD220A_BG2_DSD.RECIBIDO_EN              :=      AD220A_A3_FR.RECI;
AD220A_BG2_DSD.OBSER_A                  :=      AD220A_A3_FR.OBSE;
AD220A_BG2_DSD.TSS_A                    :=      AD220A_A3_FR.TSSA;
AD220A_BG2_DSD.NUMERO_FACTURA           :=      AD220A_A_STATUS_ADL.NFACTURA;
AD220A_BG2_DSD.RECAU_AUTO               :=      'N';
AD220A_BG2_DSD.RMO_OFICINA              :=      RMO_GBL;
        END;

DB_INSERT(ID,CD);
IF (CD <> 0)    THEN
        BEGIN
                ERROR(CD);
                RETURN;
        END;

DB_COMMIT(CD);
IF (CD <> 0)    THEN
        BEGIN
                ERROR(CD);
                RETURN;
        END;

DB_CLOSE(ID,CD);
IF (CD <> 0)    THEN
        BEGIN
                ERROR(CD);
                RETURN;
        END;
END;
END;

SET_NOTRACE();
    



--------------------------------------------------------------------- */
