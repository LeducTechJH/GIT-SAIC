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
public class INFOR_HASTA_PPKT 
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
  public INFOR_HASTA_PPKT ( )
  {
    this.parms = new ParameterSet ( );
  }



  // -------------------------------------------------------------------
  // ----------   Class Methods   --------------------------------------

  /**
   *
   */
  public static INFOR_HASTA_PPKT get ( RallyApplication __app )
  {
    INFOR_HASTA_PPKT pp = ( INFOR_HASTA_PPKT ) __app.getNewInstance ( "INFOR_HASTA_PPKT" );
    return pp;
  }


  /**
   * 
   * @param __app
   * @return
   */
  public static boolean exec ( RallyApplication __app )
  {
    INFOR_HASTA_PPKT pp = ( INFOR_HASTA_PPKT ) __app.getNewInstance ( "INFOR_HASTA_PPKT" );
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
    return INFOR_HASTA_PPKT.exec ( __app );
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
    Debug.println ( Debug.TRACE, "INFOR_HASTA_PPKT" );
    this.prepareParms ( );
    HASTA_ADL.exec ( this.app, this.parms );
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
    this.app.form ( "INFOR_CITAS_FR" ).setValue ( "FCH_ACTIVIDAD_HORA_MIN_CONTAC0", this.parms.getDate ( 0 ) );
    this.app.form ( "INFOR_CITAS_FR" ).setValue ( "DURACION_HORA_MIN_CONTACTO", this.parms.getDate ( 1 ) );
    this.app.form ( "INFOR_CITAS_FR" ).setValue ( "DUMMY1", this.parms.getDate ( 2 ) );
    this.app.form ( "INFOR_CITAS_FR" ).setValue ( "HASTA", this.parms.getDate ( 3 ) );
    this.app.form ( "INFOR_CITAS_FR" ).setValue ( "DUMMY2", this.parms.getDate ( 4 ) );
  }


  /**
   *
   */
  protected void prepareParms ( )
  {
    this.parms.reset ( );
    this.parms.set ( this.app.form ( "INFOR_CITAS_FR" ).getValue ( "FCH_ACTIVIDAD_HORA_MIN_CONTAC0" ) );
    this.parms.set ( this.app.form ( "INFOR_CITAS_FR" ).getValue ( "DURACION_HORA_MIN_CONTACTO" ) );
    this.parms.set ( this.app.form ( "INFOR_CITAS_FR" ).getValue ( "DUMMY1" ) );
    this.parms.set ( this.app.form ( "INFOR_CITAS_FR" ).getValue ( "HASTA" ) );
    this.parms.set ( this.app.form ( "INFOR_CITAS_FR" ).getValue ( "DUMMY2" ) );
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
