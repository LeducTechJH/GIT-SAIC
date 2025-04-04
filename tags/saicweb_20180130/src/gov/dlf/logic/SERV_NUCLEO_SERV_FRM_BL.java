package gov.dlf.logic;

import gov.dlf.external.*;
import gov.dlf.facade.*;
import gov.dlf.presentation.*;


import java.util.*;

import net.maintrend.appmanager.*;
import net.maintrend.datamanager.*;
import net.maintrend.interfaces.*;
import net.maintrend.interlink.*;
import net.maintrend.jdatapanel.JDataPanelField;
import net.maintrend.jdatapanel.JDataPanelGroup;
import net.maintrend.jdatapanel.JDataPanelGroupData;
import net.maintrend.jdatapanel.JDataPanelGroupInstance;
import net.maintrend.jdatapanel.JDataPanelObjectInstance;
import net.maintrend.mdi.*;
import net.maintrend.rallyengine.*;
import net.maintrend.util.*;
import net.maintrend.util.format.*;



/**
 * __Comment
 *
 */
public class SERV_NUCLEO_SERV_FRM_BL
{
  // -------------------------------------------------------------------
  // ----------   Class Attributes   -----------------------------------


  // -------------------------------------------------------------------
  // ----------   Instance Attributes   --------------------------------


  // -------------------------------------------------------------------
  // ----------   Instance Condition Attributes   ----------------------

 
  // -------------------------------------------------------------------
  // ----------   Instance Export Attributes   -------------------------


  // -------------------------------------------------------------------
  // ----------   Instance Attributes Access Methods    ----------------
    

  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  public static boolean validateBeneficiario ( RallyApplication app )
  {
    try
    {
      Form nucleoFrm = app.form ( "SERV_NUCLEO_SERV_FRM" );    
      if ( nucleoFrm == null ) return false;
    
      JDataPanelGroup group = ( JDataPanelGroup ) nucleoFrm.getInDepth ( "NUCLEO_SERV_GP" );
      if ( group == null ) return false;
    
      JDataPanelField field = ( JDataPanelField ) nucleoFrm.getInDepth ( "SEGURO_SOCIAL_BENEFICIARIO" );
      if ( field == null ) return false;
    
      JDataPanelGroupData data = group.getData ( );
      if ( data == null ) return false;
    
      JDataPanelObjectInstance gdpoi = nucleoFrm.getCurrentInstance ( );
      if ( gdpoi == null ) return false;
      
      JDataPanelGroupInstance groupInstance = gdpoi.getInstance ( );
       
      Object curValue = field.get ( groupInstance );     
      long baseVal = MathService.getLong ( curValue );
    
      for ( int k = 0; k < data.size ( ); k ++ )
      {
        JDataPanelGroupInstance loopInstance = data.get ( k );
        if ( loopInstance.equals ( groupInstance ) ) continue;
          
        Object value = field.get ( loopInstance );
        long compVal = MathService.getLong ( value );
      
        if ( baseVal == compVal )
        {
          app.errorFlag = false;
          app.setError ( 8001 );
          return false;
        }
      }   
    }
    catch ( Exception ex )
    {
      return false;
    }

    return true;
  }
}
