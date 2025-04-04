package gov.dif.downloadpdf;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import gov.dif.downloadpdf.DownloadPDF;
import gov.dif.downloadpdf.DownloadPDFImpl;

public class DownloadPDFAdapter {
	
	public static class Adapter extends XmlAdapter<DownloadPDF,DownloadPDFImpl>
	{

		@Override
		public DownloadPDF marshal(DownloadPDFImpl value) throws Exception {
			// TODO Auto-generated method stub
			return (DownloadPDF) value;
		}

		@Override
		public DownloadPDFImpl unmarshal(DownloadPDF value) throws Exception {
			// TODO Auto-generated method stub
			return (DownloadPDFImpl) value;
		}
		
	}

}
