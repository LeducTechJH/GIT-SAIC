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
public class SEGURIDAD_APELACIONES_ADL
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

 

  // -------------------------------------------------------------------
  // ----------   Instance Export Attributes   -------------------------

  public double KEY_PRESSED = 0;



  public Date FECHA_NULA = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setKEY_PRESSED  ( RallyApplication __app, Parameter value )
  {
    ( ( SEGURIDAD_APELACIONES_ADL ) __app.getADL ( SEGURIDAD_APELACIONES_ADL.class ) ).KEY_PRESSED = value.getDouble ( );
  }  

  
  /**  */
  public static void setFECHA_NULA  ( RallyApplication __app, Parameter value )
  {
    ( ( SEGURIDAD_APELACIONES_ADL ) __app.getADL ( SEGURIDAD_APELACIONES_ADL.class ) ).FECHA_NULA = value.getDate ( );
  }  
    


  /**  */
  public static Date getFECHA_NULA  ( RallyApplication __app )
  {
    return ( ( SEGURIDAD_APELACIONES_ADL ) __app.getADL ( SEGURIDAD_APELACIONES_ADL.class ) ).FECHA_NULA;
  }


  /**  */
  public static void setFECHA_NULA  ( RallyApplication __app, Date value )
  {
    ( ( SEGURIDAD_APELACIONES_ADL ) __app.getADL ( SEGURIDAD_APELACIONES_ADL.class ) ).FECHA_NULA = value;
  }


  /**  */
  public static void setFECHA_NULA  ( RallyApplication __app, Object value )
  {
    ( ( SEGURIDAD_APELACIONES_ADL ) __app.getADL ( SEGURIDAD_APELACIONES_ADL.class ) ).FECHA_NULA = ( Date ) value;
  }




  /**  */
  public static double getKEY_PRESSED  ( RallyApplication __app )
  {
    return ( ( SEGURIDAD_APELACIONES_ADL ) __app.getADL ( SEGURIDAD_APELACIONES_ADL.class ) ).KEY_PRESSED;
  }


  /**  */
  public static Double getKEY_PRESSEDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( SEGURIDAD_APELACIONES_ADL ) __app.getADL ( SEGURIDAD_APELACIONES_ADL.class ) ).KEY_PRESSED );
  }


  /**  */
  public static void setKEY_PRESSED  ( RallyApplication __app, double value )
  {
    ( ( SEGURIDAD_APELACIONES_ADL ) __app.getADL ( SEGURIDAD_APELACIONES_ADL.class ) ).KEY_PRESSED = value;
  }


  /**  */
  public static void setKEY_PRESSED  ( RallyApplication __app, Object value )
  {
    ( ( SEGURIDAD_APELACIONES_ADL ) __app.getADL ( SEGURIDAD_APELACIONES_ADL.class ) ).KEY_PRESSED = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static SEGURIDAD_APELACIONES_ADL get ( RallyApplication __app )
  {
    SEGURIDAD_APELACIONES_ADL adl = new SEGURIDAD_APELACIONES_ADL ( );
    __app.register ( adl, "SEGURIDAD_APELACIONES_ADL" );
    __app.setADL ( SEGURIDAD_APELACIONES_ADL.class, adl ); 
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
    SEGURIDAD_APELACIONES_ADL.get ( __app ).process ( ps );
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
    SEGURIDAD_APELACIONES_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "SEGURIDAD_APELACIONES_ADL" );
    if ( rObj != null && rObj instanceof SEGURIDAD_APELACIONES_ADL )
    {
      this.app.setADL ( SEGURIDAD_APELACIONES_ADL.class, ( SEGURIDAD_APELACIONES_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "SEGURIDAD_APELACIONES_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
      case 2:  { this.currentStep ++; this.step2 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "SEGURIDAD_APELACIONES_ADL ended" );
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

    KEY_PRESSED = RallyAppCommandFactory.translate ( this.app.getLastCommandName ( ) );
    FECHA_NULA = TruncService.setNull ( FECHA_NULA  );
    PONER_FECHA_RADICA_ADL.exec ( this.app );
    return;

  }


  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {

    if ( Compare.equals ( this.app.OFIC_GBL, 1 ) ) 
    {
      this._condition0 = true;
    }
    else
    {
      this._condition0 = false;
    }
    if ( this._condition0 )
    {
      if ( ( this.app.isCurrentField ( "APELACIONES_FR", "FCH_RADICADA" ) ) && ( Compare.equals ( KEY_PRESSED, RallyAppCommandFactory.FPREV ) )  ) 
      {
        this._condition1 = true;
      }
      else
      {
        this._condition1 = false;
      }
      if ( this._condition1 )
      {
        this.app.callCommand ( RallyAppCommandFactory.IGNORE );
        return;
      }
    }

  }


  /**
   *
   */
  protected void step2 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( Compare.equals ( this.app.OFIC_GBL, 1 ) ) 
    {
      if ( this._condition1 )    //      if ( ( this.app.isCurrentField ( "APELACIONES_FR", "FCH_RADICADA" ) ) && ( Compare.equals ( KEY_PRESSED, RallyAppCommandFactory.FPREV ) )  ) 
      {
      }
      if ( this.app.isCurrentField ( "APELACIONES_FR", "VISTA_CELEBRADA" ) ) 
      {
        this.app.browseToField ( "APELACIONES_FR", "FCH_POSPUESTA" ); 
      }
      if ( ( this.app.isCurrentField ( "APELACIONES_FR", "FCH_POSPUESTA" ) ) && ( Compare.equals ( KEY_PRESSED, RallyAppCommandFactory.FPREV ) )  ) 
      {
        this.app.browseToField ( "APELACIONES_FR", "FCH_VISTA_APELACION" ); 
      }
    }
    if ( Compare.equals ( this.app.RECP_GBL, 1 ) ) 
    {
      if ( this.app.isCurrentField ( "APELACIONES_FR", "VISTA_CELEBRADA" ) ) 
      {
        this.app.browseToField ( "APELACIONES_FR", "FCH_POSPUESTA" ); 
      }
      if ( ( this.app.isCurrentField ( "APELACIONES_FR", "FCH_POSPUESTA" ) ) && ( Compare.equals ( KEY_PRESSED, RallyAppCommandFactory.FPREV ) )  ) 
      {
        this.app.browseToField ( "APELACIONES_FR", "FCH_VISTA_APELACION" ); 
      }
    }
    if ( ( this.app.isCurrentField ( "APELACIONES_FR", "FCH_RETIRO" ) ) && ( ! Compare.equals ( this.app.form ( "APELACIONES_FR" ).getDateItem ( "FCH_RETIRO" ), FECHA_NULA ) )  ) 
    {
      this.app.RETIRO_APELACION_GBL = "Y";
    }

  }
}



/* ---------------------------------------------------------------------


     
procedure seguridad_apelaciones_adl;
var
        key_pressed : number(9,0);
        fecha_nula  : date;
begin
set_trace();
key_pressed := get_cmd();
make_null(fecha_nula);
call PONER_FECHA_RADICA_ADL;
{*********** SEGURIDAD PARA OFICINISTA *******************}

        if OFIC_GBL = 1
        then
           begin
                if (is_current_field(APELACIONES_FR.FCH_RADICADA)) and (key_pres
sed = fprev)
                then
                   call_cmd(ignore);
                {endif}

                if is_current_field(APELACIONES_FR.vista_celebrada)
                then
                        set_current_field(APELACIONES_FR.FCH_POSPUESTA);
                {endif}

                if (is_current_field(APELACIONES_FR.FCH_POSPUESTA)) and (key_pre
ssed = fprev)
                then
                        set_current_field(apelaciones_fr.fch_vista_apelacion);
                {endif}
           end;
        {endif}

{*********** SEGURIDAD PARA RECEPCIONISTA ****************}

        if RECP_GBL = 1
        then
           begin
                if is_current_field(APELACIONES_FR.vista_celebrada)
                then
                        set_current_field(APELACIONES_FR.FCH_POSPUESTA);
                {endif}

                if (is_current_field(APELACIONES_FR.FCH_POSPUESTA)) and (key_pre
ssed = fprev)
                then
                        set_current_field(apelaciones_fr.fch_vista_apelacion);
                {endif}
           end;
        {endif}

                if (is_current_field(APELACIONES_FR.fch_retiro)) and (APELACIONE
S_FR.fch_retiro <> fecha_nula)
                then
                        RETIRO_APELACION_GBL := 'Y';
                {endif}

set_notrace();
end;

    



--------------------------------------------------------------------- */
