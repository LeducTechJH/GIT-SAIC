package gov.dlf.logic;

import java.io.IOException;
import java.net.Proxy;

import gov.dlf.util.OkHttpClientTLSBypass;
import gov.dlf.facade.SAIC_DMQ_ORA_Application;
import net.maintrend.datamanager.DataStore;
import net.maintrend.interfaces.IRegisteredObject;
import net.maintrend.interlink.ParameterSet;
import net.maintrend.rallyengine.ADL;
import net.maintrend.rallyengine.RallyApplication;
import net.maintrend.rallyengine.RallyDataManager;
import net.maintrend.rallyengine.RallyDataStoreException;
import net.maintrend.util.Compare;
import net.maintrend.util.Configuration;
import net.maintrend.util.Debug;

import okhttp3.*;

public class CERT_INFO_GET_REST_ADL extends ADL {
	
	public SAIC_DMQ_ORA_Application app;
	
	public RallyDataManager dm = null;
	byte[] dBytes=null;
	
	public double OPEN_ID = 0;
	public double OPEN2_ID = 0;
	public double OPEN3_ID = 0;
	public double STATUS_CODE = 0;
	public double STATUS2_CODE = 0;
	public double STATUS3_CODE = 0;
	public DataStore CLIENTES_READ_LOC_DSD = null;
	public DataStore DIRECCIONES_DSD = null;
	public DataStore ZIP_TBL_RO_DSD = null;
	
	
	/**  */
	public static byte[] getdBytes  ( RallyApplication __app )
	{
		return ( ( CERT_INFO_GET_REST_ADL ) __app.getADL ( CERT_INFO_GET_REST_ADL.class ) ).dBytes;
	}

	/**  */
	public static void setdBytes ( RallyApplication __app, byte[] value )
	{
		( ( CERT_INFO_GET_REST_ADL ) __app.getADL ( CERT_INFO_GET_REST_ADL.class ) ).dBytes = value;
	}
	
	public static CERT_INFO_GET_REST_ADL get ( RallyApplication __app )
	{
		CERT_INFO_GET_REST_ADL adl = new CERT_INFO_GET_REST_ADL ( );
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
		CERT_INFO_GET_REST_ADL.get ( __app ).process ( ps );
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
		CERT_INFO_GET_REST_ADL.get ( __app ).process ( ps );
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
		IRegisteredObject rObj = this.app.get ( "CERT_INFO_GET_REST_ADL" );
		if ( rObj != null && rObj instanceof CERT_INFO_GET_REST_ADL )
		{
			this.app.setADL ( CERT_INFO_GET_REST_ADL.class, ( CERT_INFO_GET_REST_ADL ) rObj );
		}
	}
	
	/**
	 * Overrides the ancestor's method
	 *
	 * @param ps
	 */
	protected void process ( ParameterSet ps )
	{
		Debug.println ( Debug.TRACE, "CERT_INFO_GET_REST_ADL Step " + this.currentStep );
		super.process ( ps );
		switch ( this.currentStep )
		{
		case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
		default:
		{
			this.currentStep = 0;
			Debug.println ( Debug.TRACE, "CERT_INFO_GET_REST_ADL ended" );
			this.unregister ( );
			break;
		}
		}
		if ( this.currentStep > 0 ) this.app.goOn ( );
	}
	
	private String requestJson(String ssn, String name, String lastName, 
			String lastName2, String address1, String address2, String city,
			String zip, String zipPlusCode) 
	{

		return "{"
	    + "\"ssn\": \""+ ssn +"\","             
	    + "\"name\": \""+ name +"\","           
	    + "\"lastName\": \""+ lastName +"\","   
	    + "\"lastName2\": \""+ lastName2 +"\"," 
	    + "\"address1\": \""+address1+"\","     
	    + "\"address2\": \""+address2+"\","     
	    + "\"city\": \""+city+"\","             
	    + "\"zipCode\": \""+zip+"\","           
	    + "\"zipCode4\": \""+zipPlusCode+"\","  
	    + "\"email\": \"\","                    
	    + "\"returnPDF\": true,"                
	    + "\"pdfLanguage\": \"es_PR\","         
	    + "\"sendByEmail\": false,"             
	    + "\"checkOnly\": false"                
	    + "}";
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

		//The http client is implemented to bypass ssl cert checks to allow for https internal operation
		//calls for IP based services instead of using a FQDN.
		//Exercise restraint when calling external services and use the regular instance
		//of OkHttpClient with OkHttpClient client = new OkHttpClient();
		OkHttpClient client = OkHttpClientTLSBypass.getBypassOkHttpClient();
		MediaType APPLICATION_JSON = MediaType.get("application/json");
		
		String  ssn = String.format("%05.0f", this.dm.getFieldDouble(this.dm.get("CLIENTES_READ_LOC_DSD"),"SEGURO_SOCIAL_CLIENTE"));//String.format("%05.0f", number); 
		double z = this.dm.getFieldDouble(this.dm.get("DIRECCIONES_DSD"),"ZIP_CODE");
		double z4 = this.dm.getFieldDouble(this.dm.get("DIRECCIONES_DSD"),"ZIP_CODE_4");
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
		
		
		
		String json = requestJson(ssn, nombre, ape1, ape2, dir1, dir2, mun, zipcode, zipcode4);
		
		RequestBody body = RequestBody.create(APPLICATION_JSON, json);
		Request request = new Request.Builder()
			  .addHeader("x-api-key", Configuration.getInstance().get("ServiciosEnLinea.APIKey"))
			  .header("User-Agent", "curl/7.68.0")
		      .url(Configuration.getInstance().get("ServiciosEnLinea.URL"))
		      .post(body)
		      .build();
		
		try 
		{
			Response response = client.newCall(request).execute();
		      //return response.body().string();
			if (response.isSuccessful()) {
                // Process the response
                //System.out.println("Response code: " + response.code());
                //System.out.println("Response body: " + response.body().string());
            
				String html = 
						"<html>"
								+ "<head><script>alert(\"Certificacion\");</script></head>"
								+"<form action=\"./GetPDF\" method=\"post\">"
								+"<input type=\"submit\" value=\"Oprima aqui para Certificacion de Servicios\" id=\"submit\">"
								+"<input type=\"hidden\" id=\"fPdf\" name=\"fPdf\" value=\""+ response.body().string() +"\">"
								+"</form>"
								+"</html>";
				this.app.registerClientContent ( html, "printStr" );
				STATUS_CODE = this.dm.dbClose(OPEN_ID);
				STATUS2_CODE = this.dm.dbClose(OPEN2_ID);
				STATUS3_CODE = this.dm.dbClose(OPEN3_ID);
				//this.app.callCommand(2000);
				return;
			} else {
                // Handle unsuccessful response
                System.out.println("Request failed with status code: " + response.code());
                System.out.println("Response message: " + response.message());
                if (response.body() != null) {
                    System.out.println("Response data: " + response.body().string());
                } else {
                    System.out.println("Response body is empty.");
                }
			}

            // Always close the response to free resources
            response.close();
        } catch (IOException e) {
            // Handle IO exceptions (e.g., no internet, timeout)
            System.out.println("Network error occurred: " + e.getMessage());
        } catch (Exception e) {
            // Catch any other unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
		
		  
		//client.
	}
	
}
