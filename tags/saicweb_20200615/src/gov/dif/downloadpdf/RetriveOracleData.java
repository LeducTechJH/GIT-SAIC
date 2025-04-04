package gov.dif.downloadpdf;

import java.io.File;

//STEP 1. Import required packages
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.swing.text.MaskFormatter;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import gov.dif.downloadpdf.TableClass.Cliente;
import gov.dif.downloadpdf.TableClass.Hijos;
import gov.dif.downloadpdf.TableClass.Otros;
import gov.dlf.facade.SAIC_DMQ_ORA_Application;
import net.maintrend.rallyengine.RallyDataManager;
import net.maintrend.util.Configuration;

import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import gov.dif.downloadpdf.ConnectionStringBuilder.ConnectionStringClass;;

public class RetriveOracleData {

	public Cliente retirveDataCliente(SAIC_DMQ_ORA_Application app) throws Exception 
	{
		try 
		{
			// RallyDataManager dm = (RallyDataManager) app.getDataManager ( );
			// ArrayList<Object> condata = (ArrayList<Object>) dm.getSqlConnections();

			// Connection con = (Connection) condata.get(0);
			// Class.forName("oracle.jdbc.driver.OracleDriver");

			String SAIC_Drvr = "oracle.jdbc.driver.OracleDriver";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String conString = Configuration.getInstance().get("ConnectionString");
			ConnectionStringBuilder csb = new ConnectionStringBuilder();
			ConnectionStringClass csc = csb.ConvertString(conString);
			Connection con = DriverManager.getConnection(csc.DataBaseURL, csc.LOGIN, csc.PASSWORD);

			Statement stmt = con.createStatement();

			Double dbl = app.SS_CLIENTE_GBL;
			int ss = dbl.intValue();
			String sql = "SELECT \r\n" + "\r\n" + "-- Nombre del cliente\r\n"
					+ "COALESCE(c.dsc_nombre,' ') AS nombre_cl, COALESCE(c.dsc_inicial,' ') AS inicial_cl, \r\n"
					+ "COALESCE(c.dsc_apellido_paterno,'  ') AS paterno_cl, COALESCE(c.dsc_apellido_materno,' ') AS materno_cl, \r\n"
					+ "\r\n" + "-- Nombre del conyuge\r\n"
					+ "COALESCE(ccy.dsc_nombre,' ') AS nombre_ccy, COALESCE(ccy.dsc_inicial,' ') AS inicial_ccy, \r\n"
					+ "COALESCE(ccy.dsc_apellido_paterno, ' ') AS paterno_ccy,  \r\n"
					+ "COALESCE(ccy.dsc_apellido_materno, ' ') AS materno_ccy, \r\n" + "\r\n"
					+ "-- Datos adicionales del cliente\r\n"
					+ "c.seguro_social_cliente, COALESCE(c.fch_nacimiento,TO_TIMESTAMP('1/1/1979')) AS fecha_nacimiento, \r\n"
					+ "COALESCE(c.email,' ') AS email, COALESCE(e.nivel,' ') AS nivel_educativo, \r\n"
					+ "COALESCE(c.telefono_hogar,' ') AS telefono_hogar, \r\n"
					+ "COALESCE(c.telefono_celular,' ') AS celular, COALESCE(ec.estado,' ') AS estado_civil, \r\n"
					+ "CASE WHEN c.verificacion_identidad = 'LCCA' THEN c.num_ver_id ELSE ' ' END AS licencia,\r\n"
					+ "CASE WHEN c.verificacion_ciudadania = 'PASS' THEN c.num_ver_ciu ELSE ' ' END AS pasaporte,\r\n"
					+ "\r\n" + "-- Direccion postal cliente\r\n"
					+ "COALESCE(dp.dsc_direccion_1,' ') AS direccion_1_p, COALESCE(dp.dsc_direccion_2,' ') AS direccion_2_p, \r\n"
					+ "COALESCE(zp.ciudad,' ') AS ciudad_p, COALESCE(dp.zip_code,0) AS zip_code_p,\r\n" + "\r\n"
					+ "-- Direccion residencial cliente\r\n"
					+ "COALESCE(dr.dsc_direccion_1,' ') AS direccion_1_r, COALESCE(dr.dsc_direccion_2,' ') AS direccion_2_r, \r\n"
					+ "COALESCE(zr.ciudad,' ') AS ciudad_r, COALESCE(dr.zip_code,0) AS zip_code_r,\r\n" + "\r\n"
					+ "-- Informacion del servicio\r\n"
					+ "COALESCE(sv.fch_solicitud,TO_TIMESTAMP('1/1/1979')) AS fecha_solicitud, \r\n"
					+ "COALESCE(sv.cod_status_servicio,' ') AS status_servicio, \r\n"
					+ "COALESCE(c.cod_estatus_empleo,' ') AS status_empleo,  \r\n"
					+ "COALESCE(ic.flg_frecuencia,' ') AS frecuencia_ingreso, -- S semanal B bisemanal Q quincenal M mensual \r\n"
					+ "COALESCE(ic.vlr_cantidad_ingreso,0) AS cantidad_adicional,\r\n"
					+ "COALESCE(it.dsc_ingreso,' ') AS descripcion_ingreso, COALESCE(od.ocupacion,' ') AS ocupacion, \r\n"
					+ "\r\n" + "-- Informacion del patrono\r\n"
					+ "COALESCE(ep.dsc_patrono,' ') AS nombre_patrono, COALESCE(ep.seguro_social_patronal,0) AS ss_patronal, \r\n"
					+ "COALESCE(c.telefono_trabajo,' ') AS telefono_trabajo, \r\n"
					+ "COALESCE(ep.dirpost1,' ') AS dir_p_patronal, COALESCE(ep.pueblopost,' ') AS pl_p_patronal, \r\n"
					+ "COALESCE(ep.zippost,0) AS zip_p_patronal, \r\n"
					+ "COALESCE(ep.dirfisi1,' ') AS dir_f_patronal, COALESCE(ep.pueblofisi,' ') AS pl_f_patronal, \r\n"
					+ "COALESCE(ep.zipfisi,0) AS zip_f_patronal, \r\n" + "\r\n" + "-- Informacion de recursos\r\n"
					+ "COALESCE(rc.vlr_cantidad_recurso,0) AS valor_recurso, COALESCE(rt.dsc_recurso,' ') AS descripcion_recurso\r\n"
					+ "\r\n" + "FROM clientes c\r\n"
					+ "LEFT JOIN direcciones dp ON dp.seguro_social_jefe_fam = c.seguro_social_jefe_familia AND dp.cod_tipo_direccion = 'SERV' AND rownum = 1\r\n"
					+ "LEFT JOIN zip_tbl zp ON zp.zip_code = dp.zip_code\r\n"
					+ "LEFT JOIN direcciones dr ON dr.seguro_social_jefe_fam = c.seguro_social_jefe_familia AND dp.cod_tipo_direccion = 'RESI' AND rownum = 1\r\n"
					+ "LEFT JOIN zip_tbl zr ON zr.zip_code = dr.zip_code\r\n"
					+ "LEFT JOIN escolaridad_dim e ON e.saic_key = c.cod_escolaridad\r\n"
					+ "LEFT JOIN estado_civil_dim ec ON ec.saic_key = c.cod_estado_civil\r\n"
					+ "LEFT JOIN clientes ccy ON ccy.seguro_social_jefe_familia = c.seguro_social_jefe_familia AND ccy.cod_parentesco_fam = 'CONY'\r\n"
					+ "LEFT JOIN servicios sv ON sv.seguro_social_jefe_fam = c.seguro_social_jefe_familia AND sv.cod_servicio = 'PAN' AND rownum = 1 \r\n"
					+ "LEFT JOIN ingresos_cliente ic ON ic.seguro_social_cliente = c.seguro_social_cliente AND rownum = 1 \r\n"
					+ "LEFT JOIN ingresos_tbl it ON it.cod_tipo_ingreso = ic.cod_tipo_ingreso\r\n"
					+ "LEFT JOIN recursos_cliente rc ON rc.seguro_social_cliente = c.seguro_social_cliente AND rownum = 1\r\n"
					+ "LEFT JOIN recursos_tbl rt ON rt.cod_tipo_recurso = rc.cod_tipo_recurso\r\n"
					+ "LEFT JOIN empleo_ptra ep ON ep.seguro_social_cliente = c.seguro_social_cliente AND rownum = 1\r\n"
					+ "LEFT JOIN ocupacion_dim od ON od.ocupacion_key = ep.oficio_profesion\r\n" + "WHERE \r\n"
					+ "rownum = 1 AND\r\n" + "c.seguro_social_cliente = " + Integer.toString(ss);

			ResultSet rs = stmt.executeQuery(sql);

			rs.next();

			Cliente cl = new Cliente();

			// Nombre del cliente
			String i = rs.getString("inicial_cl").trim();
			if (i.length() == 0) {
				i = " ";
			} else {
				i = " " + i + " ";
			}
			cl.NombreCliente = rs.getString("nombre_cl") + i + rs.getString("paterno_cl") + " "
					+ rs.getString("materno_cl");

			cl.NombreC = rs.getString("nombre_cl").trim();
			cl.InicialC = i.substring(0, 1);
			cl.PaternoC = rs.getString("paterno_cl").trim();
			cl.MaternoC = rs.getString("materno_cl").trim();

			// Nombre del conyuge
			i = rs.getString("inicial_ccy").trim();
			if (i.length() == 0) {
				i = " ";
			} else {
				i = " " + i + " ";
			}
			cl.NombreConyuge = rs.getString("nombre_ccy") + i + rs.getString("paterno_ccy") + " "
					+ rs.getString("materno_ccy");

			// Otros datos del cliente

			dbl = rs.getDouble("seguro_social_cliente");
			ss = dbl.intValue();
			MaskFormatter mf = new MaskFormatter("AAA      AA       AAAA");
			mf.setValueContainsLiteralCharacters(false);
			cl.SSCliente = mf.valueToString(Integer.toString(ss));

			Date fn = rs.getDate("fecha_nacimiento");

			Calendar calendarn = new GregorianCalendar();
			calendarn.setTime(fn);
			int yearn = calendarn.get(Calendar.YEAR);
			int monthn = calendarn.get(Calendar.MONTH) + 1;
			int dayn = calendarn.get(Calendar.DAY_OF_MONTH);

			SimpleDateFormat formattern = new SimpleDateFormat("yyyy-MM-dd");
			Date daten = formattern.parse("1979-1-1");
			String dn = formattern.format(daten);
			String fsfn = formattern.format(fn);

			if (fsfn == dn) {
				cl.FechaNacimiento = "";
			} else {
				cl.FechaNacimiento = Integer.toString(dayn) + "          " + Integer.toString(monthn) + "        "
						+ Integer.toString(yearn);
			}

			cl.EMail = rs.getString("email");
			cl.NivelEducativo = rs.getString("nivel_educativo");

			mf = new MaskFormatter("AAA AAA AAAA");
			mf.setValueContainsLiteralCharacters(false);
			cl.TelefonoHogar = mf.valueToString(rs.getString("telefono_hogar").trim());
			cl.TelefonoCelular = mf.valueToString(rs.getString("celular").trim());

			String s = rs.getString("estado_civil");
			if (s == "MADR/ADULT" || s == "CASADO" || s == "CONVIVENCI") {
				cl.EstadoCivil = "CONSENSUAL";
			} else {
				cl.EstadoCivil = "SOLTERO";
			}

			cl.Licencia = rs.getString("licencia");
			cl.Pasaporte = rs.getString("pasaporte");

			// Direccion postal cliente

			String d1 = rs.getString("direccion_1_p").trim();
			if (d1.length() == 0) {
				d1 = "";
			} else {
				d1 = d1 + " ";
			}

			String d2 = rs.getString("direccion_2_p").trim();
			if (d2.length() == 0) {
				d2 = "";
			} else {
				d2 = d2 + " ";
			}

			String p = rs.getString("ciudad_p").trim();
			if (p.length() == 0) {
				p = "";
			} else {
				p = p + " ";
			}

			String z = rs.getString("zip_code_p").trim();
			if (z.trim().length() == 1) {
				z = "";
			} else {
				z = z + " ";
			}

			cl.DireccionPostal = d1 + d2 + p + z;

			// Direccion residencial cliente

			d1 = rs.getString("direccion_1_r").trim();
			if (d1.length() == 0) {
				d1 = "";
			} else {
				d1 = d1 + " ";
			}

			d2 = rs.getString("direccion_2_r").trim();
			if (d2.length() == 0) {
				d2 = "";
			} else {
				d2 = d2 + " ";
			}

			p = rs.getString("ciudad_r").trim();
			if (p.length() == 0) {
				p = "";
			} else {
				p = p + " ";
			}

			z = rs.getString("zip_code_r").trim();
			if (z.trim().length() == 1) {
				z = "";
			} else {
				z = z + " ";
			}

			cl.DireccionResidencial = d1 + d2 + p + z;

			// Informacion del servicio

			Date fs = rs.getDate("fecha_solicitud");

			Calendar calendar = new GregorianCalendar();
			calendar.setTime(fs);
			int year = calendar.get(Calendar.YEAR);
			int month = calendar.get(Calendar.MONTH) + 1;
			int day = calendar.get(Calendar.DAY_OF_MONTH);

			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			Date date = formatter.parse("1979-1-1");
			String df = formatter.format(date);
			String fsf = formatter.format(fs);

			if (fsf == df) {
				cl.FechaSolicid = "";
			} else {
				cl.FechaSolicid = Integer.toString(day) + "         " + Integer.toString(month) + "         "
						+ Integer.toString(year);
			}

			cl.EstatusServicio = rs.getString("status_servicio");

			switch (rs.getString("status_empleo")) {
			case "F25":
				cl.EstatusEmpleo = "EMPLEADO";
				break;
			case "60OM":
				cl.EstatusEmpleo = "";
				break;
			case "CODE":
				cl.EstatusEmpleo = "DESMPLEADO";
				break;
			case "CU12":
				cl.EstatusEmpleo = "";
				break;
			case "CU15":
				cl.EstatusEmpleo = "";
				break;
			case "CU16":
				cl.EstatusEmpleo = "";
				break;
			case "CUIN":
				cl.EstatusEmpleo = "";
				break;
			case "DE50":
				cl.EstatusEmpleo = "DESMPLEADO";
				break;
			case "DE60":
				cl.EstatusEmpleo = "DESMPLEADO";
				break;
			case "DESE":
				cl.EstatusEmpleo = "DESMPLEADO";
				break;
			case "DESM":
				cl.EstatusEmpleo = "DESMPLEADO";
				break;
			case "DESN":
				cl.EstatusEmpleo = "DESMPLEADO";
				break;
			case "DEST":
				cl.EstatusEmpleo = "DESMPLEADO";
				break;
			case "EM23":
				cl.EstatusEmpleo = "EMPLEADO";
				break;
			case "EM24":
				cl.EstatusEmpleo = "EMPLEADO";
				break;
			case "EM<5":
				cl.EstatusEmpleo = "";
				break;
			case "EM>6":
				cl.EstatusEmpleo = "";
				break;
			case "EMPA":
				cl.EstatusEmpleo = "EMPLEADO";
				break;
			case "EMPL":
				cl.EstatusEmpleo = "EMPLEADO";
				break;
			case "ESEM":
				cl.EstatusEmpleo = "EMPLEADO";
				break;
			case "ESTC":
				cl.EstatusEmpleo = "";
				break;
			case "ETPC":
				cl.EstatusEmpleo = "";
				break;
			case "ETTP":
				cl.EstatusEmpleo = "EMPLEADO";
				break;
			case "EXTA":
				cl.EstatusEmpleo = "";
				break;
			case "ME21":
				cl.EstatusEmpleo = "";
				break;
			case "NP25":
				cl.EstatusEmpleo = "EMPLEADO";
				break;
			case "OTRO":
				cl.EstatusEmpleo = "";
				break;
			case "PINC":
				cl.EstatusEmpleo = "";
				break;
			case "PRAA":
				cl.EstatusEmpleo = "";
				break;
			case "RETI":
				cl.EstatusEmpleo = "";
				break;
			case "TANF":
				cl.EstatusEmpleo = "";
				break;
			default:
				cl.EstatusEmpleo = "";
				break;

			}

			cl.FrecuenciaIngreso = rs.getString("frecuencia_ingreso");

			String oi = rs.getString("descripcion_ingreso");

			cl.IngrsoAdicional = "";

			if (oi == "RETIRO PRIVADO" || oi == "RETIRO PRIVADO" || oi == "RETIRO DE MAESTROS" || oi == "RETIRO FEDERAL"
					|| oi == "RETIRO") {
				cl.IngrsoAdicional = "RETIRO";
			}

			if (oi == "VETERANOS") {
				cl.IngrsoAdicional = "VETERANO";
			}

			if (oi == "SEGURO SOCIAL") {
				cl.IngrsoAdicional = "SEGUROSOCIAL";
			}

			dbl = rs.getDouble("cantidad_adicional");
			int ca = dbl.intValue();
			if (ca == 0) {
				cl.CantidadAdicional = "";
			} else {
				cl.CantidadAdicional = Integer.toString(ca);
			}

			cl.Ocupacion = rs.getString("ocupacion");

			// Informacion del patrono

			cl.NombrePatrono = rs.getString("nombre_patrono");

			dbl = rs.getDouble("ss_patronal");
			ss = dbl.intValue();
			mf = new MaskFormatter("AA    AAAAAAA");
			mf.setValueContainsLiteralCharacters(false);
			cl.SSPatronal = mf.valueToString(Integer.toString(ss));
			if (cl.SSPatronal.trim().length() < 4) {
				cl.SSPatronal = "";
			}

			mf = new MaskFormatter("AAA AAA AAAA");
			mf.setValueContainsLiteralCharacters(false);
			cl.TelTrabajo = mf.valueToString(rs.getString("telefono_trabajo").trim());

			d1 = rs.getString("dir_p_patronal").trim();
			if (d1.length() == 0) {
				d1 = "";
			} else {
				d1 = d1 + " ";
			}

			p = rs.getString("pl_p_patronal").trim();
			if (p.length() == 0) {
				p = "";
			} else {
				p = p + " ";
			}

			z = rs.getString("zip_p_patronal").trim();
			if (z.length() == 1) {
				z = "";
			} else {
				z = z + " ";
			}

			cl.DirTrabajoP = d1 + p + z;

			d1 = rs.getString("dir_f_patronal").trim();
			if (d1.length() == 0) {
				d1 = "";
			} else {
				d1 = d1 + " ";
			}

			p = rs.getString("pl_f_patronal").trim();
			if (p.length() == 0) {
				p = "";
			} else {
				p = p + " ";
			}

			z = rs.getString("zip_f_patronal").trim();
			if (z.length() == 1) {
				z = "";
			} else {
				z = z + " ";
			}

			cl.DirTrabajoF = d1 + p + z;

			// Informacion de recursos

			cl.ValorRecurso = rs.getString("valor_recurso");
			cl.DescRecurso = rs.getString("descripcion_recurso");

			stmt.close();

			return cl;

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
			return null;

		}

	}

	public List<Otros> retirveDataOtros(SAIC_DMQ_ORA_Application app) throws Exception {
		try {

			// RallyDataManager dm = (RallyDataManager) app.getDataManager ( );
			// ArrayList<Object> condata = (ArrayList<Object>) dm.getSqlConnections();

			// Connection con = (Connection) condata.get(0);

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String conString = Configuration.getInstance().get("ConnectionString");
			ConnectionStringBuilder csb = new ConnectionStringBuilder();
			ConnectionStringClass csc = csb.ConvertString(conString);
			Connection con = DriverManager.getConnection(csc.DataBaseURL, csc.LOGIN, csc.PASSWORD);

			Statement stmt = con.createStatement();

			Double dbl = app.SS_CLIENTE_GBL;
			int ss = dbl.intValue();
			String sql = "SELECT \r\n" + "-- Column 1\r\n"
					+ "COALESCE(c.dsc_nombre,' ') AS nombre_ot, COALESCE(c.dsc_inicial,' ') AS inicial_ot, \r\n"
					+ "COALESCE(c.dsc_apellido_paterno,'  ') AS paterno_ot, COALESCE(c.dsc_apellido_materno,' ') AS materno_ot, \r\n"
					+ "-- Column 2\r\n" + "c.seguro_social_cliente AS seguro_social_otro,\r\n" + "-- Column 3\r\n"
					+ "COALESCE(c.fch_nacimiento,TO_TIMESTAMP('1/1/1979')) AS fecha_nacimiento,\r\n" + "-- Column 5\r\n"
					+ "COALESCE(c.cod_parentesco_fam,' ') AS pareantesco,\r\n" + "-- Column 6\r\n"
					+ "COALESCE(it.dsc_ingreso,' ') AS fuente_ingreso,\r\n" + "-- Column 7\r\n"
					+ "COALESCE(ic.vlr_cantidad_ingreso,0) AS cantidad\r\n" + "FROM clientes c\r\n"
					+ "LEFT JOIN ingresos_cliente ic ON ic.seguro_social_cliente = c.seguro_social_jefe_familia\r\n"
					+ "LEFT JOIN ingresos_tbl it ON it.cod_tipo_ingreso = ic.cod_tipo_ingreso\r\n" + "WHERE  \r\n"
					+ "(c.cod_parentesco_fam != 'HIJO' AND c.cod_parentesco_fam != 'HIJA' AND c.cod_parentesco_fam != 'JEFE') AND\r\n"
					+ "c.seguro_social_jefe_familia = " + Integer.toString(ss);

			ResultSet rs = stmt.executeQuery(sql);

			List<Otros> ots = new ArrayList<Otros>();

			while (rs.next()) {

				Otros ot = new Otros();

				String i = rs.getString("inicial_ot").trim();
				if (i.length() == 0) {
					i = " ";
				} else {
					i = " " + i + " ";
				}
				ot.Nombre = rs.getString("nombre_ot") + i + rs.getString("paterno_ot") + " "
						+ rs.getString("materno_ot");
				ot.Nombre = ot.Nombre.substring(0, 13);

				dbl = rs.getDouble("seguro_social_otro");
				ss = dbl.intValue();
				MaskFormatter mf = new MaskFormatter("AAA AA AAAA");
				mf.setValueContainsLiteralCharacters(false);
				ot.SegSoc = mf.valueToString(Integer.toString(ss));

				Date fn = rs.getDate("fecha_nacimiento");

				Calendar calendar = new GregorianCalendar();
				calendar.setTime(fn);
				int year = calendar.get(Calendar.YEAR);
				int month = calendar.get(Calendar.MONTH) + 1;
				int day = calendar.get(Calendar.DAY_OF_MONTH);

				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				Date date = formatter.parse("1979-1-1");
				String df = formatter.format(date);
				String fsf = formatter.format(fn);

				String FechaParse = "";

				if (fsf == df) {
					ot.FechaNacimiento = "";
				} else {
					ot.FechaNacimiento = Integer.toString(day) + "/" + Integer.toString(month) + "/"
							+ Integer.toString(year);
					FechaParse = Integer.toString(year) + "-" + Integer.toString(month) + "-" + Integer.toString(day);
				}

				if (ot.FechaNacimiento != "") {

					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					Calendar dob = Calendar.getInstance();
					dob.setTime(sdf.parse(FechaParse));
					Calendar today = Calendar.getInstance();

					int curYear = today.get(Calendar.YEAR);
					int dobYear = dob.get(Calendar.YEAR);

					int age = curYear - dobYear;

					ot.Edad = Integer.toString(age);

				} else {
					ot.Edad = "";
				}

				ot.Parentesco = rs.getString("pareantesco");
				ot.FuenteIngreso = rs.getString("fuente_ingreso");

				dbl = rs.getDouble("cantidad");
				int ct = dbl.intValue();
				ot.Cantidad = Integer.toString(ct);

				ots.add(ot);

				if (ots.size() == 4) {
					break;
				}

			}

			return ots;

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
			return null;

		}

	}

	public List<Hijos> retirveDataHijos(SAIC_DMQ_ORA_Application app) throws Exception {
		try {

			// RallyDataManager dm = (RallyDataManager) app.getDataManager ( );
			// ArrayList<Object> condata = (ArrayList<Object>) dm.getSqlConnections();

			// Connection con = (Connection) condata.get(0);

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String conString = Configuration.getInstance().get("ConnectionString");
			ConnectionStringBuilder csb = new ConnectionStringBuilder();
			ConnectionStringClass csc = csb.ConvertString(conString);
			Connection con = DriverManager.getConnection(csc.DataBaseURL, csc.LOGIN, csc.PASSWORD);

			Statement stmt = con.createStatement();

			Double dbl = app.SS_CLIENTE_GBL;
			int ss = dbl.intValue();
			String sql = "SELECT \r\n" + "\r\n" + "-- Column 1\r\n"
					+ "COALESCE(c.dsc_nombre,' ') AS nombre_hj, COALESCE(c.dsc_inicial,' ') AS inicial_hj, \r\n"
					+ "COALESCE(c.dsc_apellido_paterno,'  ') AS paterno_hj, COALESCE(c.dsc_apellido_materno,' ') AS materno_hj, \r\n"
					+ "\r\n" + "-- Column 2\r\n" + "c.seguro_social_cliente AS seguro_social_hijo,\r\n" + "\r\n"
					+ "-- Column 3\r\n" + "COALESCE(c.fch_nacimiento,TO_TIMESTAMP('1/1/1979')) AS fecha_nacimiento,\r\n"
					+ "\r\n" + "-- Column 5\r\n" + "COALESCE(c.asiste_regularidad,' ') AS asiste_regularidad,\r\n"
					+ "\r\n" + "-- Column 6\r\n"
					+ "CASE WHEN ic.cod_tipo_ingreso = 'PMEN' Then 'Si' ELSE ' ' END AS pension_alimenticia,\r\n"
					+ "\r\n" + "-- Column 7\r\n" + "COALESCE(ic.vlr_cantidad_ingreso,0) AS cantidad_pension,\r\n"
					+ "\r\n" + "-- Column 8\r\n" + "COALESCE(ic.flg_frecuencia,' ') AS frecuencia\r\n" + "\r\n"
					+ "FROM clientes c \r\n"
					+ "LEFT JOIN ingresos_cliente ic ON ic.seguro_social_cliente = c.seguro_social_cliente\r\n"
					+ "WHERE \r\n" + "(c.cod_parentesco_fam = 'HIJO' OR c.cod_parentesco_fam = 'HIJA') AND\r\n"
					+ "c.seguro_social_jefe_familia = " + Integer.toString(ss);

			ResultSet rs = stmt.executeQuery(sql);

			List<Hijos> lh = new ArrayList<Hijos>();

			while (rs.next()) {

				Hijos hj = new Hijos();

				String i = rs.getString("inicial_hj").trim();
				if (i.length() == 0) {
					i = " ";
				} else {
					i = " " + i + " ";
				}
				hj.Nombre = rs.getString("nombre_hj") + i + rs.getString("paterno_hj") + " "
						+ rs.getString("materno_hj");
				hj.Nombre = hj.Nombre.substring(0, 10);

				dbl = rs.getDouble("seguro_social_hijo");
				ss = dbl.intValue();
				MaskFormatter mf = new MaskFormatter("AAA AA AAAA");
				mf.setValueContainsLiteralCharacters(false);
				hj.SegSoc = mf.valueToString(Integer.toString(ss));

				Date fn = rs.getDate("fecha_nacimiento");

				Calendar calendar = new GregorianCalendar();
				calendar.setTime(fn);
				int year = calendar.get(Calendar.YEAR);
				int month = calendar.get(Calendar.MONTH) + 1;
				int day = calendar.get(Calendar.DAY_OF_MONTH);

				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				Date date = formatter.parse("1979-1-1");
				String df = formatter.format(date);
				String fsf = formatter.format(fn);

				String FechaParse = "";

				if (fsf == df) {
					hj.FechaNacimiento = "";
				} else {
					hj.FechaNacimiento = Integer.toString(day) + "/" + Integer.toString(month) + "/"
							+ Integer.toString(year);
					FechaParse = Integer.toString(year) + "-" + Integer.toString(month) + "-" + Integer.toString(day);
				}

				if (hj.FechaNacimiento != "") {

					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					Calendar dob = Calendar.getInstance();
					dob.setTime(sdf.parse(FechaParse));
					Calendar today = Calendar.getInstance();

					int curYear = today.get(Calendar.YEAR);
					int dobYear = dob.get(Calendar.YEAR);

					int age = curYear - dobYear;

					hj.Edad = Integer.toString(age);

				} else {
					hj.Edad = "";
				}

				hj.AsisteRegular = rs.getString("asiste_regularidad");
				if (hj.AsisteRegular == "S") {
					hj.AsisteRegular = "Si";
				}

				hj.PensionAlimenticia = rs.getString("pension_alimenticia");

				dbl = rs.getDouble("cantidad_pension");
				int cp = dbl.intValue();
				if (cp == 0) {
					hj.CantidadPension = "";
				} else {
					hj.CantidadPension = Integer.toString(cp);
				}

				if (hj.PensionAlimenticia == "Si") {
					switch (rs.getString("frecuencia")) {
					case "S":
						hj.Frecuencia = "Semanal";
						break;
					case "B":
						hj.Frecuencia = "Bisemanal";
						break;
					case "Q":
						hj.Frecuencia = "Quinsenal";
						break;
					case "M":
						hj.Frecuencia = "Mensual";
						break;
					default:
						hj.Frecuencia = "";
						break;
					}
				} else {
					hj.Frecuencia = "";
				}

				lh.add(hj);

				if (lh.size() == 7) {
					break;
				}

			}

			return lh;

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
			return null;

		}

	}

}
