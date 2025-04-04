package gov.dlf.external;

import javax.servlet.ServletContext;

import net.maintrend.util.Debug;

import org.eclipse.birt.report.engine.api.*;
import org.eclipse.birt.core.exception.BirtException;
import org.eclipse.birt.core.framework.IPlatformContext;
import org.eclipse.birt.core.framework.Platform;
import org.eclipse.birt.core.framework.PlatformServletContext;
import org.eclipse.birt.core.framework.osgi.*;


public class BirtEngine {
	
	private static IReportEngine birtEngine = null;

	public static synchronized IReportEngine getBirtEngine(ServletContext sc) 
	throws BirtException {
		  
		
		
		if (birtEngine == null) 
		{
			
			EngineConfig config = new EngineConfig ();
			
			config.setEngineHome ( "" );
			
			IPlatformContext context = new PlatformServletContext( sc );
			
			config.setPlatformContext( context );

			try
		    {
				//Start up the OSGi framework
		        Platform.startup( config );
		    }
		    catch ( BirtException e )
		    {
		    	e.printStackTrace( );
		    }

		        IReportEngineFactory factory = 
		                (IReportEngineFactory) Platform.
		                 createFactoryObject ( IReportEngineFactory.EXTENSION_REPORT_ENGINE_FACTORY );
		                
		    birtEngine = factory.createReportEngine( config );
		}
		return birtEngine;
	}
}
