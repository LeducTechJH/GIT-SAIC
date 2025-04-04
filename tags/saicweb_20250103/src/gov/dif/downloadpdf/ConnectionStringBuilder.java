package gov.dif.downloadpdf;

public class ConnectionStringBuilder 
{

	public static class ConnectionStringClass 
	{
		public String DRIVER;
		public String DataBaseURL;
		public String LOGIN;
		public String PASSWORD;
		public String SCHEMA;
	}

	public ConnectionStringClass ConvertString(String conString) 
	{
		ConnectionStringClass cs = new ConnectionStringClass();

		String[] ArrayConString = conString.split(";");

		for (int i = 0; i < 5; i++) {
			if (ArrayConString[i].contains("DRIVER")) {
				cs.DRIVER = ArrayConString[i].substring(ArrayConString[i].indexOf("{") + 1);
				cs.DRIVER = cs.DRIVER.replace("}", "");
			}
			if (ArrayConString[i].contains("DataBaseURL")) {
				cs.DataBaseURL = ArrayConString[i].substring(ArrayConString[i].indexOf("{") + 1);
				cs.DataBaseURL = cs.DataBaseURL.replace("}", "");
			}
			if (ArrayConString[i].contains("LOGIN")) {
				cs.LOGIN = ArrayConString[i].substring(ArrayConString[i].indexOf("{") + 1);
				cs.LOGIN = cs.LOGIN.replace("}", "");
			}
			if (ArrayConString[i].contains("PASSWORD")) {
				cs.PASSWORD = ArrayConString[i].substring(ArrayConString[i].indexOf("{") + 1);
				cs.PASSWORD = cs.PASSWORD.replace("}", "");
			}
			if (ArrayConString[i].contains("SCHEMA")) {
				cs.SCHEMA = ArrayConString[i].substring(ArrayConString[i].indexOf("{") + 1);
				cs.SCHEMA = cs.SCHEMA.replace("}", "");
			}
		}

		return cs;
	}
}
