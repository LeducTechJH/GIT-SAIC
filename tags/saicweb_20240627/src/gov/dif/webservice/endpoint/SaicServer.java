package gov.dif.webservice.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.JAXBException;

import gov.dlf.facade.SAIC_DMQ_ORA_Application;

@WebService
public interface SaicServer {
	
	 void setApp(SAIC_DMQ_ORA_Application app);
	 
	 @WebMethod
	 void Publish();
	
	 @WebMethod
	 String setRMO(String strRMO);

}
