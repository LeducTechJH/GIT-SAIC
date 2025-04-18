package gov.dlf.logic;

 
import gov.dlf.facade.*;
import net.maintrend.datamanager.*;
import net.maintrend.interfaces.*;
import net.maintrend.interlink.*;
import net.maintrend.rallyengine.*;
import net.maintrend.util.*;
import java.net.Authenticator;

import javax.xml.ws.WebServiceException;



/**
 * __Comment
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class SET_SIBIF_TOKEN_ADL
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
 
  public boolean _condition0 = false;

  
  // -------------------------------------------------------------------
  // ----------   Instance Export Attributes   -------------------------

  public double TEC_ID = 0;

  public double STAT_CODE = 0;



  public DataStore TECNICO_READ_DSD = null;




  // -------------------------------------------------------------------
  // ----------   Instance Attributes' Access Methods   ----------------
    

  
  /**  */
  public static void setTEC_ID  ( RallyApplication __app, Parameter value )
  {
    ( ( SET_SIBIF_TOKEN_ADL ) __app.getADL ( SET_SIBIF_TOKEN_ADL.class ) ).TEC_ID = value.getDouble ( );
  }  

  
  /**  */
  public static void setSTAT_CODE  ( RallyApplication __app, Parameter value )
  {
    ( ( SET_SIBIF_TOKEN_ADL ) __app.getADL ( SET_SIBIF_TOKEN_ADL.class ) ).STAT_CODE = value.getDouble ( );
  }  
    


  /**  */
  public static DataStore getTECNICO_READ_DSD  ( RallyApplication __app )
  {
    return ( ( SET_SIBIF_TOKEN_ADL ) __app.getADL ( SET_SIBIF_TOKEN_ADL.class ) ).TECNICO_READ_DSD;
  }


  /**  */
  public static void setTECNICO_READ_DSD  ( RallyApplication __app, DataStore value )
  {
    ( ( SET_SIBIF_TOKEN_ADL ) __app.getADL ( SET_SIBIF_TOKEN_ADL.class ) ).TECNICO_READ_DSD = value;
  }


  /**  */
  public static void setTECNICO_READ_DSD  ( RallyApplication __app, Object value )
  {
    ( ( SET_SIBIF_TOKEN_ADL ) __app.getADL ( SET_SIBIF_TOKEN_ADL.class ) ).TECNICO_READ_DSD = ( DataStore ) value;
  }




  /**  */
  public static double getTEC_ID  ( RallyApplication __app )
  {
    return ( ( SET_SIBIF_TOKEN_ADL ) __app.getADL ( SET_SIBIF_TOKEN_ADL.class ) ).TEC_ID;
  }


  /**  */
  public static Double getTEC_IDDouble ( RallyApplication __app )
  {
    return new Double ( ( ( SET_SIBIF_TOKEN_ADL ) __app.getADL ( SET_SIBIF_TOKEN_ADL.class ) ).TEC_ID );
  }


  /**  */
  public static void setTEC_ID  ( RallyApplication __app, double value )
  {
    ( ( SET_SIBIF_TOKEN_ADL ) __app.getADL ( SET_SIBIF_TOKEN_ADL.class ) ).TEC_ID = value;
  }


  /**  */
  public static void setTEC_ID  ( RallyApplication __app, Object value )
  {
    ( ( SET_SIBIF_TOKEN_ADL ) __app.getADL ( SET_SIBIF_TOKEN_ADL.class ) ).TEC_ID = ( ( Double ) value ).doubleValue ( );
  }


  /**  */
  public static double getSTAT_CODE  ( RallyApplication __app )
  {
    return ( ( SET_SIBIF_TOKEN_ADL ) __app.getADL ( SET_SIBIF_TOKEN_ADL.class ) ).STAT_CODE;
  }


  /**  */
  public static Double getSTAT_CODEDouble ( RallyApplication __app )
  {
    return new Double ( ( ( SET_SIBIF_TOKEN_ADL ) __app.getADL ( SET_SIBIF_TOKEN_ADL.class ) ).STAT_CODE );
  }


  /**  */
  public static void setSTAT_CODE  ( RallyApplication __app, double value )
  {
    ( ( SET_SIBIF_TOKEN_ADL ) __app.getADL ( SET_SIBIF_TOKEN_ADL.class ) ).STAT_CODE = value;
  }


  /**  */
  public static void setSTAT_CODE  ( RallyApplication __app, Object value )
  {
    ( ( SET_SIBIF_TOKEN_ADL ) __app.getADL ( SET_SIBIF_TOKEN_ADL.class ) ).STAT_CODE = ( ( Double ) value ).doubleValue ( );
  }



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   * 
   * @param __app
   * @return
   */
  public static SET_SIBIF_TOKEN_ADL get ( RallyApplication __app )
  {
    SET_SIBIF_TOKEN_ADL adl = new SET_SIBIF_TOKEN_ADL ( );
    __app.register ( adl, "SET_SIBIF_TOKEN_ADL" );
    __app.setADL ( SET_SIBIF_TOKEN_ADL.class, adl ); 
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
    SET_SIBIF_TOKEN_ADL.get ( __app ).process ( ps );
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
    SET_SIBIF_TOKEN_ADL.exec ( __app, ps );
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
    IRegisteredObject rObj = this.app.get ( "SET_SIBIF_TOKEN_ADL" );
    if ( rObj != null && rObj instanceof SET_SIBIF_TOKEN_ADL )
    {
      this.app.setADL ( SET_SIBIF_TOKEN_ADL.class, ( SET_SIBIF_TOKEN_ADL ) rObj );
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
    Debug.println ( Debug.TRACE, "SET_SIBIF_TOKEN_ADL Step " + this.currentStep );
    super.process ( ps );
    switch ( this.currentStep ) 
    {
      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
      default: 
      { 
        this.currentStep = 0;
        Debug.println ( Debug.TRACE, "SET_SIBIF_TOKEN_ADL ended" );
        this.unregister ( );
        break;
      }
    }
    if ( this.currentStep > 0 ) this.app.goOn ( );
  }



  /**
   * to get the tecnico's COD_SEGURIDAD
   */
  protected void step0 ( ParameterSet ps )
  {
    TECNICO_READ_DSD = this.dm.create ( "TECNICO_READ_DSD" );
    TEC_ID = TECNICO_READ_DSD.getId ( );
    STAT_CODE = RallyDataStoreException.getDefault ( );
    if ( ! Compare.equals ( STAT_CODE, 0 ) ) 
    {
      this.app.setError ( 0, STAT_CODE );

      STAT_CODE  = this.dm.rollBack ( );
      this.doReturn ( );
      return; 
    }

    STAT_CODE  = this.dm.reset ( TEC_ID );

    this.dm.setField ( this.dm.get ( "TECNICO_READ_DSD" ), "ID_TECNICO", this.app.ID_TECNICO_GBL );

    STAT_CODE  = this.dm.limitQueryFromBuffer ( TEC_ID );
    STAT_CODE  = this.dm.retrieve ( TEC_ID );

    if ( ! Compare.equals ( STAT_CODE, 0 ) ) 
    {
      this.app.setError ( 1, STAT_CODE );

      STAT_CODE  = this.dm.rollBack ( );
      this.doReturn ( );
      return; 
    }

    STAT_CODE  = this.dm.firstRow ( TEC_ID );

    if ( Compare.equals ( STAT_CODE, 0 ) ) 
    {
      this._condition0 = true;
    }
    else
    {
      this._condition0 = false;
    }
    if ( this._condition0 )
    {
      this.app.form ( "CALENDARIO_TEC_SIBIF_FR" ).setItem ( "ID_TECNICO", this.app.ID_TECNICO_GBL  );
      this.app.form ( "CALENDARIO_TEC_SIBIF_FR" ).setItem ( "COD_SEGURIDAD", this.dm.getField ( this.dm.get ( "TECNICO_READ_DSD" ), "COD_SEGURIDAD" )  );
      //this.app.form ( "CALENDARIO_TEC_SIBIF_FR" ).setItem ( "COD_SEGURIDAD", "tecnicotest@gmail.com"  );
    }
    else
    {
      STAT_CODE  = this.dm.rollBack ( );
      this.doReturn ( );
      return;
    }

    STAT_CODE  = this.dm.dbClose ( TEC_ID );
    return;

  }

  /**
   *
   */
  protected void step1 ( ParameterSet ps )
  {
    Authenticator.setDefault(new BasicHTTPAuthentication_ADL() );
    gov.dlf.webservice.CalendarioUsuarios.Usuarios service;
    try { // Call Web Service Operation
  	  try
	  {
	    service = new gov.dlf.webservice.CalendarioUsuarios.Usuarios();
	  }
	  catch (WebServiceException ex)
	  {
		this.app.setError("-1", "No se pudo acceder sistema SIBIF");
		this.doReturn();
		return;
	  }
      gov.dlf.webservice.CalendarioUsuarios.UsuariosSoap port = service.getUsuariosSoap();
      // initialize WS operation arguments here
      java.lang.String strCodigoUsuario = this.app.form ( "CALENDARIO_TEC_SIBIF_FR" ).getStringItem ( "COD_SEGURIDAD" );
      // get the token from the web service
      java.lang.String result = port.crearTokenXUsuario(strCodigoUsuario);
      //java.lang.String result = port.version();
      //System.out.println("Result = "+result);
      // put the token into a hidden field in the form
      this.app.form ( "CALENDARIO_TEC_SIBIF_FR" ).setItem ( "SIBIF_TOKEN", result );
      //java.lang.String result2 = this.app.form ( "CALENDARIO_TEC_SIBIF_FR" ).getItem ( "SIBIF_TOKEN" ).toString();
    } catch (Exception ex) {
      // handle custom exceptions here
	  this.app.setError("-1", "No se pudo acceder sistema SIBIF");
      System.out.println("Error: "+ex.getMessage());
      this.doReturn();
      return;
    }
    return;
  }
}
