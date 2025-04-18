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
public class APELACIONES2_SI_NO_ADL
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
  public static APELACIONES2_SI_NO_ADL get ( RallyApplication __app )
  {
    APELACIONES2_SI_NO_ADL adl = new APELACIONES2_SI_NO_ADL ( );
    __app.register ( adl, "APELACIONES2_SI_NO_ADL" );
    __app.setADL ( APELACIONES2_SI_NO_ADL.class, adl ); 
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
    APELACIONES2_SI_NO_ADL.get ( __app ).process ( ps );
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
    APELACIONES2_SI_NO_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "APELACIONES2_SI_NO_ADL" );
    if ( rObj != null && rObj instanceof APELACIONES2_SI_NO_ADL )
    {
      this.app.setADL ( APELACIONES2_SI_NO_ADL.class, ( APELACIONES2_SI_NO_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "APELACIONES2_SI_NO_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "APELACIONES2_SI_NO_ADL ended" );
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

    if ( this.app.isCurrentField ( "APELACIONES2_FR", "SOLICITUD_RECONSIDERACION" ) ) 
    {
      if ( ! ( ( Compare.equals ( this.app.form ( "APELACIONES2_FR" ).getStringItem ( "SOLICITUD_RECONSIDERACION" ), "N" ) ) || ( Compare.equals ( this.app.form ( "APELACIONES2_FR" ).getStringItem ( "SOLICITUD_RECONSIDERACION" ), "S" ) ) || ( Compare.equals ( this.app.form ( "APELACIONES2_FR" ).getStringItem ( "SOLICITUD_RECONSIDERACION" ), "n" ) ) || ( Compare.equals ( this.app.form ( "APELACIONES2_FR" ).getStringItem ( "SOLICITUD_RECONSIDERACION" ), "s" ) ) || ( Compare.equals ( this.app.form ( "APELACIONES2_FR" ).getStringItem ( "SOLICITUD_RECONSIDERACION" ), "" ) ) ) ) 
      {
        this.app.setError ( 0, 1030 );
        this.app.browseToField ( "APELACIONES2_FR", "SOLICITUD_RECONSIDERACION" ); 
        this.doReturn ( );
        return; 
      }
    }
    if ( this.app.isCurrentField ( "APELACIONES2_FR", "APELACION_TRIBUNAL" ) ) 
    {
      if ( ! ( ( Compare.equals ( this.app.form ( "APELACIONES2_FR" ).getStringItem ( "APELACION_TRIBUNAL" ), "N" ) ) || ( Compare.equals ( this.app.form ( "APELACIONES2_FR" ).getStringItem ( "APELACION_TRIBUNAL" ), "S" ) ) || ( Compare.equals ( this.app.form ( "APELACIONES2_FR" ).getStringItem ( "APELACION_TRIBUNAL" ), "n" ) ) || ( Compare.equals ( this.app.form ( "APELACIONES2_FR" ).getStringItem ( "APELACION_TRIBUNAL" ), "s" ) ) || ( Compare.equals ( this.app.form ( "APELACIONES2_FR" ).getStringItem ( "APELACION_TRIBUNAL" ), "" ) ) ) ) 
      {
        this.app.setError ( 1, 1030 );
        this.app.browseToField ( "APELACIONES2_FR", "APELACION_TRIBUNAL" ); 
        this.doReturn ( );
        return; 
      }
    }
    if ( this.app.isCurrentField ( "APELACIONES2_FR", "APELA_DEC_TRIBUNAL" ) ) 
    {
      if ( ! ( ( Compare.equals ( this.app.form ( "APELACIONES2_FR" ).getStringItem ( "APELA_DEC_TRIBUNAL" ), "N" ) ) || ( Compare.equals ( this.app.form ( "APELACIONES2_FR" ).getStringItem ( "APELA_DEC_TRIBUNAL" ), "S" ) ) || ( Compare.equals ( this.app.form ( "APELACIONES2_FR" ).getStringItem ( "APELA_DEC_TRIBUNAL" ), "n" ) ) || ( Compare.equals ( this.app.form ( "APELACIONES2_FR" ).getStringItem ( "APELA_DEC_TRIBUNAL" ), "s" ) ) || ( Compare.equals ( this.app.form ( "APELACIONES2_FR" ).getStringItem ( "APELA_DEC_TRIBUNAL" ), "" ) ) ) ) 
      {
        this.app.setError ( 2, 1030 );
        this.app.browseToField ( "APELACIONES2_FR", "APELA_DEC_TRIBUNAL" ); 
        this.doReturn ( );
        return; 
      }
    }
    if ( this.app.isCurrentField ( "APELACIONES2_FR", "VIOLACION_INTENCIONAL" ) ) 
    {
      if ( ! ( ( Compare.equals ( this.app.form ( "APELACIONES2_FR" ).getStringItem ( "VIOLACION_INTENCIONAL" ), "N" ) ) || ( Compare.equals ( this.app.form ( "APELACIONES2_FR" ).getStringItem ( "VIOLACION_INTENCIONAL" ), "S" ) ) || ( Compare.equals ( this.app.form ( "APELACIONES2_FR" ).getStringItem ( "VIOLACION_INTENCIONAL" ), "n" ) ) || ( Compare.equals ( this.app.form ( "APELACIONES2_FR" ).getStringItem ( "VIOLACION_INTENCIONAL" ), "s" ) ) || ( Compare.equals ( this.app.form ( "APELACIONES2_FR" ).getStringItem ( "VIOLACION_INTENCIONAL" ), "" ) ) ) ) 
      {
        this.app.setError ( 3, 1030 );
        this.app.browseToField ( "APELACIONES2_FR", "VIOLACION_INTENCIONAL" ); 
        this.doReturn ( );
        return; 
      }
    }

  }
}



/* ---------------------------------------------------------------------


     
procedure apelaciones2_si_no_adl;              

begin
set_trace();
        if is_current_field(APELACIONES2_FR.solicitud_reconsideracion)
        then
        begin
                if not ((APELACIONES2_FR.solicitud_reconsideracion = 'N')
                or (APELACIONES2_FR.solicitud_reconsideracion = 'S')
                or (APELACIONES2_FR.solicitud_reconsideracion = 'n')
                or (APELACIONES2_FR.solicitud_reconsideracion = 's')
                or (APELACIONES2_FR.solicitud_reconsideracion = ''))

                then
                   begin
                        error(1030);
                        set_current_field(APELACIONES2_FR.solicitud_reconsiderac
ion);
                        return;
                   end;
                {endif}
        end;
        {end_if}

        if is_current_field(APELACIONES2_FR.APELACION_TRIBUNAL)
        then
        begin
                if not ((APELACIONES2_FR.APELACION_TRIBUNAL = 'N')
                or (APELACIONES2_FR.APELACION_TRIBUNAL = 'S')
                or (APELACIONES2_FR.APELACION_TRIBUNAL = 'n')
                or (APELACIONES2_FR.APELACION_TRIBUNAL = 's')
                or (APELACIONES2_FR.APELACION_TRIBUNAL= ''))
                then
                   begin
                        error(1030);
                        set_current_field(APELACIONES2_FR.APELACION_TRIBUNAL);
                        return;
                   end;
                {endif}
        end;
        {end_if}

        if is_current_field(APELACIONES2_FR.APELA_DEC_TRIBUNAL)
        then
        begin
                if not ((APELACIONES2_FR.APELA_DEC_TRIBUNAL = 'N')
                or (APELACIONES2_FR.APELA_DEC_TRIBUNAL = 'S')
                or (APELACIONES2_FR.APELA_DEC_TRIBUNAL = 'n')
                or (APELACIONES2_FR.APELA_DEC_TRIBUNAL = 's')
                or (APELACIONES2_FR.APELA_DEC_TRIBUNAL = ''))
                then
                   begin
                        error(1030);
                        set_current_field(APELACIONES2_FR.APELA_DEC_TRIBUNAL);
                        return;
                   end;
                {endif}
        end;
        {endif}

        if is_current_field(APELACIONES2_FR.VIOLACION_INTENCIONAL)
        then
        begin
                if not ((APELACIONES2_FR.VIOLACION_INTENCIONAL = 'N')
                or (APELACIONES2_FR.VIOLACION_INTENCIONAL = 'S')
                or (APELACIONES2_FR.VIOLACION_INTENCIONAL = 'n')
                or (APELACIONES2_FR.VIOLACION_INTENCIONAL = 's')
                or (APELACIONES2_FR.VIOLACION_INTENCIONAL = ''))
                then
                   begin
                        error(1030);
                        set_current_field(APELACIONES2_FR.VIOLACION_INTENCIONAL)
;
                        return;
                   end;
                {endif}
        end;
        {end_if}

set_notrace();
end;
    



--------------------------------------------------------------------- */
