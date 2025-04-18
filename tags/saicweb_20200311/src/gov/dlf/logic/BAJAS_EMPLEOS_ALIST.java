package gov.dlf.logic;


import net.maintrend.interlink.*;
import net.maintrend.rallyengine.*;



/**
 * 
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class BAJAS_EMPLEOS_ALIST 
     extends RallyEngineObject 
{
  // -------------------------------------------------------------------
  // ----------   Class Attributes   -----------------------------------

  /**  */
  protected static BAJAS_EMPLEOS_ALIST actionList = null;



  // -------------------------------------------------------------------
  // ----------   Constructors   ---------------------------------------

  /**
   *
   */
  public BAJAS_EMPLEOS_ALIST ( )
  {
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static BAJAS_EMPLEOS_ALIST get ( RallyApplication __app )
  {
    actionList = new BAJAS_EMPLEOS_ALIST ( );
    __app.register ( actionList, "BAJAS_EMPLEOS_ALIST" );
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
    BAJAS_EMPLEOS_ALIST.get ( __app ).execute ( ps );
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
    BAJAS_EMPLEOS_ALIST.exec ( __app, ps );
  }



  // -------------------------------------------------------------------
  // ----------   IRegisteredObject implementation   -------------------

  /**
   *
   */
  @Override
public void execute ( ParameterSet param )
  {
    FormSheet sheet = this.app.formSheet ( "BAJAS_EMPLEOS_PRINT_PKT" );
    String html = this.app.getPrintHtml ( sheet.getModel ( ) );
    this.app.unregister ( sheet );
    this.app.registerClientContent ( html, "printStr" );
  }
}
