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
public class SEGURIDAD_TSS_MODULO_MENU
     extends Menu
{
  // -------------------------------------------------------------------
  // ----------   Constructors   ---------------------------------------

  /**
   *
   */
  public SEGURIDAD_TSS_MODULO_MENU ( )
  {
    super ( "SEGURIDAD_TSS_MODULO_MENU" );
    this.backgroundPath = "gov/dlf/images/DLFBackground.gif";
    this.setActions ( new _SEGURIDAD_TSS_MODULO_MENU ( this ) );
    this.setMenuTitleText  ( "<html><i><b><center>  <br>DEPARTAMENTO DE LA FAMILIA<br>SISTEMA DE ADMINISTRACION E INFORMACION DE CASOS<br>NIVELES DE SEGURIDAD<br><br><br></center></b></i></html>" );
    this.setMenuLegendText ( LegendRegistry.get ( "2001" ) );
    this.setHelpCode   ( "1" );
    this.setLegendCode ( "2001" );


  }



  // -------------------------------------------------------------------
  // ----------   Static Methods   -------------------------------------

  /**
   *
   * @param __app
   * @return
   */
  public static SEGURIDAD_TSS_MODULO_MENU get ( RallyApplication __app )
  {
    return ( SEGURIDAD_TSS_MODULO_MENU ) __app.menu ( "SEGURIDAD_TSS_MODULO_MENU" );
  }


  /**
   *
   * @param __app
   * @return
   */
  public static Menu exec ( RallyApplication __app )
  {
    Menu menu = SEGURIDAD_TSS_MODULO_MENU.get ( __app );
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
    return SEGURIDAD_TSS_MODULO_MENU.exec ( __app );
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
