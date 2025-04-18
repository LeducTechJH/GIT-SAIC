package gov.dlf.presentation;


import gov.dlf.facade.*;
import gov.dlf.external.*;
import gov.dlf.logic.*;

import java.util.Date;


import net.maintrend.appmanager.*;
import net.maintrend.datamanager.*;
import net.maintrend.interfaces.*;
import net.maintrend.interlink.*;
import net.maintrend.jdatapanel.*;
import net.maintrend.jdatapanel.edit.*;
import net.maintrend.jdatapanel.commands.*;
import net.maintrend.mdi.*;
import net.maintrend.rallyengine.*;
import net.maintrend.util.*;



/**
 * __Comment
 *
 * Generated by Rally-to-Java Convertor. MainTrend Ltd.
 */
public class OTRPAG_A3_SUB_FR
     extends Form
{
  // -------------------------------------------------------------------
  // ----------   Instance Attributes   --------------------------------

  /**  */
  public SAIC_DMQ_ORA_Application app;



  // -------------------------------------------------------------------
  // ----------   Constructors and supporting methods   ----------------

  /**
   *
   */
  public OTRPAG_A3_SUB_FR ( )
  {
    super ( );
    this.setName ( "OTRPAG_A3_SUB_FR" );

    Debug.println ( Debug.TRACE, "OTRPAG_A3_SUB_FR - constructor" );

    this.setDefinitionPath ( "gov/dlf/presentation/OTRPAG_A3_SUB_FR.jdp" );
    String definition = ResourceUtil.getResourceText ( this.definitionPath );
    this.setDefinition     ( definition );

    this.setHighLightSelected   ( false );
    this.compressFieldLocations ( false, true );  // Compresses only Y-locations
  }
  
  
  /**
   * Overrides ancestor's script
   *
   * @param __app
   */
  public void setApplication ( Application __app )
  {
    this.app = ( SAIC_DMQ_ORA_Application ) __app;
    if ( this.app != null )
    {
      this.setDataManager ( this.app.getDataManager ( ) );
    }

    ICalculator           calculator;
    IBooleanValueProvider txtVisible;
    IBooleanValueProvider groupVisible;
    IObjectValueProvider  valueProvider;
    JDataPanelField       field;
    JDataPanelTextGroup   txtGroup;
    JDataPanelGroup       visGroup;

    this.setArguments ( "RECAUDACIONES", new OTRPAG_A3_SUB_FR_RECAUDACIONES_Arguments ( this ) );

    this.setObjectEvents ( );
    field = ( JDataPanelField ) this.getInDepth ( "FCH_PAGO" );
    field.setValueProvider ( new OTRPAG_A3_SUB_FR_FCH_PAGOProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "FECHA_OFICIAL" );
    field.setValueProvider ( new OTRPAG_A3_SUB_FR_FECHA_OFICIALProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "RMO" );
    field.setValueProvider ( new OTRPAG_A3_SUB_FR_RMOProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "VLR_BALANCE_RECLA" );
    field.setValueProvider ( new OTRPAG_A3_SUB_FR_VLR_BALANCE_RECLAProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "SSJF" );
    field.setValueProvider ( new OTRPAG_A3_SUB_FR_SSJFProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "SSJS" );
    field.setValueProvider ( new OTRPAG_A3_SUB_FR_SSJSProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "FCID" );
    field.setValueProvider ( new OTRPAG_A3_SUB_FR_FCIDProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "VLR_SSJR" );
    field.setValueProvider ( new OTRPAG_A3_SUB_FR_VLR_SSJRProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "SERV" );
    field.setValueProvider ( new OTRPAG_A3_SUB_FR_SERVProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "VLR_STAT" );
    field.setValueProvider ( new OTRPAG_A3_SUB_FR_VLR_STATProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "VLR_CLAS" );
    field.setValueProvider ( new OTRPAG_A3_SUB_FR_VLR_CLASProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "VLR_REOR" );
    field.setValueProvider ( new OTRPAG_A3_SUB_FR_VLR_REORProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "VLR_PAGO" );
    field.setValueProvider ( new OTRPAG_A3_SUB_FR_VLR_PAGOProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "VLR_NOMB" );
    field.setValueProvider ( new OTRPAG_A3_SUB_FR_VLR_NOMBProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "PAGO_MENSUAL" );
    field.setValueProvider ( new OTRPAG_A3_SUB_FR_PAGO_MENSUALProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "COD_STATUS" );
    field.setValueProvider ( new OTRPAG_A3_SUB_FR_COD_STATUSProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "NUMERO_FACTURA" );
    field.setValueProvider ( new OTRPAG_A3_SUB_FR_NUMERO_FACTURAProvider ( this ) );




  }


  /**
   * Overrides ancestor's method
   * 
   * @return
   */
  public RallyApplication getApplication ( )
  {
    return this.app;
  }



  // -------------------------------------------------------------------
  // ----------   Action Sites   ---------------------------------------

  /**
   *
   */
  public void setObjectEvents ( )
  {
    this.registerListener ( "MODO_PAGO", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; OTRPAG_CHECK_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "NUMERO_FACTURA", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; VALID_NUMR_ADL.exec ( app ); return app.errorFlag;
      }
    } );
    this.registerListener ( "VLR_CANTIDAD", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
    {
      public boolean eventFired ( String eventName )
      {
        app.errorFlag = true; OTRPAG_B_CANTIDAD_ADL.exec ( app ); return app.errorFlag;
      }
    } );
  }
}





/**
 *
 */
class OTRPAG_A3_SUB_FR_RECAUDACIONES_Arguments extends JDataPanelGroupArguments
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public OTRPAG_A3_SUB_FR_RECAUDACIONES_Arguments ( Form form )
  {
    this.model = form;

    this.setArgName ( "PSSJF" );
    this.setArgName ( "PSSJS" );
    this.setArgName ( "PFECHA" );
    this.setArgName ( "PCODSERV" );
    this.setArgName ( "PFCID" );
  }

  /**  */
  public Object getArgValue ( String argName )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    if ( argName == null )
    {
      return null;
    }
    else if ( argName.equals ( "PSSJF" ) )
    {
      return this.app.form ( "OTRPAG_A2_FR" ).getValue ( "SEGURO_SOCIAL_JEFE_FAM" );
    }
    else if ( argName.equals ( "PSSJS" ) )
    {
      return this.app.form ( "OTRPAG_A2_FR" ).getValue ( "SEGURO_SOCIAL_JEFE_SERV" );
    }
    else if ( argName.equals ( "PFECHA" ) )
    {
      return this.app.form ( "OTRPAG_A3_FR" ).getValue ( "FECH" );
    }
    else if ( argName.equals ( "PCODSERV" ) )
    {
      return this.app.form ( "OTRPAG_A2_FR" ).getValue ( "COD_SERVICIO" );
    }
    else if ( argName.equals ( "PFCID" ) )
    {
      return this.app.form ( "OTRPAG_A2_FR" ).getValue ( "FECHA_IDENTIFICADO" );
    }
    return null;
  }
}




/**
*
*/
class OTRPAG_A3_SUB_FR_FCH_PAGOProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public OTRPAG_A3_SUB_FR_FCH_PAGOProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return this.app.form ( "OTRPAG_A3_FR" ).getValue ( "FECH" );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   //__ValueReceiverScript
 }
}



/**
*
*/
class OTRPAG_A3_SUB_FR_FECHA_OFICIALProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public OTRPAG_A3_SUB_FR_FECHA_OFICIALProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return this.app.form ( "OTRPAG_A3_FR" ).getValue ( "RECO" );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   //__ValueReceiverScript
 }
}



/**
*
*/
class OTRPAG_A3_SUB_FR_RMOProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public OTRPAG_A3_SUB_FR_RMOProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return this.app.form ( "OTRPAG_A2_FR" ).getValue ( "RMO_OFICINA" );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   //__ValueReceiverScript
 }
}



/**
*
*/
class OTRPAG_A3_SUB_FR_VLR_BALANCE_RECLAProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public OTRPAG_A3_SUB_FR_VLR_BALANCE_RECLAProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return this.app.form ( "OTRPAG_A2_FR" ).getValue ( "VLR_BAL" );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   //__ValueReceiverScript
 }
}



/**
*
*/
class OTRPAG_A3_SUB_FR_SSJFProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public OTRPAG_A3_SUB_FR_SSJFProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return this.app.form ( "OTRPAG_A2_FR" ).getValue ( "SEGURO_SOCIAL_JEFE_FAM" );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   //__ValueReceiverScript
 }
}



/**
*
*/
class OTRPAG_A3_SUB_FR_SSJSProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public OTRPAG_A3_SUB_FR_SSJSProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return this.app.form ( "OTRPAG_A2_FR" ).getValue ( "SEGURO_SOCIAL_JEFE_SERV" );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   //__ValueReceiverScript
 }
}



/**
*
*/
class OTRPAG_A3_SUB_FR_FCIDProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public OTRPAG_A3_SUB_FR_FCIDProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return this.app.form ( "OTRPAG_A2_FR" ).getValue ( "FECHA_IDENTIFICADO" );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   //__ValueReceiverScript
 }
}



/**
*
*/
class OTRPAG_A3_SUB_FR_VLR_SSJRProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public OTRPAG_A3_SUB_FR_VLR_SSJRProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return this.app.form ( "OTRPAG_A2_FR" ).getValue ( "SS_DUENO" );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   //__ValueReceiverScript
 }
}



/**
*
*/
class OTRPAG_A3_SUB_FR_SERVProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public OTRPAG_A3_SUB_FR_SERVProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return this.app.form ( "OTRPAG_A2_FR" ).getValue ( "COD_SERVICIO" );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   //__ValueReceiverScript
 }
}



/**
*
*/
class OTRPAG_A3_SUB_FR_VLR_STATProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public OTRPAG_A3_SUB_FR_VLR_STATProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return this.app.form ( "OTRPAG_A2_FR" ).getValue ( "STATUS" );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   //__ValueReceiverScript
 }
}



/**
*
*/
class OTRPAG_A3_SUB_FR_VLR_CLASProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public OTRPAG_A3_SUB_FR_VLR_CLASProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return this.app.form ( "OTRPAG_A2_FR" ).getValue ( "CLAS_REC" );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   //__ValueReceiverScript
 }
}



/**
*
*/
class OTRPAG_A3_SUB_FR_VLR_REORProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public OTRPAG_A3_SUB_FR_VLR_REORProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return this.app.form ( "OTRPAG_A2_FR" ).getValue ( "CANTIDAD_RECLA_RETRO" );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   //__ValueReceiverScript
 }
}



/**
*
*/
class OTRPAG_A3_SUB_FR_VLR_PAGOProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public OTRPAG_A3_SUB_FR_VLR_PAGOProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return this.app.form ( "OTRPAG_A2_FR" ).getValue ( "CAN_DED" );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   //__ValueReceiverScript
 }
}



/**
*
*/
class OTRPAG_A3_SUB_FR_VLR_NOMBProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public OTRPAG_A3_SUB_FR_VLR_NOMBProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return this.app.form ( "OTRPAG_A2_FR" ).getValue ( "F5" );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   //__ValueReceiverScript
 }
}



/**
*
*/
class OTRPAG_A3_SUB_FR_PAGO_MENSUALProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public OTRPAG_A3_SUB_FR_PAGO_MENSUALProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return this.app.form ( "OTRPAG_A3_FR" ).getValue ( "PAGO" );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   //__ValueReceiverScript
 }
}



/**
*
*/
class OTRPAG_A3_SUB_FR_COD_STATUSProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public OTRPAG_A3_SUB_FR_COD_STATUSProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return this.app.form ( "OTRPAG_A3_FR" ).getValue ( "STAT" );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   //__ValueReceiverScript
 }
}

class OTRPAG_A3_SUB_FR_NUMERO_FACTURAProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public OTRPAG_A3_SUB_FR_NUMERO_FACTURAProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return this.app.form ( "OTRPAG_A3_FR" ).getValue ( "NUMERO_FACTURA" );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   //__ValueReceiverScript
 }
}




