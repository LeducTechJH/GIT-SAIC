package gov.dif.webservice.endpoint;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class SaicServerAdapter {
	
	public static class Adapter extends XmlAdapter<SaicServer,SaicServerImpl>
	{

		@Override
		public SaicServer marshal(SaicServerImpl value) throws Exception {
			// TODO Auto-generated method stub
			return (SaicServer) value;
		}

		@Override
		public SaicServerImpl unmarshal(SaicServer value) throws Exception {
			// TODO Auto-generated method stub
			return (SaicServerImpl) value;
		}
		
	}

}
