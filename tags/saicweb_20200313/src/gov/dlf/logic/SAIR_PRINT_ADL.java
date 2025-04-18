package gov.dlf.logic;


import gov.dlf.facade.*;
import net.maintrend.interfaces.*;
import net.maintrend.interlink.*;
import net.maintrend.rallyengine.*;
import net.maintrend.util.*;



/**
 * __Comment
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class SAIR_PRINT_ADL
     extends ADL
{
  // -------------------------------------------------------------------
  // ----------   Class Attributes   -----------------------------------

  /**  */
  public static boolean staticCall = false;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes   --------------------------------

  /**  */
  public SAIC_DMQ_ORA_Application app;
  /**  */
  public RallyDataManager dm = null;



  // -------------------------------------------------------------------
  // ----------   Instance Condition Attributes   ----------------------

 

  // -------------------------------------------------------------------
  // ----------   Instance Export Attributes   -------------------------



  public String OLD_COMMAND = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setOLD_COMMAND  ( RallyApplication __app, Parameter value )
  {
    ( ( SAIR_PRINT_ADL ) __app.getADL ( SAIR_PRINT_ADL.class ) ).OLD_COMMAND = value.getString ( );
  }  
    


  /**  */
  public static String getOLD_COMMAND  ( RallyApplication __app )
  {
    return ( ( SAIR_PRINT_ADL ) __app.getADL ( SAIR_PRINT_ADL.class ) ).OLD_COMMAND;
  }


  /**  */
  public static void setOLD_COMMAND  ( RallyApplication __app, String value )
  {
    ( ( SAIR_PRINT_ADL ) __app.getADL ( SAIR_PRINT_ADL.class ) ).OLD_COMMAND = value;
  }


  /**  */
  public static void setOLD_COMMAND  ( RallyApplication __app, Object value )
  {
    ( ( SAIR_PRINT_ADL ) __app.getADL ( SAIR_PRINT_ADL.class ) ).OLD_COMMAND = ( String ) value;
  }





  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static SAIR_PRINT_ADL get ( RallyApplication __app )
  {
    SAIR_PRINT_ADL adl = new SAIR_PRINT_ADL ( );
    __app.register ( adl, "SAIR_PRINT_ADL" );
    __app.setADL ( SAIR_PRINT_ADL.class, adl ); 
    adl.setApplication ( __app );
    return adl;
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
    SAIR_PRINT_ADL.get ( __app ).process ( ps );
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
    SAIR_PRINT_ADL.exec ( __app, ps );
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param __app
   */
  @Override
public void setApplication ( RallyApplication __app )
  {
    this.app = ( SAIC_DMQ_ORA_Application ) __app;
    if ( this.app != null )
    {
      this.dm = ( RallyDataManager ) this.app.getDataManager ( );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param parms
   */
  @Override
public void execute ( ParameterSet parms )
  {
    this.process ( parms );
  }




  /**
   *
   */
  protected void doReturn ( )
  {
    this.unregister ( );
  }


  /**
   *
   */
  public void unregister ( )
  {
    this.app.unregister ( this );
    IRegisteredObject rObj = this.app.get ( "SAIR_PRINT_ADL" );
    if ( rObj != null && rObj instanceof SAIR_PRINT_ADL )
    {
      this.app.setADL ( SAIR_PRINT_ADL.class, ( SAIR_PRINT_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  @Override
protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "SAIR_PRINT_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "SAIR_PRINT_ADL ended" );
        this.unregister ( );
        break;
      }
    }
    if ( this.currentStep > 0 ) this.app.goOn ( );
  }



  /**
   *
   */
  protected void step0 ( ParameterSet ps )
  {

    OLD_COMMAND = this.app.COMANDO_DCL_GBL;
    this.app.COMANDO_DCL_GBL = "@SAIC$APPL_COM:PRINT_132.COM";

    this.callParms.clear ( );
    ( ( SAIR_ALIST ) this.app.getNewInstance ( "SAIR_ALIST" ) ).execute ( this.callParms );

    this.app.COMANDO_DCL_GBL = OLD_COMMAND;

  }
}



/* ---------------------------------------------------------------------


     

VAR
    OLD_COMMAND  : CHAR;

BEGIN

   OLD_COMMAND := COMANDO_DCL_GBL;
   COMANDO_DCL_GBL := '@SAIC$APPL_COM:PRINT_132.COM';
   CALL SAIR_ALIST;
   COMANDO_DCL_GBL :=  OLD_COMMAND;

END;

    



--------------------------------------------------------------------- */
