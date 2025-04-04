package gov.dlf.webservice.certpan.endpoint;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.commons.codec.binary.Base64;
import javax.jws.WebService;
import javax.net.ssl.HttpsURLConnection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gov.dlf.facade.SAIC_DMQ_ORA_Application;
import gov.dlf.logic.CERT_INFO_GET_ADL;


@WebService(name="GetPDF")
public class GetPDF extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		GetPDF(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        GetPDF(request, response);
    }
    public SAIC_DMQ_ORA_Application app;
    public void GetPDF(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Spdf =request.getParameter("fPdf");
    	Base64 decoder = new Base64(true);
		byte[] pdf = decoder.decode(Spdf);

       response.setHeader("Expires", "0");
       response.setHeader("Cache-Control","must-revalidate, post-check=0, pre-check=0");
       response.setHeader("Pragma", "public");
       response.setContentType("application/pdf");
       response.setContentLength(pdf.length);
       OutputStream os = response.getOutputStream();
       os.write(pdf);
       os.flush();
       os.close();

    }

    private void close(Closeable resource) throws IOException {
        if (resource != null) {
            resource.close();
        }
    }}