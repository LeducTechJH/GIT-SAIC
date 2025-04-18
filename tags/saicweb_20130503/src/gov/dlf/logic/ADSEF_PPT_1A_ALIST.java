package gov.dlf.logic;


import gov.dlf.facade.*;
import gov.dlf.external.*;
import gov.dlf.presentation.*;

import net.maintrend.util.format.*;


import java.awt.event.ActionEvent;

import net.maintrend.appmanager.*;
import net.maintrend.interfaces.*;
import net.maintrend.interlink.*;
import net.maintrend.mdi.*;
import net.maintrend.rallyengine.*;
import net.maintrend.rallyengine.appcommands.*;



/**
 * 
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class ADSEF_PPT_1A_ALIST 
     extends RallyEngineObject 
{
  // -------------------------------------------------------------------
  // ----------   Class Attributes   -----------------------------------

  /**  */
  protected static ADSEF_PPT_1A_ALIST actionList = null;



  // -------------------------------------------------------------------
  // ----------   Constructors   ---------------------------------------

  /**
   *
   */
  public ADSEF_PPT_1A_ALIST ( )
  {
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static ADSEF_PPT_1A_ALIST get ( RallyApplication __app )
  {
    actionList = new ADSEF_PPT_1A_ALIST ( );
    __app.register ( actionList, "ADSEF_PPT_1A_ALIST" );
    actionList.setApplication ( __app );
    return actionList;
  }


  /**
   *
   * @param __app
   * @param ps
   *
   * @return
   */
  public static void exec ( RallyApplication __app, ParameterSet ps )
  {
    ADSEF_PPT_1A_ALIST.get ( __app ).execute ( ps );
    __app.unregister ( actionList );
  }


  /**
   *
   * @param __app
   *
   * @return
   */
  public static void exec ( RallyApplication __app )
  {
    ParameterSet ps = null;
    ADSEF_PPT_1A_ALIST.exec ( __app, ps );
  }



  // -------------------------------------------------------------------
  // ----------   IRegisteredObject implementation   -------------------

  /**
   *
   */
  public void execute ( ParameterSet param )
  {
    FormSheet sheet = this.app.formSheet ( "ADSEF_PPT_1A_PRINT_PKT" );
    String html = this.app.getPrintHtml ( ( Form ) sheet.getModel ( ) );
    this.app.unregister ( sheet );
    this.app.registerClientContent ( html, "printStr" );
  }
}
