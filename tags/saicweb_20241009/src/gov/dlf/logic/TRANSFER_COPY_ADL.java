package gov.dlf.logic;


import gov.dlf.external.READ_MAIL;
import gov.dlf.facade.SAIC_DMQ_ORA_Application;

import java.util.Date;

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
import net.maintrend.util.MathService;
import net.maintrend.util.StringService;
import net.maintrend.util.TruncService;



/**
 * __Comment
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class TRANSFER_COPY_ADL
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

  public double CLIENTES_LOC = 0;

  public double CLIENTES_LOC_STAT = 0;

  public double MAIL_FILE = 0;

  public double MAIL_STATUS = 0;

  public double RMO = 0;

  public double RMO_READ_STAT = 0;



  public String OFICINA = null;

  public String SEGURO_SOCIAL_STR = null;

  public String NOMBRE_STR = null;

  public Date TODAY2 = null;

  public DataStore RMO_READ_DSD = null;

  public DataStore CLIENTES_LOC_DSD = null;

  public DataStore MAIL_CREATE_DSD = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setCLIENTES_LOC  ( RallyApplication __app, Parameter value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).CLIENTES_LOC = value.getDouble ( );
  }  

  
  /**  */
  public static void setCLIENTES_LOC_STAT  ( RallyApplication __app, Parameter value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).CLIENTES_LOC_STAT = value.getDouble ( );
  }  

  
  /**  */
  public static void setMAIL_FILE  ( RallyApplication __app, Parameter value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).MAIL_FILE = value.getDouble ( );
  }  

  
  /**  */
  public static void setMAIL_STATUS  ( RallyApplication __app, Parameter value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).MAIL_STATUS = value.getDouble ( );
  }  

  
  /**  */
  public static void setRMO  ( RallyApplication __app, Parameter value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).RMO = value.getDouble ( );
  }  

  
  /**  */
  public static void setRMO_READ_STAT  ( RallyApplication __app, Parameter value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).RMO_READ_STAT = value.getDouble ( );
  }  

  
  /**  */
  public static void setOFICINA  ( RallyApplication __app, Parameter value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).OFICINA = value.getString ( );
  }  

  
  /**  */
  public static void setSEGURO_SOCIAL_STR  ( RallyApplication __app, Parameter value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).SEGURO_SOCIAL_STR = value.getString ( );
  }  

  
  /**  */
  public static void setNOMBRE_STR  ( RallyApplication __app, Parameter value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).NOMBRE_STR = value.getString ( );
  }  

  
  /**  */
  public static void setTODAY2  ( RallyApplication __app, Parameter value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).TODAY2 = value.getDate ( );
  }  
    


  /**  */
  public static String getOFICINA  ( RallyApplication __app )
  {
    return ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).OFICINA;
  }


  /**  */
  public static void setOFICINA  ( RallyApplication __app, String value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).OFICINA = value;
  }


  /**  */
  public static void setOFICINA  ( RallyApplication __app, Object value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).OFICINA = ( String ) value;
  }



  /**  */
  public static String getSEGURO_SOCIAL_STR  ( RallyApplication __app )
  {
    return ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).SEGURO_SOCIAL_STR;
  }


  /**  */
  public static void setSEGURO_SOCIAL_STR  ( RallyApplication __app, String value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).SEGURO_SOCIAL_STR = value;
  }


  /**  */
  public static void setSEGURO_SOCIAL_STR  ( RallyApplication __app, Object value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).SEGURO_SOCIAL_STR = ( String ) value;
  }



  /**  */
  public static String getNOMBRE_STR  ( RallyApplication __app )
  {
    return ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).NOMBRE_STR;
  }


  /**  */
  public static void setNOMBRE_STR  ( RallyApplication __app, String value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).NOMBRE_STR = value;
  }


  /**  */
  public static void setNOMBRE_STR  ( RallyApplication __app, Object value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).NOMBRE_STR = ( String ) value;
  }



  /**  */
  public static Date getTODAY2  ( RallyApplication __app )
  {
    return ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).TODAY2;
  }


  /**  */
  public static void setTODAY2  ( RallyApplication __app, Date value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).TODAY2 = value;
  }


  /**  */
  public static void setTODAY2  ( RallyApplication __app, Object value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).TODAY2 = ( Date ) value;
  }



  /**  */
  public static DataStore getRMO_READ_DSD  ( RallyApplication __app )
  {
    return ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).RMO_READ_DSD;
  }


  /**  */
  public static void setRMO_READ_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).RMO_READ_DSD = value;
  }


  /**  */
  public static void setRMO_READ_DSD  ( RallyApplication __app, Object value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).RMO_READ_DSD = ( DataStore ) value;
  }



  /**  */
  public static DataStore getCLIENTES_LOC_DSD  ( RallyApplication __app )
  {
    return ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).CLIENTES_LOC_DSD;
  }


  /**  */
  public static void setCLIENTES_LOC_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).CLIENTES_LOC_DSD = value;
  }


  /**  */
  public static void setCLIENTES_LOC_DSD  ( RallyApplication __app, Object value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).CLIENTES_LOC_DSD = ( DataStore ) value;
  }



  /**  */
  public static DataStore getMAIL_CREATE_DSD  ( RallyApplication __app )
  {
    return ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).MAIL_CREATE_DSD;
  }


  /**  */
  public static void setMAIL_CREATE_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).MAIL_CREATE_DSD = value;
  }


  /**  */
  public static void setMAIL_CREATE_DSD  ( RallyApplication __app, Object value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).MAIL_CREATE_DSD = ( DataStore ) value;
  }




  /**  */
  public static double getCLIENTES_LOC  ( RallyApplication __app )
  {
    return ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).CLIENTES_LOC;
  }


  /**  */
  public static Double getCLIENTES_LOCDouble ( RallyApplication __app )
  {
    return new Double ( ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).CLIENTES_LOC );
  }


  /**  */
  public static void setCLIENTES_LOC  ( RallyApplication __app, double value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).CLIENTES_LOC = value;
  }


  /**  */
  public static void setCLIENTES_LOC  ( RallyApplication __app, Object value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).CLIENTES_LOC = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getCLIENTES_LOC_STAT  ( RallyApplication __app )
  {
    return ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).CLIENTES_LOC_STAT;
  }


  /**  */
  public static Double getCLIENTES_LOC_STATDouble ( RallyApplication __app )
  {
    return new Double ( ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).CLIENTES_LOC_STAT );
  }


  /**  */
  public static void setCLIENTES_LOC_STAT  ( RallyApplication __app, double value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).CLIENTES_LOC_STAT = value;
  }


  /**  */
  public static void setCLIENTES_LOC_STAT  ( RallyApplication __app, Object value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).CLIENTES_LOC_STAT = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getMAIL_FILE  ( RallyApplication __app )
  {
    return ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).MAIL_FILE;
  }


  /**  */
  public static Double getMAIL_FILEDouble ( RallyApplication __app )
  {
    return new Double ( ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).MAIL_FILE );
  }


  /**  */
  public static void setMAIL_FILE  ( RallyApplication __app, double value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).MAIL_FILE = value;
  }


  /**  */
  public static void setMAIL_FILE  ( RallyApplication __app, Object value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).MAIL_FILE = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getMAIL_STATUS  ( RallyApplication __app )
  {
    return ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).MAIL_STATUS;
  }


  /**  */
  public static Double getMAIL_STATUSDouble ( RallyApplication __app )
  {
    return new Double ( ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).MAIL_STATUS );
  }


  /**  */
  public static void setMAIL_STATUS  ( RallyApplication __app, double value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).MAIL_STATUS = value;
  }


  /**  */
  public static void setMAIL_STATUS  ( RallyApplication __app, Object value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).MAIL_STATUS = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getRMO  ( RallyApplication __app )
  {
    return ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).RMO;
  }


  /**  */
  public static Double getRMODouble ( RallyApplication __app )
  {
    return new Double ( ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).RMO );
  }


  /**  */
  public static void setRMO  ( RallyApplication __app, double value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).RMO = value;
  }


  /**  */
  public static void setRMO  ( RallyApplication __app, Object value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).RMO = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getRMO_READ_STAT  ( RallyApplication __app )
  {
    return ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).RMO_READ_STAT;
  }


  /**  */
  public static Double getRMO_READ_STATDouble ( RallyApplication __app )
  {
    return new Double ( ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).RMO_READ_STAT );
  }


  /**  */
  public static void setRMO_READ_STAT  ( RallyApplication __app, double value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).RMO_READ_STAT = value;
  }


  /**  */
  public static void setRMO_READ_STAT  ( RallyApplication __app, Object value )
  {
    ( ( TRANSFER_COPY_ADL ) __app.getADL ( TRANSFER_COPY_ADL.class ) ).RMO_READ_STAT = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static TRANSFER_COPY_ADL get ( RallyApplication __app )
  {
    TRANSFER_COPY_ADL adl = new TRANSFER_COPY_ADL ( );
    __app.register ( adl, "TRANSFER_COPY_ADL" );
    __app.setADL ( TRANSFER_COPY_ADL.class, adl ); 
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
    TRANSFER_COPY_ADL.get ( __app ).process ( ps );
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
    TRANSFER_COPY_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "TRANSFER_COPY_ADL" );
    if ( rObj != null && rObj instanceof TRANSFER_COPY_ADL )
    {
      this.app.setADL ( TRANSFER_COPY_ADL.class, ( TRANSFER_COPY_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "TRANSFER_COPY_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "TRANSFER_COPY_ADL ended" );
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

    TODAY2 = TruncService.trunc ( this.app.SYSTEM_DATE, "DDD" );
    //String answer = this.app.form ( "TRANSFER_COPY_ANS_FR" ).getStringItem ( "ANSWER" );
    String answer = this.app.ANS;
    if ( Compare.equals ( answer, "N" ) ) 
    {
      this.app.returnTo ( "TRANSFER_COPY_PKT" ); if ( true ) return;
    }
    else if ( ! Compare.equals ( answer, "S" ) )
    {
      this.app.errorFlag = false;
      this.doReturn ( );
      return; 
    }
    RMO_READ_DSD = this.dm.create ( "RMO_READ_DSD" );
    RMO = RMO_READ_DSD.getId ( );
    RMO_READ_STAT = RallyDataStoreException.getDefault ( );

    RMO_READ_STAT  = this.dm.reset ( RMO );

    this.dm.setField ( this.dm.get ( "RMO_READ_DSD" ), "COD_RMO", this.app.form ( "TRANSFER_COPY_FR" ).getDoubleItem ( "XFR_CLIENTES_RMO_ANTERIOR" ));

    RMO_READ_STAT  = this.dm.limitQueryFromBuffer ( RMO );
    RMO_READ_STAT  = this.dm.retrieve ( RMO );

    RMO_READ_STAT  = this.dm.firstRow ( RMO );

    OFICINA = this.dm.getFieldString ( this.dm.get ( "RMO_READ_DSD" ), "DSC_OFICINA" );
    CLIENTES_LOC_DSD = this.dm.create ( "CLIENTES_LOC_DSD" );
    CLIENTES_LOC = CLIENTES_LOC_DSD.getId ( );
    CLIENTES_LOC_STAT = RallyDataStoreException.getDefault ( );
    MAIL_CREATE_DSD = this.dm.create ( "MAIL_CREATE_DSD" );
    MAIL_FILE = MAIL_CREATE_DSD.getId ( );
    MAIL_STATUS = RallyDataStoreException.getDefault ( );

    CLIENTES_LOC_STAT  = this.dm.reset ( CLIENTES_LOC );

    this.dm.setField ( this.dm.get ( "CLIENTES_LOC_DSD" ), "SEGURO_SOCIAL_JEFE_FAMILIA", this.app.form ( "TRANSFER_COPY_FR" ).getDoubleItem ( "XFR_CLIENTES_SEGURO_SOCIAL_JEFE_FAM" ));

    CLIENTES_LOC_STAT  = this.dm.limitQueryFromBuffer ( CLIENTES_LOC );
    CLIENTES_LOC_STAT  = this.dm.retrieve ( CLIENTES_LOC );

    CLIENTES_LOC_STAT  = this.dm.firstRow ( CLIENTES_LOC );

    SEGURO_SOCIAL_STR = StringService.toStringValue  ( this.app.form ( "TRANSFER_COPY_FR" ).getDoubleItem ( "XFR_CLIENTES_SEGURO_SOCIAL_JEFE_FAM" ));
    NOMBRE_STR = this.app.form ( "TRANSFER_COPY_FR" ).getStringItem ( "XFR_CLIENTES_DSC_NOMBRE" )+ " " + this.app.form ( "TRANSFER_COPY_FR" ).getStringItem ( "XFR_CLIENTES_DSC_INICIAL" )+ " " + this.app.form ( "TRANSFER_COPY_FR" ).getStringItem ( "XFR_CLIENTES_DSC_APELLIDO_PATERNO" )+ " " + this.app.form ( "TRANSFER_COPY_FR" ).getStringItem ( "XFR_CLIENTES_DSC_APELLIDO_MATERNO" );
    if ( ! Compare.equals ( CLIENTES_LOC_STAT, 0 ) ) 
    {
      this.doReturn ( );
      return;
    }
    
    boolean tempBool = this.dm.getLogEnabled ( );
    
    while ( Compare.equals ( CLIENTES_LOC_STAT, 0 )  )
    {
      this.dm.setField ( this.dm.get ( "CLIENTES_LOC_DSD" ), "COD_STATUS", "ACTIVO" );
      this.dm.setField ( this.dm.get ( "CLIENTES_LOC_DSD" ), "FCH_STATUS", TODAY2 );

      this.dm.setLogEnabled ( false );
      
      CLIENTES_LOC_STAT  = this.dm.update ( CLIENTES_LOC );
      
      this.dm.setLogEnabled ( tempBool );
      
      if ( ! Compare.equals ( CLIENTES_LOC_STAT, 0 ) ) 
      {
        this.app.setError ( 0, CLIENTES_LOC_STAT );
        this.app.errorFlag = false;
        this.doReturn ( );
        return; 
      }

      CLIENTES_LOC_STAT  = this.dm.nextRow ( CLIENTES_LOC );

    }
    this.dm.setField ( this.dm.get ( "MAIL_CREATE_DSD" ), "TEXT_LINE", "#%" + this.dm.getFieldString ( this.dm.get ( "RMO_READ_DSD" ), "VMS_NODE" ) );

    this.dm.setLogEnabled ( false );
    
    MAIL_STATUS  = this.dm.insertRow ( MAIL_FILE );

    this.dm.setField ( this.dm.get ( "MAIL_CREATE_DSD" ), "TEXT_LINE", "#%El caso " + SEGURO_SOCIAL_STR + " " + NOMBRE_STR );

    MAIL_STATUS  = this.dm.insertRow ( MAIL_FILE );

    this.dm.setField ( this.dm.get ( "MAIL_CREATE_DSD" ), "TEXT_LINE", "#%recibido en " + this.app.OFICINA_GBL + " el " + StringService.toStringValue  ( this.app.SYSTEM_DATE ) );

    MAIL_STATUS  = this.dm.insertRow ( MAIL_FILE );

    this.dm.setLogEnabled ( tempBool );
    
    CLIENTES_LOC_STAT  = this.dm.dbCommit ( );
    MAIL_STATUS  = this.dm.dbClose ( MAIL_FILE );

    if ( ! Compare.equals ( MAIL_STATUS, 0 ) ) 
    {
      this.app.setError ( 1, MAIL_STATUS );
    }
    RMO_READ_STAT  = this.dm.dbClose ( RMO );

    CLIENTES_LOC_STAT  = this.dm.dbClose ( CLIENTES_LOC );

    if ( Compare.equals ( CLIENTES_LOC_STAT, 0 ) ) 
    {
      this._condition0 = true;
    }
    else
    {
      this._condition0 = false;
    }
    if ( this._condition0 )
    {
      this.app.form ( "TRANSFER_COPY_FR" ).setItem ( "COUNTER", MathService.minus ( this.app.form ( "TRANSFER_COPY_FR" ).getDoubleItem ( "COUNTER" ), 1  )  );
      //this.app.DCL_COMMAND_LINE = "RUN SAIC$APPL:MAIL_READ.EXE";

      this.callParms.clear ( );
      //RUN_NOTIFICACIONES.exec ( this.app, this.callParms );
      READ_MAIL.exec ( this.app, callParms );
      return;
    }
  }


  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( Compare.equals ( CLIENTES_LOC_STAT, 0 ) ) 
    {
      this.app.getLastForm ( "TRANSFER_COPY_FR" ).build ( );
      this.app.returnTo ( "TRANSFER_COPY_PKT" ); if ( true ) return;
    }
  }
}



/* ---------------------------------------------------------------------


     
procedure transfer_copy_adl;

var     clientes_loc:           number(9,0);
        clientes_loc_stat:      number(9,0);

        mail_file:              number(9,0);
        mail_status:            number(9,0);
        rmo:                    number(9,0);
        rmo_read_stat:          number(9,0);
{       status:                 number(9,0);}

        oficina:                char(15);
        seguro_social_str:      char(9);
        nombre_str:             char(35);
        TODAY2:                  date;

begin
        TODAY2:=trunc(system_date,'DDD');
        set_trace();
        if TRANSFER_COPY_ANS_FR.ANSWER = 'N'
        then 
            return_to TRANSFER_COPY_PKT;
        else
            if TRANSFER_COPY_ANS_FR.ANSWER <> 'S'
            then begin
                     set_failure();
                     return;
                 end;
            {end-if}
        {end-if}

        db_open(rmo_read_dsd,rmo,rmo_read_stat);
        db_reset(rmo,rmo_read_stat);
        rmo_read_dsd.cod_rmo:=TRANSFER_COPY_FR.XFR_CLIENTES_RMO_ANTERIOR;
        db_query(rmo,rmo_read_stat);
        db_get_first(rmo,rmo_read_stat);
        oficina:=RMO_READ_DSD.DSC_OFICINA;

        db_open(clientes_loc_dsd,clientes_loc,clientes_loc_stat);

        db_open(mail_create_dsd,mail_file,mail_status);

        db_reset(clientes_loc,clientes_loc_stat);
        clientes_loc_dsd.seguro_social_jefe_familia:=
                 TRANSFER_COPY_FR.XFR_CLIENTES_SEGURO_SOCIAL_JEFE_FAM;
        db_query(clientes_loc,clientes_loc_stat);
        db_get_first(clientes_loc,clientes_loc_stat);
        seguro_social_str:=to_char(TRANSFER_COPY_FR.XFR_CLIENTES_SEGURO_SOCIAL_J
EFE_FAM);
        nombre_str:=  TRANSFER_COPY_FR.XFR_CLIENTES_DSC_NOMBRE || ' ' ||
                      TRANSFER_COPY_FR.XFR_CLIENTES_DSC_INICIAL || ' ' ||
                      TRANSFER_COPY_FR.XFR_CLIENTES_DSC_APELLIDO_PATERNO || ' ' 
||
                      TRANSFER_COPY_FR.XFR_CLIENTES_DSC_APELLIDO_MATERNO;

        if clientes_loc_stat <> 0 then return;
        while clientes_loc_stat = 0 do
        begin
{Crea Clientes LOC}            
            clientes_loc_dsd.cod_status:='ACTIVO';
            clientes_loc_dsd.fch_status:=TODAY2;
            db_update(clientes_loc,clientes_loc_stat);
            if clientes_loc_stat <> 0 then
            begin
                error(clientes_loc_stat);
                set_failure();
                return;
            end;
            db_get_next(clientes_loc,clientes_loc_stat);
        end;

        mail_create_dsd.text_line:='#%'||RMO_READ_DSD.VMS_NODE;
        db_insert(mail_file,mail_status);
                                        
        mail_create_dsd.text_line:='#%El caso ' || seguro_social_str ||
                                           ' ' || nombre_str;
        db_insert(mail_file,mail_status);

        mail_create_dsd.text_line:='#%recibido en ' || oficina_gbl || ' el '
                                        || to_char(system_date);
        db_insert(mail_file,mail_status);

        db_commit(clientes_loc_stat);
        db_close(mail_file,mail_status);
        if mail_status <> 0 then error(mail_status);
        db_close(rmo,rmo_read_stat);


        db_close(clientes_loc,clientes_loc_stat);
        if clientes_loc_stat =0
        then
            begin
                TRANSFER_COPY_FR.COUNTER:=TRANSFER_COPY_FR.COUNTER - 1;
                DCL_COMMAND_LINE:='RUN SAIC$APPL:MAIL_READ.EXE';
                call RUN_NOTIFICACIONES;
                return_to transfer_copy_pkt;
            end;
end;
        

    



--------------------------------------------------------------------- */
