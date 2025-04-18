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
public class CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL
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

  public double CORRECTA_ID = 0;

  public double CORRECTA_STATUS = 0;

  public double INCORRECTA_ID = 0;

  public double INCORRECTA_STATUS = 0;

  public double SERV_ID = 0;

  public double SERV_STATUS = 0;

  public double LASTKEY = 0;

  public double COUNTER = 0;

  //***** START MODS BY J. Olmeda 7/14/2009 *****
  public double DUP_BASE_INCORRECTA = 0;
  public double DUP_BASE_CORRECTA = 0;
  public double BASE_INCORRECTA_ID = 0;
  public double BASE_CORRECTA_ID = 0;
  public double STAT_CODE = 0;
  public DataStore BASE_INCORRECTA_RO_DSD = null;
  public DataStore BASE_CORRECTA_RO_DSD = null;
  //***** END MODS BY J. Olmeda 7/14/2009 *****



  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------

  
  /**  */
  public static void setCORRECTA_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).CORRECTA_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setCORRECTA_STATUS  ( RallyApplication __app, Parameter value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).CORRECTA_STATUS = value.getDouble ( );
  }  

  
  /**  */
  public static void setINCORRECTA_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).INCORRECTA_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setINCORRECTA_STATUS  ( RallyApplication __app, Parameter value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).INCORRECTA_STATUS = value.getDouble ( );
  }  

  
  /**  */
  public static void setSERV_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).SERV_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setSERV_STATUS  ( RallyApplication __app, Parameter value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).SERV_STATUS = value.getDouble ( );
  }  

  
  /**  */
  public static void setLASTKEY  ( RallyApplication __app, Parameter value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).LASTKEY = value.getDouble ( );
  }  

  
  /**  */
  public static void setCOUNTER  ( RallyApplication __app, Parameter value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).COUNTER = value.getDouble ( );
  }  
    



  /**  */
  public static double getCORRECTA_ID  ( RallyApplication __app )
  {
    return ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).CORRECTA_ID;
  }


  /**  */
  public static Double getCORRECTA_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).CORRECTA_ID );
  }


  /**  */
  public static void setCORRECTA_ID  ( RallyApplication __app, double value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).CORRECTA_ID = value;
  }


  /**  */
  public static void setCORRECTA_ID  ( RallyApplication __app, Object value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).CORRECTA_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getCORRECTA_STATUS  ( RallyApplication __app )
  {
    return ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).CORRECTA_STATUS;
  }


  /**  */
  public static Double getCORRECTA_STATUSDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).CORRECTA_STATUS );
  }


  /**  */
  public static void setCORRECTA_STATUS  ( RallyApplication __app, double value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).CORRECTA_STATUS = value;
  }


  /**  */
  public static void setCORRECTA_STATUS  ( RallyApplication __app, Object value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).CORRECTA_STATUS = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getINCORRECTA_ID  ( RallyApplication __app )
  {
    return ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).INCORRECTA_ID;
  }


  /**  */
  public static Double getINCORRECTA_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).INCORRECTA_ID );
  }


  /**  */
  public static void setINCORRECTA_ID  ( RallyApplication __app, double value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).INCORRECTA_ID = value;
  }


  /**  */
  public static void setINCORRECTA_ID  ( RallyApplication __app, Object value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).INCORRECTA_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getINCORRECTA_STATUS  ( RallyApplication __app )
  {
    return ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).INCORRECTA_STATUS;
  }


  /**  */
  public static Double getINCORRECTA_STATUSDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).INCORRECTA_STATUS );
  }


  /**  */
  public static void setINCORRECTA_STATUS  ( RallyApplication __app, double value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).INCORRECTA_STATUS = value;
  }


  /**  */
  public static void setINCORRECTA_STATUS  ( RallyApplication __app, Object value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).INCORRECTA_STATUS = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSERV_ID  ( RallyApplication __app )
  {
    return ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).SERV_ID;
  }


  /**  */
  public static Double getSERV_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).SERV_ID );
  }


  /**  */
  public static void setSERV_ID  ( RallyApplication __app, double value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).SERV_ID = value;
  }


  /**  */
  public static void setSERV_ID  ( RallyApplication __app, Object value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).SERV_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSERV_STATUS  ( RallyApplication __app )
  {
    return ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).SERV_STATUS;
  }


  /**  */
  public static Double getSERV_STATUSDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).SERV_STATUS );
  }


  /**  */
  public static void setSERV_STATUS  ( RallyApplication __app, double value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).SERV_STATUS = value;
  }


  /**  */
  public static void setSERV_STATUS  ( RallyApplication __app, Object value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).SERV_STATUS = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getLASTKEY  ( RallyApplication __app )
  {
    return ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).LASTKEY;
  }


  /**  */
  public static Double getLASTKEYDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).LASTKEY );
  }


  /**  */
  public static void setLASTKEY  ( RallyApplication __app, double value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).LASTKEY = value;
  }


  /**  */
  public static void setLASTKEY  ( RallyApplication __app, Object value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).LASTKEY = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getCOUNTER  ( RallyApplication __app )
  {
    return ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).COUNTER;
  }


  /**  */
  public static Double getCOUNTERDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).COUNTER );
  }


  /**  */
  public static void setCOUNTER  ( RallyApplication __app, double value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).COUNTER = value;
  }


  /**  */
  public static void setCOUNTER  ( RallyApplication __app, Object value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).COUNTER = ( ( Double ) value ).doubleValue ( );
  }

  //***** START MODS BY J. Olmeda 7/14/2009 *****
  public static void setSTAT_CODE  ( RallyApplication __app, Parameter value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).STAT_CODE = value.getDouble ( );
  }  
  public static void setBASE_INCORRECTA_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).BASE_INCORRECTA_ID = value.getDouble ( );
  }  
  public static double getBASE_INCORRECTA_ID  ( RallyApplication __app )
  {
    return ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).BASE_INCORRECTA_ID;
  }
  public static Double getBASE_INCORRECTA_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).BASE_INCORRECTA_ID );
  }
  public static void setBASE_INCORRECTA_ID  ( RallyApplication __app, double value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).BASE_INCORRECTA_ID = value;
  }
  public static void setBASE_INCORRECTA_ID  ( RallyApplication __app, Object value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).BASE_INCORRECTA_ID = ( ( Double ) value ).doubleValue ( );
  }
  public static double getSTAT_CODE  ( RallyApplication __app )
  {
    return ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).STAT_CODE;
  }
  public static Double getSTAT_CODEDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).STAT_CODE );
  }
  public static void setSTAT_CODE  ( RallyApplication __app, double value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).STAT_CODE = value;
  }
  public static void setSTAT_CODE  ( RallyApplication __app, Object value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).STAT_CODE = ( ( Double ) value ).doubleValue ( );
  }
  public static void setCOUNTER_APEL  ( RallyApplication __app, Parameter value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).DUP_BASE_INCORRECTA = value.getDouble ( );
  }  
  public static double getCOUNTER_APEL  ( RallyApplication __app )
  {
    return ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).DUP_BASE_INCORRECTA;
  }
  public static Double getCOUNTER_APELDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).DUP_BASE_INCORRECTA );
  }
  public static void setCOUNTER_APEL  ( RallyApplication __app, double value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).DUP_BASE_INCORRECTA = value;
  }
  public static void setCOUNTER_APEL  ( RallyApplication __app, Object value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).DUP_BASE_INCORRECTA = ( ( Double ) value ).doubleValue ( );
  }
  
  public static void setBASE_CORRECTA_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).BASE_CORRECTA_ID = value.getDouble ( );
  }  
  public static double getBASE_CORRECTA_ID  ( RallyApplication __app )
  {
    return ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).BASE_CORRECTA_ID;
  }
  public static Double getBASE_CORRECTA_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).BASE_CORRECTA_ID );
  }
  public static void setBASE_CORRECTA_ID  ( RallyApplication __app, double value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).BASE_CORRECTA_ID = value;
  }
  public static void setBASE_CORRECTA_ID  ( RallyApplication __app, Object value )
  {
    ( ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) __app.getADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class ) ).BASE_CORRECTA_ID = ( ( Double ) value ).doubleValue ( );
  }
  //***** END MODS BY J. Olmeda 7/14/2009 *****


  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL get ( RallyApplication __app )
  {
    CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL adl = new CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ( );
    __app.register ( adl, "CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL" );
    __app.setADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class, adl ); 
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
    CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.get ( __app ).process ( ps );
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
    CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL" );
    if ( rObj != null && rObj instanceof CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL )
    {
      this.app.setADL ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL.class, ( CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ) rObj );
    }
  }


  /**
   * Overrides the ancestor's method
   * 
   * @param ps
   */
  protected void process ( ParameterSet ps )
  {
    Debug.println ( Debug.TRACE, "CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "CHK_DUP_BASE_CORRECTA_INCORRECTA_ADL ended" );
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
    DUP_BASE_INCORRECTA = 0;
    DUP_BASE_CORRECTA = 0;
    if( this.app.INS_CORRECTA_INCORRECTA_GBL == "INCORRECTA" )
    {
    BASE_INCORRECTA_RO_DSD = this.dm.create ( "BASE_INCORRECTA_RO_DSD" );
    BASE_INCORRECTA_ID = BASE_INCORRECTA_RO_DSD.getId ( );
    STAT_CODE = RallyDataStoreException.getDefault ( );
    if ( ! Compare.equals ( STAT_CODE, 0 ) ) 
    {
      this.app.setError ( 1, STAT_CODE );

      STAT_CODE  = this.dm.rollBack ( );
      this.doReturn ( );
      return; 
    }
    STAT_CODE  = this.dm.reset ( BASE_INCORRECTA_ID );
    this.dm.setField ( this.dm.get ( "BASE_INCORRECTA_RO_DSD" ), "SEGURO_SOCIAL_JEFE_FAM", this.app.SS_JEFE_FAMILIA_GBL );
    this.dm.setField ( this.dm.get ( "BASE_INCORRECTA_RO_DSD" ), "SEGURO_SOCIAL_JEFE_SERV", this.app.SS_JEFE_SERVICIO_GBL );
    this.dm.setField ( this.dm.get ( "BASE_INCORRECTA_RO_DSD" ), "COD_SERVICIO", this.app.COD_SERV_GBL );
    this.dm.setField ( this.dm.get ( "BASE_INCORRECTA_RO_DSD" ), "FECHA_IDENTIFICADO", this.app.FECHA_IDENTIFICADO_GBL );
    this.dm.setField ( this.dm.get ( "BASE_INCORRECTA_RO_DSD" ), "ACCION", this.app.ACCION_GBL );
    this.dm.setField ( this.dm.get ( "BASE_INCORRECTA_RO_DSD" ), "FECHA_EMISION", this.app.form ( "DETERMINAR_RECLAMACION_FR" ).getDateItem( "FECHA_EMISION0" ));
    this.dm.setField ( this.dm.get ( "BASE_INCORRECTA_RO_DSD" ), "RMO_OFICINA", this.app.RMO_GBL );   
    this.dm.setField ( this.dm.get ( "BASE_INCORRECTA_RO_DSD" ), "FLG_EMERGENCIA", this.app.form ( "DETERMINAR_RECLAMACION_FR" ).getItem( "FLG_EMERGENCIA" ));
    STAT_CODE  = this.dm.limitQueryFromBuffer ( BASE_INCORRECTA_ID );
    STAT_CODE  = this.dm.retrieve ( BASE_INCORRECTA_ID );
    STAT_CODE  = this.dm.firstRow ( BASE_INCORRECTA_ID );
    while ( Compare.equals ( STAT_CODE, 0 ) ) 
    {
      DUP_BASE_INCORRECTA = MathService.plus ( DUP_BASE_INCORRECTA, 1  );
      STAT_CODE  = this.dm.nextRow ( BASE_INCORRECTA_ID );
    }
    STAT_CODE  = this.dm.dbClose ( BASE_INCORRECTA_ID );
    }
    else if( this.app.INS_CORRECTA_INCORRECTA_GBL == "CORRECTA" )
    { 
    BASE_CORRECTA_RO_DSD = this.dm.create ( "BASE_CORRECTA_RO_DSD" );
    BASE_CORRECTA_ID = BASE_CORRECTA_RO_DSD.getId ( );
    STAT_CODE = RallyDataStoreException.getDefault ( );
    if ( ! Compare.equals ( STAT_CODE, 0 ) ) 
    {
      this.app.setError ( 1, STAT_CODE );

      STAT_CODE  = this.dm.rollBack ( );
      this.doReturn ( );
      return; 
    }
    STAT_CODE  = this.dm.reset ( BASE_CORRECTA_ID );
    this.dm.setField ( this.dm.get ( "BASE_INCORRECTA_RO_DSD" ), "SEGURO_SOCIAL_JEFE_FAM", this.app.SS_JEFE_FAMILIA_GBL );
    this.dm.setField ( this.dm.get ( "BASE_INCORRECTA_RO_DSD" ), "SEGURO_SOCIAL_JEFE_SERV", this.app.SS_JEFE_SERVICIO_GBL );
    this.dm.setField ( this.dm.get ( "BASE_INCORRECTA_RO_DSD" ), "COD_SERVICIO", this.app.COD_SERV_GBL );
    this.dm.setField ( this.dm.get ( "BASE_INCORRECTA_RO_DSD" ), "FECHA_IDENTIFICADO", this.app.FECHA_IDENTIFICADO_GBL );
    this.dm.setField ( this.dm.get ( "BASE_INCORRECTA_RO_DSD" ), "ACCION", this.app.ACCION_GBL );
    this.dm.setField ( this.dm.get ( "BASE_CORRECTA_RO_DSD" ), "MES_ANO_BENEFICIO_CORRECTO", this.app.form ( "DETERMINAR_RECLAMACION_FR" ).getDateItem( "MES_ANO_BENEFICIO_CORRECTO" ));
    this.dm.setField ( this.dm.get ( "BASE_CORRECTA_RO_DSD" ), "RMO_OFICINA", this.app.RMO_GBL );   
    this.dm.setField ( this.dm.get ( "BASE_CORRECTA_RO_DSD" ), "FLG_EMERGENCIA", this.app.form ( "DETERMINAR_RECLAMACION_FR" ).getItem( "FLG_EMERGENCIA" ));
    STAT_CODE  = this.dm.limitQueryFromBuffer ( BASE_CORRECTA_ID );
    STAT_CODE  = this.dm.retrieve ( BASE_CORRECTA_ID );
    STAT_CODE  = this.dm.firstRow ( BASE_CORRECTA_ID );
    while ( Compare.equals ( STAT_CODE, 0 ) ) 
    {
      DUP_BASE_CORRECTA = MathService.plus ( DUP_BASE_CORRECTA, 1  );
      STAT_CODE  = this.dm.nextRow ( BASE_CORRECTA_ID );
    }
    STAT_CODE  = this.dm.dbClose ( BASE_CORRECTA_ID );
    }
    
    if ( Compare.gt ( DUP_BASE_INCORRECTA, 0 ) ) 
    {
      // duplicates found in table base_incorrecta
      this.app.callCommand ( RallyAppCommandFactory.ROLLBACK );
      this.app.setError ( 1, 8400 );
      this.app.errorFlag = false;
      this.doReturn ( );
      return; 
    }
    if ( Compare.gt ( DUP_BASE_CORRECTA, 0 ) ) 
    {
      // duplicates found in table base_correcta
      this.app.callCommand ( RallyAppCommandFactory.ROLLBACK );
      this.app.setError ( 1, 8450 );
      this.app.errorFlag = false;
      this.doReturn ( );
      return; 
    }   
    return;

  }


  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {
    //this.app.callCommand ( RallyAppCommandFactory.QBE );
    return;

  }


  /**
   *
   */
  protected void step2 ( ParameterSet ps )
  {
    //this.app.callCommand ( RallyAppCommandFactory.QUERY );
    return;

  }
}
