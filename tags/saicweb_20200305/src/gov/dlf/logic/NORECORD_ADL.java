package gov.dlf.logic;


import gov.dlf.facade.*;
import gov.dlf.presentation.*;


import net.maintrend.interfaces.*;
import net.maintrend.interlink.*;
import net.maintrend.jdatapanel.JDataPanelGroupInstanceList;
import net.maintrend.rallyengine.*;
import net.maintrend.util.*;



/**
 * __Comment
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class NORECORD_ADL
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
 
  public boolean _condition0 = false;
 
  public boolean _condition1 = false;

 

  // -------------------------------------------------------------------
  // ----------   Instance Export Attributes   -------------------------





  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------
    




  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static NORECORD_ADL get ( RallyApplication __app )
  {
    NORECORD_ADL adl = new NORECORD_ADL ( );
    __app.register ( adl, "NORECORD_ADL" );
    __app.setADL ( NORECORD_ADL.class, adl ); 
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
    NORECORD_ADL.get ( __app ).process ( ps );
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
    NORECORD_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "NORECORD_ADL" );
    if ( rObj != null && rObj instanceof NORECORD_ADL )
    {
      this.app.setADL ( NORECORD_ADL.class, ( NORECORD_ADL ) rObj );
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
    Debug.println ( Debug.TRACE, "NORECORD_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "NORECORD_ADL ended" );
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
    JDataPanelGroupInstanceList jplg = this.app.form ( "TRANSFER_COPY_FR" ).getGroupInstanceList ( "TRANSFER_COPY_GP" );
    if ( jplg != null && jplg.size ( ) > 0 )    
    {
      this._condition0 = true;
    }
    else
    {
      this._condition0 = false;
    }
    if ( this._condition0 )
    {
      Form form = this.app.form ( "TRANSFER_COPY_FR" );
      ( ( TRANSFER_COPY_FR ) form ).showNoRecordsSign = true;       
      
    //  this.app.callCommand ( RallyAppCommandFactory.FNEXT );
      this.app.browseToField ( "TRANSFER_COPY_FR", "DUMMY" );
      return;
    }

  }


  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {
    if ( this._condition0 )    //    if ( Compare.gt ( this.app.form ( "TRANSFER_COPY_FR" ).getDoubleItem ( "COUNTER" ), 0 ) ) 
    {
      if ( Compare.equals ( this.app.ANSWER_GBL, " " ) ) 
      {
        this._condition1 = true;
      }
      else
      {
        this._condition1 = false;
      }
      if ( this._condition1 )
      {
       //  DESEA_IMPRIMIR_TRANS_COPY_MENU.exec ( this.app );
        return;
      }
    }

  }
}



/* ---------------------------------------------------------------------


     
BEGIN
        IF (TRANSFER_COPY_FR.COUNTER > 0)
        THEN
                BEGIN
                 CALL_CMD('NEXT GROUP');
                 IF  (ANSWER_GBL = ' ') THEN
                        CALL DESEA_IMPRIMIR_TRANS_COPY_MENU;
                END;
        
END;
    



--------------------------------------------------------------------- */
