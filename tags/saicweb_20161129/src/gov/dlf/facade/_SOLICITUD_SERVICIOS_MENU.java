package gov.dlf.facade;


import gov.dlf.external.*;
import gov.dlf.logic.*;
import gov.dlf.presentation.*;


import java.awt.event.ActionEvent;

import net.maintrend.appmanager.*;
import net.maintrend.interfaces.*;
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
public class _SOLICITUD_SERVICIOS_MENU
     extends MenuActions
{
  // -------------------------------------------------------------------
  // ----------   Constructor   ----------------------------------------

  /**
   *
   */
  public _SOLICITUD_SERVICIOS_MENU ( IExecutable actionExecutor )
  {
    super ( actionExecutor );
    this.initActions ( );
  }


  /**
   *
   */
  public void initActions ( )
  {
    MDIAction action;

    action = new MenuAction ( "SOLICITUD DE SERVICIOS" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "APERTURA_DE_CASO_ADL";
        this.actionType    = "ADL";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_SAIC_MENU - action <SOLICITUD DE SERVICIOS> invoked." );
          //CALL APERTURA_DE_CASO_ADL - ADL
          APERTURA_DE_CASO_ADL.exec ( app );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "SOLICITUDES SIBIF" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "CHECK_SOLIC_EXT_PKT";
        this.actionType    = "Form/Report Packet";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_REFERIDO_ESFUERZO_COMPENSADO_MENU - action <LISTADO DE RECHAZOS> invoked." );
          //CALL ESFU_RECHAZOS_ADL - ADL
          CHECK_SOLIC_EXT_PKT.exec ( app );
        }
      }
    };
    this.add ( action );



    action = new MenuAction ( "SALIR" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "FINISH ACTION";
        this.actionType    = "";
        this.actionCall    = "CALL_CMD";
      }


      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_SAIC_MENU - action <SALIR> invoked." );
          //CALL_CMD FINISH ACTION -
          app.callCommand ( "FINISH ACTION" );
        }
      }
    };
    this.add ( action );
  }
}
