package gov.dif.downloadpdf;

import gov.dif.downloadpdf.Download;
import gov.dlf.facade.SAIC_DMQ_ORA_Application;
import net.maintrend.appmanager.Application;
import net.maintrend.datamanager.DataStore;
import net.maintrend.interfaces.IDataConnection;
import net.maintrend.rallyengine.RallyDataManager;
import net.maintrend.rallyengine.RallyDataStoreException;
import net.maintrend.util.Compare;
import oracle.jdbc.OracleTypeMetaData.Array;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.codec.wmf.Point;
import com.sun.security.ntlm.Client;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileOutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import gov.dif.downloadpdf.RetriveOracleData;
import gov.dif.downloadpdf.TableClass.Cliente;
import gov.dif.downloadpdf.TableClass.Hijos;
import gov.dif.downloadpdf.TableClass.Otros;
import gov.dif.downloadpdf.FillPDF;

import static javax.swing.JOptionPane.showMessageDialog;

public class DownloadPDFImpl implements DownloadPDF 
{

	static SAIC_DMQ_ORA_Application app;

	@Override
	public void setApp(SAIC_DMQ_ORA_Application __app) 
	{
		DownloadPDFImpl.app = __app;
	}

	@Override
	public void COVID() 
	{
		try {

			RetriveOracleData rod = new RetriveOracleData();
			Cliente cl = new Cliente();
			cl = rod.retirveDataCliente(app);

			List<Hijos> lh = new ArrayList<Hijos>();
			lh = rod.retirveDataHijos(app);

			List<Otros> lo = new ArrayList<Otros>();
			lo = rod.retirveDataOtros(app);

			FillPDF fpdf = new FillPDF();
			String TempPath = fpdf.FillPDFCOVID(cl, lh, lo);

			Download.downLoadFile(TempPath, "COVID19.PDF");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}