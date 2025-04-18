package gov.dlf.facade;


import gov.dlf.external.*;
import gov.dlf.logic.*;
import gov.dlf.presentation.*;



import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;


import net.maintrend.appmanager.*;
import net.maintrend.interfaces.*;
import net.maintrend.interlink.ParameterSet;
import net.maintrend.interlink.*;
import net.maintrend.mdi.*;
import net.maintrend.rallyengine.*;
import net.maintrend.rallyengine.appcommands.*;
import net.maintrend.util.*;



/**
 * 
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class SUB_MENU_9
     extends Menu
{
  // -------------------------------------------------------------------
  // ----------   Constructors   ---------------------------------------

  /**
   *
   */
  public SUB_MENU_9 ( )
  {
    super ( "SUB_MENU_9" );
    this.backgroundPath = "gov/dlf/images/DLFBackground.gif";
    this.setActions ( new _SUB_MENU_9 ( this ) );
    this.setMenuTitleText  ( "<html><i><b><center>  <br>DEPARTAMENTO DE SERVICIOS SOCIALES<br>SISTEMA ADMINISTRACION E INFORMACION DE CASOS<br>DESCALIFICACION<br></center></b></i></html>" );
    this.setMenuLegendText ( LegendRegistry.get ( "" ) );
    this.setHelpCode   ( "1" );
    this.setLegendCode ( "" );
    this.afterMenuCommand = "QUIT ACTION";

  }



  // -------------------------------------------------------------------
  // ----------   Static Methods   -------------------------------------

  /**
   *
   * @param __app
   * @return
   */
  public static SUB_MENU_9 get ( RallyApplication __app )
  {
    return ( SUB_MENU_9 ) __app.menu ( "SUB_MENU_9" );
  }


  /**
   *
   * @param __app
   * @return
   */
  public static Menu exec ( RallyApplication __app )
  {
    Menu menu = SUB_MENU_9.get ( __app );
    menu.execute ( );
    return menu;
  }


  /**
   *
   * @param __app
   * @return
   */
  public static Menu exec ( RallyApplication __app, ParameterSet ps )
  {
    return SUB_MENU_9.exec ( __app );
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
