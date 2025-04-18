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
public class REGISTRO_EMPLEO_RO_ADL
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

  public double OPEN_ID = 0;

  public double STATUS_ID = 0;

  public double OPEN2_ID = 0;

  public double STATUS2_ID = 0;

  public double NGET_CMD = 0;



  public DataStore REG_EMPLEO_LOC_DSD = null;

  public DataStore CLIENTES_READ_LOC_DSD = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setOPEN_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).OPEN_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setSTATUS_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).STATUS_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setOPEN2_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).OPEN2_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setSTATUS2_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).STATUS2_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setNGET_CMD  ( RallyApplication __app, Parameter value )
  {
    ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).NGET_CMD = value.getDouble ( );
  }  
    


  /**  */
  public static DataStore getREG_EMPLEO_LOC_DSD  ( RallyApplication __app )
  {
    return ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).REG_EMPLEO_LOC_DSD;
  }


  /**  */
  public static void setREG_EMPLEO_LOC_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).REG_EMPLEO_LOC_DSD = value;
  }


  /**  */
  public static void setREG_EMPLEO_LOC_DSD  ( RallyApplication __app, Object value )
  {
    ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).REG_EMPLEO_LOC_DSD = ( DataStore ) value;
  }



  /**  */
  public static DataStore getCLIENTES_READ_LOC_DSD  ( RallyApplication __app )
  {
    return ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).CLIENTES_READ_LOC_DSD;
  }


  /**  */
  public static void setCLIENTES_READ_LOC_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).CLIENTES_READ_LOC_DSD = value;
  }


  /**  */
  public static void setCLIENTES_READ_LOC_DSD  ( RallyApplication __app, Object value )
  {
    ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).CLIENTES_READ_LOC_DSD = ( DataStore ) value;
  }




  /**  */
  public static double getOPEN_ID  ( RallyApplication __app )
  {
    return ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).OPEN_ID;
  }


  /**  */
  public static Double getOPEN_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).OPEN_ID );
  }


  /**  */
  public static void setOPEN_ID  ( RallyApplication __app, double value )
  {
    ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).OPEN_ID = value;
  }


  /**  */
  public static void setOPEN_ID  ( RallyApplication __app, Object value )
  {
    ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).OPEN_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSTATUS_ID  ( RallyApplication __app )
  {
    return ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).STATUS_ID;
  }


  /**  */
  public static Double getSTATUS_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).STATUS_ID );
  }


  /**  */
  public static void setSTATUS_ID  ( RallyApplication __app, double value )
  {
    ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).STATUS_ID = value;
  }


  /**  */
  public static void setSTATUS_ID  ( RallyApplication __app, Object value )
  {
    ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).STATUS_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getOPEN2_ID  ( RallyApplication __app )
  {
    return ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).OPEN2_ID;
  }


  /**  */
  public static Double getOPEN2_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).OPEN2_ID );
  }


  /**  */
  public static void setOPEN2_ID  ( RallyApplication __app, double value )
  {
    ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).OPEN2_ID = value;
  }


  /**  */
  public static void setOPEN2_ID  ( RallyApplication __app, Object value )
  {
    ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).OPEN2_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSTATUS2_ID  ( RallyApplication __app )
  {
    return ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).STATUS2_ID;
  }


  /**  */
  public static Double getSTATUS2_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).STATUS2_ID );
  }


  /**  */
  public static void setSTATUS2_ID  ( RallyApplication __app, double value )
  {
    ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).STATUS2_ID = value;
  }


  /**  */
  public static void setSTATUS2_ID  ( RallyApplication __app, Object value )
  {
    ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).STATUS2_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getNGET_CMD  ( RallyApplication __app )
  {
    return ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).NGET_CMD;
  }


  /**  */
  public static Double getNGET_CMDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).NGET_CMD );
  }


  /**  */
  public static void setNGET_CMD  ( RallyApplication __app, double value )
  {
    ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).NGET_CMD = value;
  }


  /**  */
  public static void setNGET_CMD  ( RallyApplication __app, Object value )
  {
    ( ( REGISTRO_EMPLEO_RO_ADL ) __app.getADL ( REGISTRO_EMPLEO_RO_ADL.class ) ).NGET_CMD = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static REGISTRO_EMPLEO_RO_ADL get ( RallyApplication __app )
  {
    REGISTRO_EMPLEO_RO_ADL adl = new REGISTRO_EMPLEO_RO_ADL ( );
    __app.register ( adl, "REGISTRO_EMPLEO_RO_ADL" );
    __app.setADL ( REGISTRO_EMPLEO_RO_ADL.class, adl ); 
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
    REGISTRO_EMPLEO_RO_ADL.get ( __app ).process ( ps );
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
    REGISTRO_EMPLEO_RO_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "REGISTRO_EMPLEO_RO_ADL" );
    if ( rObj != null && rObj instanceof REGISTRO_EMPLEO_RO_ADL )
    {
      this.app.setADL ( REGISTRO_EMPLEO_RO_ADL.class, ( REGISTRO_EMPLEO_RO_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "REGISTRO_EMPLEO_RO_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "REGISTRO_EMPLEO_RO_ADL ended" );
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

    this.app.MOD_PTRA_GBL = "RERO";
    REG_EMPLEO_LOC_DSD = this.dm.create ( "REG_EMPLEO_LOC_DSD" );
    OPEN_ID = REG_EMPLEO_LOC_DSD.getId ( );
    STATUS_ID = RallyDataStoreException.getDefault ( );
    CLIENTES_READ_LOC_DSD = this.dm.create ( "CLIENTES_READ_LOC_DSD" );
    OPEN2_ID = CLIENTES_READ_LOC_DSD.getId ( );
    STATUS2_ID = RallyDataStoreException.getDefault ( );

    STATUS_ID  = this.dm.reset ( OPEN_ID );

    this.dm.setField ( this.dm.get ( "REG_EMPLEO_LOC_DSD" ), "SEGURO_SOCIAL_CLIENTE", this.app.SSN_GBL );
    this.dm.setField ( this.dm.get ( "REG_EMPLEO_LOC_DSD" ), "RMO_OFICINA", this.app.RMO_GBL );

    STATUS_ID  = this.dm.limitQueryFromBuffer ( OPEN_ID );
    STATUS_ID  = this.dm.retrieve ( OPEN_ID );

    STATUS_ID  = this.dm.firstRow ( OPEN_ID );

    if ( ! Compare.equals ( STATUS_ID, 0 ) ) 
    {
      this.app.setError ( 0, 6192 );
      this.app.errorFlag = false;
      STATUS_ID  = this.dm.dbClose ( OPEN_ID );

      this.doReturn ( );
      return; 
    }
    else
    {
      STATUS_ID  = this.dm.dbClose ( OPEN_ID );

      REGISTRO_EMPLEO_PTRA_RO_PKT.exec ( this.app );
      return;
    }

  }
}



/* ---------------------------------------------------------------------


     
VAR
   OPEN_ID  : NUMBER;
   STATUS_ID: NUMBER;
   OPEN2_ID  : NUMBER;
   STATUS2_ID: NUMBER;
   NGET_CMD : NUMBER;

BEGIN

set_trace();
        MOD_PTRA_GBL := 'RERO';
        DB_OPEN(REG_EMPLEO_LOC_DSD,OPEN_ID,STATUS_ID);
        DB_OPEN(CLIENTES_READ_LOC_DSD,OPEN2_ID,STATUS2_ID);

        DB_RESET(OPEN_ID,STATUS_ID);
        REG_EMPLEO_LOC_DSD.SEGURO_SOCIAL_CLIENTE:=SSN_GBL;
        REG_EMPLEO_LOC_DSD.RMO_OFICINA:=RMO_GBL;
        DB_QUERY(OPEN_ID,STATUS_ID);
        DB_GET_FIRST(OPEN_ID,STATUS_ID);
        IF STATUS_ID <> 0 THEN
          BEGIN
            ERROR(6192);
            SET_FAILURE();
            DB_CLOSE(OPEN_ID,STATUS_ID);
            RETURN;
          END;
        ELSE
          BEGIN
           DB_CLOSE(OPEN_ID,STATUS_ID);
           CALL REGISTRO_EMPLEO_PTRA_RO_PKT;
          END;

set_notrace();
END;

    



--------------------------------------------------------------------- */
