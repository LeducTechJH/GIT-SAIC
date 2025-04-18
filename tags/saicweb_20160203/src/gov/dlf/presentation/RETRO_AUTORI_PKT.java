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
public class RETRO_AUTORI_PKT
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
  public RETRO_AUTORI_PKT ( )
  {
    super ( "RETRO_AUTORI_PKT" );

    this.setEvents ( );
  }


  /**
   *
   */
  public RETRO_AUTORI_PKT ( String packetTitle )
  {
    super ( packetTitle );

    this.setEvents ( );
  }


  /**
   *
   */
  public RETRO_AUTORI_PKT ( MDIFrame pFrame )
  {
    super ( "RETRO_AUTORI_PKT", pFrame );

    this.setEvents ( );
  }


  /**
   *
   */
  public void createComponents ( )
  {
    this.createComponents ( new RETRO_AUTORI_FR ( ) );
    this.setLegendText ( LegendRegistry.get ( "30000" ) );
  }



  // -------------------------------------------------------------------
  // ----------   Static Invocation   ----------------------------------

  /**
   *
   */
  public static RETRO_AUTORI_PKT get ( RallyApplication __app )
  {
    return ( RETRO_AUTORI_PKT ) __app.getNewInstance ( "RETRO_AUTORI_PKT" );
  }


  /**
   *
   */
  public static IRegisteredObject exec ( RallyApplication __app )
  {
    RETRO_AUTORI_PKT fSheet = RETRO_AUTORI_PKT.get ( __app );
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
    return RETRO_AUTORI_PKT.exec ( __app );
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
    this.formModel.setInitialMode ( ModeStyle.UPDATE );
    this.formModel.setMode ( ModeStyle.UPDATE );
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

    this.formModel.setListener ( JDataPanelListener.AFTERLOAD, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; RR_AUT_BFR_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.formModel.setListener ( JDataPanelListener.BEFOREQUIT, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; RR_AUTORI_AFR_ADL.exec ( app ); return app.errorFlag;
      }
    } );
  }
}
