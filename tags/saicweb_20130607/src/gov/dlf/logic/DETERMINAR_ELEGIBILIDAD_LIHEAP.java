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

public class DETERMINAR_ELEGIBILIDAD_LIHEAP extends ADL {

	public static boolean staticCall = false;
	public SAIC_DMQ_ORA_Application app;
	public RallyDataManager dm = null;
	public boolean _condition0 = false;
	public boolean _condition1 = false;
	public boolean _condition2 = false;
	public boolean _condition3 = false;
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
	public double SERVICIO_BENEFICIO = 0;
	public double LIHEAP_INCOME_MAX =0;
	public double MIEMBROS_FAMILIA=0;
	public String INELEGIBLE_REG = null;
	public String RAZON = null;
	public String SERVICIO_STATUS = null;
	public Date NULL_DATE = null;
	public DataStore NUCLEO_SERVICIO_DSD = null;
	public DataStore CLIENTES_READ_LOC_DSD = null;
	public DataStore RECURSOS_NUCLEO_DSD = null;
	public DataStore INGRESOS_NUCLEO_DSD = null;
	public DataStore LIHEAP_INCOME_DSD = null;
	public DataStore CLIENTE_AGENCIA_RO_DSD = null;
	public static void setOPEN_ID(RallyApplication __app, Parameter value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).OPEN_ID = value
				.getDouble();
	}

	public static void setOPEN2_ID(RallyApplication __app, Parameter value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).OPEN2_ID = value
				.getDouble();
	}

	public static void setSTATUS_CODE(RallyApplication __app, Parameter value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).STATUS_CODE = value
				.getDouble();
	}

	public static void setSTATUS2_CODE(RallyApplication __app, Parameter value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).STATUS2_CODE = value
				.getDouble();
	}

	public static double getOPEN_ID(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).OPEN_ID;
	}

	public static Double getOPEN_IDDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).OPEN_ID);
	}

	public static void setOPEN_ID(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).OPEN_ID = value;
	}

	public static void setOPEN_ID(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).OPEN_ID = ((Double) value)
				.doubleValue();
	}

	public static double getOPEN2_ID(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).OPEN2_ID;
	}

	public static Double getOPEN2_IDDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).OPEN2_ID);
	}

	public static void setOPEN2_ID(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).OPEN2_ID = value;
	}

	public static void setOPEN2_ID(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).OPEN2_ID = ((Double) value)
				.doubleValue();
	}

	public static double getSTATUS_CODE(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).STATUS_CODE;
	}

	public static Double getSTATUS_CODEDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).STATUS_CODE);
	}

	public static void setSTATUS_CODE(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).STATUS_CODE = value;
	}

	public static void setSTATUS_CODE(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).STATUS_CODE = ((Double) value)
				.doubleValue();
	}

	public static double getSTATUS2_CODE(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).STATUS2_CODE;
	}

	public static Double getSTATUS2_CODEDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).STATUS2_CODE);
	}

	public static void setSTATUS2_CODE(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).STATUS2_CODE = value;
	}

	public static void setSTATUS2_CODE(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).STATUS2_CODE = ((Double) value)
				.doubleValue();
	}

	public static double getSTATUS3_CODE(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).STATUS3_CODE;
	}

	public static Double getSTATUS3_CODEDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).STATUS3_CODE);
	}

	public static void setSTATUS3_CODE(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).STATUS3_CODE = value;
	}

	public static void setSTATUS3_CODE(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).STATUS3_CODE = ((Double) value)
				.doubleValue();
	}

	public static double getSTATUS4_CODE(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).STATUS4_CODE;
	}

	public static Double getSTATUS4_CODEDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).STATUS4_CODE);
	}

	public static void setSTATUS4_CODE(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).STATUS4_CODE = value;
	}

	public static void setSTATUS4_CODE(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).STATUS4_CODE = ((Double) value)
				.doubleValue();
	}

	public static double getSTATUS5_CODE(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).STATUS5_CODE;
	}

	public static Double getSTATUS5_CODEDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).STATUS5_CODE);
	}

	public static void setSTATUS5_CODE(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).STATUS5_CODE = value;
	}

	public static void setSTATUS5_CODE(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).STATUS5_CODE = ((Double) value)
				.doubleValue();
	}

	public static double getSTATUS6_CODE(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).STATUS6_CODE;
	}

	public static Double getSTATUS6_CODEDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).STATUS6_CODE);
	}

	public static void setSTATUS6_CODE(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).STATUS6_CODE = value;
	}

	public static void setSTATUS6_CODE(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).STATUS6_CODE = ((Double) value)
				.doubleValue();
	}
	/**  */
	public static double getINGRESOS_NUCLEO(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).INGRESOS_NUCLEO;
	}

	/**  */
	public static Double getINGRESOS_NUCLEODouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).INGRESOS_NUCLEO);
	}

	/**  */
	public static void setINGRESOS_NUCLEO(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).INGRESOS_NUCLEO = value;
	}

	/**  */
	public static void setINGRESOS_NUCLEO(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).INGRESOS_NUCLEO = ((Double) value)
				.doubleValue();
	}

	public static double getBENEINCA(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).BENEINCA;
	}

	public static Double getBENEINCADouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).BENEINCA);
	}

	public static void setBENEINCA(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).BENEINCA = value;
	}

	public static void setBENEINCA(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).BENEINCA = ((Double) value)
				.doubleValue();
	}

	public static void setRECURSOS_ACUM(RallyApplication __app, Parameter value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).RECURSOS_ACUM = value
				.getDouble();
	}

	public static double getRECURSOS_ACUM(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).RECURSOS_ACUM;
	}

	public static Double getRECURSOS_ACUMDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).RECURSOS_ACUM);
	}

	public static void setRECURSOS_ACUM(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).RECURSOS_ACUM = value;
	}

	public static void setRECURSOS_ACUM(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).RECURSOS_ACUM = ((Double) value)
				.doubleValue();
	}

	public static double getRECURSOS_LIQUIDOS(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).RECURSOS_LIQUIDOS;
	}

	public static Double getRECURSOS_LIQUIDOSDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).RECURSOS_LIQUIDOS);
	}

	public static void setRECURSOS_LIQUIDOS(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).RECURSOS_LIQUIDOS = value;
	}

	public static void setRECURSOS_LIQUIDOS(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).RECURSOS_LIQUIDOS = ((Double) value)
				.doubleValue();
	}

	public static void setANCIANO(RallyApplication __app, Parameter value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).ANCIANO = value
				.getDouble();
	}

	public static double getANCIANO(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).ANCIANO;
	}

	public static Double getANCIANODouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).ANCIANO);
	}

	public static void setANCIANO(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).ANCIANO = value;
	}

	public static void setANCIANO(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).ANCIANO = ((Double) value)
				.doubleValue();
	}

	public static void setANCIANO_COUNT(RallyApplication __app, Parameter value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).ANCIANO_COUNT = value
				.getDouble();
	}

	public static void setINCAPACITADO_COUNT(RallyApplication __app,
			Parameter value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).INCAPACITADO_COUNT = value
				.getDouble();
	}

	public static double getANCIANO_COUNT(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).ANCIANO_COUNT;
	}

	public static Double getANCIANO_COUNTDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).ANCIANO_COUNT);
	}

	public static void setANCIANO_COUNT(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).ANCIANO_COUNT = value;
	}

	public static void setANCIANO_COUNT(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).ANCIANO_COUNT = ((Double) value)
				.doubleValue();
	}

	public static double getMENOR_COUNT(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).MENOR_COUNT;
	}

	public static Double getMENOR_COUNTDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).MENOR_COUNT);
	}

	public static void setMENOR_COUNT(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).MENOR_COUNT = value;
	}

	public static void setMENOR_COUNT(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).MENOR_COUNT = ((Double) value)
				.doubleValue();
	}

	public static double getMIEMBROS_FAMILIA_COUNT(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).MIEMBROS_FAMILIA;
	}

	public static Double getMIEMBROS_FAMILIA_COUNTDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).MIEMBROS_FAMILIA);
	}

	public static void setMIEMBROS_FAMILIA_COUNT(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).MIEMBROS_FAMILIA = value;
	}

	public static void setMIEMBROS_FAMILIA_COUNT(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).MIEMBROS_FAMILIA = ((Double) value)
				.doubleValue();
	}

	public static double getINCAPACITADO_COUNT(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).INCAPACITADO_COUNT;
	}

	public static Double getINCAPACITADO_COUNTDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).INCAPACITADO_COUNT);
	}

	public static void setINCAPACITADO_COUNT(RallyApplication __app,
			double value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).INCAPACITADO_COUNT = value;
	}

	  public static void setINCAPACITADO_COUNT  ( RallyApplication __app, Object value )
	  {
	    ( ( DETERMINAR_ELEGIBILIDAD_LIHEAP ) __app.getADL ( DETERMINAR_ELEGIBILIDAD_LIHEAP.class ) ).INCAPACITADO_COUNT = ( ( Double ) value ).doubleValue ( );
	  }
	public static DataStore getNUCLEO_SERVICIO_DSD(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).NUCLEO_SERVICIO_DSD;
	}

	public static void setNUCLEO_SERVICIO_DSD(RallyApplication __app,
			DataStore value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).NUCLEO_SERVICIO_DSD = value;
	}

	public static void setNUCLEO_SERVICIO_DSD(RallyApplication __app,
			Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).NUCLEO_SERVICIO_DSD = (DataStore) value;
	}

	public static DataStore getCLIENTES_READ_LOC_DSD(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).CLIENTES_READ_LOC_DSD;
	}

	public static void setCLIENTES_READ_LOC_DSD(RallyApplication __app,
			DataStore value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).CLIENTES_READ_LOC_DSD = value;
	}

	public static void setCLIENTES_READ_LOC_DSD(RallyApplication __app,
			Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).CLIENTES_READ_LOC_DSD = (DataStore) value;
	}

	public static DataStore getCLIENTE_AGENCIA_RO_DSD(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).CLIENTE_AGENCIA_RO_DSD;
	}

	public static void setCLIENTE_AGENCIA_RO_DSD(RallyApplication __app,
			DataStore value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).CLIENTE_AGENCIA_RO_DSD = value;
	}

	public static void setCLIENTE_AGENCIA_RO_DSD(RallyApplication __app,
			Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).CLIENTE_AGENCIA_RO_DSD = (DataStore) value;
	}
	
	public static DataStore getRECURSOS_NUCLEO_DSD(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).RECURSOS_NUCLEO_DSD;
	}

	public static void setRECURSOS_NUCLEO_DSD(RallyApplication __app,
			DataStore value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).RECURSOS_NUCLEO_DSD = value;
	}

	public static void setRECURSOS_NUCLEO_DSD(RallyApplication __app,
			Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).RECURSOS_NUCLEO_DSD = (DataStore) value;
	}

	public static DataStore getINGRESOS_NUCLEO_DSD(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).INGRESOS_NUCLEO_DSD;
	}

	public static void setINGRESOS_NUCLEO_DSD(RallyApplication __app,
			DataStore value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).INGRESOS_NUCLEO_DSD = value;
	}

	public static void setINGRESOS_NUCLEO_DSD(RallyApplication __app,
			Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).INGRESOS_NUCLEO_DSD = (DataStore) value;
	}

	public static String getSERVICIO_STATUS(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).SERVICIO_STATUS;
	}

	public static void setSERVICIO_STATUS(RallyApplication __app, String value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).SERVICIO_STATUS = value;
	}

	public static void setSERVICIO_STATUS(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).SERVICIO_STATUS = (String) value;
	}

	public static String getRAZON(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).RAZON;
	}

	public static void setRAZON(RallyApplication __app, String value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).RAZON = value;
	}

	public static void setRAZON(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).RAZON = (String) value;
	}

	public static Date getNULL_DATE(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).NULL_DATE;
	}

	public static void setNULL_DATE(RallyApplication __app, Date value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).NULL_DATE = value;
	}

	public static void setNULL_DATE(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).NULL_DATE = (Date) value;
	}

	public static double getSERVICIO_BENEFICIO(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).SERVICIO_BENEFICIO;
	}

	public static Double getSERVICIO_BENEFICIODouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).SERVICIO_BENEFICIO);
	}

	public static void setSERVICIO_BENEFICIO(RallyApplication __app,
			double value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).SERVICIO_BENEFICIO = value;
	}

	public static void setSERVICIO_BENEFICIO(RallyApplication __app,
			Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).SERVICIO_BENEFICIO = ((Double) value)
				.doubleValue();
	}
	public static double getLIHEAP_INCOME_MAX(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).LIHEAP_INCOME_MAX;
	}

	public static Double getLIHEAP_INCOME_MAXDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).LIHEAP_INCOME_MAX);
	}

	public static void setLIHEAP_INCOME_MAX(RallyApplication __app,
			double value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).LIHEAP_INCOME_MAX = value;
	}

	public static void setLIHEAP_INCOME_MAX(RallyApplication __app,
			Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).LIHEAP_INCOME_MAX = ((Double) value)
				.doubleValue();
	}
	
	public static double getEDAD_IND(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).EDAD_IND;
	}

	public static Double getEDAD_INDDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).EDAD_IND);
	}

	public static void setEDAD_IND(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).EDAD_IND = value;
	}

	public static void setEDAD_IND(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).EDAD_IND = ((Double) value)
				.doubleValue();
	}

	public static Double getINCA_FLGDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).INCA_FLG);
	}

	public static void setINCA_FLG(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).INCA_FLG = value;
	}

	public static void setINCA_FLG(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).INCA_FLG = ((Double) value)
				.doubleValue();
	}

	public static double getMENOR_FLG(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).MENOR_FLG;
	}

	public static Double getMENOR_FLGDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).MENOR_FLG);
	}

	public static void setMENOR_FLG(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).MENOR_FLG = value;
	}

	public static void setMENOR_FLG(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).MENOR_FLG = ((Double) value)
				.doubleValue();
	}

	public static double getBENEFICIO(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).BENEFICIO;
	}

	public static Double getBENEFICIODouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).BENEFICIO);
	}

	public static void setBENEFICIO(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).BENEFICIO = value;
	}

	public static void setBENEFICIO(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).BENEFICIO = ((Double) value)
				.doubleValue();
	}

	public static double getMENOR(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).MENOR;
	}

	public static Double getMENORDouble(RallyApplication __app) {
		return new Double(
				((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
						.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).MENOR);
	}

	public static void setMENOR(RallyApplication __app, double value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).MENOR = value;
	}

	public static void setMENOR(RallyApplication __app, Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).MENOR = ((Double) value)
				.doubleValue();
	}
	
	public static DataStore getLIHEAP_INCOME_DSD(RallyApplication __app) {
		return ((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).LIHEAP_INCOME_DSD;
	}

	public static void setLIHEAP_INCOME_DSD(RallyApplication __app,
			DataStore value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).LIHEAP_INCOME_DSD = value;
	}

	public static void setLIHEAP_INCOME_DSD(RallyApplication __app,
			Object value) {
		((DETERMINAR_ELEGIBILIDAD_LIHEAP) __app
				.getADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class)).LIHEAP_INCOME_DSD = (DataStore) value;
	}
	/**
	 * 
	 * @param __app
	 * @return
	 */
	public static DETERMINAR_ELEGIBILIDAD_LIHEAP get(RallyApplication __app) 
	{
		DETERMINAR_ELEGIBILIDAD_LIHEAP adl = new DETERMINAR_ELEGIBILIDAD_LIHEAP();
		__app.register(adl, "DETERMINAR_ELEGIBILIDAD_LIHEAP");
		__app.setADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class, adl);
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
		DETERMINAR_ELEGIBILIDAD_LIHEAP.get(__app).process(ps);
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
		DETERMINAR_ELEGIBILIDAD_LIHEAP.exec(__app, ps);
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
		IRegisteredObject rObj = this.app.get("DETERMINAR_ELEGIBILIDAD_LIHEAP");
		if (rObj != null && rObj instanceof DETERMINAR_ELEGIBILIDAD_LIHEAP) 
		{
			this.app.setADL(DETERMINAR_ELEGIBILIDAD_LIHEAP.class,(DETERMINAR_ELEGIBILIDAD_LIHEAP) rObj);
		}
	}

	/**
	 * Overrides the ancestor's method
	 * 
	 * @param ps
	 */
	protected void process(ParameterSet ps) 
	{
		Debug.println(Debug.TRACE, "DETERMINAR_ELEGIBILIDAD_LIHEAP Step "+ this.currentStep);
		super.process(ps);
		switch (this.currentStep) 
		{
			case 0: {this.currentStep++;this.step0(this.keyParms);break;}
			case 1: {this.currentStep++;this.step1(this.keyParms);break;}
			case 2: {this.currentStep++;this.step2(this.keyParms);break;}
			case 3: {this.currentStep++;this.step3(this.keyParms);break;}
			case 4: {this.currentStep++;this.step4(this.keyParms);break;}
			default: 
			{
				this.currentStep = 0;
				Debug.println(Debug.TRACE, "DETERMINAR_ELEGIBILIDAD_LIHEAP ended");
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
		LIHEAP_INCOME_DSD = this.dm.create("LIHEAP_INCOME_DSD");
		OPEN5_ID = LIHEAP_INCOME_DSD.getId();
		STATUS_CODE = RallyDataStoreException.getDefault();
		CLIENTE_AGENCIA_RO_DSD = this.dm.create("CLIENTE_AGENCIA_RO_DSD");
		OPEN6_ID = CLIENTE_AGENCIA_RO_DSD.getId();
		STATUS_CODE = RallyDataStoreException.getDefault();
		CHECK_ID_AUTORIZA_ADL.exec(this.app);
		return;
	}

	protected void step1(ParameterSet ps) 
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
		STATUS_CODE = this.dm.reset(OPEN4_ID);

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
		STATUS_CODE = this.dm.limitQueryFromBuffer(OPEN4_ID);
		STATUS_CODE = this.dm.retrieve(OPEN4_ID);

		if (!Compare.equals(STATUS_CODE, 0)) 
		{
			this.app.setError(2, STATUS_CODE);
			this.doReturn();
			return;
		}

		STATUS_CODE = this.dm.firstRow(OPEN4_ID);

		while (Compare.equals(STATUS_CODE, 0)) 
		{
			BENEINCA = 0;
			this.app.SS_IND_GBL = this.dm.getFieldDouble(this.dm.get("RECURSOS_NUCLEO_DSD"),"SEGURO_SOCIAL_BENEFICIARIO");
			STATUS_CODE = this.dm.reset(OPEN4_ID);
			this.dm.setField(this.dm.get("CLIENTES_READ_LOC_DSD"),"SEGURO_SOCIAL_CLIENTE", this.app.SS_IND_GBL);
			STATUS_CODE = this.dm.limitQueryFromBuffer(OPEN2_ID);
			STATUS_CODE = this.dm.retrieve(OPEN2_ID);
			STATUS_CODE = this.dm.firstRow(OPEN2_ID);
			STATUS_CODE = this.dm.reset(OPEN6_ID);
			this.dm.setField(this.dm.get("CLIENTE_AGENCIA_RO_DSD"),"SEGURO_SOCIAL_CLIENTE", this.app.SS_IND_GBL);
			STATUS_CODE = this.dm.limitQueryFromBuffer(OPEN6_ID);
			STATUS_CODE = this.dm.retrieve(OPEN6_ID);
			STATUS_CODE = this.dm.firstRow(OPEN6_ID);
			while (Compare.equals(STATUS_CODE, 0)) 
			{
				if ((Compare.equals(this.dm.getFieldString(this.dm.get("CLIENTES_READ_LOC_DSD"),"FLG_INCAPACIDAD_VERIFICADA"), "S"))) 
				{
					if ((Compare.equals(this.dm.getFieldString(this.dm.get("CLIENTE_AGENCIA_RO_DSD"),"COD_AGENCIA"), "ACAA"))
							|| (Compare.equals(this.dm.getFieldString(this.dm.get("CLIENTE_AGENCIA_RO_DSD"),"COD_AGENCIA"), "CFSE"))
							|| (Compare.equals(this.dm.getFieldString(this.dm.get("CLIENTE_AGENCIA_RO_DSD"),"COD_AGENCIA"), "ADSR"))
							|| (Compare.equals(this.dm.getFieldString(this.dm.get("CLIENTE_AGENCIA_RO_DSD"),"COD_AGENCIA"), "SIRM"))
							|| (Compare.equals(this.dm.getFieldString(this.dm.get("CLIENTE_AGENCIA_RO_DSD"),"COD_AGENCIA"), "RETF"))
							|| (Compare.equals(this.dm.getFieldString(this.dm.get("CLIENTE_AGENCIA_RO_DSD"),"COD_AGENCIA"), "DFAM"))
							|| (Compare.equals(this.dm.getFieldString(this.dm.get("CLIENTE_AGENCIA_RO_DSD"),"COD_AGENCIA"), "ADSS"))
							|| (Compare.equals(this.dm.getFieldString(this.dm.get("CLIENTE_AGENCIA_RO_DSD"),"COD_AGENCIA"), "ADSE"))
							|| (Compare.equals(this.dm.getFieldString(this.dm.get("CLIENTE_AGENCIA_RO_DSD"),"COD_AGENCIA"), "VETE"))
							|| (Compare.equals(this.dm.getFieldString(this.dm.get("CLIENTE_AGENCIA_RO_DSD"),"COD_AGENCIA"), "RETO"))
							|| (Compare.equals(this.dm.getFieldString(this.dm.get("CLIENTE_AGENCIA_RO_DSD"),"COD_AGENCIA"), "SIRM"))) 
					{
						BENEINCA = MathService.plus(BENEINCA, 1);
					}
				}

				STATUS_CODE = this.dm.nextRow(OPEN6_ID);
			}

			
				if ((!Compare.equals(this.dm.getFieldString(this.dm.get("RECURSOS_NUCLEO_DSD"),"COD_PARENTESCO_RELACION_SERV"), "RNBE"))
						&& (!Compare.equals(this.dm.getFieldString(this.dm.get("RECURSOS_NUCLEO_DSD"),"COD_PARENTESCO_RELACION_SERV"), "ACNE"))
						&& (!Compare.equals(this.dm.getFieldString(this.dm.get("RECURSOS_NUCLEO_DSD"),"COD_PARENTESCO_RELACION_SERV"), "****"))
						&& Compare.equals(BENEINCA, 0)) 
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
			
			STATUS_CODE = this.dm.nextRow(OPEN6_ID);
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
			if ( (  Compare.equals ( this.dm.getFieldString ( this.dm.get ( "NUCLEO_SERVICIO_DSD" ), "COD_PARENTESCO_RELACION_SERV" ), "BNPR" ) ) || (  Compare.equals ( this.dm.getFieldString ( this.dm.get ( "NUCLEO_SERVICIO_DSD" ), "COD_PARENTESCO_RELACION_SERV" ), "BNSC" ) )  )
		      {
				MIEMBROS_FAMILIA = MathService.plus ( MIEMBROS_FAMILIA, 1  );
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
		
		if (this._condition0) 
		{
			if (Compare.gt(RECURSOS_ACUM, 2000)) 
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
				if (Compare.gt(RECURSOS_ACUM, 1000)) 
				{
					this._condition2 = true;
				} 
				else 
				{
					this._condition2 = false;
				}
			
			}
		LIHEAP_INCOME_MAX = 0;
		STATUS_CODE = this.dm.reset(OPEN5_ID);
		this.dm.setField("LIHEAP_INCOME_DSD", "MIEMBROS_FAMILIA", MIEMBROS_FAMILIA);
		STATUS_CODE = this.dm.limitQueryFromBuffer(OPEN5_ID);
		STATUS_CODE = this.dm.retrieve(OPEN5_ID);
		STATUS_CODE = this.dm.firstRow(OPEN5_ID);
		while (Compare.equals(STATUS_CODE, 0)) 
		{
			{
				LIHEAP_INCOME_MAX = this.dm.getFieldDouble ( this.dm.get ( "LIHEAP_INCOME_DSD" ), "INCOME_MENSUAL" );
				if(Compare.gt(LIHEAP_INCOME_MAX, INGRESOS_NUCLEO))
				{
					this._condition3 = true;
				}
				else
				{
					this._condition3 = false;
				}
			}
			STATUS_CODE = this.dm.nextRow(OPEN5_ID);
		}
			
		if (!this._condition3) 
		{

			RAZON = "EL INGRESO FAMILIAR EXCEDE EL 110% DE POBREZA";
			STATUS_CODE = this.dm.dbClose(OPEN_ID);
			STATUS_CODE = this.dm.dbClose(OPEN2_ID);
			STATUS_CODE = this.dm.dbClose(OPEN3_ID);
			STATUS_CODE = this.dm.dbClose(OPEN4_ID);
			STATUS_CODE = this.dm.dbClose(OPEN5_ID);
			STATUS_CODE = this.dm.dbClose(OPEN6_ID);
			STATUS_CODE = this.dm.dbClose(OPEN7_ID);
			if (Compare.equals(this.app.AUTORIZADA_GBL, "S")) 
			{
				SERVICIO_STATUS = "CERRAD04";
			} 
			else 
			{
				SERVICIO_STATUS = "RECHAZ04";
			}
		}
		
		else if(this._condition1 || this._condition2)
			{
				RAZON = "FAMILIA EXCEDE EL MAXIMO DE RECURSOS";
				STATUS_CODE = this.dm.dbClose(OPEN_ID);
				STATUS_CODE = this.dm.dbClose(OPEN2_ID);
				STATUS_CODE = this.dm.dbClose(OPEN3_ID);
				STATUS_CODE = this.dm.dbClose(OPEN4_ID);
				STATUS_CODE = this.dm.dbClose(OPEN5_ID);
				STATUS_CODE = this.dm.dbClose(OPEN6_ID);
				STATUS_CODE = this.dm.dbClose(OPEN7_ID);
				if (Compare.equals(this.app.AUTORIZADA_GBL, "S")) 
				{
					SERVICIO_STATUS = "CERRAD04";
				} 
				else 
				{
					SERVICIO_STATUS = "RECHAZ04";
				}
			}
		else
		{
			if (Compare.equals(this.app.AUTORIZADA_GBL, "S")) 
			{
				SERVICIO_STATUS = "PENDREVI";
			} 
			else 
			{
				SERVICIO_STATUS = "PENDCERT";
			}
		}
		return;
	}
	  protected void step2 ( ParameterSet ps )
	  {
	        DETERMINACION_FINAL_MENU.exec ( this.app );
	        return;
	  }
	  protected void step3 ( ParameterSet ps )
	  {
			PSE_2_ADL.exec(this.app);
			return;
	  }
	  protected void step4 ( ParameterSet ps )
	  {
	        if ( ( Compare.equals ( this.app.DETERMINACION_FINAL_GBL, "N" ) ) || ( Compare.equals ( this.app.DETERMINACION_FINAL_GBL, "n" ) ) )
	        {
	          this.doReturn ( );
	          return;
	        }
			PSE_2_PKT.exec(this.app);
			return;
	  }
}
