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
public class _MAIN_MENU_6
     extends MenuActions
{
  // -------------------------------------------------------------------
  // ----------   Constructor   ----------------------------------------

  /**
   *
   */
  public _MAIN_MENU_6 ( IExecutable actionExecutor )
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

/*    action = new MenuAction ( "CLIENTES PARA ENTREV.DE. INTAKE Y MANT." )
    {
      *//**  *//*
      public static final long serialVersionUID = 0L;
      *//**  *//*
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "REPORT_6_1_FR_PKT";
        this.actionType    = "Form/Report Packet";
        this.actionCall    = "CALL";
      }

      *//**  *//*
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_MAIN_MENU_6 - action <CLIENTES PARA ENTREV.DE. INTAKE Y MANT.> invoked." );
          //CALL REPORT_6_1_FR_PKT - Form/Report Packet
          REPORT_6_1_FR_PKT.exec ( app );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "TSS DISPONIBLES PARA INTAKE" )
    {
      *//**  *//*
      public static final long serialVersionUID = 0L;
      *//**  *//*
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "REPORT_6_2_FR_PKT";
        this.actionType    = "Form/Report Packet";
        this.actionCall    = "CALL";
      }

      *//**  *//*
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_MAIN_MENU_6 - action <TSS DISPONIBLES PARA INTAKE> invoked." );
          //CALL REPORT_6_2_FR_PKT - Form/Report Packet
          REPORT_6_2_FR_PKT.exec ( app );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "TSS DISPONIBLES PARA MANTENIMIENTO" )
    {
      *//**  *//*
      public static final long serialVersionUID = 0L;
      *//**  *//*
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "REPORT_6_3_FR_PKT";
        this.actionType    = "Form/Report Packet";
        this.actionCall    = "CALL";
      }

      *//**  *//*
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_MAIN_MENU_6 - action <TSS DISPONIBLES PARA MANTENIMIENTO> invoked." );
          //CALL REPORT_6_3_FR_PKT - Form/Report Packet
          REPORT_6_3_FR_PKT.exec ( app );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "RESUMEN DE TSS  PARA INTAKE (SEMANAL)" )
    {
      *//**  *//*
      public static final long serialVersionUID = 0L;
      *//**  *//*
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "REPORT_6_4_FR_PKT";
        this.actionType    = "Form/Report Packet";
        this.actionCall    = "CALL";
      }

      *//**  *//*
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_MAIN_MENU_6 - action <RESUMEN DE TSS  PARA INTAKE (SEMANAL)> invoked." );
          //CALL REPORT_6_4_FR_PKT - Form/Report Packet
          REPORT_6_4_FR_PKT.exec ( app );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "RESUMEN DE TSS PARA MANTENIMIENTO (SEM.)" )
    {
      *//**  *//*
      public static final long serialVersionUID = 0L;
      *//**  *//*
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "REPORT_6_5_FR_PKT";
        this.actionType    = "Form/Report Packet";
        this.actionCall    = "CALL";
      }

      *//**  *//*
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_MAIN_MENU_6 - action <RESUMEN DE TSS PARA MANTENIMIENTO (SEM.)> invoked." );
          //CALL REPORT_6_5_FR_PKT - Form/Report Packet
          REPORT_6_5_FR_PKT.exec ( app );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "ACTIVIDADES CALENDARIZADAS DE TSS" )
    {
      *//**  *//*
      public static final long serialVersionUID = 0L;
      *//**  *//*
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "REPORT_6_6_FR_PKT";
        this.actionType    = "Form/Report Packet";
        this.actionCall    = "CALL";
      }

      *//**  *//*
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_MAIN_MENU_6 - action <ACTIVIDADES CALENDARIZADAS DE TSS> invoked." );
          //CALL REPORT_6_6_FR_PKT - Form/Report Packet
          REPORT_6_6_FR_PKT.exec ( app );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "ACTIVIDADES PASADAS DE FECHA" )
    {
      *//**  *//*
      public static final long serialVersionUID = 0L;
      *//**  *//*
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "IGNORE";
        this.actionType    = "";
        this.actionCall    = "CALL_CMD";
      }

      *//**  *//*
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_MAIN_MENU_6 - action <ACTIVIDADES PASADAS DE FECHA> invoked." );
          //CALL_CMD IGNORE - 
          app.callCommand ( "IGNORE" );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "RECERTIF. PAN & AE PASADAS DE FECHA" )
    {
      *//**  *//*
      public static final long serialVersionUID = 0L;
      *//**  *//*
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "IGNORE";
        this.actionType    = "";
        this.actionCall    = "CALL_CMD";
      }

      *//**  *//*
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_MAIN_MENU_6 - action <RECERTIF. PAN & AE PASADAS DE FECHA> invoked." );
          //CALL_CMD IGNORE - 
          app.callCommand ( "IGNORE" );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "MEDIDA DE FUNCIONAMIENTO DEL TECNICO" )
    {
      *//**  *//*
      public static final long serialVersionUID = 0L;
      *//**  *//*
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "IGNORE";
        this.actionType    = "";
        this.actionCall    = "CALL_CMD";
      }

      *//**  *//*
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_MAIN_MENU_6 - action <MEDIDA DE FUNCIONAMIENTO DEL TECNICO> invoked." );
          //CALL_CMD IGNORE - 
          app.callCommand ( "IGNORE" );
        }
      }
    };
    this.add ( action );
*/
    
    action = new MenuAction ( "REPORTE DE CITAS" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        //this.actionCommand = "CHAMA_CALENDARIO_ADL";
        //this.actionType    = "ADL";
        //this.actionCall    = "CALL";
        //this.actionCommand = "SIBIF_CAL_GET_CITAS_FOR_TSS_PRE_PKT";
        this.actionCommand = "TSS_PRINT_CITAS_PRE_PKT";
        this.actionType    = "Form/Report Packet";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          //.Debug.println ( Debug.TRACE, "_SAIC_MENU - action <CALENDARIO DEL TECNICO> invoked." );
          ////CALL CHAMA_CALENDARIO_ADL - ADL
          //CHAMA_CALENDARIO_ADL.exec ( app );
          Debug.println ( Debug.TRACE, "_SAIC_MENU - action <REPORTE DE CITAS> invoked." );
          //SIBIF_CAL_GET_CITAS_FOR_TSS_PRE_PKT.exec ( app );
          TSS_PRINT_CITAS_PRE_PKT.exec ( app );
        }
      }
    };
    this.add ( action );
    
    //***** START MODS BY J. OLMEDA - 5/16/2011 *****
    action = new MenuAction ( "Hoja de Información y Referimiento" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        //this.actionCommand = "INFORMACION_REFERIMIENTO_REPORT2_RO_PKT";
        this.actionCommand = "INFOREF_CAL_GET_SSN_PKT";
        this.actionType    = "Form/Report Packet";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_MAIN_MENU_6 - action <Hoja de Información y Referimiento> invoked." );
          //CALL INFORMACION_REFERIMIENTO_REPORT_RO_PKT - Form/Report Packet
          //INFORMACION_REFERIMIENTO_REPORT2_RO_PKT.exec ( app );
          INFOREF_CAL_GET_SSN_PKT.exec( app );
        }
      }
    };
    this.add ( action );
    //***** END MODS BY J. OLMEDA - 5/16/2011 *****

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
          Debug.println ( Debug.TRACE, "_MAIN_MENU_6 - action <SALIR> invoked." );
          //CALL_CMD FINISH ACTION - 
          app.callCommand ( "FINISH ACTION" );
        }
      }
    };
    this.add ( action );
  }
}
