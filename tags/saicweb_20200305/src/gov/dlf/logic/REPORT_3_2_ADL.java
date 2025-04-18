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
public class REPORT_3_2_ADL
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

  public double SUPERVISOR_ID = 0;

  public double TECNICO_ID = 0;

  public double SERVICIOS_ACTIVOS = 0;

  public double SERVICIOS_CERRADOS = 0;

  public double SERVICIOS_SUSPENDIDOS = 0;

  public double SERVICIOS_ACTIVOS_ANT = 0;

  public double SERVICIOS_TOTAL_ACTIVOS = 0;

  public double SERVICIOS_TOTAL = 0;

  public double STATUS = 0;



  public String FLAG = null;

  public DataStore REPORT_3_2_ADL_DSD = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setSUPERVISOR_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SUPERVISOR_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setTECNICO_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).TECNICO_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setSERVICIOS_ACTIVOS  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_ACTIVOS = value.getDouble ( );
  }  

  
  /**  */
  public static void setSERVICIOS_CERRADOS  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_CERRADOS = value.getDouble ( );
  }  

  
  /**  */
  public static void setSERVICIOS_SUSPENDIDOS  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_SUSPENDIDOS = value.getDouble ( );
  }  

  
  /**  */
  public static void setSERVICIOS_ACTIVOS_ANT  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_ACTIVOS_ANT = value.getDouble ( );
  }  

  
  /**  */
  public static void setSERVICIOS_TOTAL_ACTIVOS  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_TOTAL_ACTIVOS = value.getDouble ( );
  }  

  
  /**  */
  public static void setFLAG  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).FLAG = value.getString ( );
  }  

  
  /**  */
  public static void setSERVICIOS_TOTAL  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_TOTAL = value.getDouble ( );
  }  

  
  /**  */
  public static void setSTATUS  ( RallyApplication __app, Parameter value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).STATUS = value.getDouble ( );
  }  
    


  /**  */
  public static String getFLAG  ( RallyApplication __app )
  {
    return ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).FLAG;
  }


  /**  */
  public static void setFLAG  ( RallyApplication __app, String value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).FLAG = value;
  }


  /**  */
  public static void setFLAG  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).FLAG = ( String ) value;
  }



  /**  */
  public static DataStore getREPORT_3_2_ADL_DSD  ( RallyApplication __app )
  {
    return ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).REPORT_3_2_ADL_DSD;
  }


  /**  */
  public static void setREPORT_3_2_ADL_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).REPORT_3_2_ADL_DSD = value;
  }


  /**  */
  public static void setREPORT_3_2_ADL_DSD  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).REPORT_3_2_ADL_DSD = ( DataStore ) value;
  }




  /**  */
  public static double getSUPERVISOR_ID  ( RallyApplication __app )
  {
    return ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SUPERVISOR_ID;
  }


  /**  */
  public static Double getSUPERVISOR_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SUPERVISOR_ID );
  }


  /**  */
  public static void setSUPERVISOR_ID  ( RallyApplication __app, double value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SUPERVISOR_ID = value;
  }


  /**  */
  public static void setSUPERVISOR_ID  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SUPERVISOR_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getTECNICO_ID  ( RallyApplication __app )
  {
    return ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).TECNICO_ID;
  }


  /**  */
  public static Double getTECNICO_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).TECNICO_ID );
  }


  /**  */
  public static void setTECNICO_ID  ( RallyApplication __app, double value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).TECNICO_ID = value;
  }


  /**  */
  public static void setTECNICO_ID  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).TECNICO_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSERVICIOS_ACTIVOS  ( RallyApplication __app )
  {
    return ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_ACTIVOS;
  }


  /**  */
  public static Double getSERVICIOS_ACTIVOSDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_ACTIVOS );
  }


  /**  */
  public static void setSERVICIOS_ACTIVOS  ( RallyApplication __app, double value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_ACTIVOS = value;
  }


  /**  */
  public static void setSERVICIOS_ACTIVOS  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_ACTIVOS = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSERVICIOS_CERRADOS  ( RallyApplication __app )
  {
    return ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_CERRADOS;
  }


  /**  */
  public static Double getSERVICIOS_CERRADOSDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_CERRADOS );
  }


  /**  */
  public static void setSERVICIOS_CERRADOS  ( RallyApplication __app, double value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_CERRADOS = value;
  }


  /**  */
  public static void setSERVICIOS_CERRADOS  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_CERRADOS = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSERVICIOS_SUSPENDIDOS  ( RallyApplication __app )
  {
    return ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_SUSPENDIDOS;
  }


  /**  */
  public static Double getSERVICIOS_SUSPENDIDOSDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_SUSPENDIDOS );
  }


  /**  */
  public static void setSERVICIOS_SUSPENDIDOS  ( RallyApplication __app, double value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_SUSPENDIDOS = value;
  }


  /**  */
  public static void setSERVICIOS_SUSPENDIDOS  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_SUSPENDIDOS = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSERVICIOS_ACTIVOS_ANT  ( RallyApplication __app )
  {
    return ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_ACTIVOS_ANT;
  }


  /**  */
  public static Double getSERVICIOS_ACTIVOS_ANTDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_ACTIVOS_ANT );
  }


  /**  */
  public static void setSERVICIOS_ACTIVOS_ANT  ( RallyApplication __app, double value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_ACTIVOS_ANT = value;
  }


  /**  */
  public static void setSERVICIOS_ACTIVOS_ANT  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_ACTIVOS_ANT = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSERVICIOS_TOTAL_ACTIVOS  ( RallyApplication __app )
  {
    return ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_TOTAL_ACTIVOS;
  }


  /**  */
  public static Double getSERVICIOS_TOTAL_ACTIVOSDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_TOTAL_ACTIVOS );
  }


  /**  */
  public static void setSERVICIOS_TOTAL_ACTIVOS  ( RallyApplication __app, double value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_TOTAL_ACTIVOS = value;
  }


  /**  */
  public static void setSERVICIOS_TOTAL_ACTIVOS  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_TOTAL_ACTIVOS = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSERVICIOS_TOTAL  ( RallyApplication __app )
  {
    return ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_TOTAL;
  }


  /**  */
  public static Double getSERVICIOS_TOTALDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_TOTAL );
  }


  /**  */
  public static void setSERVICIOS_TOTAL  ( RallyApplication __app, double value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_TOTAL = value;
  }


  /**  */
  public static void setSERVICIOS_TOTAL  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).SERVICIOS_TOTAL = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSTATUS  ( RallyApplication __app )
  {
    return ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).STATUS;
  }


  /**  */
  public static Double getSTATUSDouble ( RallyApplication __app )
  {
    return new Double ( ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).STATUS );
  }


  /**  */
  public static void setSTATUS  ( RallyApplication __app, double value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).STATUS = value;
  }


  /**  */
  public static void setSTATUS  ( RallyApplication __app, Object value )
  {
    ( ( REPORT_3_2_ADL ) __app.getADL ( REPORT_3_2_ADL.class ) ).STATUS = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static REPORT_3_2_ADL get ( RallyApplication __app )
  {
    REPORT_3_2_ADL adl = new REPORT_3_2_ADL ( );
    __app.register ( adl, "REPORT_3_2_ADL" );
    __app.setADL ( REPORT_3_2_ADL.class, adl ); 
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
    REPORT_3_2_ADL.get ( __app ).process ( ps );
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
    REPORT_3_2_ADL.exec ( __app, ps );
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
   * Populating the parameter set object with return values
   */
  protected void returnParms ( ParameterSet ps, double SUPERVISOR_ID, double TECNICO_ID, double SERVICIOS_ACTIVOS, double SERVICIOS_CERRADOS, double SERVICIOS_SUSPENDIDOS, double SERVICIOS_ACTIVOS_ANT, double SERVICIOS_TOTAL_ACTIVOS, String FLAG, double SERVICIOS_TOTAL )
  {
    ps.reset ( );
    ps.set ( SUPERVISOR_ID );
    ps.set ( TECNICO_ID );
    ps.set ( SERVICIOS_ACTIVOS );
    ps.set ( SERVICIOS_CERRADOS );
    ps.set ( SERVICIOS_SUSPENDIDOS );
    ps.set ( SERVICIOS_ACTIVOS_ANT );
    ps.set ( SERVICIOS_TOTAL_ACTIVOS );
    ps.set ( FLAG );
    ps.set ( SERVICIOS_TOTAL );
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
    IRegisteredObject rObj = this.app.get ( "REPORT_3_2_ADL" );
    if ( rObj != null && rObj instanceof REPORT_3_2_ADL )
    {
      this.app.setADL ( REPORT_3_2_ADL.class, ( REPORT_3_2_ADL ) rObj );
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
    Debug.println ( Debug.TRACE, "REPORT_3_2_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "REPORT_3_2_ADL ended" );
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
    ps.reset ( );
    SUPERVISOR_ID = ps.getDouble( );
    TECNICO_ID = ps.getDouble( );
    SERVICIOS_ACTIVOS = ps.getDouble( );
    SERVICIOS_CERRADOS = ps.getDouble( );
    SERVICIOS_SUSPENDIDOS = ps.getDouble( );
    SERVICIOS_ACTIVOS_ANT = ps.getDouble( );
    SERVICIOS_TOTAL_ACTIVOS = ps.getDouble( );
    FLAG = ps.getString( );
    SERVICIOS_TOTAL = ps.getDouble( );

    FLAG = " ";
    SERVICIOS_ACTIVOS = 0;
    SERVICIOS_CERRADOS = 0;
    SERVICIOS_SUSPENDIDOS = 0;
    SERVICIOS_ACTIVOS_ANT = 0;
    SERVICIOS_TOTAL = 0;
    SERVICIOS_TOTAL_ACTIVOS = 0;

    STATUS  = this.dm.reset ( REPORT_3_2_1_ADL.getSUPERVISOR_SERVICIOS_TABLE ( this.app ) );

    this.dm.setField ( this.dm.get ( "REPORT_3_2_ADL_DSD" ), "ID_SUPERVISOR", SUPERVISOR_ID );
    this.dm.setField ( this.dm.get ( "REPORT_3_2_ADL_DSD" ), "ID_TECNICO", TECNICO_ID );

    STATUS  = this.dm.limitQueryFromBuffer ( REPORT_3_2_1_ADL.getSUPERVISOR_SERVICIOS_TABLE ( this.app ) );
    STATUS  = this.dm.retrieve ( REPORT_3_2_1_ADL.getSUPERVISOR_SERVICIOS_TABLE ( this.app ) );

    STATUS  = this.dm.firstRow ( REPORT_3_2_1_ADL.getSUPERVISOR_SERVICIOS_TABLE ( this.app ) );

    while ( ! Compare.equals ( STATUS, RallyDataStoreExceptionType.EOS ) ) 
    {
      if ( Compare.equals ( STATUS, 0 ) ) 
      {
        if ( ( ( Compare.equals ( RallyStringService.subString ( this.dm.getFieldString ( this.dm.get ( "REPORT_3_2_ADL_DSD" ), "COD_STATUS_SERVICIO" ), 0, 4 ), "PEND" ) ) && ( ! Compare.equals ( this.dm.getFieldString ( this.dm.get ( "REPORT_3_2_ADL_DSD" ), "COD_STATUS_SERVICIO" ), "PENDDISP" ) )  ) || ( ( Compare.equals ( this.dm.getFieldString ( this.dm.get ( "REPORT_3_2_ADL_DSD" ), "COD_STATUS_SERVICIO" ), "ACTIVO" ) ) || ( Compare.equals ( this.dm.getFieldString ( this.dm.get ( "REPORT_3_2_ADL_DSD" ), "COD_STATUS_SERVICIO" ), "APELARAC" ) ) ) ) 
        {
          if ( ( Compare.ge ( this.dm.getFieldDate ( this.dm.get ( "REPORT_3_2_ADL_DSD" ), "FCH_SOLICITUD" ), this.app.form ( "REPORT_3_2_FR" ).getDateItem ( "DESDE_FECHA" )) ) && ( Compare.le ( this.dm.getFieldDate ( this.dm.get ( "REPORT_3_2_ADL_DSD" ), "FCH_SOLICITUD" ), this.app.form ( "REPORT_3_2_FR" ).getDateItem ( "HASTA_FECHA" )) )  ) 
          {
            SERVICIOS_ACTIVOS = MathService.plus ( SERVICIOS_ACTIVOS, 1  );
          }
          else
          {
            SERVICIOS_ACTIVOS_ANT = MathService.plus ( SERVICIOS_ACTIVOS_ANT, 1  );
          }
          SERVICIOS_TOTAL = MathService.plus ( SERVICIOS_TOTAL, 1  );
          SERVICIOS_TOTAL_ACTIVOS = MathService.plus ( SERVICIOS_TOTAL_ACTIVOS, 1  );
        }
        else
        {
          if ( ( ( Compare.equals ( this.dm.getFieldString ( this.dm.get ( "REPORT_3_2_ADL_DSD" ), "COD_STATUS_SERVICIO" ), "PENDDISP" ) ) || ( Compare.equals ( this.dm.getFieldString ( this.dm.get ( "REPORT_3_2_ADL_DSD" ), "COD_STATUS_SERVICIO" ), "PENDFOND" ) ) ) && ( ( Compare.ge ( this.dm.getFieldDate ( this.dm.get ( "REPORT_3_2_ADL_DSD" ), "FCH_SOLICITUD" ), this.app.form ( "REPORT_3_2_FR" ).getDateItem ( "DESDE_FECHA" )) ) && ( Compare.le ( this.dm.getFieldDate ( this.dm.get ( "REPORT_3_2_ADL_DSD" ), "FCH_SOLICITUD" ), this.app.form ( "REPORT_3_2_FR" ).getDateItem ( "HASTA_FECHA" )) )  )  ) 
          {
            SERVICIOS_TOTAL = MathService.plus ( SERVICIOS_TOTAL, 1  );
            SERVICIOS_SUSPENDIDOS = MathService.plus ( SERVICIOS_SUSPENDIDOS, 1  );
          }
          else
          {
            if ( ( ( Compare.equals ( RallyStringService.subString ( this.dm.getFieldString ( this.dm.get ( "REPORT_3_2_ADL_DSD" ), "COD_STATUS_SERVICIO" ), 0, 4 ), "CERR" ) ) && ( ( Compare.ge ( this.dm.getFieldDate ( this.dm.get ( "REPORT_3_2_ADL_DSD" ), "FCH_CERRADO" ), this.app.form ( "REPORT_3_2_FR" ).getDateItem ( "DESDE_FECHA" )) ) && ( Compare.le ( this.dm.getFieldDate ( this.dm.get ( "REPORT_3_2_ADL_DSD" ), "FCH_CERRADO" ), this.app.form ( "REPORT_3_2_FR" ).getDateItem ( "HASTA_FECHA" )) )  )  ) || ( ( Compare.equals ( this.dm.getFieldString ( this.dm.get ( "REPORT_3_2_ADL_DSD" ), "COD_STATUS_SERVICIO" ), "APELARCE" ) ) && ( ( Compare.ge ( this.dm.getFieldDate ( this.dm.get ( "REPORT_3_2_ADL_DSD" ), "FCH_SOLICITUD" ), this.app.form ( "REPORT_3_2_FR" ).getDateItem ( "DESDE_FECHA" )) ) && ( Compare.le ( this.dm.getFieldDate ( this.dm.get ( "REPORT_3_2_ADL_DSD" ), "FCH_SOLICITUD" ), this.app.form ( "REPORT_3_2_FR" ).getDateItem ( "HASTA_FECHA" )) )  )  ) ) 
            {
              SERVICIOS_TOTAL = MathService.plus ( SERVICIOS_TOTAL, 1  );
              SERVICIOS_CERRADOS = MathService.plus ( SERVICIOS_CERRADOS, 1  );
            }
          }
        }

        STATUS  = this.dm.nextRow ( REPORT_3_2_1_ADL.getSUPERVISOR_SERVICIOS_TABLE ( this.app ) );

      }
    }
    this.returnParms ( ps, SUPERVISOR_ID, TECNICO_ID, SERVICIOS_ACTIVOS, SERVICIOS_CERRADOS, SERVICIOS_SUSPENDIDOS, SERVICIOS_ACTIVOS_ANT, SERVICIOS_TOTAL_ACTIVOS, FLAG, SERVICIOS_TOTAL );

  }
}



/* ---------------------------------------------------------------------


     

procedure report_3_2_adl (var supervisor_id     :       number;
                          var tecnico_id        :       number;
                          var servicios_activos :       number;
                          var servicios_cerrados    :   number;
                          var servicios_suspendidos :   number;
                          var servicios_activos_ant :   number;
                          var servicios_total_activos : number;
                          var flag             :   char(1);
                          var servicios_total   :       number;);

{LOCAL VARIABLES}

var supervisor_servicios_table  
        : number(9,0) import report_3_2_1_adl.supervisor_servicios_table;
        status                  :       number(9,0);

{VARIABLES INIT}
flag := ' ';
servicios_activos := 0;
servicios_cerrados := 0;
servicios_suspendidos := 0;
servicios_activos_ant := 0;
servicios_total := 0;
servicios_total_activos := 0;

{MAIN BEGIN LOGIC}

begin
SET_TRACE();

{LETS CLEAR OUR MIND FIRST}

db_reset(supervisor_servicios_table,status);

{SET DSD VALUES TO LOOK FOR}

REPORT_3_2_ADL_DSD.ID_SUPERVISOR := supervisor_id;
REPORT_3_2_ADL_DSD.ID_TECNICO    := tecnico_id;

{LETS SEE IF THIS PEOPLE IS WORKING ON SOMETHING}

db_query(supervisor_servicios_table,status);
db_get_first(supervisor_servicios_table,status);

while (status <> db_eos) do
begin
      if ( status = 0 ) then 
       begin

     {activo} 
 if ((substr(REPORT_3_2_ADL_DSD.COD_STATUS_SERVICIO,0,4) = 'PEND') and 
     (REPORT_3_2_ADL_DSD.COD_STATUS_SERVICIO <> 'PENDDISP')) or 
     ((REPORT_3_2_ADL_DSD.COD_STATUS_SERVICIO = 'ACTIVO') or 
     (REPORT_3_2_ADL_DSD.COD_STATUS_SERVICIO = 'APELARAC'))
    then begin
     if  (REPORT_3_2_ADL_DSD.FCH_SOLICITUD >= REPORT_3_2_FR.DESDE_FECHA) and 
        ( REPORT_3_2_ADL_DSD.FCH_SOLICITUD <= REPORT_3_2_FR.HASTA_FECHA) then
         servicios_activos := servicios_activos + 1;
     else servicios_activos_ant := servicios_activos_ant + 1;
             servicios_total := servicios_total + 1;
             servicios_total_activos := servicios_total_activos + 1;
     end;{end-if-activo}

 else {suspendido}

    if ((REPORT_3_2_ADL_DSD.COD_STATUS_SERVICIO = 'PENDDISP') or 
        (REPORT_3_2_ADL_DSD.COD_STATUS_SERVICIO = 'PENDFOND')) and 
       ((REPORT_3_2_ADL_DSD.FCH_SOLICITUD >= REPORT_3_2_FR.DESDE_FECHA) and 
       (REPORT_3_2_ADL_DSD.FCH_SOLICITUD <= REPORT_3_2_FR.HASTA_FECHA))      
        then  begin
              servicios_total := servicios_total + 1;
              servicios_suspendidos := servicios_suspendidos + 1;
             end; {end-if-suspendido}
 
else {cerrado}
  
     if (((substr(REPORT_3_2_ADL_DSD.COD_STATUS_SERVICIO,0,4) = 'CERR') and 
        ((REPORT_3_2_ADL_DSD.FCH_CERRADO >= REPORT_3_2_FR.DESDE_FECHA) and 
       (REPORT_3_2_ADL_DSD.FCH_CERRADO <= REPORT_3_2_FR.HASTA_FECHA))) or 
       ((REPORT_3_2_ADL_DSD.COD_STATUS_SERVICIO = 'APELARCE') and 
       ((REPORT_3_2_ADL_DSD.FCH_SOLICITUD >= REPORT_3_2_FR.DESDE_FECHA) and 
        (REPORT_3_2_ADL_DSD.FCH_SOLICITUD <= REPORT_3_2_FR.HASTA_FECHA))))
        then  begin
                      servicios_total := servicios_total + 1;
                     servicios_cerrados := servicios_cerrados + 1;        
              end; {end-if-cerrado}

        db_get_next(supervisor_servicios_table,status);

       end;
       {end-begin-status=0)}
end;
{end-while-loop}
SET_NOTRACE();
end;
{END-MAIN-BEGIN}

    



--------------------------------------------------------------------- */
