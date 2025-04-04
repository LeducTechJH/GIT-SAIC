package gov.dlf.logic;


import java.util.*;

import net.maintrend.datamanager.*;
import net.maintrend.rallyengine.*;
import net.maintrend.util.*;



/**
 * __Comment
 *
 * Created 6/4/2009 by Jorge Olmeda. KPG Inc.
 */
public class NOTIFICACIONES_VENCE_30_DIAS_ADL
    extends ADL
{
  public boolean checkNotificacionesExist ( RallyApplication app, double RMO )
  {
	Date FCH_NOTIFICACION = null;
	Date FCH_VENCE_30_DIAS = null;
	
    RallyDataManager dm = ( RallyDataManager ) app.getDataManager ( );
    
    DataStore NOTIFICACIONES_DSD = dm.create ( "NOTIFICACIONES_DSD" );
   
    dm.reset ( NOTIFICACIONES_DSD );

    dm.setField ( NOTIFICACIONES_DSD, "SEGURO_SOCIAL_JEFE_FAM", app.form ( "INF_FECHAS_VENCE24_FR" ).getDoubleItem ( "SEGURO_SOCIAL_JEFE_FAM" ) );
    dm.setField ( NOTIFICACIONES_DSD, "SEGURO_SOCIAL_JEFE_SERV", app.form ( "INF_FECHAS_VENCE24_FR" ).getDoubleItem ( "SEGURO_SOCIAL_JEFE_SERV" ) );
    dm.setField ( NOTIFICACIONES_DSD, "COD_SERVICIO", app.form ( "INF_FECHAS_VENCE24_FR" ).getStringItem ( "COD_SERVICIO" ) );
    dm.setField ( NOTIFICACIONES_DSD, "COD_NOTIFICACION", "NP04" );
    dm.setField ( NOTIFICACIONES_DSD, "RMO_OFICINA", RMO );
    
    dm.limitQueryFromBuffer ( NOTIFICACIONES_DSD );
    dm.retrieve ( NOTIFICACIONES_DSD );
    double status = dm.firstRow ( NOTIFICACIONES_DSD );
    
    app.form ( "INF_FECHAS_VENCE24_FR" ).setItem ( "FCH_NOTIFICACION", FCH_NOTIFICACION  );
    app.form ( "INF_FECHAS_VENCE24_FR" ).setItem ( "FCH_VENCE_30_DIAS", FCH_VENCE_30_DIAS  );
    while ( status == 0 ) 
    {
      FCH_NOTIFICACION = dm.getFieldDate ( dm.get ( "NOTIFICACIONES_DSD" ), "FCH_NOTIFICACION" );
      app.form ( "INF_FECHAS_VENCE24_FR" ).setItem ( "FCH_NOTIFICACION", FCH_NOTIFICACION  );
      FCH_VENCE_30_DIAS = MathService.plus ( FCH_NOTIFICACION, 29  );
      if ( Compare.equals ( StringService.toStringValue  ( FCH_VENCE_30_DIAS ,"E" ,StringService.Language.SPANISH ), "7" ) ) 
      {
    	  FCH_VENCE_30_DIAS = MathService.plus ( FCH_VENCE_30_DIAS, 2  );
      }
      else if ( Compare.equals ( StringService.toStringValue  ( FCH_VENCE_30_DIAS ,"E" ,StringService.Language.SPANISH ), "1" ) ) 
      {
    	  FCH_VENCE_30_DIAS = MathService.plus ( FCH_VENCE_30_DIAS, 1  );
      }
      app.form ( "INF_FECHAS_VENCE24_FR" ).setItem ( "FCH_VENCE_30_DIAS", FCH_VENCE_30_DIAS  );
      status  = dm.nextRow ( NOTIFICACIONES_DSD );
    }

    dm.close ( NOTIFICACIONES_DSD );
    return true;
  }
}
