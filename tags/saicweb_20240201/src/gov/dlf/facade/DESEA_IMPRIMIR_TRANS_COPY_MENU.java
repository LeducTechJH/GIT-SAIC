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
public class DESEA_IMPRIMIR_TRANS_COPY_MENU
     extends ConfirmationMenu
{
  // -------------------------------------------------------------------
  // ----------   Constructors   ---------------------------------------

  /**
   *
   */
  public DESEA_IMPRIMIR_TRANS_COPY_MENU ( )
  {
    super ( "DESEA_IMPRIMIR_TRANS_COPY_MENU" );
    this.setMessage ( "�Desea Imprimir el Informe de Recibo de Transferencias? (S/N):" );
    this.setActions ( new _DESEA_IMPRIMIR_TRANS_COPY_MENU ( this ) );
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
  public static DESEA_IMPRIMIR_TRANS_COPY_MENU get ( RallyApplication __app )
  {
    return ( DESEA_IMPRIMIR_TRANS_COPY_MENU ) __app.getOrNew ( "DESEA_IMPRIMIR_TRANS_COPY_MENU" );
  }


  /**
   *
   * @param __app
   * @return
   */
  public static IRegisteredObject exec ( RallyApplication __app )
  {
    DESEA_IMPRIMIR_TRANS_COPY_MENU confMenu = DESEA_IMPRIMIR_TRANS_COPY_MENU.get ( __app );
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
    return DESEA_IMPRIMIR_TRANS_COPY_MENU.exec ( __app );
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
