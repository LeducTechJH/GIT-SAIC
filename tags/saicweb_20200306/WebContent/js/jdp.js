// ---------------------------------------------------------------------
// ----------   Including Other JavaScripts Section   ------------------
//
//alert ( "jdp.js" )

document.write ( '<link rel="stylesheet" href="css/DatePicker.css" type="text/css" />\r\n' );
document.write ( '<link rel="stylesheet" href="css/jdp.css" type="text/css" />\r\n' );
document.write ( '<link rel="stylesheet" href="css/subModal.css" type="text/css" />\r\n' );

document.write ( '<script language="JavaScript" src="js/common.js"></script>\r\n' );
document.write ( '<script language="JavaScript" src="js/DateTimePicker.js"></script>\r\n' );
document.write ( '<script language="JavaScript" src="js/keyEventHandler.js"></script>\r\n' );
document.write ( '<script language="JavaScript" src="js/server.js"></script>\r\n' );
document.write ( '<script language="JavaScript" src="js/xml.js"></script>\r\n' );

document.write ( '<script src="js/jquery.js" type="text/javascript"></script>\r\n' );
document.write ( '<script src="js/jquery.meio.mask.js" type="text/javascript" charset="utf-8"></script>\r\n' );

// ---------------------------------------------------------------------
// ----------   Utility Methods Section   ------------------------------

/**
 * In Firefox it is implemented ( array.indexOf ), but in IE it is not.
 */
function arrayIndexOf ( array, element )
{
  if ( array == null || element == null ) return -1;
  for ( var k = 0; k < array.length; k ++ )
  {
    if ( array [ k ] == element ) return k;
  }
  return -1;
}


/**
 *
 */
function endsWith ( text, pattern )
{
  if ( text == null ) return false;
  if ( pattern == null ) return true;
  return ( text.lastIndexOf ( pattern ) == ( text.length - pattern.length ) );
}


/**
 *
 */
function pixToInt ( text )
{
  if ( text == null || text.length == 0 ) return 0;

  var index = text.indexOf ( "px" );
  if ( index >= 0 ) text = text.substring ( 0, index );
  var int = 0;
  try
  {
    int = parseInt ( text );
  }
  catch ( e ) { int = 0 }

  return int;
}


/**
 *
 */
function getObjectInstance ( fullName )
{
  var inst = "";
  if ( fullName != null )
  {
    var dotInd = fullName.indexOf ( '.' );
    if ( dotInd > 0 ) inst = fullName.substring ( dotInd );
  }
  return inst;
}


/**
 *
 */
function htmlDecode ( value )
{
  if ( value == null || value.length == 0 ) return value;
  var res    = "";
  var num    = "";
  var status = 0;
  for ( var k = 0; k < value.length; k ++ )
  {
    var c = value.charAt ( k );
    if ( status == 0 )
    {
      if ( c == '&' )
      {
        status = 1;
      }
      else
      {
        res += c;
      }
    }
    else if ( status == 1 )
    {
      if ( c == '#' )
      {
        status = 2;
        num = "";
      }
      else
      {
        res += '&' + c;
        status = 0;
      }
    }
    else if ( status == 2 )
    {
      if ( c == ';' )
      {
        res += String.fromCharCode ( parseInt ( num ) );
        status = 0;
      }
      else if ( '0' <= c && c <= '9' )
      {
        num += c;
      }
      else
      {
        res += "&#" + num + c;
        status = 0;
      }
    }
  }
  return res;
}


/**
 *
 */
function htmlEncode ( value )
{
  if ( value == null || value.length == 0 ) return value;
  var res = "";
  for ( var k = 0; k < value.length; k ++ )
  {
    res += "&#" + value.charCodeAt ( k ) + ";";
  }
  return res;
}


/**
 *
 */
function digitDecode ( value )
{
  if ( value == null || value.length == 0 ) return value;
  var parts = value.split ( ' ' );
  var res = "";
  for ( var k = 0; k < parts.length; k ++ )
  {
    res += String.fromCharCode ( parseInt ( parts [ k ] ) );
  }
  return res;
}


/**
 *
 */
function digitEncode ( value )
{
  if ( value == null || value.length == 0 ) return "";
  var res = "";
  for ( var k = 0; k < value.length; k ++ )
  {
    var c = value.charCodeAt ( k );
    res += c + " ";
  }
  return res;
}


/**
 *
 */
function replaceAll ( str, pattern, text )
{
  var ind;
  var len = pattern.length;
  while ( ( ind = str.indexOf ( pattern ) ) >= 0 )
  {
    str = str.substring ( 0, ind ) + text + str.substring ( ind + len );
  }
  return str;
}


/**
 *
 */
function toHtml ( str )
{
  str = replaceAll ( str, "<", "&lt;" );
  str = replaceAll ( str, ">", "&gt;" );
  str = replaceAll ( str, '"', "&quot;" );
  return str;
}


/**
 *
 */
function fromHtml ( str )
{
  str = replaceAll ( str, "&lt;", "<" );
  str = replaceAll ( str, "&gt;", ">" );
  str = replaceAll ( str, "&quot;", '"' );
  return str;
}


/**
 *
 */
function getElementsByType ( type )
{
  var x = null;

  if ( document.getElementsByTagName )
  {
    x = document.getElementsByTagName ( type );
  }
  else if ( document.all )
  {
    x = document.all.tags ( type );
  }
  else
  {
    alert ( "No document.getElementsByTagName or document.all for the browser" );
  }
  return x;
}


/**
 *
 */
function getDivs ( )
{
  return getElementsByType ( "DIV" );
}


/**
 *
 */
function getInputs ( )
{
  var inputs = getElementsByType ( "INPUT" );
  var areas  = getElementsByType ( "TEXTAREA" );
  if ( inputs == null ) inputs = new Array ( );
  if ( areas != null && areas.length > 0 )
  {
    var start = inputs.length;
    for ( var k = 0; k < areas.length; k ++ )
    {
      inputs [ start + k ] = areas [ k ];
    }
  }
  return inputs;
}


/**
 *
 */
function getElement ( id )
{
  var element = null;
  if ( document.getElementById )
  {
    element = document.getElementById ( id );
  }
  if ( element == null && document.all )
  {
    element = document.all [ id ];
  }
  if ( element == null && document.getElementsByName )
  {
    var x = document.getElementsByName ( id );
    if ( x && x.length > 0 ) element = x [ 0 ];
  }
  return element;
}


/**
 *
 */
function createDiv ( divId )
{
  var theBody = document.getElementsByTagName ( 'BODY' ) [ 0 ];
  var div = document.createElement ( "div" );
  div.id = divId;
  theBody.appendChild ( div );
  return div;
}


/**
 * Uses arrays from DatePicker.js:
 * monthArrayShort and monthArrayShortEs
 * dayArrayMed and dayArrayMedEs
 * dayArrayLong and dayArrayLongEs
 */
function dateEncode ( date )
{
  var ind;
  var k;
  var len = date.length;
  var upper = date.toUpperCase ( );

  for ( k = 0; k < 12; k ++ )
  {
    ind = upper.indexOf ( monthArrayShort [ k ].toUpperCase ( ) + '-' );
    if ( ind > 0 || ( ind == 0 && len < 10 ) )
    {
      date = date.substring ( 0, ind ) + monthArrayShortEs [ k ] + date.substring ( ind + 3 );
      break;
    }
    ind = upper.indexOf ( monthArrayShort [ k ].toUpperCase ( ) + ' ' );
    if ( ind > 0 || ( ind == 0 && len < 10 ) )
    {
      date = date.substring ( 0, ind ) + monthArrayShortEs [ k ] + date.substring ( ind + 3 );
      break;
    }
  }

  upper = date.toUpperCase ( );

  for ( k = 0; k < 7; k ++ )
  {
    ind = upper.indexOf ( dayArrayLong [ k ].toUpperCase ( ) );
    if ( ind >= 0 )
    {
      date = date.substring ( 0, ind ) + dayArrayLongEs [ k ] + date.substring ( ind + dayArrayLong [ k ].length );
      break;
    }
    ind = upper.indexOf ( dayArrayMed [ k ].toUpperCase ( ) );
    if ( ind == 0 && len > 10 )
    {
      date = date.substring ( 0, ind ) + dayArrayMedEs [ k ] + date.substring ( ind + dayArrayMed [ k ].length );
      break;
    }
  }

  return date;
}


/**
 * Uses arrays from DatePicker.js:
 * monthArrayShort and monthArrayShortEs
 * dayArrayMed and dayArrayMedEs
 * dayArrayLong and dayArrayLongEs
 */
function dateDecode ( date )
{
  var ind;
  var k;
  var len = date.length;
  var upper = date.toUpperCase ( );

  for ( k = 0; k < 7; k ++ )
  {
    ind = upper.indexOf ( dayArrayLongEs [ k ].toUpperCase ( ) );
    if ( ind >= 0 )
    {
      date = date.substring ( 0, ind ) + dayArrayLong [ k ] + date.substring ( ind + dayArrayLongEs [ k ].length );
      break;
    }
    ind = upper.indexOf ( dayArrayMedEs [ k ].toUpperCase ( ) );
    if ( ind == 0 && len > 10 )
    {
      date = date.substring ( 0, ind ) + dayArrayMed [ k ] + date.substring ( ind + dayArrayMedEs [ k ].length );
      break;
    }
  }

  upper = date.toUpperCase ( );

  for ( k = 0; k < 12; k ++ )
  {
    ind = upper.indexOf ( monthArrayShortEs [ k ].toUpperCase ( ) + '-' );
    if ( ind > 0 || ( ind == 0 && len < 10 ) )
    {
      date = date.substring ( 0, ind ) + monthArrayShort [ k ] + date.substring ( ind + 3 );
      break;
    }
    ind = upper.indexOf ( monthArrayShortEs [ k ].toUpperCase ( ) + ' ' );
    if ( ind > 0 || ( ind == 0 && len < 10 ) )
    {
      date = date.substring ( 0, ind ) + monthArrayShort [ k ] + date.substring ( ind + 3 );
      break;
    }
  }

  return date;
}



// ---------------------------------------------------------------------
// ----------   PickLists Section   ------------------------------------

var submodalMaskDiv      = null;
var submodalContainerDiv = null;
var pickListFormName     = null;
var pickListValueField   = null;
var pickListField        = null;
var pickListFieldsList   = null;
var pickListShown        = false;
var pickListDataCount    = 0;
var pickListInputId      = 0;
var pickListInputMin     = 0;
var pickListInputMax     = 0;
var pickListPage         = 0;
var pickListLastPage     = true;
var pickListLastCommand  = "";


/**
 *
 */
function pickListRowSelect ( shift )
{
  if ( shift == null ) return;

  var id = pickListInputId + shift;
  var input = getElement ( "pickListInput" + id );

  if ( ! input || input == null )
  {
    if ( shift > 0 )
    {
      id = pickListInputMax - 1;
      if ( pickListInputId == id )
      {
        pickListNextPage ( );
        return;
      }
    }
    if ( shift < 0 )
    {
      id = pickListInputMin;
      if ( pickListInputId == id )
      {
        pickListPrevPage ( );
        return;
      }
    }
    input = getElement ( "pickListInput" + id );
  }

  if ( input )
  {
    var oldRow = getElement ( "inst" + pickListInputId );
    pickListInputId += shift;
    var newRow = getElement ( "inst" + pickListInputId );
    if ( oldRow ) oldRow.style.background = "#FFFFFF";
    if ( newRow ) newRow.style.background = "#F0F0A0";
    input.focus ( );
  }
}


/**
 *
 */
function pickListEventHandler ( eventCode )
{
  if ( eventCode == "ESCAPE" )
  {
    closeSubmodal ( );
  }
  if ( eventCode == "NEXTINSTANCE" )
  {
    pickListRowSelect ( 1 );
  }
  else if ( eventCode == "NEXT_PAGE" || eventCode == "NEXTPAGE" )
  {
    pickListRowSelect ( 7 );
  }
  else if ( eventCode == "PREVINSTANCE" )
  {
    pickListRowSelect ( -1 );
  }
  else if ( eventCode == "PREVIOUS_PAGE" || eventCode == "PREVPAGE" )
  {
    pickListRowSelect ( -7 );
  }
  else if ( eventCode == "NEXTOBJECT" )
  {
    var tr = getElement ( "inst" + pickListInputId );
    returnData ( tr, pickListField );
  }
}


/**
 *
 */
function pickListPrevPage ( )
{
  if ( pickListPage <= 0 ) return;
  pickListPage --;
  pickListLastCommand = "prev";
  var cmd = prepareCommand ( "PICKLIST", objectInFocus, model.getInDepth ( objectInFocus.name ) );
  doAppRequest ( "command=" + cmd + "&page=" + pickListPage );
}


/**
 *
 */
function pickListNextPage ( )
{
  if ( pickListLastPage ) return;
  pickListPage ++;
  pickListLastCommand = "next";
  var cmd = prepareCommand ( "PICKLIST", objectInFocus, model.getInDepth ( objectInFocus.name ) );
  doAppRequest ( "command=" + cmd + "&page=" + pickListPage );
}


/**
 *
 */
function openSubmodal ( html, left, top, w, h )
{
  closeSubmodal ( );

  var theBody = document.getElementsByTagName ( 'BODY' ) [ 0 ];

  if ( submodalMaskDiv == null )
  {
    submodalMaskDiv = document.createElement ( "div" );
    submodalMaskDiv.id = "popupMask";
    submodalMaskDiv.style.filter  = "alpha(opacity=20)";
    submodalMaskDiv.style.float   = "left";
    submodalMaskDiv.style.opacity = "0.20";
    submodalMaskDiv.style.width   = "100%";
    submodalMaskDiv.style.height  = "100%";
    submodalMaskDiv.innerHTML = '<table width="100%" height="100%"><tr onclick="closeSubmodal ( );"><td>&nbsp;</td></tr></table>';
    theBody.appendChild ( submodalMaskDiv );
  }

  if ( w == null || w == 0 ) w = 300;
  if ( h == null || h == 0 ) h = 200;

  if ( submodalContainerDiv == null || ! ( submodalContainerDiv ) )
  {
    submodalContainerDiv = document.createElement ( 'div' );
    submodalContainerDiv.id = 'popupContainer';
    submodalContainerDiv.style.zIndex = "10001";
    submodalContainerDiv.innerHTML = 
    '<div id="popupInner"><div id="popupTitleBar" style="width:' + ( w - 3 ) + 'px; height:17px; padding:0px;">' +
    '<table cellpadding="0" cellspacing="0" border="0" width="100%"><tr>' + 
    '<td width="100%" align="right">&nbsp;</td>' +  
    '<td valign="top"><img id="pListUp" src="images/PageUp.gif" style="position:relative; top:3px;" onclick="pickListPrevPage ( );"/></td>' + 
    '<td valign="top"><img id="pListDn" src="images/PageDown.gif" style="position:relative; top:2px;" onclick="pickListNextPage ( );"/></td>' + 
    '<td valign="top"><img src="images/closeSubmodal.gif" style="position:relative; left:-1px; top:1px;" onclick="closeSubmodal ( );"/></td>' + 
    '</tr></table></div><div id="popupScrollable" style="border: 1px;"></div></div>';
    theBody.appendChild ( submodalContainerDiv );
  }

  var pUp = document.getElementById ( "pListUp" ); 
  if ( pickListPage <= 0 )
  {
    pUp.style.visibility = "hidden";
  }
  else
  {
    pUp.style.visibility = "visible";
  }

  pickListLastPage = ( pickListInputMax >= pickListDataCount );

  var pDn = document.getElementById ( "pListDn" ); 
  if ( pickListLastPage )
  {
    pDn.style.visibility = "hidden";
  }
  else
  {
    pDn.style.visibility = "visible";
  }

  var screenWidth  = document.width;
  var screenHeight = document.height;

  if ( left >= 0 && top >= 0 )
  {
    // Adjust dialog
  }
  else
  {
    // Center dialog
    left = Math.abs ( screenWidth  - w ) / 2;
    top  = Math.abs ( screenHeight - h ) / 2;
  }

  var frameDiv = document.getElementById ( "popupScrollable" );
  if ( frameDiv && html != null && html.length > 0 )
  if ( frameDiv && submodalContainerDiv )
  {
    submodalMaskDiv.style.display = "block";

    html  = '<form id="pickListForm">' + html;
    html += '<input id="pickListDummyInput" style="width:1px; height:1px; border:1px;"/>';
    html += '</form>';
    //alert ( html );

    frameDiv.innerHTML     = html;
    frameDiv.style.width   = "" + w + "px";
    frameDiv.style.height  = "" + h + "px";
    frameDiv.style.display = "block";

    submodalContainerDiv.style.left    = "" + left + "px";
    submodalContainerDiv.style.top     = "" + top  + "px";
    submodalContainerDiv.style.width   = "" + w + "px";
    submodalContainerDiv.style.height  = "" + h + "px";
    submodalContainerDiv.style.display = "block";
    pickListShown = true;

    pickListInputMin = 0;
    var ind1 = html.indexOf ( "pickListInput" );
    if ( ind1 > 0 )
    {
      ind1 += 13;
      var ind2 = html.indexOf ( '"', ind1 );
      if ( ind2 > 0 )
      {
        try
        {
          pickListInputMin = parseInt ( html.substring ( ind1, ind2 ) );
        }
        catch ( e ) { }
      }
    }

    pickListInputId = pickListInputMin;
    if ( pickListLastCommand == "prev" ) pickListInputId = pickListInputMax - 1;
    pickListLastCommand = "";
    pickListRowSelect ( 0 );
  }
}


/**
 *
 */
function closeSubmodal ( )
{
  var theBody = document.getElementsByTagName ( "BODY" ) [ 0 ];

  if ( theBody && submodalMaskDiv != null )
  {
    //theBody.removeChild ( submodalMaskDiv );
    //submodalMaskDiv = null;
    submodalMaskDiv.style.display = "none";
  }

  if ( theBody && submodalContainerDiv != null )
  {
    //theBody.removeChild ( submodalContainerDiv );
    //submodalContainerDiv = null;
    submodalContainerDiv.style.display = "none";
  }

  pickListShown = false;
}


/**
 *
 */
function returnData ( tr, fieldInstName )
{
  if ( tr == null )
  {
    alert ( "returnData: tr is null" );
    return;
  }

  if ( pickListField == null || pickListFieldsList == null )
  {
    alert ( "pickListField or pickListFieldList are null\r\n" + tr.innerHTML );
    return;
  }

  if ( pickListField != fieldInstName )
  {
    alert ( "No pick list match: " + pickListField + " ? " + fieldInstName );
    return;
  }

  var cells = tr.cells;
  if ( cells == null )
  {
    alert ( "returnData: no cells" );
    return;
  }

  var ext = "";
  var dotInd = pickListField.indexOf ( '.' );
  if ( dotInd > 0 ) ext = pickListField.substring ( dotInd );

  var group = model.getInDepth ( pickListField ).container;

  var formFields = model.getPickListFields ( pickListFormName );
  var field;

  for ( var k = formFields.length - 1; k >= 0; k -- )
  {
    field = formFields [ k ];
    var fName = field.name;
    if ( ext.length > 0 ) fName += ext;
    var element = getElement ( fName );
    if ( field.container != group || element == null || ! ( element ) )
    {
      formFields.splice ( k, 1 );
      continue;
    }
  }

  var cellName;
  var fieldNames = new Array ( );
  var values     = new Array ( );
  var value;

  for ( var k = 1; k < cells.length; k ++ )
  {
    cellName = cells [ k ].getAttribute ( "name" );
    value = cells [ k ].innerHTML;
    if ( value == "&nbsp;" ) value = "";
    value = fromHtml ( value );
    var ok = false;

    for ( var j = 0; j < formFields.length; j ++ )
    {
      field = formFields [ j ];
      if ( field.editManager.valueField == cellName )
      {
        fieldNames [ fieldNames.length ] = field.name + ext;
        values     [ values.length     ] = value;
        ok = true;
      }
    }
    if ( ok ) continue;

    var field = model.getInDepthByEdit ( pickListFormName, pickListFieldsList [ k - 1 ] )
    if ( field != null )
    {
      fieldNames [ fieldNames.length ] = field.name + ext;
      values     [ values.length     ] = value;
    }
    else
    {
    }
  }

  setFieldsData ( fieldNames, values );
  closeSubmodal ( );
  var fieldElement = getElement ( pickListField );
  if ( fieldElement ) fieldElement.focus ( );
}



// ---------------------------------------------------------------------
// ----------   JDataPanel Class Definition Section   ------------------

var TYPEOBJECT    =  0;
var TYPEGROUP     =  3;
var TYPETEXT      =  4;
var TYPETEXTGROUP =  5;
var TYPEFIELD     =  6;
var TYPEPICTURE   =  7;
var TYPELINE      = 12;
var TYPEBUTTON    = 13;
var TYPEMODEL     = 18;
var TYPEHLINE     = 19;
var TYPEVLINE     = 20;

var subFormX0     = 10000;
var subFormY0     = 10000;
var subFormX1     = 0;
var subFormY1     = 0;


/**
 * Class definition & constructor
 */
function EditManager ( name, frm )
{
  this.name   = name;
  this.format = frm;
  this.formName   = "";
  this.valueField = "";
  this.manualEntry = true;
}



/**
 * Class definition & constructor
 */
function NextObjectCondition ( )
{
  this.baseField          = null;
  this.defaultNextObject  = null;
  this.conditionValues      = new Array ( );
  this.conditionNextObjects = new Array ( );

  /**  */
  this.setValues = function ( values, objects )
  {
    this.conditionValues = values.split ( '|' );
    this.conditionNextObjects = objects.split ( '|' );
    for ( var k = 0; k < this.conditionNextObjects.length; k ++ )
    {
      this.conditionNextObjects [ k ] = model.getInDepth ( this.conditionNextObjects [ k ] );
    }
  }

  /**  */
  this.getNextObject = function ( objPath )
  {
    if ( this.baseField != null && this.baseField.name )
    {
      var path = this.baseField.name;

      var inst = "";
      var ind = objPath.indexOf ( "." );
      if ( ind > 0 ) inst = objPath.substring ( ind );
      if ( inst.length > 0 )
      {
        if ( inst.indexOf ( "." ) != 0 ) inst = "." + inst;
      }
      path += inst;

      var element = getElement ( path );

      for ( var k = 0; k < this.conditionValues.length; k ++ )
      {
        if ( element && element.value == this.conditionValues [ k ] && this.conditionNextObjects [ k ] != null )
        {
          return this.conditionNextObjects [ k ];
        }
      }
    }
    return this.defaultNextObject;
  }
}



/**
 * Class definition & constructor
 */
function JDataPanelObject ( objName )
{
  this.type          = TYPEOBJECT;
  this.name          = objName;
  this.container     = null;
  this.nextObject    = null;
  this.nextCondition = null;
  this.prevObject    = null;
  this.hasEvents     = false;
  this.events        = null;
  this.helpCode      = null;
  this.legendCode    = null;

  /**  */
  this.eventsSize = function ( )
  {
    if ( this.events == null ) return 0;
    return this.events.length;
  }

  /**  */
  this.eventIndex = function ( eventName )
  {
    return arrayIndexOf ( this.events, eventName );
  }

  /**  */
  this.addEvent = function ( eventName )
  {
    if ( this.eventIndex ( eventName ) < 0 )
    {
      if ( this.events == null ) this.events = new Array ( );
      this.events [ this.events.length ] = eventName;
    }
  }

  /**  */
  this.getEvent = function ( i )
  {
    if ( this.events == null ) return null;
    if ( i < 0 || i >= this.eventsSize ( ) ) return null;
    return this.events [ i ];
  }

  /**  */
  this.hasEvent = function ( eventName )
  {
    return ( this.eventIndex ( eventName ) >= 0 );
  }

  /**  */
  this.fireEvent = function ( eventName, instance )
  {
    //alert ( "[" + this.name + "] [" + instance + "] [" + eventName + "]" );
    if ( true || this.hasEvent ( eventName ) )
    {
      postJDPEvent ( this.name + "." + instance, eventName );
    }
    else if ( this.type == TYPEMODEL )
    {
      postJDPEvent ( this.name, eventName );
    }
    else if ( this.container != null )
    {
      var m = instance.lastIndexOf ( "." );
      if ( m > 0 ) instance = instance.substring ( 0, m );
      this.container.fireEvent ( eventName, instance );
    }
  }

  /** To be implemented in descendants */
  this.focus = function ( instance )
  {
  }

  /**  */
  this.eventIndex = function ( eventName )
  {
    return arrayIndexOf ( this.events, eventName );
  }

  /**  */
  this.getNextObject = function ( instPatn )
  {
    if ( this.nextCondition == null ) return this.nextObject;
    return this.nextCondition.getNextObject ( instPatn );
  }

  /**  */
  this.getPrevObject = function ( )
  {
    return this.prevObject;
  }
}



/**
 * Class definition & constructor
 */
function JDataPanelButton ( objName )
{
  this.type   = TYPEBUTTON;
  this.name   = objName;
  this.action = "";
}
JDataPanelButton.prototype = new JDataPanelObject;



/**
 * Class definition & constructor
 */
function JDataPanelField ( objName )
{
  this.type        = TYPEFIELD;
  this.name        = objName;
  this.editManager = null;
  this.enabled     = true;
  this.mustFill    = false;
  this.required    = false;
  this.minValue    = null;
  this.maxValue    = null;
  this.arrowText   = "";

  /**  */
  this.setMustFill = function ( value )
  {
    this.mustFill = value;
  }

  /**  */
  this.setRequired = function ( value )
  {
    this.required = value;
  }

  /**  */
  this.focus = function ( instance )
  {
    var inpName = this.name;
    if ( instance.length > 0 ) inpName += "." + instance;
    //alert ( inpName );
    var input = getElement ( inpName );
    if ( input )
    {
      input.disabled = false;
      input.focus ( );
    }
  }

  /**  */
  this.verifyMinInstance = function ( instance )
  {
    if ( instance == null || instance.length == 0 ) return;
    if ( this.container == null || this.container.type != TYPEGROUP ) return;
    var lastDotPos = 0;
    for ( var k = instance.length - 1; k > 0; k -- )
    {
      if ( instance [ k ] == "." )
      {
        lastDotPos = k;
        break;
      }
    }
    if ( lastDotPos > 0 ) instance = instance.substring ( lastDotPos + 1 );
    var inst = parseInt ( instance );
    if ( inst < this.container.minInstance )
    {
      this.container.minInstance = inst;
    }
    if ( inst > this.container.maxInstance )
    {
      this.container.maxInstance = inst;
    }
  }

  /**  */
  this.getEditManager = function ( )
  {
    return this.editManager;
  }

  /**  */
  this.setEditManager = function ( eManager )
  {
    this.editManager = eManager;
  }
}

JDataPanelField.prototype = new JDataPanelObject;



/**
 * Class definition & constructor
 */
function JDataPanelGroup  ( groupName )
{
  this.type           = TYPEGROUP;
  this.subType        = TYPEGROUP;
  this.name           = groupName;
  this.elements       = new Array ( );
  this.elemInstances  = new Array ( );
  this.firstObject    = null;
  this.minInstance    = 10000000;
  this.maxInstance    = 0;
  this.visibleOnFocus = false;

  /**  */
  this.size = function ( )
  {
    return this.elements.length;
  }

  /**  */
  this.elementIndex = function ( element )
  {
    return arrayIndexOf ( this.elements, element );
  }

  /**  */
  this.addElement = function ( element )
  {
    if ( this.elementIndex ( element ) < 0 )
    {
      this.elements [ this.elements.length ] = element;
      element.container = this;
    }
  }

  /**  */
  this.getElement = function ( i )
  {
    if ( i < 0 || i >= this.elementsSize ( ) ) return null;
    return this.elements [ i ];
  }

  /**  */
  this.setElement = function ( i, element )
  {
    if ( i < 0 || i >= this.elementsSize ( ) ) return;
    this.elements [ i ] = element;
    element.container = this;
  }

  /**  */
  this.getVisibleOnFocus = function ( )
  {
    if ( this.visibleOnFocus ) return true;
    if ( this.container && this.container != model )
    {
      return this.container.getVisibleOnFocus ( );
    }
    return false;
  }

  /**  */
  this.setElementInstance = function ( htmlElement )
  {
    if ( arrayIndexOf ( this.elemInstances, htmlElement ) == -1 )
    {
      this.elemInstances [ this.elemInstances.length ] = htmlElement;
    }
    if ( this.type == TYPEGROUP && this.getVisibleOnFocus ( ) )
    {
      htmlElement.style.visibility = "hidden";
    }
  }

  /**  */
  this.getFirstElementInstance = function ( )
  {
    if ( this.firstObject == null ) return null;
    var fName = this.firstObject.name;
    var count = this.elemInstances.length;
    for ( var k = 0; k < count; k ++ )
    {
      var element = this.elemInstances [ k ];
      if ( element.name && element.name.indexOf ( fName ) == 0 ) return element;
    }
    return null;
  }

  /**  */
  this.getInDepth = function ( objName )
  {
    if ( objName == null || ! ( objName ) ) return null;
    if ( objName == this.name ) return this;
    var dotPos = objName.indexOf ( "." );
    if ( dotPos > 0 ) objName = objName.substring ( 0, dotPos );
    var element = null;
    for ( var k = 0; k < this.elements.length; k ++ )
    {
      element = this.elements [ k ];
      if ( element.name == objName )
      {
        return element;
      }
      if ( element.type == TYPEGROUP )
      {
        element = element.getInDepth ( objName );
        if ( element != null ) return element;
      }
    }
    return null;
  }

  /**  */
  this.getInDepthByEdit = function ( formName, fieldName )
  {
    if ( formName  == null || ! ( formName  ) ) return null;
    if ( fieldName == null || ! ( fieldName ) ) return null;

    var element = null;
    var eManager;
    for ( var k = 0; k < this.elements.length; k ++ )
    {
      element = this.elements [ k ];
      if ( element.editManager )
      {
        eManager = element.editManager;
        if ( eManager.formName == formName && eManager.valueField == fieldName )
        {
          return element;
        }
      }
      else if ( element.type == TYPEGROUP )
      {
        element = element.getInDepthByEdit ( formName, fieldName );
        if ( element != null ) return element;
      }
    }
    return null;
  }

  /**  */
  this.setFirstObject = function ( objName )
  {
    var f = this.getInDepth ( objName );
    if ( f )
    {
      this.firstObject = f;
      var c = f.container;
      if ( c && c != this )
      {
        if ( c.container == this )
        {
          this.firstObject = c;
          c.firstObject = f;
        }
      }
    }
  }

  /**  */
  this.focus = function ( instance )
  {
    if ( this.firstObject != null )
    {
      if ( this.type == TYPEGROUP )
      {
        if ( instance.length > 0 ) instance += ".";
        instance += this.minInstance;
      }
      //alert ( this.name + ".focus ( " + instance + " )" );
      this.firstObject.focus ( instance );
    }
  }

  /**  */
  this.getInstanceData = function ( instance )
  {
    var xml = "";
    return xml;
  }

  /**  */
  this.setVisible = function ( visible, instance )
  {
    if ( this.elemInstances == null ) return;
    if ( instance == null ) instance = "";
    var count = this.elemInstances.length;

    for ( var k = 0; k < count; k ++ )
    {
      var element = this.elemInstances [ k ];
      if ( element && element.id && element.style && element.style.visibility )
      {
        if ( element.type && element.type == "hidden" ) continue;
        if ( instance.length == 0 || endsWith ( element.id, "." + instance ) )
        {
          element.style.visibility = ( visible ) ? "visible" : "hidden";
          element.style.zIndex = 5100;
          var x = pixToInt ( element.style.left );
          var y = pixToInt ( element.style.top  );
          var w = pixToInt ( element.style.width  );
          var h = pixToInt ( element.style.height );
          if ( h == NaN || h <= 0 ) h = 16;
          if ( x >= 0 && subFormX0 > x ) subFormX0 = x;
          if ( y >= 0 && subFormY0 > y ) subFormY0 = y;
          if ( w >= 0 && subFormX1 <  ( x + w ) ) subFormX1 = ( x + w );
          if ( h >= 0 && subFormY1 <  ( y + h ) ) subFormY1 = ( y + h );
        }
      }
    }

    if ( this.visibleOnFocus )
    {
      count = this.size ( );
      for ( var k = 0; k < count; k ++ )
      {
        var pObj = this.elements [ k ];
        if ( pObj )
        {
          if ( pObj.type == TYPEGROUP && ( ! pObj.visibleOnFocus || pObj.subType == TYPETEXTGROUP ) )
          {
            pObj.setVisible ( visible, instance );
          }
        }
      }
    }
  }

  /**  */
  this.debugStructure = function ( shift )
  {
    var debug = "";
    if ( shift == 0 )
    {
      debug += this.name;
      debug += "{ first: ";
      if ( this.firstObject != null ) debug += this.firstObject.name;
      debug += " }\r\n";
    }
    for ( var k = 0; k < this.elements.length; k ++ )
    {
      for ( var m = 0; m <= shift; m ++ ) debug += "  ";
      var element = this.elements [ k ];
      debug += element.name;

      if ( element.type == TYPEGROUP )
      {
        if ( element.firstObject != null )
        {
          debug += "{first: " + element.firstObject.name + "} ";
        }
        debug += "{minInst: " + element.minInstance + "} ";
      }

      if ( element.nextObject != null )
      {
        debug += "{next: " + element.nextObject.name + "} ";
      }

      for ( var i = 0; i < element.eventsSize ( ); i ++ )
      {
        if ( i == 0 ) debug += " ( events: ";
        debug += element.getEvent ( i ) + "; ";
        if ( i == element.eventsSize ( ) - 1 ) debug += " )";
      }
      debug += "\r\n";
      if ( this.elements [ k ].type == TYPEGROUP )
      {
        debug += element.debugStructure ( shift + 1 );
      }
    }
    return debug;
  }
}

JDataPanelGroup.prototype = new JDataPanelObject;



/**
 * Class definition & constructor
 */
function JDataPanelModel ( modelName )
{
  this.type      = TYPEMODEL;
  this.name      = modelName;
  this.mode      = "";
  this.fields    = new Array ( );
  this.registry  = new Array ( );  // The names of all JDataPanel objects
  this.registry [ 0 ] = modelName;

  /**  */
  this.containsName = function ( objName )
  {
    return ( arrayIndexOf ( this.registry, objName ) >= 0 );
  }

  /**  */
  this.register = function ( objName )
  {
    if ( this.containsName ( objName ) ) return;
    this.registry [ this.registry.length ] = objName;
  }

  /**  */
  this.debugRegistry = function ( )
  {
    var debug = "";
    for ( var k = 0; k < this.registry.length; k ++ )
    {
      debug += this.registry [ k ] + "; ";
    }
    return debug;
  }

  /**  */
  this.setNextObject = function ( objName, nextName )
  {
    var pObj = this.getInDepth ( objName );
    var nObj = this.getInDepth ( nextName );
    if ( pObj != null && nObj != null )
    {
      pObj.nextObject = nObj;
      nObj.prevObject = pObj;
    }
  }

  /**  */
  this.getDataChange = function ( )
  {
  }

  /**  */
  this.setDataChange = function ( dataChange )
  {
  }

  /**  */
  this.getPickListFields = function ( formName )
  {
    var formFields = new Array ( );
    if ( formName  == null || ! ( formName  ) ) return formFields;

    var field;
    for ( var k = 0; k < this.fields.length; k ++ )
    {
      field = this.fields [ k ];
      if ( field.editManager && field.editManager.formName == formName )
      {
        formFields [ formFields.length ] = field;
      }
    }
    return formFields;
  }
}

JDataPanelModel.prototype = new JDataPanelGroup;



// ---------------------------------------------------------------------
// ----------   Variables Section   ------------------------------------

var model = null;

var printFormName = "";
var backgroundAction = "";

var originalValues = new Array ( );

var visitationHistory = new Array ( );

var currentIndex = -1;
var current = "";

var objectInFocus = null;
var objectToBeInFocus = null;

var firstPage     = false;
var lastPage      = false;

var disableNotFocused = false;
var runEventsOnFocus  = true;



// ---------------------------------------------------------------------
// ----------   Registration Section   ---------------------------------

/**
 *
 */
function registerModel ( objName )
{
  model = new JDataPanelModel ( objName );
}


/**
 *
 */
function getMode ( )
{
  return model.mode;
}


/**
 *
 */
function registerPanelObject ( pObj, containerName, eventArray )
{
  model.register ( pObj.name );

  if ( containerName == model.name )
  {
    model.addElement ( pObj );
    //alert ( "Object [" + pObj.name + "] added to the model" );
  }
  else
  {
    var container = model.getInDepth ( containerName );
    if ( container != null && ( container.type == TYPEGROUP ) )
    {
      container.addElement ( pObj );
      //alert ( "Object [" + pObj.name + "] added to container [" + container.name + "]" );
    }
    else
    {
      pObj.containerName = containerName;
      //alert ( "Container [" + containerName + "] not found" );
    }
  }

  if ( eventArray != null )
  {
    for ( var k = 0; k < eventArray.length; k ++ )
    {
      pObj.addEvent ( eventArray [ k ] );
    }
  }
}


/**
 *
 */
function registerGroup ( objName, containerName /*, ...*/ )
{
  if ( model == null ) return;
  if ( model.containsName ( objName ) ) return;
  var group = new JDataPanelGroup ( objName );
  var argv  = registerGroup.arguments;
  var eventArray = new Array ( );
  for ( var k = 2; k < argv.length; k ++ )
  {
    eventArray [ k - 2 ] = argv [ k ];
  }
  registerPanelObject ( group, containerName, eventArray );
  return group;
}


/**
 *
 */
function registerTextGroup ( objName, containerName )
{
  if ( model == null ) return;
  if ( model.containsName ( objName ) ) return;
  var group = new JDataPanelGroup ( objName );
  group.subType = TYPETEXTGROUP;
  registerPanelObject ( group, containerName, null );
  return group;
}


/**
 *
 */
function registerField ( objName, containerName /*, ...*/ )
{
  if ( model == null ) return;
  if ( model.containsName ( objName ) ) return;
  var field = new JDataPanelField ( objName );
  var argv  = registerField.arguments;
  var eventArray = new Array ( );
  for ( var k = 2; k < argv.length; k ++ )
  {
    eventArray [ k - 2 ] = argv [ k ];
  }
  registerPanelObject ( field, containerName, eventArray );
  model.fields [ model.fields.length ] = field;
  return field;
}


/**
 *
 */
function registerButton ( objName, containerName, action )
{
  if ( model == null ) return;
  if ( model.containsName ( objName ) ) return;
  var button = new JDataPanelButton ( objName );
  button.action = action;
  registerPanelObject ( button, containerName, null );
  return button;
}


/**
 *
 */
function registerObject ( objName, containerName /*, ...*/ )
{
  if ( model == null ) return;
  if ( model.containsName ( objName ) ) return;
  var pObj = new JDataPanelObject ( objName );
  registerPanelObject ( pObj, containerName, null );
  return pObj;
}


/**
 *
 */
function setMinimum ( fieldName, value )
{
  if ( model == null ) return;
  var field = model.getInDepth ( fieldName );
  if ( field != null ) field.minValue = value;
}


/**
 *
 */
function setMaximum ( fieldName, value )
{
  if ( model == null ) return;
  var field = model.getInDepth ( fieldName );
  if ( field != null ) field.maxValue = value;
}


/**
 *
 */
function setVisibleOnFocus ( containerName )
{
  if ( model == null ) return;
  var cObj = model.getInDepth ( containerName );
  if ( cObj != null && cObj.setFirstObject )
  {
    cObj.visibleOnFocus = true;
  }
}


/**
 *
 */
function setFirstObject ( containerName, objName )
{
  if ( model == null ) return;
  var cObj = model.getInDepth ( containerName );
  if ( cObj != null && cObj.setFirstObject )
  {
    cObj.setFirstObject ( objName );
  }
}


/**
 *
 */
function setNextObject ( objName, nextObjName )
{
  if ( model != null ) model.setNextObject ( objName, nextObjName );
}


/**
 *
 */
function setNextCondition ( objName, defaultNext, baseFieldName, conditionValue, conditionNext )
{
  if ( model == null ) return;

  var pObj = model.getInDepth ( objName );
  if ( pObj == null ) return;

  var bField = model.getInDepth ( baseFieldName );
  if ( bField == null ) return;

  var dField = model.getInDepth ( defaultNext );
  if ( dField == null ) return;

  var condition = new NextObjectCondition ( );
  condition.baseField           = bField
  condition.defaultNextObject   = dField;
  condition.setValues ( conditionValue, conditionNext );

  pObj.nextCondition = condition;
}


/**
 *
 */
function setEditManager ( objName, editManagerType, format, formName, valueField, entry )
{
  if ( model == null ) return;
  var pObj = model.getInDepth ( objName );
  if ( pObj && pObj.setEditManager )
  {
    if ( editManagerType == "JDateField" )
    {
      if ( format.length > 0 && ( format.indexOf ( 'd' ) < 0 && format.indexOf ( 'M' ) < 0 ) )
      {
        editManagerType = "JTextField";
      }
    }
    var editManager = new EditManager ( editManagerType, format );
    editManager.formName   = formName;
    editManager.valueField = valueField;
    if ( entry && entry == "listOnly" && editManagerType == "JDataPanel" )
    {
      editManager.manualEntry = false;
    }
    pObj.setEditManager ( editManager );
  }
}


/**
 *
 */
function registerFieldEdit ( objName, container, hasEvents, editManagerType /*, format, formName, valueField, entry */ )
{
  var field = registerField ( objName, container );
  field.hasEvents = hasEvents;
  var argv = registerFieldEdit.arguments;
  for ( var k = argv.length; k < 8; k ++ )
  {
    argv [ k ] = "";
  }
  setEditManager ( objName, editManagerType, argv [ 4 ], argv [ 5 ], argv [ 6 ], argv [ 7 ] );
}


/**
 *
 */
function setMessages ( objName, hCode, lCode )
{
  if ( model == null ) return;
  var pObj = model.getInDepth ( objName );
  if ( pObj )
  {
    pObj.helpCode   = hCode;
    pObj.legendCode = lCode;
  }
}


/**
 *
 */
function setMustFill ( objName )
{
  if ( model == null ) return;
  var pObj = model.getInDepth ( objName );
  if ( pObj != null ) pObj.setMustFill ( true );
}


/**
 *
 */
function setRequired ( objName )
{
  if ( model == null ) return;
  var pObj = model.getInDepth ( objName );
  if ( pObj != null ) pObj.setRequired ( true );
}


/**
 *
 */
function setArrowField ( name, text )
{
  //alert ( name + " [" + text + "]" );
  if ( model == null ) return;
  var field = model.getInDepth ( name );
  if ( field != null )
  {
    field.arrowText = text;
    var inputs = getInputs ( );
    for ( var k = 0; k < inputs.length; k ++ )
    {
      var input = inputs [ k ];
      var iName = input.name;
      var dotInd = iName.indexOf ( "." );
      if ( dotInd > 0 ) iName = iName.substring ( 0, dotInd );
      if ( name == iName )
      {
        input.value = "";
        originalValues [ input.name ] = "";
      }
    }
  }
}



// ---------------------------------------------------------------------
// ----------   Help and Editor Support Section   ----------------------

/**
 * Required by editor functionality
 */
function getCurrentField ( )
{
  return objectInFocus;
}


/**
 * Required by editor functionality
 */
function getCurrentFieldId ( )
{
  if ( objectInFocus ) return objectInFocus.id;
  return null;
}


/**
 * Required by help functionality
 */
function getCurrentHelpId ( )
{
  var helpCode = null;
  if ( objectInFocus )
  {
    name = objectInFocus.name;
    var panelObject = model.getInDepth ( name );
    while ( panelObject )
    {
      if ( panelObject.helpCode != null && panelObject.helpCode.length > 0 )
      {
        helpCode = panelObject.helpCode;
        break;
      }
      panelObject = panelObject.container;
    }
  }
  return helpCode;
}



// ---------------------------------------------------------------------
// ----------   Manipulation Section   ---------------------------------

/**
 *
 */
function isValueChanged ( input )
{
  if ( input && input.value )
  {
    var oldValue = originalValues [ input.name ];
    var newValue = input.value;
    if ( oldValue == null && newValue == null ) return false;
    if ( oldValue == null && newValue != null ) return true;
    if ( oldValue != null && newValue == null ) return true;
    return ( oldValue != newValue );
  }
  else if ( input && originalValues [ input.name ] )
  {
    return true;
  }
  return false;
}


/**
 *
 */
function getDataChanges ( )
{
  if ( model == null ) return;

  var input;
  var oldValue;
  var newValue;

  var inputs  = getInputs ( );
  var inpSize = inputs.length;

  var changes = "<changes model=\"" + model.name + "\">";

  for ( var k = 0; k < inpSize; k ++ )
  {
    input = inputs [ k ];
    if ( isValueChanged ( input ) )
    {
      newValue = input.value;
      if ( newValue == null ) newValue = ""; // "null"
      changes += "<" + input.name + ">" + newValue + "</" + input.name + ">";
    }
  }

  changes += "</changes>";
  return changes;
}


/**
 *
 */
function processValue ( panelObject, value )
{
  if ( panelObject && panelObject.editManager )
  {
    if ( panelObject.editManager.name == "JDateField" )
    {
      value = dateDecode ( value );
    }
  }
  return digitEncode ( value );
}


/**
 *
 */
function sendDataChange ( name, value )
{
  var panelObject = model.getInDepth ( name );
  var cmd = "command=itemChanged&model=" + model.name + "&field=" + name + "&value=" + processValue ( panelObject, value );
  doAppRequest ( cmd );
}


/**
 *
 */
function sendDataChanges ( changes )
{
  var cmd = "command=itemChanged&model=" + model.name + "&changes=" + changes;
  doAppRequest ( cmd );
}


/**
 *
 */
function setFieldData ( fieldName, value )
{
  var field = getElement ( fieldName );
  if ( field != null )
  {
    //alert ( "setFieldData ( " + fieldName + ", " + value + " ): " + field.value );
    field.value = value;
    originalValues [ fieldName ] = value;
    sendDataChange ( field.name, value );
  }
  else
  {
    alert ( "setFieldData: field is not valid" );
  }
}


/**
 *
 */
function setFieldsData ( fieldNames, values )
{
  var xml = "";
  var fieldName;
  var field;
  var value;
  var panelObject;

  if ( fieldNames.length > 0 && fieldNames.length == values.length )
  {
    for ( var k = 0; k < fieldNames.length; k ++ )
    {
      fieldName = fieldNames [ k ];
      field = getElement ( fieldName );
      if ( field != null )
      {
        value = values [ k ];

        panelObject = model.getInDepth ( fieldName );
        if ( panelObject && panelObject.editManager )
        {
          if ( panelObject.editManager.name == "JDateField" )
          {
            value = dateDecode ( value );
          }
        }

        field.value = value;
        originalValues [ fieldName ] = value;
        xml += "<field name=\"" + fieldName + "\" value=\"" + digitEncode ( value ) + "\" />";
      }
    }
  }

  if ( xml.length > 0 )
  {
    xml = "<?xml version=\"1.0\" encoding=\"utf-8\" ?><changes>" + xml + "</changes>";
    sendDataChanges ( xml );
    //alert ( xml );
  }
}


/**
 *
 * @param root XmlNode
 */
function setDataChanges ( root )
{
  var size = root.size ( );
  var node;
  for ( var k = 0; k < size; k ++ )
  {
    node = root.get ( k );
    var input = getElement ( node.getName ( ) );
    if ( input )
    {
      var panelObject = model.getInDepth ( input.name );
      if ( panelObject )
      {
        var value = htmlDecode ( node.getValue ( ) );
        value = fromHtml ( value );
        if ( panelObject.arrowText && panelObject.arrowText.length > 0 )
        {
          if ( input == objectInFocus ) input.value = panelObject.arrowText;
        }
        else
        {
          if ( panelObject.editManager && panelObject.editManager.name == "JDateField" )
          {
            value = dateEncode ( value );
          }
          input.value = value;
          originalValues [ input.name ] = input.value;
        }
      }
    }
  }
}


/**
 *
 * @param root XmlNode
 */
function showJDPPickList ( root )
{
  //alert ( "showJDPPickList:\r\n" + root.getXmlDoc ( ) );

  var fieldValue;
  var dialogWidth  = 0;
  var dialogHeight = 0;
  var html = "";

  pickListFormName   = "";
  pickListField      = "";
  pickListValueField = "";
  pickListFieldsList = new Array ( );

  var node;
  var size = root.size ( );
  for ( var k = 0; k < size; k ++ )
  {
    node = root.get ( k );
    var name  = node.getName ( );
    var value = node.getValue ( );

    if ( name == "formName" )
    {
      pickListFormName = value;
    }
    else if ( name == "field" )
    {
      pickListField = value;
    }
    else if ( name == "value" )
    {
      fieldValue = value;
    }
    else if ( name == "valueFieldName" )
    {
      pickListValueField = value;
    }
    else if ( name == "pickListFields" )
    {
      pickListFieldsList = value.split ( ';' );
    }
    else if ( name == "dialogWidth" )
    {
      dialogWidth = parseInt ( value );
    }
    else if ( name == "dialogHeight" )
    {
      dialogHeight = parseInt ( value );
    }
    else if ( name == "html" )
    {
      html = value;
    }
    else if ( name == "data" )
    {
      html = node.getXml ( );
    }
    else if ( name == "dataCount" )
    {
      pickListDataCount = parseInt ( value );
    }
    else if ( name == "dataFinish" )
    {
      pickListInputMax = parseInt ( value );
    }
  }

  // "Global" variable
  var pField = getElement ( pickListField );
  if ( pickListField != null && pField )
  {
    var left = parseInt ( pField.style.left );
    var top  = parseInt ( pField.style.top  ) + 16;
    openSubmodal ( html, left, top, dialogWidth, dialogHeight );
  }
  else
  {
    alert ( "Picklist field is not valid" );
  }
}



// ---------------------------------------------------------------------
// ----------   Navigation Section   -----------------------------------

/**
 *
 */
function disableNotInFocus ( )
{
  return;

  if ( disableNotFocused )
  {
    var inputs  = getInputs ( );
    var inpSize = inputs.length;
    for ( var k = 0; k < inpSize; k ++ )
    {
      if ( inputs [ k ] != objectInFocus ) inputs [ k ].disabled = true;
    }
  }
}


/**
 *
 */
function enableObject ( field )
{
  return;

  if ( objectInFocus && objectInFocus != field && disableNotFocused )
  {
    objectInFocus.disabled = true;
  }
  if ( field )
  {
    field.disabled = false;
    field.readOnly = false;
    field.setAttribute ( "readonly", false );  
  }
}


/**
 *
 * @param obj
 */
function notifyInstance ( obj )
{
  if ( ! runEventsOnFocus )
  {
    runEventsOnFocus = true;
    return;
  }

  if ( obj )
  {
    var pObj = model.getInDepth ( obj.name );
    //if ( pObj ) parent.showMessageNoTarget ( pObj.legendCode );

    var oldField = "";
    var oldValue = "";
    var changed  = "";
    if ( objectInFocus )
    {
      oldField = objectInFocus.name;
      if ( pickListField == objectInFocus.name || isValueChanged ( objectInFocus ) )
      {
        changed = "true";
        oldValue = objectInFocus.value;
        var panelObject = model.getInDepth ( oldField );
        oldValue = processValue ( panelObject, oldValue );
      }
    }
    doAppRequest ( "command=NOTIFYINSTANCE&model=" + model.name + "&field=" + obj.name + "&oldField=" + oldField + "&value=" + oldValue + "&changed=" + changed );
  }
}


/**
 *
 * @param name
 * @param shift
 * @return new name
 */
function shiftNameIndex ( name, shift )
{
  var dotIndex = name.lastIndexOf ( "." );
  if ( dotIndex > 0 )
  {
    dotIndex ++;
    var index = name.substring ( dotIndex );
    index = parseInt ( index ) + shift;
    name = name.substring ( 0, dotIndex ) + index;
  }
  return name;
}


/**
 *
 */
function shiftObject ( obj, shift, changePage )
{
  if ( obj == null || obj == model ) return;

  var name = shiftNameIndex ( obj.name, shift );
  if ( name != obj.name )
  {
    //alert ( obj.name + " -> " + name );
    var newObj = getElement ( name );
    if ( newObj )
    {
      newObj.focus ( );
    }
    else if ( changePage )
    {
      var panelObject = model.getInDepth ( obj.name );
      if ( shift > 0 ) doAppCommand ( prepareCommand ( "NEXTPAGE", obj, panelObject ) );
      if ( shift < 0 ) doAppCommand ( prepareCommand ( "PREVPAGE", obj, panelObject ) );
    }
  }
}


/**
 *
 * @param obj
 */
function nextInstance ( obj )
{
  //notifyAppRequestCommand ( "RNEXT" );
  shiftObject ( obj, 1, ! lastPage );
}


/**
 *
 * @param obj
 */
function prevInstance ( obj )
{
  //notifyAppRequestCommand ( "RPREV" );
  shiftObject ( obj, -1, ! firstPage );
}


/**
 *
 * @param state
 */
function setRowState ( state )
{
  if ( objectInFocus && model )
  {
    var field = model.getInDepth ( objectInFocus.name );
    if ( field )
    {
      var group = field.container;
      if ( group )
      {
        var inst = getObjectInstance ( objectInFocus.name );
        var id = group.name;
        if ( inst.length > 0 ) id += inst;
        var rowState = document.getElementById ( id );
        if ( rowState )
        {
          var ind = state.indexOf ( "|" );
          rowState.value = state.substring ( ind + 1 );;
        }
      }
    } 
  }
}


/**
 *
 */
function setField ( fullPath )
{
  if ( fullPath == null ) return;

  var field = getElement ( fullPath );

  if ( ( ! field ) || field == null )
  {
    var index = fullPath.indexOf ( "." );
    if ( index > 0 ) fullPath = fullPath.substring ( 0, index );
    field = getElement ( fullPath );
  }

  if ( field )
  {
    objectToBeInFocus = field;
    enableObject ( field );
  }
  else
  {
    firstObject ( );
  }

  if ( field && ( objectInFocus == null || objectInFocus != field ) )
  {
    //alert ( fullPath + ": field.style.visibility = " + field.style.visibility );
    if ( field.style.visibility == "hidden" )
    {
      var pObj = model.getInDepth ( fullPath );
      if ( pObj && pObj.container )
      {
        if ( pObj.container.getVisibleOnFocus ( ) )
        {
          var dotIndex = fullPath.indexOf ( "." );
          var instance = "";
          if ( dotIndex > 0 ) instance = fullPath.substring ( dotIndex + 1 );
          subFormX0 = 10000;
          subFormY0 = 10000;
          subFormX1 = 0;
          subFormY1 = 0;
          pObj.container.setVisible ( true, instance );
          var subFormDiv = getElement ( "subFormDiv" );
          subFormX0 -= 2;
          subFormY0 -= 2;
          if ( subFormX0 < 0 ) subFormX0 = 0;
          if ( subFormY0 < 0 ) subFormY0 = 0;
          subFormX1 = subFormX1 - subFormX0 + 2;
          subFormY1 = subFormY1 - subFormY0 + 2;
          subFormDiv.style.left   = "" + subFormX0 + "px";
          subFormDiv.style.top    = "" + subFormY0 + "px";
          subFormDiv.style.width  = "" + subFormX1 + "px";
          subFormDiv.style.height = "" + subFormY1 + "px";
          subFormDiv.style.visibility = "visible";
          //alert ( "x0=" + subFormX0 + "; y0=" + subFormY0 + "; x1=" + subFormX1 + "; y1=" + subFormY1 );
        }
      }
    }
    field.focus ( );
    //objectInFocus = field;
    //alert ( "setField ( " + fullPath + " )" );
  }
  else
  {
    //alert ( "setField ( " + fullPath + " ): no new field" );
  }
}


/**
 *
 */
function returnToField ( fullPath )
{
  runEventsOnFocus = false;
  setField ( fullPath );
}


/**
 *
 */
function setCurrentField ( root )
{
  setField ( root.getAttributeValue ( "field" ) );
}


/**
 *
 */
function resetField ( fullPath )
{
  if ( fullPath == null ) return;

  var field = getElement ( fullPath );

  if ( ( ! field ) || field == null )
  {
    var index = fullPath.indexOf ( "." );
    if ( index > 0 ) fullPath = fullPath.substring ( 0, index );
    field = getElement ( fullPath );
  }

  if ( field )
  {
    alert ( "The entered value has not passed the pick list validation" );
    field.value = originalValues [ fullPath ];
  }
}


/**
 *
 */
function firstObject ( )
{
  model.focus ( "" );
}


/**
 *
 */
function nextGroup ( group )
{
  var next = group.nextObject;

  if ( next == null || next.type != TYPEGROUP )
  {
    var superGroup = group.container;
    if ( superGroup != null )
    {
      var index = superGroup.elementIndex ( group ) + 1;
      while ( index < superGroup.size ( ) )
      {
        next = superGroup.getElement ( index );
        if ( next.type == TYPEGROUP ) break;
        next == null;
      }
    }
  }

  return next;
}


/**
 *
 */
function firstObjectNextGroup ( pObj )
{
  if ( pObj == null ) return null;
  if ( ! pObj.container || pObj.container == null ) return null;
  var group = pObj.container;

  var nextElement = null;

  var next = nextGroup ( group );

  while ( next != null && next.elemInstances != null && next.elemInstances.length == 0 )
  {
    next = nextGroup ( next );
  }

  //alert ( pObj.name + " -> " + ( next == null ) ? "null next group" : next.name );

  if ( next != null && next.elemInstances != null && next.elemInstances.length > 0 )
  {
    var first = next.firstObject;
    if ( first != null )
    {
      for ( var k = 0; k < next.elemInstances.length; k ++ )
      {
        var eName = next.elemInstances [ k ].name;
        if ( eName.indexOf ( first.name ) == 0 )
        {
          if ( eName.length == first.name.length || eName.indexOf ( first.name + '.' ) == 0 )
          {
            nextElement = next.elemInstances [ k ];
            break;
          }
        }
      }
    }
  }

  return nextElement;
}


/**
 *
 */
function firstObjectNextInstance ( obj, pObj )
{
  var group = pObj.container;
  if ( group == null ) return null;

  var first = group.firstObject;
  if ( first == null ) return null;

  var element = null;
  var start = arrayIndexOf ( group.elemInstances, obj ) + 1;
  for ( k = start; k < group.elemInstances.length; k ++ )
  {
    var eName = group.elemInstances [ k ].name;
    if ( eName.indexOf ( first.name ) == 0 )
    {
      if ( eName.length == first.name.length || eName.indexOf ( first.name + '.' ) == 0 )
      {
        element = group.elemInstances [ k ];
        break;
      }
    }
  }
  return element;
}


/**
 *
 */
function nextObject ( obj )
{
  if ( model == null )
  {
    alert ( "nextObject: JDP model is not defined" );
    return;
  }

  if ( obj == null ) obj = objectInFocus;
  if ( obj == null ) obj = objectToBeInFocus;

  var pObj = model.getInDepth ( obj.name );
  if ( pObj )
  {
    var nextElement = null;
    var debug = pObj.name;

    var next = pObj.getNextObject ( obj.name );

    while ( next != null && next.type == TYPEGROUP )
    {
      nextElement = next.getFirstElementInstance ( );
      next = next.firstObject;
    }

    if ( next == null && pObj.container != null && pObj.container.nextObject != null )
    {
      nextElement = pObj.container.nextObject.getFirstElementInstance ( );
      next = pObj.container.nextObject.firstObject;
    }

    if ( next == null )
    {
      nextElement = firstObjectNextGroup ( pObj );
      if ( nextElement == null ) nextElement = firstObjectNextInstance ( obj, pObj );

      if ( nextElement != null )
      {
        next = model.getInDepth ( nextElement.name );
      }
    }

    if ( next != null )
    {
      notifyAppRequestCommand ( "FNEXT" );

      var nextName = next.name;

      var nextPObj = model.getInDepth ( nextName );
      if ( nextPObj && nextPObj.prevObject == null )
      {
        nextPObj.prevObject = pObj;
      }

      if ( nextElement == null )
      {
        var dotIndex = obj.name.indexOf ( "." );
        if ( dotIndex > 0 ) nextName += obj.name.substring ( dotIndex );
        nextElement = getElement ( nextName );
      }

      if ( nextElement != null )
      {
        visitationHistory [ nextElement.name ] = obj;
        objectToBeInFocus = nextElement;
        window.setTimeout ( "setField ( '" + nextElement.name + "' );", 100 );
      }
      else
      {
        if ( parent.debugMessage ) parent.debugMessage ( "nextObject: no object for [" + debug + "]" );
        //alert ( "nextObject: no object for [" + nextName + "]" );
      }
    }
    else
    {
      if ( pObj.hasEvents ) doAppRequest ( "appCommand=FNEXT&command=JDPEVENT&event=" + prepareCommand ( "BEFORELEAVE", obj, pObj ) );
      //alert ( "nextObject: no next object for [" + obj.name + "]" );
    }
  }
  else
  {
    alert ( "No panel object for the name [" + obj.name + "]" );
  }
}


/**
 *
 */
function prevObject ( obj )
{
  var prevElement = visitationHistory [ obj.name ];
  if ( prevElement != null )
  {
    var pObj = model.getInDepth ( obj.name );
    notifyAppRequestCommand ( "FPREV" );
    window.setTimeout ( "setField ( '" + prevElement.name + "' );", 100 );
    return;
  }

  if ( model == null ) return;

  var pObj = model.getInDepth ( obj.name );
  if ( pObj )
  {
    var prev = pObj.getPrevObject ( );

    while ( prev != null && prev.type == TYPEGROUP )
    {
      prevElement = prev.getFirstElementInstance ( );
      prev = prev.firstObject;
    }

    if ( prev == null && pObj.container != null && pObj.container.prevObject != null &&  pObj.container.prevObject.type == TYPEGROUP )
    {
      prevElement = pObj.container.prevObject.getFirstElementInstance ( );
      prev = pObj.container.prevObject.firstObject;
    }

    if ( prev != null )
    {
      notifyAppRequestCommand ( "FPREV" );

      var prevName = prev.name;
      if ( prevElement == null )
      {
        var dotIndex = obj.name.indexOf ( "." );
        if ( dotIndex > 0 ) prevName += obj.name.substring ( dotIndex );
        prevElement = getElement ( prevName );
      }
      if ( prevElement != null )
      {
        window.setTimeout ( "setField ( '" + prevElement.name + "' );", 100 );
      }
      else
      {
        if ( parent.debugMessage ) parent.debugMessage ( "prevObject: no object for [" + debug + "]" );
      }
    }
    else
    {
      if ( pObj.hasEvents ) doAppRequest ( "appCommand=FPREV&command=JDPEVENT&event=" + prepareCommand ( "BEFORELEAVE", obj, pObj ) );
    }
  }
  else
  {
    alert ( "No panel object for the name [" + obj.name + "]" );
  }
}


/**
 *
 */
function hotKeyPress ( panelObject, name )
{
  var dotPos = name.indexOf ( "." );
  var instance = "";
  if ( dotPos > 0 ) instance = name.substring ( dotPos + 1 );
  //alert ( "[" + name + "] [" + instance + "]" );

  var element = getElement ( name );
  if ( element )
  {
    objectInFocus = element;
    //notifyInstance ( element );
  }
  else
  {
    alert ( "HoKeyPress: there is no element for name [" + name + "]" );
  }

  if ( instance == "" ) instance = "0";

  panelObject.fireEvent ( "HOTKEYPRESS", instance );
}



// ---------------------------------------------------------------------
// ----------   Event Handlers   ---------------------------------------

/**
 *
 */
function dummy ( )
{
  //alert ( "Dummy: " + this.name );
}


/**
 *
 */
function debug ( msg )
{
  window.status = msg;
  alert ( msg );
}


/**
 *
 */
function firePanelObjectEvent ( objectName, eventName )
{
  var pObj = model.getInDepth ( objectName );
  if ( pObj != null )
  {
    var index = objectName.indexOf ( "." );
    var instance = "";
    if ( index > 0 ) instance = objectName.substring ( index + 1 );
    //alert ( "firePanelObjectEvent ( " + objectName + ", " + eventName + ", " + instance + " )" );
    pObj.fireEvent ( eventName, instance );
  }
  else
  {
    alert ( "firePanelObjectEvent ( " + objectName + ", " + eventName + " ) - no panel object found" );
  }
}


/**
 * Mapped events:
 * BEFORELEAVE
 */
function blurField ( )
{
  //alert ( "Blur: " + this.name );
  //firePanelObjectEvent ( this.name, "BEFORELEAVE" );
}


/**
 *
 */
function padString ( value, size )
{
  if ( value == null ) value = "";
  value = value.toString ( );
  size = size - value.length;
  for ( var k = 0; k < size; k ++ ) value += ' ';
  return value;
}


/**
 * 1:
 * 2:
 * 3: value1 == value2
 * 4: one of the values is null
 */
function compareString ( value1, value2 )
{
  if ( value1 == null || value2 == null ) return 4;

  var size1 = value1.length;
  var size2 = value2.length;

  if ( size1 > size2 )
  {
    value2 = padString ( value2, size1 );
  }
  else if ( size2 > size1 )
  {
    value1 = padString ( value1, size2 );
  }

  var size = value1.length;
  for ( var i = 0; i < size; i++ )
  {
    var c1 = value1.charAt ( i );
    var c2 = value2.charAt ( i );
    if ( c1 > c2 ) return 1;
    if ( c1 < c2 ) return 2;
  }
  return 3;
}


/**
 *
 */
function verifyTextValue ( obj )
{
  var pObj = model.getInDepth ( obj.name );
  if ( pObj == null || ( ! pObj ) ) return true;
  if ( pObj.minValue == null && pObj.maxValue == null ) return true;

  var value = obj.value;
  if ( value == null || value.length == 0 ) return true;

  if ( pObj.minValue > value ) return false;
  if ( pObj.maxValue < value ) return false;
  return true;
}


/**
 *
 */
function verifyNumericValue ( obj )
{
  var pObj = model.getInDepth ( obj.name );
  if ( pObj == null || ( ! pObj ) ) return true;
  if ( pObj.minValue == null && pObj.maxValue == null ) return true;

  var value = obj.value;
  if ( value == null || value.length == 0 ) return true;

  var minDigits = 0;
  if ( pObj.minValue != null )
  {
    var absMin = Math.abs ( parseFloat ( pObj.minValue ) );
    var degree = 10;
    for ( var k = 0; k < 9; k ++ )
    {
      if ( absMin < degree )
      {
        minDigits = k + 1;
        break;
      }
      degree = degree * 10;
    }
  }

  var val   = "";
  var start = true;
  var dot   = false;
  var sign  = false;
  var digit = false;
  var zero  = false;

  for ( var k = 0; k < value.length; k ++ )
  {
    var c = value.charAt ( k );
    if ( c == ' ' ) continue;
    if ( c == '-' || c == '+' )
    {
      if ( zero || dot || digit || sign ) continue;
      sign = true;
    }
    if ( c == '.' )
    {
      if ( dot ) break;
      dot = true;
    }
    if ( c != '.' && c != '-' && c != '+' )
    {
      if ( start && c == '0' )
      {
        zero = true;
        continue;
      }
      start = false;
      digit = true;
    }
    val += c;
  }
  if ( val == "" ) return true;
  if ( value.length < minDigits ) return true;

  value = parseFloat ( val );

  if ( pObj.minValue != null )
  {
    var min = parseFloat ( pObj.minValue );
    if ( min > value )
    {
      //alert ( "Min: [" + obj.value + "] -> [" + val + "] ? [" + min + "]" );
      return false;
    }
  }
  if ( pObj.maxValue != null )
  {
    var max = parseFloat ( pObj.maxValue );
    if ( max < value )
    {
      //alert ( "Max: [" + obj.value + "] -> [" + val + "] ? [" + max + "]" );
      return false;
    }
  }
  return true;
}


/**
 *
 */
function textOnKeyUp ( e )
{
  if ( this.value )
  {
    this.value = this.value.toUpperCase ( );
    if ( ! verifyTextValue ( this ) )
    {
      alert ( this.value + " is not a correct text value" );
      this.value = this.value.substring ( 0, this.value.length - 1 );
    }
  }
}


/**
 *
 */
function editManagerJDPOnKeyDown ( e )
{
  var intVal = 0;
  var shift  = false;
  var ctrl   = false;

  if ( window.event )
  {
    intVal = parseInt ( window.event.keyCode );
  }
  else if ( e.which )
  {
    intVal = parseInt ( e.which );
  }

  // Only "Home" key is allowed
  if ( intVal == 36 ) return;

  if ( window.event )
  {
    window.event.returnValue = false;
  }
  else if ( e.cancelable )
  {
    e.preventDefault ( );
  }
}


/**
 *
 */
function numericOnKeyDown ( e )
{
  var intVal = 0;
  var shift  = false;
  var ctrl   = false;

  if ( window.event )
  {
    intVal = parseInt ( window.event.keyCode );
    shift  = window.event.shiftKey;
    ctrl   = window.event.ctrlKey;
  }
  else if ( e.which )
  {
    intVal = parseInt ( e.which );
    shift  = e.shiftKey;
    ctrl   = e.ctrlKey;
  }

  if ( intVal ==  96 || intVal ==  97 || intVal ==  98 ||
       intVal ==  99 || intVal == 100 || intVal == 101 ||
       intVal == 102 || intVal == 103 || intVal == 104 ||
       intVal == 105 || intVal == 107 || intVal == 109 ||
       intVal == 110 || intVal ==   8 || intVal ==  46 ||
       intVal == 190 || intVal ==  48 || intVal ==  49 ||
       intVal ==  50 || intVal ==  51 || intVal ==  52 ||
       intVal ==  53 || intVal ==  54 || intVal ==  55 ||
       intVal ==  56 || intVal ==  57 || intVal == 189 ||
       intVal ==  13 || intVal ==  39 || intVal ==  37 ||
       ( intVal == 67 && ctrl ) || ( intVal = 86 && ctrl )
     ) return;

  if ( window.event )
  {
    window.event.returnValue = false;
  }
  else if ( e.cancelable )
  {
    e.preventDefault ( );
  }
}


/**
 *
 */
function numericOnKeyUp ( e )
{
  if ( ! verifyNumericValue ( this ) )
  {
    alert ( this.value + " is not a correct value" );
    this.value = this.value.substring ( 0, this.value.length - 1 );
  }
}


/**
 *
 */
function clickField ( )
{
  if ( disableNotFocused )
  {
    if ( objectInFocus == this || objectToBeInFocus == this )
    {
      // OK
    }
    else
    {
      return;
    }
  }

  var field = model.getInDepth ( this.name );
  if ( field && field.enabled )
  {
    var editManager = field.getEditManager ( );
    if ( editManager )
    {
      if ( editManager.name == "JDateField" )
      {
        if ( editManager.format == null || editManager.format.length == 0 )
        {
          editManager.format = "dd-MMM-yyyy";
        }
        displayDatePicker ( this.name, editManager.format );
      }
    }
  }
}


/**
 *
 */
function dblClickField ( )
{
  //alert ( "DoubleClick: " + this.name );
  if ( objectInFocus == this ) applicationEventHandler ( "HOTKEYPRESS" );
}


/**
 *
 */
function changeFieldBase ( )
{
  //alert ( "ChangeBase: " + this.name );
  sendDataChange ( this.name, this.value );
}


/**
 * Mapped events:
 * BEFOREVALUECHANGE
 * AFTERVALUECHANGE
 */
function changeField ( )
{
  //alert ( "Change: " + this.name );
  //firePanelObjectEvent ( this.name, "BEFOREVALUECHANGE" );
  sendDataChange ( this.name, this.value );
  //firePanelObjectEvent ( this.name, "AFTERVALUECHANGE"  );
}


/**
 * Mapped events:
 * BEFOREENTER
 * AFTERENTER
 */
function focusField ( )
{
  //debug ( "focusField ( " + this.name + " )" );
  if ( objectInFocus == this ) return;

  if ( preFocusField ( this ) ) return;

  if ( disableNotFocused )
  {
    if ( objectToBeInFocus && objectToBeInFocus == this )
    {
      // OK
    }
    else
    {
      //alert ( "Changing focus in such a way is not enabled on this form" );
      if ( objectInFocus ) objectInFocus.focus ( );
      return;
    }
  }

  var oldPanelObject = null;
  var oldContainer   = null;
  var newPanelObject = null;
  var newContainer   = null;

  if ( objectInFocus )
  {
    oldPanelObject = model.getInDepth ( objectInFocus.name );
    if ( oldPanelObject )
    {
      oldContainer = oldPanelObject.container;
      if ( oldPanelObject.arrowText && oldPanelObject.arrowText.length > 0 )
      {
        objectInFocus.value = "";
      }
    }
    objectInFocus.style.borderStyle = "solid";
  }

  newPanelObject = model.getInDepth ( this.name );
  if ( newPanelObject )
  {
    newContainer = newPanelObject.container;
    if ( newPanelObject.arrowText && newPanelObject.arrowText.length > 0 )
    {
      this.value = newPanelObject.arrowText;
    }
  }

  if ( oldContainer != null && newContainer != null && oldContainer != newContainer )
  {
    if ( oldContainer.getVisibleOnFocus ( ) )
    {
      var inst = getObjectInstance ( oldPanelObject.name );
      oldContainer.setVisible ( false, inst );
      if ( ! newContainer.getVisibleOnFocus ( ) )
      {
        var subFormDiv = getElement ( "subFormDiv" );
        if ( subFormDiv ) subFormDiv.style.visibility = "hidden";
      }
    }
  }

  notifyInstance ( this );
  this.style.borderStyle = "dotted";
  objectInFocus = this;
  if ( newPanelObject )
  {
    if ( newPanelObject.legendCode && newPanelObject.legendCode.length > 0 )
    {
      parent.showMessageNoTarget ( newPanelObject.legendCode );
    }
    else
    {
      parent.hideMessage ( );
      window.setTimeout ( "parent.hideMessage ( );", 250 );
    }
  }
}



// ---------------------------------------------------------------------
// ----------   Init Section   -----------------------------------------

/**
 * Form element JavaScript events:
 *
 * onblur
 * onchange
 * onfocus
 * onselect
 *
 * Mouse JavaScript events:
 *
 * onclick
 * ondblclick
 * onmousedown
 * onmousemove
 * onmouseout
 * onmouseover
 * onmouseup
 *
 * Keyboard JavaScript events:
 *
 * onkeydown
 * onkeypress
 * onkeyup
 *
 * Other JavaScript events:
 *
 * onabort
 * ondragdrop
 * onerror
 * onload
 * onmove
 * onreset
 * onresize
 * onsubmit
 * onunload
 *
 * JDataPanelListener Events:
 *
 * AFTERDELETE
 * AFTERENTER
 * AFTERINSERT
 * AFTERUPDATE
 * AFTERVALUECHANGE
 * BEFOREDELETE
 * BEFOREENTER
 * BEFOREINSERT
 * BEFORELEAVE
 * BEFOREUPDATE
 * BEFOREVALUECHANGE
 * HOTKEYPRESS
 */
function setInputEvent ( input, eventName )
{
  //alert ( input.name + ' -> ' + eventName );
  eventName = eventName.toUpperCase ( );
  if      ( eventName == "AFTERDELETE" )
  {
    // JDataPanelGroup server-side event
  }
  else if ( eventName == "AFTERENTER" )
  {
    input.onfocus = focusField;
  }
  else if ( eventName == "AFTERINSERT" )
  {
    // JDataPanelGroup server-side event
  }
  else if ( eventName == "AFTERUPDATE" )
  {
    // JDataPanelGroup server-side event
  }
  else if ( eventName == "AFTERVALUECHANGE" )
  {
    input.onchange = changeField;
  }
  else if ( eventName == "BEFOREDELETE" )
  {
    // JDataPanelGroup server-side event
  }
  else if ( eventName == "BEFOREENTER" )
  {
    input.onfocus = focusField;
  }
  else if ( eventName == "BEFOREINSERT" )
  {
    // JDataPanelGroup server-side event
  }
  else if ( eventName == "BEFORELEAVE" )
  {
    input.onblur = blurField;
  }
  else if ( eventName == "BEFOREUPDATE" )
  {
    // JDataPanelGroup server-side event
  }
  else if ( eventName == "BEFOREVALUECHANGE" )
  {
    input.onchange = changeField;
  }
  else if ( eventName == "HOTKEYPRESS" )
  {
    // Managed by applicationKeyUpEventHandler
  }
}


/**
 *
 */
function init ( )
{
  var inputs = getInputs ( );
  if ( inputs == null ) return;

  disableNotInFocus ( );

  for ( var i = 0; i < inputs.length; i++ )
  {
    var input = inputs [ i ];

    //input.onchange   = changeFieldBase;
    // May be overridden
    if ( ! ( input.onclick ) || input.onclick == null )
    {
      input.onclick = clickField;
    }
    if ( ! ( input.ondblclick ) || input.ondblclick == null )
    {
      input.ondblclick = dblClickField;
    }
    input.onfocus = focusField;

    input.title = input.id;

    var inputName = input.name;
    if ( inputName != null && inputName.length > 0 )
    {
      var instance = "";
      var dotPos = inputName.indexOf ( "." );
      if ( dotPos > 0 )
      {
        instance  = inputName.substring ( dotPos + 1 );
        inputName = inputName.substring ( 0, dotPos );
      }

      //input.value = fromHtml ( input.value );

      var panelObject = model.getInDepth ( inputName );
      if ( panelObject )
      {
        panelObject.verifyMinInstance ( instance );

        //for ( var k = 0; k < panelObject.eventsSize ( ); k ++ )
        //{
        //  setInputEvent ( input, panelObject.getEvent ( k ) );
        //}

        var readOnly = input.getAttribute ( "readonly" );
        if ( readOnly != null && readOnly != false )
        {
          panelObject.enabled = false;
          if ( ! disableNotFocused && panelObject.editManager && panelObject.editManager.name == "JDataPanel" )
          {
            panelObject.editManager.name = "JTextField";
          }
        }

        if ( panelObject.editManager )
        {
          if ( panelObject.editManager.name == "JDataPanel" )
          {
            if ( panelObject.editManager.manualEntry )
            {
              input.onkeyup = textOnKeyUp;
            }
            else
            {
              input.onkeydown = editManagerJDPOnKeyDown;
            }
            input.style.borderColor="#F000F0";
          }
          else if ( panelObject.editManager.name == "JDateField" )
          {
            input.value = dateEncode ( input.value );
          }
          else if ( panelObject.editManager.name == "JNumericField" )
          {
            input.onkeydown = numericOnKeyDown;
            input.onkeyup = numericOnKeyUp;
          }
          else if ( panelObject.editManager.name == "JTextField" )
          {
            input.onkeyup = textOnKeyUp;
          }
        }

        if ( input.value == "-->" || input.value == "->" )
        {
          panelObject.arrowText = input.value;
          input.value = "";
          //alert ( panelObject.name + " [" + panelObject.arrowText + "]" );
        }

        originalValues [ input.name ] = input.value;

        var container = panelObject.container;
        if ( container != null )
        {
          container.setElementInstance ( input );
        }
      }
      else
      {
        //alert ( "Panel object [" + inputName + "] not found in the model" );
      }
    }
  }

  var divs = getDivs ( );
  var div;
  var divId;
  var dotPos;
  var panelObject;
  var container;
  for ( var i = 0; i < divs.length; i++ )
  {
    div = divs [ i ];
    divId = div.id;
    if ( divId != null && divId.length > 0 )
    {
      dotPos = divId.indexOf ( "." );
      if ( dotPos > 0 )
      {
        divId = divId.substring ( 0, dotPos );
      }
      panelObject = model.getInDepth ( divId );
      if ( panelObject )
      {
        container = panelObject.container;
        if ( container != null )
        {
          //alert ( "Container for [" + divId + "] is [" + container.name + "]" );
          container.setElementInstance ( div );
        }
        else
        {
          //alert ( "No container for " + divId );
        }
      }
      else
      {
        //alert ( "No panel object for " + divId );
      }
    }
  }

  //alert ( model.debugRegistry ( ) );
  //alert ( model.debugStructure ( 0 ) );

  /*var debugValues = "";
  for ( var i = 0; i < inputs.length; i++ )
  {
    var input = inputs [ i ];
    var value = originalValues [ input.name ];
    debugValues += input.name + " -> " + value + "\r\n";
  }
  alert ( debugValues );*/

  afterInit ( );

  firstObject ( );
}


/**
 * To be overriden in extensions
 */
function afterInit ( )
{
}



// ---------------------------------------------------------------------
// ----------   Application-specific Event Handling   ------------------


/**
 *
 */
function validate ( )
{
  var inputs = getInputs ( );
  if ( inputs == null ) return true;

  for ( var i = 0; i < inputs.length; i++ )
  {
    var input = inputs [ i ];
    if ( input.name )
    {
      var panelObject = model.getInDepth ( input.name );
      if ( panelObject )
      {
        if ( panelObject.required )
        {
          var value = null;
          if ( input.value )
          {
            value = input.value;
          }
          else
          {
            value = input.innerHTML;
          }
          if ( value != null ) value = value.replace ( /\\s+$/, "" );

          if ( value == null || value.length == 0 )
          {
            //if ( panelObject.container.getVisibleOnFocus ( ) ) return true;
            //alert ( "Required field [" + panelObject.name + "] must be filled with data" );
            alert ( "Fill in the required fields or use the 'quit action'" );
            return false;
          }
        }
      }
    }
  }

  return true;
}


/**
 *
 */
function applicationKeyUpEventHandler ( eventCode )
{
  applicationEventHandler ( eventCode );
}


/**
 *
 */
function prepareCommand ( eventCode, obj, panelObject )
{
  if ( eventCode == null || eventCode == "" ) return "";

  var cmd = eventCode + "&model=" + model.name;

  if ( obj != null )
  {
    cmd += "&panelObject=" + obj.name;
    cmd += "&field=" + obj.name;
    if ( isValueChanged ( obj ) )
    {
      cmd += "&value=" + processValue ( panelObject, obj.value ) + "&changed=true";
    }
  }
  return cmd;
}


/**
 * Uses functions from <server.js>:
 *
 * doAppCommand - sends the application command to get the new page
 *
 * doAppRequest - sends the application request via xmlHttp
 */
function applicationEventHandler ( eventCode )
{
  if ( eventCode == null || eventCode == "" || ! eventCode ) return;

  if ( datePickerShown && datePickerEventHandler )
  {
    datePickerEventHandler ( eventCode );
    return;
  }

  if ( pickListShown )
  {
    pickListEventHandler ( eventCode );
    return;
  }

  if ( submodalMenuShown )
  {
    if ( implementAppCommandToSubmenu ) implementAppCommandToSubmenu ( eventCode );
    return;
  }

  if ( applicationPreEventHandler ( eventCode ) ) return;

  //alert ( "applicationEventHandler ( " + eventCode + " )" );

  var name        = null;
  var panelObject = null;

  if ( objectInFocus != null )
  {
    name = objectInFocus.name;
    panelObject = model.getInDepth ( name );
    if ( ! panelObject )
    {
      alert ( "EventHandler: panel object for name [" + name + "] is not valid" );
      return;
    }
  }

  var cmd = prepareCommand ( eventCode, objectInFocus, panelObject );

  if ( eventCode == "RIGHTARROW" || eventCode == "LEFTARROW" ) return;

  if ( eventCode == "ADDINSTANCE" )
  {
    doAppCommand ( cmd );
  }
  else if ( eventCode == "DELINSTANCE" )
  {
    if ( ! preDelete ( objectInFocus ) )
    {
      var msg = "Do you really want to delete this record?";
      if  ( parent && parent.deleteConfirmation )
      {
        msg = parent.deleteConfirmation;
      }
      if ( confirm ( msg ) ) doAppCommand ( cmd );
    }
  }
  else if ( eventCode == "EXTENDQUERY" )
  {
    alert ( "Unsupported event [" + eventCode + "]" );
  }
  else if ( eventCode == "ESCAPE" || eventCode == "QUIT_ACTION" )
  {
    doAppRequestCommand ( "QUIT_ACTION" );
  }
  else if ( eventCode == "FINISH_ACTION" )
  {
    if ( validate ( ) ) doAppRequestCommand ( cmd );
  }
  else if ( eventCode == "FIRSTINSTANCE" )
  {
    alert ( "Unsupported event [" + eventCode + "]" );
  }
  else if ( eventCode == "FIRSTOBJECT" )
  {
    alert ( "Unsupported event [" + eventCode + "]" );
  }
  else if ( eventCode == "FIRSTPAGE" )
  {
    alert ( "Unsupported event [" + eventCode + "]" );
    //doAppCommandByCode ( eventCode );
  }
  else if ( eventCode == "HOTKEYPRESS" )
  {
    hotKeyPress ( panelObject, name );
  }
  else if ( eventCode == "INSERTINSTANCE" )
  {
    doAppCommand ( cmd );
  }
  else if ( eventCode == "INSERTINSTANCEBEFORE" )
  {
    doAppCommand ( cmd );
  }
  else if ( eventCode == "INSERTINSTANCENEXTGROUP" )
  {
    doAppCommand ( cmd );
  }
  else if ( eventCode == "LASTINSTANCE" )
  {
    alert ( "Unsupported event [" + eventCode + "]" );
    //doAppCommandByCode ( cmd );
  }
  else if ( eventCode == "LASTOBJECT" )
  {
    alert ( "Unsupported event [" + eventCode + "]" );
  }
  else if ( eventCode == "LASTPAGE" )
  {
    alert ( "Unsupported event [" + eventCode + "]" );
    //doAppCommandByCode ( eventCode );
  }
  else if ( eventCode == "NEXTINSTANCE" )
  {
    nextInstance ( objectInFocus );
  }
  else if ( eventCode == "NEXTOBJECT" )
  {
    nextObject ( objectInFocus );
  }
  else if ( eventCode == "NEXT_PAGE" || eventCode == "NEXTPAGE" )
  {
    if ( lastPage )
    {
      cmd = prepareCommand ( "BEFORELEAVE", objectInFocus, panelObject );
      cmd = "appCommand=PNEXT&command=JDPEVENT&event=" + cmd;
      doAppRequest ( cmd );
      //alert ( "Last Page" );
    }
    else
    {
      doAppCommand ( cmd );
    }
  }
  else if ( eventCode == "PICKLIST" )
  {
    if ( panelObject.editManager )
    {
      if ( panelObject.editManager.name == "JDataPanel" )
      {
        doAppRequest ( "command=" + cmd );
      }
      else if ( panelObject.editManager.name == "JDateField" )
      {
        if ( panelObject.editManager.format == null || panelObject.editManager.format.length == 0 )
        {
          panelObject.editManager.format = "dd-MMM-yyyy";
        }
        if ( panelObject.enabled ) displayDatePicker ( name, panelObject.editManager.format );
      }
    }
  }
  else if ( eventCode == "PICKLISTPREVGROUP" )
  {
    alert ( "Unsupported event [" + eventCode + "]" );
  }
  else if ( eventCode == "PREVINSTANCE" )
  {
    prevInstance ( objectInFocus );
  }
  else if ( eventCode == "PREVOBJECT" )
  {
    prevObject ( objectInFocus );
  }
  else if ( eventCode == "PREVIOUS_PAGE" || eventCode == "PREVPAGE" )
  {
    if ( firstPage )
    {
      cmd = prepareCommand ( "BEFORELEAVE", objectInFocus, panelObject );
      cmd = "appCommand=PPREV&command=JDPEVENT&event=" + cmd;
      doAppRequest ( cmd );
      //alert ( "First Page" );
    }
    else
    {
      doAppCommand ( cmd );
    }
  }
  else if ( eventCode == "QUERY" )
  {
    doAppCommand ( cmd );
  }
  else if ( eventCode == "QBE" )
  {
    doAppCommand ( cmd );
  }
  else if ( eventCode == "UNDELETEINSTANCEBEFORE" )
  {
    alert ( "Unsupported event [" + eventCode + "]" );
  }
  else if ( eventCode == "UPDATE" )
  {
    doAppCommand ( cmd );
  }
  else if ( eventCode == "SHOW" )
  {
    doAppCommand ( cmd );
  }
  else if ( eventCode == "WRITETEXTFILE" )
  {
    alert ( "Unsupported event [" + eventCode + "]" );
  }
  else
  {
    alert ( "Unrecognized event [" + eventCode + "]" );
  }
}


/**
 * Uses doAppRequest from <server.js>
 */
function postJDPEvent ( fullName, eventName )
{
  //debug ( "postJDPEvent ( " + fullName + ", " + eventName + " )" );

  var dotPos = fullName.indexOf ( "." );
  var instance = "";
  var objectName = fullName;
  if ( dotPos > 0 )
  {
    instance   = fullName.substring ( dotPos + 1 );
    objectName = fullName.substring ( 0, dotPos  );
  }

  var pObj;
  var cmd = "";

  if ( objectName == model.name )
  {
    pObj = model;
  }
  else
  {
    pObj = model.getInDepth ( objectName );
  }

  //debug ( "postJDPEvent ( " + fullName + ", " + eventName + " ) => [" + objectName + "][" + instance + "] => [" + pObj + "]" );

  if ( pObj )
  {
    if ( pObj.hasEvent ( eventName ) || eventName == "HOTKEYPRESS" )
    {
      cmd = "command=JDPEVENT&model=" + model.name + "&event=" + eventName + "&panelObject=" + fullName;
      //debug ( "postJDPEvent ( " + fullName + ", " + eventName + " ): " + cmd );
    }
    else
    {
      //alert ( "The object " + objectName + " does not have the event " + eventName );
    }
  }
  else
  {
    alert ( "postJDPEvent. The object " + objectName + " is not found within the model" );
  }
  doAppRequest ( cmd );
}


/**
 *
 */
function applicationResponseHandler ( root )
{
  var command = root.getAttributeValue ( "command" );

  if ( command == "SetData" )
  {
    setDataChanges ( root );
  }
  else if ( command == "JDPPickList" )
  {
    showJDPPickList ( root );
  }
  else if ( command == "SetCurrentField" )
  {
    setCurrentField ( root );
  }
  else
  {
    //alert ( root.getXmlDoc ( ) );
  }
}


/**
 * To be implemented in descendants
 */
function buttonClick ( button )
{
  alert ( "Button [" + button.name + "] clicked" );
}


/**
 * To be implemented in descendants
 */
function applicationPreEventHandler ( eventCode )
{
  return false;
}


/**
 * To be implemented in descendants
 */
function preFocusField ( obj )
{
  return false;
}


/**
 * To be implemented in descendants
 */
function preDelete ( obj )
{
  return false;
}
