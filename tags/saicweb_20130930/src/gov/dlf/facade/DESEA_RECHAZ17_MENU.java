package gov.dlf.facade;


import gov.dlf.external.*;
import gov.dlf.logic.*;
import gov.dlf.presentation.*;



import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import java.util.ArrayList;


import net.maintrend.appmanager.*;
import net.maintrend.interfaces.*;
import net.maintrend.interlink.ParameterSet;
import net.maintrend.mdi.*;
import net.maintrend.rallyengine.*;
import net.maintrend.rallyengine.appcommands.*;
import net.maintrend.rallyengine.*;
import net.maintrend.util.*;



/**
 * 
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class DESEA_RECHAZ17_MENU
     extends ConfirmationMenu
{
  // -------------------------------------------------------------------
  // ----------   Constructors   ---------------------------------------

  /**
   *
   */
  public DESEA_RECHAZ17_MENU ( )
  {
    super ( "DESEA_RECHAZ17_MENU" );
    this.setMessage ( "Encargado o C�nyuge no acepta Referido a Manejo. Desea rechazar Serv. (S/N)?" );
    this.setActions ( new _DESEA_RECHAZ17_MENU ( this ) );
    this.setHelpCode   ( "101" );
    this.setLegendCode ( "" );
    this.afterMenuCommand = "QUIT ACTION";

  }



  // -------------------------------------------------------------------
  // ----------   Static Invokation Methods   --------------------------

  /**
   *
   * @param __app
   * @return
   */
  public static DESEA_RECHAZ17_MENU get ( RallyApplication __app )
  {
    return ( DESEA_RECHAZ17_MENU ) __app.getOrNew ( "DESEA_RECHAZ17_MENU" );
  }


  /**
   *
   * @param __app
   * @return
   */
  public static IRegisteredObject exec ( RallyApplication __app )
  {
    DESEA_RECHAZ17_MENU confMenu = DESEA_RECHAZ17_MENU.get ( __app );
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
    return DESEA_RECHAZ17_MENU.exec ( __app );
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
