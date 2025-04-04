var datePickerShown = false;
var datePickerDivID = "datepicker";
var iFrameDivID = "datepickeriframe";
var datePickerLang = "es";

var hasTimeInFormat = false;
var hasDateInFormat = false;
var hasDayInFormat = true;
var hasDayInWeekInFormat = false;
var hasTInFormat = false;

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

/*
 Valid formats are:
 hmma
 h:mma
 h:mm a
 HH:mm
 HHmm

 ddMMMyyyyhmm
 dd-MMM-yyyy
 dd/MM/yyyy
 dd/MM/yy
 EE dd-MMM-yyyy h:mm a
 ddMMMyyyyhmma
 dd-MMM-yyyy h:mm a
 MMM-yyyy
 MMMM yyyy
    // valid values are "mdy", "dmy", and "ymd"
*/
var defaultDateFormat = "mdy";

var timeSeparator = ":";
var dateSeparator = "";
var daySeparator = " ";
var dateTimeSeparator = " ";
var tSeparator = " ";

var dateFormat = defaultDateFormat;
var timeFormat = "";

var editYear = false;


/**
 * Main function
 */
function displayDatePicker ( dateFieldName, dtFormat )
{
  var targetDateField = document.getElementsByName (dateFieldName).item(0);
  // if we weren't told what node to display the datepicker beneath, just display it
  // beneath the date field we're updating
  
  var  displayBelowThisObject = targetDateField;
 
  // if a date format was given, update the dateFormat variable
  if ( dtFormat )
  {
    dateFormat = dtFormat;
  }
  else
  {
    dateFormat = defaultDateFormat;
  }

  checkDateTimeFormat ( dateFormat );

  var x = displayBelowThisObject.offsetLeft;
  var y = displayBelowThisObject.offsetTop + displayBelowThisObject.offsetHeight ;

  // deal with elements inside tables and such
  var parent = displayBelowThisObject;
  while ( parent.offsetParent ) 
  {
    parent = parent.offsetParent;
    x += parent.offsetLeft;
    y += parent.offsetTop ;
  }

  drawDatePicker ( targetDateField, x, y );
 
  //datePickerShown = true;
  
}


/**
 *
 */
function drawDatePicker ( targetDateField, x, y )
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
  
  if ( pickerDiv.style.display == "block" )
  {
    pickerDiv.style.display = "none";
    datePickerShown = false;
  }
  else
  {  
    pickerDiv.style.display = "block";
    datePickerShown = true;
  }
  pickerDiv.style.zIndex = 10000; 

  refreshDatePicker ( targetDateField.name, dt.getFullYear ( ), dt.getMonth ( ), dt.getDate ( ), dt.getHours ( ), dt.getMinutes ( ) );

}


/**
 *
 */
function refreshDatePicker ( dateFieldName, year, month, day, hours, minutes )
{ 
  var thisDay = new Date ( );

  if ( year == null )  
  {
    year = 2008;
    month = 0;
    day = 1;
  }
  if ( ( month >= 0 ) && ( year > 0 ) ) 
  {
    thisDay = new Date ( year, month, 1 );
    if ( hasTimeInFormat ) thisDay.setHours ( hours, minutes );
  } 
  else 
  {
    day = thisDay.getDate ( );
    thisDay.setDate ( 1 );
    if ( hasTimeInFormat ) thisDay.setHours ( hours, minutes );
  }

  var timeT = "AM";
  if ( hours > 11 )
  {
    hours = hours - 12;
    timeT = "PM";
  }
  var crlf = "\r\n";
  var TABLE = "<table id='pickerTable' cols=7 class='dpTable'>" + crlf;
  var xTABLE = "</table>" + crlf;
  var TR = "<tr class='dpTR'>";
  var TR_title = "<tr class='dpTitleTR'>";
  var TR_days = "<tr class='dpDayTR'>";
  var TR_todaybutton = "<tr class='dpTodayButtonTR'>";
  var xTR = "</tr>" + crlf;
  var TD = "<td class='dpTD' onMouseOut='this.className=\"dpTD\";' onMouseOver=' this.className=\"dpTDHover\";' ";    // leave this tag open, because we'll be adding an onClick event
  var TD_title = "<td colspan=4 class='dpTitleTD'>";
  var TD_buttons = "<td id='left_button' class='dpButtonTD'>";
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

  if ( hasTimeInFormat ) 
  {
      html += TR;
	  html += "<td colspan='7'>";
	    html += "<table class='dpTable'>";
	      html += "<tr>";
	        html += "<td>" + "hour:" + xTD;
	        html += "<td>" + "<select id='hour_sel' style='font-family: Tahoma, Arial, Helvetica, sans-serif; font-size: 11px; color: #505050;' onchange='refreshDatePicker(\"" + dateFieldName + "\"," + year+ "," + month + "," + day + ", this.value," + thisDay.getMinutes ( ) + " );'>";
	        var sh = "";
	        for ( var m = 0; m < 13; m ++ )
	        {
	          sh = "";
	          if ( m < 10 ) sh = "0";
	          sh += "" + m;
	          html += "<option value='" + sh + "' ";
	          if ( sh == hours ) html += "selected ";
	          html += ">" + sh + "</option>";
	        }
	        html += xTD;
	        html += "<td>" + "min:" + xTD;
	        html += "<td>" + "<select id='min_sel' style='font-family: Tahoma, Arial, Helvetica, sans-serif; font-size: 11px; color: #505050;' onchange='refreshDatePicker(\"" + dateFieldName + "\"," + year+ "," + month+ "," + day + ", " + thisDay.getHours ( ) + ", this.value );'>";
	        for ( var m = 0; m < 60; m ++ )
	        {
	          sh = "";
	          if ( m < 10 ) sh = "0";
	          sh += "" + m;
	          html += "<option value='" + sh + "' ";
	          if ( sh == minutes ) html += "selected ";
	          html += ">" + sh + "</option>";
	        }
	        html += xTD;
	        html += "<td>" + "" + xTD;
	        html += "<td>" + "<select id='ap_sel' style='font-family: Tahoma, Arial, Helvetica, sans-serif; font-size: 11px; color: #505050;' onchange='timeTChanged(\"" + dateFieldName + "\"," + year+ "," + month+ "," + day + ", " + hours + ", " + minutes + ", this.value );'>";
	        html += "<option value='AM' ";
	        if ( timeT == 'AM' ) html += "selected ";
	        html += ">AM</option>";
	        html += "<option value='PM' ";
	        if ( timeT == 'PM' ) html += "selected ";
	        html += ">PM</option>";
	        html += xTD;

	        //html += "<td><button style='BACKGROUND-IMAGE: url(dlfImages/clock.gif); width:17px; height:17px; border:none;'/>" + xTD;
	        html += "<td><a href='#' title='Time change only' onclick='changeTimeOnly ( \"" +  dateFieldName + "\", "  + year+ "," + month+ "," + day + ", " + thisDay.getHours ( ) + ", " + thisDay.getMinutes ( ) + " );'><img src='dlfImages/clock.gif' width='17px' height='17px' border='0'/></a>" + xTD;
	      html += "</tr>";
	    html += "</table>";
	  html += "</td>";

    html += xTR;
  }  
  if ( hasDateInFormat )
  {
	  html += TR_title;
	  html += TD_buttons + getButtonCode(dateFieldName, thisDay, -1, "&lt;", "lbutton" ) + xTD;
	  if ( datePickerLang == 'es' )
	  {
	    html += TD_title + DIV_title_month + monthArrayMedEs[ thisDay.getMonth ( )] + xSPAN + " ";  
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
	  html += "<td><button id='baseYearButton' class='dpButton' style='color:red; height=15;' onClick=\"getBaseYear('" +  dateFieldName + "', " + year + "," + month + "," + day + "," + hours + ", " + minutes + " );\">*</button> " + xTD;
	  html += TD_buttons + getButtonCode(dateFieldName, thisDay, 1, "&gt;", "rbutton" ) + xTD;
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
	  {
	    html += TD + "&nbsp;" + xTD;
	  }

	  var index = 0;
	  do 
	  {
	    index ++;
	    dayNum = thisDay.getDate ( );
	    TD_onclick = " onclick=\"updateDateField('" + dateFieldName + "', '" + getDateString(thisDay) + "');\">";

	    if (dayNum == day)
	      html += TD_selected + " id='" + index + "' " + TD_onclick + DIV_selected + dayNum + xDIV + xTD;
	    else
	      html += TD  + " id='" + index + "' " + TD_onclick + dayNum + xTD;

	    if ( thisDay.getDay ( ) == 6 ) html += xTR + TR;
	
	    thisDay.setDate(thisDay.getDate ( ) + 1);
	  }
	  while ( thisDay.getDate ( ) > 1 )

	  if ( thisDay.getDay ( ) > 0 )
	  {
	    for ( i = 6; i > thisDay.getDay ( ); i-- )
	    {
	      html += TD + "&nbsp;" + xTD;
	    }
	  }
	  html += xTR;
  }
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


/**
 *
 */
function changeTimeOnly ( fieldName, year, month, day, hours, minutes )
{
  dt = new Date ( year, month, day );
  dt.setHours ( hours, minutes );
  updateDateField ( fieldName, getDateString ( dt ) );
}


/**
 *
 */
function getBaseYear ( dateFieldName, year, month, date, hours, minutes )
{
  if ( !editYear )
  {
    editYear = true;
    refreshDatePicker(dateFieldName, year, month, date, hours, minutes );
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
      if ( elem ) refreshDatePicker(dateFieldName, elem.value, month, date, hours, minutes ); 
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


/**
 *
 */
function getButtonCode ( dateFieldName, dateVal, adjust, label, id )
{
  var newMonth = ( dateVal.getMonth  ( ) + adjust ) % 12;
  var newYear = dateVal.getFullYear ( ) + parseInt ( ( dateVal.getMonth ( ) + adjust ) / 12 );

  if (newMonth < 0) 
  {
    newMonth += 12;
    newYear += -1;
  }
  var date = dateVal.getDate ( );
  var hour = 0;
  var minutes = 0;

  if ( hasTimeInFormat )
  {
    hour = dateVal.getHours ( );
    minutes = dateVal.getMinutes ( );
  }

  return "<button id='" + id + "' class='dpButton' onClick='refreshDatePicker(\"" + dateFieldName + "\", " + newYear + ", " + newMonth + ", " + date + ", " + hour + ", " + minutes + ");'>" + label + "</button>";
}


/**
 * Converts a JavaScript Date object to a string, based on the dateFormat and dateSeparator
 * variables at the beginning of this script library.
 */
function getDateString ( dateVal )
{ 
  var dayString = "00" + dateVal.getDate ( );
  var monthString = "00" + ( dateVal.getMonth ( ) + 1 );
  dayString = dayString.substring ( dayString.length - 2 );
  monthString = monthString.substring ( monthString.length - 2 );

  var curT = "AM";
  var curHourCif = dateVal.getHours ( );
  if ( hasTInFormat )
  {
    if ( curHourCif > 11 )
    {
      curHourCif = curHourCif - 12;
      curT = "PM";
    }
  }

  var curHour = "00" + curHourCif;
  var curHourStr = curHour.substring ( curHour.length - 2 );
  var curMin = "00" + dateVal.getMinutes ( );
  var curMinStr = curMin.substring ( curMin.length - 2 );

  //if ( hasTimeInFormat ) 
  //{
  //  timeString = "" + curHourStr + ":" + curMinStr;
  //}
  var timeString = "";
  var resultStr = "";

  if ( hasTimeInFormat ) 
  {
    switch ( timeFormat )
    {
      case "hmm":
      {
        timeString = "" + curHourStr + curMinStr;
        break; 
      }
      case "hmma":
      {
        timeString = "" + curHourStr + curMinStr + curT;
        break; 
      }
      case "h:mm a":
      {
        timeString = "" + curHourStr + ":" + curMinStr + " " + curT;
        break; 
      }
      case "h:mma":
      {
        timeString = "" + curHourStr + ":" + curMinStr + curT;
        break; 
      }
      case "HH:mm":
      {
        timeString = "" + curHourStr + ":" + curMinStr;
        break; 
      }
      case "HHmm":
      {
        timeString = "" + curHourStr + curMinStr ;
        break; 
      }
    }
  }

  if ( hasDateInFormat )
  {
	  switch ( dateFormat )
	  {
	    case "dMy":
	    {
	      resultStr = dayString + dateSeparator + monthArrayShortEs [ parseInt ( monthString, 10 ) - 1 ] + dateSeparator + dateVal.getFullYear ( );
	      break; 
	    }
	    case "dmy":
	    {
	      resultStr = dayString + dateSeparator + monthString + dateSeparator + dateVal.getFullYear ( );
	      break;
	    }
	    case "ymd":
		{
	      resultStr = dateVal.getFullYear ( ) + dateSeparator + monthString + dateSeparator + dayString;
	      break;
	    }
	    case "ddMMMyyyy":
		{
	      resultStr = dayString + monthArrayShortEs [ parseInt ( monthString, 10 ) - 1 ] + dateVal.getFullYear ( );
	      break;
	    }
	    case "dd-MMM-yyyy":
		{
	      resultStr = dayString + "-" + monthArrayShortEs [ parseInt ( monthString, 10 ) - 1 ] + "-" + dateVal.getFullYear ( );
	      break;
	    }
	    case "dd/MMM/yyyy":
		{
	      resultStr = dayString + "/" + monthArrayShortEs [ parseInt ( monthString, 10 ) - 1 ] + "/" + dateVal.getFullYear ( );
	      break;
	    }
	    case "dd/MM/yyyy":
		{
		  var helpString = "00" + ( parseInt ( monthString, 10 ) );
	      helpString = helpString.substring ( helpString.length - 2 );
	      resultStr = dayString + "/" + helpString + "/" + dateVal.getFullYear ( );
	      break;
	    }
	    case "dd/MM/yy":
		{
		  var shortYear = "" + dateVal.getFullYear ( );
		  var helpString = "00" + ( parseInt ( monthString, 10 ) );
	      helpString = helpString.substring ( helpString.length - 2 );
	      resultStr = dayString + "/" + helpString + "/" + shortYear.charAt ( 2 ) + shortYear.charAt ( 3 );
	      break;
	    }
	    case "EE dd-MMM-yyyy":
		{
	      resultStr = dayArrayMedEs [ parseInt ( dateVal.getDay ( ), 10 ) ] + " " + dayString + "-" + monthArrayShortEs [ parseInt ( monthString, 10 ) - 1 ] + "-" + dateVal.getFullYear ( );
	      break;
	    }
	    case "MMM-yyyy":
		{
	      resultStr = monthArrayShortEs [ parseInt ( monthString, 10 ) - 1 ] + "-" + dateVal.getFullYear ( );
	      break;
	    }
	    case "MMMM yyyy":
		{
	      resultStr = monthArrayShortEs [ parseInt ( monthString, 10 ) - 1 ] + " " + dateVal.getFullYear ( );
	      break;
	    }
	    case "mdy":
	    default:
	    {
	      resultStr = monthString + dateSeparator + dayString + dateSeparator + dateVal.getFullYear ( );
	      break;
	    }
	  }
  }

  resultStr = resultStr + dateTimeSeparator + timeString;

  return resultStr;
}


/**
 * Convert a string to a JavaScript Date object.
 */
function getFieldDate ( dateString )
{
  var dateVal;
  var dArray;
  var d, m, y, h, m, t, e;

  try 
  {
    dArray = splitDateString ( dateString ); 
   
    if (dArray) 
    {  
      if ( hasDateInFormat )
      {
	    switch (dateFormat) 
	    {
	      case "dMy" :
	      {
	        d = parseInt(dArray[0], 10);
	        for ( var i = 0; i < monthArrayShortEs.length; i ++ )
	        {
	          if ( monthArrayShortEs [ i ] == dArray [ 1 ] )
	          {
	            m = i;
	            break;
	          }
	        }
	        y = parseInt(dArray[2], 10);
	        break;
	      }
	      case "dmy" :
	      {
	        d = parseInt(dArray[0], 10);
	        m = parseInt(dArray[1], 10) - 1;
	        y = parseInt(dArray[2], 10);
	        break;
	      }
	      case "ymd" :
	      {
	        d = parseInt(dArray[2], 10);
	        m = parseInt(dArray[1], 10) - 1;
	        y = parseInt(dArray[0], 10);
	        break;
	      }
	      case "ddMMMyyyy" :
	      {
	        d = parseInt(dArray[0], 10);
	        for ( var i = 0; i < monthArrayShortEs.length; i ++ )
	        {
	          if ( monthArrayShortEs [ i ] == dArray [ 1 ] )
	          {
	            m = i;
	            break;
	          }
	        }
	        y = parseInt(dArray[2], 10);
	        break;
	      }
	      case "dd-MMM-yyyy" :
	      {
	        d = parseInt(dArray[0], 10);
	        for ( var i = 0; i < monthArrayShortEs.length; i ++ )
	        {
	          if ( monthArrayShortEs [ i ] == dArray [ 1 ] )
	          {
	            m = i;
	            break;
	          }
	        }
	        y = parseInt(dArray[2], 10);
	        break;
	      }
	      case "dd/MMM/yyyy" :
	      {
	        d = parseInt(dArray[0], 10);
	        for ( var i = 0; i < monthArrayShortEs.length; i ++ )
	        {
	          if ( monthArrayShortEs [ i ] == dArray [ 1 ] )
	          {
	            m = i;
	            break;
	          }
	        }
	        y = parseInt(dArray[2], 10);
	        break;
	      }
	      case "dd/MM/yyyy":
		  {
		    d = parseInt(dArray[0], 10);
	        m = parseInt(dArray[1], 10) - 1;
	        y = parseInt(dArray[2], 10);
		    break;
		  }
	      case "dd/MM/yy" :
	      {
	        d = parseInt(dArray[0], 10);
	        m = parseInt(dArray[1], 10) - 1;
	        y = parseInt(dArray[2], 10);
	        break;
	      }
	      case "EE dd-MMM-yyyy":
		  {
		    d = parseInt(dArray[0], 10);
	        for ( var i = 0; i < monthArrayShortEs.length; i ++ )
	        {
	          if ( monthArrayShortEs [ i ] == dArray [ 1 ] )
	          {
	            m = i;
	            break;
	          }
	        }
	        y = parseInt(dArray[2], 10);
	        break;
	      }
	      case "MMM-yyyy":
		  {
	        d = 0;
	        for ( var i = 0; i < monthArrayShortEs.length; i ++ )
	        {
	          if ( monthArrayShortEs [ i ] == dArray [ 0 ] )
	          {
	            m = i + 1;
	            break;
	          }
	        }
	        y = parseInt(dArray[1], 10);
	        break;
	      }
	      case "MMMM yyyy":
	      {
	        d = 0;
	        for ( var i = 0; i < monthArrayShortEs.length; i ++ )
	        {
	          if ( monthArrayShortEs [ i ] == dArray [ 0 ] )
	          {
	            m = i + 1;
	            break;
	          }
	        }
	        y = parseInt(dArray[1], 10);
	        break;
	      }
	      case "mdy" :
	      default :
	      {
	        d = parseInt(dArray[1], 10);
	        m = parseInt(dArray[0], 10) - 1;
	        y = parseInt(dArray[2], 10);
	        break;
	      }
	    }

        dateVal = new Date ( y, m, d );

        if ( hasTimeInFormat )
        {
          h = parseInt(dArray[3], 10);
          m = parseInt(dArray[4], 10);
          if ( dArray[5] == "PM" ) h = h + 12;       
          dateVal.setHours ( h, m ); 
        }
      }
	  else
	  {
	    d = 1;
	    m = 0;
	    y = 2008;
	    dateVal = new Date ( y, m, d );
	    h = parseInt(dArray[0], 10);
        m = parseInt(dArray[1], 10);
        if ( dArray[2] == "PM" ) h = h + 12;   
        dateVal.setHours ( h, m ); 
      }
    } 
    else if (dateString) 
    {
      dateVal = new Date(dateString);
    } 
    else 
    {
      dateVal = new Date ( );
    }
  } 
  catch(e) 
  {
    dateVal = new Date ( );
  }

  return dateVal;
}


/**
 * Tries to split a date string into an array of elements, using common date separators.
 * If the date is split, an array is returned; otherwise, we just return false.
 */
function splitDateString ( dateString )
{ 
  var dArray;
  if ( dateString == null || dateString.length == 0 ) return false;
  if ( hasDateInFormat )
  {
	  if ( hasTimeInFormat && timeSeparator == "" && dateTimeSeparator == "" ) // for ddMMMyyyyhmm and ddMMMyyyyhmma
	  {
	      var helpDateString = dateString.charAt ( 0 ) + dateString.charAt ( 1 ) + "/";
	      helpDateString += dateString.charAt ( 2 ) + dateString.charAt ( 3 )  + dateString.charAt ( 4 ) + "/" ;
	      helpDateString += dateString.charAt ( 5 ) + dateString.charAt ( 6 )  + dateString.charAt ( 7 ) + dateString.charAt ( 8 ) + "/" ;
	      helpDateString += dateString.charAt ( 9 ) + dateString.charAt ( 10 ) + "/";
	      helpDateString += dateString.charAt ( 11 ) + dateString.charAt ( 12 );
	      try
	      {
	        helpDateString += "/" + dateString.charAt ( 13 ) + dateString.charAt ( 14 );
	      }
	      catch ( e )
	      {
	        helpDateString += "/  ";
	      }
	      dArray = helpDateString.split("/");
	  }
	  else if ( hasDayInWeekInFormat )
	  {
	    dateString = dateString.substring ( dateString.indexOf ( " " ) + 1 );
	    dateString = dateString.replace ( "-", "/" );
	    dateString = dateString.replace ( "-", "/" );
	    dateString = dateString.replace ( " ", "/" );
	    dateString = dateString.replace ( " ", "/" );
	    dateString = dateString.replace ( ":", "/" );
	    dArray = dateString.split("/");
	  }
	  else if (dateString.indexOf("/") >= 0)
	  {
	    if ( hasTimeInFormat )
	    {
	      dateString = dateString.replace ( " ", "/" );
	      dateString = dateString.replace ( " ", "/" );
	      dateString = dateString.replace ( ":", "/" );
	    }
	    dArray = dateString.split("/");
	  }
	  else if (dateString.indexOf(".") >= 0)
	  {
	    if ( hasTimeInFormat )
	    {
	      dateString = dateString.replace ( " ", "." );
	      dateString = dateString.replace ( " ", "." );
	      dateString = dateString.replace ( ":", "." );
	    }
	    dArray = dateString.split(".");
	  }
	  else if (dateString.indexOf("-") >= 0)
	  {
	    if ( hasTimeInFormat )
	    {
	      dateString = dateString.replace ( " ", "-" );
	      dateString = dateString.replace ( " ", "-" );
	      dateString = dateString.replace ( ":", "-" );
	    }
	    dArray = dateString.split("-");
	  }
	  else if (dateString.indexOf("\\") >= 0)
	  {
	    if ( hasTimeInFormat )
	    {
	      dateString = dateString.replace ( " ", "\\" );
	      dateString = dateString.replace ( " ", "\\" );
	      dateString = dateString.replace ( ":", "\\" );
	    }
	    dArray = dateString.split("\\");
	  }  
      else
        dArray = false;
  
      if ( dArray && hasTimeInFormat )
      {
        if ( dArray.length == 3 )
        {
          dArray[3] = '0';
          dArray[4] = '0';
          dArray[5] = ' ';
        }
      }
  }
  else
  {
    var helpDateString = "";
    if ( dateString.indexOf ( ":" ) > -1 )
    {
      helpDateString = dateString.charAt ( 0 ) + dateString.charAt ( 1 ) + "/";
      helpDateString += dateString.charAt ( 3 ) + dateString.charAt ( 4 );
      try
	  {
	    if ( dateString.charAt ( 5 ) == " " )
	    {
	      helpDateString += "/" + dateString.charAt ( 6 ) + dateString.charAt ( 7 );
	    }
	    else
	    {
	      helpDateString += "/" + dateString.charAt ( 5 ) + dateString.charAt ( 6 );
	    }
	  }
	  catch ( e )
	  {
	    helpDateString += "/ ";
	  }
	}
	else
	{
      helpDateString = dateString.charAt ( 0 ) + dateString.charAt ( 1 ) + "/";
      helpDateString += dateString.charAt ( 2 ) + dateString.charAt ( 3 ) + "/" ;	      
	  try
	  {
	    helpDateString += dateString.charAt ( 4 ) + dateString.charAt ( 5 );
	  }
	  catch ( e )
	  {
	    helpDateString += "/  ";
	  }
	}
	dArray = helpDateString.split ( "/" );
  } 
  return dArray;
}


/**
 *
 */
function updateDateField ( dateFieldName, dateString )
{
  var targetDateField = document.getElementsByName ( dateFieldName ).item ( 0 );
  if ( dateString )
  {
    if ( dateString.charAt ( dateString.length - 1 ) == ' ' ) dateString = dateString.substring ( 0, dateString.length - 1 );
    targetDateField.value = dateString;
    if ( document.sendDataChange )
    {
      sendDataChange ( targetDateField.id, dateString );
    }
  }

  var pickerDiv = document.getElementById ( datePickerDivID );
  pickerDiv.style.visibility = "hidden";
  pickerDiv.style.display = "none";
  datePickerShown = false;

  //adjustiFrame ( );
  if ( targetDateField ) targetDateField.focus ( );
}


/**
 *
 */
function isNum ( inputStr )
{
  for(var i=0; i<inputStr.length ; i++)
  {
    var oneChar = inputStr.substring(i,i+1)
    if(oneChar < "0" || oneChar > "9")
      return false;

    return true;
  }
}


/**
 *
 */
function timeTChanged ( dateFieldName, year, month, day, hours, minutes, timeT )
{
  if ( timeT == 'PM' ) hours = hours + 12;
  refreshDatePicker ( dateFieldName, year, month, day, hours, minutes );
}


/**
 *
 */
function checkDateTimeFormat ( dFormat )
{
  if ( dFormat.indexOf ( "h" ) > -1 || dFormat.indexOf ( "H" ) > -1 )
  {
    hasTimeInFormat = true;
  }
  else
  {
    hasTimeInFormat = false;
  }
  if ( dFormat.indexOf ( "y" ) > -1 || dFormat.indexOf ( "Y" ) > -1 )
  {
    hasDateInFormat = true;
  }
  else
  {
    hasDateInFormat = false;
    dateFormat = "";
    timeFormat = dFormat;
    if ( dFormat.indexOf ( ":" ) > -1 )
    {
      timeSeparator = ":";
    }
    else
    {
      timeSeparator = "";
    }
    var aPos = dFormat.indexOf ( "a" );
    if ( aPos == -1 )
    {
      hasTInFormat = false;
    }
    else
    {
      hasTInFormat = true;
      if ( dFormat.charAt ( aPos - 1 ) == " " )
      {
        tSeparator = " ";
      }
      else
      {
        tSeparator = "";
      }
    }
    hasDayInWeekInFormat = false;
    hasDayInFormat = false;
    dateSeparator = "";
    dateTimeSeparator = "";

    return false;
  }
  if ( !hasTimeInFormat ) 
  {
    timeFormat = "";
    dateFormat = dFormat;
    if ( dateFormat.indexOf ( "E" ) > -1 || dateFormat.indexOf ( "e" ) > -1 )
    {
      hasDayInWeekInFormat = true;
    }
    else
    {
      hasDayInWeekInFormat = false;
    }
    if ( dateFormat.indexOf ( "d" ) > -1 || dateFormat.indexOf ( "D" ) > -1 )
    {
      hasDayInFormat = true;
    }
    else
    {
      hasDayInFormat = false;
    }
    var dateSeparatorFound = false;
    if ( dateFormat.indexOf ( "-" ) > -1 ) 
    {
      dateSeparator = "-";
      dateSeparatorFound = true;
    }
    if ( dateFormat.indexOf ( "/" ) > -1 ) 
    {
      dateSeparator = "/";
      dateSeparatorFound = true;
    }
    if ( dateFormat.indexOf ( " " ) > -1 ) 
    {
      dateSeparator = " ";
      dateSeparatorFound = true;
    }
    if ( !dateSeparatorFound ) dateSeparator = "";
    hasTInFormat = false;
    return true;
  }
  //full formats
  var timePos = dFormat.indexOf ( "h" );
  if ( timePos == -1 ) timePos = dFormat.indexOf ( "H" );
  if ( dFormat.charAt ( timePos - 1 ) == " " )
  {
    dateTimeSeparator = " ";
  }
  else
  {
    dateTimeSeparator = "";
  }
  if ( dFormat.indexOf ( ":" ) > -1 )
  {
    timeSeparator = ":";
  }
  else
  {
    timeSeparator = "";
  }

  var aPos = dFormat.indexOf ( "a" );
  if ( aPos == -1 )
  {
    hasTInFormat = false;
  }
  else
  {
    hasTInFormat = true;
    if ( dFormat.charAt ( aPos - 1 ) == " " )
    {
      tSeparator = " ";
    }
    else
    {
      tSeparator = "";
    }
  }
  if ( dateFormat.indexOf ( "E" ) > -1 || dateFormat.indexOf ( "e" ) > -1 )
  {
    hasDayInWeekInFormat = true;
  }
  else
  {
    hasDayInWeekInFormat = false;
  }
  dateFormat = dFormat.substring ( 0, timePos );
  if ( dateFormat.charAt ( dateFormat.length - 1 ) == " " ) dateFormat = dateFormat.substr ( 0, dateFormat.length - 1 );
  timeFormat = dFormat.substring ( timePos );
  return true;
}


/**
 *
 */
function datePickerEventHandler ( eventCode )
{
  var currentElem = null;
  var newId = null;
  var newElem = null;
  var str = "";
  var pos1 = -1;
  var pos2 = -1;
  var picTable = document.getElementById ( "pickerTable" );
  if ( picTable )
  {
    var picTableCells = picTable.getElementsByTagName ( "TD" );//.cells;

    for ( var j = 0; j < picTableCells.length; j ++ ) 
    {
      if ( picTableCells.item ( j ).className == "dpDayHighlightTD" )
      {
        currentElem = picTableCells.item ( j );
        break;
      }
    }
    switch ( eventCode )
    {
      case "ESCAPE":
      case "NEXTOBJECT":
      {
        str = currentElem.onclick.toString ( ); 
        pos1 = str.indexOf ( "updateDateField" );        
        if ( pos1 > -1 )
        {
          pos2 = str.indexOf ( ";", pos1 + 1 );         
        }
        if ( pos1 > -1 && pos2 > -1 )
        {
          eval ( str.substring ( pos1, pos2 + 1 ) );
        }        
        break;
      }
      case "PREVINSTANCE":
      {
        newId = 1 * currentElem.id - 7;
        newElem = document.getElementById ( newId );
        if ( newElem )
        {
          currentElem.className = "dpTD";
          newElem.className = "dpDayHighlightTD";
        } 
        break;
      }
      case "NEXTINSTANCE":
      {
        var newId = 1 * currentElem.id + 7;
        var newElem = document.getElementById ( newId );
        if ( newElem )
        {
          currentElem.className = "dpTD";
          newElem.className = "dpDayHighlightTD";
        } 
        break;
      }
      case "LEFTARROW":
      {
        newId = 1 * currentElem.id - 1;
        newElem = document.getElementById ( newId );
        if ( newElem )
        {
          currentElem.className = "dpTD";
          newElem.className = "dpDayHighlightTD";
        } 
        break;
      }
      case "RIGHTARROW":
      {
        newId = 1 * currentElem.id + 1;
        newElem = document.getElementById ( newId );
        if ( newElem )
        {
          currentElem.className = "dpTD";
          newElem.className = "dpDayHighlightTD";
        } 
        break;
      }
      case "PREVIOUS_PAGE": //previos month
      {
        newElem = document.getElementById ( 'lbutton' );
        str = newElem.onclick.toString ( );
        pos1 = str.indexOf ( "refreshDatePicker" );        
        if ( pos1 > -1 )
        {
          pos2 = str.indexOf ( ";", pos1 + 1 );         
        }
        if ( pos1 > -1 && pos2 > -1 )
        {
          eval ( str.substring ( pos1, pos2 + 1 ) );
        }      
        break;
      }
      case "NEXT_PAGE":     //next month
      {
        newElem = document.getElementById ( 'rbutton' );
        str = newElem.onclick.toString ( );
        pos1 = str.indexOf ( "refreshDatePicker" );        
        if ( pos1 > -1 )
        {
          pos2 = str.indexOf ( ";", pos1 + 1 );         
        }
        if ( pos1 > -1 && pos2 > -1 )
        {
          eval ( str.substring ( pos1, pos2 + 1 ) );
        }      
        break;
      }
    }
  }
}
