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
public class _RECLA_NOTI_MENU
     extends MenuActions
{
  // -------------------------------------------------------------------
  // ----------   Constructor   ----------------------------------------

  /**
   *
   */
  public _RECLA_NOTI_MENU ( IExecutable actionExecutor )
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

    action = new MenuAction ( "DSS-108 NOTIFICACIÓN DE ENTREVISTA" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "DSS108_RECLA_ADL";
        this.actionType    = "ADL";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_RECLA_NOTI_MENU - action <DSS-108 NOTIFICACIÓN DE ENTREVISTA> invoked." );
          //CALL DSS108_RECLA_ADL - ADL
          DSS108_RECLA_ADL.exec ( app );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "DSS-171 REFERIMIENTO DE CASOS" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "DSS171_RECLA_ADL";
        this.actionType    = "ADL";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_RECLA_NOTI_MENU - action <DSS-171 REFERIMIENTO DE CASOS> invoked." );
          //CALL DSS171_RECLA_ADL - ADL
          DSS171_RECLA_ADL.exec ( app );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "DSS-172 DETERMINACIÓN RECLAMACIÓN" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "DSS172_RECLA_ADL";
        this.actionType    = "ADL";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_RECLA_NOTI_MENU - action <DSS-172 DETERMINACIÓN RECLAMACIÓN> invoked." );
          //CALL DSS172_RECLA_ADL - ADL
          DSS172_RECLA_ADL.exec ( app );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "DSS-109/724 ACCIÓN TOMADA/FACTURA AL COBRO" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "DSS109_RECLA_ADL";
        this.actionType    = "ADL";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_RECLA_NOTI_MENU - action <DSS-109/724 ACCIÓN TOMADA/FACTURA AL COBRO> invoked." );
          //CALL DSS109_RECLA_ADL - ADL
          DSS109_RECLA_ADL.exec ( app );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "COMPROMISO DE PAGO DE LA RECLAMACION" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "SC920_RECLA_ADL";
        this.actionType    = "ADL";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_RECLA_NOTI_MENU - action <COMPROMISO DE PAGO DE LA RECLAMACION> invoked." );
          //CALL SC920_RECLA_ADL - ADL
          SC920_RECLA_ADL.exec ( app );
        }
      }
    };
    this.add ( action );

    //***** BEGIN MODS BY J OLMEDA 5/18/2009 *****
    //action = new MenuAction ( "SC-1071 SEGUNDO AVISO COBRO DEUDA MENOR$200" )
    action = new MenuAction ( "SC-1071 SEGUNDO AVISO COBRO" )
    //***** END MODS BY J OLMEDA 5/18/2009 *****
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "SC1071_RECLA_ADL";
        this.actionType    = "ADL";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_RECLA_NOTI_MENU - action <SC-1071 SEGUNDO AVISO COBRO DEUDA MENOR$200> invoked." );
          //CALL SC1071_RECLA_ADL - ADL
          SC1071_RECLA_ADL.exec ( app );
        }
      }
    };
    this.add ( action );

    //***** BEGIN MODS BY J OLMEDA 5/18/2009 *****
    //action = new MenuAction ( "SC-1072 SEGUNDO AVISO COBRO DEUDA MAYOR$200" )
    action = new MenuAction ( "SC-1072 SEGUNDO AVISO COBRO" )
    //***** END MODS BY J OLMEDA 5/18/2009 *****
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "SC1072_RECLA_ADL";
        this.actionType    = "ADL";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_RECLA_NOTI_MENU - action <SC-1072 SEGUNDO AVISO COBRO DEUDA MAYOR$200> invoked." );
          //CALL SC1072_RECLA_ADL - ADL
          SC1072_RECLA_ADL.exec ( app );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "DSS-173 CONTROL REFERIDOS JUSTICIA" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "DSS173_RECLA_ADL";
        this.actionType    = "ADL";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_RECLA_NOTI_MENU - action <DSS-173 CONTROL REFERIDOS JUSTICIA> invoked." );
          //CALL DSS173_RECLA_ADL - ADL
          DSS173_RECLA_ADL.exec ( app );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "DSS-174 REFERIMIENTO DE CASO JUSTICIA" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "DSS174_RECLA_ADL";
        this.actionType    = "ADL";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_RECLA_NOTI_MENU - action <DSS-174 REFERIMIENTO DE CASO JUSTICIA> invoked." );
          //CALL DSS174_RECLA_ADL - ADL
          DSS174_RECLA_ADL.exec ( app );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "ADSEF-155 REG. CONTROL PLAN DE PAGO" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "ADSEF155_RECLA_ADL";
        this.actionType    = "ADL";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_RECLA_NOTI_MENU - action <ADSEF-155 REG. CONTROL PLAN DE PAGO> invoked." );
          //CALL ADSEF155_RECLA_ADL - ADL
          ADSEF155_RECLA_ADL.exec ( app );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "DSS-170 INFORME MENSUAL DE PROGRESO" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "DSS170_RECLA_ADL";
        this.actionType    = "ADL";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_RECLA_NOTI_MENU - action <DSS-170 INFORME MENSUAL DE PROGRESO> invoked." );
          //CALL DSS170_RECLA_ADL - ADL
          DSS170_RECLA_ADL.exec ( app );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "AE-115 INFORME MENSUAL RECLAMACIONES" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "IGNORE";
        this.actionType    = "";
        this.actionCall    = "CALL_CMD";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_RECLA_NOTI_MENU - action <AE-115 INFORME MENSUAL RECLAMACIONES> invoked." );
          //CALL_CMD IGNORE - 
          app.callCommand ( "IGNORE" );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "DSS-180 REGISTRO DE DETERMINACIONES" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "DSS180_RECLA_ADL";
        this.actionType    = "ADL";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_RECLA_NOTI_MENU - action <DSS-180 REGISTRO DE DETERMINACIONES> invoked." );
          //CALL DSS180_RECLA_ADL - ADL
          DSS180_RECLA_ADL.exec ( app );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "PAN-109 INFORME MENS. RECLAMACIONES" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "PAN109_RECLA_ADL";
        this.actionType    = "ADL";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_RECLA_NOTI_MENU - action <PAN-109 INFORME MENS. RECLAMACIONES> invoked." );
          //CALL PAN109_RECLA_ADL - ADL
          PAN109_RECLA_ADL.exec ( app );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "ADSEF-183 REGISTRO CONVENIOS SC-916" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "ADSEF183_RECLA_ADL";
        this.actionType    = "ADL";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_RECLA_NOTI_MENU - action <ADSEF-183 REGISTRO CONVENIOS SC-916> invoked." );
          //CALL ADSEF183_RECLA_ADL - ADL
          ADSEF183_RECLA_ADL.exec ( app );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "ADSEF-184 REG. NOTIFICA. SC-776.1" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "ADSEF184_RECLA_ADL";
        this.actionType    = "ADL";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_RECLA_NOTI_MENU - action <ADSEF-184 REG. NOTIFICA. SC-776.1> invoked." );
          //CALL ADSEF184_RECLA_ADL - ADL
          ADSEF184_RECLA_ADL.exec ( app );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "INFORME DE AJUSTES EN PAGO" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "AJUSTE_PAGO_ADL";
        this.actionType    = "ADL";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_RECLA_NOTI_MENU - action <INFORME DE AJUSTES EN PAGO> invoked." );
          //CALL AJUSTE_PAGO_ADL - ADL
          AJUSTE_PAGO_ADL.exec ( app );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "INFORME STATUS DE RECLAMACIONES" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "STATUS_RECL_ADL";
        this.actionType    = "ADL";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_RECLA_NOTI_MENU - action <INFORME STATUS DE RECLAMACIONES> invoked." );
          //CALL STATUS_RECL_ADL - ADL
          STATUS_RECL_ADL.exec ( app );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "DSS-165 DATOS INFORME ECONOMIA IEVS" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "IEVS_RECLA_ADL";
        this.actionType    = "ADL";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_RECLA_NOTI_MENU - action <DSS-165 DATOS INFORME ECONOMIA IEVS> invoked." );
          //CALL IEVS_RECLA_ADL - ADL
          IEVS_RECLA_ADL.exec ( app );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "INFORME FECHAS VENCE RECLAMACIONES" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "INF_FECHA_VENCE_RECLA_INIT_ADL";
        this.actionType    = "ADL";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_RECLA_NOTI_MENU - action <INFORME FECHAS VENCE RECLAMACIONES> invoked." );
          //CALL INF_FECHA_VENCE_RECLA_INIT_ADL - ADL
          INF_FECHA_VENCE_RECLA_INIT_ADL.exec ( app );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "PSE-10 INF. MENS. DE RECLAMACIONES" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "IGNORE";
        this.actionType    = "";
        this.actionCall    = "CALL_CMD";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_RECLA_NOTI_MENU - action <PSE-10 INF. MENS. DE RECLAMACIONES> invoked." );
          //CALL_CMD IGNORE - 
          app.callCommand ( "IGNORE" );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "REGISTRO DE PAGOS" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "REGPAG_SECURE_ADL";
        this.actionType    = "ADL";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_RECLA_NOTI_MENU - action <REGISTRO DE PAGOS> invoked." );
          //CALL REGPAG_SECURE_ADL - ADL
          REGPAG_SECURE_ADL.exec ( app );
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
          Debug.println ( Debug.TRACE, "_RECLA_NOTI_MENU - action <SALIR> invoked." );
          //CALL_CMD FINISH ACTION - 
          app.callCommand ( "FINISH ACTION" );
        }
      }
    };
    this.add ( action );
  }
}
