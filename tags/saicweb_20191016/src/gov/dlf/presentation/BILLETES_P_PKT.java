package gov.dlf.presentation;


import gov.dlf.external.*;
import gov.dlf.logic.*;
import gov.dlf.facade.*;


import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;

import java.awt.event.ActionEvent;

import javax.swing.JScrollPane;
import javax.swing.JOptionPane;

import net.maintrend.appmanager.*;
import net.maintrend.interfaces.*;
import net.maintrend.interlink.*;
import net.maintrend.jdatapanel.*;
import net.maintrend.jdatapanel.commands.*;
import net.maintrend.jdatapanel.edit.*;
import net.maintrend.jdatapanel.swing.*;
import net.maintrend.mdi.*;
import net.maintrend.rallyengine.*;
import net.maintrend.util.*;



/**
 * 
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class BILLETES_P_PKT
     extends FormSheet
{
  // -------------------------------------------------------------------
  // ----------   Class Attributes   -----------------------------------

  /**  */
  public static final long serialVersionUID = 0L;



  // -------------------------------------------------------------------
  // ----------   Constructors and Supporting Methods   ----------------

  /**
   *
   */
  public BILLETES_P_PKT ( )
  {
    super ( "BILLETES_P_PKT" );

    this.setEvents ( );
  }


  /**
   *
   */
  public BILLETES_P_PKT ( String packetTitle )
  {
    super ( packetTitle );

    this.setEvents ( );
  }


  /**
   *
   */
  public BILLETES_P_PKT ( MDIFrame pFrame )
  {
    super ( "BILLETES_P_PKT", pFrame );

    this.setEvents ( );
  }


  /**
   *
   */
  public void createComponents ( )
  {
    this.createComponents ( new COMPUTO_BILLETES_FR ( ) );
    this.setLegendText ( LegendRegistry.get ( "30000" ) );
  }



  // -------------------------------------------------------------------
  // ----------   Static Invocation   ----------------------------------

  /**
   *
   */
  public static BILLETES_P_PKT get ( RallyApplication __app )
  {
    return ( BILLETES_P_PKT ) __app.getNewInstance ( "BILLETES_P_PKT" );
  }


  /**
   *
   */
  public static IRegisteredObject exec ( RallyApplication __app )
  {
    BILLETES_P_PKT fSheet = BILLETES_P_PKT.get ( __app );
    fSheet.execute ( null );
    Form form = ( Form ) fSheet.getModel ( );
    int iMode = form.getInitialMode ( );
    if ( iMode == ModeStyle.PRINT || iMode == ModeStyle.WRITE )
    {
      String html = __app.getPrintHtml ( form );
      __app.registerClientContent ( html, "printStr" );
      __app.unregister ( form );
      return null;
    }
    return fSheet;
  }


  /**
   *
   */
  public static IRegisteredObject exec ( RallyApplication __app, ParameterSet ps )
  {
    return BILLETES_P_PKT.exec ( __app );
  }



  // -------------------------------------------------------------------
  // -----------   Actions Support   -----------------------------------

  /**
   *
   */
  public boolean performAction ( String actionName, ActionEvent e )
  {
    return super.performAction ( actionName, e );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   *
   */
  public void open ( )
  {
    super.open ( );
    this.formModel.setInitialMode ( ModeStyle.READONLY );
    this.formModel.setMode ( ModeStyle.READONLY );
    this.formModel.build ( );
    this.notifyListener ( JDataPanelListener.AFTERLOAD );
  }



  // -------------------------------------------------------------------
  // ----------   Action Sites   ---------------------------------------

  /**
   *
   */
  public void setEvents ( )
  {

    /*this.formModel.setListener ( JDataPanelListener.AFTEREXIT, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; app.callCommand ( "QUIT ACTION" ); return app.errorFlag;
      }
    } );*/
  }
}
