package gov.dlf.logic;


import gov.dlf.external.*;
import gov.dlf.facade.*;
import gov.dlf.presentation.*;


import java.awt.event.ActionEvent;

import net.maintrend.appmanager.*;
import net.maintrend.interlink.*;
import net.maintrend.interfaces.*;
import net.maintrend.mdi.*;
import net.maintrend.rallyengine.*;
import net.maintrend.util.*;



/**
 * 
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class SOLIC_NOMBRE_COMPLETO_PPKT000 
  implements IRegisteredObject 
{
  // -------------------------------------------------------------------
  // ----------   Instance Attributes   --------------------------------

  /**  */
  public ParameterSet parms;
  /**  */
  public SAIC_DMQ_ORA_Application app;



  // -------------------------------------------------------------------
  // ----------   Constructor   ----------------------------------------

  /**
   *
   */
  public SOLIC_NOMBRE_COMPLETO_PPKT000 ( )
  {
    this.parms = new ParameterSet ( );
  }



  // -------------------------------------------------------------------
  // ----------   Class Methods   --------------------------------------

  /**
   *
   */
  public static SOLIC_NOMBRE_COMPLETO_PPKT000 get ( RallyApplication __app )
  {
    SOLIC_NOMBRE_COMPLETO_PPKT000 pp = ( SOLIC_NOMBRE_COMPLETO_PPKT000 ) __app.getNewInstance ( "SOLIC_NOMBRE_COMPLETO_PPKT000" );
    return pp;
  }


  /**
   * 
   * @param __app
   * @return
   */
  public static boolean exec ( RallyApplication __app )
  {
    SOLIC_NOMBRE_COMPLETO_PPKT000 pp = ( SOLIC_NOMBRE_COMPLETO_PPKT000 ) __app.getNewInstance ( "SOLIC_NOMBRE_COMPLETO_PPKT000" );
    pp.execute ( __app, null );
    return true;
  }


  /**
   * 
   * @param __app
   * @return
   */
  public static boolean exec ( RallyApplication __app, ParameterSet ps )
  {
    return SOLIC_NOMBRE_COMPLETO_PPKT000.exec ( __app );
  }



  // -------------------------------------------------------------------
  // ----------   IRegisteredObject implementation   -------------------

  /**
   * 
   * @param rApp
   */
  public void setApplication ( Application rApp )
  {
    if ( rApp != null ) this.app = ( SAIC_DMQ_ORA_Application ) rApp;
  }


  /**
   * 
   * @return
   */
  public boolean isSelfClosing ( )
  {
    return true;
  }


  /**
   *
   */
  public ParameterSet getParameters ( )
  {
    return this.parms;
  }


  /**
   *
   */
  public void setParameters ( ParameterSet value )
  {
    this.parms = value;
  }


  /**
   *
   */
  public void execute ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "SOLIC_NOMBRE_COMPLETO_PPKT000" );
    this.prepareParms ( );
    FORMAT_NAME_ADL.exec ( this.app, this.parms );
    this.returnParms  ( );
    this.app.unregister ( this, false );
  }


  /**
   * Occurs just after removing this object from the application registry
   */
  public void halt ( )
  {
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   *
   */
  protected void returnParms ( )
  {
    this.app.form ( "COMP_FAM_INFORMES_FR" ).setValue ( "DSC_NOMBRE", this.parms.getString ( 0 ) );
    this.app.form ( "COMP_FAM_INFORMES_FR" ).setValue ( "DSC_INICIAL", this.parms.getString ( 1 ) );
    this.app.form ( "COMP_FAM_INFORMES_FR" ).setValue ( "DSC_APELLIDO_PATERNO", this.parms.getString ( 2 ) );
    this.app.form ( "COMP_FAM_INFORMES_FR" ).setValue ( "DSC_APELLIDO_MATERNO", this.parms.getString ( 3 ) );
    this.app.form ( "COMP_FAM_INFORMES_FR" ).setValue ( "NOMBRE_COMPLETO", this.parms.getString ( 4 ) );
  }


  /**
   *
   */
  protected void prepareParms ( )
  {
    this.parms.reset ( );
    this.parms.set ( this.app.form ( "COMP_FAM_INFORMES_FR" ).getValue ( "DSC_NOMBRE" ) );
    this.parms.set ( this.app.form ( "COMP_FAM_INFORMES_FR" ).getValue ( "DSC_INICIAL" ) );
    this.parms.set ( this.app.form ( "COMP_FAM_INFORMES_FR" ).getValue ( "DSC_APELLIDO_PATERNO" ) );
    this.parms.set ( this.app.form ( "COMP_FAM_INFORMES_FR" ).getValue ( "DSC_APELLIDO_MATERNO" ) );
    this.parms.set ( this.app.form ( "COMP_FAM_INFORMES_FR" ).getValue ( "NOMBRE_COMPLETO" ) );
  }


  /**
   *
   */
  public void execute ( RallyApplication __app, ParameterSet ps )
  {
    this.app = ( SAIC_DMQ_ORA_Application ) __app;
    this.execute ( ps );
  }
}
