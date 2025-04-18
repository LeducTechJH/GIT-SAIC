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
public class LISTA_DOCUM_FR
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
  public LISTA_DOCUM_FR ( )
  {
    super ( );
    this.setName ( "LISTA_DOCUM_FR" );

    Debug.println ( Debug.TRACE, "LISTA_DOCUM_FR - constructor" );

    this.setDefinitionPath ( "gov/dlf/presentation/LISTA_DOCUM_FR.jdp" );
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
    field = ( JDataPanelField ) this.getInDepth ( "SEGURO_SOCIAL_SERVICIO" );
    field.setValueProvider ( new LISTA_DOCUM_FR_SEGURO_SOCIAL_SERVICIOProvider ( this ) );
    field = ( JDataPanelField ) this.getInDepth ( "SEGURO_SOCIAL_JEFE_FAM" );
    field.setValueProvider ( new LISTA_DOCUM_FR_SEGURO_SOCIAL_JEFE_FAMProvider ( this ) );



    calculator = new LISTA_DOCUM_FR_NOMBRE_COMPLETOCalculator ( this );
    field = ( JDataPanelField ) this.getInDepth ( "NOMBRE_COMPLETO" );
    field.setValueCalculator ( calculator );
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
class LISTA_DOCUM_FR_SEGURO_SOCIAL_SERVICIOProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public LISTA_DOCUM_FR_SEGURO_SOCIAL_SERVICIOProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return this.app.getSS_JEFE_SERVICIO_GBL ( );
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
class LISTA_DOCUM_FR_SEGURO_SOCIAL_JEFE_FAMProvider implements IObjectValueProvider, IObjectValueReceiver 
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public LISTA_DOCUM_FR_SEGURO_SOCIAL_JEFE_FAMProvider ( Form form )
 {
   this.model = form;
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
 }

 /**  */
 public Object getValue ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   return this.app.getSS_JEFE_FAMILIA_GBL ( );
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
class LISTA_DOCUM_FR_NOMBRE_COMPLETOCalculator implements ICalculator
{
 /**  */
 protected Form model;
 /**  */
 protected SAIC_DMQ_ORA_Application app = null;

 /**  */
 public LISTA_DOCUM_FR_NOMBRE_COMPLETOCalculator ( Form form )
 {
   this.model = form;
 }

 /**  */
 public void calculate ( )
 {
   if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
   this.app.exec ( "NOMBRE_REPORT_9_21" );
 }
}


