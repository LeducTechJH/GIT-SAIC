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
public class AUTORIZAR_DSS108_MENU
     extends ConfirmationMenu
{
  // -------------------------------------------------------------------
  // ----------   Constructors   ---------------------------------------

  /**
   *
   */
  public AUTORIZAR_DSS108_MENU ( )
  {
    super ( "AUTORIZAR_DSS108_MENU" );
    this.setMessage ( "Program� la cita (S/N)?" );
    this.setActions ( new _AUTORIZAR_DSS108_MENU ( this ) );
    this.setHelpCode   ( "1" );
    this.setLegendCode ( "" );
    this.afterMenuCommand = "FINISH ACTION";

  }



  // -------------------------------------------------------------------
  // ----------   Static Invokation Methods   --------------------------

  /**
   *
   * @param __app
   * @return
   */
  public static AUTORIZAR_DSS108_MENU get ( RallyApplication __app )
  {
    return ( AUTORIZAR_DSS108_MENU ) __app.getOrNew ( "AUTORIZAR_DSS108_MENU" );
  }


  /**
   *
   * @param __app
   * @return
   */
  public static IRegisteredObject exec ( RallyApplication __app )
  {
    AUTORIZAR_DSS108_MENU confMenu = AUTORIZAR_DSS108_MENU.get ( __app );
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
    return AUTORIZAR_DSS108_MENU.exec ( __app );
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
