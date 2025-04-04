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
public class TRANSFER_COPY_ANS_MENU
     extends ConfirmationMenu
{
  // -------------------------------------------------------------------
  // ----------   Constructors   ---------------------------------------

  /**
   *
   */
  public TRANSFER_COPY_ANS_MENU ( )
  {
    super ( "TRANSFER_COPY_ANS_MENU" );
    this.setMessage ( "Desea continuar con el recibo de esta transacción? ( SI / NO ):" );
    this.setActions ( new _TRANSFER_COPY_ANS_MENU ( this ) );
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
  public static TRANSFER_COPY_ANS_MENU get ( RallyApplication __app )
  {
    return ( TRANSFER_COPY_ANS_MENU ) __app.getOrNew ( "TRANSFER_COPY_ANS_MENU" );
  }


  /**
   *
   * @param __app
   * @return
   */
  public static IRegisteredObject exec ( RallyApplication __app )
  {
    TRANSFER_COPY_ANS_MENU confMenu = TRANSFER_COPY_ANS_MENU.get ( __app );
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
    return TRANSFER_COPY_ANS_MENU.exec ( __app );
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
