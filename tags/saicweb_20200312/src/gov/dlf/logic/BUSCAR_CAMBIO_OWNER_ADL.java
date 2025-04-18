package gov.dlf.logic;


import gov.dlf.facade.*;
import gov.dlf.presentation.*;


import net.maintrend.interfaces.*;
import net.maintrend.interlink.*;
import net.maintrend.rallyengine.*;
import net.maintrend.util.*;



/**
 * __Comment
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class BUSCAR_CAMBIO_OWNER_ADL
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
  public static BUSCAR_CAMBIO_OWNER_ADL get ( RallyApplication __app )
  {
    BUSCAR_CAMBIO_OWNER_ADL adl = new BUSCAR_CAMBIO_OWNER_ADL ( );
    __app.register ( adl, "BUSCAR_CAMBIO_OWNER_ADL" );
    __app.setADL ( BUSCAR_CAMBIO_OWNER_ADL.class, adl ); 
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
    BUSCAR_CAMBIO_OWNER_ADL.get ( __app ).process ( ps );
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
    BUSCAR_CAMBIO_OWNER_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "BUSCAR_CAMBIO_OWNER_ADL" );
    if ( rObj != null && rObj instanceof BUSCAR_CAMBIO_OWNER_ADL )
    {
      this.app.setADL ( BUSCAR_CAMBIO_OWNER_ADL.class, ( BUSCAR_CAMBIO_OWNER_ADL ) rObj );
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
    Debug.println ( Debug.TRACE, "BUSCAR_CAMBIO_OWNER_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
      case 2:  { this.currentStep ++; this.step2 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "BUSCAR_CAMBIO_OWNER_ADL ended" );
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

    this.app.ACCESS_STATUS_GBL = "";
    this.app.COD_ACCESS_GBL = "RTRC";
    SECURITY_ADL.exec ( this.app );
    return;

  }


  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {

    if ( Compare.equals ( this.app.ACCESS_STATUS_GBL, "FAILURE" ) ) 
    {
      this.app.setError ( 0, 1006 );
      this.doReturn ( );
      return; 
    }
    this.app.SS_JEFE_FAMILIA_GBL = this.app.form ( "LISTA_CAMBIO_OWNER_FRM" ).getDoubleItem ( "SEGURO_SOCIAL_JEFE_FAM" );
    this.app.SS_JEFE_SERVICIO_GBL = this.app.form ( "LISTA_CAMBIO_OWNER_FRM" ).getDoubleItem ( "SEGURO_SOCIAL_JEFE_SERV" );
    this.app.COD_SERVICIO_GBL = this.app.form ( "LISTA_CAMBIO_OWNER_FRM" ).getStringItem ( "COD_SERVICIO" );
    this.app.ACCION_GBL = this.app.form ( "LISTA_CAMBIO_OWNER_FRM" ).getStringItem ( "ACCION" );
    this.app.FECHA_IDENTIFICADO_GBL = this.app.form ( "LISTA_CAMBIO_OWNER_FRM" ).getDateItem ( "FECHA_IDENTIFICADO" );
    CAMBIO_OWNER_PKT.exec ( this.app );
    return;

  }


  /**
   *
   */
  protected void step2 ( ParameterSet ps )
  {
    this.app.returnTo ( "TECNICO_RECLAMACIONES_MENU" ); if ( true ) return;

  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE BUSCAR_CAMBIO_OWNER_ADL;

BEGIN
        ACCESS_STATUS_GBL :='';
        COD_ACCESS_GBL := 'RTRC';
        CALL SECURITY_ADL;
        IF ACCESS_STATUS_GBL = 'FAILURE' THEN BEGIN;
                        ERROR(1006);
                        RETURN;
                        END;

        SS_JEFE_FAMILIA_GBL:= LISTA_CAMBIO_OWNER_FRM.SEGURO_SOCIAL_JEFE_FAM;
        SS_JEFE_SERVICIO_GBL := LISTA_CAMBIO_OWNER_FRM.SEGURO_SOCIAL_JEFE_SERV;
        ACCION_GBL := LISTA_CAMBIO_OWNER_FRM.ACCION;
        FECHA_IDENTIFICADO_GBL := LISTA_CAMBIO_OWNER_FRM.FECHA_IDENTIFICADO;

        CALL CAMBIO_OWNER_PKT;
        RETURN_TO TECNICO_RECLAMACIONES_MENU;

END;
    



--------------------------------------------------------------------- */
