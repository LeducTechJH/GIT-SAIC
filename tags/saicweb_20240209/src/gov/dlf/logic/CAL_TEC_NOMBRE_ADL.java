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
public class CAL_TEC_NOMBRE_ADL
     extends ADL
{
  // -------------------------------------------------------------------
  // ----------   Class Attributes   -----------------------------------

  /**  */
  public static boolean staticCall = true;



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

  public double STATUS_CODE = 0;



  public DataStore TECNICO_LOV_DSD = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setSTATUS_CODE  ( RallyApplication __app, Parameter value )
  {
    ( ( CAL_TEC_NOMBRE_ADL ) __app.getADL ( CAL_TEC_NOMBRE_ADL.class ) ).STATUS_CODE = value.getDouble ( );
  }  
    


  /**  */
  public static DataStore getTECNICO_LOV_DSD  ( RallyApplication __app )
  {
    return ( ( CAL_TEC_NOMBRE_ADL ) __app.getADL ( CAL_TEC_NOMBRE_ADL.class ) ).TECNICO_LOV_DSD;
  }


  /**  */
  public static void setTECNICO_LOV_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( CAL_TEC_NOMBRE_ADL ) __app.getADL ( CAL_TEC_NOMBRE_ADL.class ) ).TECNICO_LOV_DSD = value;
  }


  /**  */
  public static void setTECNICO_LOV_DSD  ( RallyApplication __app, Object value )
  {
    ( ( CAL_TEC_NOMBRE_ADL ) __app.getADL ( CAL_TEC_NOMBRE_ADL.class ) ).TECNICO_LOV_DSD = ( DataStore ) value;
  }




  /**  */
  public static double getSTATUS_CODE  ( RallyApplication __app )
  {
    return ( ( CAL_TEC_NOMBRE_ADL ) __app.getADL ( CAL_TEC_NOMBRE_ADL.class ) ).STATUS_CODE;
  }


  /**  */
  public static Double getSTATUS_CODEDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CAL_TEC_NOMBRE_ADL ) __app.getADL ( CAL_TEC_NOMBRE_ADL.class ) ).STATUS_CODE );
  }


  /**  */
  public static void setSTATUS_CODE  ( RallyApplication __app, double value )
  {
    ( ( CAL_TEC_NOMBRE_ADL ) __app.getADL ( CAL_TEC_NOMBRE_ADL.class ) ).STATUS_CODE = value;
  }


  /**  */
  public static void setSTATUS_CODE  ( RallyApplication __app, Object value )
  {
    ( ( CAL_TEC_NOMBRE_ADL ) __app.getADL ( CAL_TEC_NOMBRE_ADL.class ) ).STATUS_CODE = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static CAL_TEC_NOMBRE_ADL get ( RallyApplication __app )
  {
    CAL_TEC_NOMBRE_ADL adl = new CAL_TEC_NOMBRE_ADL ( );
    __app.register ( adl, "CAL_TEC_NOMBRE_ADL" );
    __app.setADL ( CAL_TEC_NOMBRE_ADL.class, adl ); 
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
    CAL_TEC_NOMBRE_ADL.get ( __app ).process ( ps );
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
    CAL_TEC_NOMBRE_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "CAL_TEC_NOMBRE_ADL" );
    if ( rObj != null && rObj instanceof CAL_TEC_NOMBRE_ADL )
    {
      this.app.setADL ( CAL_TEC_NOMBRE_ADL.class, ( CAL_TEC_NOMBRE_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "CAL_TEC_NOMBRE_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "CAL_TEC_NOMBRE_ADL ended" );
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

    STATUS_CODE  = this.dm.reset ( CHAMA_CALENDARIO_ADL.getTEC_ID ( this.app ) );

    this.dm.setField ( this.dm.get ( "TECNICO_LOV_DSD" ), "ID_TECNICO", this.app.form ( "CAL_TECNICO_FRM" ).getDoubleItem ( "ID_TECNICO" ));

    STATUS_CODE  = this.dm.limitQueryFromBuffer ( CHAMA_CALENDARIO_ADL.getTEC_ID ( this.app ) );
    STATUS_CODE  = this.dm.retrieve ( CHAMA_CALENDARIO_ADL.getTEC_ID ( this.app ) );

    STATUS_CODE  = this.dm.firstRow ( CHAMA_CALENDARIO_ADL.getTEC_ID ( this.app ) );

    if ( Compare.equals ( STATUS_CODE, 0 ) ) 
    {
      this.app.form ( "CAL_TECNICO_FRM" ).setItem ( "NOMBRE_TECNICO", this.dm.getFieldString ( this.dm.get ( "TECNICO_LOV_DSD" ), "DSC_NOMBRE" ) + " " + this.dm.getFieldString ( this.dm.get ( "TECNICO_LOV_DSD" ), "DSC_INICIAL" ) + " " + this.dm.getFieldString ( this.dm.get ( "TECNICO_LOV_DSD" ), "DSC_APELLIDO_PATERNO" ) + " " + this.dm.getFieldString ( this.dm.get ( "TECNICO_LOV_DSD" ), "DSC_APELLIDO_MATERNO" )  );
    }
    else
    {
      this.app.form ( "CAL_TECNICO_FRM" ).setItem ( "NOMBRE_TECNICO", "********" + StringService.toStringValue  ( this.app.form ( "CAL_TECNICO_FRM" ).getDoubleItem ( "ID_TECNICO" )) + "***"  );
    }

  }
}



/* ---------------------------------------------------------------------


     
PROCEDURE CAL_TEC_NOMBRE_ADL;

var     TEC_ID  :       number(9,0) IMPORT CHAMA_CALENDARIO_ADL.TEC_ID;
        STATUS_CODE :   number(9,0);

begin
SET_TRACE();
{ID_TECNICO_GBL := CAL_TECNICO_FRM.ID_TECNICO;}

        db_reset(TEC_ID,STATUS_CODE);
        TECNICO_LOV_DSD.ID_TECNICO := CAL_TECNICO_FRM.ID_TECNICO;
        db_query(TEC_ID,STATUS_CODE);
        db_get_first(TEC_ID,STATUS_CODE);
        if STATUS_CODE=0
        then    
                begin
        CAL_TECNICO_FRM.NOMBRE_TECNICO :=TECNICO_LOV_DSD.dsc_nombre || ' ' ||
                                TECNICO_LOV_DSD.dsc_inicial || ' ' ||
                                TECNICO_LOV_DSD.dsc_apellido_paterno || ' ' ||
                                TECNICO_LOV_DSD.dsc_apellido_materno;
                end;
        else
        CAL_TECNICO_FRM.NOMBRE_TECNICO :='********' || 
                TO_CHAR(CAL_TECNICO_FRM.ID_TECNICO) || '***';
        {end-if}
SET_NOTRACE();
end;
    



--------------------------------------------------------------------- */
