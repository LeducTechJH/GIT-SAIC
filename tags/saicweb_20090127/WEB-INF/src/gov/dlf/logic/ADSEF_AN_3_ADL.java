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
public class ADSEF_AN_3_ADL
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
 
  public boolean _condition1 = false;
 
  public boolean _condition2 = false;
 
  public boolean _condition3 = false;

 

  // -------------------------------------------------------------------
  // ----------   Instance Export Attributes   -------------------------

  public double SSJF = 0;

  public double SSMF = 0;

  public double OPEN_CLIENTE = 0;

  public double OPEN_SERVICIO = 0;

  public double STATUS_CLIENTE = 0;

  public double STATUS_SERVICIO = 0;



  public String NOMBRE = null;

  public String RMO = null;

  public String REGION = null;

  public String MUNI = null;

  public DataStore CLIENTES2_RO_DSD = null;

  public DataStore SERVICIOS_READ_LOC2_DSD = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setSSJF  ( RallyApplication __app, Parameter value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).SSJF = value.getDouble ( );
  }  

  
  /**  */
  public static void setSSMF  ( RallyApplication __app, Parameter value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).SSMF = value.getDouble ( );
  }  

  
  /**  */
  public static void setNOMBRE  ( RallyApplication __app, Parameter value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).NOMBRE = value.getString ( );
  }  

  
  /**  */
  public static void setRMO  ( RallyApplication __app, Parameter value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).RMO = value.getString ( );
  }  

  
  /**  */
  public static void setREGION  ( RallyApplication __app, Parameter value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).REGION = value.getString ( );
  }  

  
  /**  */
  public static void setMUNI  ( RallyApplication __app, Parameter value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).MUNI = value.getString ( );
  }  

  
  /**  */
  public static void setOPEN_CLIENTE  ( RallyApplication __app, Parameter value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).OPEN_CLIENTE = value.getDouble ( );
  }  

  
  /**  */
  public static void setOPEN_SERVICIO  ( RallyApplication __app, Parameter value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).OPEN_SERVICIO = value.getDouble ( );
  }  

  
  /**  */
  public static void setSTATUS_CLIENTE  ( RallyApplication __app, Parameter value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).STATUS_CLIENTE = value.getDouble ( );
  }  

  
  /**  */
  public static void setSTATUS_SERVICIO  ( RallyApplication __app, Parameter value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).STATUS_SERVICIO = value.getDouble ( );
  }  
    


  /**  */
  public static String getNOMBRE  ( RallyApplication __app )
  {
    return ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).NOMBRE;
  }


  /**  */
  public static void setNOMBRE  ( RallyApplication __app, String value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).NOMBRE = value;
  }


  /**  */
  public static void setNOMBRE  ( RallyApplication __app, Object value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).NOMBRE = ( String ) value;
  }



  /**  */
  public static String getRMO  ( RallyApplication __app )
  {
    return ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).RMO;
  }


  /**  */
  public static void setRMO  ( RallyApplication __app, String value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).RMO = value;
  }


  /**  */
  public static void setRMO  ( RallyApplication __app, Object value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).RMO = ( String ) value;
  }



  /**  */
  public static String getREGION  ( RallyApplication __app )
  {
    return ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).REGION;
  }


  /**  */
  public static void setREGION  ( RallyApplication __app, String value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).REGION = value;
  }


  /**  */
  public static void setREGION  ( RallyApplication __app, Object value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).REGION = ( String ) value;
  }



  /**  */
  public static String getMUNI  ( RallyApplication __app )
  {
    return ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).MUNI;
  }


  /**  */
  public static void setMUNI  ( RallyApplication __app, String value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).MUNI = value;
  }


  /**  */
  public static void setMUNI  ( RallyApplication __app, Object value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).MUNI = ( String ) value;
  }



  /**  */
  public static DataStore getCLIENTES2_RO_DSD  ( RallyApplication __app )
  {
    return ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).CLIENTES2_RO_DSD;
  }


  /**  */
  public static void setCLIENTES2_RO_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).CLIENTES2_RO_DSD = value;
  }


  /**  */
  public static void setCLIENTES2_RO_DSD  ( RallyApplication __app, Object value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).CLIENTES2_RO_DSD = ( DataStore ) value;
  }



  /**  */
  public static DataStore getSERVICIOS_READ_LOC2_DSD  ( RallyApplication __app )
  {
    return ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).SERVICIOS_READ_LOC2_DSD;
  }


  /**  */
  public static void setSERVICIOS_READ_LOC2_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).SERVICIOS_READ_LOC2_DSD = value;
  }


  /**  */
  public static void setSERVICIOS_READ_LOC2_DSD  ( RallyApplication __app, Object value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).SERVICIOS_READ_LOC2_DSD = ( DataStore ) value;
  }




  /**  */
  public static double getSSJF  ( RallyApplication __app )
  {
    return ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).SSJF;
  }


  /**  */
  public static Double getSSJFDouble ( RallyApplication __app )
  {
    return new Double ( ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).SSJF );
  }


  /**  */
  public static void setSSJF  ( RallyApplication __app, double value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).SSJF = value;
  }


  /**  */
  public static void setSSJF  ( RallyApplication __app, Object value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).SSJF = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSSMF  ( RallyApplication __app )
  {
    return ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).SSMF;
  }


  /**  */
  public static Double getSSMFDouble ( RallyApplication __app )
  {
    return new Double ( ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).SSMF );
  }


  /**  */
  public static void setSSMF  ( RallyApplication __app, double value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).SSMF = value;
  }


  /**  */
  public static void setSSMF  ( RallyApplication __app, Object value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).SSMF = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getOPEN_CLIENTE  ( RallyApplication __app )
  {
    return ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).OPEN_CLIENTE;
  }


  /**  */
  public static Double getOPEN_CLIENTEDouble ( RallyApplication __app )
  {
    return new Double ( ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).OPEN_CLIENTE );
  }


  /**  */
  public static void setOPEN_CLIENTE  ( RallyApplication __app, double value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).OPEN_CLIENTE = value;
  }


  /**  */
  public static void setOPEN_CLIENTE  ( RallyApplication __app, Object value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).OPEN_CLIENTE = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getOPEN_SERVICIO  ( RallyApplication __app )
  {
    return ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).OPEN_SERVICIO;
  }


  /**  */
  public static Double getOPEN_SERVICIODouble ( RallyApplication __app )
  {
    return new Double ( ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).OPEN_SERVICIO );
  }


  /**  */
  public static void setOPEN_SERVICIO  ( RallyApplication __app, double value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).OPEN_SERVICIO = value;
  }


  /**  */
  public static void setOPEN_SERVICIO  ( RallyApplication __app, Object value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).OPEN_SERVICIO = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSTATUS_CLIENTE  ( RallyApplication __app )
  {
    return ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).STATUS_CLIENTE;
  }


  /**  */
  public static Double getSTATUS_CLIENTEDouble ( RallyApplication __app )
  {
    return new Double ( ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).STATUS_CLIENTE );
  }


  /**  */
  public static void setSTATUS_CLIENTE  ( RallyApplication __app, double value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).STATUS_CLIENTE = value;
  }


  /**  */
  public static void setSTATUS_CLIENTE  ( RallyApplication __app, Object value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).STATUS_CLIENTE = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSTATUS_SERVICIO  ( RallyApplication __app )
  {
    return ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).STATUS_SERVICIO;
  }


  /**  */
  public static Double getSTATUS_SERVICIODouble ( RallyApplication __app )
  {
    return new Double ( ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).STATUS_SERVICIO );
  }


  /**  */
  public static void setSTATUS_SERVICIO  ( RallyApplication __app, double value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).STATUS_SERVICIO = value;
  }


  /**  */
  public static void setSTATUS_SERVICIO  ( RallyApplication __app, Object value )
  {
    ( ( ADSEF_AN_3_ADL ) __app.getADL ( ADSEF_AN_3_ADL.class ) ).STATUS_SERVICIO = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static ADSEF_AN_3_ADL get ( RallyApplication __app )
  {
    ADSEF_AN_3_ADL adl = new ADSEF_AN_3_ADL ( );
    __app.register ( adl, "ADSEF_AN_3_ADL" );
    __app.setADL ( ADSEF_AN_3_ADL.class, adl ); 
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
    ADSEF_AN_3_ADL.get ( __app ).process ( ps );
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
    ADSEF_AN_3_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "ADSEF_AN_3_ADL" );
    if ( rObj != null && rObj instanceof ADSEF_AN_3_ADL )
    {
      this.app.setADL ( ADSEF_AN_3_ADL.class, ( ADSEF_AN_3_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "ADSEF_AN_3_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
      case 2:  { this.currentStep ++; this.step2 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "ADSEF_AN_3_ADL ended" );
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

    SSJF = TruncService.setNull ( SSJF  );
    SSMF = TruncService.setNull ( SSMF  );
    NOMBRE = TruncService.setNull ( NOMBRE  );
    RMO = TruncService.setNull ( RMO  );
    SSJF = this.app.SSN_JEFE_FAM_GBL;
    this.app.SSN_GBL = this.app.SS_CLIENTE_GBL;
    CLIENTES2_RO_DSD = this.dm.create ( "CLIENTES2_RO_DSD" );
    OPEN_CLIENTE = CLIENTES2_RO_DSD.getId ( );
    STATUS_CLIENTE = RallyDataStoreException.getDefault ( );
    if ( ! Compare.equals ( STATUS_CLIENTE, 0 ) ) 
    {
      this.app.setError ( 0, STATUS_CLIENTE );
      STATUS_CLIENTE  = this.dm.dbClose ( OPEN_CLIENTE );

      this.doReturn ( );
      return; 
    }

    STATUS_CLIENTE  = this.dm.reset ( OPEN_CLIENTE );

    if ( ! Compare.equals ( STATUS_CLIENTE, 0 ) ) 
    {
      this.app.setError ( 1, STATUS_CLIENTE );
      STATUS_CLIENTE  = this.dm.dbClose ( OPEN_CLIENTE );

      this.doReturn ( );
      return; 
    }
    this.dm.setField ( this.dm.get ( "CLIENTES2_RO_DSD" ), "SEGURO_SOCIAL_CLIENTE", this.app.SSN_GBL );
    this.dm.setField ( this.dm.get ( "CLIENTES2_RO_DSD" ), "RMO_OFICINA", this.app.RMO_GBL );

    STATUS_CLIENTE  = this.dm.limitQueryFromBuffer ( OPEN_CLIENTE );
    STATUS_CLIENTE  = this.dm.retrieve ( OPEN_CLIENTE );

    if ( Compare.equals ( STATUS_CLIENTE, 0 ) ) 
    {
      this._condition0 = true;
    }
    else
    {
      this._condition0 = false;
    }
    if ( this._condition0 )
    {
      STATUS_CLIENTE  = this.dm.firstRow ( OPEN_CLIENTE );

      if ( Compare.equals ( STATUS_CLIENTE, 0 ) ) 
      {
        this._condition1 = true;
      }
      else
      {
        this._condition1 = false;
      }
      if ( this._condition1 )
      {
        SSMF = this.dm.getFieldDouble ( this.dm.get ( "CLIENTES2_RO_DSD" ), "SEGURO_SOCIAL_CLIENTE" );
        NOMBRE = this.dm.getFieldString ( this.dm.get ( "CLIENTES2_RO_DSD" ), "DSC_NOMBRE" ) + " " + this.dm.getFieldString ( this.dm.get ( "CLIENTES2_RO_DSD" ), "DSC_INICIAL" ) + " " + this.dm.getFieldString ( this.dm.get ( "CLIENTES2_RO_DSD" ), "DSC_APELLIDO_PATERNO" ) + " " + this.dm.getFieldString ( this.dm.get ( "CLIENTES2_RO_DSD" ), "DSC_APELLIDO_MATERNO" );
        SERVICIOS_READ_LOC2_DSD = this.dm.create ( "SERVICIOS_READ_LOC2_DSD" );
        OPEN_SERVICIO = SERVICIOS_READ_LOC2_DSD.getId ( );
        STATUS_SERVICIO = RallyDataStoreException.getDefault ( );
        if ( ! Compare.equals ( STATUS_SERVICIO, 0 ) ) 
        {
          this.app.setError ( 2, STATUS_SERVICIO );
          STATUS_SERVICIO  = this.dm.dbClose ( OPEN_SERVICIO );

          this.doReturn ( );
          return; 
        }

        STATUS_SERVICIO  = this.dm.reset ( OPEN_SERVICIO );

        if ( ! Compare.equals ( STATUS_SERVICIO, 0 ) ) 
        {
          this.app.setError ( 3, STATUS_SERVICIO );
          STATUS_SERVICIO  = this.dm.dbClose ( OPEN_SERVICIO );

          this.doReturn ( );
          return; 
        }
        this.dm.setField ( this.dm.get ( "SERVICIOS_READ_LOC2_DSD" ), "SEGURO_SOCIAL_JEFE_FAM", SSJF );
        this.dm.setField ( this.dm.get ( "SERVICIOS_READ_LOC2_DSD" ), "COD_SERVICIO", "PAN" );
        this.dm.setField ( this.dm.get ( "SERVICIOS_READ_LOC2_DSD" ), "RMO_OFICINA", this.app.RMO_GBL );

        STATUS_SERVICIO  = this.dm.limitQueryFromBuffer ( OPEN_SERVICIO );
        STATUS_SERVICIO  = this.dm.retrieve ( OPEN_SERVICIO );

        if ( Compare.equals ( STATUS_SERVICIO, 0 ) ) 
        {
          this._condition2 = true;
        }
        else
        {
          this._condition2 = false;
        }
        if ( this._condition2 )
        {
          STATUS_SERVICIO  = this.dm.firstRow ( OPEN_SERVICIO );

          if ( Compare.equals ( STATUS_SERVICIO, 0 ) ) 
          {
            this._condition3 = true;
          }
          else
          {
            this._condition3 = false;
          }
          if ( this._condition3 )
          {
            this.callParms.clear ( );
            this.callParms.set ( this.dm.getFieldDouble ( this.dm.get ( "CLIENTES2_RO_DSD" ), "RMO_COD" )  );
            this.callParms.set ( REGION  );
            this.callParms.set ( MUNI  );
            this.callParms.set ( RMO  );
            GET_RMO_INFO_ADL.exec ( this.app, this.callParms );
            return;
          }
        }
      }
    }

  }


  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( Compare.equals ( STATUS_CLIENTE, 0 ) ) 
    {
      if ( this._condition1 )    //      if ( Compare.equals ( STATUS_CLIENTE, 0 ) ) 
      {
        if ( this._condition2 )    //        if ( Compare.equals ( STATUS_SERVICIO, 0 ) ) 
        {
          if ( this._condition3 )    //          if ( Compare.equals ( STATUS_SERVICIO, 0 ) ) 
          {
            this.callParms.reset ( );
            this.dm.setField ( this.dm.get ( "CLIENTES2_RO_DSD" ), "RMO_COD", this.callParms.getDouble ( ) );
            REGION  = this.callParms.getString ( );
            MUNI  = this.callParms.getString ( );
            RMO  = this.callParms.getString ( );

          }
        }
        STATUS_SERVICIO  = this.dm.dbClose ( OPEN_SERVICIO );

        ADSEF_AN_3_PKT.exec ( this.app );
        return;
      }
    }

  }


  /**
   *
   */
  protected void step2 ( ParameterSet ps )
  {
    STATUS_CLIENTE  = this.dm.dbClose ( OPEN_CLIENTE );

  }
}



/* ---------------------------------------------------------------------


     
procedure adsef_an_3_adl;
{ Las variables que se definen a continuacion estan conforme a las columnas}
{ presentadas en la forma }
VAR     
        ssjf            :       number export;
        ssmf            :       number export;
        nombre          :       char export;
        rmo             :       char export;
        region          :       char;
        muni            :       char;
        open_cliente            :       number(9,0);
        open_servicio           :       number(9,0);
        status_cliente  :       number(9,0);
        status_servicio :       number(9,0);

begin
{es necesario inicializar las variables}
make_null(ssjf);
make_null(ssmf);
make_null(nombre);
make_null(rmo);
{}
{Es necesario inicializar las siguientes variables globales}
{para el cual se desea imprimir este reporte: }
{       ssn_gbl = cliente deseado}
{test}
{ssn_gbl := 989998888;}
{}
ssjf := SSN_JEFE_FAM_GBL;
ssn_gbl := SS_CLIENTE_GBL;
db_open(CLIENTES2_RO_DSD,open_cliente,status_cliente);
if status_cliente <> 0 then
begin
        error(status_cliente);
        db_close(open_cliente,status_cliente);
        return;
end;
db_reset(open_cliente,status_cliente);
if status_cliente <> 0 then
begin
        error(status_cliente);
        db_close(open_cliente,status_cliente);
        return;
end;
CLIENTES2_RO_DSD.seguro_social_cliente := ssn_gbl;
CLIENTES2_RO_DSD.RMO_OFICINA := RMO_GBL;
db_query(open_cliente,status_cliente);
IF status_cliente = 0 THEN
begin
        db_get_first(open_cliente,status_cliente);
        IF status_cliente = 0 THEN
        begin
                ssmf := CLIENTES2_RO_DSD.seguro_social_cliente;
                nombre:=CLIENTES2_RO_DSD.dsc_nombre || ' ' ||
                           CLIENTES2_RO_DSD.dsc_inicial || ' ' ||
                           CLIENTES2_RO_DSD.dsc_apellido_paterno || ' ' ||
                           CLIENTES2_RO_DSD.dsc_apellido_materno;
{busqueda del servicio start}
                db_open(SERVICIOS_READ_LOC2_DSD,open_servicio,status_servicio);
                if status_servicio <> 0 then
                begin
                        error(status_servicio);
                        db_close(open_servicio,status_servicio);
                        return;
                end;
                db_reset(open_servicio,status_servicio);
                if status_servicio <> 0 then
                begin
                        error(status_servicio);
                        db_close(open_servicio,status_servicio);
                        return;
                end;
                SERVICIOS_READ_LOC2_DSD.seguro_social_jefe_fam := ssjf;
                SERVICIOS_READ_LOC2_DSD.cod_servicio := 'PAN';
                SERVICIOS_READ_LOC2_DSD.RMO_OFICINA := RMO_GBL;
                db_query(open_servicio,status_servicio);
                IF status_servicio = 0 THEN
                begin
                        db_get_first(open_servicio,status_servicio);
                        IF status_servicio = 0 THEN
                        begin
                                call get_rmo_info_adl(CLIENTES2_RO_DSD.rmo_cod,r
egion,muni,rmo);
                        end;
                end;
                db_close(open_servicio,status_servicio);
{busqueda servicio end}
                call adsef_an_3_pkt;
        end;

end;
{endif}
db_close(open_cliente,status_cliente);
end;
    



--------------------------------------------------------------------- */
