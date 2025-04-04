package gov.dif.downloadpdf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.URL;
import java.nio.file.Paths;
import java.util.List;

import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

import gov.dif.downloadpdf.TableClass.Cliente;
import gov.dif.downloadpdf.TableClass.Hijos;
import gov.dif.downloadpdf.TableClass.Otros;
import net.maintrend.util.Configuration;

public class FillPDF {
	
	public String FillPDFCOVID( Cliente cl, List<Hijos> lh, List<Otros> lo) throws Exception
	{
		try
		{
			
    		File tempin =new File(FillPDF.class.getProtectionDomain().getCodeSource().getLocation().getPath());
    		String absolutePathIn = tempin.getAbsolutePath();
    		String inPath = absolutePathIn.substring(0,absolutePathIn.lastIndexOf(File.separator));
    		//String in = inPath + "\\doc\\COVID19.pdf";
    		
    		String in = Configuration.getInstance ( ).get ( "TemporaryDir" );
    		URL url = new File(in).toURI().toURL();
			
			File tempout = File.createTempFile("COVID", ".pdf");
			String absolutePath = tempout.getAbsolutePath();
    		String outPath = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator));
    		String out = outPath + tempout.getName();
			
			PdfReader reader = new PdfReader(url);
			PdfStamper stamper = null;
			
			stamper = new PdfStamper(reader, new FileOutputStream(out));
			
			PdfContentByte canvas = stamper.getOverContent(1);
			
			Font font = new Font();
	        font.setSize(9);
	        
	        // Margenes
	        float marx = 36;
	        float mary = 5;
	        
	        Rectangle dim = reader.getPageSize(1);
	        float top = (float) (dim.getHeight());

	        // Puntos = 1/72"
	        // Nombre cliente ------------------------------------------------------------------------------------
            float x = marx + 48;
            float y =  (float) (top - mary - 151.92);
	        ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.NombreC, font), x, y, 0);
	        x = (float) (marx + 105.8);
            y =  (float) (top - mary - 151.92);
	        ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.InicialC, font), x, y, 0);
	        x = (float) (marx + 159.2);
            y =  (float) (top - mary - 151.92);
	        ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.PaternoC, font), x, y, 0);
	        x = (float) (marx + 240.4);
            y =  (float) (top - mary - 151.92);
	        ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.MaternoC, font), x, y, 0);
	        //----------------------------------------------------------------------------------------------------
	        
	        x = marx + 170;
            y =  (float) (top - mary - 196);
	        ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.SSCliente, font), x, y, 0);
	        
	        x = (float) (marx + 205);
            y =  (float) (top - mary - 218);
	        ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.FechaNacimiento, font), x, y, 0);
	        
	        x = (float) (marx + 198);
            y =  (float) (top - mary - 262);
	        ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.Licencia, font), x, y, 0);
	        
	        x = (float) (marx + 266.4);
            y =  (float) (top - mary - 286);
	        ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.Pasaporte, font), x, y, 0);
	        
	        x = (float) (marx + 245.6);
            y =  (float) (top - mary - 308);
	        ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.DireccionPostal, font), x, y, 0);
	        
	        x = (float) (marx + 245.6);
            y =  (float) (top - mary - 323);
	        ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.DireccionResidencial, font), x, y, 0);
	        
	        x = (float) (marx + 216);
            y =  (float) (top - mary - 344);
	        ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.EMail, font), x, y, 0);
	        
	        x = (float) (marx + 139.2);
            y =  (float) (top - mary - 369);
	        ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.TelefonoCelular, font), x, y, 0);
	        
	        x = (float) (marx + 245);
            y =  (float) (top - mary - 369);
	        ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.TelefonoHogar, font), x, y, 0);
	        
	        // Educacion ----------------------------------------------------------------------------------------
	        
	        switch (cl.NivelEducativo)
	        {
	        case "Elemental":
	        	x = (float) (marx + 142);
	        	y =  (float) (top - mary - 388.4);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase("X", font), x, y, 0);
	        	break;
	        case "Intermedia":
	        	x = (float) (marx + 183.2);
	        	y =  (float) (top - mary - 388.4);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase("X", font), x, y, 0);
	        	break;
	        case "Superior":
	        	x = (float) (marx + 228.6);
	        	y =  (float) (top - mary - 388.4);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase("X", font), x, y, 0);
	        	break;
	        case "XXXX":
	        	x = (float) (marx + 290);
	        	y =  (float) (top - mary - 388.4);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase("X", font), x, y, 0);
	        	break;
	        case "Universitario":
	        	x = (float) (marx + 370.2);
	        	y =  (float) (top - mary - 388.4);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase("X", font), x, y, 0);
	        	break;
	        case "YYYY":
	        	x = (float) (marx + 459);
	        	y =  (float) (top - mary - 388.4);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase("X", font), x, y, 0);
	        	break;
	        default:
	        	break;
	        }
	        //----------------------------------------------------------------------------------------------------
	        
	        // Estado Civlil--------------------------------------------------------------------------------------
	        
	        if(cl.EstadoCivil == "CONSENSUAL")
	        {
	        	x = (float) (marx + 118.4);
	        	y =  (float) (top - mary - 424.8);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase("X", font), x, y, 0);
	        }
	        else
	        {
	        	x = (float) (marx + 254);
	        	y =  (float) (top - mary - 424.8);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase("X", font), x, y, 0);
	        }
	        
	        //----------------------------------------------------------------------------------------------------
	        
	        x = (float) (marx + 139.6);
            y =  (float) (top - mary - 445.4);
	        ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.NombreConyuge, font), x, y, 0);
	        
	        // Informacion hijos ---------------------------------------------------------------------------------
	        
	        // linea 1 
	        if (lh.size() > 0)
	        {
	        	x = (float) (marx + 52.6);
	        	y =  (float) (top - mary - 569.4);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(0).Nombre, font), x, y, 0);
	        
	        	x = (float) (marx + 113.2);
	        	y =  (float) (top - mary - 569.4);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(0).SegSoc, font), x, y, 0);
	        
	        	x = (float) (marx + 178);
	        	y =  (float) (top - mary - 569.4);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(0).FechaNacimiento, font), x, y, 0);
	        
	        	x = (float) (marx + 238);
	        	y =  (float) (top - mary - 569.4);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(0).Edad, font), x, y, 0);
	        
	        	x = (float) (marx + 302.6);
	        	y =  (float) (top - mary - 569.4);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(0).AsisteRegular, font), x, y, 0);
	        
	        	x = (float) (marx + 365.2);
	        	y =  (float) (top - mary - 569.4);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(0).PensionAlimenticia, font), x, y, 0);
	        
	        	x = (float) (marx + 434.2);
	        	y =  (float) (top - mary - 569.4);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(0).CantidadPension, font), x, y, 0);
	        
	        	x = (float) (marx + 490.8);
	        	y =  (float) (top - mary - 569.4);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(0).Frecuencia, font), x, y, 0);
	        }
	        
	        // 583.2
	        // linea 2 
	        
	        if (lh.size() > 1)
	        {
	        	x = (float) (marx + 52.6);
	        	y =  (float) (top - mary - 583.2);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(1).Nombre, font), x, y, 0);
	        
	        	x = (float) (marx + 113.2);
	        	y =  (float) (top - mary - 583.2);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(1).SegSoc, font), x, y, 0);
	        
	        	x = (float) (marx + 178);
	        	y =  (float) (top - mary - 583.2);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(1).FechaNacimiento, font), x, y, 0);
	        
	        	x = (float) (marx + 238);
	        	y =  (float) (top - mary - 583.2);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(1).Edad, font), x, y, 0);
	        
	        	x = (float) (marx + 302.6);
	        	y =  (float) (top - mary - 583.2);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(1).AsisteRegular, font), x, y, 0);
	        
	        	x = (float) (marx + 365.2);
	        	y =  (float) (top - mary - 583.2);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(1).PensionAlimenticia, font), x, y, 0);
	        
	        	x = (float) (marx + 434.2);
	        	y =  (float) (top - mary - 583.2);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(1).CantidadPension, font), x, y, 0);
	        
	        	x = (float) (marx + 490.8);
	        	y =  (float) (top - mary - 583.2);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(1).Frecuencia, font), x, y, 0);
	        }
	        
	        // 597.6
	        // linea 3 
	        	
	        if (lh.size() > 2)
	        {
	        	x = (float) (marx + 52.6);
	        	y =  (float) (top - mary - 597.6);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(2).Nombre, font), x, y, 0);
	        
	        	x = (float) (marx + 113.2);
	        	y =  (float) (top - mary - 597.6);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(2).SegSoc, font), x, y, 0);
	        
	        	x = (float) (marx + 178);
	        	y =  (float) (top - mary - 597.6);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(2).FechaNacimiento, font), x, y, 0);
	        
	        	x = (float) (marx + 238);
	        	y =  (float) (top - mary - 597.6);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(2).Edad, font), x, y, 0);
	        
	        	x = (float) (marx + 302.6);
	        	y =  (float) (top - mary - 597.6);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(2).AsisteRegular, font), x, y, 0);
	        
	        	x = (float) (marx + 365.2);
	        	y =  (float) (top - mary - 597.6);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(2).PensionAlimenticia, font), x, y, 0);
	        
	        	x = (float) (marx + 434.2);
	        	y =  (float) (top - mary - 597.6);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(2).CantidadPension, font), x, y, 0);
	        
	        	x = (float) (marx + 490.8);
	        	y =  (float) (top - mary - 597.6);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(2).Frecuencia, font), x, y, 0);
	        }
	        
	        // 610.7
	        // linea 4 
	        
	        if (lh.size() > 3)
	        {
	        	x = (float) (marx + 52.6);
	        	y =  (float) (top - mary - 610.7);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(3).Nombre, font), x, y, 0);
	        
	        	x = (float) (marx + 113.2);
	        	y =  (float) (top - mary - 610.7);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(3).SegSoc, font), x, y, 0);
	        
	        	x = (float) (marx + 178);
	        	y =  (float) (top - mary - 610.7);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(3).FechaNacimiento, font), x, y, 0);
	        
	        	x = (float) (marx + 238);
	        	y =  (float) (top - mary - 610.7);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(3).Edad, font), x, y, 0);
	        
	        	x = (float) (marx + 302.6);
	        	y =  (float) (top - mary - 610.7);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(3).AsisteRegular, font), x, y, 0);
	        
	        	x = (float) (marx + 365.2);
	        	y =  (float) (top - mary - 610.7);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(3).PensionAlimenticia, font), x, y, 0);
	        
	        	x = (float) (marx + 434.2);
	        	y =  (float) (top - mary - 610.7);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(3).CantidadPension, font), x, y, 0);
	        
	        	x = (float) (marx + 490.8);
	        	y =  (float) (top - mary - 610.7);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(3).Frecuencia, font), x, y, 0);
	        }
	        
	        // 626.4
	        // linea 5 
	        
	        if (lh.size() > 4)
	        {
	        	x = (float) (marx + 52.6);
	        	y =  (float) (top - mary - 624.4);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(4).Nombre, font), x, y, 0);
	        
	        	x = (float) (marx + 113.2);
	        	y =  (float) (top - mary - 624.4);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(4).SegSoc, font), x, y, 0);
	        
	        	x = (float) (marx + 178);
	        	y =  (float) (top - mary - 624.4);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(4).FechaNacimiento, font), x, y, 0);
	        
	        	x = (float) (marx + 238);
	        	y =  (float) (top - mary - 624.4);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(4).Edad, font), x, y, 0);
	        
	        	x = (float) (marx + 302.6);
	        	y =  (float) (top - mary - 624.4);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(4).AsisteRegular, font), x, y, 0);
	        
	        	x = (float) (marx + 365.2);
	        	y =  (float) (top - mary - 624.4);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(4).PensionAlimenticia, font), x, y, 0);
	        
	        	x = (float) (marx + 434.2);
	        	y =  (float) (top - mary - 624.4);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(4).CantidadPension, font), x, y, 0);
	        
	        	x = (float) (marx + 490.8);
	        	y =  (float) (top - mary - 624.4);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(4).Frecuencia, font), x, y, 0);
	        }
	        
	        // 640.8
	        // linea 6 
	        
	        if (lh.size() > 5)
	        {
	        	x = (float) (marx + 52.6);
	        	y =  (float) (top - mary - 638.8);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(5).Nombre, font), x, y, 0);
	        
	        	x = (float) (marx + 113.2);
	        	y =  (float) (top - mary - 638.8);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(5).SegSoc, font), x, y, 0);
	        
	        	x = (float) (marx + 178);
	        	y =  (float) (top - mary - 638.8);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(5).FechaNacimiento, font), x, y, 0);
	        
	        	x = (float) (marx + 238);
	        	y =  (float) (top - mary - 638.8);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(5).Edad, font), x, y, 0);
	        
	        	x = (float) (marx + 302.6);
	        	y =  (float) (top - mary - 638.8);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(5).AsisteRegular, font), x, y, 0);
	        
	        	x = (float) (marx + 365.2);
	        	y =  (float) (top - mary - 638.8);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(5).PensionAlimenticia, font), x, y, 0);
	        
	        	x = (float) (marx + 434.2);
	        	y =  (float) (top - mary - 638.8);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(5).CantidadPension, font), x, y, 0);
	        
	        	x = (float) (marx + 490.8);
	        	y =  (float) (top - mary - 638.8);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(5).Frecuencia, font), x, y, 0);
	        }
	        
	        // 655.2
	        // linea 7 
	        
	        if (lh.size() > 6)
	        {
	        	x = (float) (marx + 52.6);
	        	y =  (float) (top - mary - 653.2);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(6).Nombre, font), x, y, 0);
	        
	        	x = (float) (marx + 113.2);
	        	y =  (float) (top - mary - 653.2);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(6).SegSoc, font), x, y, 0);
	        
	        	x = (float) (marx + 178);
	        	y =  (float) (top - mary - 653.2);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(6).FechaNacimiento, font), x, y, 0);
	        
	        	x = (float) (marx + 238);
	        	y =  (float) (top - mary - 653.2);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(6).Edad, font), x, y, 0);
	        
	        	x = (float) (marx + 302.6);
	        	y =  (float) (top - mary - 653.2);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(6).AsisteRegular, font), x, y, 0);
	        
	        	x = (float) (marx + 365.2);
	        	y =  (float) (top - mary - 653.2);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(6).PensionAlimenticia, font), x, y, 0);
	        
	        	x = (float) (marx + 434.2);
	        	y =  (float) (top - mary - 653.2);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(6).CantidadPension, font), x, y, 0);
	        
	        	x = (float) (marx + 490.8);
	        	y =  (float) (top - mary - 653.2);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lh.get(6).Frecuencia, font), x, y, 0);
	        }
	        
	       //----------------------------------------------------------------------------------------------------
	        
	       // Informacion otros --------------------------------------------------------------------------------
	        
	        // linea 1 
	        if (lo.size() > 0)
	        {
	        	x = (float) (marx + 50.6);
	        	y =  (float) (top - mary - 766);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(0).Nombre, font), x, y, 0);
        
	        	x = (float) (marx + 123.2);
	        	y =  (float) (top - mary - 766);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(0).SegSoc, font), x, y, 0);
        
	        	x = (float) (marx + 194);
	        	y =  (float) (top - mary - 766);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(0).FechaNacimiento, font), x, y, 0);
        
	        	x = (float) (marx + 268.2);
	        	y =  (float) (top - mary - 766);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(0).Edad, font), x, y, 0);
        
	        	x = (float) (marx + 340.6);
	        	y =  (float) (top - mary - 766);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(0).Parentesco, font), x, y, 0);
        
	        	x = (float) (marx + 415.2);
	        	y =  (float) (top - mary - 766);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(0).FuenteIngreso, font), x, y, 0);
        
	        	x = (float) (marx + 486.8);
	        	y =  (float) (top - mary - 766);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(0).Cantidad, font), x, y, 0);
	        }
	        
	        // 779.8
        	// linea 2 
	        if (lo.size() > 1)
	        {
	        	x = (float) (marx + 50.6);
	        	y =  (float) (top - mary - 779.8);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(1).Nombre, font), x, y, 0);
        
	        	x = (float) (marx + 123.2);
	        	y =  (float) (top - mary - 779.8);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(1).SegSoc, font), x, y, 0);
        
	        	x = (float) (marx + 194);
	        	y =  (float) (top - mary - 779.8);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(1).FechaNacimiento, font), x, y, 0);
        
	        	x = (float) (marx + 268.2);
	        	y =  (float) (top - mary - 779.8);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(1).Edad, font), x, y, 0);
        
	        	x = (float) (marx + 340.6);
	        	y =  (float) (top - mary - 779.8);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(1).Parentesco, font), x, y, 0);
        
	        	x = (float) (marx + 415.2);
	        	y =  (float) (top - mary - 779.8);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(1).FuenteIngreso, font), x, y, 0);
        
	        	x = (float) (marx + 486.8);
	        	y =  (float) (top - mary - 779.8);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(1).Cantidad, font), x, y, 0);
	        }
        	
        	// 794.2
        	// linea 3 
	        if (lo.size() > 2)
	        {
	        	x = (float) (marx + 50.6);
	        	y =  (float) (top - mary - 794.2);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(2).Nombre, font), x, y, 0);
        
	        	x = (float) (marx + 123.2);
	        	y =  (float) (top - mary - 794.2);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(2).SegSoc, font), x, y, 0);
        
	        	x = (float) (marx + 194);
	        	y =  (float) (top - mary - 794.2);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(2).FechaNacimiento, font), x, y, 0);
        
	        	x = (float) (marx + 268.2);
	        	y =  (float) (top - mary - 794.2);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(2).Edad, font), x, y, 0);
        
	        	x = (float) (marx + 340.6);
	        	y =  (float) (top - mary - 794.2);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(2).Parentesco, font), x, y, 0);
        
	        	x = (float) (marx + 415.2);
	        	y =  (float) (top - mary - 794.2);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(2).FuenteIngreso, font), x, y, 0);
        
	        	x = (float) (marx + 486.8);
	        	y =  (float) (top - mary - 794.2);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(2).Cantidad, font), x, y, 0);
	        }
        	
        	// 809
        	// linea 4 
	        if (lo.size() > 3)
	        {
	        	x = (float) (marx + 50.6);
	        	y =  (float) (top - mary - 809);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(3).Nombre, font), x, y, 0);
        
	        	x = (float) (marx + 123.2);
	        	y =  (float) (top - mary - 809);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(3).SegSoc, font), x, y, 0);
        
	        	x = (float) (marx + 194);
	        	y =  (float) (top - mary - 809);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(3).FechaNacimiento, font), x, y, 0);
        
	        	x = (float) (marx + 268.2);
	        	y =  (float) (top - mary - 809);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(3).Edad, font), x, y, 0);
        
	        	x = (float) (marx + 340.6);
	        	y =  (float) (top - mary - 809);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(3).Parentesco, font), x, y, 0);
        
	        	x = (float) (marx + 415.2);
	        	y =  (float) (top - mary - 809);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(3).FuenteIngreso, font), x, y, 0);
        
	        	x = (float) (marx + 486.8);
	        	y =  (float) (top - mary - 809);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(lo.get(3).Cantidad, font), x, y, 0);
	        }
	        
	       //----------------------------------------------------------------------------------------------------
	        
	        x = (float) (marx + 385.4);
            y =  (float) (top - mary - 879);
	        ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.FechaSolicid, font), x, y, 0);
	        
	        // Recibio ayuda economica----------------------------------------------------------------------------
	        
	        if(cl.EstatusServicio == "ACTIVO")
	        {
	        x = (float) (marx + 65.8);
            y =  (float) (top - mary - 930.56);
	        ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase("X", font), x, y, 0);
	        }
	        else
	        {
	        x = (float) (marx + 195);
            y =  (float) (top - mary - 930.6);
	        ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase("X", font), x, y, 0);
	        }
	        
	        //----------------------------------------------------------------------------------------------------
	        
	        // Pagina 2
	        canvas = stamper.getOverContent(2);
	        
	        // Situacion economica--------------------------------------------------------------------------------
	        
	        if (cl.EstatusEmpleo == "EMPLEADO")
	        {
	        	x = (float) (marx + 107.6);
	        	y =  (float) (top - mary - 71);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase("X", font), x, y, 0);
	        }
	        else
	        {
	        	x = (float) (marx + 206.6);
	        	y =  (float) (top - mary - 71);
	        	ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase("X", font), x, y, 0);
	        }
	        
	        //----------------------------------------------------------------------------------------------------
	        
	        x = (float) (marx + 165.6);
            y =  (float) (top - mary - 91);
	        ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.Ocupacion, font), x, y, 0);
	        
	        // Informacion del Patrono ---------------------------------------------------------------------------
	        
	        x = (float) (marx + 108);
            y =  (float) (top - mary - 136.8);
	        ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.NombrePatrono, font), x, y, 0);
	        
	        x = (float) (marx + 226.2);
            y =  (float) (top - mary - 159.2);
            // cl.NombrePatrono
	        ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.SSPatronal, font), x, y, 0);
	        
	        x = (float) (marx + 372.8);
            y =  (float) (top - mary - 159.2);
            // cl.NombrePatrono
	        ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.TelTrabajo, font), x, y, 0);
	        
	        x = (float) (marx + 165.2);
            y =  (float) (top - mary - 181.44);
	        ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.DirTrabajoP, font), x, y, 0);
	        
	        x = (float) (marx + 165.2);
            y =  (float) (top - mary - 196);
	        ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.DirTrabajoF, font), x, y, 0);
	        
	        //----------------------------------------------------------------------------------------------------
	        
	        // Frecuencia de pago --------------------------------------------------------------------------------
	        
	        
	        switch(cl.FrecuenciaIngreso)
	        {
	        	case "S":
	        		x = (float) (marx + 198);
	        		y =  (float) (top - mary - 210.4);
	        		ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase("X", font), x, y, 0);
	        		break;
	        	case "B":	        
	        		x = (float) (marx + 262.2);
	        		y =  (float) (top - mary - 210.4);
	        		ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase("X", font), x, y, 0);
	        		break;
	        	case "Q":
	        		x = (float) (marx + 328);
	        		y =  (float) (top - mary - 210.4);
	        		ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase("X", font), x, y, 0);
	        		break;
	        	case "M":
	        		x = (float) (marx + 387.2);
	        		y =  (float) (top - mary - 210.4);
	        		ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase("X", font), x, y, 0);
	        		break;
	        }
	        
	       //-----------------------------------------------------------------------------------------------------
	        
	       // Otros ingresos -------------------------------------------------------------------------------------
	        
	       switch(cl.IngrsoAdicional)
	       {
	       		case "SEGUROSOCIAL":
	       			x = (float) (marx + 350.4);
	       			y =  (float) (top - mary - 311.2);
	       			ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.CantidadAdicional, font), x, y, 0);
	       			break;
	       		case "VETERANO":
	       			x = (float) (marx + 350.4);
	       			y =  (float) (top - mary - 331.2);
	       			ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.CantidadAdicional, font), x, y, 0);
	       			break;
	       		case "RETIRO":
	       			x = (float) (marx + 350.4);
	       			y =  (float) (top - mary - 369.2);
	       			ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.CantidadAdicional, font), x, y, 0);
	       			break;
	       }
	       //-----------------------------------------------------------------------------------------------------
    		
    	   // Bienes imuebles ------------------------------------------------------------------------------------
    		
    		switch (cl.DescRecurso)
    		{
    			case "DINERO EN EFECTIVO":
    				x = (float) (marx + 330.9);
    				y =  (float) (top - mary - 532.3);
    				ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.ValorRecurso, font), x, y, 0);
    				break;
    		//case "":
    		//x = (float) (marx + 104.4);
    		//y =  (float) (top - mary - 571.5);
    		//ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.ValorRecurso, font), x, y, 0);
    		//break;
    			case "CUENTAS DE AHORRO":
    				x = (float) (marx + 295.2);
    				y =  (float) (top - mary - 591.4);
    				ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.ValorRecurso, font), x, y, 0);
    				break;
    			case "ACCIONES_BONOS":
    				x = (float) (marx + 223.2);
    				y =  (float) (top - mary - 612.9);
    				ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.ValorRecurso, font), x, y, 0);
    				break;
    			case "CUENTAS/COBRAR":
    				x = (float) (marx + 57.6);
    				y =  (float) (top - mary - 712.8);
    				ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.ValorRecurso, font), x, y, 0);
    				break;
    		}
    	   //-----------------------------------------------------------------------------------------------------
	        
    		// Pagina 3
	        canvas = stamper.getOverContent(3);
	        
	        x = (float) (marx + 87);
    		y =  (float) (top - mary - 86.4);
    		ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase(cl.NombreCliente, font), x, y, 0);
    		
			stamper.close();
			
	        reader.close();
			
			return out;
			
		}
		catch (Exception e) {
            e.printStackTrace();
            System.out.println("exception on: DownLoad() function: " + e.getMessage());
            return "";
        }
		
	}

}
