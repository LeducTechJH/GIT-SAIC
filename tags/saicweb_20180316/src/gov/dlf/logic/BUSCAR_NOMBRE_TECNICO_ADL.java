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
public class BUSCAR_NOMBRE_TECNICO_ADL
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

  public double TSS_ID = 0;

  public double TSS_TABLE = 0;

  public double TSS_STATUS = 0;



  public String NOMBRE = null;

  public DataStore LOV_TECNICO_DSD = null;



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setTSS_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( BUSCAR_NOMBRE_TECNICO_ADL ) __app.getADL ( BUSCAR_NOMBRE_TECNICO_ADL.class ) ).TSS_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setNOMBRE  ( RallyApplication __app, Parameter value )
  {
    ( ( BUSCAR_NOMBRE_TECNICO_ADL ) __app.getADL ( BUSCAR_NOMBRE_TECNICO_ADL.class ) ).NOMBRE = value.getString ( );
  }  

  
  /**  */
  public static void setTSS_TABLE  ( RallyApplication __app, Parameter value )
  {
    ( ( BUSCAR_NOMBRE_TECNICO_ADL ) __app.getADL ( BUSCAR_NOMBRE_TECNICO_ADL.class ) ).TSS_TABLE = value.getDouble ( );
  }  

  
  /**  */
  public static void setTSS_STATUS  ( RallyApplication __app, Parameter value )
  {
    ( ( BUSCAR_NOMBRE_TECNICO_ADL ) __app.getADL ( BUSCAR_NOMBRE_TECNICO_ADL.class ) ).TSS_STATUS = value.getDouble ( );
  }  
    


  /**  */
  public static String getNOMBRE  ( RallyApplication __app )
  {
    return ( ( BUSCAR_NOMBRE_TECNICO_ADL ) __app.getADL ( BUSCAR_NOMBRE_TECNICO_ADL.class ) ).NOMBRE;
  }


  /**  */
  public static void setNOMBRE  ( RallyApplication __app, String value )
  {
    ( ( BUSCAR_NOMBRE_TECNICO_ADL ) __app.getADL ( BUSCAR_NOMBRE_TECNICO_ADL.class ) ).NOMBRE = value;
  }


  /**  */
  public static void setNOMBRE  ( RallyApplication __app, Object value )
  {
    ( ( BUSCAR_NOMBRE_TECNICO_ADL ) __app.getADL ( BUSCAR_NOMBRE_TECNICO_ADL.class ) ).NOMBRE = ( String ) value;
  }



  /**  */
  public static DataStore getLOV_TECNICO_DSD  ( RallyApplication __app )
  {
    return ( ( BUSCAR_NOMBRE_TECNICO_ADL ) __app.getADL ( BUSCAR_NOMBRE_TECNICO_ADL.class ) ).LOV_TECNICO_DSD;
  }


  /**  */
  public static void setLOV_TECNICO_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( BUSCAR_NOMBRE_TECNICO_ADL ) __app.getADL ( BUSCAR_NOMBRE_TECNICO_ADL.class ) ).LOV_TECNICO_DSD = value;
  }


  /**  */
  public static void setLOV_TECNICO_DSD  ( RallyApplication __app, Object value )
  {
    ( ( BUSCAR_NOMBRE_TECNICO_ADL ) __app.getADL ( BUSCAR_NOMBRE_TECNICO_ADL.class ) ).LOV_TECNICO_DSD = ( DataStore ) value;
  }




  /**  */
  public static double getTSS_ID  ( RallyApplication __app )
  {
    return ( ( BUSCAR_NOMBRE_TECNICO_ADL ) __app.getADL ( BUSCAR_NOMBRE_TECNICO_ADL.class ) ).TSS_ID;
  }


  /**  */
  public static Double getTSS_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( BUSCAR_NOMBRE_TECNICO_ADL ) __app.getADL ( BUSCAR_NOMBRE_TECNICO_ADL.class ) ).TSS_ID );
  }


  /**  */
  public static void setTSS_ID  ( RallyApplication __app, double value )
  {
    ( ( BUSCAR_NOMBRE_TECNICO_ADL ) __app.getADL ( BUSCAR_NOMBRE_TECNICO_ADL.class ) ).TSS_ID = value;
  }


  /**  */
  public static void setTSS_ID  ( RallyApplication __app, Object value )
  {
    ( ( BUSCAR_NOMBRE_TECNICO_ADL ) __app.getADL ( BUSCAR_NOMBRE_TECNICO_ADL.class ) ).TSS_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getTSS_TABLE  ( RallyApplication __app )
  {
    return ( ( BUSCAR_NOMBRE_TECNICO_ADL ) __app.getADL ( BUSCAR_NOMBRE_TECNICO_ADL.class ) ).TSS_TABLE;
  }


  /**  */
  public static Double getTSS_TABLEDouble ( RallyApplication __app )
  {
    return new Double ( ( ( BUSCAR_NOMBRE_TECNICO_ADL ) __app.getADL ( BUSCAR_NOMBRE_TECNICO_ADL.class ) ).TSS_TABLE );
  }


  /**  */
  public static void setTSS_TABLE  ( RallyApplication __app, double value )
  {
    ( ( BUSCAR_NOMBRE_TECNICO_ADL ) __app.getADL ( BUSCAR_NOMBRE_TECNICO_ADL.class ) ).TSS_TABLE = value;
  }


  /**  */
  public static void setTSS_TABLE  ( RallyApplication __app, Object value )
  {
    ( ( BUSCAR_NOMBRE_TECNICO_ADL ) __app.getADL ( BUSCAR_NOMBRE_TECNICO_ADL.class ) ).TSS_TABLE = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getTSS_STATUS  ( RallyApplication __app )
  {
    return ( ( BUSCAR_NOMBRE_TECNICO_ADL ) __app.getADL ( BUSCAR_NOMBRE_TECNICO_ADL.class ) ).TSS_STATUS;
  }


  /**  */
  public static Double getTSS_STATUSDouble ( RallyApplication __app )
  {
    return new Double ( ( ( BUSCAR_NOMBRE_TECNICO_ADL ) __app.getADL ( BUSCAR_NOMBRE_TECNICO_ADL.class ) ).TSS_STATUS );
  }


  /**  */
  public static void setTSS_STATUS  ( RallyApplication __app, double value )
  {
    ( ( BUSCAR_NOMBRE_TECNICO_ADL ) __app.getADL ( BUSCAR_NOMBRE_TECNICO_ADL.class ) ).TSS_STATUS = value;
  }


  /**  */
  public static void setTSS_STATUS  ( RallyApplication __app, Object value )
  {
    ( ( BUSCAR_NOMBRE_TECNICO_ADL ) __app.getADL ( BUSCAR_NOMBRE_TECNICO_ADL.class ) ).TSS_STATUS = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static BUSCAR_NOMBRE_TECNICO_ADL get ( RallyApplication __app )
  {
    BUSCAR_NOMBRE_TECNICO_ADL adl = new BUSCAR_NOMBRE_TECNICO_ADL ( );
    __app.register ( adl, "BUSCAR_NOMBRE_TECNICO_ADL" );
    __app.setADL ( BUSCAR_NOMBRE_TECNICO_ADL.class, adl ); 
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
    BUSCAR_NOMBRE_TECNICO_ADL.get ( __app ).process ( ps );
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
    BUSCAR_NOMBRE_TECNICO_ADL.exec ( __app, ps );
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
   * Populating the parameter set object with return values
   */
  protected void returnParms ( ParameterSet ps, double TSS_ID, String NOMBRE )
  {
    ps.reset ( );
    ps.set ( TSS_ID );
    ps.set ( NOMBRE );
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
    IRegisteredObject rObj = this.app.get ( "BUSCAR_NOMBRE_TECNICO_ADL" );
    if ( rObj != null && rObj instanceof BUSCAR_NOMBRE_TECNICO_ADL )
    {
      this.app.setADL ( BUSCAR_NOMBRE_TECNICO_ADL.class, ( BUSCAR_NOMBRE_TECNICO_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "BUSCAR_NOMBRE_TECNICO_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "BUSCAR_NOMBRE_TECNICO_ADL ended" );
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
    ps.reset ( );
    TSS_ID = ps.getDouble( );
    NOMBRE = ps.getString( );

    LOV_TECNICO_DSD = this.dm.create ( "LOV_TECNICO_DSD" );
    TSS_TABLE = LOV_TECNICO_DSD.getId ( );
    TSS_STATUS = RallyDataStoreException.getDefault ( );

    TSS_STATUS  = this.dm.reset ( TSS_TABLE );

    this.dm.setField ( this.dm.get ( "LOV_TECNICO_DSD" ), "ID_TECNICO", TSS_ID );

    TSS_STATUS  = this.dm.limitQueryFromBuffer ( TSS_TABLE );
    TSS_STATUS  = this.dm.retrieve ( TSS_TABLE );

    TSS_STATUS  = this.dm.firstRow ( TSS_TABLE );

    if ( Compare.equals ( TSS_STATUS, 0 ) ) 
    {
      NOMBRE = this.dm.getFieldString ( this.dm.get ( "LOV_TECNICO_DSD" ), "DSC_NOMBRE" ) + " " + this.dm.getFieldString ( this.dm.get ( "LOV_TECNICO_DSD" ), "DSC_INICIAL" ) + " " + this.dm.getFieldString ( this.dm.get ( "LOV_TECNICO_DSD" ), "DSC_APELLIDO_PATERNO" ) + " " + this.dm.getFieldString ( this.dm.get ( "LOV_TECNICO_DSD" ), "DSC_APELLIDO_MATERNO" );
    }
    else
    {
      NOMBRE = "********************************************";
    }
    TSS_STATUS  = this.dm.dbClose ( TSS_TABLE );

    this.returnParms ( ps, TSS_ID, NOMBRE );

  }
}



/* ---------------------------------------------------------------------


     
procedure buscar_nombre_tecnico_adl(var tss_id: number; var nombre: char(45););
        var     tss_table:      number(9,0);
                tss_status:     number(9,0);

begin

set_trace();
        db_open(LOV_TECNICO_DSD,tss_table,tss_status);
        db_reset(tss_table,tss_status);
        LOV_TECNICO_DSD.ID_TECNICO := tss_id;
        db_query(tss_table,tss_status);
        db_get_first(tss_table,tss_status);
        if tss_status = 0 then
                begin
                        nombre :=       LOV_TECNICO_DSD.DSC_NOMBRE || ' ' ||
                        LOV_TECNICO_DSD.DSC_INICIAL || ' ' ||
                        LOV_TECNICO_DSD.DSC_APELLIDO_PATERNO || ' ' ||
                        LOV_TECNICO_DSD.DSC_APELLIDO_MATERNO;
                    
                end;
        else
                nombre := '********************************************';
        db_close(tss_table,tss_status);
set_notrace();

end;
    



--------------------------------------------------------------------- */
