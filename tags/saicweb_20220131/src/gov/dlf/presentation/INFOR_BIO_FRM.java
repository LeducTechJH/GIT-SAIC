package gov.dlf.presentation;


import gov.dlf.facade.*;
import gov.dlf.external.*;
import gov.dlf.logic.*;

import java.util.Date;


import net.maintrend.appmanager.*;
import net.maintrend.datamanager.*;
import net.maintrend.interfaces.*;
import net.maintrend.interlink.*;
import net.maintrend.jdatapanel.*;
import net.maintrend.jdatapanel.edit.*;
import net.maintrend.jdatapanel.commands.*;
import net.maintrend.mdi.*;
import net.maintrend.rallyengine.*;
import net.maintrend.util.*;



/**
 * __Comment
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class INFOR_BIO_FRM
     extends Form
{
  // -------------------------------------------------------------------
  // ----------   Instance Attributes   --------------------------------

  /**  */
  public SAIC_DMQ_ORA_Application app;



  // -------------------------------------------------------------------
  // ----------   Constructors and supporting methods   ----------------

  /**
   *
   */
  public INFOR_BIO_FRM ( )
  {
    super ( );
    this.setName ( "INFOR_BIO_FRM" );

    Debug.println ( Debug.TRACE, "INFOR_BIO_FRM - constructor" );

    this.setDefinitionPath ( "gov/dlf/presentation/INFOR_BIO_FRM.jdp" );
    String definition = ResourceUtil.getResourceText ( this.definitionPath );
    this.setDefinition     ( definition );

    this.setHighLightSelected   ( false );
    this.compressFieldLocations ( false, true );  // Compresses only Y-locations
  }


  /**
   * Overrides ancestor's script
   *
   * @param __app
   */
  public void setApplication ( Application __app )
  {
    this.app = ( SAIC_DMQ_ORA_Application ) __app;
    if ( this.app != null )
    {
      this.setDataManager ( this.app.getDataManager ( ) );
    }

    ICalculator           calculator;
    IBooleanValueProvider txtVisible;
    IBooleanValueProvider groupVisible;
    IObjectValueProvider  valueProvider;
    JDataPanelField       field;
    JDataPanelTextGroup   txtGroup;
    JDataPanelGroup       visGroup;

    this.setArguments ( "INFO_BIO_FIRST_GP", new INFOR_BIO_FRM_INFO_BIO_FIRST_GP_Arguments ( this ) );

    this.setObjectEvents ( );



    calculator = new INFOR_BIO_FRM_NUM_VECES_DESC_AECalculator ( this );
    field = ( JDataPanelField ) this.getInDepth ( "NUM_VECES_DESC_AE" );
    field.setValueCalculator ( calculator );
    calculator = new INFOR_BIO_FRM_REMANENTE_ACTUALCalculator ( this );
    field = ( JDataPanelField ) this.getInDepth ( "REMANENTE_ACTUAL" );
    field.setValueCalculator ( calculator );
  }


  /**
   * Overrides ancestor's method
   *
   * @return
   */
  public RallyApplication getApplication ( )
  {
    return this.app;
  }



  // -------------------------------------------------------------------
  // ----------   Action Sites   ---------------------------------------

  /**
   *
   */
  public void setObjectEvents ( )
  {
	// *** BEGIN MODS JOR 11/14/2008 ***
    this.registerListener ( "SEGURO_SOCIAL_CLIENTE", JDataPanelListener.VALIDATION, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true;
        if ( Compare.lt ( app.form ( "INFOR_BIO_FRM" ).getDoubleItem ( "SEGURO_SOCIAL_CLIENTE" ), 0 ) )
        {
        	app.errorFlag = false;
        }
        return app.errorFlag;
      }
    } );
	// *** END MODS JOR 11/14/2008 ***
    this.registerListener ( "SEGURO_SOCIAL_CLIENTE", JDataPanelListener.BEFOREENTER, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; SECURITY_SET_FIELD_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "SEGURO_SOCIAL_CLIENTE", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; NO_ENTER_HERE_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    //MOD FOR SSN REASON
    this.registerListener ( "COD_RZ_NSS_SUST", JDataPanelListener.BEFOREENTER, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; 
        double SS = app.form("INFOR_BIO_FRM").getDoubleItem("SEGURO_SOCIAL_CLIENTE");
        if(Compare.lt(SS, 900000000) )
        	{
        	app.callCommand ( "NEXT FIELD" );
        	}
        return app.errorFlag;
      }
    } );
    this.registerListener ( "COD_RZ_NSS_SUST", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; 
        double SS = app.form("INFOR_BIO_FRM").getDoubleItem("SEGURO_SOCIAL_CLIENTE");
        String razon = app.form("INFOR_BIO_FRM").getStringItem("COD_RZ_NSS_SUST");
        if(Compare.gt(SS, 900000000) && (Compare.equals(razon, null) || Compare.equals(razon, "") || Compare.equals(razon, " ")))
        	{
        		app.setError("0","Debe proveer razon de seguro social sustituto.");
        		app.errorFlag = false; 
        	} 
        else
        {
        	app.callCommand ( "NEXT FIELD" );
        }
        return app.errorFlag;
      }
    } );
    //END
    this.registerListener ( "DSC_APELLIDO_PATERNO", JDataPanelListener.AFTERVALUECHANGE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; INFO_BIO_SET_SNDX_VALUE_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "DSC_APELLIDO_MATERNO", JDataPanelListener.AFTERVALUECHANGE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; INFO_BIO_SET_SNDX_VALUE_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "COD_PARENTESCO_FAM", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; CHECK_DUP_JEFE_FAM_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "FCH_NACIMIENTO", JDataPanelListener.VALIDATION, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; VERIFY_FCH_NACIMIENTO_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "SEXO", JDataPanelListener.VALIDATION, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; VAL_SEX_PPKT0000000.exec ( app, null ); return app.errorFlag;
      }
    } );
    this.registerListener ( "COD_INCAPACIDAD_PRIMARIA", JDataPanelListener.AFTERVALUECHANGE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        if ( "NA".equals ( __form.getItem ( "COD_INCAPACIDAD_PRIMARIA" ) ) )
        {
          __form.setItem ( "FLG_INCAPACIDAD_VERIFICADA", "N" );
        }
        return app.errorFlag;
      }
    } );
    this.registerListener ( "FLG_INCAPACIDAD_VERIFICADA", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; INCA_VER_S_N_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "COD_ESCOLARIDAD", JDataPanelListener.AFTERVALUECHANGE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; AFTER_COD_ESCOLARIDAD_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "COD_OCUPACION", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; CHECK_GRADO_ESCOLAR_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "FLG_REHABILITACION_VOC", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; REHAB_VOC_S_N_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "FACT_ELEGIBILIDAD_AEC", JDataPanelListener.BEFOREENTER, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; GEN_PAR_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "ESTUDIA_TIEMPO_COMPLETO", JDataPanelListener.BEFOREENTER, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; CHECK_GRADO_ESCOLAR_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "ESTUDIA_TIEMPO_COMPLETO", JDataPanelListener.VALIDATION, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; TIEMPO_COMPLETO_VERIFY_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "ASISTE_REGULARIDAD", JDataPanelListener.BEFOREENTER, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; CHECK_GRADO_ESCOLAR_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "ASISTE_REGULARIDAD", JDataPanelListener.VALIDATION, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; ASISTE_REGUL_VERIFY.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "DSC_ASISTE_REGULAR", JDataPanelListener.BEFOREENTER, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; CHECK_GRADO_ESCOLAR_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "CONVICTO_SUSTANCIAS", JDataPanelListener.VALIDATION, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; SUSTANCIAS_VERIFY_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "CONVICTO_SUSTANCIAS_F_E", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; PRINT_SUSTANCIAS_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "CONVICTO_SUSTANCIAS_F_E", JDataPanelListener.VALIDATION, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; SUSTANCIAS_F_E_VERIFY_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "CONVICTO_DECLARACION_FRA", JDataPanelListener.VALIDATION, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; DECLARA_FRAUD_VERIFY_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "CONVICTO_DECLARACION_FRA_F_E", JDataPanelListener.VALIDATION, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; CONV_DECLARA_FRAUD_F_E_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "VIOLACION_PROBATORIA", JDataPanelListener.VALIDATION, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; VIOL_PROB_VERIFY_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "VIOLACION_PROBATORIA_F_E", JDataPanelListener.VALIDATION, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; VIOL_PROB_F_E_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "CESION_MEDICAID", JDataPanelListener.VALIDATION, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; CESION_S_N_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "TIPO_CUBIERTA_MEDICARE", JDataPanelListener.VALIDATION, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; TIPO_CUBIERTA_A_B_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "COD_INSTITUCION", JDataPanelListener.BEFOREENTER, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; GEN_PAR_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "COD_PASOS", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; CHECK_COD_PRI_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "COD_PASOS", JDataPanelListener.AFTERVALUECHANGE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; CHECK_COD_PRI_CAMBIO_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "COD_PSM", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; PSM_CHK_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "FLG_PAN_TRABAJO", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; PTRA_VER_S_N_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "FLG_HUELGA", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; HUELGA_VERIFY_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "FLG_VETERANO", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; VETERANO_VER_S_N_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "FCH_REFERIDO_MANEJO", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; IMPRIMIR_PRI_MENU_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "FLG_TANF", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; TANF_VER_S_N_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "FLG_PRES", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; PRES_VER_S_N_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "FLG_TERMINO_EXEN_5_MESES", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; TERMINO_EXEN_VER_S_N_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "FLG_18_ANOS", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; FLG_18ANOS_VER_S_N_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "FLG_60_ANOS", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; FLG_60ANOS_VER_S_N_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "INFO_BIO_FIRST_GP", JDataPanelListener.BEFOREINSERT, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; INFO_BIO_BEF_INS_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    //
    this.registerListener ( "INFO_BIO_FIRST_GP", JDataPanelListener.BEFOREUPDATE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; INFO_BIO_BEF_UPD_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    //
    this.registerListener ( "INFO_BIO_FIRST_GP", JDataPanelListener.BEFOREENTER, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; INFOR_BEF_VISIT_ADL.exec ( app ); return app.errorFlag;
      }
    } );
  }
}





/**
 *
 */
class INFOR_BIO_FRM_INFO_BIO_FIRST_GP_Arguments extends JDataPanelGroupArguments
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public INFOR_BIO_FRM_INFO_BIO_FIRST_GP_Arguments ( Form form )
  {
    this.model = form;

    this.setArgName ( "RMO_PAR" );
    this.setArgName ( "SSN_PAR" );
  }

  /**  */
  public Object getArgValue ( String argName )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    if ( argName == null )
    {
      return null;
    }
    else if ( argName.equals ( "RMO_PAR" ) )
    {
      return this.app.getRMO_GBL ( ); // Global Variable
    }
    else if ( argName.equals ( "SSN_PAR" ) )
    {
      return this.app.getSSN_GBL ( ); // Global Variable
    }
    return null;
  }
}







/**
 *
 */
class INFOR_BIO_FRM_NUM_VECES_DESC_AECalculator implements ICalculator
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public INFOR_BIO_FRM_NUM_VECES_DESC_AECalculator ( Form form )
  {
    this.model = form;
  }

  /**  */
  public void calculate ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    NUM_VECES_DESC_ADL.exec ( this.app, null );
  }
}



/**
 *
 */
class INFOR_BIO_FRM_REMANENTE_ACTUALCalculator implements ICalculator
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public INFOR_BIO_FRM_REMANENTE_ACTUALCalculator ( Form form )
  {
    this.model = form;
  }

  /**  */
  public void calculate ( )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    REMANENTE_ACTUAL_ADL.exec ( this.app, null );
  }
}


