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
public class PREP_PADRASTRO_PKT
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
  public PREP_PADRASTRO_PKT ( )
  {
    super ( "PREP_PADRASTRO_PKT" );

    this.setEvents ( );
  }


  /**
   *
   */
  public PREP_PADRASTRO_PKT ( String packetTitle )
  {
    super ( packetTitle );

    this.setEvents ( );
  }


  /**
   *
   */
  public PREP_PADRASTRO_PKT ( MDIFrame pFrame )
  {
    super ( "PREP_PADRASTRO_PKT", pFrame );

    this.setEvents ( );
  }


  /**
   *
   */
  public void createComponents ( )
  {
    this.createComponents ( new PREP_PADRASTRO_FR ( ) );
    this.setLegendText ( LegendRegistry.get ( "30000" ) );
  }



  // -------------------------------------------------------------------
  // ----------   Static Invocation   ----------------------------------

  /**
   *
   */
  public static PREP_PADRASTRO_PKT get ( RallyApplication __app )
  {
    return ( PREP_PADRASTRO_PKT ) __app.getNewInstance ( "PREP_PADRASTRO_PKT" );
  }


  /**
   *
   */
  public static IRegisteredObject exec ( RallyApplication __app )
  {
    PREP_PADRASTRO_PKT fSheet = PREP_PADRASTRO_PKT.get ( __app );
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
    return PREP_PADRASTRO_PKT.exec ( __app );
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
    this.formModel.setInitialMode ( ModeStyle.PRINT );
    this.formModel.setMode ( ModeStyle.PRINT );
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
        app.errorFlag = true; PREP_PADRASTRO_ADL.exec ( app ); return app.errorFlag;
      }
    } );
  }
}
