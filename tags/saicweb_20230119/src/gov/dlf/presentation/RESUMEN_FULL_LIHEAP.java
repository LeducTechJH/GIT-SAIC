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
public class RESUMEN_FULL_LIHEAP
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
  public RESUMEN_FULL_LIHEAP ( )
  {
    super ( "RESUMEN_FULL_LIHEAP" );

    this.setEvents ( );
  }


  /**
   *
   */
  public RESUMEN_FULL_LIHEAP ( String packetTitle )
  {
    super ( packetTitle );

    this.setEvents ( );
  }


  /**
   *
   */
  public RESUMEN_FULL_LIHEAP ( MDIFrame pFrame )
  {
    super ( "RESUMEN_FULL_LIHEAP", pFrame );

    this.setEvents ( );
  }


  /**
   *
   */
  public void createComponents ( )
  {
    this.createComponents ( new RESUMEN_SOL_LIHEAP_FRM ( ) );
    this.setLegendText ( LegendRegistry.get ( "30000" ) );
  }



  // -------------------------------------------------------------------
  // ----------   Static Invocation   ----------------------------------

  /**
   *
   */
  public static RESUMEN_FULL_LIHEAP get ( RallyApplication __app )
  {
    return ( RESUMEN_FULL_LIHEAP ) __app.getNewInstance ( "RESUMEN_FULL_LIHEAP" );
  }


  /**
   *
   */
  public static IRegisteredObject exec ( RallyApplication __app )
  {
    RESUMEN_FULL_LIHEAP fSheet = RESUMEN_FULL_LIHEAP.get ( __app );
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
    return RESUMEN_FULL_LIHEAP.exec ( __app );
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
        app.errorFlag = true; RESUMEN_FULL_VAR_LIHEAP_ADL.exec ( app ); return app.errorFlag;
      }
    } );
  }
}
