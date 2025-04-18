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
public class FLECHITA4_PPKT 
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
  public FLECHITA4_PPKT ( )
  {
    this.parms = new ParameterSet ( );
  }



  // -------------------------------------------------------------------
  // ----------   Class Methods   --------------------------------------

  /**
   *
   */
  public static FLECHITA4_PPKT get ( RallyApplication __app )
  {
    FLECHITA4_PPKT pp = ( FLECHITA4_PPKT ) __app.getNewInstance ( "FLECHITA4_PPKT" );
    return pp;
  }


  /**
   * 
   * @param __app
   * @return
   */
  public static boolean exec ( RallyApplication __app )
  {
    FLECHITA4_PPKT pp = ( FLECHITA4_PPKT ) __app.getNewInstance ( "FLECHITA4_PPKT" );
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
    return FLECHITA4_PPKT.exec ( __app );
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
    Debug.println ( Debug.TRACE, "FLECHITA4_PPKT" );
    this.prepareParms ( );
    POINTER_ADL.exec ( this.app, this.parms );
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
    this.app.form ( "CALENDARIO_LF_FR" ).setValue ( "FLECHITAS", this.parms.getString ( 0 ) );
  }


  /**
   *
   */
  protected void prepareParms ( )
  {
    this.parms.reset ( );
    this.parms.set ( this.app.form ( "CALENDARIO_LF_FR" ).getValue ( "FLECHITAS" ) );
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
