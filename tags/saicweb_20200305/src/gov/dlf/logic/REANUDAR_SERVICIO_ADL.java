package gov.dlf.logic;


import gov.dlf.facade.*;
import gov.dlf.presentation.*;


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
public class REANUDAR_SERVICIO_ADL
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

  public double OPEN3_ID = 0;

  public double STATUS3_ID = 0;

  public double OPEN4_ID = 0;

  public double STATUS4_ID = 0;

  public double SERV_ID = 0;

  public double STAT_CODE = 0;

  public double NULL_VAR = 0;

  public double COUNT = 0;

  public double EDAD_IND = 0;



  public DataStore TECNICO_RO_DSD = null;

  public DataStore NUCLEO_READ_LOC_DSD = null;

  public DataStore CLIENTES_READ_LOC_DSD = null;

  public DataStore SERVICIOS_READ_LOC2_DSD = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setOPEN_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).OPEN_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setSTATUS_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).STATUS_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setOPEN2_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).OPEN2_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setSTATUS2_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).STATUS2_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setOPEN3_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).OPEN3_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setSTATUS3_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).STATUS3_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setOPEN4_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).OPEN4_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setSTATUS4_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).STATUS4_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setSERV_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).SERV_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setSTAT_CODE  ( RallyApplication __app, Parameter value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).STAT_CODE = value.getDouble ( );
  }  

  
  /**  */
  public static void setNULL_VAR  ( RallyApplication __app, Parameter value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).NULL_VAR = value.getDouble ( );
  }  

  
  /**  */
  public static void setCOUNT  ( RallyApplication __app, Parameter value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).COUNT = value.getDouble ( );
  }  

  
  /**  */
  public static void setEDAD_IND  ( RallyApplication __app, Parameter value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).EDAD_IND = value.getDouble ( );
  }  
    


  /**  */
  public static DataStore getTECNICO_RO_DSD  ( RallyApplication __app )
  {
    return ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).TECNICO_RO_DSD;
  }


  /**  */
  public static void setTECNICO_RO_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).TECNICO_RO_DSD = value;
  }


  /**  */
  public static void setTECNICO_RO_DSD  ( RallyApplication __app, Object value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).TECNICO_RO_DSD = ( DataStore ) value;
  }



  /**  */
  public static DataStore getNUCLEO_READ_LOC_DSD  ( RallyApplication __app )
  {
    return ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).NUCLEO_READ_LOC_DSD;
  }


  /**  */
  public static void setNUCLEO_READ_LOC_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).NUCLEO_READ_LOC_DSD = value;
  }


  /**  */
  public static void setNUCLEO_READ_LOC_DSD  ( RallyApplication __app, Object value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).NUCLEO_READ_LOC_DSD = ( DataStore ) value;
  }



  /**  */
  public static DataStore getCLIENTES_READ_LOC_DSD  ( RallyApplication __app )
  {
    return ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).CLIENTES_READ_LOC_DSD;
  }


  /**  */
  public static void setCLIENTES_READ_LOC_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).CLIENTES_READ_LOC_DSD = value;
  }


  /**  */
  public static void setCLIENTES_READ_LOC_DSD  ( RallyApplication __app, Object value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).CLIENTES_READ_LOC_DSD = ( DataStore ) value;
  }



  /**  */
  public static DataStore getSERVICIOS_READ_LOC2_DSD  ( RallyApplication __app )
  {
    return ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).SERVICIOS_READ_LOC2_DSD;
  }


  /**  */
  public static void setSERVICIOS_READ_LOC2_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).SERVICIOS_READ_LOC2_DSD = value;
  }


  /**  */
  public static void setSERVICIOS_READ_LOC2_DSD  ( RallyApplication __app, Object value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).SERVICIOS_READ_LOC2_DSD = ( DataStore ) value;
  }




  /**  */
  public static double getOPEN_ID  ( RallyApplication __app )
  {
    return ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).OPEN_ID;
  }


  /**  */
  public static Double getOPEN_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).OPEN_ID );
  }


  /**  */
  public static void setOPEN_ID  ( RallyApplication __app, double value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).OPEN_ID = value;
  }


  /**  */
  public static void setOPEN_ID  ( RallyApplication __app, Object value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).OPEN_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSTATUS_ID  ( RallyApplication __app )
  {
    return ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).STATUS_ID;
  }


  /**  */
  public static Double getSTATUS_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).STATUS_ID );
  }


  /**  */
  public static void setSTATUS_ID  ( RallyApplication __app, double value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).STATUS_ID = value;
  }


  /**  */
  public static void setSTATUS_ID  ( RallyApplication __app, Object value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).STATUS_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getOPEN2_ID  ( RallyApplication __app )
  {
    return ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).OPEN2_ID;
  }


  /**  */
  public static Double getOPEN2_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).OPEN2_ID );
  }


  /**  */
  public static void setOPEN2_ID  ( RallyApplication __app, double value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).OPEN2_ID = value;
  }


  /**  */
  public static void setOPEN2_ID  ( RallyApplication __app, Object value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).OPEN2_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSTATUS2_ID  ( RallyApplication __app )
  {
    return ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).STATUS2_ID;
  }


  /**  */
  public static Double getSTATUS2_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).STATUS2_ID );
  }


  /**  */
  public static void setSTATUS2_ID  ( RallyApplication __app, double value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).STATUS2_ID = value;
  }


  /**  */
  public static void setSTATUS2_ID  ( RallyApplication __app, Object value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).STATUS2_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getOPEN3_ID  ( RallyApplication __app )
  {
    return ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).OPEN3_ID;
  }


  /**  */
  public static Double getOPEN3_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).OPEN3_ID );
  }


  /**  */
  public static void setOPEN3_ID  ( RallyApplication __app, double value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).OPEN3_ID = value;
  }


  /**  */
  public static void setOPEN3_ID  ( RallyApplication __app, Object value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).OPEN3_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSTATUS3_ID  ( RallyApplication __app )
  {
    return ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).STATUS3_ID;
  }


  /**  */
  public static Double getSTATUS3_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).STATUS3_ID );
  }


  /**  */
  public static void setSTATUS3_ID  ( RallyApplication __app, double value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).STATUS3_ID = value;
  }


  /**  */
  public static void setSTATUS3_ID  ( RallyApplication __app, Object value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).STATUS3_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getOPEN4_ID  ( RallyApplication __app )
  {
    return ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).OPEN4_ID;
  }


  /**  */
  public static Double getOPEN4_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).OPEN4_ID );
  }


  /**  */
  public static void setOPEN4_ID  ( RallyApplication __app, double value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).OPEN4_ID = value;
  }


  /**  */
  public static void setOPEN4_ID  ( RallyApplication __app, Object value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).OPEN4_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSTATUS4_ID  ( RallyApplication __app )
  {
    return ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).STATUS4_ID;
  }


  /**  */
  public static Double getSTATUS4_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).STATUS4_ID );
  }


  /**  */
  public static void setSTATUS4_ID  ( RallyApplication __app, double value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).STATUS4_ID = value;
  }


  /**  */
  public static void setSTATUS4_ID  ( RallyApplication __app, Object value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).STATUS4_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSERV_ID  ( RallyApplication __app )
  {
    return ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).SERV_ID;
  }


  /**  */
  public static Double getSERV_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).SERV_ID );
  }


  /**  */
  public static void setSERV_ID  ( RallyApplication __app, double value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).SERV_ID = value;
  }


  /**  */
  public static void setSERV_ID  ( RallyApplication __app, Object value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).SERV_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSTAT_CODE  ( RallyApplication __app )
  {
    return ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).STAT_CODE;
  }


  /**  */
  public static Double getSTAT_CODEDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).STAT_CODE );
  }


  /**  */
  public static void setSTAT_CODE  ( RallyApplication __app, double value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).STAT_CODE = value;
  }


  /**  */
  public static void setSTAT_CODE  ( RallyApplication __app, Object value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).STAT_CODE = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getNULL_VAR  ( RallyApplication __app )
  {
    return ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).NULL_VAR;
  }


  /**  */
  public static Double getNULL_VARDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).NULL_VAR );
  }


  /**  */
  public static void setNULL_VAR  ( RallyApplication __app, double value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).NULL_VAR = value;
  }


  /**  */
  public static void setNULL_VAR  ( RallyApplication __app, Object value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).NULL_VAR = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getCOUNT  ( RallyApplication __app )
  {
    return ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).COUNT;
  }


  /**  */
  public static Double getCOUNTDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).COUNT );
  }


  /**  */
  public static void setCOUNT  ( RallyApplication __app, double value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).COUNT = value;
  }


  /**  */
  public static void setCOUNT  ( RallyApplication __app, Object value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).COUNT = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getEDAD_IND  ( RallyApplication __app )
  {
    return ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).EDAD_IND;
  }


  /**  */
  public static Double getEDAD_INDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).EDAD_IND );
  }


  /**  */
  public static void setEDAD_IND  ( RallyApplication __app, double value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).EDAD_IND = value;
  }


  /**  */
  public static void setEDAD_IND  ( RallyApplication __app, Object value )
  {
    ( ( REANUDAR_SERVICIO_ADL ) __app.getADL ( REANUDAR_SERVICIO_ADL.class ) ).EDAD_IND = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static REANUDAR_SERVICIO_ADL get ( RallyApplication __app )
  {
    REANUDAR_SERVICIO_ADL adl = new REANUDAR_SERVICIO_ADL ( );
    __app.register ( adl, "REANUDAR_SERVICIO_ADL" );
    __app.setADL ( REANUDAR_SERVICIO_ADL.class, adl ); 
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
    REANUDAR_SERVICIO_ADL.get ( __app ).process ( ps );
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
    REANUDAR_SERVICIO_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "REANUDAR_SERVICIO_ADL" );
    if ( rObj != null && rObj instanceof REANUDAR_SERVICIO_ADL )
    {
      this.app.setADL ( REANUDAR_SERVICIO_ADL.class, ( REANUDAR_SERVICIO_ADL ) rObj );
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
    Debug.println ( Debug.TRACE, "REANUDAR_SERVICIO_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
      case 2:  { this.currentStep ++; this.step2 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "REANUDAR_SERVICIO_ADL ended" );
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

    this.app.COD_ACCESS_GBL = "RSER";
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
    NULL_VAR = TruncService.setNull ( NULL_VAR  );
    if ( ! Compare.equals ( RallyStringService.subString ( this.app.form ( "SERV_FAM_FRM" ).getStringItem ( "COD_STATUS_SERVICIO" ), 0, 4 ), "SUSP" ) ) 
    {
      this.app.setError ( 1, 4001 );
      this.doReturn ( );
      return; 
    }
    TECNICO_RO_DSD = this.dm.create ( "TECNICO_RO_DSD" );
    OPEN_ID = TECNICO_RO_DSD.getId ( );
    STATUS_ID = RallyDataStoreException.getDefault ( );
    if ( ! Compare.equals ( STATUS_ID, 0 ) ) 
    {
      this.app.setError ( 2, STATUS_ID );
      this.doReturn ( );
      return; 
    }
    NUCLEO_READ_LOC_DSD = this.dm.create ( "NUCLEO_READ_LOC_DSD" );
    OPEN2_ID = NUCLEO_READ_LOC_DSD.getId ( );
    STATUS2_ID = RallyDataStoreException.getDefault ( );
    if ( ! Compare.equals ( STATUS2_ID, 0 ) ) 
    {
      this.app.setError ( 3, STATUS2_ID );
      this.doReturn ( );
      return; 
    }
    CLIENTES_READ_LOC_DSD = this.dm.create ( "CLIENTES_READ_LOC_DSD" );
    OPEN3_ID = CLIENTES_READ_LOC_DSD.getId ( );
    STATUS3_ID = RallyDataStoreException.getDefault ( );
    if ( ! Compare.equals ( STATUS3_ID, 0 ) ) 
    {
      this.app.setError ( 4, STATUS3_ID );
      this.doReturn ( );
      return; 
    }
    SERVICIOS_READ_LOC2_DSD = this.dm.create ( "SERVICIOS_READ_LOC2_DSD" );
    OPEN4_ID = SERVICIOS_READ_LOC2_DSD.getId ( );
    STATUS4_ID = RallyDataStoreException.getDefault ( );
    if ( ! Compare.equals ( STATUS4_ID, 0 ) ) 
    {
      this.app.setError ( 5, STATUS4_ID );
      this.doReturn ( );
      return; 
    }

    STATUS_ID  = this.dm.reset ( OPEN_ID );

    this.dm.setField ( this.dm.get ( "TECNICO_RO_DSD" ), "ID_TECNICO", this.app.ID_TECNICO_GBL );

    STATUS_ID  = this.dm.limitQueryFromBuffer ( OPEN_ID );
    STATUS_ID  = this.dm.retrieve ( OPEN_ID );

    STATUS_ID  = this.dm.firstRow ( OPEN_ID );

    if ( ! Compare.equals ( STATUS_ID, 0 ) ) 
    {
      STATUS_ID  = this.dm.dbClose ( OPEN_ID );

      this.app.setError ( 6, 4005 );
      this.doReturn ( );
      return; 
    }

    STATUS_ID  = this.dm.rollBack ( );
    STATUS_ID  = this.dm.dbClose ( OPEN_ID );

    if ( Compare.equals ( this.app.RUTINA_GBL, "MC" ) ) 
    {
      MANTENIMIENTO_DE_CASOS_ADL.setCOMPLETION_STATUS ( this.app, "SUCCESS" );
    }
    else if ( Compare.equals ( this.app.RUTINA_GBL, "AC" )  )
    {
      APERTURA_DE_CASO_ADL.setCOMPLETION_STATUS ( this.app, "SUCCESS" );
    }
    this.app.MANT_ACCION_SERV_GBL = "AS";
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

  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE REANUDAR_SERVICIO_ADL;

VAR

OPEN_ID:        NUMBER(9,0);
STATUS_ID:      NUMBER(9,0);
OPEN2_ID:       NUMBER(9,0);
STATUS2_ID:     NUMBER(9,0);
OPEN3_ID:       NUMBER(9,0);
STATUS3_ID:     NUMBER(9,0);
OPEN4_ID:       NUMBER(9,0);
STATUS4_ID:     NUMBER(9,0);
SERV_ID:        NUMBER;
STAT_CODE:      NUMBER;
NULL_VAR :      NUMBER;
COUNT :         NUMBER;
EDAD_IND:       NUMBER;

BEGIN

SET_TRACE();
cod_acceSs_gbl := 'RSER';
CALL SECURITY_ADL;
IF ACCESS_STATUS_GBL = 'FAILURE' 
   THEN BEGIN
        ERROR(1006);
        RETURN;
        END;

MAKE_NULL(NULL_VAR);

IF (SUBSTR(SERV_FAM_FRM.COD_STATUS_SERVICIO,0,4) <> 'SUSP')
   THEN BEGIN
          ERROR(4001);
          RETURN;
        END;


DB_OPEN(TECNICO_RO_DSD,OPEN_ID,STATUS_ID);
IF (STATUS_ID<>0)
   THEN BEGIN
         ERROR(STATUS_ID);
         RETURN;
        END;

DB_OPEN(NUCLEO_READ_LOC_DSD,OPEN2_ID,STATUS2_ID);
IF (STATUS2_ID<>0)
   THEN BEGIN
         ERROR(STATUS2_ID);
         RETURN;
        END;
DB_OPEN(CLIENTES_READ_LOC_DSD,OPEN3_ID,STATUS3_ID);
IF (STATUS3_ID<>0)
   THEN BEGIN
         ERROR(STATUS3_ID);
         RETURN;
        END;
DB_OPEN(SERVICIOS_READ_LOC2_DSD,OPEN4_ID,STATUS4_ID);
IF (STATUS4_ID<>0)
   THEN BEGIN
         ERROR(STATUS4_ID);
         RETURN;
        END;

DB_RESET(OPEN_ID,STATUS_ID);
TECNICO_RO_DSD.ID_tecnico:=ID_TECNICO_GBL;
DB_QUERY(OPEN_ID,STATUS_ID);
DB_GET_FIRST(OPEN_ID,STATUS_ID);

IF STATUS_ID<>0
   THEN BEGIN
        DB_CLOSE(OPEN_ID,STATUS_ID);
        ERROR(4005);
        RETURN;
        END;

DB_ROLLBACK(STATUS_ID);
DB_CLOSE(OPEN_ID,STATUS_ID);

IF RUTINA_GBL='MC'
   THEN MANTENIMIENTO_DE_CASOS_ADL.COMPLETION_STATUS:='SUCCESS';
   ELSE IF RUTINA_GBL='AC'
        THEN APERTURA_DE_CASO_ADL.COMPLETION_STATUS:='SUCCESS';

MANT_ACCION_SERV_GBL:='AS';
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

SET_NOTRACE();
END;

    



--------------------------------------------------------------------- */
