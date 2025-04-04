package gov.dif.downloadpdf;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.io.*;

public class Download {

	public static void downLoadFile(String fromFile, String toFile) throws MalformedURLException, IOException 
	{
		try 
		{
			String home = System.getProperty("user.home");
			File fileOut = new File(home + "/Downloads/" + toFile);
			URL url = new File(fromFile).toURI().toURL();
			FileUtils.copyURLToFile(url, fileOut, 60000, 60000);

			File file = new File(fromFile);
			file.delete();
			Desktop desktop = Desktop.getDesktop();
			desktop.open(fileOut);

		} 
		
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("exception on: DownLoad() function: " + e.getMessage());
		}

	}

}
