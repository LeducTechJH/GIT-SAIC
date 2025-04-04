<%@ page import="java.sql.*" %>
<%@ page import="net.maintrend.datamanager.DataConnectionSql" %>
<%@ page import="net.maintrend.util.*" %>

<%
String conInfo = Configuration.getInstance ( ).get ( "ConnectionString" );

String unParm = request.getParameter("uName");
String passParm = request.getParameter("pWd");

conInfo.toUpperCase ( );
DataConnectionSql sqlConn = new DataConnectionSql ( );
sqlConn.connect ( conInfo );
Connection connection = sqlConn.getConnection ( );


if ( connection != null )
{
 	try {
	CallableStatement csmt = connection.prepareCall("{call SP_CHANGE_PWD(?,?)}");
	csmt.setString(1, unParm);
	csmt.setString(2, passParm);
    csmt.execute();
    out.print("EXEC");
 	}
 	catch (SQLException e){
 		out.print("ORA-" + e.getErrorCode() + e.getMessage());
 	}
}
else
{
	out.print("No se pudo establecer conexión con la base de datos");
}

%>