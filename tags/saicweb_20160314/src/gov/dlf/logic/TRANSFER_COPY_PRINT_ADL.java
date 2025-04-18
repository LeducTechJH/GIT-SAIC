package gov.dlf.logic;


import gov.dlf.external.*;
import gov.dlf.facade.*;
import gov.dlf.presentation.*;


import java.util.*;

import net.maintrend.appmanager.*;
import net.maintrend.datamanager.*;
import net.maintrend.interfaces.*;
import net.maintrend.interlink.*;
import net.maintrend.mdi.*;
import net.maintrend.rallyengine.*;
import net.maintrend.util.*;
import net.maintrend.util.format.*;



/**
 * __Comment
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class TRANSFER_COPY_PRINT_ADL
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

 

  // -------------------------------------------------------------------
  // ----------   Instance Export Attributes   -------------------------

  public double FAMILIA_LOC = 0;

  public double FAMILIA_LOC_STAT = 0;



  public DataStore FAMILIA_RMO_READ_DSD = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setFAMILIA_LOC  ( RallyApplication __app, Parameter value )
  {
    ( ( TRANSFER_COPY_PRINT_ADL ) __app.getADL ( TRANSFER_COPY_PRINT_ADL.class ) ).FAMILIA_LOC = value.getDouble ( );
  }  

  
  /**  */
  public static void setFAMILIA_LOC_STAT  ( RallyApplication __app, Parameter value )
  {
    ( ( TRANSFER_COPY_PRINT_ADL ) __app.getADL ( TRANSFER_COPY_PRINT_ADL.class ) ).FAMILIA_LOC_STAT = value.getDouble ( );
  }  
    


  /**  */
  public static DataStore getFAMILIA_RMO_READ_DSD  ( RallyApplication __app )
  {
    return ( ( TRANSFER_COPY_PRINT_ADL ) __app.getADL ( TRANSFER_COPY_PRINT_ADL.class ) ).FAMILIA_RMO_READ_DSD;
  }


  /**  */
  public static void setFAMILIA_RMO_READ_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( TRANSFER_COPY_PRINT_ADL ) __app.getADL ( TRANSFER_COPY_PRINT_ADL.class ) ).FAMILIA_RMO_READ_DSD = value;
  }


  /**  */
  public static void setFAMILIA_RMO_READ_DSD  ( RallyApplication __app, Object value )
  {
    ( ( TRANSFER_COPY_PRINT_ADL ) __app.getADL ( TRANSFER_COPY_PRINT_ADL.class ) ).FAMILIA_RMO_READ_DSD = ( DataStore ) value;
  }




  /**  */
  public static double getFAMILIA_LOC  ( RallyApplication __app )
  {
    return ( ( TRANSFER_COPY_PRINT_ADL ) __app.getADL ( TRANSFER_COPY_PRINT_ADL.class ) ).FAMILIA_LOC;
  }


  /**  */
  public static Double getFAMILIA_LOCDouble ( RallyApplication __app )
  {
    return new Double ( ( ( TRANSFER_COPY_PRINT_ADL ) __app.getADL ( TRANSFER_COPY_PRINT_ADL.class ) ).FAMILIA_LOC );
  }


  /**  */
  public static void setFAMILIA_LOC  ( RallyApplication __app, double value )
  {
    ( ( TRANSFER_COPY_PRINT_ADL ) __app.getADL ( TRANSFER_COPY_PRINT_ADL.class ) ).FAMILIA_LOC = value;
  }


  /**  */
  public static void setFAMILIA_LOC  ( RallyApplication __app, Object value )
  {
    ( ( TRANSFER_COPY_PRINT_ADL ) __app.getADL ( TRANSFER_COPY_PRINT_ADL.class ) ).FAMILIA_LOC = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getFAMILIA_LOC_STAT  ( RallyApplication __app )
  {
    return ( ( TRANSFER_COPY_PRINT_ADL ) __app.getADL ( TRANSFER_COPY_PRINT_ADL.class ) ).FAMILIA_LOC_STAT;
  }


  /**  */
  public static Double getFAMILIA_LOC_STATDouble ( RallyApplication __app )
  {
    return new Double ( ( ( TRANSFER_COPY_PRINT_ADL ) __app.getADL ( TRANSFER_COPY_PRINT_ADL.class ) ).FAMILIA_LOC_STAT );
  }


  /**  */
  public static void setFAMILIA_LOC_STAT  ( RallyApplication __app, double value )
  {
    ( ( TRANSFER_COPY_PRINT_ADL ) __app.getADL ( TRANSFER_COPY_PRINT_ADL.class ) ).FAMILIA_LOC_STAT = value;
  }


  /**  */
  public static void setFAMILIA_LOC_STAT  ( RallyApplication __app, Object value )
  {
    ( ( TRANSFER_COPY_PRINT_ADL ) __app.getADL ( TRANSFER_COPY_PRINT_ADL.class ) ).FAMILIA_LOC_STAT = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static TRANSFER_COPY_PRINT_ADL get ( RallyApplication __app )
  {
    TRANSFER_COPY_PRINT_ADL adl = new TRANSFER_COPY_PRINT_ADL ( );
    __app.register ( adl, "TRANSFER_COPY_PRINT_ADL" );
    __app.setADL ( TRANSFER_COPY_PRINT_ADL.class, adl ); 
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
    TRANSFER_COPY_PRINT_ADL.get ( __app ).process ( ps );
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
    TRANSFER_COPY_PRINT_ADL.exec ( __app, ps );
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param __app
   */
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
    IRegisteredObject rObj = this.app.get ( "TRANSFER_COPY_PRINT_ADL" );
    if ( rObj != null && rObj instanceof TRANSFER_COPY_PRINT_ADL )
    {
      this.app.setADL ( TRANSFER_COPY_PRINT_ADL.class, ( TRANSFER_COPY_PRINT_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "TRANSFER_COPY_PRINT_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "TRANSFER_COPY_PRINT_ADL ended" );
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

    FAMILIA_RMO_READ_DSD = this.dm.create ( "FAMILIA_RMO_READ_DSD" );
    FAMILIA_LOC = FAMILIA_RMO_READ_DSD.getId ( );
    FAMILIA_LOC_STAT = RallyDataStoreException.getDefault ( );

    FAMILIA_LOC_STAT  = this.dm.reset ( FAMILIA_LOC );

    this.dm.setField ( this.dm.get ( "FAMILIA_RMO_READ_DSD" ), "XFR_CLIENTES_RMO_COD", this.app.RMO_GBL );

    FAMILIA_LOC_STAT  = this.dm.limitQueryFromBuffer ( FAMILIA_LOC );
    FAMILIA_LOC_STAT  = this.dm.retrieve ( FAMILIA_LOC );

    FAMILIA_LOC_STAT  = this.dm.firstRow ( FAMILIA_LOC );

    if ( Compare.equals ( FAMILIA_LOC_STAT, 0 ) ) 
    {
      this._condition0 = true;
    }
    else
    {
      this._condition0 = false;
    }
    if ( this._condition0 )
    {
      this.app.printChain ( "TRANSFER_COPY_PRT_PKT", 2 );
      return;
    }

  }


  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {
    FAMILIA_LOC_STAT  = this.dm.dbClose ( FAMILIA_LOC );

    this.app.ANSWER_GBL = "S";

  }
}



/* ---------------------------------------------------------------------


     
VAR
        familia_loc:            number(9,0);
        familia_loc_stat:       number(9,0);

BEGIN
        db_open(familia_rmo_read_dsd,familia_loc,familia_loc_stat);
        db_reset(familia_loc,familia_loc_stat);
        FAMILIA_RMO_READ_DSD.XFR_CLIENTES_RMO_COD := RMO_GBL;
        db_query(familia_loc,familia_loc_stat);
        db_get_first(familia_loc,familia_loc_stat);        

        if familia_loc_stat = 0 then
                begin
                  CALL TRANSFER_COPY_PRT_PKT;
                  CALL TRANSFER_COPY_PRT_PKT;
                end;
        db_close(familia_loc,familia_loc_stat);
        ANSWER_GBL:='S';

END;
    



--------------------------------------------------------------------- */
