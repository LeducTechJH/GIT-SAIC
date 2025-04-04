package gov.dlf.facade;



import net.maintrend.interfaces.IRegisteredObject;
import net.maintrend.interlink.ParameterSet;
import net.maintrend.rallyengine.ConfirmationMenu;
import net.maintrend.rallyengine.RallyApplication;



/**
 *
 *
 * Manual Change for SAIC-Web project. MainTrend Ltd.
 */
public class TRANSFERENCIA_SOLICITUD_NUEVA_MENU
     extends ConfirmationMenu
{
  // -------------------------------------------------------------------
  // ----------   Constructors   ---------------------------------------

  /**
   *
   */
  public TRANSFERENCIA_SOLICITUD_NUEVA_MENU ( )
  {
    super ( "TRANSFERENCIA_SOLICITUD_NUEVA_MENU" );
    this.setMessage ( "¿Esto es una solicitud nueva trabajada desde otra local? (S/N):" );
    this.setActions ( new _TRANSFERENCIA_SOLICITUD_NUEVA_MENU ( this ) );
    this.setHelpCode   ( "" );
    this.setLegendCode ( "" );


  }



  // -------------------------------------------------------------------
  // ----------   Static Invokation Methods   --------------------------

  /**
   *
   * @param __app
   * @return
   */
  public static TRANSFERENCIA_SOLICITUD_NUEVA_MENU get ( RallyApplication __app )
  {
    return ( TRANSFERENCIA_SOLICITUD_NUEVA_MENU ) __app.getOrNew ( "TRANSFERENCIA_SOLICITUD_NUEVA_MENU" );
  }


  /**
   *
   * @param __app
   * @return
   */
  public static IRegisteredObject exec ( RallyApplication __app )
  {
    TRANSFERENCIA_SOLICITUD_NUEVA_MENU confMenu = TRANSFERENCIA_SOLICITUD_NUEVA_MENU.get ( __app );
    confMenu.setApplication ( __app );
    confMenu.execute ( null );
    return confMenu;
  }


  /**
   *
   * @param __app
   * @return
   */
  public static IRegisteredObject exec ( RallyApplication __app, ParameterSet ps )
  {
    return TRANSFERENCIA_SOLICITUD_NUEVA_MENU.exec ( __app );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * Overrides the ancestor's method
   */
  public void before ( )
  {
  }


  /**
   * Overrides the ancestor's method
   */
  public void after ( )
  {
  }
}

