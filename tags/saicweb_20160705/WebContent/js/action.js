//created 3.01.2007 by Alexander N. Surets

var xmlHttp;
var forReloadInSetData = "";

//for envelope action
function setReloadInSetData ( val )
{
  forReloadInSetData += val;
}

function createXMLHttpRequest ( )
{
  if ( window.ActiveXObject )
  {
    xmlHttp = new ActiveXObject ( "Microsoft.XMLHTTP" );
  }
  else if ( window.XMLHttpRequest )
  {
    xmlHttp = new XMLHttpRequest ( );
  }
}


function doKeyboardEnvelopeAction ( )
{
  createXMLHttpRequest ( );
  var  url = "BrowserEventDispatcher.process?actionType=envelopeAction&methodName=processEvent";
  xmlHttp.open ( "POST", url, true );
  var str = "";
  if ( activeInputElement && activeInputElement != "" )
  {
    xmlHttp.setRequestHeader ( "Content-Type", "application/x-www-form-urlencoded" );
    var param = activeInputElement + "," + keyCode + "," + shiftKeyPressed + "," + cntrKeyPressed; 
    xmlHttp.send ( param );
  }  
  else
  {
    xmlHttp.send ( null  );
  }
  
  xmlHttp.onreadystatechange = setData;
}


function setData ( )
{
  if ( xmlHttp.readyState == 4 ) 
  {
    if ( xmlHttp.status == 200 ) 
    {
      var result = xmlHttp.responseText;
      if ( result )
      {    
        if ( forReloadInSetData.length > 0 )
        {
          var func = new Array ( );
          func = forReloadInSetData.split ( ';' );
          for ( var i = 0; i < func.length; i ++ )
          {
            eval ( func [ i ] + ";" );
          }
        }
      }
      else
      {
        alert ( "no result" );
      }
    }
  }
}


function rowdispersion ( )
{
  var tabs = document.body.getElementsByTagName ( "TABLE" );
     if ( tabs )
     { 
       for ( var i = 0; i < tabs.length; i ++ )
       {
         var tab = tabs [ i ];
         if ( tab.rows.length > 1 )
         {
           var repX = tab.rows [ 0 ].style.repeatsizex;
           var delX = tab.rows [ 0 ].style.repeatdeltax;
           var repY = tab.rows [ 0 ].style.repeatsizey;
           var delY = tab.rows [ 0 ].style.repeatdeltay;
           var newx = repX * 1 + delX * 1;
           var newy = repY * 1 + delY * 1;
          
           for ( var j = 0; j < tab.rows.length; j ++ )
           {
             if ( j > 0 )
             {
               tab.rows [ j ].style.top = j * newy;
               tab.rows [ j ].style.left = j * newx;
               tab.rows [ j ].style.rownum = j;
             }
             
             tab.rows [ j ].childNodes [ 0 ].style.rownum = j;
           }
         }
       }
    }
}


// for SubmitAction

