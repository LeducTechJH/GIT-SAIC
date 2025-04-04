package gov.dif.downloadpdf;

public class TableClass {
	
	public static class Cliente
	{
		
		// Nombre del cliente
		public String NombreCliente;
		public String NombreC;
		public String InicialC;
		public String PaternoC;
		public String MaternoC;
		
		// Nombre del conyuge
		public String NombreConyuge;
		
		// Otros datos del cliente
		public String SSCliente;
		public String FechaNacimiento;
		public String EMail;
		public String NivelEducativo;
		public String TelefonoHogar;
		public String TelefonoCelular;
		public String EstadoCivil;  //  CONSENSUAL SOLTERO
		public String Licencia;
		public String Pasaporte;
				
		// Direccion postal cliente
		public String DireccionPostal; 
		
		//Direccion residencial cliente
		public String DireccionResidencial;
		
		// Informacion del servicio
		public String FechaSolicid;
		public String EstatusServicio;
		public String EstatusEmpleo; // EMPLEADO DESMPLEADO LISENCIA
		public String FrecuenciaIngreso; // S semanal B bisemanal Q quincenal M mensual 
		public String IngrsoAdicional;  // VETERANO RETIRO SEGUROSOCIAL 
		public String CantidadAdicional;
		public String Ocupacion;
		
		// Informacion del patrono
		public String NombrePatrono;
		public String SSPatronal;
		public String TelTrabajo;
		public String DirTrabajoP;
		public String DirTrabajoF;
		
		// Informacion de recursos
		public String ValorRecurso;
		public String DescRecurso;
		
	}
	
	public static class Hijos
	{
		public String Nombre;
		public String SegSoc;
		public String FechaNacimiento;
		public String Edad;
		public String AsisteRegular;
		public String PensionAlimenticia;
		public String CantidadPension;
		public String Frecuencia;
	}
	
	public static class Otros
	{
		public String Nombre;
		public String SegSoc;
		public String FechaNacimiento;
		public String Edad;
		public String Parentesco;
		public String FuenteIngreso;
		public String Cantidad;
	}

}
