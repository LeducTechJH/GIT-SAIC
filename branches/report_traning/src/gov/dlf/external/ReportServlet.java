package gov.dlf.external;

/**
 * @author ma1484
 *
 */

//Librerias de Maintrend necesarias para establecer conexión a la base de datos.
import net.maintrend.datamanager.*;
import net.maintrend.util.*;

//Libreria de objeto de conexión para pasar al engine de Jasper
import java.sql.Connection;

//Libreria para instanciar el objeto que contendrá los parametros del reporte
import java.util.Map;
import java.util.HashMap;

//Manejo de exepciones, lectura de archivos y output.
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;

//Para implementación del servlet de referencia.
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.birt.report.engine.api.*;
import gov.dlf.external.BirtEngine;


/**
 * Servlet implementation class ReportServlet
 */
public class ReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String realPath;
	private IReportEngine birtReportEngine = null;
   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReportServlet()
    {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void destroy()
    {
		
    	super.destroy(); 
		
		birtReportEngine.destroy();
	
    }


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
     // TODO Auto-generated method stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
		// TODO Auto-generated method stub
        processRequest(request, response);
	}
	
	public void processRequest(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException
    {
    
		/**********************************************************************
		Configuration conInfo = Configuration.getInstance ( );
		String conString = conInfo.get ( "ConnectionString" );
		
		DataConnectionSql sqlConn = new DataConnectionSql ( );
		sqlConn.connect ( conString );
		
		Connection connection = sqlConn.getConnection ( );
		**********************************************************************/
		String report = req.getParameter ("r");
		
		Map parMap = req.getParameterMap ( );
		
		parMap = new HashMap ( parMap );
		
		parMap.remove( "r" );
		
		System.out.println( parMap );
		
		//System.out.println(report);
		
		ServletOutputStream servletOutputStream = res.getOutputStream ( );
		
		ServletContext context = getServletContext();
		
		String repPath = context.getRealPath("\\") + "WEB-INF\\classes\\gov\\dlf\\reports\\" + report + ".rptdesign";
		
		//InputStream reportStream = context.getResourceAsStream ( repPath );
		
		//System.out.println(reportStream.toString());
		
		try
		{
			birtReportEngine = BirtEngine.getBirtEngine( context );
			
			IReportRunnable iReport = birtReportEngine.openReportDesign ( repPath );
			
			PDFRenderOption rendOpt = new PDFRenderOption ( );
			
			rendOpt.setOutputFormat ( PDFRenderOption.OUTPUT_FORMAT_PDF );
			//rendOpt.setOutputFileName( repPath.replaceFirst("rptdesign", "pdf") );
			rendOpt.setOutputStream(servletOutputStream);
			
			IRunAndRenderTask task = birtReportEngine.createRunAndRenderTask ( iReport );
			
			task.setRenderOption( rendOpt );
			
			task.run();
			task.close();

		//	connection.close();
	
			res.setContentType("application/pdf");
			servletOutputStream.flush();
			servletOutputStream.close();
		}
		catch (Exception e)
		{
			// Atrapa cualquier error durante la generación del reporte y lo despliega en el browser.
			StringWriter stringWriter = new StringWriter();
			PrintWriter printWriter = new PrintWriter(stringWriter);
			e.printStackTrace(printWriter);
			res.setContentType("text/plain");
			res.getOutputStream().print(stringWriter.toString());
		}
		
	}

}
