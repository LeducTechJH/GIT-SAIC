/**
 *
 */
function showMap1 ( )
{
  var element;
  var city = "";
  var zip = "";

  element = document.getElementById ( "ZIPCODE_POS_5" );
  if ( element ) zip = element.value;
  element = document.getElementById ( "CIUDAD_POS" );
  if ( element ) city = element.value;

  var url = "html/map.html?location=" + zip + ",PR";// + city;
  //alert ( url );
  var winTop = 100;
  var winLeft = 150;
  window.open ( url, null, "top=" + winTop + ", left=" + winLeft + ", height=420,width=420, titlebar=no, menubar=no, resizable=no, status=no, toolbar=no" );
}


/**
 * Overrides the empty function in jdp.js
 */
function afterInit ( )
{
  var parent = document.getElementsByTagName ( 'BODY' ) [ 0 ];
  var button = document.createElement ( "img" );
  button.id = "mapButton1";
  button.src = "images/wi0064-32.gif";
  button.style.left = "399px";
  button.style.top  = "163px";
  button.style.width = "12px";
  button.style.height = "12px";
  parent.appendChild ( button );
  button.style.visibility = "visible";
  button.style.display = "block";

  button = document.getElementById ( "mapButton1" );
  button.onclick = showMap1;
}
