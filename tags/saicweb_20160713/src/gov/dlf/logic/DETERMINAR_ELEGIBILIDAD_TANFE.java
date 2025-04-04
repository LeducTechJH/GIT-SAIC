package gov.dlf.logic;

import gov.dlf.external.*;
import gov.dlf.facade.*;
import gov.dlf.presentation.*;
import gov.dlf.webservice.client.sibif.prequalification.Income;

import java.util.*;

import net.maintrend.appmanager.*;
import net.maintrend.datamanager.*;
import net.maintrend.interfaces.*;
import net.maintrend.interlink.*;
import net.maintrend.mdi.*;
import net.maintrend.rallyengine.*;
import net.maintrend.util.*;
import net.maintrend.util.format.*;

public class DETERMINAR_ELEGIBILIDAD_TANFE extends ADL {

	public static boolean staticCall = false;
	public SAIC_DMQ_ORA_Application app;
	public RallyDataManager dm = null;
	public boolean _condition0 = false;
	public boolean _condition1 = false;
	public boolean _condition2 = false;
	public boolean _condition3 = false;
	public boolean _condition4 = true;
	public double OPEN_ID = 0;
	public double OPEN2_ID = 0;
	public double OPEN3_ID = 0;
	public double OPEN4_ID = 0;
	public double OPEN5_ID = 0;
	public double OPEN6_ID = 0;
	public double OPEN7_ID = 0;
	public double OPEN8_ID = 0;
	public double STATUS_CODE = 0;
	public double STATUS2_CODE = 0;
	public double STATUS3_CODE = 0;
	public double STATUS4_CODE = 0;
	public double STATUS5_CODE = 0;
	public double STATUS6_CODE = 0;
	public double INGRESOS_NUCLEO = 0;
	public double BENEINCA = 0.0;
	public double RECURSOS_ACUM = 0;
	public double RECURSOS_LIQUIDOS = 0;
	public double RECURSOS_TOTAL = 0;
	public double ANCIANO = 0;
	public double ANCIANO_COUNT = 0.0;
	public double MENOR_COUNT = 0.0;
	public double INCAPACITADO_COUNT = 0.0;
	public double INCA_FLG = 0;
	public double MENOR_FLG = 0.0;
	public double INGRESO_BRUTO = 0.0;
	public double EDAD_IND = 0;
	public double MENOR = 0;
	public double BENEFICIO = 0;
	public double CANTIDAD_AUTO = 0;
	public double SERVICIO_BENEFICIO = 0;
	public double LIHEAP_INCOME_MAX =0;
	public double MIEMBROS_FAMILIA=0;
	public String INELEGIBLE_REG = null;
	public String RAZON = null;
	public String SERVICIO_STATUS = " ";
	public Date FCH_CERRADO = null;
	public Date NULL_DATE = null;
	public DataStore NUCLEO_SERVICIO_DSD = null;
	public DataStore CLIENTES_READ_LOC_DSD = null;
	public DataStore RECURSOS_NUCLEO_DSD = null;
	public DataStore INGRESOS_NUCLEO_DSD = null;
	public DataStore LIHEAP_INCOME_DSD = null;
	public DataStore CLIENTE_AGENCIA_RO_DSD = null;
	public DataStore SERVICIOS_EMERGENCIA_DSD = null;
	public DataStore SERVICIOS2_DSD = null;
	public String exceptionTitle = "DETERM TANFS";
	public static void setOPEN_ID(RallyApplication __app, Parameter value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).OPEN_ID = value
				.getDouble();
	}

	public static void setOPEN2_ID(RallyApplication __app, Parameter value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).OPEN2_ID = value
				.getDouble();
	}

	public static void setSTATUS_CODE(RallyApplication __app, Parameter value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).STATUS_CODE = value
				.getDouble();
	}

	public static void setSTATUS2_CODE(RallyApplication __app, Parameter value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).STATUS2_CODE = value
				.getDouble();
	}

	public static double getOPEN_ID(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).OPEN_ID;
	}

	public static Double getOPEN_IDDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_TANFE) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).OPEN_ID);
	}

	public static void setOPEN_ID(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).OPEN_ID = value;
	}

	public static void setOPEN_ID(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).OPEN_ID = ((Double) value)
				.doubleValue();
	}

	public static double getOPEN2_ID(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).OPEN2_ID;
	}

	public static Double getOPEN2_IDDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_TANFE) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).OPEN2_ID);
	}

	public static void setOPEN2_ID(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).OPEN2_ID = value;
	}

	public static void setOPEN2_ID(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).OPEN2_ID = ((Double) value)
				.doubleValue();
	}

	public static double getSTATUS_CODE(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).STATUS_CODE;
	}

	public static Double getSTATUS_CODEDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_TANFE) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).STATUS_CODE);
	}

	public static void setSTATUS_CODE(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).STATUS_CODE = value;
	}

	public static void setSTATUS_CODE(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).STATUS_CODE = ((Double) value)
				.doubleValue();
	}

	public static double getSTATUS2_CODE(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).STATUS2_CODE;
	}

	public static Double getSTATUS2_CODEDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_TANFE) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).STATUS2_CODE);
	}

	public static void setSTATUS2_CODE(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).STATUS2_CODE = value;
	}

	public static void setSTATUS2_CODE(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).STATUS2_CODE = ((Double) value)
				.doubleValue();
	}

	public static double getSTATUS3_CODE(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).STATUS3_CODE;
	}

	public static Double getSTATUS3_CODEDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_TANFE) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).STATUS3_CODE);
	}

	public static void setSTATUS3_CODE(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).STATUS3_CODE = value;
	}

	public static void setSTATUS3_CODE(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).STATUS3_CODE = ((Double) value)
				.doubleValue();
	}

	public static double getSTATUS4_CODE(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).STATUS4_CODE;
	}

	public static Double getSTATUS4_CODEDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_TANFE) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).STATUS4_CODE);
	}

	public static void setSTATUS4_CODE(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).STATUS4_CODE = value;
	}

	public static void setSTATUS4_CODE(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).STATUS4_CODE = ((Double) value)
				.doubleValue();
	}

	public static double getSTATUS5_CODE(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).STATUS5_CODE;
	}

	public static Double getSTATUS5_CODEDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_TANFE) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).STATUS5_CODE);
	}

	public static void setSTATUS5_CODE(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).STATUS5_CODE = value;
	}

	public static void setSTATUS5_CODE(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).STATUS5_CODE = ((Double) value)
				.doubleValue();
	}

	public static double getSTATUS6_CODE(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).STATUS6_CODE;
	}

	public static Double getSTATUS6_CODEDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_TANFE) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).STATUS6_CODE);
	}

	public static void setSTATUS6_CODE(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).STATUS6_CODE = value;
	}

	public static void setSTATUS6_CODE(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).STATUS6_CODE = ((Double) value)
				.doubleValue();
	}
	/**  */
	public static double getINGRESOS_NUCLEO(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).INGRESOS_NUCLEO;
	}

	/**  */
	public static Double getINGRESOS_NUCLEODouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_TANFE) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).INGRESOS_NUCLEO);
	}

	/**  */
	public static void setINGRESOS_NUCLEO(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).INGRESOS_NUCLEO = value;
	}

	/**  */
	public static void setINGRESOS_NUCLEO(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).INGRESOS_NUCLEO = ((Double) value)
				.doubleValue();
	}

	public static double getBENEINCA(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).BENEINCA;
	}

	public static Double getBENEINCADouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_TANFE) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).BENEINCA);
	}

	public static void setBENEINCA(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).BENEINCA = value;
	}

	public static void setBENEINCA(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).BENEINCA = ((Double) value)
				.doubleValue();
	}

	public static void setRECURSOS_ACUM(RallyApplication __app, Parameter value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).RECURSOS_ACUM = value
				.getDouble();
	}

	public static double getRECURSOS_ACUM(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).RECURSOS_ACUM;
	}

	public static Double getRECURSOS_ACUMDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_TANFE) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).RECURSOS_ACUM);
	}

	public static void setRECURSOS_ACUM(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).RECURSOS_ACUM = value;
	}

	public static void setRECURSOS_ACUM(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).RECURSOS_ACUM = ((Double) value)
				.doubleValue();
	}

	public static double getRECURSOS_LIQUIDOS(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).RECURSOS_LIQUIDOS;
	}

	public static Double getRECURSOS_LIQUIDOSDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_TANFE) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).RECURSOS_LIQUIDOS);
	}

	public static void setRECURSOS_LIQUIDOS(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).RECURSOS_LIQUIDOS = value;
	}

	public static void setRECURSOS_LIQUIDOS(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).RECURSOS_LIQUIDOS = ((Double) value)
				.doubleValue();
	}

	public static void setRECURSOS_TOTAL(RallyApplication __app, Parameter value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).RECURSOS_TOTAL = value
				.getDouble();
	}

	public static double getRECURSOS_TOTAL(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).RECURSOS_TOTAL;
	}

	public static Double getRECURSOS_TOTALDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_TANFE) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).RECURSOS_TOTAL);
	}

	public static void setRECURSOS_TOTAL(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).RECURSOS_TOTAL = value;
	}

	public static void setRECURSOS_TOTAL(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).RECURSOS_TOTAL = ((Double) value)
				.doubleValue();
	}

	public static void setANCIANO(RallyApplication __app, Parameter value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).ANCIANO = value
				.getDouble();
	}

	public static double getANCIANO(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).ANCIANO;
	}

	public static Double getANCIANODouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_TANFE) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).ANCIANO);
	}

	public static void setANCIANO(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).ANCIANO = value;
	}

	public static void setANCIANO(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).ANCIANO = ((Double) value)
				.doubleValue();
	}

	public static void setANCIANO_COUNT(RallyApplication __app, Parameter value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).ANCIANO_COUNT = value
				.getDouble();
	}

	public static void setINCAPACITADO_COUNT(RallyApplication __app,
			Parameter value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).INCAPACITADO_COUNT = value
				.getDouble();
	}

	public static double getANCIANO_COUNT(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).ANCIANO_COUNT;
	}

	public static Double getANCIANO_COUNTDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_TANFE) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).ANCIANO_COUNT);
	}

	public static void setANCIANO_COUNT(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).ANCIANO_COUNT = value;
	}

	public static void setANCIANO_COUNT(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).ANCIANO_COUNT = ((Double) value)
				.doubleValue();
	}

	public static double getMENOR_COUNT(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).MENOR_COUNT;
	}

	public static Double getMENOR_COUNTDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_TANFE) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).MENOR_COUNT);
	}

	public static void setMENOR_COUNT(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).MENOR_COUNT = value;
	}

	public static void setMENOR_COUNT(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).MENOR_COUNT = ((Double) value)
				.doubleValue();
	}

	public static double getMIEMBROS_FAMILIA_COUNT(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).MIEMBROS_FAMILIA;
	}

	public static Double getMIEMBROS_FAMILIA_COUNTDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_TANFE) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).MIEMBROS_FAMILIA);
	}

	public static void setMIEMBROS_FAMILIA_COUNT(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).MIEMBROS_FAMILIA = value;
	}

	public static void setMIEMBROS_FAMILIA_COUNT(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).MIEMBROS_FAMILIA = ((Double) value)
				.doubleValue();
	}

	public static double getINCAPACITADO_COUNT(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).INCAPACITADO_COUNT;
	}

	public static Double getINCAPACITADO_COUNTDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_TANFE) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).INCAPACITADO_COUNT);
	}

	public static void setINCAPACITADO_COUNT(RallyApplication __app,
			double value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).INCAPACITADO_COUNT = value;
	}

	public static void setINCAPACITADO_COUNT  ( RallyApplication __app, Object value )
	{
		( ( DETERMINAR_ELEGIBILIDAD_TANFE ) __app.getADL ( DETERMINAR_ELEGIBILIDAD_TANFE.class ) ).INCAPACITADO_COUNT = ( ( Double ) value ).doubleValue ( );
	}
	public static DataStore getNUCLEO_SERVICIO_DSD(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).NUCLEO_SERVICIO_DSD;
	}

	public static void setNUCLEO_SERVICIO_DSD(RallyApplication __app,
			DataStore value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).NUCLEO_SERVICIO_DSD = value;
	}

	public static void setNUCLEO_SERVICIO_DSD(RallyApplication __app,
			Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).NUCLEO_SERVICIO_DSD = (DataStore) value;
	}

	public static DataStore getCLIENTES_READ_LOC_DSD(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).CLIENTES_READ_LOC_DSD;
	}

	public static void setCLIENTES_READ_LOC_DSD(RallyApplication __app,
			DataStore value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).CLIENTES_READ_LOC_DSD = value;
	}

	public static void setCLIENTES_READ_LOC_DSD(RallyApplication __app,
			Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).CLIENTES_READ_LOC_DSD = (DataStore) value;
	}

	public static DataStore getCLIENTE_AGENCIA_RO_DSD(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).CLIENTE_AGENCIA_RO_DSD;
	}

	public static void setCLIENTE_AGENCIA_RO_DSD(RallyApplication __app,
			DataStore value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).CLIENTE_AGENCIA_RO_DSD = value;
	}

	public static void setCLIENTE_AGENCIA_RO_DSD(RallyApplication __app,
			Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).CLIENTE_AGENCIA_RO_DSD = (DataStore) value;
	}
	public static DataStore getSERVICIOS_EMERGENCIA_DSD(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).SERVICIOS_EMERGENCIA_DSD;
	}

	public static void setSERVICIOS_EMERGENCIA_DSD(RallyApplication __app,
			DataStore value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).SERVICIOS_EMERGENCIA_DSD = value;
	}

	public static void setSERVICIOS_EMERGENCIA_DSD(RallyApplication __app,
			Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).SERVICIOS_EMERGENCIA_DSD = (DataStore) value;
	}

	public static DataStore getSERVICIOS2_DSD(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).SERVICIOS2_DSD;
	}

	public static void setSERVICIOS2_DSD(RallyApplication __app,
			DataStore value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).SERVICIOS2_DSD = value;
	}

	public static void setSERVICIOS2_DSD(RallyApplication __app,
			Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).SERVICIOS2_DSD = (DataStore) value;
	}
	public static DataStore getRECURSOS_NUCLEO_DSD(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).RECURSOS_NUCLEO_DSD;
	}

	public static void setRECURSOS_NUCLEO_DSD(RallyApplication __app,
			DataStore value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).RECURSOS_NUCLEO_DSD = value;
	}

	public static void setRECURSOS_NUCLEO_DSD(RallyApplication __app,
			Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).RECURSOS_NUCLEO_DSD = (DataStore) value;
	}

	public static DataStore getINGRESOS_NUCLEO_DSD(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).INGRESOS_NUCLEO_DSD;
	}

	public static void setINGRESOS_NUCLEO_DSD(RallyApplication __app,
			DataStore value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).INGRESOS_NUCLEO_DSD = value;
	}

	public static void setINGRESOS_NUCLEO_DSD(RallyApplication __app,
			Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).INGRESOS_NUCLEO_DSD = (DataStore) value;
	}

	public static String getSERVICIO_STATUS(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).SERVICIO_STATUS;
	}

	public static void setSERVICIO_STATUS(RallyApplication __app, String value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).SERVICIO_STATUS = value;
	}

	public static void setSERVICIO_STATUS(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).SERVICIO_STATUS = (String) value;
	}

	public static String getRAZON(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).RAZON;
	}

	public static void setRAZON(RallyApplication __app, String value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).RAZON = value;
	}

	public static void setRAZON(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).RAZON = (String) value;
	}

	public static Date getNULL_DATE(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).NULL_DATE;
	}

	public static void setNULL_DATE(RallyApplication __app, Date value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).NULL_DATE = value;
	}

	public static void setNULL_DATE(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).NULL_DATE = (Date) value;
	}

	public static Date getFCH_CERRADO(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).FCH_CERRADO;
	}

	public static void setFCH_CERRADO(RallyApplication __app, Date value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).FCH_CERRADO = value;
	}

	public static void setFCH_CERRADO(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).FCH_CERRADO = (Date) value;
	}

	public static double getSERVICIO_BENEFICIO(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).SERVICIO_BENEFICIO;
	}

	public static Double getSERVICIO_BENEFICIODouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_TANFE) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).SERVICIO_BENEFICIO);
	}

	public static void setSERVICIO_BENEFICIO(RallyApplication __app,
			double value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).SERVICIO_BENEFICIO = value;
	}

	public static void setSERVICIO_BENEFICIO(RallyApplication __app,
			Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).SERVICIO_BENEFICIO = ((Double) value)
				.doubleValue();
	}
	public static double getLIHEAP_INCOME_MAX(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).LIHEAP_INCOME_MAX;
	}

	public static Double getLIHEAP_INCOME_MAXDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_TANFE) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).LIHEAP_INCOME_MAX);
	}

	public static void setLIHEAP_INCOME_MAX(RallyApplication __app,
			double value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).LIHEAP_INCOME_MAX = value;
	}

	public static void setLIHEAP_INCOME_MAX(RallyApplication __app,
			Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).LIHEAP_INCOME_MAX = ((Double) value)
				.doubleValue();
	}

	public static double getEDAD_IND(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).EDAD_IND;
	}

	public static Double getEDAD_INDDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_TANFE) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).EDAD_IND);
	}

	public static void setEDAD_IND(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).EDAD_IND = value;
	}

	public static void setEDAD_IND(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).EDAD_IND = ((Double) value)
				.doubleValue();
	}

	public static Double getINCA_FLGDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_TANFE) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).INCA_FLG);
	}

	public static void setINCA_FLG(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).INCA_FLG = value;
	}

	public static void setINCA_FLG(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).INCA_FLG = ((Double) value)
				.doubleValue();
	}

	public static double getMENOR_FLG(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).MENOR_FLG;
	}

	public static Double getMENOR_FLGDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_TANFE) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).MENOR_FLG);
	}

	public static void setMENOR_FLG(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).MENOR_FLG = value;
	}

	public static void setMENOR_FLG(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).MENOR_FLG = ((Double) value)
				.doubleValue();
	}

	public static double getBENEFICIO(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).BENEFICIO;
	}

	public static Double getBENEFICIODouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_TANFE) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).BENEFICIO);
	}

	public static void setBENEFICIO(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).BENEFICIO = value;
	}

	public static void setBENEFICIO(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).BENEFICIO = ((Double) value)
				.doubleValue();
	}

	public static double getCANTIDAD_AUTO(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).CANTIDAD_AUTO;
	}

	public static Double getCANTIDAD_AUTODouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_TANFE) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).CANTIDAD_AUTO);
	}

	public static void setCANTIDAD_AUTO(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).CANTIDAD_AUTO = value;
	}

	public static void setCANTIDAD_AUTO(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).CANTIDAD_AUTO = ((Double) value)
				.doubleValue();
	}

	public static double getMENOR(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).MENOR;
	}

	public static Double getMENORDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_TANFE) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).MENOR);
	}

	public static void setMENOR(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).MENOR = value;
	}

	public static void setMENOR(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).MENOR = ((Double) value)
				.doubleValue();
	}

	public static DataStore getLIHEAP_INCOME_DSD(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).LIHEAP_INCOME_DSD;
	}

	public static void setLIHEAP_INCOME_DSD(RallyApplication __app,
			DataStore value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).LIHEAP_INCOME_DSD = value;
	}

	public static void setLIHEAP_INCOME_DSD(RallyApplication __app,
			Object value) {
		((DETERMINAR_ELEGIBILIDAD_TANFE) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_TANFE.class)).LIHEAP_INCOME_DSD = (DataStore) value;
	}
	/**
	 * 
	 * @param __app
	 * @return
	 */
	public static DETERMINAR_ELEGIBILIDAD_TANFE get(RallyApplication __app) 
	{
		DETERMINAR_ELEGIBILIDAD_TANFE adl = new DETERMINAR_ELEGIBILIDAD_TANFE();
		__app.register(adl, "DETERMINAR_ELEGIBILIDAD_TANFE");
		__app.setADL(DETERMINAR_ELEGIBILIDAD_TANFE.class, adl);
		adl.setApplication(__app);
		return adl;
	}
	/**
	 * 
	 * @param __app
	 * @param ps
	 * 
	 * @return
	 */
	public static void exec(RallyApplication __app, ParameterSet ps) 
	{
		DETERMINAR_ELEGIBILIDAD_TANFE.get(__app).process(ps);
	}
	/**
	 * 
	 * @param __app
	 * 
	 * @return
	 */
	public static void exec(RallyApplication __app) 
	{
		ParameterSet ps = null;
		DETERMINAR_ELEGIBILIDAD_TANFE.exec(__app, ps);
	}
	/**
	 * Overrides the ancestor's method
	 * 
	 * @param __app
	 */
	public void setApplication(RallyApplication __app) 
	{
		this.app = (SAIC_DMQ_ORA_Application) __app;
		if (this.app != null) 
		{
			this.dm = (RallyDataManager) this.app.getDataManager();
		}
	}
	/**
	 * Overrides the ancestor's method
	 * 
	 * @param parms
	 */
	public void execute(ParameterSet parms) 
	{
		this.process(parms);
	}

	protected void doReturn() 
	{
		this.unregister();
	}

	public void unregister() 
	{
		this.app.unregister(this);
		IRegisteredObject rObj = this.app.get("DETERMINAR_ELEGIBILIDAD_TANFE");
		if (rObj != null && rObj instanceof DETERMINAR_ELEGIBILIDAD_TANFE) 
		{
			this.app.setADL(DETERMINAR_ELEGIBILIDAD_TANFE.class,(DETERMINAR_ELEGIBILIDAD_TANFE) rObj);
		}
	}

	/**
	 * Overrides the ancestor's method
	 * 
	 * @param ps
	 */
	protected void process(ParameterSet ps) 
	{
		Debug.println(Debug.TRACE, "DETERMINAR_ELEGIBILIDAD_TANFE Step "+ this.currentStep);
		super.process(ps);
		switch (this.currentStep) 
		{
		case 0: {this.currentStep++;this.step0(this.keyParms);break;}
		case 1: {this.currentStep++;this.step1(this.keyParms);break;}
		case 2: {this.currentStep++;this.step2(this.keyParms);break;}
		case 3: {this.currentStep++;this.step3(this.keyParms);break;}
		default: 
		{
			this.currentStep = 0;
			Debug.println(Debug.TRACE, "DETERMINAR_ELEGIBILIDAD_TANFE ended");
			this.unregister();
			break;
		}
		}
		if (this.currentStep > 0)
			this.app.goOn();
	}

	protected void step0(ParameterSet ps) 
	{
		NUCLEO_SERVICIO_DSD = this.dm.create("NUCLEO_SERVICIO_DSD");
		OPEN_ID = NUCLEO_SERVICIO_DSD.getId();
		STATUS_CODE = RallyDataStoreException.getDefault();
		CLIENTES_READ_LOC_DSD = this.dm.create("CLIENTES_READ_LOC_DSD");
		OPEN2_ID = CLIENTES_READ_LOC_DSD.getId();
		STATUS_CODE = RallyDataStoreException.getDefault();
		RECURSOS_NUCLEO_DSD = this.dm.create("RECURSOS_NUCLEO_DSD");
		OPEN3_ID = RECURSOS_NUCLEO_DSD.getId();
		STATUS_CODE = RallyDataStoreException.getDefault();
		INGRESOS_NUCLEO_DSD = this.dm.create("INGRESOS_NUCLEO_DSD");
		OPEN4_ID = INGRESOS_NUCLEO_DSD.getId();
		STATUS_CODE = RallyDataStoreException.getDefault();
		SERVICIOS2_DSD = this.dm.create("SERVICIOS2_DSD");
		OPEN8_ID = SERVICIOS2_DSD.getId();
		STATUS2_CODE = RallyDataStoreException.getDefault();
		CHECK_ID_AUTORIZA_ADL.exec(this.app);
		return;
	}

	protected void step1(ParameterSet ps) 
	{
		STATUS2_CODE  = this.dm.reset ( OPEN8_ID );

		this.dm.setField ( this.dm.get ( "SERVICIOS2_DSD" ), "SEGURO_SOCIAL_JEFE_SERV", this.app.SS_SERV_GBL );
		this.dm.setField ( this.dm.get ( "SERVICIOS2_DSD" ), "COD_SERVICIO", "AE-C" );

		STATUS2_CODE  = this.dm.limitQueryFromBuffer ( OPEN8_ID );
		STATUS2_CODE  = this.dm.retrieve ( OPEN8_ID );

		STATUS2_CODE  = this.dm.firstRow ( OPEN8_ID );
		if ( Compare.equals ( STATUS2_CODE, 0 )  )
		{
			INGRESOS_NUCLEO = 0;
			BENEINCA = 0;
			STATUS_CODE = this.dm.reset(OPEN4_ID);
			this.dm.setField(this.dm.get("INGRESOS_NUCLEO_DSD"),"SEGURO_SOCIAL_JEFE_FAM", this.app.SS_JEFE_GBL);
			this.dm.setField(this.dm.get("INGRESOS_NUCLEO_DSD"),"SEGURO_SOCIAL_JEFE_SERV", this.app.SS_SERV_GBL);
			this.dm.setField(this.dm.get("INGRESOS_NUCLEO_DSD"), "COD_SERVICIO",this.app.COD_SERV_GBL);
			this.dm.setField(this.dm.get("INGRESOS_NUCLEO_DSD"), "RMO_OFICINA",this.app.RMO_GBL);
			STATUS_CODE = this.dm.limitQueryFromBuffer(OPEN4_ID);
			STATUS_CODE = this.dm.retrieve(OPEN4_ID);
			STATUS_CODE = this.dm.firstRow(OPEN4_ID);

			while (Compare.equals(STATUS_CODE, 0)) 
			{
				if (Compare.equals(this.dm.getFieldString(this.dm.get("INGRESOS_NUCLEO_DSD"), "FLG_FRECUENCIA"),"S")) 
				{
					INGRESOS_NUCLEO = MathService.plus(INGRESOS_NUCLEO,this.dm.getFieldDouble(this.dm.get("INGRESOS_NUCLEO_DSD"),"VLR_CANTIDAD_INGRESO") * 4.3);
				} 
				else if (Compare.equals(this.dm.getFieldString(this.dm.get("INGRESOS_NUCLEO_DSD"), "FLG_FRECUENCIA"),"B")) 
				{
					INGRESOS_NUCLEO = MathService.plus(INGRESOS_NUCLEO,TruncService.trunc(this.dm.getFieldDouble(this.dm.get("INGRESOS_NUCLEO_DSD"),"VLR_CANTIDAD_INGRESO")) * 2.15);
				} 
				else if (Compare.equals(this.dm.getFieldString(this.dm.get("INGRESOS_NUCLEO_DSD"), "FLG_FRECUENCIA"),"Q")) 
				{
					INGRESOS_NUCLEO = MathService.plus(INGRESOS_NUCLEO,TruncService.trunc(this.dm.getFieldDouble(this.dm.get("INGRESOS_NUCLEO_DSD"),"VLR_CANTIDAD_INGRESO")) * 2.0);
				} 
				else 
				{
					INGRESOS_NUCLEO = MathService.plus(INGRESOS_NUCLEO,TruncService.trunc(this.dm.getFieldDouble(this.dm.get("INGRESOS_NUCLEO_DSD"),"VLR_CANTIDAD_INGRESO")) * 1.0);
				}

				STATUS_CODE = this.dm.nextRow(OPEN4_ID);
			}
			RECURSOS_ACUM = 0;
			RECURSOS_LIQUIDOS = 0;
			STATUS_CODE = this.dm.reset(OPEN3_ID);

			if (!Compare.equals(STATUS_CODE, 0)) 
			{
				this.app.setError(1, STATUS_CODE);
				this.doReturn();
				return;
			}
			this.dm.setField(this.dm.get("RECURSOS_NUCLEO_DSD"),"SEGURO_SOCIAL_JEFE_FAM", this.app.SS_JEFE_GBL);
			this.dm.setField(this.dm.get("RECURSOS_NUCLEO_DSD"),"SEGURO_SOCIAL_JEFE_SERV", this.app.SS_SERV_GBL);
			this.dm.setField(this.dm.get("RECURSOS_NUCLEO_DSD"), "COD_SERVICIO",this.app.COD_SERV_GBL);
			this.dm.setField(this.dm.get("RECURSOS_NUCLEO_DSD"), "RMO_OFICINA",this.app.RMO_GBL);
			STATUS_CODE = this.dm.limitQueryFromBuffer(OPEN3_ID);
			STATUS_CODE = this.dm.retrieve(OPEN3_ID);

			if (!Compare.equals(STATUS_CODE, 0)) 
			{
				this.app.setError(2, STATUS_CODE);
				this.doReturn();
				return;
			}

			STATUS_CODE = this.dm.firstRow(OPEN3_ID);

			while (Compare.equals(STATUS_CODE, 0)) 
			{
				BENEINCA = 0;
				this.app.SS_IND_GBL = this.dm.getFieldDouble(this.dm.get("RECURSOS_NUCLEO_DSD"),"SEGURO_SOCIAL_BENEFICIARIO");
				STATUS_CODE = this.dm.reset(OPEN2_ID);
				this.dm.setField(this.dm.get("CLIENTES_READ_LOC_DSD"),"SEGURO_SOCIAL_CLIENTE", this.app.SS_IND_GBL);
				STATUS_CODE = this.dm.limitQueryFromBuffer(OPEN2_ID);
				STATUS_CODE = this.dm.retrieve(OPEN2_ID);
				STATUS_CODE = this.dm.firstRow(OPEN2_ID);



				if ((!Compare.equals(this.dm.getFieldString(this.dm.get("RECURSOS_NUCLEO_DSD"),"COD_PARENTESCO_RELACION_SERV"), "RNBE"))
						&& (!Compare.equals(this.dm.getFieldString(this.dm.get("RECURSOS_NUCLEO_DSD"),"COD_PARENTESCO_RELACION_SERV"), "ACNE"))
						&& (!Compare.equals(this.dm.getFieldString(this.dm.get("RECURSOS_NUCLEO_DSD"),"COD_PARENTESCO_RELACION_SERV"), "****"))
						) 
				{
					if ((!Compare.equals(this.dm.getFieldString(this.dm.get("RECURSOS_NUCLEO_DSD"),"COD_TIPO_RECURSO"), "EDIF"))
							&& (!Compare.equals(this.dm.getFieldString(this.dm.get("RECURSOS_NUCLEO_DSD"),"COD_TIPO_RECURSO"), "TECA"))
							&& (!Compare.equals(this.dm.getFieldString(this.dm.get("RECURSOS_NUCLEO_DSD"),"COD_TIPO_RECURSO"), "PERS"))
							&& (!Compare.equals(this.dm.getFieldString(this.dm.get("RECURSOS_NUCLEO_DSD"),"COD_TIPO_RECURSO"), "VEH2"))) 
					{
						RECURSOS_LIQUIDOS = MathService.plus(RECURSOS_LIQUIDOS,this.dm.getFieldDouble(this.dm.get("RECURSOS_NUCLEO_DSD"),"VLR_CANTIDAD_RECURSO"));
					} 
					else 
					{
						RECURSOS_ACUM = MathService.plus(RECURSOS_ACUM,this.dm.getFieldDouble(this.dm.get("RECURSOS_NUCLEO_DSD"),"VLR_CANTIDAD_RECURSO"));

					}
				}

				STATUS_CODE = this.dm.nextRow(OPEN3_ID);
			}
			ANCIANO = 0;
			INCA_FLG = 0;
			MENOR_FLG = 0;
			INGRESO_BRUTO = 0;
			INELEGIBLE_REG = "";
			RAZON = "";
			NULL_DATE = TruncService.setNull(NULL_DATE);
			STATUS_CODE = this.dm.reset(OPEN_ID);
			this.dm.setField(this.dm.get("NUCLEO_SERVICIO_DSD"),"SEGURO_SOCIAL_JEFE_FAM", this.app.SS_JEFE_GBL);
			this.dm.setField(this.dm.get("NUCLEO_SERVICIO_DSD"),"SEGURO_SOCIAL_JEFE_SERV", this.app.SS_SERV_GBL);
			this.dm.setField(this.dm.get("NUCLEO_SERVICIO_DSD"), "COD_SERVICIO",this.app.COD_SERV_GBL);
			this.dm.setField(this.dm.get("NUCLEO_SERVICIO_DSD"), "RMO_OFICINA",this.app.RMO_GBL);
			STATUS_CODE = this.dm.limitQueryFromBuffer(OPEN_ID);
			STATUS_CODE = this.dm.retrieve(OPEN_ID);
			STATUS_CODE = this.dm.firstRow(OPEN_ID);

			while (Compare.equals(STATUS_CODE, 0)) 
			{
				this.app.SS_IND_GBL = this.dm.getFieldDouble(this.dm.get("NUCLEO_SERVICIO_DSD"),"SEGURO_SOCIAL_BENEFICIARIO");
				STATUS_CODE = this.dm.reset(OPEN2_ID);
				this.dm.setField(this.dm.get("CLIENTES_READ_LOC_DSD"),"SEGURO_SOCIAL_CLIENTE", this.app.SS_IND_GBL);
				this.dm.setField(this.dm.get("CLIENTES_READ_LOC_DSD"),"RMO_OFICINA", this.app.RMO_GBL);

				STATUS_CODE = this.dm.limitQueryFromBuffer(OPEN2_ID);
				STATUS_CODE = this.dm.retrieve(OPEN2_ID);
				STATUS_CODE = this.dm.firstRow(OPEN2_ID);

				if (!Compare.equals(STATUS_CODE, 0)) 
				{
					this.app.setError(3, STATUS_CODE);
					STATUS_CODE = this.dm.rollBack();
					this.doReturn();
					return;
				}
				if (Compare.equals(this.dm.getFieldDate(this.dm.get("CLIENTES_READ_LOC_DSD"), "FCH_NACIMIENTO"),NULL_DATE)) 
				{
					EDAD_IND = 0;
				} 
				else
				{
					EDAD_IND = DateUtil.monthsBetween(TruncService.lastDay(this.app.SYSTEM_DATE), this.dm.getFieldDate(this.dm.get("CLIENTES_READ_LOC_DSD"),"FCH_NACIMIENTO")) / 12;
				}
				
				if ((Compare.ge(EDAD_IND, 60))
						&& (!Compare.equals(this.dm.getFieldString(this.dm.get("NUCLEO_SERVICIO_DSD"),"COD_PARENTESCO_RELACION_SERV"), "NCAL"))) 
				{
					ANCIANO = 1;
				}

				if ((Compare.lt(EDAD_IND, 18))
						&& (!Compare.equals(this.dm.getFieldString(this.dm.get("NUCLEO_SERVICIO_DSD"),"COD_PARENTESCO_RELACION_SERV"), "NCAL"))) 
				{
					MENOR_FLG = 1.0;
				}

				if (Compare.lt(EDAD_IND, 14))
				{
					MENOR = 1;
				}
				if ((Compare.equals(this.dm.getFieldString(this.dm.get("CLIENTES_READ_LOC_DSD"),"FLG_INCAPACIDAD_VERIFICADA"), "S"))
						&& (!Compare.equals(this.dm.getFieldString(this.dm.get("NUCLEO_SERVICIO_DSD"),"COD_PARENTESCO_RELACION_SERV"), "NCAL"))) 
				{
					INCA_FLG = 1;
				}
				if ( (  Compare.equals ( this.dm.getFieldString ( this.dm.get ( "NUCLEO_SERVICIO_DSD" ), "COD_PARENTESCO_RELACION_SERV" ), "BNPR" ) ) 
						|| (  Compare.equals ( this.dm.getFieldString ( this.dm.get ( "NUCLEO_SERVICIO_DSD" ), "COD_PARENTESCO_RELACION_SERV" ), "BNSC" ) )  )
				{
					MIEMBROS_FAMILIA = MathService.plus ( MIEMBROS_FAMILIA, 1  );
				}

				if ((Compare.ge(EDAD_IND, 18))  &&  ((!Compare.equals(this.dm.getFieldString(this.dm.get("CLIENTES_READ_LOC_DSD"),"FLG_INCAPACIDAD_VERIFICADA"), "S"))))
				{
					if (!Compare.equals(this.dm.getFieldString ( this.dm.get ( "NUCLEO_SERVICIO_DSD" ),"SEGURO_SOCIAL_JEFE_SERV"),this.dm.getFieldDouble(this.dm.get("NUCLEO_SERVICIO_DSD"),"SEGURO_SOCIAL_BENEFICIARIO")))
					{
						this.app.setError("0","El encargado de servicio debe ser participante referido a manejo de casos.");
						this.doReturn ( );
						this.app.callCommand("FINISH ACTION");
						return;
					}
				}
				
				

				
				STATUS_CODE = this.dm.nextRow(OPEN_ID);

			}		
			if ((Compare.equals(ANCIANO, 1)) || (Compare.equals(INCA_FLG, 1))) 
			{
				this._condition0 = true;
			} 
			else 
			{
				this._condition0 = false;
			}
			RECURSOS_TOTAL =  MathService.plus ( RECURSOS_LIQUIDOS,RECURSOS_ACUM);
			if (this._condition0) 
			{
				if (Compare.gt(RECURSOS_TOTAL, 2000)) 
				{
					this._condition1 = true;
				} 
				else 
				{
					this._condition1 = false;
				}
			}
			else
			{
				if (Compare.gt(RECURSOS_TOTAL, 1000)) 
				{
					this._condition2 = true;
				} 
				else 
				{
					this._condition2 = false;
				}

			}
			SERVICIO_STATUS = "PENDELEG";

			if (Compare.equals(this.app.AUTORIZADA_GBL, "S")) 
			{
				SERVICIO_STATUS = "PENDREVI";
			} 
			else 
			{
				SERVICIO_STATUS = "PENDCERT";
			}
			return;
		}
		else
		{
			this.app.setError("0","Participante debe tener un servicio AE-C creado.");
			this.doReturn ( );
			this.app.callCommand("FINISH ACTION");
			return;
		}
	}

	protected void step2 ( ParameterSet ps )
	{
		TANFE_PKT.exec(this.app);
		return;
	}
	
	protected void step3 ( ParameterSet ps )
	{
		DETERMINACION_FINAL_MENU.exec ( this.app );
		return;
	}
}
