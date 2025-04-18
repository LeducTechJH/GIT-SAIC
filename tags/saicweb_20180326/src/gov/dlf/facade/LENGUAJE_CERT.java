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
public class LENGUAJE_CERT
     extends ConfirmationMenu
{
  // -------------------------------------------------------------------
  // ----------   Constructors   ---------------------------------------

  /**
   *
   */
  public LENGUAJE_CERT ( )
  {
    super ( "LENGUAJE_CERT" );
    this.setMessage ( "�Desea la certificacion de servicios en ingles? :(S/N):" );
    this.setActions ( new _LENGUAJE_CERT ( this ) );
    this.setHelpCode   ( "1" );
    this.setLegendCode ( "" );


  }



  // -------------------------------------------------------------------
  // ----------   Static Invokation Methods   --------------------------

  /**
   *
   * @param __app
   * @return
   */
  public static LENGUAJE_CERT get ( RallyApplication __app )
  {
    return ( LENGUAJE_CERT ) __app.getOrNew ( "LENGUAJE_CERT" );
  }


  /**
   *
   * @param __app
   * @return
   */
  public static IRegisteredObject exec ( RallyApplication __app )
  {
    LENGUAJE_CERT confMenu = LENGUAJE_CERT.get ( __app );
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
    return LENGUAJE_CERT.exec ( __app );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * Overrides the ancestor's method
   */
  public void before ( )
  {
    return;
  }


  /**
   * Overrides the ancestor's method
   */
  public void after ( )
  {
    return;
  }

}
