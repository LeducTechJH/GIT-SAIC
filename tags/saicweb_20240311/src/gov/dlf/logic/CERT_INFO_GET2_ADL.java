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

import gov.dlf.facade.SAIC_DMQ_ORA_Application;
import gov.dlf.webservice.certpan.endpoint.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;



public class CERT_INFO_GET2_ADL extends ADL {


	/**  */
	public static boolean staticCall = true;


	/**  */
	public SAIC_DMQ_ORA_Application app;
	/**  */
	public RallyDataManager dm = null;

	public int CERT_STATUS = -9;


	public double OPEN_ID = 0;
	public double OPEN2_ID = 0;
	public double OPEN3_ID = 0;
	public double STATUS_CODE = 0;
	public double STATUS2_CODE = 0;
	public double STATUS3_CODE = 0;
	public String lenguaje = "es_PR";
	public DataStore CLIENTES_READ_LOC_DSD = null;
	public DataStore DIRECCIONES_DSD = null;
	public DataStore ZIP_TBL_RO_DSD = null;
	byte[] dBytes=null;
	

	CertificacionPanService_ServiceLocator service = new CertificacionPanService_ServiceLocator();


	/**  */
	public static byte[] getdBytes  ( RallyApplication __app )
	{
		return ( ( CERT_INFO_GET2_ADL ) __app.getADL ( CERT_INFO_GET2_ADL.class ) ).dBytes;
	}

	/**  */
	public static void setdBytes ( RallyApplication __app, byte[] value )
	{
		( ( CERT_INFO_GET2_ADL ) __app.getADL ( CERT_INFO_GET2_ADL.class ) ).dBytes = value;
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
	public static CERT_INFO_GET2_ADL get ( RallyApplication __app )
	{
		CERT_INFO_GET2_ADL adl = new CERT_INFO_GET2_ADL ( );
		__app.register ( adl, "CERT_INFO_GET_ADL" );
		__app.setADL ( CERT_INFO_GET2_ADL.class, adl );
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
		CERT_INFO_GET2_ADL.get ( __app ).process ( ps );
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
		CERT_INFO_GET2_ADL.get ( __app ).process ( ps );
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
		if ( rObj != null && rObj instanceof CERT_INFO_GET2_ADL )
		{
			this.app.setADL ( CERT_INFO_GET2_ADL.class, ( CERT_INFO_GET2_ADL ) rObj );
		}
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

		CLIENTES_READ_LOC_DSD = this.dm.create("CLIENTES_READ_LOC_DSD");
		OPEN_ID = CLIENTES_READ_LOC_DSD.getId();
		STATUS_CODE = RallyDataStoreException.getDefault();
		DIRECCIONES_DSD = this.dm.create("DIRECCIONES_DSD");
		OPEN2_ID = DIRECCIONES_DSD.getId();
		STATUS2_CODE = RallyDataStoreException.getDefault();
		ZIP_TBL_RO_DSD = this.dm.create("ZIP_TBL_RO_DSD");
		OPEN3_ID = ZIP_TBL_RO_DSD.getId();
		STATUS3_CODE = RallyDataStoreException.getDefault();

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
//		if(Compare.equals(this.app.ANSWER_GBL, "S"))
//		{
//			lenguaje = "en_US";
//		}
		double ssn = this.dm.getFieldDouble(this.dm.get("CLIENTES_READ_LOC_DSD"),"SEGURO_SOCIAL_CLIENTE");
		double z = this.dm.getFieldDouble(this.dm.get("DIRECCIONES_DSD"),"ZIP_CODE");
		double z4 = this.dm.getFieldDouble(this.dm.get("DIRECCIONES_DSD"),"ZIP_CODE_4");
		int nss = (int)ssn;
		
		String zipcode = Double.toString(z);
		if(!Compare.equals(zipcode, "NaN"))
		{
			zipcode = zipcode.substring(0,zipcode.indexOf("."));
		}
		else
		{
			zipcode = "0000";
		}
		
		String zipcode4 = Double.toString(z4);
		if(!Compare.equals(zipcode4, "NaN"))
		{
			zipcode4 = zipcode4.substring(0,zipcode4.indexOf("."));
		}
		else
		{
			zipcode4 = "0000";
		}
		String nombre = this.dm.getFieldString(this.dm.get("CLIENTES_READ_LOC_DSD"),"DSC_NOMBRE").trim();
		String ape1 = this.dm.getFieldString(this.dm.get("CLIENTES_READ_LOC_DSD"),"DSC_APELLIDO_PATERNO").trim();
		String ape2 = this.dm.getFieldString(this.dm.get("CLIENTES_READ_LOC_DSD"),"DSC_APELLIDO_MATERNO").trim();
		String dir1 = this.dm.getFieldString(this.dm.get("DIRECCIONES_DSD"),"DSC_DIRECCION_1");
		String dir2 = this.dm.getFieldString(this.dm.get("DIRECCIONES_DSD"),"DSC_DIRECCION_2");

		STATUS3_CODE = this.dm.reset(OPEN3_ID);
		this.dm.setField(this.dm.get("ZIP_TBL_RO_DSD"),"ZIP_CODE", z);


		STATUS3_CODE = this.dm.limitQueryFromBuffer(OPEN3_ID);
		STATUS3_CODE = this.dm.retrieve(OPEN3_ID);
		STATUS3_CODE = this.dm.firstRow(OPEN3_ID);

		String mun = "";
		if (Compare.equals(STATUS3_CODE, 0))
		{
			//this.app.setError(3, STATUS3_CODE);
			//STATUS3_CODE = this.dm.rollBack();
			//this.doReturn();
			//return;
			
			mun = this.dm.getFieldString(this.dm.get("ZIP_TBL_RO_DSD"),"CIUDAD");
			
		}
		
		try {
		

            URL url = new URL("https://serviciosenlinea.adsef.pr.gov/testapp/api/certification/adsef186/");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            String jsonInputString = "{\"ssn\": " + nss + ", \"name\": \"" + nombre 
                                    + "\", \"lastName\": \"" + ape1 + "\", \"lastName2\": \"" 
                                    + ape2 + "\", \"address1\": \"" + dir1 + "\", \"address2\": \"" 
                                    + dir2 + "\", \"city\": \"" + mun + "\", \"zipCode\": \"" + zipcode 
                                    + "\", \"zipCode4\": \"" + zipcode4 + "\", \"email\": \"" + "" 
                                    + "\", \"returnPDF\":  \"" + true + "\", \"pdfLanguage\":  \"" + lenguaje 
                                    + "\", \"checkOnly\": \"" + false + "}";

            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

            try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                System.out.println("API response: " + response.toString());

            } catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

            conn.disconnect();

			
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		String safeEncode = base64UrlEncode(dBytes);
		String html = 
				"<html>"
						+ "<head><script>alert(\"Certificacion\");</script></head>"
						+"<form action=\"./GetPDF\" method=\"post\">"
						+"<input type=\"submit\" value=\"Oprima aqui para Certificacion de Servicios\" id=\"submit\">"
						+"<input type=\"hidden\" id=\"fPdf\" name=\"fPdf\" value=\""+safeEncode+"\">"
						+"</form>"
						+"</html>";
		this.app.registerClientContent ( html, "printStr" );
		STATUS_CODE = this.dm.dbClose(OPEN_ID);
		STATUS2_CODE = this.dm.dbClose(OPEN2_ID);
		STATUS3_CODE = this.dm.dbClose(OPEN3_ID);
		//this.app.callCommand(2000);
		return;
	}		 
	public static String base64UrlEncode(byte[] input) {
		String result = null;
		Base64 encoder = new Base64(true);
		if (input.length > 0)
		{
			byte[] encodedBytes = encoder.encode(input);
			result = new String(encodedBytes);
			return result;
		}
		else 
		{
			System.out.println("No se encontro registro durante consulta de webservice." + System.console());
			return result;
		}
	}
}