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
public class CONTRATO_NINO_FRM
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
  public CONTRATO_NINO_FRM ( )
  {
    super ( );
    this.setName ( "CONTRATO_NINO_FRM" );

    Debug.println ( Debug.TRACE, "CONTRATO_NINO_FRM - constructor" );

    this.setDefinitionPath ( "gov/dlf/presentation/CONTRATO_NINO_FRM.jdp" );
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
	    this.registerListener ( "CONTRATO_NINO_FRM", JDataPanelListener.AFTERLOAD, new JDataPanelListener ( )
	    {
	      public boolean eventFired ( String eventName )
	      {
	        app.errorFlag = true; CONTRATO_CUIDO_FIL_ADL.exec ( app, null ); return app.errorFlag;
	      }
	    } );
	    this.registerListener ( "CONTRATO_NINO_FRM", JDataPanelListener.AFTEREXIT, new JDataPanelListener ( )
	    {
	      public boolean eventFired ( String eventName )
	      {
	        app.errorFlag = true; 
	        CONTRATOS_CUIDO_PRINT_PKT.exec ( app, null ); 
	        CONTRATO_CUIDO_INS_ADL.exec ( app, null );
	        return app.errorFlag;
	      }
	    } );
	    this.registerListener ( "ID_PROVEEDOR", JDataPanelListener.AFTERVALUECHANGE, new JDataPanelListener ( )
	    {
	      public boolean eventFired ( String eventName )
	      {
	        app.errorFlag = true; 
	        CONTRATO_CUIDO_ALIST.exec ( app, null ); 
	        return app.errorFlag;
	      }
	    } );
	    this.registerListener ( "ID_PROVEEDOR", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
	    {
	      public boolean eventFired ( String eventName )
	      {
	        app.errorFlag = true; 
	        CONTRATO_CUIDO_ALIST.exec ( app, null );
	        if(Compare.equals(app.ACCION_GBL,"NO"))
	        {
	        	 app.errorFlag = false; 
	        }
	        return app.errorFlag;
	      }
	    } );
	    this.registerListener ( "TIEMPO_COMP", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
	    {
	      public boolean eventFired ( String eventName )
	      {
	        	 if(Compare.lt(app.form("CONTRATO_NINO_FRM").getDoubleItem("TIEMPO_COMP"), 0))
	        	 {
	        		 app.form("CONTRATO_NINO_FRM").setItem("TIEMPO_COMP",0);
	        	 }
	        app.errorFlag = true; 
	        if(Compare.equals(app.ACCION_GBL,"NO"))
	        {
	        	 app.errorFlag = false;
	        }
	        return app.errorFlag;
	      }
	    } );
	    this.registerListener ( "TIEMPO_PART", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
	    {
	      public boolean eventFired ( String eventName )
	      {
	        	 if(Compare.lt(app.form("CONTRATO_NINO_FRM").getDoubleItem("TIEMPO_PART"), 0))
	        	 {
	        		 app.form("CONTRATO_NINO_FRM").setItem("TIEMPO_PART",0);
	        	 }
	        app.errorFlag = true; 
	        if(Compare.equals(app.ACCION_GBL,"NO"))
	        {
	        	 app.errorFlag = false; 
	        }
	        return app.errorFlag;
	      }
	    } );

	    this.registerListener ( "ESPARIENTE", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
	    {
	      public boolean eventFired ( String eventName )
	      {

	        String pariente = app.form ( "CONTRATO_NINO_FRM" ).getStringItem( "ESPARIENTE" );
			if (  (Compare.equals(pariente, "S")) ||  (Compare.equals(pariente, "N") ))
			{
				app.errorFlag = true; 
			}
			else
			{
				app.setError("0", "Ingrese con una 'S' � una 'N'.");
				app.errorFlag = false; 
			}
	        return app.errorFlag;
	      }
	    } );
	    this.registerListener ( "ACTIVO", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
	    {
	      public boolean eventFired ( String eventName )
	      {
	        String activo = app.form ( "CONTRATO_NINO_FRM" ).getStringItem( "ACTIVO" );
			if (  (Compare.equals(activo, "A")) ||  (Compare.equals(activo, "I") ))
			{
				app.errorFlag = true; 
			}
			else
			{
				app.setError("0", "Ingrese con una 'A' � una 'i'.");
				app.errorFlag = false; 
			}

	        return app.errorFlag;
	      }
	    } );
	    this.registerListener ( "HASTA", JDataPanelListener.BEFORELEAVE, new JDataPanelListener ( )
	    {
	      public boolean eventFired ( String eventName )
	      {
	        app.errorFlag = true; CONTRATO_CUIDO_INS_ADL.exec ( app, null ); return app.errorFlag;
	      }
	    } );
  }
}
