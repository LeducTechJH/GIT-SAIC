package gov.dlf.logic;


import gov.dlf.facade.SAIC_DMQ_ORA_Application;

import net.maintrend.datamanager.DataStore;
import net.maintrend.interlink.ParameterSet;
import net.maintrend.rallyengine.RallyApplication;
import net.maintrend.rallyengine.RallyDataManager;
import net.maintrend.rallyengine.RallyDataStoreException;



/**
 *
 *  MainTrend Ltd 2008.
 */
public class UPDATE_RMO_ADL
{

  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param parms
   */
  public void synchronizeRMO ( SAIC_DMQ_ORA_Application app, double JEFE_FAM, 
                               double JEFE_SERV,String service )
  {
    if ( app == null || JEFE_FAM <= 0 ) return;
    
    RallyDataManager dm = ( RallyDataManager ) app.getDataManager ( );
    double rmo = app.getRMO_GBL ( );
    if ( rmo <= 0 ) return;
    this.updateService ( app, dm, JEFE_FAM, JEFE_SERV, service, rmo );
  }

  /**
   * 
   * @param parms
   */
  protected void updateService ( SAIC_DMQ_ORA_Application app, RallyDataManager dm, 
                                 double JEFE_FAM, double JEFE_SERV,String service, double rmo )
  {
    if ( rmo <= 0 ) return;
    try
    {
      DataStore serv = dm.create ( "SERVICIOS_DSD2" );
      dm.reset ( serv );
     
      serv.setBufferItem ( "SEGURO_SOCIAL_JEFE_FAM", JEFE_FAM );
      
      if ( JEFE_SERV > 0 )
      {
        serv.setBufferItem ( "SEGURO_SOCIAL_JEFE_SERV", JEFE_SERV );
      }
      if ( service != null && service.length ( ) > 0 )
      {
        serv.setBufferItem ( "COD_SERVICIO", service );       
      }
      serv.limitQueryFromBuffer ( );
      serv.retrieve ( );

      int rowCount = serv.rows.size ( );    
      if ( rowCount <= 0 ) return;
    
      for ( int i = 0 ; i < rowCount ; i++ )
      {
        double rmoOffice = serv.getItemDouble ( i, "RMO_OFICINA" );
        if ( rmoOffice != rmo )
        {       
          serv.getRow ( i ).set ( "RMO_OFICINA", rmo );
        }
        double jefeServ = serv.getItemDouble ( i, "SEGURO_SOCIAL_JEFE_SERV" );
        String servName = serv.getItemString ( i, "COD_SERVICIO"            );
        this.updateNucleo ( app, dm, JEFE_FAM, jefeServ, servName, rmo );  
      }
      serv.update ( );
      serv.close ( );
    }
    catch ( Exception ex )
    {
    }
  } 
  
  
  /**
   * 
   * @param parms
   */
  protected void updateNucleo ( SAIC_DMQ_ORA_Application app, RallyDataManager dm, 
                                 double JEFE_FAM, double JEFE_SERV,String service, double rmo )
  {
    if ( rmo <= 0 || JEFE_SERV <= 0 || service == null || service.length ( ) <= 0 ) return;
    
    try
    {
      DataStore nucleo = dm.create ( "SERV_NUCLEO_SERV_DSD" );
      dm.reset ( nucleo );
     
      nucleo.setBufferItem ( "SEGURO_SOCIAL_JEFE_FAM" , JEFE_FAM  );
      nucleo.setBufferItem ( "SEGURO_SOCIAL_JEFE_SERV", JEFE_SERV );
      nucleo.setBufferItem ( "COD_SERVICIO"           , service   );    
      
      nucleo.limitQueryFromBuffer ( );
      nucleo.retrieve ( );

      int rowCount = nucleo.rows.size ( );    
      if ( rowCount <= 0 ) return;
    
      for ( int i = 0 ; i < rowCount ; i++ )
      {
        double rmoOffice = nucleo.getItemDouble ( i, "RMO_OFICINA" );
        if ( rmoOffice != rmo )
        {
          nucleo.getRow ( i ).set ( "RMO_OFICINA", rmo );
        }
      }
      nucleo.update ( );
      nucleo.close ( );
    }
    catch ( Exception ex )
    {
    }
  }
}

