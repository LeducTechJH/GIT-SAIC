package gov.dlf.logic;


import gov.dlf.facade.*;
import net.maintrend.appmanager.*;
import net.maintrend.interlink.*;
import net.maintrend.interfaces.*;
import net.maintrend.rallyengine.*;
import net.maintrend.util.*;



/**
 * 
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class INFOR_CITAS_PPKT 
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
  public INFOR_CITAS_PPKT ( )
  {
    this.parms = new ParameterSet ( );
  }



  // -------------------------------------------------------------------
  // ----------   Class Methods   --------------------------------------

  /**
   *
   */
  public static INFOR_CITAS_PPKT get ( RallyApplication __app )
  {
    INFOR_CITAS_PPKT pp = ( INFOR_CITAS_PPKT ) __app.getNewInstance ( "INFOR_CITAS_PPKT" );
    return pp;
  }


  /**
   * 
   * @param __app
   * @return
   */
  public static boolean exec ( RallyApplication __app )
  {
    INFOR_CITAS_PPKT pp = ( INFOR_CITAS_PPKT ) __app.getNewInstance ( "INFOR_CITAS_PPKT" );
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
    return INFOR_CITAS_PPKT.exec ( __app );
  }



  // -------------------------------------------------------------------
  // ----------   IRegisteredObject implementation   -------------------

  /**
   * 
   * @param rApp
   */
  @Override
public void setApplication ( Application rApp )
  {
    if ( rApp != null ) this.app = ( SAIC_DMQ_ORA_Application ) rApp;
  }


  /**
   * 
   * @return
   */
  @Override
public boolean isSelfClosing ( )
  {
    return true;
  }


  /**
   *
   */
  @Override
public ParameterSet getParameters ( )
  {
    return this.parms;
  }


  /**
   *
   */
  @Override
public void setParameters ( ParameterSet value )
  {
    this.parms = value;
  }


  /**
   *
   */
  @Override
public void execute ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "INFOR_CITAS_PPKT" );
    this.prepareParms ( );
    HASTA_ADL.exec ( this.app, this.parms );
    this.returnParms  ( );
    this.app.unregister ( this, false );
  }


  /**
   * Occurs just after removing this object from the application registry
   */
  @Override
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
    this.app.setIR_CALEND_SELECT_FECHA_GBL ( this.parms.getDate ( 0 ) );
    this.app.setIR_CALEND_SELECT_DURACION_GBL ( this.parms.getDate ( 1 ) );
    INFOR_CITAS_ADL.setDUMMY ( this.app, this.parms.get ( 2 ) );
    this.app.setIR_CALEND_SELECT_HASTA_GBL ( this.parms.getDate ( 3 ) );
    INFOR_CITAS_ADL.setDUMMY2 ( this.app, this.parms.get ( 4 ) );
  }


  /**
   *
   */
  protected void prepareParms ( )
  {
    this.parms.reset ( );
    this.parms.set ( this.app.IR_CALEND_SELECT_FECHA_GBL );
    this.parms.set ( this.app.IR_CALEND_SELECT_DURACION_GBL );
    this.parms.set ( INFOR_CITAS_ADL.getDUMMY ( this.app ) );
    this.parms.set ( this.app.IR_CALEND_SELECT_HASTA_GBL );
    this.parms.set ( INFOR_CITAS_ADL.getDUMMY2 ( this.app ) );
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
