package gov.dlf.facade;


import gov.dlf.logic.TRANSFER_COPY_ADL;

import java.awt.event.ActionEvent;

import net.maintrend.interfaces.IExecutable;
import net.maintrend.mdi.MDIAction;
import net.maintrend.rallyengine.MenuAction;
import net.maintrend.rallyengine.MenuActions;
import net.maintrend.util.Debug;



/**
 * 
 *
 * Manual Change for SAIC-Web project. MainTrend Ltd.
 */
public class _TRANSFER_COPY_ANS_MENU
     extends MenuActions
{
  // -------------------------------------------------------------------
  // ----------   Constructor   ----------------------------------------

  /**
   *
   */
  public _TRANSFER_COPY_ANS_MENU ( IExecutable actionExecutor )
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

    action = new MenuAction ( "S" )
    {
      /**  */
      public static final long serialVersionUID = 0L;
      /**  */
      public void initAction ( )
      {
        super.initAction ( );
        this.actionCommand = "TRANSFER_COPY_ADL";
        this.actionType    = "";
        this.actionCall    = "";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_TRANSFER_COPY_ANS_MENU - action <S> invoked." );
          ( ( SAIC_DMQ_ORA_Application ) app ).ANS = "S";
          TRANSFER_COPY_ADL.exec ( app );
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
        this.actionCommand = "TRANSFER_COPY_ADL";
        this.actionType    = "";
        this.actionCall    = "";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_TRANSFER_COPY_ANS_MENU - action <N> invoked." );
          ( ( SAIC_DMQ_ORA_Application ) app ).ANS = "N";
          TRANSFER_COPY_ADL.exec ( app );
        }
      }
    };
    this.add ( action );
  }
}
