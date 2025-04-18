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
public class AD220A_FECHA_PAGO_ADL
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

  public double MN = 0;

  public double CM = 0;



  public DataStore AD220A_BG2_RO_DSD = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setID  ( RallyApplication __app, Parameter value )
  {
    ( ( AD220A_FECHA_PAGO_ADL ) __app.getADL ( AD220A_FECHA_PAGO_ADL.class ) ).ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setCD  ( RallyApplication __app, Parameter value )
  {
    ( ( AD220A_FECHA_PAGO_ADL ) __app.getADL ( AD220A_FECHA_PAGO_ADL.class ) ).CD = value.getDouble ( );
  }  

  
  /**  */
  public static void setMN  ( RallyApplication __app, Parameter value )
  {
    ( ( AD220A_FECHA_PAGO_ADL ) __app.getADL ( AD220A_FECHA_PAGO_ADL.class ) ).MN = value.getDouble ( );
  }  

  
  /**  */
  public static void setCM  ( RallyApplication __app, Parameter value )
  {
    ( ( AD220A_FECHA_PAGO_ADL ) __app.getADL ( AD220A_FECHA_PAGO_ADL.class ) ).CM = value.getDouble ( );
  }  
    


  /**  */
  public static DataStore getAD220A_BG2_RO_DSD  ( RallyApplication __app )
  {
    return ( ( AD220A_FECHA_PAGO_ADL ) __app.getADL ( AD220A_FECHA_PAGO_ADL.class ) ).AD220A_BG2_RO_DSD;
  }


  /**  */
  public static void setAD220A_BG2_RO_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( AD220A_FECHA_PAGO_ADL ) __app.getADL ( AD220A_FECHA_PAGO_ADL.class ) ).AD220A_BG2_RO_DSD = value;
  }


  /**  */
  public static void setAD220A_BG2_RO_DSD  ( RallyApplication __app, Object value )
  {
    ( ( AD220A_FECHA_PAGO_ADL ) __app.getADL ( AD220A_FECHA_PAGO_ADL.class ) ).AD220A_BG2_RO_DSD = ( DataStore ) value;
  }




  /**  */
  public static double getID  ( RallyApplication __app )
  {
    return ( ( AD220A_FECHA_PAGO_ADL ) __app.getADL ( AD220A_FECHA_PAGO_ADL.class ) ).ID;
  }


  /**  */
  public static Double getIDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( AD220A_FECHA_PAGO_ADL ) __app.getADL ( AD220A_FECHA_PAGO_ADL.class ) ).ID );
  }


  /**  */
  public static void setID  ( RallyApplication __app, double value )
  {
    ( ( AD220A_FECHA_PAGO_ADL ) __app.getADL ( AD220A_FECHA_PAGO_ADL.class ) ).ID = value;
  }


  /**  */
  public static void setID  ( RallyApplication __app, Object value )
  {
    ( ( AD220A_FECHA_PAGO_ADL ) __app.getADL ( AD220A_FECHA_PAGO_ADL.class ) ).ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getCD  ( RallyApplication __app )
  {
    return ( ( AD220A_FECHA_PAGO_ADL ) __app.getADL ( AD220A_FECHA_PAGO_ADL.class ) ).CD;
  }


  /**  */
  public static Double getCDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( AD220A_FECHA_PAGO_ADL ) __app.getADL ( AD220A_FECHA_PAGO_ADL.class ) ).CD );
  }


  /**  */
  public static void setCD  ( RallyApplication __app, double value )
  {
    ( ( AD220A_FECHA_PAGO_ADL ) __app.getADL ( AD220A_FECHA_PAGO_ADL.class ) ).CD = value;
  }


  /**  */
  public static void setCD  ( RallyApplication __app, Object value )
  {
    ( ( AD220A_FECHA_PAGO_ADL ) __app.getADL ( AD220A_FECHA_PAGO_ADL.class ) ).CD = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getMN  ( RallyApplication __app )
  {
    return ( ( AD220A_FECHA_PAGO_ADL ) __app.getADL ( AD220A_FECHA_PAGO_ADL.class ) ).MN;
  }


  /**  */
  public static Double getMNDouble ( RallyApplication __app )
  {
    return new Double ( ( ( AD220A_FECHA_PAGO_ADL ) __app.getADL ( AD220A_FECHA_PAGO_ADL.class ) ).MN );
  }


  /**  */
  public static void setMN  ( RallyApplication __app, double value )
  {
    ( ( AD220A_FECHA_PAGO_ADL ) __app.getADL ( AD220A_FECHA_PAGO_ADL.class ) ).MN = value;
  }


  /**  */
  public static void setMN  ( RallyApplication __app, Object value )
  {
    ( ( AD220A_FECHA_PAGO_ADL ) __app.getADL ( AD220A_FECHA_PAGO_ADL.class ) ).MN = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getCM  ( RallyApplication __app )
  {
    return ( ( AD220A_FECHA_PAGO_ADL ) __app.getADL ( AD220A_FECHA_PAGO_ADL.class ) ).CM;
  }


  /**  */
  public static Double getCMDouble ( RallyApplication __app )
  {
    return new Double ( ( ( AD220A_FECHA_PAGO_ADL ) __app.getADL ( AD220A_FECHA_PAGO_ADL.class ) ).CM );
  }


  /**  */
  public static void setCM  ( RallyApplication __app, double value )
  {
    ( ( AD220A_FECHA_PAGO_ADL ) __app.getADL ( AD220A_FECHA_PAGO_ADL.class ) ).CM = value;
  }


  /**  */
  public static void setCM  ( RallyApplication __app, Object value )
  {
    ( ( AD220A_FECHA_PAGO_ADL ) __app.getADL ( AD220A_FECHA_PAGO_ADL.class ) ).CM = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static AD220A_FECHA_PAGO_ADL get ( RallyApplication __app )
  {
    AD220A_FECHA_PAGO_ADL adl = new AD220A_FECHA_PAGO_ADL ( );
    __app.register ( adl, "AD220A_FECHA_PAGO_ADL" );
    __app.setADL ( AD220A_FECHA_PAGO_ADL.class, adl ); 
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
    AD220A_FECHA_PAGO_ADL.get ( __app ).process ( ps );
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
    AD220A_FECHA_PAGO_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "AD220A_FECHA_PAGO_ADL" );
    if ( rObj != null && rObj instanceof AD220A_FECHA_PAGO_ADL )
    {
      this.app.setADL ( AD220A_FECHA_PAGO_ADL.class, ( AD220A_FECHA_PAGO_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "AD220A_FECHA_PAGO_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "AD220A_FECHA_PAGO_ADL ended" );
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

    CM = RallyAppCommandFactory.translate ( this.app.getLastCommandName ( ) );
    if ( Compare.equals ( CM, RallyAppCommandFactory.FPREV ) ) 
    {
      this.doReturn ( );
      return;
    }
    MN = TruncService.setNull ( MN  );
    this.app.CHEQ = "";
    AD220A_BG2_RO_DSD = this.dm.create ( "AD220A_BG2_RO_DSD" );
    ID = AD220A_BG2_RO_DSD.getId ( );
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
    this.dm.setField ( this.dm.get ( "AD220A_BG2_RO_DSD" ), "SEGURO_SOCIAL_JEFE_FAM", this.app.form ( "AD220A_A3_FR" ).getDoubleItem ( "SSJF" ));
    this.dm.setField ( this.dm.get ( "AD220A_BG2_RO_DSD" ), "SEGURO_SOCIAL_JEFE_SERV", this.app.form ( "AD220A_A3_FR" ).getDoubleItem ( "SSJS" ));
    this.dm.setField ( this.dm.get ( "AD220A_BG2_RO_DSD" ), "COD_SERVICIO", this.app.form ( "AD220A_A3_FR" ).getStringItem ( "SERV" ));
    this.dm.setField ( this.dm.get ( "AD220A_BG2_RO_DSD" ), "FECHA_IDENTIFICADO", AD220A_A_STATUS_ADL.getFCID ( this.app ) );
    this.dm.setField ( this.dm.get ( "AD220A_BG2_RO_DSD" ), "FCH_PAGO", this.app.form ( "AD220A_A3_FR" ).getDateItem ( "FECH" ));
    this.dm.setField ( this.dm.get ( "AD220A_BG2_RO_DSD" ), "RMO_OFICINA", this.app.RMO_GBL );

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
      this.app.setError ( 3, 7200 );
      this.app.CHEQ = "IN";
      this.app.form ( "AD220A_A3_FR" ).setItem ( "CANT", MN  );
      this.app.form ( "AD220A_A3_FR" ).setItem ( "RECI", ""  );
      this.app.form ( "AD220A_A3_FR" ).setItem ( "OBSE", ""  );
      this.app.form ( "AD220A_A3_FR" ).setItem ( "TSSA", this.app.ID_TECNICO_GBL  );
      this.app.form ( "AD220A_A3_FR" ).setItem ( "TSSN", this.app.NOMB_TECN_GBL  );
      this.app.form ( "AD220A_A3_FR" ).setItem ( "AUTO", "N"  );
      this.app.browseToField ( "AD220A_A3_FR", "CANT" ); 
      this.doReturn ( );
      return; 
    }
    if ( ( Compare.equals ( this.dm.getFieldString ( this.dm.get ( "AD220A_BG2_RO_DSD" ), "RECIBIDO_EN" ), "CORR" ) ) || 
    		( Compare.equals ( this.dm.getFieldString ( this.dm.get ( "AD220A_BG2_RO_DSD" ), "RECIBIDO_EN" ), "OFLO" ) ) || 
    		( Compare.equals ( this.dm.getFieldString ( this.dm.get ( "AD220A_BG2_RO_DSD" ), "RECIBIDO_EN" ), "ADSE" ) )) 
    {
      if ( ! Compare.equals ( this.dm.getFieldString ( this.dm.get ( "AD220A_BG2_RO_DSD" ), "RECAU_AUTO" ), "S" ) ) 
      {
        this.app.CHEQ = "UP";
      }
      this.app.form ( "AD220A_A3_FR" ).setItem ( "FECH", this.dm.getFieldDate ( this.dm.get ( "AD220A_BG2_RO_DSD" ), "FCH_PAGO" )  );
      this.app.form ( "AD220A_A3_FR" ).setItem ( "CANT", this.dm.getFieldDouble ( this.dm.get ( "AD220A_BG2_RO_DSD" ), "PAGO_A_EFECTUAR" )  );
      this.app.form ( "AD220A_A3_FR" ).setItem ( "RECI", this.dm.getFieldString ( this.dm.get ( "AD220A_BG2_RO_DSD" ), "RECIBIDO_EN" )  );
      this.app.form ( "AD220A_A3_FR" ).setItem ( "OBSE", this.dm.getFieldString ( this.dm.get ( "AD220A_BG2_RO_DSD" ), "OBSER_A" )  );
      this.app.form ( "AD220A_A3_FR" ).setItem ( "TSSA", this.app.ID_TECNICO_GBL  );
      this.app.form ( "AD220A_A3_FR" ).setItem ( "TSSN", this.app.NOMB_TECN_GBL  );
      this.app.form ( "AD220A_A3_FR" ).setItem ( "AUTO", this.dm.getFieldString ( this.dm.get ( "AD220A_BG2_RO_DSD" ), "RECAU_AUTO" )  );
    }
    else
    {
      this.app.setError ( 4, 7290 );
      this.app.errorFlag = false;
      this.doReturn ( );
      return; 
    }
    if ( Compare.equals ( this.app.form ( "AD220A_A3_FR" ).getStringItem ( "AUTO" ), "S" ) ) 
    {
      this.app.browseToField ( "AD220A_A3_FR", "PARK" ); 
    }
    else
    {
      this.app.browseToField ( "AD220A_A3_FR", "CANT" ); 
    }
    CD  = this.dm.dbClose ( ID );

    if ( ! Compare.equals ( CD, 0 ) ) 
    {
      this.app.setError ( 5, CD );
      this.app.errorFlag = false;
      this.doReturn ( );
      return; 
    }

  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE AD220A_FECHA_PAGO_ADL;

VAR     ID      :       NUMBER;
        CD      :       NUMBER;
        MN      :       NUMBER;
        CM      :       NUMBER;

SET_TRACE();

CM := GET_CMD();

IF CM = FPREV
THEN
RETURN;

MAKE_NULL(MN);
CHEQ := '';

DB_OPEN(AD220A_BG2_RO_DSD, ID, CD);
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

AD220A_BG2_RO_DSD.SEGURO_SOCIAL_JEFE_FAM        :=      AD220A_A3_FR.SSJF;
AD220A_BG2_RO_DSD.SEGURO_SOCIAL_JEFE_SERV       :=      AD220A_A3_FR.SSJS;
AD220A_BG2_RO_DSD.COD_SERVICIO          :=      AD220A_A3_FR.SERV;
AD220A_BG2_RO_DSD.FECHA_IDENTIFICADO    :=      AD220A_A_STATUS_ADL.FCID;
AD220A_BG2_RO_DSD.FCH_PAGO                      :=      AD220A_A3_FR.FECH;
AD220A_BG2_RO_DSD.RMO_OFICINA           :=      RMO_GBL;
DB_QUERY(ID,CD);
IF (CD <> 0)    THEN
        BEGIN
                ERROR(CD);
                RETURN;
        END;

DB_GET_FIRST(ID,CD);
IF (CD <> 0)    THEN
        BEGIN
                ERROR(7200);
CHEQ                    :=      'IN'; {INSERT}
AD220A_A3_FR.CANT       :=      MN;                           
AD220A_A3_FR.RECI       :=      '';
AD220A_A3_FR.OBSE       :=      '';
AD220A_A3_FR.TSSA       :=      ID_TECNICO_GBL;
AD220A_A3_FR.TSSN       :=      NOMB_TECN_GBL;
AD220A_A3_FR.AUTO       :=      'N';
SET_CURRENT_FIELD(AD220A_A3_FR.CANT);

                RETURN;   
        END;

IF (AD220A_BG2_RO_DSD.RECIBIDO_EN = 'CORR') OR (AD220A_BG2_RO_DSD.RECIBIDO_EN = 
'OFLO') 
THEN
BEGIN
   IF AD220A_BG2_RO_DSD.RECAU_AUTO <> 'S' THEN
        CHEQ                    :=      'UP'; {UPDATE}

        AD220A_A3_FR.FECH       :=      AD220A_BG2_RO_DSD.FCH_PAGO;            
        AD220A_A3_FR.CANT       :=      AD220A_BG2_RO_DSD.PAGO_A_EFECTUAR;
        AD220A_A3_FR.RECI       :=      AD220A_BG2_RO_DSD.RECIBIDO_EN;
        AD220A_A3_FR.OBSE       :=      AD220A_BG2_RO_DSD.OBSER_A;
        AD220A_A3_FR.TSSA       :=      ID_TECNICO_GBL;
        AD220A_A3_FR.TSSN       :=      NOMB_TECN_GBL;
        AD220A_A3_FR.AUTO       :=      AD220A_BG2_RO_DSD.RECAU_AUTO;

END;
ELSE
 BEGIN
  ERROR(7290);
  SET_FAILURE();
  RETURN;
 END;

IF AD220A_A3_FR.AUTO = 'S' THEN 
   SET_CURRENT_FIELD(AD220A_A3_FR.PARK);
ELSE
   SET_CURRENT_FIELD(AD220A_A3_FR.CANT);
DB_CLOSE(ID,CD);
IF (CD<>0) THEN
        BEGIN
                ERROR(CD);
                SET_FAILURE();
                RETURN;
        END;

SET_NOTRACE();
    



--------------------------------------------------------------------- */
