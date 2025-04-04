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
public class TRANSFERENCIA_CONTINUAR_MENU
     extends ConfirmationMenu
{
  // -------------------------------------------------------------------
  // ----------   Constructors   ---------------------------------------

  /**
   *
   */
  public TRANSFERENCIA_CONTINUAR_MENU ( )
  {
    super ( "TRANSFERENCIA_CONTINUAR_MENU" );
    this.setMessage ( "¿Desea continuar con esta transferencia? (S/N):" );
    this.setActions ( new _TRANSFERENCIA_CONTINUAR_MENU ( this ) );
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
  public static TRANSFERENCIA_CONTINUAR_MENU get ( RallyApplication __app )
  {
    return ( TRANSFERENCIA_CONTINUAR_MENU ) __app.getOrNew ( "TRANSFERENCIA_CONTINUAR_MENU" );
  }


  /**
   *
   * @param __app
   * @return
   */
  public static IRegisteredObject exec ( RallyApplication __app )
  {
    TRANSFERENCIA_CONTINUAR_MENU confMenu = TRANSFERENCIA_CONTINUAR_MENU.get ( __app );
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
    return TRANSFERENCIA_CONTINUAR_MENU.exec ( __app );
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
