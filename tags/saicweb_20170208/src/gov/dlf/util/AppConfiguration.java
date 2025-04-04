package gov.dlf.util;



import java.util.Date;

import net.maintrend.datamanager.DataManager;
import net.maintrend.datamanager.DataStore;
import net.maintrend.datamanager.DataStoreAdapterSqlDisconnected;
import net.maintrend.datamanager.DataStoreRow;
import net.maintrend.rallyengine.RallyApplication;



/**
 * 
 * @author Raphael Pulner (MainTrend Ltd.) for Departamento de la Familia, 2008
 */
public class AppConfiguration
{
  // -------------------------------------------------------------------
  // ----------   Instance Attributes   --------------------------------

  /**  */
  protected RallyApplication                app;
  /**  */
  protected DataManager                     dataManager;



  // -------------------------------------------------------------------
  // ----------   Constructors and supporting methods   ----------------

  /**
   * 
   * @param rApp
   */
  public AppConfiguration ( RallyApplication rApp )
  {
    this.app = rApp;
    if ( rApp != null )
    {
      this.setDataManager ( ( DataManager ) rApp.getDataManager ( ) );
    }
  }


  /**
   * 
   *  @param dm
   */
  public AppConfiguration ( DataManager dm )
  {
    this.setDataManager ( dm );
  }



  // -------------------------------------------------------------------
  // ----------   Access Methods   -------------------------------------

  /**
   * 
   * @return
   */
  public DataManager getDataManager ( )
  {
    return this.dataManager;
  }


  /**
   * 
   * @param dm
   */
  public void setDataManager ( DataManager dm )
  {
    this.dataManager = dm;
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * Usage example:
   * 
   * AppConfiguration cnf = new AppConfiguration ( app );
   * DataStoreRow dRow = cnf.getParameter ( "01-JAN-2000", "AE-A" );
   * System.out.println ( "NECESIDAD_AJUSTADA = " + dRow.getItemDouble ( "NECESIDAD_AJUSTADA" ) );
   * 
   * @param start
   * @param serviceCode
   * @return
   */
  public DataStoreRow getParameterRow ( String startDate, String serviceCode )
  {
    DataStoreRow dRow = null;

    DataStore ds = new DataStore ( );
    ds.setDataManager ( this.dataManager );

    DataStoreAdapterSqlDisconnected adapter = new DataStoreAdapterSqlDisconnected ( ds );
    adapter.setConnection ( this.dataManager.getDefaultConnection ( ) );

    ds.setAdapter ( adapter );

    String sql = "select ";
    sql += "DETERMINACION_TABLE.FECHA_EFECTIVIDAD, "; 
    sql += "DETERMINACION_TABLE.COD_SERVICIO, "; 
    sql += "DETERMINACION_TABLE.NECESIDAD_AJUSTADA, "; 
    sql += "DETERMINACION_TABLE.NECESIDAD_AJUSTADA_HOSU, "; 
    sql += "DETERMINACION_TABLE.RECURSOS_ACUM, "; 
    sql += "DETERMINACION_TABLE.RECURSOS_ACUM_INCA, "; 
    sql += "DETERMINACION_TABLE.RECURSOS_ACUM_TOT, "; 
    sql += "DETERMINACION_TABLE.RECURSOS_VEHI, "; 
    sql += "DETERMINACION_TABLE.RECURSOS_PATRO, "; 
    sql += "DETERMINACION_TABLE.GASTOS_PROD, "; 
    sql += "DETERMINACION_TABLE.GASTOS_ALBERGUE, "; 
    sql += "DETERMINACION_TABLE.GASTOS_PROD_CONY, "; 
    sql += "DETERMINACION_TABLE.GASTOS_ALBE_CONY, "; 
    sql += "DETERMINACION_TABLE.AYUDA_FAM, "; 
    sql += "DETERMINACION_TABLE.EXENCION_SALARIO, "; 
    sql += "DETERMINACION_TABLE.EXENCION_SAL_MENOR, "; 
    sql += "DETERMINACION_TABLE.EXENCION_SAL_MAYOR, "; 
    sql += "DETERMINACION_TABLE.BENEFICIO_AUTORIZADO, "; 
    sql += "DETERMINACION_TABLE.GASTOS_PADRES, "; 
    sql += "DETERMINACION_TABLE.EDAD_ANCIANO, "; 
    sql += "DETERMINACION_TABLE.EDAD_ADULTO, "; 
    sql += "DETERMINACION_TABLE.EDAD_MENOR, "; 
    sql += "DETERMINACION_TABLE.GASTOS_AGRICULTURA, "; 
    sql += "DETERMINACION_TABLE.BONO_ANCIANO, "; 
    sql += "DETERMINACION_TABLE.DEDUCCION_ANCIANO, "; 
    sql += "DETERMINACION_TABLE.DEDUCCION_INCA, "; 
    sql += "DETERMINACION_TABLE.DEDUCCION_FIJA, "; 
    sql += "DETERMINACION_TABLE.NUM_ANCIANOS, "; 
    sql += "DETERMINACION_TABLE.DEDUCCION_STANDARD, "; 
    sql += "DETERMINACION_TABLE.NECESIDAD_AJUSTADA_FAM ";

    /*
    sql += "DETERMINACION_TABLE.EXENCION_RETP_MAX ";
    sql += "DETERMINACION_TABLE.EXENCION_RETI ";
    sql += "DETERMINACION_TABLE.EXENCION_SEG_SOC ";
    sql += "DETERMINACION_TABLE.EXENCION_RETP ";
    */

    sql += " from SAIC.DETERMINACION_TABLE DETERMINACION_TABLE ";
    sql += "where DETERMINACION_TABLE.FECHA_EFECTIVIDAD = ";
    sql += "( select min ( T.FECHA_EFECTIVIDAD ) ";
    sql += "from SAIC.DETERMINACION_TABLE T ";
    sql += "where T.FECHA_EFECTIVIDAD >= __DATE ) ";

    ds.setDefinition ( sql );

    ds.setCondition ( "COD_SERVICIO", serviceCode );

    ds.setArgument  ( "__DATE", new Date ( startDate ) );

    try
    {
      ds.retrieve ( );
      dRow = ds.rows.get ( 0 );
      //System.out.println ( dRow.export ( ) );
    }
    catch ( Exception e )
    {
      e.printStackTrace ( );
    }

    return dRow;
  }


  /**
   * Usage example:
   * 
   * gov.dlf.util.AppConfiguration cnf = new gov.dlf.util.AppConfiguration ( app );
   * System.out.println ( "NECESIDAD_AJUSTADA = " + cnf.getParameter ( "01-JAN-2000", "AE-A", "NECESIDAD_AJUSTADA" ) );
   * 
   * @param start
   * @param serviceCode
   * @return
   */
  public double getParameter ( String startDate, String serviceCode, String parameter )
  {
    double result = Double.NaN;

    DataStore ds = new DataStore ( );
    ds.setDataManager ( this.dataManager );

    DataStoreAdapterSqlDisconnected adapter = new DataStoreAdapterSqlDisconnected ( ds );
    adapter.setConnection ( this.dataManager.getDefaultConnection ( ) );

    ds.setAdapter ( adapter );

    String sql = "select ";
    sql += "DETERMINACION_TABLE." + parameter;
    sql += " from SAIC.DETERMINACION_TABLE DETERMINACION_TABLE ";
    sql += "where DETERMINACION_TABLE.FECHA_EFECTIVIDAD = ";
    sql += "( select min ( T.FECHA_EFECTIVIDAD ) ";
    sql += "from SAIC.DETERMINACION_TABLE T ";
    sql += "where T.FECHA_EFECTIVIDAD >= __DATE ) ";

    ds.setDefinition ( sql );

    ds.setCondition ( "COD_SERVICIO", serviceCode );

    ds.setArgument  ( "__DATE", new Date ( startDate ) );

    try
    {
      ds.retrieve ( );
      result = ds.getItemDouble ( 0, 0 );
      //result = ds.getItemDouble ( 0, parameter );
    }
    catch ( Exception e )
    {
      e.printStackTrace ( );
    }

    return result;
  }
}
