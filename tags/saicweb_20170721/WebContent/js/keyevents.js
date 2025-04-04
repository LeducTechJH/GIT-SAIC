var Keys = 
{
     BACKSPACE: 8,           TAB: 9,               ENTER: 13,          SHIFT: 16,
     CTRL: 17,               ALT: 18,              PAUSE: 19,          CAPS: 20,
     ESC: 27,                PAGEUP: 33,           PAGEDN: 34,         END: 35,
     HOME: 36,               LEFT: 37,             UP: 38,             RIGHT: 39,
     DOWN: 40,               INSERT: 45,           DELETE: 46,      
     n0: 48, n1: 49, n2: 50, n3: 51, n4: 52, n5: 53, n6: 54, n7: 55, n8: 56, n9: 57,
     A:65, B:66, C:67, D:68, E:69, F:70, G:71, H:72, I:73, J:74, K:75, L:76, M:77, 
     N:78, O:79, P:80, Q:81, R:82, S:83, T:84, U:85, V:86, W:87, X:88, Y:89, Z:90,
     WINLEFT: 91,            WINRIGHT: 92,         SELECT: 93,      
     NUM0: 96, NUM1: 97, NUM2: 98, NUM3: 99, NUM4: 100, NUM5: 101, NUM6: 102, NUM7: 103, 
     NUM8: 104, NUM9: 105,
     MULTIPLY: 106, ADD: 107, SUBTRACT: 109, DECIMAL: 110, DIVIDE: 111,
     F1: 112, F2: 113, F3: 114, F4: 115, F5: 116, F6: 117,
     F7: 118, F8: 119, F9: 120, F10: 121, F11: 122, F12: 123,           
     NUMLOCK: 144,           SCROLLLOCK: 145,
     SEMICOLON: 186,         EQUAL: 187,           COMMA: 188,         DASH: 189,
     PERIOD: 190,            FORWARDSLASH: 191,    GRAVEACCENT: 192,
     OPENBRACKET: 219,       BACKSLASH: 220,       CLOSEBRACKET: 221,
     QUOTE: 222
};


//var keyCode = 0;
//var shiftKeyPressed = false;
//var cntrKeyPressed = false;
//var activeInputElement = null;


function checkAction ( )
{
  var keyCode = 0;
  var shiftKeyPressed = false;
  var cntrKeyPressed = false;
  var activeInputElement = "";

  var e = window.event;

  if ( e )
  {
    keyCode = e.keyCode;
    activeInputElement = e.srcElement;
    if ( keyCode >= 46 && keyCode <= 67 || keyCode >= 69 && keyCode <= 82 )
    {
      e.returnValue = true;
      return;
    }
    
    switch ( keyCode )
      {
        case Keys.ENTER :
        {
          e.returnValue = false; //otmenit' standartnoe deystvie
          //context.notifyJDPListeners ( null, "enter" );
          break;
        }
        case Keys.TAB :
        {
          if ( e.shiftKey )
          {
            e.returnValue = false;
            shiftKeyPressed = true;
              JDPCommandPrevObject ( activeInputElement );
              break;
          }
          else
          {
            e.returnValue = false;
              JDPCommandNextObject ( activeInputElement );
              break;
          }
          break;
        }
        case Keys.PAGEUP :
        {
          e.returnValue = false; //otmenit' standartnoe deystvie
          //command = new JDPCommandPrevPage ( context );
          break;
        }
        case Keys.PAGEDN :
        {
          e.returnValue = false; //otmenit' standartnoe deystvie
          //command = new JDPCommandNextPage ( context );
          break;
        }
        case Keys.END :
        {
          e.returnValue = false;
          JDPCommandLastInstance ( activeInputElement );
          break;
        }
        case Keys.HOME :
        {
          e.returnValue = false;
          JDPCommandFirstInstance ( activeInputElement );
          break;
        }
        case Keys.LEFT :
        {
          break;
        }
        case Keys.UP :
        {
          e.returnValue = false;
          JDPCommandPrevInstance ( activeInputElement );
          break;
        }
        case Keys.RIGHT :
        {
          break;
        }
        case Keys.DOWN :
        {
          e.returnValue = false;
          JDPCommandNextInstance ( activeInputElement );
          break;
        }
        case Keys.D :
        {
          if ( e.ctrlKey )
          {
            e.returnValue = false; //otmenit' standartnoe deystvie
            cntrKeyPressed = true;
            //command = new JDPCommandDeleteInstance ( context );
          }
          break;
        }
        case Keys.S :
        {
          if ( e.ctrlKey )
          {
            e.returnValue = false; //otmenit' standartnoe deystvie
            cntrKeyPressed = true;
              //command = new JDPCommandUpdate ( context );
          
          }
          break;
        }
        case Keys.INSERT :
        {
          if ( e.shiftKey )
          {
            e.returnValue = false; //otmenit' standartnoe deystvie
            sfiftKeyPressed = false;
              //command = new JDPCommandAddInstance ( context );
          }
          else
          {
            e.returnValue = false; //otmenit' standartnoe deystvie
              //command = new JDPCommandInsertInstance ( context );
          }
          break;
        }
        case Keys.F10 :
        {
          e.returnValue = false; //otmenit' standartnoe deystvie
          //command = new JDPCommandQuery ( context );
          break;
        }
        case Keys.F12 :
        {
          e.returnValue = false;
          JDPCommandPrevObject ( activeInputElement );
          break;
        }
      }
  }
}
  
document.onkeydown = checkAction;

function setFocusForSelected ( group, activeInputElement, rownum )
{
  var count = group.rows [ rownum ].childNodes [ 0 ].childNodes.length;
  
  for ( var i = 0; i < count; i ++ )
  {
    var currentColumn = group.rows [ rownum ].childNodes [ 0 ].childNodes [ i ];
    if ( currentColumn.id == activeInputElement.id )
    {
      currentColumn.focus ( );
    }
  }
}

function getFirst ( row )
{
  var count = row.childNodes.length;
  var candidate = getLast ( row );
  var candidateId = candidate.id;

  while ( candidate )
  {
    for ( var i = 0; i < count; i ++ )
    {
      var currentId = row.childNodes [ i ].id;
      if ( currentId && currentId != "" && currentId != "undefined" )
      {
        if ( row.childNodes [ i ].style.nextobject == candidate.id ) 
        {
          candidate = row.childNodes [ i ];
          break;
        }
      }
    }
    if ( candidateId == candidate.id ) 
    {
      return candidate;
    }
    else
    {
      candidateId = candidate.id;
    }
  }
  return null;
}

function getLast ( elem )
{
  var count = elem.childNodes.length;
  for ( var i = 0; i < count; i ++ )
  {
    var currentId = elem.childNodes [ i ].id;
    if ( currentId && currentId != "" && currentId != "undefined" )
    {
      var nextObj = elem.childNodes [ i ].style.nextobject;
      if ( !nextObj || nextObj == "" || nextObj == "undefined" )
      {
        return elem.childNodes [ i ];
      }
    }
  }
  return null;
}

function JDPCommandPrevObject ( activeInputElement )
{
  var prevObject = null;
  if ( activeInputElement )
  {
    var group = document.getElementById ( activeInputElement.style.container );
    if ( group.nodeName == 'TABLE' )
    {
      var rownum = activeInputElement.parentNode.style.rownum;
      var columnId = activeInputElement.id;
      var colCount = activeInputElement.parentNode.childNodes.length;
  
      for ( var i = 0; i < colCount; i ++ ) //prev element on current row
      {
        var currentId = activeInputElement.parentNode.childNodes [ i ].id;
        if ( currentId && currentId != "" && currentId != "undefined" )
        {
          if ( currentId != columnId )
          {
            if ( activeInputElement.parentNode.childNodes [ i ].style.nextobject == activeInputElement.id )
            {
              prevObject = activeInputElement.parentNode.childNodes [ i ];
              break;
            }
          }
        }
      }
      if ( !prevObject )
      {
        if ( rownum > 0 ) //last element on prev row
        {
          var currentElem = group.rows [ rownum - 1 ].childNodes [ 0 ];
          prevObject = getLast ( group.rows [ rownum - 1 ].childNodes [ 0 ] );
        }
      }
    }
    else if ( group.nodeName == 'BODY' )
    {
      
    }
  }
  if ( prevObject )
  {
    prevObject.focus ( );
    prevObject.select ( );
  }
}


function JDPCommandNextObject ( activeInputElement )
{
  var nextObject = null;
  if ( activeInputElement )
  {
    var group = document.getElementById ( activeInputElement.style.container );
    if ( group.nodeName == 'TABLE' )
    {
      var rownum = activeInputElement.parentNode.style.rownum;
      var columnId = activeInputElement.id;
      var colCount = activeInputElement.parentNode.childNodes.length;
      
      var nextObjectId = activeInputElement.style.nextobject;
      if ( nextObjectId && nextObjectId != "" && nextObjectId != "undefined" )
      {
        for ( var i = 0; i < colCount; i ++ )
        {
          var currentId = activeInputElement.parentNode.childNodes [ i ].id;
          if ( currentId == nextObjectId )
          {
            nextObject = activeInputElement.parentNode.childNodes [ i ];
            break;
          }
        }
      }
      else
      {
        if ( rownum < group.rows.length - 1 )
        {
          var currentElem = group.rows [ rownum + 1 ].childNodes [ 0 ];
          nextObject = getFirst ( group.rows [ rownum + 1 ].childNodes [ 0 ] );
        }
      }
    }
    else if ( group.nodeName == 'BODY' )
    {
      
    }
  }
  if ( nextObject )
  {
    nextObject.focus ( );
    nextObject.select ( );
  }
}

function selectInstance ( group, rownum, activeInputElement )
{
  var selectedFieldBackColor = "#000080";
  var selectedFieldForeColor = "#FFFFFF";
  var defaultFieldBackColor = "#FFFFF0";
  var defaultFieldForeColor = "#000000";
  
  var colcount = group.rows [ 0 ].childNodes [ 0 ].childNodes.length;
  for ( var i = 0; i < group.rows.length; i ++ )
  {
    for ( var j = 0; j < colcount; j ++ )
    {
      var currentColId = group.rows [ i ].childNodes [ 0 ].childNodes [ j ].id;
      if ( currentColId && currentColId != "" && currentColId != "undefined" )
      {
        if ( i == rownum )
        {
          group.rows [ i ].childNodes [ 0 ].childNodes [ j ].style.backgroundColor = selectedFieldBackColor;
          group.rows [ i ].childNodes [ 0 ].childNodes [ j ].style.color = selectedFieldForeColor;
        }
        else
        {
          group.rows [ i ].childNodes [ 0 ].childNodes [ j ].style.backgroundColor = defaultFieldBackColor;
          group.rows [ i ].childNodes [ 0 ].childNodes [ j ].style.color = defaultFieldForeColor;
        }
      }
    }
  }
  setFocusForSelected ( group, activeInputElement, rownum );
}

function JDPCommandFirstInstance ( activeInputElement )
{
  var group = document.getElementById ( activeInputElement.style.container );
  selectInstance ( group, 0, activeInputElement );
}

function JDPCommandLastInstance ( activeInputElement )
{
  var group = document.getElementById ( activeInputElement.style.container );
  var rownum = group.rows.length - 1;
  selectInstance ( group, rownum, activeInputElement );
}

function JDPCommandPrevInstance ( activeInputElement )
{
  var group = document.getElementById ( activeInputElement.style.container );
  var rownum = activeInputElement.parentNode.style.rownum;
  if ( rownum > 0 )
    selectInstance ( group, rownum - 1, activeInputElement );
}

function JDPCommandNextInstance ( activeInputElement )
{
  var group = document.getElementById ( activeInputElement.style.container );
  var rownum = activeInputElement.parentNode.style.rownum;
  if ( rownum < group.rows.length - 1 )
    selectInstance ( group, rownum + 1, activeInputElement );
}