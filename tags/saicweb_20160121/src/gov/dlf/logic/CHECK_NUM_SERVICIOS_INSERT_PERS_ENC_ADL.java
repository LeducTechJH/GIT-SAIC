package gov.dlf.logic;


import gov.dlf.external.*;
import gov.dlf.facade.*;
import gov.dlf.presentation.*;


import java.util.*;

import net.maintrend.appmanager.*;
import net.maintrend.datamanager.*;
import net.maintrend.interfaces.*;
import net.maintrend.interlink.*;
import net.maintrend.mdi.*;
import net.maintrend.rallyengine.*;
import net.maintrend.util.*;
import net.maintrend.util.format.*;



/**
 * __Comment
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL
     extends ADL
{
  // -------------------------------------------------------------------
  // ----------   Class Attributes   -----------------------------------

  /**  */
  public static boolean staticCall = false;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes   --------------------------------

  /**  */
  public SAIC_DMQ_ORA_Application app;
  /**  */
  public RallyDataManager dm = null;



  // -------------------------------------------------------------------
  // ----------   Instance Condition Attributes   ----------------------
 
  public boolean _condition0 = false;
 
  public boolean _condition1 = false;
 
  public boolean _condition2 = false;

 

  // -------------------------------------------------------------------
  // ----------   Instance Export Attributes   -------------------------



  public String CHAR_AUX_0_2 = null;

  public String CHAR_AUX_3_1 = null;

  public String TIPO_OPER = null;

  public Date NULL_DATE = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setCHAR_AUX_0_2  ( RallyApplication __app, Parameter value )
  {
    ( ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL ) __app.getADL ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL.class ) ).CHAR_AUX_0_2 = value.getString ( );
  }  

  
  /**  */
  public static void setCHAR_AUX_3_1  ( RallyApplication __app, Parameter value )
  {
    ( ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL ) __app.getADL ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL.class ) ).CHAR_AUX_3_1 = value.getString ( );
  }  

  
  /**  */
  public static void setTIPO_OPER  ( RallyApplication __app, Parameter value )
  {
    ( ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL ) __app.getADL ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL.class ) ).TIPO_OPER = value.getString ( );
  }  

  
  /**  */
  public static void setNULL_DATE  ( RallyApplication __app, Parameter value )
  {
    ( ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL ) __app.getADL ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL.class ) ).NULL_DATE = value.getDate ( );
  }  
    


  /**  */
  public static String getCHAR_AUX_0_2  ( RallyApplication __app )
  {
    return ( ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL ) __app.getADL ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL.class ) ).CHAR_AUX_0_2;
  }


  /**  */
  public static void setCHAR_AUX_0_2  ( RallyApplication __app, String value )
  {
    ( ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL ) __app.getADL ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL.class ) ).CHAR_AUX_0_2 = value;
  }


  /**  */
  public static void setCHAR_AUX_0_2  ( RallyApplication __app, Object value )
  {
    ( ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL ) __app.getADL ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL.class ) ).CHAR_AUX_0_2 = ( String ) value;
  }



  /**  */
  public static String getCHAR_AUX_3_1  ( RallyApplication __app )
  {
    return ( ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL ) __app.getADL ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL.class ) ).CHAR_AUX_3_1;
  }


  /**  */
  public static void setCHAR_AUX_3_1  ( RallyApplication __app, String value )
  {
    ( ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL ) __app.getADL ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL.class ) ).CHAR_AUX_3_1 = value;
  }


  /**  */
  public static void setCHAR_AUX_3_1  ( RallyApplication __app, Object value )
  {
    ( ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL ) __app.getADL ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL.class ) ).CHAR_AUX_3_1 = ( String ) value;
  }



  /**  */
  public static String getTIPO_OPER  ( RallyApplication __app )
  {
    return ( ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL ) __app.getADL ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL.class ) ).TIPO_OPER;
  }


  /**  */
  public static void setTIPO_OPER  ( RallyApplication __app, String value )
  {
    ( ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL ) __app.getADL ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL.class ) ).TIPO_OPER = value;
  }


  /**  */
  public static void setTIPO_OPER  ( RallyApplication __app, Object value )
  {
    ( ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL ) __app.getADL ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL.class ) ).TIPO_OPER = ( String ) value;
  }



  /**  */
  public static Date getNULL_DATE  ( RallyApplication __app )
  {
    return ( ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL ) __app.getADL ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL.class ) ).NULL_DATE;
  }


  /**  */
  public static void setNULL_DATE  ( RallyApplication __app, Date value )
  {
    ( ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL ) __app.getADL ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL.class ) ).NULL_DATE = value;
  }


  /**  */
  public static void setNULL_DATE  ( RallyApplication __app, Object value )
  {
    ( ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL ) __app.getADL ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL.class ) ).NULL_DATE = ( Date ) value;
  }





  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL get ( RallyApplication __app )
  {
    CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL adl = new CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL ( );
    __app.register ( adl, "CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL" );
    __app.setADL ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL.class, adl ); 
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
    CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL.get ( __app ).process ( ps );
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
    CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL" );
    if ( rObj != null && rObj instanceof CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL )
    {
      this.app.setADL ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL.class, ( CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "CHECK_NUM_SERVICIOS_INSERT_PERS_ENC_ADL ended" );
        this.unregister ( );
        break;
      }
    }
    if ( this.currentStep > 0 ) this.app.goOn ( );
  }



  /**
   *
   */
  protected void step0 ( ParameterSet ps )
  {

    NULL_DATE = TruncService.setNull ( NULL_DATE  );
    TIPO_OPER = "A";
    //if ( Compare.equals ( this.app.form ( "PADRE_AUSENTE_PERS_ENCARGADA_FRM" ).getDoubleItem ( "COUNT_SERVICIO_AGGREGATE" ), 0 ) ) 
    if ( Compare.equals ( this.app.form ( "PADRE_AUSENTE_PERS_ENCARGADA_FRM" ).getDoubleItem ( "NUM_PERS_ENCARGADA_AGGREGATE" ), 0 ) ) 
    {
      this._condition0 = true;
    }
    else
    {
      this._condition0 = false;
    }
    if ( this._condition0 )
    {
      TIPO_OPER = "I";
      this.app.callCommand ( RallyAppCommandFactory.FINSNEXT );
      return;
    }

  }


  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( Compare.equals ( this.app.form ( "PADRE_AUSENTE_PERS_ENCARGADA_FRM" ).getDoubleItem ( "COUNT_SERVICIO_AGGREGATE" ), 0 ) ) 
    {
      this.app.form ( "PADRE_AUSENTE_PERS_ENCARGADA_FRM" ).setItem ( "COD_SERVICIO", this.app.form ( "SERV_FAM_FRM" ).getStringItem ( "COD_SERVICIO" ) );
      this.app.form ( "PADRE_AUSENTE_PERS_ENCARGADA_FRM" ).setItem ( "SEGURO_SOCIAL_JEFE_SERV", this.app.form ( "SERV_FAM_FRM" ).getDoubleItem ( "SEGURO_SOCIAL_JEFE_FAM" ) );
/*
      this.app.form ( "PADRE_AUSENTE_PERS_ENCARGADA_FRM" ).setItem ( "ID_TECNICO", this.app.ID_TECNICO_GBL  );

      if ( ( Compare.equals ( this.app.form ( "SERV_FAM_FRM" ).getStringItem ( "COD_SERVICIO" ), "PAN" ) ) || ( Compare.equals ( RallyStringService.subString ( this.app.form ( "SERV_FAM_FRM" ).getStringItem ( "COD_SERVICIO" ), 0, 4 ), "PANE" ) ) || ( Compare.equals ( RallyStringService.subString ( this.app.form ( "SERV_FAM_FRM" ).getStringItem ( "COD_SERVICIO" ), 0, 4 ), "PANB" ) ) || ( Compare.equals ( ( RallyStringService.subString ( this.app.form ( "SERV_FAM_FRM" ).getStringItem ( "COD_SERVICIO" ), 0, 2 ) + RallyStringService.subString ( this.app.form ( "SERV_FAM_FRM" ).getStringItem ( "COD_SERVICIO" ), 3, 1 ) ), "AEA" ) ) || ( Compare.equals ( ( RallyStringService.subString ( this.app.form ( "SERV_FAM_FRM" ).getStringItem ( "COD_SERVICIO" ), 0, 2 ) + RallyStringService.subString ( this.app.form ( "SERV_FAM_FRM" ).getStringItem ( "COD_SERVICIO" ), 3, 1 ) ), "AEB" ) ) || ( Compare.equals ( ( RallyStringService.subString ( this.app.form ( "SERV_FAM_FRM" ).getStringItem ( "COD_SERVICIO" ), 0, 2 ) + RallyStringService.subString ( this.app.form ( "SERV_FAM_FRM" ).getStringItem ( "COD_SERVICIO" ), 3, 1 ) ), "AEC" ) ) || ( Compare.equals ( ( RallyStringService.subString ( this.app.form ( "SERV_FAM_FRM" ).getStringItem ( "COD_SERVICIO" ), 0, 2 ) + RallyStringService.subString ( this.app.form ( "SERV_FAM_FRM" ).getStringItem ( "COD_SERVICIO" ), 3, 1 ) ), "AED" ) ) || ( Compare.equals ( ( RallyStringService.subString ( this.app.form ( "SERV_FAM_FRM" ).getStringItem ( "COD_SERVICIO" ), 0, 2 ) + RallyStringService.subString ( this.app.form ( "SERV_FAM_FRM" ).getStringItem ( "COD_SERVICIO" ), 3, 1 ) ), "AEG" ) ) || ( Compare.equals ( ( RallyStringService.subString ( this.app.form ( "SERV_FAM_FRM" ).getStringItem ( "COD_SERVICIO" ), 0, 2 ) + RallyStringService.subString ( this.app.form ( "SERV_FAM_FRM" ).getStringItem ( "COD_SERVICIO" ), 3, 1 ) ), "AET" ) ) || ( Compare.equals ( RallyStringService.subString ( this.app.form ( "SERV_FAM_FRM" ).getStringItem ( "COD_SERVICIO" ), 0, 2 ), "LI" ) ) ) 
      {
        this.app.form ( "PADRE_AUSENTE_PERS_ENCARGADA_FRM" ).setItem ( "COD_STATUS_SERVICIO", "PENDELEG"  );
      }
      else
      {
        this.app.form ( "PADRE_AUSENTE_PERS_ENCARGADA_FRM" ).setItem ( "COD_STATUS_SERVICIO", "PENDREVI"  );
      }
      if ( Compare.equals ( RallyStringService.subString ( this.app.form ( "PADRE_AUSENTE_PERS_ENCARGADA_FRM" ).getStringItem ( "COD_SERVICIO" ), 0, 4 ), "PANE" ) ) 
      {
        if ( Compare.equals ( this.app.FCH_VISITA_GBL, NULL_DATE ) ) 
        {
          this.app.form ( "PADRE_AUSENTE_PERS_ENCARGADA_FRM" ).setItem ( "FCH_SOLICITUD", this.app.SYSTEM_DATE  );
        }
        else
        {
          this.app.form ( "PADRE_AUSENTE_PERS_ENCARGADA_FRM" ).setItem ( "FCH_SOLICITUD", this.app.FCH_VISITA_GBL  );
        }
      }
      else
      {
        this.app.form ( "PADRE_AUSENTE_PERS_ENCARGADA_FRM" ).setItem ( "FCH_SOLICITUD", this.app.SYSTEM_DATE  );
      }
*/
      
//      this.app.form ( "PADRE_AUSENTE_PERS_ENCARGADA_FRM" ).setItem ( "RMO_OFICINA_LOCAL", this.app.RMO_GBL  );
//      this.app.form ( "PADRE_AUSENTE_PERS_ENCARGADA_FRM" ).setItem ( "FLG_AEC_CLASSI", this.app.form ( "SERV_FAM_FRM" ).getStringItem ( "FLG_AEC_CLASSIF" ) );
      this.app.form ( "PADRE_AUSENTE_PERS_ENCARGADA_FRM" ).setItem ( "RMO_OFICINA", this.app.RMO_GBL  );
    }
    CHAR_AUX_0_2 = RallyStringService.subString ( this.app.form ( "PADRE_AUSENTE_PERS_ENCARGADA_FRM" ).getStringItem ( "COD_SERVICIO" ), 0, 2 );
    if ( Compare.equals ( CHAR_AUX_0_2, "AE" ) ) 
    {
      this._condition1 = true;
    }
    else
    {
      this._condition1 = false;
    }
    if ( this._condition1 )
    {
      CHAR_AUX_3_1 = RallyStringService.subString ( this.app.form ( "PADRE_AUSENTE_PERS_ENCARGADA_FRM" ).getStringItem ( "COD_SERVICIO" ), 3, 1 );
      if ( Compare.equals ( CHAR_AUX_3_1, "C" ) ) 
      {
        this._condition2 = true;
      }
      else
      {
        this._condition2 = false;
      }
      if ( this._condition2 )
      {
        this.app.TIPO_APLIC_GBL = "N";
//        SERV_NUCLEO_SERV_DESCR_AEC_COMP_ADL.exec ( this.app );
        return;
      }
    }

  }
}
