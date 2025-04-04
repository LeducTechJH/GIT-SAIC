<%@ page import="java.util.*"%>
<%@ page import="java.math.BigDecimal"%>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.ResultSetMetaData" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="net.maintrend.datamanager.DataConnectionSql" %>

<%
String error =  ( String ) session.getAttribute ( "Error" );
String sql = ( String ) session.getAttribute ( "sqlText" );
if ( sql == null ) sql = "";
String rowsNumber = ( String ) session.getAttribute ( "rowsNumber" );
if ( rowsNumber == null ) rowsNumber = "";
int rowNum = 0;
if ( rowsNumber.trim ( ).length ( ) > 0 )
{
  try
  {
    rowNum = Integer.parseInt ( rowsNumber );
  }
  catch ( Exception ew )
  {
    error = "Please, enter required rows number as number";
  }
}

String conInfo = ( String ) session.getAttribute ( "ConnectionInfo" );
if ( conInfo == null ) conInfo = "";

ResultSet rs = null;
DataConnectionSql sqlConn = null;
Connection connection = null;

if ( error == null || error.length ( ) == 0 )
{
  if ( sql.trim ( ).length ( ) == 0 )
  {
    error = "Please, enter SQL expression ";
  }
  else if ( conInfo.trim ( ).length ( ) == 0 )
  {
    error = "DefaultDb node in configuration xml is not defined ";
  }
  else
  {
    try
    {
      sqlConn = new DataConnectionSql ( );
      sqlConn.connect ( conInfo );
      connection = sqlConn.getConnection ( );
      if ( connection != null )
      {
        PreparedStatement pst = connection.prepareStatement ( sql );
        if ( rowNum > 0 ) pst.setMaxRows ( rowNum );
        rs = pst.executeQuery ( );
      }
      else
      {
        error = "Connection is not valid";
      }
    }
    catch ( Exception e )
    {
      error = e.getMessage ( );
    }
  }
}

%>

<html>

<head>
<title></title>
<style type="text/css">
<!-- 
td { font:12px Arial; }
textarea { background:#FFFFFF; color:#000000; font:12px Arial; border:1px solid #7DA5E0; }
div { background:#FFFFFF; color:#3538FF; font:11px Courier New; }
-->
</style>

</head>

<body style="background:url(../images/Background.jpg); background-repeat: repeat;">
<form action="../Nothing.process" method="post" >
<input type="hidden" name="command" value="sqlRetrieve" />
<table align="center" width="100%">

<tr>
<td valign="top">
SQL: 
</td>
<td colspan="2" width="100%">
<textarea id="sqlText" name="sqlText" cols="1" style="width:100%; height:100px;"><%= sql %></textarea>
</td>
</tr>

<tr>
<td>
Retrieve <br/> limit:
</td>
<td valign="bottom">
<input id="rowsNumber" name="rowsNumber" type="text" style="text-align:right; width:50px; height:20px; background:#FFFFFF; color:#000000; font:12px Arial; border:1px solid #7DA5E0;" value="<%= rowsNumber %>"/>
</td>
<td valign="bottom" align="right">
<input id="button" name="button" type="submit" value="Retrieve" />
</td>
</tr>
</table>
</form>
<% if ( error != null && error.length ( ) > 0 ) { %>
	<div><%= error %></div>
<% } 
   else 
   { 
     if ( rs != null )
     {
        try
        {
          int i = 0;
          ResultSetMetaData mt = rs.getMetaData ( );
          int count = mt.getColumnCount ( );
     	  while ( rs.next ( ) )
     	  {
			if ( i == 0 )
     	    {  
%>
     	  	  <table border="1"> <tr bordercolor="#999999" bgcolor="#EEEEEE" align="center" style="FONT-WEIGHT: bold; FONT-SIZE: 11px; COLOR: #1e2a63; FONT-FAMILY: Arial, Helvetica, sans-serif">
<%            for ( int m = 1; m <= count; m ++ )
     	  	  {
%>
     	  	      <td><%= mt.getColumnName ( m )%></td>
<%            } %>
     	  	  </tr>
<%          } %>
			<tr>
<%          String value = null;
            Object objectValue = null;
            for ( int m = 1; m <= count; m ++ )
     	  	{
     	  	  objectValue = rs.getObject ( m );
     	  	  if ( objectValue != null && objectValue.toString ( ).trim ( ).length ( ) > 0 )
     	  	  {
     	  	    String className = objectValue.getClass ( ).getName ( );
                if ( "oracle.sql.DATE".equals ( className ) )
                {
                  value = ( ( oracle.sql.DATE ) objectValue ).dateValue ( ).toString ( );
                }
                else if ( "oracle.sql.TIMESTAMP".equals ( className ) )
                {
                  value = ( ( oracle.sql.TIMESTAMP ) objectValue ).timestampValue ( ).toString ( );
                }
                else
                {
                  value = objectValue.toString ( );
                }
     	  	  }
     	  	  else
     	  	  {
     	  	    value = "&nbsp;";
     	  	  }
%>
     	  	  <td><%= value %></td>
<%          } %>
			</tr>
<%     	    i ++;
		  }
%>
          </table>
<%
     	}
     	catch ( Exception eer )
     	{
     	   eer.printStackTrace ( );
     	}
      }
   }
   try
   {
     if ( rs != null ) rs.close ( );
   }
   catch ( Exception ex )
   {
   }
   rs = null;
   if ( sqlConn != null ) sqlConn.disconnect ( );
   connection = null;
%>

</body>
</html>