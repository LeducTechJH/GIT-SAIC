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
public class REPORT_6_6_ADL
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

  public double CALENDARIO = 0;

  public double CLIENTE = 0;

  public double REPORTE = 0;

  public double CALENDARIO_STATUS = 0;

  public double STATUS = 0;

  public double DESDE_HH_NUM = 0;

  public double DESDE_MM_NUM = 0;

  public double DURA_HH_NUM = 0;

  public double DURA_MM_NUM = 0;



  public String HASTA_HH = null;

  public String HASTA_MM = null;

  public Date NULL_DATE = null;

  public Date INPUT_DATE = null;

  public Date START_DATE = null;

  public Date END_DATE = null;

  public DataStore REPORT_6_6_DSD = null;

  public DataStore CLIENTES_READ_DSD = null;

  public DataStore REPORT_6_6_FIX_DSD = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setCALENDARIO  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).CALENDARIO = value.getDouble ( );
  }  

  
  /**  */
  public static void setCLIENTE  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).CLIENTE = value.getDouble ( );
  }  

  
  /**  */
  public static void setREPORTE  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).REPORTE = value.getDouble ( );
  }  

  
  /**  */
  public static void setCALENDARIO_STATUS  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).CALENDARIO_STATUS = value.getDouble ( );
  }  

  
  /**  */
  public static void setSTATUS  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).STATUS = value.getDouble ( );
  }  

  
  /**  */
  public static void setDESDE_HH_NUM  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).DESDE_HH_NUM = value.getDouble ( );
  }  

  
  /**  */
  public static void setDESDE_MM_NUM  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).DESDE_MM_NUM = value.getDouble ( );
  }  

  
  /**  */
  public static void setDURA_HH_NUM  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).DURA_HH_NUM = value.getDouble ( );
  }  

  
  /**  */
  public static void setDURA_MM_NUM  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).DURA_MM_NUM = value.getDouble ( );
  }  

  
  /**  */
  public static void setHASTA_HH  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).HASTA_HH = value.getString ( );
  }  

  
  /**  */
  public static void setHASTA_MM  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).HASTA_MM = value.getString ( );
  }  

  
  /**  */
  public static void setNULL_DATE  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).NULL_DATE = value.getDate ( );
  }  

  
  /**  */
  public static void setINPUT_DATE  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).INPUT_DATE = value.getDate ( );
  }  

  
  /**  */
  public static void setSTART_DATE  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).START_DATE = value.getDate ( );
  }  

  
  /**  */
  public static void setEND_DATE  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).END_DATE = value.getDate ( );
  }  
    


  /**  */
  public static String getHASTA_HH  ( RallyApplication __app )
  {
    return ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).HASTA_HH;
  }


  /**  */
  public static void setHASTA_HH  ( RallyApplication __app, String value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).HASTA_HH = value;
  }


  /**  */
  public static void setHASTA_HH  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).HASTA_HH = ( String ) value;
  }



  /**  */
  public static String getHASTA_MM  ( RallyApplication __app )
  {
    return ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).HASTA_MM;
  }


  /**  */
  public static void setHASTA_MM  ( RallyApplication __app, String value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).HASTA_MM = value;
  }


  /**  */
  public static void setHASTA_MM  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).HASTA_MM = ( String ) value;
  }



  /**  */
  public static Date getNULL_DATE  ( RallyApplication __app )
  {
    return ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).NULL_DATE;
  }


  /**  */
  public static void setNULL_DATE  ( RallyApplication __app, Date value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).NULL_DATE = value;
  }


  /**  */
  public static void setNULL_DATE  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).NULL_DATE = ( Date ) value;
  }



  /**  */
  public static Date getINPUT_DATE  ( RallyApplication __app )
  {
    return ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).INPUT_DATE;
  }


  /**  */
  public static void setINPUT_DATE  ( RallyApplication __app, Date value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).INPUT_DATE = value;
  }


  /**  */
  public static void setINPUT_DATE  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).INPUT_DATE = ( Date ) value;
  }



  /**  */
  public static Date getSTART_DATE  ( RallyApplication __app )
  {
    return ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).START_DATE;
  }


  /**  */
  public static void setSTART_DATE  ( RallyApplication __app, Date value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).START_DATE = value;
  }


  /**  */
  public static void setSTART_DATE  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).START_DATE = ( Date ) value;
  }



  /**  */
  public static Date getEND_DATE  ( RallyApplication __app )
  {
    return ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).END_DATE;
  }


  /**  */
  public static void setEND_DATE  ( RallyApplication __app, Date value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).END_DATE = value;
  }


  /**  */
  public static void setEND_DATE  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).END_DATE = ( Date ) value;
  }



  /**  */
  public static DataStore getREPORT_6_6_DSD  ( RallyApplication __app )
  {
    return ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).REPORT_6_6_DSD;
  }


  /**  */
  public static void setREPORT_6_6_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).REPORT_6_6_DSD = value;
  }


  /**  */
  public static void setREPORT_6_6_DSD  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).REPORT_6_6_DSD = ( DataStore ) value;
  }



  /**  */
  public static DataStore getCLIENTES_READ_DSD  ( RallyApplication __app )
  {
    return ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).CLIENTES_READ_DSD;
  }


  /**  */
  public static void setCLIENTES_READ_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).CLIENTES_READ_DSD = value;
  }


  /**  */
  public static void setCLIENTES_READ_DSD  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).CLIENTES_READ_DSD = ( DataStore ) value;
  }



  /**  */
  public static DataStore getREPORT_6_6_FIX_DSD  ( RallyApplication __app )
  {
    return ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).REPORT_6_6_FIX_DSD;
  }


  /**  */
  public static void setREPORT_6_6_FIX_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).REPORT_6_6_FIX_DSD = value;
  }


  /**  */
  public static void setREPORT_6_6_FIX_DSD  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).REPORT_6_6_FIX_DSD = ( DataStore ) value;
  }




  /**  */
  public static double getCALENDARIO  ( RallyApplication __app )
  {
    return ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).CALENDARIO;
  }


  /**  */
  public static Double getCALENDARIODouble ( RallyApplication __app )
  {
    return new Double ( ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).CALENDARIO );
  }


  /**  */
  public static void setCALENDARIO  ( RallyApplication __app, double value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).CALENDARIO = value;
  }


  /**  */
  public static void setCALENDARIO  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).CALENDARIO = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getCLIENTE  ( RallyApplication __app )
  {
    return ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).CLIENTE;
  }


  /**  */
  public static Double getCLIENTEDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).CLIENTE );
  }


  /**  */
  public static void setCLIENTE  ( RallyApplication __app, double value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).CLIENTE = value;
  }


  /**  */
  public static void setCLIENTE  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).CLIENTE = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getREPORTE  ( RallyApplication __app )
  {
    return ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).REPORTE;
  }


  /**  */
  public static Double getREPORTEDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).REPORTE );
  }


  /**  */
  public static void setREPORTE  ( RallyApplication __app, double value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).REPORTE = value;
  }


  /**  */
  public static void setREPORTE  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).REPORTE = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getCALENDARIO_STATUS  ( RallyApplication __app )
  {
    return ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).CALENDARIO_STATUS;
  }


  /**  */
  public static Double getCALENDARIO_STATUSDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).CALENDARIO_STATUS );
  }


  /**  */
  public static void setCALENDARIO_STATUS  ( RallyApplication __app, double value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).CALENDARIO_STATUS = value;
  }


  /**  */
  public static void setCALENDARIO_STATUS  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).CALENDARIO_STATUS = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSTATUS  ( RallyApplication __app )
  {
    return ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).STATUS;
  }


  /**  */
  public static Double getSTATUSDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).STATUS );
  }


  /**  */
  public static void setSTATUS  ( RallyApplication __app, double value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).STATUS = value;
  }


  /**  */
  public static void setSTATUS  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).STATUS = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getDESDE_HH_NUM  ( RallyApplication __app )
  {
    return ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).DESDE_HH_NUM;
  }


  /**  */
  public static Double getDESDE_HH_NUMDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).DESDE_HH_NUM );
  }


  /**  */
  public static void setDESDE_HH_NUM  ( RallyApplication __app, double value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).DESDE_HH_NUM = value;
  }


  /**  */
  public static void setDESDE_HH_NUM  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).DESDE_HH_NUM = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getDESDE_MM_NUM  ( RallyApplication __app )
  {
    return ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).DESDE_MM_NUM;
  }


  /**  */
  public static Double getDESDE_MM_NUMDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).DESDE_MM_NUM );
  }


  /**  */
  public static void setDESDE_MM_NUM  ( RallyApplication __app, double value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).DESDE_MM_NUM = value;
  }


  /**  */
  public static void setDESDE_MM_NUM  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).DESDE_MM_NUM = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getDURA_HH_NUM  ( RallyApplication __app )
  {
    return ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).DURA_HH_NUM;
  }


  /**  */
  public static Double getDURA_HH_NUMDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).DURA_HH_NUM );
  }


  /**  */
  public static void setDURA_HH_NUM  ( RallyApplication __app, double value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).DURA_HH_NUM = value;
  }


  /**  */
  public static void setDURA_HH_NUM  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).DURA_HH_NUM = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getDURA_MM_NUM  ( RallyApplication __app )
  {
    return ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).DURA_MM_NUM;
  }


  /**  */
  public static Double getDURA_MM_NUMDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).DURA_MM_NUM );
  }


  /**  */
  public static void setDURA_MM_NUM  ( RallyApplication __app, double value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).DURA_MM_NUM = value;
  }


  /**  */
  public static void setDURA_MM_NUM  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_6_6_ADL ) __app.getADL ( REPORT_6_6_ADL.class ) ).DURA_MM_NUM = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static REPORT_6_6_ADL get ( RallyApplication __app )
  {
    REPORT_6_6_ADL adl = new REPORT_6_6_ADL ( );
    __app.register ( adl, "REPORT_6_6_ADL" );
    __app.setADL ( REPORT_6_6_ADL.class, adl ); 
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
    REPORT_6_6_ADL.get ( __app ).process ( ps );
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
    REPORT_6_6_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "REPORT_6_6_ADL" );
    if ( rObj != null && rObj instanceof REPORT_6_6_ADL )
    {
      this.app.setADL ( REPORT_6_6_ADL.class, ( REPORT_6_6_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "REPORT_6_6_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
      case 2:  { this.currentStep ++; this.step2 ( this.keyParms ); break; }
      
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "REPORT_6_6_ADL ended" );
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

    NULL_DATE = TruncService.setNull ( NULL_DATE  );
    this.app.FILE_SPEC = "REPORT_6_6.FIX;*";

    this.callParms.clear ( );
    DELETE_FIX_FILES.exec ( this.app, this.callParms );
    return;

  }

 
  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {
    
    START_DATE = TruncService.trunc ( this.app.form ( "REPORT_6_6_FR" ).getDateItem ( "INPUT_START_DATE" ), "DDD" ) ;
    END_DATE = TruncService.trunc ( this.app.form ( "REPORT_6_6_FR" ).getDateItem ( "INPUT_END_DATE" ), "DDD" ) ;

    if ( START_DATE == null || END_DATE == null )
    {
      return;
    }
    if ( !Compare.gt ( this.app.form ( "REPORT_6_6_FR" ).getDoubleItem ( "TECNICO_VAR" ), 0 ) ) 
    {
      return;
    }
    REPORT_6_6_DSD = this.dm.create ( "REPORT_6_6_DSD" );
    CALENDARIO = REPORT_6_6_DSD.getId ( );
    STATUS = RallyDataStoreException.getDefault ( );

    STATUS  = this.dm.reset ( CALENDARIO );

    if ( Compare.gt ( this.app.form ( "REPORT_6_6_FR" ).getDoubleItem ( "TECNICO_VAR" ), 0 ) ) 
    {
      this.dm.setField ( this.dm.get ( "REPORT_6_6_DSD" ), "CALENDARIO_ID_TECNICO", this.app.form ( "REPORT_6_6_FR" ).getDoubleItem ( "TECNICO_VAR" ));
    }
    this.dm.setField ( REPORT_6_6_DSD, "CALENDARIO_RMO_OFICINA", this.app.RMO_GBL );
    this.dm.setField ( REPORT_6_6_DSD, "TECNICO_RMO_OFICINA", this.app.RMO_GBL );

        
    CLIENTES_READ_DSD = this.dm.create ( "CLIENTES_READ_DSD" );
    CLIENTE = CLIENTES_READ_DSD.getId ( );
    STATUS = RallyDataStoreException.getDefault ( );
    REPORT_6_6_FIX_DSD = this.dm.create ( "REPORT_6_6_FIX_DSD" );
    REPORTE = REPORT_6_6_FIX_DSD.getId ( );
    STATUS = RallyDataStoreException.getDefault ( );
    this.dm.setField ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "TECNICO", 0 );
    this.dm.setField ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "NOMBRE_TECNICO", " " );
    this.dm.setField ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "FECHA", this.app.SYSTEM_DATE );
    this.dm.setField ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "DESDE", this.app.SYSTEM_DATE );
    this.dm.setField ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "HASTA", this.app.SYSTEM_DATE );
    this.dm.setField ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "DURACION", this.app.SYSTEM_DATE );
    this.dm.setField ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "DESCRIPCION", " " );
    this.dm.setField ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "SEGURO_SOCIAL", 0 );
    this.dm.setField ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "CLIENTE_NOMBRE", " " );
    this.dm.setField ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "DIAS_PASADOS", 0 );

    CALENDARIO_STATUS  = this.dm.limitQueryFromBuffer ( CALENDARIO );
    
    
    REPORT_6_6_DSD.conditions.add ( "CALENDARIO_FCH_ACTIVIDAD_HORA_MIN_CONTAC0", ">", DateUtil.prevDay ( START_DATE ) );
    REPORT_6_6_DSD.conditions.add ( "CALENDARIO_FCH_ACTIVIDAD_HORA_MIN_CONTAC0", "<", DateUtil.nextDay ( END_DATE   ) );

    CALENDARIO_STATUS  = this.dm.retrieve ( CALENDARIO );

    CALENDARIO_STATUS  = this.dm.firstRow ( CALENDARIO );

    while ( Compare.equals ( CALENDARIO_STATUS, 0 ) ) 
    {
      if ( ! Compare.equals ( this.dm.getFieldDate ( this.dm.get ( "REPORT_6_6_DSD" ), "CALENDARIO_FCH_ACTIVIDAD_HORA_MIN_CONTAC0" ), NULL_DATE ) ) 
      {
        INPUT_DATE = TruncService.trunc ( this.dm.getFieldDate ( this.dm.get ( "REPORT_6_6_DSD" ), "CALENDARIO_FCH_ACTIVIDAD_HORA_MIN_CONTAC0" ), "DDD" ) ;
      }
      else
      {
        INPUT_DATE = this.app.SYSTEM_DATE;
      }
      if ( ( Compare.ge ( INPUT_DATE, START_DATE ) ) && ( Compare.le ( INPUT_DATE, END_DATE ) )  ) 
      {
        this.dm.setField ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "TECNICO", this.dm.getFieldDouble ( this.dm.get ( "REPORT_6_6_DSD" ), "CALENDARIO_ID_TECNICO" ) );
        
        String desc = this.dm.getFieldString ( REPORT_6_6_DSD, "CONTROL_PLAN_TRABAJO_DSC_ACTIVIDAD_LARGA" );
        if ( desc != null && desc.length ( ) > 33 )
        {
          desc = desc.substring ( 0, 32 );
        }
        this.dm.setField ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "DESCRIPCION", desc );
        this.dm.setField ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "NOMBRE_TECNICO", this.dm.getFieldString ( this.dm.get ( "REPORT_6_6_DSD" ), "NOMBRE_TECNICO" ) + " " + this.dm.getFieldString ( this.dm.get ( "REPORT_6_6_DSD" ), "INICIAL_TECNICO" ) + " " + this.dm.getFieldString ( this.dm.get ( "REPORT_6_6_DSD" ), "PATERNO_TECNICO" ) + " " + this.dm.getFieldString ( this.dm.get ( "REPORT_6_6_DSD" ), "MATERNO_TECNICO" ) );
        this.dm.setField ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "FECHA", INPUT_DATE );

        double SEGURO_SOCIAL_JEFE_SERV = this.dm.getFieldDouble ( this.dm.get ( "REPORT_6_6_DSD" ), "CALENDARIO_SEGURO_SOCIAL_JEFE_SERV" );
        
        if ( SEGURO_SOCIAL_JEFE_SERV <= 0 || Double.isNaN ( SEGURO_SOCIAL_JEFE_SERV ) )
        {
          this.dm.setField ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "SEGURO_SOCIAL", 0 );
          this.dm.setField ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "CLIENTE_NOMBRE", "NO TIENE RECORD" );        
        }
        else
        {
          STATUS  = this.dm.reset ( CLIENTE );

          this.dm.setField ( this.dm.get ( "CLIENTES_READ_DSD" ), "SEGURO_SOCIAL_CLIENTE", SEGURO_SOCIAL_JEFE_SERV );
          this.dm.setField ( this.dm.get ( "CLIENTES_READ_DSD" ), "RMO_OFICINA", this.app.RMO_GBL );

          STATUS  = this.dm.limitQueryFromBuffer ( CLIENTE );
          STATUS  = this.dm.retrieve ( CLIENTE );
          STATUS  = this.dm.firstRow ( CLIENTE );
 
          if ( Compare.equals ( STATUS, 0 ) ) 
          {
            this.dm.setField ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "CLIENTE_NOMBRE", this.dm.getFieldString ( this.dm.get ( "CLIENTES_READ_DSD" ), "DSC_NOMBRE" ) + " " + this.dm.getFieldString ( this.dm.get ( "CLIENTES_READ_DSD" ), "DSC_APELLIDO_PATERNO" ) + " " + this.dm.getFieldString ( this.dm.get ( "CLIENTES_READ_DSD" ), "DSC_APELLIDO_MATERNO" ) );
            this.dm.setField ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "SEGURO_SOCIAL", this.dm.getFieldDouble ( this.dm.get ( "REPORT_6_6_DSD" ), "CALENDARIO_SEGURO_SOCIAL_JEFE_SERV" ) );
          }
          else
          {
            this.dm.setField ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "SEGURO_SOCIAL", 0 );
            this.dm.setField ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "CLIENTE_NOMBRE", "NO TIENE RECORD" );
          }
        }  
        
        this.dm.setField ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "DESDE", this.dm.getFieldDate ( this.dm.get ( "REPORT_6_6_DSD" ), "CALENDARIO_FCH_ACTIVIDAD_HORA_MIN_CONTAC0" ) );
        this.dm.setField ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "DURACION", this.dm.getFieldDate ( this.dm.get ( "REPORT_6_6_DSD" ), "CALENDARIO_DURACION_HORA_MIN_CONTACTO" ) );
        DESDE_HH_NUM = FormattingFactory.parseStringToDouble ( RallyStringService.subString ( StringService.toStringValue  ( this.dm.getFieldDate ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "DESDE" ) ,"HHmm" ,StringService.Language.SPANISH ), 0, 2 ) );
        DESDE_MM_NUM = FormattingFactory.parseStringToDouble ( RallyStringService.subString ( StringService.toStringValue  ( this.dm.getFieldDate ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "DESDE" ) ,"HHmm" ,StringService.Language.SPANISH ), 2, 2 ) );
        DURA_HH_NUM = FormattingFactory.parseStringToDouble ( RallyStringService.subString ( StringService.toStringValue  ( this.dm.getFieldDate ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "DURACION" ) ,"HHmm" ,StringService.Language.SPANISH ), 0, 2 ) );
        DURA_MM_NUM = FormattingFactory.parseStringToDouble ( RallyStringService.subString ( StringService.toStringValue  ( this.dm.getFieldDate ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "DURACION" ) ,"HHmm" ,StringService.Language.SPANISH ), 2, 2 ) );
        DURA_MM_NUM = MathService.plus ( DURA_MM_NUM, DESDE_MM_NUM  );
        if ( Compare.gt ( DURA_MM_NUM, 59 ) ) 
        {
          DESDE_HH_NUM = MathService.plus ( DESDE_HH_NUM, 1  );
          DURA_MM_NUM = MathService.minus ( DURA_MM_NUM, 60  );
        }
        DURA_HH_NUM = MathService.plus ( DESDE_HH_NUM, DURA_HH_NUM  );
        if ( Compare.gt ( DURA_HH_NUM, 9 ) ) 
        {
          HASTA_HH = StringService.toStringValue  ( DURA_HH_NUM );
        }
        else
        {
          HASTA_HH = "0" + StringService.toStringValue  ( DURA_HH_NUM );
        }
        if ( Compare.gt ( DURA_MM_NUM, 9 ) ) 
        {
          HASTA_MM = StringService.toStringValue  ( DURA_MM_NUM );
        }
        else
        {
          HASTA_MM = "0" + StringService.toStringValue  ( DURA_MM_NUM );
        }
        this.dm.setField ( this.dm.get ( "REPORT_6_6_FIX_DSD" ), "HASTA", RallySpanishDatesParser.parseDateString ( HASTA_HH + HASTA_MM, "HH24MI" ) );

        STATUS  = this.dm.insertRow ( REPORTE );

      }

      CALENDARIO_STATUS  = this.dm.nextRow ( CALENDARIO );

    }

    STATUS  = this.dm.dbCommit ( );
    STATUS  = this.dm.dbClose ( CLIENTE );

    STATUS  = this.dm.dbClose ( CALENDARIO );

    STATUS  = this.dm.dbClose ( REPORTE );

    REPORT_6_6_RP_PKT.exec ( this.app );
    return;
  }
  
  /**
   *
   */
  protected void step2 ( ParameterSet ps )
  {
    app.executeCommand ( "FINISH ACTION" );
  }
}



/* ---------------------------------------------------------------------


     
procedure report_6_6_adl;

var     calendario:     number(9,0);
        cliente:        number(9,0);
        reporte:        number(9,0);
        calendario_status:
                        number(9,0);
        status:         number(9,0);
        desde_hh_num:   number(2);
        desde_mm_num:   number(2);
        dura_hh_num:    number(2);
        dura_mm_num:    number(2);
        hasta_hh:       char(2);
        hasta_mm:       char(2);
        null_date:      date;
        input_date:     date;
        start_date:     date;
        end_date:       date;
begin
        set_trace();
        make_null(null_date);
        file_spec:='REPORT_6_6.FIX;*';
        call delete_fix_files;



        db_open(report_6_6_dsd,calendario,status);
        db_reset(calendario,status);

{modificacion hecha para permitir seleccion de tecnico en el reporte }
  if (REPORT_6_6_FR.TECNICO_VAR > 0 ) then
      begin
        REPORT_6_6_DSD.CALENDARIO_ID_TECNICO :=
            REPORT_6_6_FR.TECNICO_VAR;
      end;
        REPORT_6_6_DSD.CALENDARIO_RMO_OFICINA:=RMO_GBL;
        REPORT_6_6_DSD.TECNICO_RMO_OFICINA:=RMO_GBL;

        db_open(clientes_read_dsd,cliente,status);
        db_open(REPORT_6_6_FIX_DSD,reporte,status);

        REPORT_6_6_FIX_DSD.tecnico:=0;
        REPORT_6_6_FIX_DSD.nombre_tecnico:=' ';
        REPORT_6_6_FIX_DSD.fecha:=system_date;
        REPORT_6_6_FIX_DSD.desde:=system_date;
        REPORT_6_6_FIX_DSD.hasta:=system_date;
        REPORT_6_6_FIX_DSD.duracion:=system_date;
        REPORT_6_6_FIX_DSD.descripcion:=' ';
        REPORT_6_6_FIX_DSD.seguro_social:=0;
        REPORT_6_6_FIX_DSD.cliente_nombre:=' ';
        REPORT_6_6_FIX_DSD.dias_pasados:=0;

        start_date:=trunc(REPORT_6_6_FR.INPUT_START_DATE,'DDD');
        end_date:=trunc(REPORT_6_6_FR.INPUT_END_DATE,'DDD');

        db_query(calendario,calendario_status);
        db_get_first(calendario,calendario_status);
        while (calendario_status = 0) do 
                begin
                        if REPORT_6_6_DSD.CALENDARIO_FCH_ACTIVIDAD_HORA_MIN_CONTAC0 <> null_date
                        then
                                input_date:=trunc(REPORT_6_6_DSD.CALENDARIO_FCH_ACTIVIDAD_HORA_MIN_CONTAC0,'DDD');
                        else
                                input_date:=system_date;

                        if (input_date >= start_date)
                        and (input_date <= end_date)
{modificacion hecha de acuerdo a reporte de los 50}
{               and ( (REPORT_6_6_DSD.COD_RAZON= 'ITIV')
                                OR (REPORT_6_6_DSD.COD_RAZON = 'CMIV'))}
                        then
                                begin
                                        REPORT_6_6_FIX_DSD.TECNICO:=REPORT_6_6_D
SD.CALENDARIO_ID_TECNICO;
                                        REPORT_6_6_FIX_DSD.descripcion:=REPORT_6
_6_DSD.CONTROL_PLAN_TRABAJO_DSC_ACTIVIDAD_LARGA;
                                        REPORT_6_6_FIX_DSD.nombre_tecnico:=
                                                report_6_6_dsd.nombre_tecnico ||
 ' ' ||
                                                report_6_6_dsd.inicial_tecnico |
| ' ' ||
                                                report_6_6_dsd.paterno_tecnico |
| ' ' ||
                                                report_6_6_dsd.materno_tecnico;
                                        db_reset(cliente,status);
                                        clientes_read_dsd.seguro_social_cliente:
=REPORT_6_6_DSD.CALENDARIO_SEGURO_SOCIAL_JEFE_SERV;
                                        CLIENTES_READ_DSD.RMO_OFICINA:=RMO_GBL;
                                        db_query(cliente,status);
                                        db_get_first(cliente,status);
                                        REPORT_6_6_FIX_DSD.FECHA:=INPUT_DATE;
                                        if status = 0
                                        then begin
                                                REPORT_6_6_FIX_DSD.cliente_nombr
e:=
                                                        clientes_read_dsd.dsc_no
mbre || ' ' ||
                                                        clientes_read_dsd.dsc_ap
ellido_paterno || ' ' ||
                                                        clientes_read_dsd.dsc_ap
ellido_materno;
                                                REPORT_6_6_FIX_DSD.seguro_social
:=REPORT_6_6_DSD.CALENDARIO_SEGURO_SOCIAL_JEFE_SERV;
                                              end;
                                        else BEGIN
                                              REPORT_6_6_FIX_DSD.SEGURO_SOCIAL :
= 0;
                                              REPORT_6_6_FIX_DSD.cliente_nombre:
='NO TIENE RECORD';
                                             END;
                                        {endif}
                                        REPORT_6_6_FIX_DSD.desde:=REPORT_6_6_DSD
.calendario_FCH_ACTIVIDAD_HORA_MIN_CONTAC0;
                                        REPORT_6_6_FIX_DSD.duracion:=REPORT_6_6_
DSD.CALENDARIO_DURACION_HORA_MIN_CONTACTO;
                                        desde_hh_num:=to_number(substr(to_char(R
EPORT_6_6_FIX_DSD.desde,'HH24MI'),0,2));
                                        desde_mm_num:=to_number(substr(to_char(R
EPORT_6_6_FIX_DSD.desde,'HH24MI'),2,2));
                                        dura_hh_num:=to_number(substr(to_char(RE
PORT_6_6_FIX_DSD.duracion,'HH24MI'),0,2));
                                        dura_mm_num:=to_number(substr(to_char(RE
PORT_6_6_FIX_DSD.duracion,'HH24MI'),2,2));
                                        dura_mm_num:=dura_mm_num + desde_mm_num;
                                        if dura_mm_num > 59
                                        then begin
                                                desde_hh_num:= desde_hh_num + 1;
                                                dura_mm_num:=dura_mm_num - 60;
                                             end;
                                        dura_hh_num:=desde_hh_num + dura_hh_num;
                                        if dura_hh_num > 9
                                        then
                                                hasta_hh:=to_char(dura_hh_num);
                                        else
                                                hasta_hh:='0' || to_char(dura_hh
_num);
                                        {end-if}
                                        if dura_mm_num > 9
                                        then
                                                hasta_mm:=to_char(dura_mm_num);
                                        else
                                                hasta_mm:='0' || to_char(dura_mm
_num);
                                        {end-if}
                                        REPORT_6_6_FIX_DSD.hasta:=to_date(hasta_
hh || hasta_mm,'HH24MI');
                                        db_insert(reporte,status);
                                end;

                        {end-if}
                        db_get_next(calendario,calendario_status);
                end;
        db_commit(status);
        db_close(cliente,status);
        db_close(calendario,status);
        db_close(reporte,status);
        call report_6_6_RP_pkt;
        set_notrace();

end;
    



--------------------------------------------------------------------- */
