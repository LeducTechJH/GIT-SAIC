/**
 *
 */
package gov.dlf.logic;

import net.maintrend.datamanager.DataStore;
import net.maintrend.interfaces.IRegisteredObject;
import net.maintrend.interlink.ParameterSet;
import net.maintrend.rallyengine.*;
import net.maintrend.util.Compare;
import net.maintrend.util.Debug;
import net.maintrend.util.MathService;

import java.util.Iterator;
import java.util.Date;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceException;

import gov.dlf.facade.SAIC_DMQ_ORA_Application;
import gov.pr.adsef.*;

/**
 * @author Marcos Acevedo, KPG Inc.
 *
 */
public class SIBIF_PREQUAL_INFO_GET_ADL extends ADL {


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

	  public DataStore CLIENTES2_DSD = null;

	  public double CLIENTES2_DSD_ID = 0;

	  public double CLIENTES2_STATUS_CODE = 0;

	  public double INGRESOS_CLIENTE_2_DSD_ID = 0;

	  public double RECURSOS_CLIENTE_2_DSD_ID = 0;

	  public DataStore INGRESOS_CLIENTE_2_DSD = null;

	  public DataStore RECURSOS_CLIENTE_2_DSD = null;

	  public double INGRESOS_CLIENTE_2_STATUS_CODE = 0;

	  public double RECURSOS_CLIENTE_STATUS_CODE = 0;

	  public double DEDUCCIONES_CLIENTE2_DSD_ID = 0;

	  public double DEDUCCIONES_CLIENTE2_STATUS_CODE = 0;

	  public DataStore DEDUCCIONES_CLIENTE2_DSD = null;

	  public DataStore DIRECCIONES_DSD = null;

	  public double DIRECCIONES_DSD_ID = 0;

	  public double DIRECCIONES_STATUS_CODE = 0;

	  public DataStore CLIENTE_AGENCIA2_DSD = null;

	  public double CLIENTE_AGENCIA2_STATUS_CODE = 0;

	  public double CLIENTE_AGENCIA2_DSD_ID = 0;

	  public DataStore ZIP_RO_RO_DSD = null;

	  public double ZIP_RO_RO_DSD_ID = 0;

	  public double ZIP_RO_RO_DSD_STATUS_CODE = 0;

	  public DataStore SEGURO_SOCIAL_SUST_DSD = null;

	  public double SEGURO_SOCIAL_SUST_DSD_ID = 0;

	  public double SEGURO_SOCIAL_SUST_DSD_STATUS_CODE = 0;

	  public double subSSID = 0;



	  // -------------------------------------------------------------------
	  // ----------   Instance Export Attributes   -------------------------

	  SiBIFSAIC service = null;



	  // -------------------------------------------------------------------
	  // ----------   Instance Attributes' Access Methods   ----------------

	  ObjectFactory factory = new ObjectFactory ( );

	  PreQualificationInfo preQualObj = factory.createPreQualificationInfo ( );


	  // -------------------------------------------------------------------
	  // ----------   Methods   --------------------------------------------

	  /**
	   *
	   * @param __app
	   * @return
	   */
	  public static SIBIF_PREQUAL_INFO_GET_ADL get ( RallyApplication __app )
	  {
	    SIBIF_PREQUAL_INFO_GET_ADL adl = new SIBIF_PREQUAL_INFO_GET_ADL ( );
	    __app.register ( adl, "SIBIF_PREQUAL_INFO_GET_ADL" );
	    __app.setADL ( SIBIF_PREQUAL_INFO_GET_ADL.class, adl );
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
		  SIBIF_PREQUAL_INFO_GET_ADL.get ( __app ).process ( ps );
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
	    SIBIF_PREQUAL_INFO_GET_ADL.get ( __app ).process ( ps );
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
	    IRegisteredObject rObj = this.app.get ( "SIBIF_PREQUAL_INFO_GET_ADL" );
	    if ( rObj != null && rObj instanceof SIBIF_PREQUAL_INFO_GET_ADL )
	    {
	      this.app.setADL ( SIBIF_PREQUAL_INFO_GET_ADL.class, ( SIBIF_PREQUAL_INFO_GET_ADL ) rObj );
	    }
	  }


	  /**
	   * Overrides the ancestor's method
	   *
	   * @param ps
	   */
	  protected void process ( ParameterSet ps )
	  {
	    Debug.println ( Debug.TRACE, "SIBIF_PREQUAL_INFO_GET_ADL Step " + this.currentStep );
	    super.process ( ps );
	    switch ( this.currentStep )
	    {
	      case 0:  { this.currentStep ++; this.step0 ( this.keyParms ); break; }
	      case 1:  { this.currentStep ++; this.step1 ( this.keyParms ); break; }
	      case 2:  { this.currentStep ++; this.step2 ( this.keyParms ); break; }
	      default:
	      {
	        this.currentStep = 0;
	        Debug.println ( Debug.TRACE, "SIBIF_PREQUAL_INFO_GET_ADL ended" );
	        this.unregister ( );
	        break;
	      }
	    }
	    if ( this.currentStep > 0 ) this.app.goOn ( );
	  }

	  protected void step0 ( ParameterSet ps )
	  {

		  	CLIENTES2_DSD = this.dm.create ( "CLIENTES2_DSD" );
		    CLIENTES2_DSD_ID = CLIENTES2_DSD.getId ( );
		    CLIENTES2_STATUS_CODE = RallyDataStoreException.getDefault ( );

		    this.dm.setField ( this.dm.get ( "CLIENTES2_DSD" ), "SEGURO_SOCIAL_CLIENTE", this.app.form("CHECK_SOLIC_EXT_FR").getStringValue( "SS" ) );
	    	CLIENTES2_STATUS_CODE  = this.dm.limitQueryFromBuffer ( CLIENTES2_DSD_ID );
	    	CLIENTES2_STATUS_CODE  = this.dm.retrieve ( CLIENTES2_DSD_ID );

	    	if ( Compare.equals ( CLIENTES2_STATUS_CODE, 0 ) )
	        {
	    		CLIENTES2_STATUS_CODE  = this.dm.firstRow ( CLIENTES2_DSD_ID );

	    		if ( Compare.equals ( CLIENTES2_STATUS_CODE, 0 ) )
	    		{
	    			this.app.setError("-1", "Este cliente ya existe o tiene antecedentes en SAICWEB.");
	    			this.app.callCommand("FINISH ACTION");
	    			this.doReturn();
	    		}

	        }



	  }
	  /**
	   *
	   */
	  protected void step1 ( ParameterSet ps )
	  {

		  try
		  {
			  service = new SiBIFSAIC ( );
		  }
		  catch (WebServiceException ex)
		  {

			  this.app.setError("-1", "No se pudo accesar el sistema de SiBiF");

			  this.doReturn();
			  return;

		  }

		  SiBIFSAICSoap soap = service.getSiBIFSAICSoap ( );

		  String ctrl = this.app.form("CHECK_SOLIC_EXT_FR").getStringValue( "CONTROL" );
		  String  ss = this.app.form("CHECK_SOLIC_EXT_FR").getStringValue( "SS" );
		  double rmo = this.app.getRMO_GBL();

		  this.preQualObj = soap.getPrequalificationInfo (ctrl, ss, (int) rmo );

		  Response respObj = this.preQualObj.getResponse();

		  switch ( respObj.getCode ( ) )
		  {
		  case -1:
			  this.app.setError("-1", "No se pudo accesar el sistema por parte de SiBiF.");
			  this.doReturn();
			  break;
		  case 0:
			  this.app.setError("0", "N/A");
			  this.doReturn();
			  break;
		  case 1:
			  break;
		  case 2:
			  this.app.setError("2", "Cliente debe registrarse en local "+ respObj.getRMO());
			  this.doReturn();
			  break;
		  case 3:
			  this.app.setError("3", "No se encontró solicitud en sistema de SiBiF");
			  this.doReturn();
			  break;
		  case 4:
			  this.app.setError("4", "El seguro social provisto no concuerda con el Número de Control en solicitud del sistema de SiBiF.");
			  this.doReturn();
			  break;
		  }

		  return;

	  }

	  protected void step2 ( ParameterSet ps )
	  {


		  /*BEGIN Inicializar los DSD a utilizarse*/

		  	CLIENTES2_DSD = this.dm.create ( "CLIENTES2_DSD" );
		    CLIENTES2_DSD_ID = CLIENTES2_DSD.getId ( );
		    CLIENTES2_STATUS_CODE = RallyDataStoreException.getDefault ( );

		    if ( ! Compare.equals ( CLIENTES2_STATUS_CODE, 0 ) )
		    {
		      this.app.setError ( 0, CLIENTES2_STATUS_CODE );
		    }

		    INGRESOS_CLIENTE_2_DSD = this.dm.create ( "INGRESOS_CLIENTE_2_DSD" );
		    INGRESOS_CLIENTE_2_DSD_ID = INGRESOS_CLIENTE_2_DSD.getId ( );
		    INGRESOS_CLIENTE_2_STATUS_CODE = RallyDataStoreException.getDefault ( );

		    if ( ! Compare.equals ( INGRESOS_CLIENTE_2_STATUS_CODE, 0 ) )
		    {
		      this.app.setError ( 0, INGRESOS_CLIENTE_2_STATUS_CODE );
		    }

		    RECURSOS_CLIENTE_2_DSD = this.dm.create ( "RECURSOS_CLIENTE_2_DSD" );
		    RECURSOS_CLIENTE_2_DSD_ID = RECURSOS_CLIENTE_2_DSD.getId ( );
		    RECURSOS_CLIENTE_STATUS_CODE = RallyDataStoreException.getDefault ( );

		    if ( ! Compare.equals ( RECURSOS_CLIENTE_STATUS_CODE, 0 ) )
		    {
		      this.app.setError ( 0, RECURSOS_CLIENTE_STATUS_CODE );
		    }

		    DEDUCCIONES_CLIENTE2_DSD = this.dm.create ( "DEDUCCIONES_CLIENTE2_DSD" );
		    DEDUCCIONES_CLIENTE2_DSD_ID = DEDUCCIONES_CLIENTE2_DSD.getId ( );
		    DEDUCCIONES_CLIENTE2_STATUS_CODE = RallyDataStoreException.getDefault ( );

		    if ( ! Compare.equals ( DEDUCCIONES_CLIENTE2_STATUS_CODE, 0 ) )
		    {
		      this.app.setError ( 0, DEDUCCIONES_CLIENTE2_STATUS_CODE );
		    }

		    DIRECCIONES_DSD = this.dm.create ( "DIRECCIONES_DSD" );
		    DIRECCIONES_DSD_ID = DIRECCIONES_DSD.getId ( );
		    DIRECCIONES_STATUS_CODE = RallyDataStoreException.getDefault ( );

		    if ( ! Compare.equals ( DIRECCIONES_STATUS_CODE, 0 ) )
		    {
		      this.app.setError ( 0, DIRECCIONES_STATUS_CODE );
		    }

		    CLIENTE_AGENCIA2_DSD = this.dm.create ( "CLIENTE_AGENCIA2_DSD" );
		    CLIENTE_AGENCIA2_DSD_ID = CLIENTE_AGENCIA2_DSD.getId ( );
		    CLIENTE_AGENCIA2_STATUS_CODE = RallyDataStoreException.getDefault ( );

		    if ( ! Compare.equals ( CLIENTE_AGENCIA2_STATUS_CODE, 0 ) )
		    {
		      this.app.setError ( 0, CLIENTE_AGENCIA2_STATUS_CODE );
		    }

		    /*END Inicializar los DSD a utilizarse*/


		    /* Insertar cliente solicitante. */

		    CLIENTES2_STATUS_CODE = this.dm.reset( CLIENTES2_DSD_ID );

		    if ( Compare.equals ( CLIENTES2_STATUS_CODE, 0 )  )
		    {

		    	this.dm.setField(CLIENTES2_DSD, "RMO_OFICINA", this.preQualObj.getRmo());
		    	this.dm.setField(CLIENTES2_DSD, "SEGURO_SOCIAL_CLIENTE", Double.parseDouble( this.preQualObj.getCustomer().getSSID() ) );
		    	this.dm.setField(CLIENTES2_DSD, "SEGURO_SOCIAL_JEFE_FAMILIA", this.preQualObj.getCustomer().getMainPersonSSID());
		    	this.dm.setField(CLIENTES2_DSD, "DSC_APELLIDO_PATERNO", this.preQualObj.getCustomer().getPaternalLastName());

		    	if ( ! Compare.equals( this.preQualObj.getCustomer().getMaternalLastName(), "NA" ) ){
		    		this.dm.setField(CLIENTES2_DSD, "DSC_APELLIDO_MATERNO", this.preQualObj.getCustomer().getMaternalLastName());
		    	}


		    	this.dm.setField(CLIENTES2_DSD, "DSC_NOMBRE", this.preQualObj.getCustomer().getName());
		    	this.dm.setField(CLIENTES2_DSD, "FCH_NACIMIENTO", this.preQualObj.getCustomer().getBirthDate().toGregorianCalendar().getTime() );

		    	if ( ! Compare.equals( this.preQualObj.getCustomer().getInitial(), "NA" ) ){

		    		this.dm.setField(CLIENTES2_DSD, "DSC_INICIAL", this.preQualObj.getCustomer().getInitial());
		    	}

		    	if ( ! Compare.equals( this.preQualObj.getCustomer().getNickname(), "NA" ) ){
		    		this.dm.setField(CLIENTES2_DSD, "DSC_APODO", this.preQualObj.getCustomer().getNickname());
		    	}

		    	this.dm.setField(CLIENTES2_DSD, "COD_PARENTESCO_FAM", this.preQualObj.getCustomer().getRelationshipToMain());
		    	this.dm.setField(CLIENTES2_DSD, "SEXO", this.preQualObj.getCustomer().getGender());

		    	if ( ! Compare.equals( this.preQualObj.getCustomer().getPhoneHome(), "NA" ) ){
		    		this.dm.setField(CLIENTES2_DSD, "TELEFONO_HOGAR", this.preQualObj.getCustomer().getPhoneHome());
		    	}

		    	if ( ! Compare.equals( this.preQualObj.getCustomer().getPhoneWork(), "NA" ) ){
		    		this.dm.setField(CLIENTES2_DSD, "TELEFONO_HOGAR", this.preQualObj.getCustomer().getPhoneWork());
		    	}

		    	this.dm.setField(CLIENTES2_DSD, "COD_CIUDADANIA", this.preQualObj.getCustomer().getCitizenship());
		    	this.dm.setField(CLIENTES2_DSD, "COD_ESCOLARIDAD", this.preQualObj.getCustomer().getScholarity());
		    	this.dm.setField(CLIENTES2_DSD, "COD_ESTADO_CIVIL", this.preQualObj.getCustomer().getCivilStatus());

		    	if ( this.preQualObj.getCustomer().isFulltimeStudent() ){
		    		this.dm.setField(CLIENTES2_DSD, "ESTUDIA_TIEMPO_COMPLETO", "S");
		    	}
		    	else
		    	{
		    		this.dm.setField(CLIENTES2_DSD, "ESTUDIA_TIEMPO_COMPLETO", "N");
		    	}


		    	if ( this.preQualObj.getCustomer().isVeteran() ){
		    		this.dm.setField(CLIENTES2_DSD, "FLG_VET", "S");
		    	}
		    	else
		    	{
		    		this.dm.setField(CLIENTES2_DSD, "FLG_VET", "N");
		    	}

		    	if ( this.preQualObj.getCustomer().isVocationalRehabilitation()){
		    		this.dm.setField(CLIENTES2_DSD, "FLG_REHABILITACION_VOC", "S");
		    	}
		    	else
		    	{
		    		this.dm.setField(CLIENTES2_DSD, "FLG_REHABILITACION_VOC", "N");
		    	}

		    	CLIENTES2_STATUS_CODE = this.dm.insertRow( CLIENTES2_DSD_ID );
		    	this.dm.dbCommit();

		    }

		    if ( this.preQualObj.getCustomer().getMinorDetails().isTakingCareExpenses() )
		    {
		    	DEDUCCIONES_CLIENTE2_STATUS_CODE = this.dm.reset(DEDUCCIONES_CLIENTE2_DSD_ID);

    			this.dm.setField(DEDUCCIONES_CLIENTE2_DSD, "COD_TIPO_DEDUCCIONE", "CUID");
	    		this.dm.setField(DEDUCCIONES_CLIENTE2_DSD, "VLR_CANTIDAD_DEDUCCIONE", this.preQualObj.getCustomer().getMinorDetails().getTakingCareExpensesAmount() );
	    		this.dm.setField(DEDUCCIONES_CLIENTE2_DSD, "RMO_OFICINA", this.preQualObj.getRmo() );
	    		this.dm.setField(DEDUCCIONES_CLIENTE2_DSD, "SEGURO_SOCIAL_CLIENTE", Double.parseDouble( this.preQualObj.getCustomer().getSSID() ));

	    		DEDUCCIONES_CLIENTE2_STATUS_CODE = this.dm.insertRow(DEDUCCIONES_CLIENTE2_DSD);
	    		this.dm.dbCommit();
		    }

		    /*Insertar direccion residencial del solicitante*/

		    DIRECCIONES_STATUS_CODE = this.dm.reset( DIRECCIONES_DSD_ID );

		    if ( Compare.equals ( DIRECCIONES_STATUS_CODE, 0 )  )
		    {

		    	//Se supone que la dirección residencial siempre viene con datos. Verificar como manejar las que no vienen con datos.

		    	this.dm.setField(DIRECCIONES_DSD, "RMO_OFICINA", this.preQualObj.getRmo());
		    	this.dm.setField(DIRECCIONES_DSD, "SEGURO_SOCIAL_JEFE_FAM", Double.parseDouble( this.preQualObj.getCustomer().getSSID()));
		    	this.dm.setField(DIRECCIONES_DSD, "COD_TIPO_DIRECCION", this.preQualObj.getCustomer().getResidentialAddress().getAddressType());
		    	this.dm.setField(DIRECCIONES_DSD, "DSC_DIRECCION_1", this.preQualObj.getCustomer().getResidentialAddress().getLine1());
		    	this.dm.setField(DIRECCIONES_DSD, "DSC_DIRECCION_2", this.preQualObj.getCustomer().getResidentialAddress().getLine2());
		    	this.dm.setField(DIRECCIONES_DSD, "ZIP_CODE", this.preQualObj.getCustomer().getResidentialAddress().getZipCode());
		    	this.dm.setField(DIRECCIONES_DSD, "COD_MUNICIPIO", this.retriveCodMun( this.preQualObj.getCustomer().getResidentialAddress().getZipCode() ) );

		    	DIRECCIONES_STATUS_CODE = this.dm.insertRow( DIRECCIONES_DSD_ID );
		    	this.dm.dbCommit();

		    }

		    //Insertar dirección postal del solicitante. Al momento la direccion residencial se inserta como postal tambien en SAIC,
		    //ya que SiBiF actualmente no esta recogiendo dirección postal.

		    DIRECCIONES_STATUS_CODE = this.dm.reset( DIRECCIONES_DSD_ID );

		    if ( Compare.equals ( DIRECCIONES_STATUS_CODE, 0 )  )
		    {

		    	//if ( ! ( Compare.equals(this.preQualObj.getCustomer().getMailingAddress().getLine1(), "NA") && Compare.equals(this.preQualObj.getCustomer().getMailingAddress().getLine2(), "NA") ) || Compare.equals(this.preQualObj.getCustomer().getMailingAddress().getZipCode(), "NA"))
		    	//{

		    		this.dm.setField(DIRECCIONES_DSD, "RMO_OFICINA", this.preQualObj.getRmo());
		    		this.dm.setField(DIRECCIONES_DSD, "SEGURO_SOCIAL_JEFE_FAM", Double.parseDouble( this.preQualObj.getCustomer().getSSID()));
		    		this.dm.setField(DIRECCIONES_DSD, "COD_TIPO_DIRECCION", "POST");
		    		this.dm.setField(DIRECCIONES_DSD, "DSC_DIRECCION_1", this.preQualObj.getCustomer().getResidentialAddress().getLine1());
		    		this.dm.setField(DIRECCIONES_DSD, "DSC_DIRECCION_2", this.preQualObj.getCustomer().getResidentialAddress().getLine2());
		    		this.dm.setField(DIRECCIONES_DSD, "ZIP_CODE", this.preQualObj.getCustomer().getResidentialAddress().getZipCode());
		    		this.dm.setField(DIRECCIONES_DSD, "COD_MUNICIPIO", this.retriveCodMun( this.preQualObj.getCustomer().getResidentialAddress().getZipCode() ) );

		    		DIRECCIONES_STATUS_CODE = this.dm.insertRow( DIRECCIONES_DSD_ID );
		    		this.dm.dbCommit();
		    	//}

		    }

		    //Insertar los ingresos del solicitante.

		    Iterator<Income> incomeIter = this.preQualObj.getCustomer().getIncomes().getIncome().iterator();

		    INGRESOS_CLIENTE_2_STATUS_CODE = this.dm.reset( INGRESOS_CLIENTE_2_DSD_ID );

		    if ( Compare.equals ( INGRESOS_CLIENTE_2_STATUS_CODE, 0 )  )
		    {

		    	for (; incomeIter.hasNext();)
		    	{

		    		//Insertar Incomes
		    		Income income = incomeIter.next();
		    		if ( ! Compare.equals( income.getType(), "NA" ) )
		    		{
		    			this.dm.setField(INGRESOS_CLIENTE_2_DSD, "VLR_CANTIDAD_INGRESO", income.getAmount());
		    			this.dm.setField(INGRESOS_CLIENTE_2_DSD, "FLG_FRECUENCIA", income.getFrequency().substring(0, 1));
		    			this.dm.setField(INGRESOS_CLIENTE_2_DSD, "COD_TIPO_INGRESO", income.getType());
		    			this.dm.setField(INGRESOS_CLIENTE_2_DSD, "SEGURO_SOCIAL_CLIENTE", Double.parseDouble( this.preQualObj.getCustomer().getSSID() ));
		    			this.dm.setField(INGRESOS_CLIENTE_2_DSD, "RMO_OFICINA", this.preQualObj.getRmo() );

		    			INGRESOS_CLIENTE_2_STATUS_CODE = this.dm.insertRow(INGRESOS_CLIENTE_2_DSD_ID);
		    			this.dm.dbCommit();
		    		}

		    	}


		    }

		    //Insertar los recursos del solicitante.

		    Iterator<Resource> resIter = this.preQualObj.getCustomer().getResources().getResource().iterator();

		    RECURSOS_CLIENTE_STATUS_CODE = this.dm.reset( RECURSOS_CLIENTE_2_DSD_ID );

		    if ( Compare.equals ( RECURSOS_CLIENTE_STATUS_CODE, 0 )  )
		    {

		    	for (; resIter.hasNext();)
		    	{
		    		//Insertar Recursos
		    		Resource res = resIter.next();
		    		if ( ! Compare.equals( res.getType(), "NA" ) )
		    		{
		    			this.dm.setField(RECURSOS_CLIENTE_2_DSD, "VLR_CANTIDAD_RECURSO", res.getValue());
		    			this.dm.setField(RECURSOS_CLIENTE_2_DSD, "COD_TIPO_RECURSO", res.getType());
		    			this.dm.setField(RECURSOS_CLIENTE_2_DSD, "SEGURO_SOCIAL_CLIENTE", Double.parseDouble( this.preQualObj.getCustomer().getSSID() ));
		    			this.dm.setField(RECURSOS_CLIENTE_2_DSD, "RMO_OFICINA", this.preQualObj.getRmo() );

		    			RECURSOS_CLIENTE_STATUS_CODE = this.dm.insertRow(RECURSOS_CLIENTE_2_DSD_ID);
		    			this.dm.dbCommit();
		    		}

		    	}
		    }

		  //Verificar e insertar si el cliente solicitante tiene incapacidad.

		    CLIENTE_AGENCIA2_STATUS_CODE = this.dm.reset( CLIENTE_AGENCIA2_DSD_ID );
		    CLIENTES2_STATUS_CODE = this.dm.reset(CLIENTES2_DSD_ID);

		    if ( ! Compare.equals(this.preQualObj.getCustomer().getDisability().getCode(), "NA"))
		    {
		    	if ( Compare.equals ( CLIENTE_AGENCIA2_STATUS_CODE, 0 )  )
			    {
		    		if ( ! Compare.equals(this.preQualObj.getCustomer().getDisability().getCertifyingAgencyCode(), "NA") )
		    		{
		    			this.dm.setField(CLIENTE_AGENCIA2_DSD, "COD_AGENCIA", this.preQualObj.getCustomer().getDisability().getCertifyingAgencyCode());
				    	this.dm.setField(CLIENTE_AGENCIA2_DSD, "SEGURO_SOCIAL_CLIENTE", Double.parseDouble( this.preQualObj.getCustomer().getSSID() ));
				    	this.dm.setField(CLIENTE_AGENCIA2_DSD, "RMO_OFICINA", this.preQualObj.getRmo());

				    	CLIENTE_AGENCIA2_STATUS_CODE = this.dm.insertRow(CLIENTE_AGENCIA2_DSD_ID);
				    	this.dm.dbCommit();
		    		}

			    	//Actualizar el record de cliente ya insertado con el codigo de la incapacidad.
			    	this.dm.setField ( this.dm.get ( "CLIENTES2_DSD" ), "SEGURO_SOCIAL_CLIENTE", Double.parseDouble( this.preQualObj.getCustomer().getSSID() ) );
			    	CLIENTES2_STATUS_CODE  = this.dm.limitQueryFromBuffer ( CLIENTES2_DSD_ID );
			    	CLIENTES2_STATUS_CODE  = this.dm.retrieve ( CLIENTES2_DSD_ID );

			    	if ( Compare.equals ( CLIENTES2_STATUS_CODE, 0 ) )
			        {
			    		CLIENTES2_STATUS_CODE  = this.dm.firstRow ( CLIENTES2_DSD_ID );
			    		this.dm.setField(CLIENTES2_DSD, "COD_INCAPACIDAD_PRIMARIA", this.preQualObj.getCustomer().getDisability().getCode());
			    		this.dm.setField(CLIENTES2_DSD, "FLG_INCAPACIDAD_VERIFICADA", "N");

			    		CLIENTES2_STATUS_CODE = this.dm.update(CLIENTES2_DSD_ID);
			    		this.dm.dbCommit();
			        }

			    	//Insertar la deducción por incapacidad.
			    	DEDUCCIONES_CLIENTE2_STATUS_CODE = this.dm.reset(DEDUCCIONES_CLIENTE2_DSD_ID);

			    	if ( Compare.equals ( DEDUCCIONES_CLIENTE2_STATUS_CODE, 0 )  )
			    	{
			    		//Insertar los gastos medicos que tenga por la incapacidad.
			    		if ( this.preQualObj.getCustomer().getDisability().isMedicalExpenses() )
			    		{
			    			this.dm.setField(DEDUCCIONES_CLIENTE2_DSD, "COD_TIPO_DEDUCCIONE", "MEDI");
			    			this.dm.setField(DEDUCCIONES_CLIENTE2_DSD, "VLR_CANTIDAD_DEDUCCIONE", "100");
			    			this.dm.setField(DEDUCCIONES_CLIENTE2_DSD, "RMO_OFICINA", this.preQualObj.getRmo() );
			    			this.dm.setField(DEDUCCIONES_CLIENTE2_DSD, "SEGURO_SOCIAL_CLIENTE", Double.parseDouble( this.preQualObj.getCustomer().getSSID() ) );

			    			DEDUCCIONES_CLIENTE2_STATUS_CODE = this.dm.insertRow(DEDUCCIONES_CLIENTE2_DSD_ID);
			    			this.dm.dbCommit();
			    		}

			    		//Insertar gasto por cuido de incapacitado.
			    		if ( this.preQualObj.getCustomer().getDisability().isTakingCareExpenses() )
			    		{
			    			DEDUCCIONES_CLIENTE2_STATUS_CODE = this.dm.reset(DEDUCCIONES_CLIENTE2_DSD_ID);

			    			this.dm.setField(DEDUCCIONES_CLIENTE2_DSD, "COD_TIPO_DEDUCCIONE", "CUID");
				    		this.dm.setField(DEDUCCIONES_CLIENTE2_DSD, "VLR_CANTIDAD_DEDUCCIONE", this.preQualObj.getCustomer().getDisability().getTakingCareExpensesAmount());
				    		this.dm.setField(DEDUCCIONES_CLIENTE2_DSD, "RMO_OFICINA", this.preQualObj.getRmo() );
				    		this.dm.setField(DEDUCCIONES_CLIENTE2_DSD, "SEGURO_SOCIAL_CLIENTE", Double.parseDouble( this.preQualObj.getCustomer().getSSID() ));

				    		DEDUCCIONES_CLIENTE2_STATUS_CODE = this.dm.insertRow(DEDUCCIONES_CLIENTE2_DSD);
				    		this.dm.dbCommit();
			    		}

			    	}
			    }
		    }




		    //Insertar dependientes.
		    Iterator<Person> depIter = this.preQualObj.getDependents().getPerson().iterator();

		    CLIENTES2_STATUS_CODE = this.dm.reset( CLIENTES2_DSD_ID );

		    if ( Compare.equals ( CLIENTES2_STATUS_CODE, 0 )  )
		    {
		    	for (; depIter.hasNext();)
		    	{
		    		//Obtener un seguro social sustituto para los dependientes a procesar
		    		subSSID = ssidSub();
		    		//Insertar personas
		    		Person per = depIter.next();
		    		this.dm.setField(CLIENTES2_DSD, "RMO_OFICINA", this.preQualObj.getRmo());
			    	this.dm.setField(CLIENTES2_DSD, "SEGURO_SOCIAL_CLIENTE", subSSID );
			    	this.dm.setField(CLIENTES2_DSD, "SEGURO_SOCIAL_JEFE_FAMILIA", per.getMainPersonSSID());
			    	this.dm.setField(CLIENTES2_DSD, "DSC_APELLIDO_PATERNO", per.getPaternalLastName());

			    	if ( ! Compare.equals( per.getMaternalLastName(), "NA" ) ){
			    		this.dm.setField(CLIENTES2_DSD, "DSC_APELLIDO_MATERNO", per.getMaternalLastName());
			    	}


			    	this.dm.setField(CLIENTES2_DSD, "DSC_NOMBRE", per.getName());
			    	this.dm.setField(CLIENTES2_DSD, "FCH_NACIMIENTO", per.getBirthDate().toGregorianCalendar().getTime() );

			    	if ( ! Compare.equals( per.getInitial(), "NA" ) ){

			    		this.dm.setField(CLIENTES2_DSD, "DSC_INICIAL", per.getInitial());
			    	}

			    	if ( ! Compare.equals( per.getNickname(), "NA" )){
			    		this.dm.setField(CLIENTES2_DSD, "DSC_APODO", per.getNickname());
			    	}

			    	this.dm.setField(CLIENTES2_DSD, "COD_PARENTESCO_FAM", per.getRelationshipToMain());
			    	this.dm.setField(CLIENTES2_DSD, "SEXO", per.getGender());

			    	if ( ! Compare.equals( per.getPhoneHome(), "NA" ) ){
			    		this.dm.setField(CLIENTES2_DSD, "TELEFONO_HOGAR", per.getPhoneHome());
			    	}

			    	if ( ! Compare.equals( per.getPhoneWork(), "NA" ) ){
			    		this.dm.setField(CLIENTES2_DSD, "TELEFONO_HOGAR", per.getPhoneWork());
			    	}

			    	this.dm.setField(CLIENTES2_DSD, "COD_CIUDADANIA", per.getCitizenship());
			    	this.dm.setField(CLIENTES2_DSD, "COD_ESCOLARIDAD", per.getScholarity());
			    	this.dm.setField(CLIENTES2_DSD, "COD_ESTADO_CIVIL", per.getCivilStatus());

			    	if ( per.isFulltimeStudent()){
			    		this.dm.setField(CLIENTES2_DSD, "ESTUDIA_TIEMPO_COMPLETO", "S");
			    	}
			    	else
			    	{
			    		this.dm.setField(CLIENTES2_DSD, "ESTUDIA_TIEMPO_COMPLETO", "N");
			    	}


			    	if ( per.isVeteran())
			    	{
			    		this.dm.setField(CLIENTES2_DSD, "FLG_VET", "S");
			    	}
			    	else
			    	{
			    		this.dm.setField(CLIENTES2_DSD, "FLG_VET", "N");
			    	}

			    	if ( per.isVocationalRehabilitation())
			    	{
			    		this.dm.setField(CLIENTES2_DSD, "FLG_REHABILITACION_VOC", "S");
			    	}
			    	else
			    	{
			    		this.dm.setField(CLIENTES2_DSD, "FLG_REHABILITACION_VOC", "N");
			    	}

			    	CLIENTES2_STATUS_CODE = this.dm.insertRow(CLIENTES2_DSD_ID);
			    	this.dm.dbCommit();

			    	//Insertar detalles de cuido.

			    	if ( per.getMinorDetails().isTakingCareExpenses() )
				    {
				    	DEDUCCIONES_CLIENTE2_STATUS_CODE = this.dm.reset(DEDUCCIONES_CLIENTE2_DSD_ID);

		    			this.dm.setField(DEDUCCIONES_CLIENTE2_DSD, "COD_TIPO_DEDUCCIONE", "CUID");
			    		this.dm.setField(DEDUCCIONES_CLIENTE2_DSD, "VLR_CANTIDAD_DEDUCCIONE", per.getMinorDetails().getTakingCareExpensesAmount() );
			    		this.dm.setField(DEDUCCIONES_CLIENTE2_DSD, "RMO_OFICINA", this.preQualObj.getRmo() );
			    		this.dm.setField(DEDUCCIONES_CLIENTE2_DSD, "SEGURO_SOCIAL_CLIENTE", subSSID );

			    		DEDUCCIONES_CLIENTE2_STATUS_CODE = this.dm.insertRow(DEDUCCIONES_CLIENTE2_DSD);
			    		this.dm.dbCommit();
				    }


			    	//Insertar incomes de dependientes
			    	 Iterator<Income> perIncomeIter = per.getIncomes().getIncome().iterator();

					    INGRESOS_CLIENTE_2_STATUS_CODE = this.dm.reset( INGRESOS_CLIENTE_2_DSD );

					    if ( Compare.equals ( INGRESOS_CLIENTE_2_STATUS_CODE, 0 )  )
					    {

					    	for (; perIncomeIter.hasNext();)
					    	{
					    		//Insertar Incomes
					    		Income perIncome = perIncomeIter.next();
					    		if ( ! Compare.equals( perIncome.getType(), "NA" ) )
					    		{
					    			this.dm.setField(INGRESOS_CLIENTE_2_DSD, "VLR_CANTIDAD_INGRESO", perIncome.getAmount());
					    			this.dm.setField(INGRESOS_CLIENTE_2_DSD, "FLG_FRECUENCIA", perIncome.getFrequency().substring(0, 1));
					    			this.dm.setField(INGRESOS_CLIENTE_2_DSD, "COD_TIPO_INGRESO", perIncome.getType());
					    			this.dm.setField(INGRESOS_CLIENTE_2_DSD, "SEGURO_SOCIAL_CLIENTE", subSSID );
					    			this.dm.setField(INGRESOS_CLIENTE_2_DSD, "RMO_OFICINA", this.preQualObj.getRmo() );

					    			INGRESOS_CLIENTE_2_STATUS_CODE = this.dm.insertRow(INGRESOS_CLIENTE_2_DSD_ID);
					    			this.dm.dbCommit();
					    		}
					    	}


					    }

					    Iterator<Resource> perResIter = per.getResources().getResource().iterator();

					    RECURSOS_CLIENTE_STATUS_CODE = this.dm.reset( RECURSOS_CLIENTE_2_DSD );

					    if ( Compare.equals ( RECURSOS_CLIENTE_STATUS_CODE, 0 )  )
					    {

					    	for (; perResIter.hasNext();)
					    	{
					    		//Insertar Recursos
					    		Resource perRes = perResIter.next();
					    		if ( ! Compare.equals( perRes.getType(), "NA" ) )
					    		{
					    			this.dm.setField(RECURSOS_CLIENTE_2_DSD, "VLR_CANTIDAD_RECURSO", perRes.getValue());
					    			this.dm.setField(RECURSOS_CLIENTE_2_DSD, "COD_TIPO_RECURSO", perRes.getType());
					    			this.dm.setField(RECURSOS_CLIENTE_2_DSD, "SEGURO_SOCIAL_CLIENTE", subSSID );
					    			this.dm.setField(RECURSOS_CLIENTE_2_DSD, "RMO_OFICINA", this.preQualObj.getRmo() );

					    			RECURSOS_CLIENTE_STATUS_CODE = this.dm.insertRow(RECURSOS_CLIENTE_2_DSD_ID);
					    			this.dm.dbCommit();
					    		}

					    	}
					    }

					  //Verificar e insertar si los dependientes tienen incapacidad.

					    CLIENTE_AGENCIA2_STATUS_CODE = this.dm.reset( CLIENTE_AGENCIA2_DSD_ID );
					    CLIENTES2_STATUS_CODE = this.dm.reset(CLIENTES2_DSD_ID);

					    if ( ! Compare.equals( per.getDisability().getCode(), "NA") )
					    {
					    	if ( Compare.equals ( CLIENTE_AGENCIA2_STATUS_CODE, 0 )  )
						    {
					    		if ( ! Compare.equals(per.getDisability().getCertifyingAgencyCode(), "NA") )
					    		{
					    			this.dm.setField(CLIENTE_AGENCIA2_DSD, "COD_AGENCIA", per.getDisability().getCertifyingAgencyCode());
							    	this.dm.setField(CLIENTE_AGENCIA2_DSD, "SEGURO_SOCIAL_CLIENTE", subSSID);
							    	this.dm.setField(CLIENTE_AGENCIA2_DSD, "RMO_OFICINA", this.preQualObj.getRmo());

							    	CLIENTE_AGENCIA2_STATUS_CODE = this.dm.insertRow(CLIENTE_AGENCIA2_DSD_ID);
							    	this.dm.dbCommit();
					    		}

						    	//Actualizar el record de cliente ya insertado con el codigo de la incapacidad.
						    	this.dm.setField ( this.dm.get ( "CLIENTES2_DSD" ), "SEGURO_SOCIAL_CLIENTE", subSSID );
						    	CLIENTES2_STATUS_CODE  = this.dm.limitQueryFromBuffer ( CLIENTES2_DSD_ID );
						    	CLIENTES2_STATUS_CODE  = this.dm.retrieve ( CLIENTES2_DSD_ID );

						    	if ( Compare.equals ( CLIENTES2_STATUS_CODE, 0 ) )
						        {
						    		CLIENTES2_STATUS_CODE  = this.dm.firstRow ( CLIENTES2_DSD_ID );
						    		this.dm.setField(CLIENTES2_DSD, "COD_INCAPACIDAD_PRIMARIA", per.getDisability().getCode());
						    		this.dm.setField(CLIENTES2_DSD, "FLG_INCAPACIDAD_VERIFICADA", "N");

						    		CLIENTES2_STATUS_CODE = this.dm.update(CLIENTES2_DSD_ID);
						    		this.dm.dbCommit();
						        }

						    	//Insertar la deducción por incapacidad.
						    	DEDUCCIONES_CLIENTE2_STATUS_CODE = this.dm.reset(DEDUCCIONES_CLIENTE2_DSD_ID);

						    	if ( Compare.equals ( DEDUCCIONES_CLIENTE2_STATUS_CODE, 0 )  )
						    	{
						    		//Insertar los gastos medicos que tenga por la incapacidad.
						    		if ( per.getDisability().isMedicalExpenses() )
						    		{
						    			this.dm.setField(DEDUCCIONES_CLIENTE2_DSD, "COD_TIPO_DEDUCCIONE", "MEDI");
						    			this.dm.setField(DEDUCCIONES_CLIENTE2_DSD, "VLR_CANTIDAD_DEDUCCIONE", "100");
						    			this.dm.setField(DEDUCCIONES_CLIENTE2_DSD, "RMO_OFICINA", this.preQualObj.getRmo() );
						    			this.dm.setField(DEDUCCIONES_CLIENTE2_DSD, "SEGURO_SOCIAL_CLIENTE", subSSID );

						    			DEDUCCIONES_CLIENTE2_STATUS_CODE = this.dm.insertRow(DEDUCCIONES_CLIENTE2_DSD_ID);
						    			this.dm.dbCommit();
						    		}

						    		//Insertar gasto por cuido de incapacitado.
						    		if ( per.getDisability().isTakingCareExpenses() )
						    		{
						    			DEDUCCIONES_CLIENTE2_STATUS_CODE = this.dm.reset(DEDUCCIONES_CLIENTE2_DSD_ID);

						    			this.dm.setField(DEDUCCIONES_CLIENTE2_DSD, "COD_TIPO_DEDUCCIONE", "CUID");
							    		this.dm.setField(DEDUCCIONES_CLIENTE2_DSD, "VLR_CANTIDAD_DEDUCCIONE", per.getDisability().getTakingCareExpensesAmount());
							    		this.dm.setField(DEDUCCIONES_CLIENTE2_DSD, "RMO_OFICINA", this.preQualObj.getRmo() );
							    		this.dm.setField(DEDUCCIONES_CLIENTE2_DSD, "SEGURO_SOCIAL_CLIENTE", subSSID );

							    		DEDUCCIONES_CLIENTE2_STATUS_CODE = this.dm.insertRow(DEDUCCIONES_CLIENTE2_DSD);
							    		this.dm.dbCommit();
						    		}

						    	}
						    }
					    }//if closing brace for checking disability flag of dependents

			    }//for closing brace for persons iterator


		    }//if closing brace for inserting persons.

		    this.app.setError("0", "La solicitud fue registrada exitosamente.");
		    this.app.callCommand("FINISH ACTION");
		    this.doReturn();

	  }//step1 closing brace

	  public double retriveCodMun (String zip)
	  {

		  double codMun = 0;

			ZIP_RO_RO_DSD = this.dm.create ( "ZIP_RO_RO_DSD" );
		  	ZIP_RO_RO_DSD_ID = ZIP_RO_RO_DSD.getId ( );
		  	ZIP_RO_RO_DSD_STATUS_CODE = RallyDataStoreException.getDefault ( );

		  	ZIP_RO_RO_DSD_STATUS_CODE  = this.dm.reset ( ZIP_RO_RO_DSD_ID );

	        this.dm.setField ( ZIP_RO_RO_DSD, "ZIP_CODE", Double.parseDouble( zip ) );

	        ZIP_RO_RO_DSD_STATUS_CODE  = this.dm.limitQueryFromBuffer ( ZIP_RO_RO_DSD_ID );
	        ZIP_RO_RO_DSD_STATUS_CODE  = this.dm.retrieve ( ZIP_RO_RO_DSD_ID );

	        if ( Compare.equals ( ZIP_RO_RO_DSD_STATUS_CODE, 0 ) )
	        {
	        	ZIP_RO_RO_DSD_STATUS_CODE  = this.dm.firstRow ( ZIP_RO_RO_DSD_ID );

	          if ( Compare.equals ( ZIP_RO_RO_DSD_STATUS_CODE, 0 ) )
	          {
	        	codMun = this.dm.getFieldDouble( this.dm.get ( "ZIP_RO_RO_DSD" ), "COD_MUNICIPIO" );
	          }
	        }
	        this.dm.dbClose ( ZIP_RO_RO_DSD_ID );

		  return codMun;
	  } // function closing brace

	  public double ssidSub ( )
	  {
		  double ssidSub = 0;

		  SEGURO_SOCIAL_SUST_DSD = this.dm.create( "SEGURO_SOCIAL_SUST_DSD" );
		  SEGURO_SOCIAL_SUST_DSD_ID = SEGURO_SOCIAL_SUST_DSD.getId();
		  SEGURO_SOCIAL_SUST_DSD_STATUS_CODE = RallyDataStoreException.getDefault ( );

		  SEGURO_SOCIAL_SUST_DSD_STATUS_CODE = this.dm.reset( SEGURO_SOCIAL_SUST_DSD_ID );

		  SEGURO_SOCIAL_SUST_DSD_STATUS_CODE  = this.dm.limitQueryFromBuffer ( SEGURO_SOCIAL_SUST_DSD_ID );
		  SEGURO_SOCIAL_SUST_DSD_STATUS_CODE  = this.dm.retrieve ( SEGURO_SOCIAL_SUST_DSD_ID );

		  if ( Compare.equals ( SEGURO_SOCIAL_SUST_DSD_STATUS_CODE, 0 ) )
		  {
			  SEGURO_SOCIAL_SUST_DSD_STATUS_CODE  = this.dm.firstRow ( SEGURO_SOCIAL_SUST_DSD_ID );

			  if ( Compare.equals ( SEGURO_SOCIAL_SUST_DSD_STATUS_CODE, 0 ) )
			  {
				  ssidSub = this.dm.getFieldDouble( this.dm.get ( "SEGURO_SOCIAL_SUST_DSD" ), "SEGURO_SOCIAL" );

				  ssidSub = MathService.plus(ssidSub, 1);

				  this.dm.setField ( SEGURO_SOCIAL_SUST_DSD, "SEGURO_SOCIAL", ssidSub );

				  this.dm.update(SEGURO_SOCIAL_SUST_DSD_ID);

			  }
		  }

		  this.dm.dbCommit();

	      this.dm.dbClose ( SEGURO_SOCIAL_SUST_DSD_ID );

		  return ssidSub;
	  }

}//class closing brace
