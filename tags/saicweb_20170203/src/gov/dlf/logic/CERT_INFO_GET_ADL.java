/**
 *
 */
package gov.dlf.logic;

import java.rmi.RemoteException;
import org.apache.commons.codec.binary.Base64;
import net.maintrend.datamanager.DataStore;
import net.maintrend.interfaces.IRegisteredObject;
import net.maintrend.interlink.ParameterSet;

import net.maintrend.rallyengine.*;
import net.maintrend.util.Compare;

import net.maintrend.util.Debug;

import javax.xml.rpc.ServiceException;
import javax.xml.ws.WebServiceException;

import gov.dlf.facade.SAIC_DMQ_ORA_Application;
import gov.dlf.webservice.certpan.endpoint.*;



public class CERT_INFO_GET_ADL extends ADL {


	/**  */
	public static boolean staticCall = true;


	/**  */
	public SAIC_DMQ_ORA_Application app;
	/**  */
	public RallyDataManager dm = null;

	public int CERT_STATUS = -9;


	public double OPEN_ID = 0;
	public double OPEN2_ID = 0;
	public double STATUS_CODE = 0;
	public double STATUS2_CODE = 0;
	public DataStore CLIENTES_READ_LOC_DSD = null;
	public DataStore DIRECCIONES_DSD = null;
	byte[] dBytes=null;

	CertificacionPanService_ServiceLocator service = new CertificacionPanService_ServiceLocator();


	/**  */
	public static byte[] getdBytes  ( RallyApplication __app )
	{
		return ( ( CERT_INFO_GET_ADL ) __app.getADL ( CERT_INFO_GET_ADL.class ) ).dBytes;
	}

	/**  */
	public static void setdBytes ( RallyApplication __app, byte[] value )
	{
		( ( CERT_INFO_GET_ADL ) __app.getADL ( CERT_INFO_GET_ADL.class ) ).dBytes = value;
	}



	/**
	 *
	 * @param __app
	 * @param ps
	 *
	 * @return
	 */
	public int getCERT_STATUS() {
		return CERT_STATUS;
	}

	/**
	 *
	 * @param __app
	 * @param ps
	 *
	 * @return
	 */
	public void setCERT_STATUS(int status) {
		CERT_STATUS = status;
	}

	/**
	 *
	 * @param __app
	 * @return
	 */
	public static CERT_INFO_GET_ADL get ( RallyApplication __app )
	{
		CERT_INFO_GET_ADL adl = new CERT_INFO_GET_ADL ( );
		__app.register ( adl, "CERT_INFO_GET_ADL" );
		__app.setADL ( CERT_INFO_GET_ADL.class, adl );
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
		CERT_INFO_GET_ADL.get ( __app ).process ( ps );
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
		CERT_INFO_GET_ADL.get ( __app ).process ( ps );
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
		IRegisteredObject rObj = this.app.get ( "CERT_INFO_GET_ADL" );
		if ( rObj != null && rObj instanceof CERT_INFO_GET_ADL )
		{
			this.app.setADL ( CERT_INFO_GET_ADL.class, ( CERT_INFO_GET_ADL ) rObj );
		}
	}

	protected void returnParms ( ParameterSet ps, String ACCT_ID, String USER_ID,String USER_NAME,String IP_ADDR )
	{
		ps.reset ( );
		ps.set(ACCT_ID);
		ps.set(USER_ID);
		ps.set(USER_NAME);
		ps.set(IP_ADDR);

	}


	/**
	 * Overrides the ancestor's method
	 *
	 * @param ps
	 */
	protected void process ( ParameterSet ps )
	{
		Debug.println ( Debug.TRACE, "CERT_INFO_GET_ADL Step " + this.currentStep );
		super.process ( ps );
		switch ( this.currentStep )
		{
		case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
		case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
		default:
		{
			this.currentStep = 0;
			Debug.println ( Debug.TRACE, "CERT_INFO_GET_ADL ended" );
			this.unregister ( );
			break;
		}
		}
		if ( this.currentStep > 0 ) this.app.goOn ( );
	}

	protected void step0 ( ParameterSet ps )
	{
		try
		{
			//.setProperty("proxySet", "true");
			// System.setProperty("http.proxyHost", "10.201.10.1");
			//System.setProperty("http.proxyPort", "8080");
			//System.setProperty("https.proxyHost", "10.201.10.1");
			//System.setProperty("https.proxyPort", "8080");

		}
		catch (WebServiceException ex)
		{
			ps.set( "CERT_STATUS", -9 );
			this.app.setError(0, 8509); //NO SE PUDO ACCESSAR EL SISTEMA DE AEE.
			System.out.println(ex.toString());

			this.doReturn();
			return;

		}

		CLIENTES_READ_LOC_DSD = this.dm.create("CLIENTES_READ_LOC_DSD");
		OPEN_ID = CLIENTES_READ_LOC_DSD.getId();
		STATUS_CODE = RallyDataStoreException.getDefault();
		DIRECCIONES_DSD = this.dm.create("DIRECCIONES_DSD");
		OPEN2_ID = DIRECCIONES_DSD.getId();
		STATUS2_CODE = RallyDataStoreException.getDefault();

		return;

	}
	/**
	 *
	 */
	protected void step1 ( ParameterSet ps )
	{
		STATUS_CODE = this.dm.reset(OPEN_ID);
		this.dm.setField(this.dm.get("CLIENTES_READ_LOC_DSD"),"SEGURO_SOCIAL_CLIENTE", this.app.SSN_GBL);
		this.dm.setField(this.dm.get("CLIENTES_READ_LOC_DSD"),"RMO_OFICINA", this.app.RMO_GBL);

		STATUS_CODE = this.dm.limitQueryFromBuffer(OPEN_ID);
		STATUS_CODE = this.dm.retrieve(OPEN_ID);
		STATUS_CODE = this.dm.firstRow(OPEN_ID);

		if (!Compare.equals(STATUS_CODE, 0)) 
		{
			this.app.setError(3, STATUS_CODE);
			STATUS_CODE = this.dm.rollBack();
			this.doReturn();
			return;
		}
		STATUS2_CODE = this.dm.reset(OPEN2_ID);
		this.dm.setField(this.dm.get("DIRECCIONES_DSD"),"SEGURO_SOCIAL_JEFE_SERV", this.app.SSN_GBL);
		this.dm.setField(this.dm.get("DIRECCIONES_DSD"),"COD_TIPO_DIRECCION", "SERV");

		STATUS2_CODE = this.dm.limitQueryFromBuffer(OPEN2_ID);
		STATUS2_CODE = this.dm.retrieve(OPEN2_ID);
		STATUS2_CODE = this.dm.firstRow(OPEN2_ID);

		if (!Compare.equals(STATUS_CODE, 0)) 
		{
			this.app.setError(3, STATUS_CODE);
			STATUS_CODE = this.dm.rollBack();
			this.doReturn();
			return;
		}
		double ssn = this.dm.getFieldDouble(this.dm.get("CLIENTES_READ_LOC_DSD"),"SEGURO_SOCIAL_CLIENTE");
		double z = this.dm.getFieldDouble(this.dm.get("DIRECCIONES_DSD"),"ZIP_CODE");
		double z4 = this.dm.getFieldDouble(this.dm.get("DIRECCIONES_DSD"),"ZIP_CODE_4");
		int nss = (int)ssn;
		String zipcode = Double.toString(z);
		String zipcode4 = Double.toString(z4);

		try {
			dBytes = service.getCertificacionPanServicePort().getPDFCert 
					( nss, 
							this.dm.getFieldString(this.dm.get("CLIENTES_READ_LOC_DSD"),"DSC_NOMBRE"), 
							this.dm.getFieldString(this.dm.get("CLIENTES_READ_LOC_DSD"),"DSC_APELLIDO_PATERNO"), 
							this.dm.getFieldString(this.dm.get("CLIENTES_READ_LOC_DSD"),"DSC_APELLIDO_MATERNO"), 
							this.dm.getFieldString(this.dm.get("DIRECCIONES_DSD"),"DSC_DIRECCION_1"), 
							this.dm.getFieldString(this.dm.get("DIRECCIONES_DSD"),"DSC_DIRECCION_2"), 
							this.dm.getFieldString(this.dm.get("DIRECCIONES_DSD"),"DSC_COMO1"), 
							zipcode,
							zipcode4
							);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}	
		String safeEncode = base64UrlEncode(dBytes);
		String safeDecode = base64UrlDecode(safeEncode);
		String html = 
				"<html>"
				+"<form action=\"./GetPDF\" method=\"post\">"
				+"<input type=\"submit\" value=\"Oprima aqui para Certificacion de Servicios\" id=\"submit\">"
				+"<input type=\"hidden\" id=\"fPdf\" name=\"fPdf\" value=\""+safeEncode+"\">"
				+"</form>"
				+"</html>";
		this.app.registerClientContent ( html, "printStr" );
		STATUS_CODE = this.dm.dbClose(OPEN_ID);
		STATUS2_CODE = this.dm.dbClose(OPEN2_ID);

		return;
	}		 
	public static String base64UrlEncode(byte[] input) {
		String result = null;
		Base64 encoder = new Base64(true);
		byte[] encodedBytes = encoder.encode(input);
		result = new String(encodedBytes);
		return result;
	}
	public static String base64UrlDecode(String input) {
		String result = null;
		Base64 decoder = new Base64(true);
		byte[] decodedBytes = decoder.decode(input);
		result = new String(decodedBytes);
		return result;
	}


}