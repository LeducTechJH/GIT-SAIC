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
public class PSE_2_FR
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
  public PSE_2_FR ( )
  {
    super ( );
    this.setName ( "PSE_2_FR" );

    Debug.println ( Debug.TRACE, "PSE_2_FR - constructor" );

    this.setDefinitionPath ( "gov/dlf/presentation/PSE_2_FR.jdp" );
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


    this.setObjectEvents ( );
    field = ( JDataPanelField ) this.getInDepth ( "SEGSOC" );
    field.setValueProvider ( new PSE_2_FR_SEGSOCProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "PSE_SS" );
    field.setValueProvider ( new PSE_2_FR_PSE_SSProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "NOMBRE" );
    field.setValueProvider ( new PSE_2_FR_NOMBREProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "OFICINA" );
    field.setValueProvider ( new PSE_2_FR_OFICINAProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "DIRECCION" );
    field.setValueProvider ( new PSE_2_FR_DIRECCIONProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "SUB" );
    field.setValueProvider ( new PSE_2_FR_SUBProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "CRI" );
    field.setValueProvider ( new PSE_2_FR_CRIProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "SUB2" );
    field.setValueProvider ( new PSE_2_FR_SUB2Provider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "CRI2" );
    field.setValueProvider ( new PSE_2_FR_CRI2Provider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "INELEG" );
    field.setValueProvider ( new PSE_2_FR_INELEGProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "ELEG" );
    field.setValueProvider ( new PSE_2_FR_ELEGProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "RAZON1" );
    field.setValueProvider ( new PSE_2_FR_RAZON1Provider ( this ) );
//    field = ( JDataPanelField ) this.getInDepth ( "VLR_BENEFICIO" );
//    field.setValueProvider ( new PSE_2_FR_VLR_BENEFICIOProvider ( this ) );
//    field = ( JDataPanelField ) this.getInDepth ( "BENF_ESTIMADO" );
//    field.setValueProvider ( new PSE_2_FR_BENF_ESTIMADOProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "TECNICO_CASO" );
    field.setValueProvider ( new PSE_2_FR_TECNICO_CASOProvider ( this ) );
//    field = ( JDataPanelField ) this.getInDepth ( "FCH_NOTIFICACION" );
//    field.setValueProvider ( new PSE_2_FR_FCH_NOTIFICACIONProvider ( this ) );




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
  }
}






/**
*
*/
class PSE_2_FR_SEGSOCProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public PSE_2_FR_SEGSOCProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return PSE_2_ADL.getSEGSOCDouble ( this.app );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   PSE_2_ADL.setSEGSOC ( this.app, value );
 }
}



/**
*
*/
class PSE_2_FR_PSE_SSProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public PSE_2_FR_PSE_SSProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return PSE_2_ADL.getSEGSOCDouble ( this.app );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   PSE_2_ADL.setSEGSOC ( this.app, value );
 }
}



/**
*
*/
class PSE_2_FR_NOMBREProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public PSE_2_FR_NOMBREProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return PSE_2_ADL.getNOMBRE ( this.app );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   PSE_2_ADL.setNOMBRE ( this.app, value );
 }
}



/**
*
*/
class PSE_2_FR_OFICINAProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public PSE_2_FR_OFICINAProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return PSE_2_ADL.getOFICINA ( this.app );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   PSE_2_ADL.setOFICINA ( this.app, value );
 }
}



/**
*
*/
class PSE_2_FR_DIRECCIONProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public PSE_2_FR_DIRECCIONProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return PSE_2_ADL.getDIRECCION ( this.app );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   PSE_2_ADL.setDIRECCION ( this.app, value );
 }
}



/**
*
*/
class PSE_2_FR_SUBProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public PSE_2_FR_SUBProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return PSE_2_ADL.getSUB ( this.app );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   PSE_2_ADL.setSUB ( this.app, value );
 }
}



/**
*
*/
class PSE_2_FR_CRIProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public PSE_2_FR_CRIProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return PSE_2_ADL.getCRI ( this.app );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   PSE_2_ADL.setCRI ( this.app, value );
 }
}



/**
*
*/
class PSE_2_FR_SUB2Provider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public PSE_2_FR_SUB2Provider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return PSE_2_ADL.getSUB2 ( this.app );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   PSE_2_ADL.setSUB2 ( this.app, value );
 }
}



/**
*
*/
class PSE_2_FR_CRI2Provider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public PSE_2_FR_CRI2Provider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return PSE_2_ADL.getCRI2 ( this.app );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   PSE_2_ADL.setCRI2 ( this.app, value );
 }
}



/**
*
*/
class PSE_2_FR_INELEGProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public PSE_2_FR_INELEGProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return PSE_2_ADL.getINELEG ( this.app );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   PSE_2_ADL.setINELEG ( this.app, value );
 }
}



/**
*
*/
class PSE_2_FR_ELEGProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public PSE_2_FR_ELEGProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return PSE_2_ADL.getELEG ( this.app );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   PSE_2_ADL.setELEG ( this.app, value );
 }
}



/**
*
*/
class PSE_2_FR_RAZON1Provider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public PSE_2_FR_RAZON1Provider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return PSE_2_ADL.getRAZON1 ( this.app );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   PSE_2_ADL.setRAZON1 ( this.app, value );
 }
}
//start
//class PSE_2_FR_VLR_BENEFICIOProvider implements IObjectValueProvider, IObjectValueReceiver 
//{
// protected Form model;
// protected SAIC_DMQ_ORA_Application app = null;
// public PSE_2_FR_VLR_BENEFICIOProvider ( Form form )
// {
//   this.model = form;
//   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
// }
// public Object getValue ( )
// {
//   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
//   return PSE_2_ADL.getVLR_BENEFICIO( this.app );
// }
// public void setValue ( Object value )
// {
//   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
//   PSE_2_ADL.setVLR_BENEFICIO( this.app, value );
// }
//}

//class PSE_2_FR_BENF_AUTORIZADOProvider implements IObjectValueProvider, IObjectValueReceiver 
//{
// /**  */
// protected Form model;
// /**  */
// protected SAIC_DMQ_ORA_Application app = null;
//
// /**  */
// public PSE_2_FR_BENF_AUTORIZADOProvider ( Form form )
// {
//   this.model = form;
//   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
// }
//
// /**  */
// public Object getValue ( )
// {
//   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
//   return PSE_2_ADL.getBENF_AUTORIZADO( this.app );
// }
//
// /**  */
// public void setValue ( Object value )
// {
//   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
//   PSE_2_ADL.setBENF_AUTORIZADO( this.app, value );
// }
//}
//class PSE_2_FR_FCH_NOTIFICACIONProvider implements IObjectValueProvider, IObjectValueReceiver 
//{
// protected Form model;
// protected SAIC_DMQ_ORA_Application app = null;
// public PSE_2_FR_FCH_NOTIFICACIONProvider ( Form form )
// {
//   this.model = form;
//   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
// }
// public Object getValue ( )
// {
//   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
//   return PSE_2_ADL.getFECHA( this.app );
// }
// public void setValue ( Object value )
// {
//   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
//   PSE_2_ADL.setFECHA( this.app, value );
// }
//}

class PSE_2_FR_TECNICO_CASOProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public PSE_2_FR_TECNICO_CASOProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return PSE_2_ADL.getTECNICO_CASO( this.app );
 }

 /**  */
 public void setValue ( Object value )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   PSE_2_ADL.setTECNICO_CASO( this.app, value );
 }
}
//end





