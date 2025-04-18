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
public class TRANSFER_MSG_PKT
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
  public TRANSFER_MSG_PKT ( )
  {
    super ( "TRANSFER_MSG_PKT" );

    this.setEvents ( );
  }


  /**
   *
   */
  public TRANSFER_MSG_PKT ( String packetTitle )
  {
    super ( packetTitle );

    this.setEvents ( );
  }


  /**
   *
   */
  public TRANSFER_MSG_PKT ( MDIFrame pFrame )
  {
    super ( "TRANSFER_MSG_PKT", pFrame );

    this.setEvents ( );
  }


  /**
   *
   */
  public void createComponents ( )
  {
    this.createComponents ( new TRANSFER_MSG_RP ( ) );
    this.setLegendText ( LegendRegistry.get ( "30000" ) );
  }



  // -------------------------------------------------------------------
  // ----------   Static Invocation   ----------------------------------

  /**
   *
   */
  public static TRANSFER_MSG_PKT get ( RallyApplication __app )
  {
    return ( TRANSFER_MSG_PKT ) __app.getNewInstance ( "TRANSFER_MSG_PKT" );
  }


  /**
   *
   */
  public static IRegisteredObject exec ( RallyApplication __app, String mailTo )
  {
    TRANSFER_MSG_PKT fSheet = TRANSFER_MSG_PKT.get ( __app );
    fSheet.execute ( null );
    Form form = ( Form ) fSheet.getModel ( );
    int iMode = form.getInitialMode ( );
    if ( iMode == ModeStyle.PRINT || iMode == ModeStyle.WRITE )
    {
      String html = __app.getPrintHtml ( form );
      int pos = html.indexOf ( "<pre>" );
      if ( pos > -1 )
      {
        html = " " + html.substring ( pos + 5, html.indexOf ( "</pre>", pos + 1 ) ) + " ";
      }
      if ( html.length ( ) > 0 )
      {
        html = "\r\n" + mailTo + "\r\n" + "\r\n" + html;
      }
      __app.registerClientContent ( html, "mail" );
      __app.unregister ( form );
      return null;
    }
    return fSheet;
  }

  
  /**
   *
   */
  public static IRegisteredObject exec ( RallyApplication __app )
  {
    TRANSFER_MSG_PKT fSheet = TRANSFER_MSG_PKT.get ( __app );
    return fSheet;
  }

  
  /**
   *
   */
  public static IRegisteredObject exec ( RallyApplication __app, ParameterSet ps )
  {
    return TRANSFER_MSG_PKT.exec ( __app );
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
    this.formModel.setInitialMode ( ModeStyle.WRITE );
    this.formModel.setMode ( ModeStyle.WRITE );
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

  }
}
