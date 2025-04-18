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
public class _COMP_NUCLEO_DETER_MENU
     extends MenuActions
{
  // -------------------------------------------------------------------
  // ----------   Constructor   ----------------------------------------

  /**
   *
   */
  public _COMP_NUCLEO_DETER_MENU ( IExecutable actionExecutor )
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

    action = new MenuAction ( "C" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "CALL_COMP_FAM_ADL";
        this.actionType    = "ADL";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_COMP_NUCLEO_DETER_MENU - action <C> invoked." );
          //CALL CALL_COMP_FAM_ADL - ADL
          CALL_COMP_FAM_ADL.exec ( app );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "N" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "CALL_NUCLEO_SERV_ADL";
        this.actionType    = "ADL";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_COMP_NUCLEO_DETER_MENU - action <N> invoked." );
          //CALL CALL_NUCLEO_SERV_ADL - ADL
          CALL_NUCLEO_SERV_ADL.exec ( app );
        }
      }
    };
    this.add ( action );

    action = new MenuAction ( "D" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "DETERMINACION_ELEGIBILIDAD_NO_UPD_ADL";
        this.actionType    = "ADL";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_COMP_NUCLEO_DETER_MENU - action <D> invoked." );
          //CALL DETERMINACION_ELEGIBILIDAD_NO_UPD_ADL - ADL
          DETERMINACION_ELEGIBILIDAD_NO_UPD_ADL.exec ( app );
        }
      }
    };
    this.add ( action );
  }
}
