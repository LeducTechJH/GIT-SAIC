var datePickerDivID = "datepicker";
var iFrameDivID = "datepickeriframe";
var datePickerLang = "es";

var dayArrayShort = new Array('Su', 'Mo', 'Tu', 'We', 'Th', 'Fr', 'Sa');
var dayArrayMed = new Array('Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat');
var dayArrayLong = new Array('Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday');
var monthArrayShort = new Array('Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec');
var monthArrayMed = new Array('Jan', 'Feb', 'Mar', 'Apr', 'May', 'June', 'July', 'Aug', 'Sept', 'Oct', 'Nov', 'Dec');
var monthArrayLong = new Array('January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December');

var dayArrayShortEs = new Array('D', 'L', 'M', 'M', 'J', 'V', 'S');
var dayArrayMedEs = new Array('Dom', 'Lun', 'Mar', String.fromCharCode ( 77,105,233 ), 'Jue', 'Vie', String.fromCharCode ( 83,225,98 ) );
var dayArrayLongEs = new Array('Domingo', 'Lunes', 'Martes', String.fromCharCode ( 77,105,233,114,99,111,108,101,115 ), 'Jueves', 'Viernes', String.fromCharCode ( 83,225,98,97,100,111 ) );
var monthArrayShortEs = new Array('Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun', 'Jul', 'Ago', 'Sep', 'Oct', 'Nov', 'Dic');
var monthArrayMedEs = new Array('Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun', 'Jul', 'Ago', 'Sep', 'Oct', 'Nov', 'Dic');
var monthArrayLongEs = new Array('Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre');


// these variables define the date formatting we're expecting and outputting.
// If you want to use a different format by default, change the defaultDateSeparator
// and defaultDateFormat variables either here or on your HTML page.
var defaultDateSeparator = "/";        // common values would be "/" or "."
var defaultDateFormat = "mdy"    // valid values are "mdy", "dmy", and "ymd"
var dateSeparator = defaultDateSeparator;
var dateFormat = defaultDateFormat;

var editYear = false;


/**
 * Main function
 */
function displayDatePicker ( dateFieldName, displayBelowThisObject, dtFormat, dtSep )
{
  var targetDateField = document.getElementsByName (dateFieldName).item(0);
  // if we weren't told what node to display the datepicker beneath, just display it
  // beneath the date field we're updating
  if (!displayBelowThisObject)
    displayBelowThisObject = targetDateField;
 
  // if a date separator character was given, update the dateSeparator variable
  if (dtSep)
    dateSeparator = dtSep;
  else
    dateSeparator = defaultDateSeparator;
 
  // if a date format was given, update the dateFormat variable
  if ( dtFormat )
  {
    dateFormat = dtFormat;
  }
  else
  {
    dateFormat = defaultDateFormat;
  }

  var x = displayBelowThisObject.offsetLeft;
  var y = displayBelowThisObject.offsetTop + displayBelowThisObject.offsetHeight ;

  // deal with elements inside tables and such
  var parent = displayBelowThisObject;
  while (parent.offsetParent) {
    parent = parent.offsetParent;
    x += parent.offsetLeft;
    y += parent.offsetTop ;
  }
 
  drawDatePicker(targetDateField, x, y);
}


function drawDatePicker(targetDateField, x, y)
{
  var dt = getFieldDate ( targetDateField.value );
  if (!document.getElementById(datePickerDivID)) 
  {
    var newNode = document.createElement("div");
    newNode.setAttribute("id", datePickerDivID);
    newNode.setAttribute("class", "dpDiv");
    newNode.setAttribute("style", "visibility: hidden;");
    document.body.appendChild(newNode);
  }

  var pickerDiv = document.getElementById(datePickerDivID);
  pickerDiv.style.position = "absolute";
  pickerDiv.style.left = x + "px";
  pickerDiv.style.top = y + "px";
  pickerDiv.style.visibility = (pickerDiv.style.visibility == "visible" ? "hidden" : "visible");
  pickerDiv.style.display = (pickerDiv.style.display == "block" ? "none" : "block");
  pickerDiv.style.zIndex = 10000;

  refreshDatePicker(targetDateField.name, dt.getFullYear ( ), dt.getMonth ( ), dt.getDate ( ));
}


function refreshDatePicker(dateFieldName, year, month, day)
{
  var thisDay = new Date ( );
 
  if ((month >= 0) && (year > 0)) {
    thisDay = new Date(year, month, 1);
  } else {
    day = thisDay.getDate ( );
    thisDay.setDate(1);
  }

  var crlf = "\r\n";
  var TABLE = "<table cols=7 class='dpTable'>" + crlf;
  var xTABLE = "</table>" + crlf;
  var TR = "<tr class='dpTR'>";
  var TR_title = "<tr class='dpTitleTR'>";
  var TR_days = "<tr class='dpDayTR'>";
  var TR_todaybutton = "<tr class='dpTodayButtonTR'>";
  var xTR = "</tr>" + crlf;
  var TD = "<td class='dpTD' onMouseOut='this.className=\"dpTD\";' onMouseOver=' this.className=\"dpTDHover\";' ";    // leave this tag open, because we'll be adding an onClick event
  var TD_title = "<td colspan=4 class='dpTitleTD'>";
  var TD_buttons = "<td class='dpButtonTD'>";
  var TD_todaybutton = "<td colspan=6 class='dpTodayButtonTD' align=right>";
  var TD_days = "<td class='dpDayTD'>";
  var TD_selected = "<td class='dpDayHighlightTD' onMouseOut='this.className=\"dpDayHighlightTD\";' onMouseOver='this.className=\"dpTDHover\";' ";    // leave this tag open, because we'll be adding an onClick event
  var xTD = "</td>" + crlf;
  var DIV_title_month = "<span class='dpTitleText'>";
  var DIV_title_year = "<span id='yearSpan' class='dpTitleText'>";
  var DIV_selected = "<div class='dpDayHighlight'>";
  var xDIV = "</div>";
  var xSPAN = "</span>";

  var html = TABLE;

  html += TR_title;
  html += TD_buttons + getButtonCode(dateFieldName, thisDay, -1, "&lt;") + xTD;
  if ( datePickerLang == 'es' )
  {
    html += TD_title + DIV_title_month + monthArrayLongEs[ thisDay.getMonth ( )] + xSPAN + " ";  
  }
  else
  {
    html += TD_title + DIV_title_month + monthArrayLong[ thisDay.getMonth ( )] + xSPAN + " ";
  }
  
  if ( !editYear )
    html += DIV_title_year + thisDay.getFullYear ( ) + xSPAN;
  else
    html += DIV_title_year + "<input name='baseYear' id='baseYear' tabindex=1 type='text' maxLength=4  style='height: 20; width:35; text-align:right;'/>" + xSPAN;
  html += xTD;
  html += "<td><button id='baseYearButton' class='dpButton' style='color:red; height=15;' onClick=\"getBaseYear('" +  dateFieldName + "','" + year + "','" + month + "','" + day + "');\">*</button> " + xTD;
  html += TD_buttons + getButtonCode(dateFieldName, thisDay, 1, "&gt;") + xTD;
  html += xTR;

  html += TR_days;
  if ( datePickerLang == 'es' )
  {
    for(i = 0; i < dayArrayMedEs.length; i++)
      html += TD_days + dayArrayMedEs[i] + xTD;
  }
  else
  {
    for(i = 0; i < dayArrayMed.length; i++)
      html += TD_days + dayArrayMed[i] + xTD;  
  }
  html += xTR;

  html += TR;

  for (i = 0; i < thisDay.getDay ( ); i++)
    html += TD + "&nbsp;" + xTD;

  do 
  {
    dayNum = thisDay.getDate ( );
    TD_onclick = " onclick=\"updateDateField('" + dateFieldName + "', '" + getDateString(thisDay) + "');\">";
    
    if (dayNum == day)
      html += TD_selected + TD_onclick + DIV_selected + dayNum + xDIV + xTD;
    else
      html += TD + TD_onclick + dayNum + xTD;

    if (thisDay.getDay ( ) == 6)
      html += xTR + TR;

    thisDay.setDate(thisDay.getDate ( ) + 1);
  } while (thisDay.getDate ( ) > 1)

  if (thisDay.getDay ( ) > 0) {
    for (i = 6; i > thisDay.getDay ( ); i--)
      html += TD + "&nbsp;" + xTD;
  }
  html += xTR;

  //var today = new Date ( );
  //var todayString = "Today is " + dayArrayMed[today.getDay ( )] + ", " + monthArrayMed[ today.getMonth ( )] + " " + today.getDate ( );
  //html += TR_todaybutton + TD_todaybutton;
  //html += "<input name='baseYear' id='baseYear' type='text' maxLength=4  style='visibility:hidden; width=50; text-align:right;'";
  //html += "</td><td>";
  //html += "<button id='baseYearButton' class='dpButton' style='color:red; height=15' onClick=getBaseYear(' +  dateFieldName + ',\'' + thisDay + '\'');>*</button> ";
  //html += "<button class='dpTodayButton' onClick='updateDateField(\"" + dateFieldName + "\");'>close</button>";
  //html += xTD + xTR;
 
  html += xTABLE;
 
  document.getElementById(datePickerDivID).innerHTML = html;
 
  //adjustiFrame ( );
}

function getBaseYear ( dateFieldName, year, month, date )
{
  if ( !editYear )
  {
    editYear = true;
    refreshDatePicker(dateFieldName, year, month, date);
    var button = document.getElementById('baseYearButton');
    if ( button ) button.style.color='blue';
    var elem = document.getElementById('baseYear');
    if ( elem )
    {
      var targetDateField = document.getElementsByName (dateFieldName).item(0);
      elem.value = "";
      targetDateField.focus ( );
      elem.focus ( );
    }
  }
  else
  {
    editYear = false;
    elem = document.getElementById('baseYear');
    if ( isNum ( elem.value ) )
    {
      if ( button ) button.style.color='red';
      if ( elem ) refreshDatePicker(dateFieldName, elem.value, month, date); 
    }
    else
    {
      alert ( "Please, enter number" );
      var targetDateField = document.getElementsByName (dateFieldName).item(0);
      elem.value = "";
      targetDateField.focus ( );
      elem.focus ( );
    }
  }
}

function getButtonCode(dateFieldName, dateVal, adjust, label)
{
  var newMonth = (dateVal.getMonth  ( ) + adjust) % 12;
  var newYear = dateVal.getFullYear ( ) + parseInt((dateVal.getMonth ( ) + adjust) / 12);
  if (newMonth < 0) {
    newMonth += 12;
    newYear += -1;
  }
 
  return "<button class='dpButton' onClick='refreshDatePicker(\"" + dateFieldName + "\", " + newYear + ", " + newMonth + ");'>" + label + "</button>";
}


/**
Convert a JavaScript Date object to a string, based on the dateFormat and dateSeparator
variables at the beginning of this script library.
*/
function getDateString ( dateVal )
{
  var dayString = "00" + dateVal.getDate ( );
  var monthString = "00" + ( dateVal.getMonth ( ) + 1 );
  dayString = dayString.substring ( dayString.length - 2 );
  monthString = monthString.substring ( monthString.length - 2 );
 
  switch ( dateFormat )
  {
    case "dMy":
    {
      return dayString + dateSeparator + monthArrayShortEs [ parseInt ( monthString ) - 1 ] + dateSeparator + dateVal.getFullYear ( );
    }
    case "dmy":
    {
      return dayString + dateSeparator + monthString + dateSeparator + dateVal.getFullYear ( );
    }
    case "ymd":
	{
      return dateVal.getFullYear ( ) + dateSeparator + monthString + dateSeparator + dayString;
    }
    case "mdy":
    default:
    {
      return monthString + dateSeparator + dayString + dateSeparator + dateVal.getFullYear ( );
    }
  }
}


/**
Convert a string to a JavaScript Date object.
*/
function getFieldDate(dateString)
{
  var dateVal;
  var dArray;
  var d, m, y;
 
  try {
    dArray = splitDateString(dateString);
    if (dArray) {
      switch (dateFormat) {
        case "dmy" :
          d = parseInt(dArray[0], 10);
          m = parseInt(dArray[1], 10) - 1;
          y = parseInt(dArray[2], 10);
          break;
        case "ymd" :
          d = parseInt(dArray[2], 10);
          m = parseInt(dArray[1], 10) - 1;
          y = parseInt(dArray[0], 10);
          break;
        case "mdy" :
        default :
          d = parseInt(dArray[1], 10);
          m = parseInt(dArray[0], 10) - 1;
          y = parseInt(dArray[2], 10);
          break;
      }
      dateVal = new Date(y, m, d);
    } else if (dateString) {
      dateVal = new Date(dateString);
    } else {
      dateVal = new Date ( );
    }
  } catch(e) {
    dateVal = new Date ( );
  }
 
  return dateVal;
}


/**
Try to split a date string into an array of elements, using common date separators.
If the date is split, an array is returned; otherwise, we just return false.
*/
function splitDateString(dateString)
{
  var dArray;
  if (dateString.indexOf("/") >= 0)
    dArray = dateString.split("/");
  else if (dateString.indexOf(".") >= 0)
    dArray = dateString.split(".");
  else if (dateString.indexOf("-") >= 0)
    dArray = dateString.split("-");
  else if (dateString.indexOf("\\") >= 0)
    dArray = dateString.split("\\");
  else
    dArray = false;
 
  return dArray;
}


function updateDateField ( dateFieldName, dateString )
{
  var targetDateField = document.getElementsByName (dateFieldName).item(0);
  if ( dateString )
  {
    targetDateField.value = dateString;
    if ( sendDataChange )
    {
      sendDataChange ( targetDateField.id, dateString );
    }
  }
 
  var pickerDiv = document.getElementById(datePickerDivID);
  pickerDiv.style.visibility = "hidden";
  pickerDiv.style.display = "none";
 
  //adjustiFrame ( );
  targetDateField.focus ( );
}

function isNum(inputStr)
{
  for(var i=0; i<inputStr.length ; i++)
  {
    var oneChar = inputStr.substring(i,i+1)
    if(oneChar < "0" || oneChar > "9")
      return false;

    return true;
  }
}