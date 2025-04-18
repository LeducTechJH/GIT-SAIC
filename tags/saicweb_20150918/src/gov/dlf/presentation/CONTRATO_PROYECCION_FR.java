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
public class CONTRATO_PROYECCION_FR
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
  public CONTRATO_PROYECCION_FR ( )
  {
    super ( );
    this.setName ( "CONTRATO_PROYECCION_FR" );

    Debug.println ( Debug.TRACE, "CONTRATO_PROYECCION_FR - constructor" );

    this.setDefinitionPath ( "gov/dlf/presentation/CONTRATO_PROYECCION_FR.jdp" );
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

    this.setArguments ( "CONTRATO_GP", new CONTRATO_FR_GP_Arguments ( this ) );
    this.setArguments ( "MESES_GP", new MESES_FR_GP_Arguments ( this ) );

    this.setObjectEvents ( );

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



class CONTRATO_FR_GP_Arguments extends JDataPanelGroupArguments
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public CONTRATO_FR_GP_Arguments ( Form form )
  {
    this.model = form;

    this.setArgName ( "SSN_PAR" );

  }

  /**  */
  public Object getArgValue ( String argName )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    if ( argName == null )
    {
      return null;
    }
    else if ( argName.equals ( "SSN_PAR" ) )
    {
    	return this.app.getSSN_GBL( ); // Global Variable
   	}

    
    return null;
  }
}


/**
 *
 */
class MESES_FR_GP_Arguments extends JDataPanelGroupArguments
{
  /**  */
  protected Form model;
  /**  */
  protected SAIC_DMQ_ORA_Application app = null;

  /**  */
  public MESES_FR_GP_Arguments ( Form form )
  {
    this.model = form;

    this.setArgName ( "SSN_PAR" );
    this.setArgName ( "PROVEEDORID" );
    this.setArgName ( "TIPOCUIDO" );
  }

  /**  */
  public Object getArgValue ( String argName )
  {
    if ( this.app == null ) this.app = ( SAIC_DMQ_ORA_Application ) this.model.getApplication ( );
    if ( argName == null )
    {
      return null;
    }
    else if ( argName.equals ( "SSN_PAR" ) )
    {
    	return this.app.form("CONTRATO_PROYECCION_FR").getDoubleItem( "SEG_SOC_CLIENTE" );
   	}
    else if ( argName.equals ( "PROVEEDORID" ) )
    {
    	return this.app.form("CONTRATO_PROYECCION_FR").getDoubleItem( "ID_PROVEEDOR" );
   	}
    else if ( argName.equals ( "TIPOCUIDO" ) )
    {
    	return this.app.form("CONTRATO_PROYECCION_FR").getStringItem( "TIPO_CUIDO" );
   	}
    return null;
  }
}

