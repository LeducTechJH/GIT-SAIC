package gov.dlf.logic;


import gov.dlf.facade.*;
import net.maintrend.interfaces.*;
import net.maintrend.interlink.*;
import net.maintrend.rallyengine.*;
import net.maintrend.util.*;



/**
 * __Comment
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class CALENDARIO_LF_RESPUESTA_C_ADL
     extends ADL
{
  // -------------------------------------------------------------------
  // ----------   Class Attributes   -----------------------------------

  /**  */
  public static boolean staticCall = true;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes   --------------------------------

  /**  */
  public SAIC_DMQ_ORA_Application app;
  /**  */
  public RallyDataManager dm = null;



  // -------------------------------------------------------------------
  // ----------   Instance Condition Attributes   ----------------------

 

  // -------------------------------------------------------------------
  // ----------   Instance Export Attributes   -------------------------





  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------
    




  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static CALENDARIO_LF_RESPUESTA_C_ADL get ( RallyApplication __app )
  {
    CALENDARIO_LF_RESPUESTA_C_ADL adl = new CALENDARIO_LF_RESPUESTA_C_ADL ( );
    __app.register ( adl, "CALENDARIO_LF_RESPUESTA_C_ADL" );
    __app.setADL ( CALENDARIO_LF_RESPUESTA_C_ADL.class, adl ); 
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
    CALENDARIO_LF_RESPUESTA_C_ADL.get ( __app ).process ( ps );
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
    CALENDARIO_LF_RESPUESTA_C_ADL.exec ( __app, ps );
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param __app
   */
  @Override
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
  @Override
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
    IRegisteredObject rObj = this.app.get ( "CALENDARIO_LF_RESPUESTA_C_ADL" );
    if ( rObj != null && rObj instanceof CALENDARIO_LF_RESPUESTA_C_ADL )
    {
      this.app.setADL ( CALENDARIO_LF_RESPUESTA_C_ADL.class, ( CALENDARIO_LF_RESPUESTA_C_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  @Override
protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "CALENDARIO_LF_RESPUESTA_C_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "CALENDARIO_LF_RESPUESTA_C_ADL ended" );
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

    this.app.CERRA_GBL = "F";
    this.app.form ( "CALENDARIO_MAIN_FR" ).setItem ( "STS_ACTIVIDAD", ""  );
    this.app.CONTACTO_FCH_HR_MIN_CONT_GBL = this.app.form ( "CALENDARIO_MAIN_FR" ).getDateItem ( "FCH_ACTIVIDAD_HORA_MIN_CONTAC0" );
    this.app.CONTACTO_COD_SERV_GBL = this.app.form ( "CALENDARIO_MAIN_FR" ).getStringItem ( "COD_SERVICIO" );
    this.app.CONTACTO_DURACION_GBL = this.app.form ( "CALENDARIO_MAIN_FR" ).getDateItem ( "DURACION_HORA_MIN_CONTACTO" );
    this.app.CONTACTO_COD_RAZON_GBL = this.app.form ( "CALENDARIO_MAIN_FR" ).getStringItem ( "COD_RAZON" );
    this.app.CONTACTO_SSJF_GBL = this.app.form ( "CALENDARIO_MAIN_FR" ).getDoubleItem ( "SEGURO_SOCIAL_JEFE_FAM" );
    this.app.CONTACTO_SSJS_GBL = this.app.form ( "CALENDARIO_MAIN_FR" ).getDoubleItem ( "SEGURO_SOCIAL_JEFE_SERV" );
    this.app.CONTACTO_ID_TECN_GBL = this.app.form ( "CALENDARIO_MAIN_FR" ).getDoubleItem ( "ID_TECNICO" );
    INVOCAR_CALENDARIO_ADL.setLOCAL_FUNCTION_REPUESTA ( this.app, "C" );

  }
}



/* ---------------------------------------------------------------------


     
{CALENDARIO_LOCAL_FUNCTION_ADL.LOCAL_FUNCTION_RESPUESTA:= 'C';}
{CHAMA_CALENDARIO_ADL.LOCAL_FUNCTION_RESPUESTA:='C';}
        CERRA_GBL := 'F';
       CALENDARIO_MAIN_FR.STS_ACTIVIDAD := ''; 
            CONTACTO_FCH_HR_MIN_CONT_GBL :=
          CALENDARIO_MAIN_FR.FCH_ACTIVIDAD_HORA_MIN_CONTAC0;
            CONTACTO_COD_SERV_GBL :=
            CALENDARIO_MAIN_FR.COD_SERVICIO;
        CONTACTO_DURACION_GBL:=
                    CALENDARIO_MAIN_FR.DURACION_HORA_MIN_CONTACTO;
             CONTACTO_COD_RAZON_GBL :=
                    CALENDARIO_MAIN_FR.COD_RAZON;
             CONTACTO_SSJF_GBL :=
CALENDARIO_MAIN_FR.SEGURO_SOCIAL_JEFE_FAM;
             CONTACTO_SSJS_GBL :=
CALENDARIO_MAIN_FR.SEGURO_SOCIAL_JEFE_SERV;
              CONTACTO_ID_TECN_GBL :=
CALENDARIO_MAIN_FR.ID_TECNICO;
INVOCAR_CALENDARIO_ADL.LOCAL_FUNCTION_REPUESTA:='C';


    



--------------------------------------------------------------------- */
