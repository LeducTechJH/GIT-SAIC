package gov.dlf.facade;



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
public class _TRANSFERENCIA_CONTINUAR_MENU
     extends MenuActions
{
  // -------------------------------------------------------------------
  // ----------   Constructor   ----------------------------------------

  /**
   *
   */
  public _TRANSFERENCIA_CONTINUAR_MENU ( IExecutable actionExecutor )
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
        this.actionCommand = "FINISH ACTION";
        this.actionType    = "";
        this.actionCall    = "CALL";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_TRANSFERENCIA_CONTINUAR_MENU - action <S> invoked." );
          ( ( SAIC_DMQ_ORA_Application ) app ).ANS = "S";
        //CALL_CMD FINISH ACTION - 
          app.callCommand ( "FINISH ACTION" );
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
        this.actionCommand = "FINISH ACTION";
        this.actionType    = "";
        this.actionCall    = "CALL_CMD";
      }

      /**  */
      public void actionPerformed ( ActionEvent e )
      {
        if ( executor != null )
        {
          Debug.println ( Debug.TRACE, "_TRANSFERENCIA_CONTINUAR_MENU - action <N> invoked." );
          ( ( SAIC_DMQ_ORA_Application ) app ).ANS = "N";
          //CALL_CMD FINISH ACTION - 
          app.callCommand ( "FINISH ACTION" );
        }
      }
    };
    this.add ( action );
  }
}
