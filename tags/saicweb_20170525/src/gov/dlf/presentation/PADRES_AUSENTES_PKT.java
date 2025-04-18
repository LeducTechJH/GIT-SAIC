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
public class PADRES_AUSENTES_PKT
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
  public PADRES_AUSENTES_PKT ( )
  {
    super ( "PADRES_AUSENTES_PKT" );

    this.setEvents ( );
  }


  /**
   *
   */
  public PADRES_AUSENTES_PKT ( String packetTitle )
  {
    super ( packetTitle );

    this.setEvents ( );
  }


  /**
   *
   */
  public PADRES_AUSENTES_PKT ( MDIFrame pFrame )
  {
    super ( "PADRES_AUSENTES_PKT", pFrame );

    this.setEvents ( );
  }


  /**
   *
   */
  public void createComponents ( )
  {
    this.createComponents ( new PADRES_AUSENTES_FRM ( ) );
    this.setLegendText ( LegendRegistry.get ( "30000" ) );
  }



  // -------------------------------------------------------------------
  // ----------   Static Invocation   ----------------------------------

  /**
   *
   */
  public static PADRES_AUSENTES_PKT get ( RallyApplication __app )
  {
    return ( PADRES_AUSENTES_PKT ) __app.getNewInstance ( "PADRES_AUSENTES_PKT" );
  }


  /**
   *
   */
  public static IRegisteredObject exec ( RallyApplication __app )
  {
    PADRES_AUSENTES_PKT fSheet = PADRES_AUSENTES_PKT.get ( __app );
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
    return PADRES_AUSENTES_PKT.exec ( __app );
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
        return true;
      }
    } );
    this.formModel.setListener ( JDataPanelListener.BEFOREQUIT, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; BF_QUIT_PERS_ENCARGADA_ADL.exec ( app ); return app.errorFlag;
      }
    } );
  }
}
