package gov.dif.webservice.endpoint;

import java.io.OutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.jws.WebService;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.transform.Result;
import javax.xml.ws.Endpoint;

//import com.sun.xml.internal.ws.util.Pool.Marshaller;

import gov.dlf.facade.SAIC_DMQ_ORA_Application;

@WebService
public class SaicServerImpl implements SaicServer
{	
	static SAIC_DMQ_ORA_Application app;

	@Override
    public void setApp(SAIC_DMQ_ORA_Application __app) 
    {
		SaicServerImpl.app = __app;
    }
	
	@Override
	public void Publish()
	{
		 ExecutorService es = Executors.newFixedThreadPool(10);
		 Endpoint ep = Endpoint.create(this);
		 ep.setExecutor(es);
		 Endpoint.publish("http://127.0.0.1:10000/SaicServer", new SaicServerImpl());
	}
	
	@Override
    public String setRMO(String strRMO) {
		SaicServerImpl.app.RMO_GBL = Double.parseDouble( strRMO );
		return "true";
    }
	
}
