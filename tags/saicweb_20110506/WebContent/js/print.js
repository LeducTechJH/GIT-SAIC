var xmlHttp = null;

if ( window.XMLHttpRequest )
{
  xmlHttp = new XMLHttpRequest ( );
}
else if ( window.ActiveXObject )
{
  xmlHttp = new ActiveXObject ( "Microsoft.XMLHTTP" );
}

xmlHttp.onreadystatechange = getRequestResponse;


/**
 *
 */
function getRequestResponse ( )
{
  var response = "";

  if ( xmlHttp && xmlHttp.readyState == 4 ) // Done
  {
    try
    {
      if ( xmlHttp.status == 200 ) // OK
      {
        response = xmlHttp.responseText;
      }
      else
      {
        //alert ( "XMLHttp status is " + xmlHttp.status + " [ " + xmlHttp.statusTest + " ]" );
      }
    }
    catch ( e )
    {
      alert ( e );
      return;
    }
  }

  if ( response && response.length > 0 )
  {
    if ( window.opener && window.opener.redirectResponse )
    {
      window.opener.redirectResponse ( response );
    }
  }
}
