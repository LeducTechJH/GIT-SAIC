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
public class TRANSFER_FAM_NAME
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
  public static TRANSFER_FAM_NAME get ( RallyApplication __app )
  {
    TRANSFER_FAM_NAME adl = new TRANSFER_FAM_NAME ( );
    __app.register ( adl, "TRANSFER_FAM_NAME" );
    __app.setADL ( TRANSFER_FAM_NAME.class, adl ); 
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
    TRANSFER_FAM_NAME.get ( __app ).process ( ps );
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
    TRANSFER_FAM_NAME.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "TRANSFER_FAM_NAME" );
    if ( rObj != null && rObj instanceof TRANSFER_FAM_NAME )
    {
      this.app.setADL ( TRANSFER_FAM_NAME.class, ( TRANSFER_FAM_NAME ) rObj );
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
    Debug.println ( Debug.TRACE, "TRANSFER_FAM_NAME Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "TRANSFER_FAM_NAME ended" );
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

    this.app.form ( "TRANSFER_COPY_FR" ).setItem ( "NOMBRE_COMPLETO", this.app.form ( "TRANSFER_COPY_FR" ).getStringItem ( "XFR_CLIENTES_DSC_NOMBRE" )+ " " + this.app.form ( "TRANSFER_COPY_FR" ).getStringItem ( "XFR_CLIENTES_DSC_INICIAL" )+ " " + this.app.form ( "TRANSFER_COPY_FR" ).getStringItem ( "XFR_CLIENTES_DSC_APELLIDO_PATERNO" )+ " " + this.app.form ( "TRANSFER_COPY_FR" ).getStringItem ( "XFR_CLIENTES_DSC_APELLIDO_MATERNO" ) );

  }
}



/* ---------------------------------------------------------------------


     
BEGIN
        TRANSFER_COPY_FR.NOMBRE_COMPLETO :=
                TRANSFER_COPY_FR.XFR_CLIENTES_DSC_NOMBRE || ' ' ||
                TRANSFER_COPY_FR.XFR_CLIENTES_DSC_INICIAL || ' ' ||
                TRANSFER_COPY_FR.XFR_CLIENTES_DSC_APELLIDO_PATERNO || ' ' ||
                TRANSFER_COPY_FR.XFR_CLIENTES_DSC_APELLIDO_MATERNO;
END;

    



--------------------------------------------------------------------- */
