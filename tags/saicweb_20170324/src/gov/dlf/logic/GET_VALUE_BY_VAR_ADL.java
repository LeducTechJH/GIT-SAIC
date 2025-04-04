/**
 * 
 */
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
 * @author Marcos Acevedo. KPG Inc. 6/11/2009
 *
 */

public class GET_VALUE_BY_VAR_ADL 
	extends ADL
{
	
	public static boolean CITI_ZIP ( RallyApplication app )
	{
		String CITY = null;
		
		RallyDataManager dm = ( RallyDataManager ) app.getDataManager ( );
	    
	    DataStore ZIP_RO_RO_DSD = dm.create ( "ZIP_RO_RO_DSD" );
	   
	    dm.reset ( ZIP_RO_RO_DSD );
	    
	    dm.setField ( ZIP_RO_RO_DSD, "ZIP_CODE", app.form ( "FECHAS_SERVICIO_FRM" ).getDoubleItem ( "ZIP_CODE_VAR" ) );
	    
	    dm.limitQueryFromBuffer ( ZIP_RO_RO_DSD );
	    dm.retrieve ( ZIP_RO_RO_DSD );
	    
	    double status = dm.firstRow ( ZIP_RO_RO_DSD );
	    
	    if ( status == 0)
	    {
	    	CITY = dm.getFieldString ( dm.get ( "ZIP_RO_RO_DSD" ), "CIUDAD" );
	        app.form ( "FECHAS_SERVICIO_FRM" ).setItem ( "DSC_CIUDAD_VAR", CITY  );
	    }
	    
	    dm.close ( ZIP_RO_RO_DSD );
	    
	    return true;
		
	}
	
	public static boolean SERVICE_DSC ( RallyApplication app )
	{
		String DSC = null;
		
		RallyDataManager dm = ( RallyDataManager ) app.getDataManager ( );
	    
	    DataStore SERVICIOS_TBL_LOV_DSD = dm.create ( "SERVICIOS_TBL_LOV_DSD" );
	   
	    dm.reset ( SERVICIOS_TBL_LOV_DSD );
	    
	    dm.setField ( SERVICIOS_TBL_LOV_DSD, "COD_SERVICIO", app.form ( "FECHAS_SERVICIO_FRM" ).getValue ( "COD_SERVICIO" ).toString() );
	    
	    dm.limitQueryFromBuffer ( SERVICIOS_TBL_LOV_DSD );
	    dm.retrieve ( SERVICIOS_TBL_LOV_DSD );
	    
	    double status = dm.firstRow ( SERVICIOS_TBL_LOV_DSD );
	    
	    if ( status == 0)
	    {
	    	DSC = dm.getFieldString ( dm.get ( "SERVICIOS_TBL_LOV_DSD" ), "DSC_NOMBRE_SERVICIO" );
	        app.form ( "FECHAS_SERVICIO_FRM" ).setItem ( "DSC_SERVICIO_VAR", DSC  );
	    }
	    
	    dm.close ( SERVICIOS_TBL_LOV_DSD );
	    
	    return true;
		
	}
	
	public static boolean TSS_NAME (RallyApplication app)
	{
		
		String NAME = null;
		
		RallyDataManager dm = ( RallyDataManager ) app.getDataManager ( );
	    
	    DataStore TECNICO_LOV_DSD = dm.create ( "TECNICO_LOV_DSD" );
	    
	    dm.reset ( TECNICO_LOV_DSD );
	    
	    dm.setField ( TECNICO_LOV_DSD, "ID_TECNICO", app.form ( "FECHAS_SERVICIO_FRM" ).getDoubleItem ( "ID_TECNICO" ) );
	    
	    dm.limitQueryFromBuffer ( TECNICO_LOV_DSD );
	    dm.retrieve ( TECNICO_LOV_DSD );
	    
	    double status = dm.firstRow ( TECNICO_LOV_DSD );
	    
	    if ( status == 0)
	    {
	    	NAME = dm.getFieldString ( dm.get ( "TECNICO_LOV_DSD" ), "DSC_NOMBRE" ) + " " + dm.getFieldString ( dm.get ( "TECNICO_LOV_DSD" ), "DSC_APELLIDO_PATERNO" );
	        app.form ( "FECHAS_SERVICIO_FRM" ).setItem ( "NOMBRE_ID_TECNICO_VAR", NAME  );
	    }
	    
	    dm.close ( TECNICO_LOV_DSD );
		
		return true;
	}
	
	public static boolean TSS_NAME_ELEG (RallyApplication app)
	{
		
		String NAME = null;
		
		RallyDataManager dm = ( RallyDataManager ) app.getDataManager ( );
	    
	    DataStore TECNICO_LOV_DSD = dm.create ( "TECNICO_LOV_DSD" );
	    
	    dm.reset ( TECNICO_LOV_DSD );
	    
	    dm.setField ( TECNICO_LOV_DSD, "ID_TECNICO", app.form ( "FECHAS_SERVICIO_FRM" ).getDoubleItem ( "ID_TECNICO_DETER_ELEGIBILIDAD" ) );
	    
	    dm.limitQueryFromBuffer ( TECNICO_LOV_DSD );
	    dm.retrieve ( TECNICO_LOV_DSD );
	    
	    double status = dm.firstRow ( TECNICO_LOV_DSD );
	    
	    if ( status == 0)
	    {
	    	NAME = dm.getFieldString ( dm.get ( "TECNICO_LOV_DSD" ), "DSC_NOMBRE" ) + " " + dm.getFieldString ( dm.get ( "TECNICO_LOV_DSD" ), "DSC_APELLIDO_PATERNO" );
	        app.form ( "FECHAS_SERVICIO_FRM" ).setItem ( "NOMBRE_TECNCICO_DETER_ELEG_VAR", NAME  );
	    }
	    
	    dm.close ( TECNICO_LOV_DSD );
		
		return true;
	}
	
	public static boolean TSS_NAME_REVI (RallyApplication app)
	{
		
		String NAME = null;
		
		RallyDataManager dm = ( RallyDataManager ) app.getDataManager ( );
	    
	    DataStore TECNICO_LOV_DSD = dm.create ( "TECNICO_LOV_DSD" );
	    
	    dm.reset ( TECNICO_LOV_DSD );
	    
	    dm.setField ( TECNICO_LOV_DSD, "ID_TECNICO", app.form ( "FECHAS_SERVICIO_FRM" ).getDoubleItem ( "ID_TECNICO_REVISA" ) );
	    
	    dm.limitQueryFromBuffer ( TECNICO_LOV_DSD );
	    dm.retrieve ( TECNICO_LOV_DSD );
	    
	    double status = dm.firstRow ( TECNICO_LOV_DSD );
	    
	    if ( status == 0)
	    {
	    	NAME = dm.getFieldString ( dm.get ( "TECNICO_LOV_DSD" ), "DSC_NOMBRE" ) + " " + dm.getFieldString ( dm.get ( "TECNICO_LOV_DSD" ), "DSC_APELLIDO_PATERNO" );
	        app.form ( "FECHAS_SERVICIO_FRM" ).setItem ( "NOMBRE_TENICO_REVISA_VAR", NAME  );
	    }
	    
	    dm.close ( TECNICO_LOV_DSD );
		
		return true;
	}
	
	public static boolean TSS_NAME_AUTO (RallyApplication app)
	{
		
		String NAME = null;
		
		RallyDataManager dm = ( RallyDataManager ) app.getDataManager ( );
	    
	    DataStore TECNICO_LOV_DSD = dm.create ( "TECNICO_LOV_DSD" );
	    
	    dm.reset ( TECNICO_LOV_DSD );
	    
	    dm.setField ( TECNICO_LOV_DSD, "ID_TECNICO", app.form ( "FECHAS_SERVICIO_FRM" ).getDoubleItem ( "ID_TECNICO_AUTORIZA" ) );
	    
	    dm.limitQueryFromBuffer ( TECNICO_LOV_DSD );
	    dm.retrieve ( TECNICO_LOV_DSD );
	    
	    double status = dm.firstRow ( TECNICO_LOV_DSD );
	    
	    if ( status == 0)
	    {
	    	NAME = dm.getFieldString ( dm.get ( "TECNICO_LOV_DSD" ), "DSC_NOMBRE" ) + " " + dm.getFieldString ( dm.get ( "TECNICO_LOV_DSD" ), "DSC_APELLIDO_PATERNO" );
	        app.form ( "FECHAS_SERVICIO_FRM" ).setItem ( "NOMBRE_TECNICO_AUTORIZA_VAR", NAME  );
	    }
	    
	    dm.close ( TECNICO_LOV_DSD );
		
		return true;
	}
	
	public static boolean TSS_NAME_AUTO_C (RallyApplication app)
	{
		
		String NAME = null;
		
		RallyDataManager dm = ( RallyDataManager ) app.getDataManager ( );
	    
	    DataStore TECNICO_LOV_DSD = dm.create ( "TECNICO_LOV_DSD" );
	    
	    dm.reset ( TECNICO_LOV_DSD );
	    
	    dm.setField ( TECNICO_LOV_DSD, "ID_TECNICO", app.form ( "CONTRATO_NINO_FRM" ).getDoubleItem ( "ID_TECNICO_AUTORIZA" ) );
	    
	    dm.limitQueryFromBuffer ( TECNICO_LOV_DSD );
	    dm.retrieve ( TECNICO_LOV_DSD );
	    
	    double status = dm.firstRow ( TECNICO_LOV_DSD );
	    
	    if ( status == 0)
	    {
	    	NAME = dm.getFieldString ( dm.get ( "TECNICO_LOV_DSD" ), "DSC_NOMBRE" ) + " " + dm.getFieldString ( dm.get ( "TECNICO_LOV_DSD" ), "DSC_APELLIDO_PATERNO" );
	        app.form ( "CONTRATO_NINO_FRM`" ).setItem ( "NOMBRE_TECNICO_AUTORIZA_VAR", NAME  );
	    }
	    
	    dm.close ( TECNICO_LOV_DSD );
		
		return true;
	}
	
	public static boolean TSS_NAME_CERRAD (RallyApplication app)
	{
		
		String NAME = null;
		
		RallyDataManager dm = ( RallyDataManager ) app.getDataManager ( );
	    
	    DataStore TECNICO_LOV_DSD = dm.create ( "TECNICO_LOV_DSD" );
	    
	    dm.reset ( TECNICO_LOV_DSD );
	    
	    dm.setField ( TECNICO_LOV_DSD, "ID_TECNICO", app.form ( "FECHAS_SERVICIO_FRM" ).getDoubleItem ( "ID_TECNICO_CERRADO" ) );
	    
	    dm.limitQueryFromBuffer ( TECNICO_LOV_DSD );
	    dm.retrieve ( TECNICO_LOV_DSD );
	    
	    double status = dm.firstRow ( TECNICO_LOV_DSD );
	    
	    if ( status == 0)
	    {
	    	NAME = dm.getFieldString ( dm.get ( "TECNICO_LOV_DSD" ), "DSC_NOMBRE" ) + " " + dm.getFieldString ( dm.get ( "TECNICO_LOV_DSD" ), "DSC_APELLIDO_PATERNO" );
	        app.form ( "FECHAS_SERVICIO_FRM" ).setItem ( "NOMBRE_TECNICO_CERRADO_VAR", NAME  );
	    }
	    
	    dm.close ( TECNICO_LOV_DSD );
		
		return true;
	}
	
	public static boolean TSS_SUP (RallyApplication app)
	{
		
		String NAME = null;
		double ID = 0;
		
		RallyDataManager dm = ( RallyDataManager ) app.getDataManager ( );
	    
	    DataStore TECNICO_LOV_DSD = dm.create ( "TECNICO_LOV_DSD" );
	    
	    dm.reset ( TECNICO_LOV_DSD );
	    
	    dm.setField ( TECNICO_LOV_DSD, "ID_TECNICO", app.form ( "FECHAS_SERVICIO_FRM" ).getDoubleItem ( "ID_TECNICO" ) );
	    
	    dm.limitQueryFromBuffer ( TECNICO_LOV_DSD );
	    dm.retrieve ( TECNICO_LOV_DSD );
	    
	    double status = dm.firstRow ( TECNICO_LOV_DSD );
	    
	    if ( status == 0)
	    {
	    	ID = dm.getFieldDouble ( dm.get ( "TECNICO_LOV_DSD" ), "ID_SUPERVISOR" );
	    	
	    	//*****
	    	dm.reset( TECNICO_LOV_DSD );
	    	
	    	dm.setField ( TECNICO_LOV_DSD, "ID_TECNICO", ID );
		    
		    dm.limitQueryFromBuffer ( TECNICO_LOV_DSD );
		    dm.retrieve ( TECNICO_LOV_DSD );
		    
		    status = dm.firstRow ( TECNICO_LOV_DSD );
		    
		    if( status == 0 )
		    {
		    	NAME = dm.getFieldString ( dm.get ( "TECNICO_LOV_DSD" ), "DSC_NOMBRE" ) + " " + dm.getFieldString ( dm.get ( "TECNICO_LOV_DSD" ), "DSC_APELLIDO_PATERNO" );
		        app.form ( "FECHAS_SERVICIO_FRM" ).setItem ( "NOMBRE_SUPERVISOR_VAR", NAME  );
		    }
		    
		    //***
		    
		    app.form ( "FECHAS_SERVICIO_FRM" ).setItem ( "ID_SUPERVISOR", ID  );
	    	
	    	
	    }
	    
	    dm.close ( TECNICO_LOV_DSD );
		
		return true;
	}
	
	public static String RMO_NAME (RallyApplication app, int rmo)
	{
		String rmoStr = " ";
		
		RallyDataManager dm = ( RallyDataManager ) app.getDataManager ( );
	    
		DataStore RMO_RO_DSD = dm.create ( "RMO_RO_DSD" );
	    
	    dm.reset ( RMO_RO_DSD );
	    
	    dm.setField ( RMO_RO_DSD, "COD_RMO", rmo );
	    
	    dm.limitQueryFromBuffer ( RMO_RO_DSD );
	    dm.retrieve ( RMO_RO_DSD );
	    
	    double status = dm.firstRow ( RMO_RO_DSD );
	    
	    if ( status == 0)
	    {
	    	rmoStr = dm.getFieldString( dm.get ( "RMO_RO_DSD" ), "DSC_OFICINA" );
	    
	    	dm.close ( RMO_RO_DSD );
	    	
	    	return rmoStr;
	    }
	    
	    dm.close ( RMO_RO_DSD );
		
		return rmoStr;
	}

}
