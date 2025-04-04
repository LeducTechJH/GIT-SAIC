// ---------------------------------------------------------------------
// ----------   Constants   --------------------------------------------

/**  */
var                                         ERROR     = -1;
/**  */
var                                         XMLHEADER =  0;
/**  */
var                                         UNKNOWN   =  1;
/**  */
var                                         FINISH    =  2;
/**  */
var                                         KEY       =  3;
/**  */
var                                         KEYSTART  =  4;
/**  */
var                                         KEYDEFEND =  5;
/**  */
var                                         KEYEND    =  6;
/**  */
var                                         KEYVALUE  =  7;
/**  */
var                                         KEYALONE  =  8;
/**  */
var                                         ATTRIBUTE =  9;



// ---------------------------------------------------------------------
// ----------   Common Methods   ---------------------------------------

/**
 *
 */
function stripSlashes ( value )
{
  if ( value == null ) return "";
  if ( value.indexOf ( '\\' ) < 0 ) return value;

  var c;
  var result = "";
  var count  = value.length;
  var slash  = false;
  for ( var k = 0; k < count; k ++ )
  {
    c = value.charAt ( k );
    if ( slash )
    {
      if      ( c == 'r' ) result += '\r';
      else if ( c == 'n' ) result += '\n';
      else if ( c == 't' ) result += '\t';
      else result += c;
      slash = false;
    }
    else
    {
      if ( c == '\\' )
      {
        slash = true;
      }
      else
      {
        result += c;
      }
    }
  }
  return result;
}


/**
 *
 */
function addSlashes ( aValue )
{
  if ( aValue == null || aValue == "" )
  {
    return "";
  }

  var result = "";
  var count  = aValue.length;
  for ( var k = 0; k < count; k ++ )
  {
    var c = aValue.charAt ( k );
    if      ( c == '\r' ) result += "\\r";
    else if ( c == '\n' ) result += "\\n";
    else if ( c == '\\' ) result += "\\\\";
    else if ( c == '"'  ) result += "\\\"";
    else result += c;
  }
  return result;
}



// ---------------------------------------------------------------------
// ----------   Classes   ----------------------------------------------

/**
 *
 */
function XmlAttribute ( attrName, attrValue )
{
  this.name  = attrName;
  this.value = attrValue;

  this.getValue = function ( )
  {
    return stripSlashes ( this.value );
  }

  this.setValue = function ( aValue )
  {
    this.value = addSlashes ( aValue );
  }
}



/**
 *
 */
function XmlNode ( nodeObject, nodeName )
{
  // -------------------------------------------------------------------
  // ----------   Instance Attributes & Constructor   ------------------

  this.attributes = new Array;
  this.nodes      = new Array;
  this.level      = 0;
  this.parent     = null;
  this.object     = nodeObject;
  this.name       = nodeName;
  this.value      = "";



  // -------------------------------------------------------------------
  // ----------   Methods   --------------------------------------------

  /**
   *
   */
  this.size = function ( )
  {
    return this.nodes.length;
  }


  /**
   *
   */
  this.get = function ( index )
  {
    return this.nodes [ index ];
  }


  /**
   *
   */
  this.add = function ( node )
  {
    this.nodes  [ this.nodes.length ] = node;
    node.level  = this.level + 1;
    node.parent = this;
  }


  /**
   *
   */
  this.getObject = function ( )
  {
    return this.object;
  }


  /**
   *
   */
  this.getName = function ( )
  {
    return this.name;
  }


  /**
   *
   */
  this.getAttribute = function ( attrName )
  {
    var count = this.attributes.length;
    var attribute = null;
    var iter;
    for ( var k = 0; k < count; k++ )
    {
      iter = this.attributes [ k ];
      if ( iter.name == attrName )
      {
        attribute = iter;
        break;
      }
    }
    return attribute;
  }


  /**
   *
   */
  this.getAttributeValue = function ( attrName )
  {
    var attribute = this.getAttribute ( attrName );
    if ( attribute == null ) return "";
    return attribute.getValue ( );
  }


  /**
   *
   */
  this.setAttributeValue = function ( attrName, attrValue )
  {
    var attribute = this.getAttribute ( attrName );
    if ( attribute == null )
    {
      attribute = new XmlAttribute ( attrName, attrValue );
      this.attributes [ this.attributes.length ] = attribute;
    }
    else
    {
      attribute.setValue ( attrValue );
    }
  }


  /**
   *
   */
  this.getValue = function ( )
  {
    return stripSlashes ( this.value );
  }


  /**
   *
   */
  this.setValue = function ( aValue )
  {
    this.value = addSlashes ( aValue );
  }


  /**
   *
   */
  this.load = function ( reader )
  {
    var token;
    var rc;
    var tName;
    var tValue;
    var node;
    var loaded = false;
    //var debug = "";

    while ( ( token = reader.nextToken ( ) ) != null )
    {
      rc     = token.type;
      tName  = token.name;
      tValue = token.value;

	  //debug += rc + " / " + tName + " / " + tValue + "\r\n"; 

      if ( rc == ERROR )
      {
        break;
      }
      else if ( rc == KEY )
      {
        if ( parent == null && ! loaded )
        {
          loaded = true;
          this.object = tName;
          //break;
        }
        else
        {
          node = new XmlNode ( tName, "" );
          this.add  ( node   );
          node.load ( reader );
        }
      }
      else if ( rc == KEYSTART )
      {
        if ( this.parent == null && ! loaded )
        {
          loaded  = true;
          this.object = tName;
        }
        else
        {
          node = new XmlNode ( tName, "" );
          this.add ( node );
          node.load ( reader );
        }
      }
      else if ( rc == KEYDEFEND )
      {
        //break;
      }
      else if ( rc == KEYVALUE )
      {
        this.setValue ( tValue );
        if ( this.level > 0 ) break;
      }
      else if ( rc == KEYEND )
      {
        break;
      }
      else if ( rc == KEYALONE )
      {
        node = new XmlNode ( tName, "" );
        this.add ( node );
      }
      else if ( rc == ATTRIBUTE )
      {
        if ( tName == "name" )
        {
          this.name = tValue;
        }
        else
        {
          this.setAttributeValue ( tName, tValue );
        }
      }
    }
    
    //alert ( debug );
  }


  /**
   *
   */
  this.parse = function ( xml )
  {
    this.load ( new XmlReader ( xml ) );
  }


  /**
   *
   */
  this.getIndent = function ( )
  {
    var indent  = "";
    for ( var k = 0; k < this.level; k ++ ) indent += "  ";
    return indent;
  }


  /**
   *
   */
  this.getXml = function ( )
  {
    var count;

    var xml = this.getIndent ( );
    xml += '<' + this.object + " name=\"" + this.name + '"';

    count = this.attributes.length;
    for ( var k = 0; k < count; k ++ )
    {
      var attr = this.attributes [ k ];
      xml += ' ' + attr.name + "=\"" + attr.getValue ( ) + '"';
    }

    count = this.size ( );
    if ( count > 0 )
    {
      xml += ">\r\n";
      for ( var k = 0; k < count; k ++ )
      {
        var node = this.nodes [ k ];
        node.level = this.level + 1;
        xml += node.getXml ( );
      }
      xml += this.getIndent ( ) + "</" + this.object + ">";
    }
    else if ( this.value.length > 0 )
    {
      xml += ">" + this.value + "</" + this.object + ">";
    }
    else
    {
      xml += "/>";
    }

    xml += "\r\n";

    return xml;
  }


  /**
   *
   */
  this.getXmlDoc = function ( )
  {
    this.level = 0;
    return "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n\r\n" + this.getXml ( );
  }
}



/**
 *
 */
function XmlToken ( tType, tName, tValue )
{
  this.type  = tType;
  this.name  = tName;
  this.value = tValue;
}



/**
 *
 */
function XmlReader ( xml )
{
  // -------------------------------------------------------------------
  // ----------   Instance attributes & Constructor   ------------------

  this.pos    = 0;
  this.status = 0;
  this.source = xml;


  // -------------------------------------------------------------------
  // ----------   Lexical analysis Methods   ---------------------------

  /**
   *
   */
  this.getChar = function ( )
  {
    if ( this.source == null || this.source.length == 0 ||
         this.pos < 0 || this.pos >= this.source.length ) return null;
    var c = this.source.charAt ( this.pos );
    this.pos ++;
    return c;
  }


  /**
   *
   */
  this.backChar = function ( )
  {
    if ( this.pos > 0 ) this.pos --;
  }


  /**
   *
   */
  this.isWhiteSpace = function ( c )
  {
    if ( c == ' ' || c == '\n' || c == '\r' || c== '\t' ) return true;
    return false;
  }


  /**
   *
   */
  this.nextToken = function ( )
  {
    var c       = ' ';
    var rc      = UNKNOWN;
    var sbName  = "";
    var sbValue = "";

    while ( ( rc == UNKNOWN ) && ( c = this.getChar ( ) ) != null )
    {
      switch ( this.status )
      {
        // -------------------------------------------------------------
        // ----------   Waiting for '<'   ------------------------------
        case 0:
        {
          if ( c == '<' ) this.status = 1000;
          break;
        }

        // -------------------------------------------------------------
        // ----------   Start group   ----------------------------------
        case 1000:  // Just after initial '<'
        {
          if ( c == '?' )
          {
            this.status = 1100;   // XML header start.
          }
          else if ( c == '!' )
          {
            this.status = 1250;   // Comments?
          }
          else if ( c == '-' )
          {
            this.status = 1200;   // Illegal Comments?
          }
          else if ( c == '/' )
          {
            this.status = 1300;   // End of a key
          }
          else
          {
            sbName += c;
            this.status = 1400;   // Start of a key
          }
          break;
        }

        // -------------------------------------------------------------
        // ----------   XML header group   -----------------------------
        case 1100:  // After "<?". Waiting for the next '?'.
        {
          if ( c == '?' ) this.status = 1110;
          if ( c == '>' )
          {
            // Errors' tolerance is high
            sbValue = "";
            this.status = 0; // XML header end.
          }
          break;
        }
        case 1110:  // After "<? ... ?". Waiting for '>'.
        {
          if ( c == '>' )
          {
            sbValue = "";
            this.status = 0; // XML header end.
          }
          else
          {
            this.status = 1100;
          }
          break;
        }

        // -------------------------------------------------------------
        // ----------   Comments group 2/1   ---------------------------
        case 1250:  // Just after "<!"
        {
          if ( c == '-' )
          {
            this.status = 1260;
          }
          else
          {
            sbName += '!';
            this.backChar ( );
            this.status = 1400;
          }
          break;
        }
        case 1260:  // After "<!-"
        {
          if ( c == '-' )
          {
            sbName  = "";
            sbValue = "";
            this.status = 1210;
          }
          else
          {
            sbName += '!';
            sbName += '-';
            this.backChar ( );
            this.status = 1400;
          }
          break;
        }
        case 1200:  // Just after "<-"
        {
          if ( c == '-' )
          {
            sbName  = "";
            sbValue = "";
            this.status  = 1210;
          }
          else
          {
            sbName += '-';
            this.backChar ( );
            this.status = 1400;
          }
          break;
        }
        case 1210:  // After "<--" or "<!--"
        {
          if ( c == '-' ) this.status = 1220;
          break;
        }
        case 1220:  // After "<-- ... -"
        {
          if ( c == '-' )
          {
            this.status = 1230;
          }
          else
          {
            this.status = 1210;
          }
          break;
        }
        case 1230:  // After "<-- ... --"
        {
          if ( c == '>' )
          {
            this.status = 0;
          }
          else
          {
            this.status = 1210;
          }
          break;
        }

        // -------------------------------------------------------------
        // ----------   Key end group   --------------------------------
        case 1300:  // Just after "</"
        {
          if ( c == '>' )
          {
            this.status = 0;
            rc = KEYEND;
          }
          break;
        }

        // -------------------------------------------------------------
        // ----------   Key start group   ------------------------------
        case 1400:  // Just after "<" and some character
        {
          if ( c == '>' )
          {
            this.status = 1800;
            rc = KEY;
          }
          else if ( this.isWhiteSpace ( c ) )
          {
            this.status = 1500;
            rc = KEYSTART;
          }
          else if ( c == '/' )
          {
            this.status = 1750;
          }
          else
          {
            sbName += c;
          }
          break;
        }

        // -------------------------------------------------------------
        // ----------   Key properties group   -------------------------
        case 1500:  // starting to read an attribute's name
        {
          if ( this.isWhiteSpace ( c ) ) break;
          if ( c == '=' )
          {
            break; /* ignoring error */
          }
          if ( c == '>' )
          {
            this.status = 1800;
            rc = KEYDEFEND;
            break;
          }
          if ( c == '/' )
          {
            this.status = 1700;
            break;
          }
          sbName += c;
          this.status = 1510;
          break;
        }
        case 1510:  // reading the attribute's name
        {
          if ( this.isWhiteSpace ( c ) ) break;  // White spaces are ignored
          if ( c == '/' ) { this.status = 1700; break; }
          if ( c == '=' ) { this.status = 1520; break; }
          sbName += c;
          break;
        }
        case 1520:  // starting to read the attribute's value
        {
          if ( c == '"' ) { this.status = 1540; break; }
          if ( this.isWhiteSpace ( c ) ) break;
          sbValue += c;
          this.status = 1530;
          break;
        }
        case 1530:  // reading the attribute's value until a white space
        {
          if ( c == '>' )
          {
            this.status = 1800;
            rc = ATTRIBUTE;
            break;
          }
          if ( c == '/' )
          {
            this.status = 1700;
            rc = ATTRIBUTE;
            break;
          }
          if ( this.isWhiteSpace ( c ) )
          {
            this.status = 1500;
            rc = ATTRIBUTE;
            break;
          }
          sbValue += c;
          break;
        }
        case 1540:
        {
          if ( c == '"' ) { this.status = 1500; rc = ATTRIBUTE; break; }
          if ( c == '\\' ) { this.status = 1550; break; }
          sbValue += c;
          break;
        }
        case 1550:
        {
          if ( c != '"' ) sbValue += '\\';
          sbValue += c;
          this.status = 1540;
          break;
        }

        // -------------------------------------------------------------
        // ----------   Key end group   --------------------------------
        case 1700:  // Just after "<... /"
        {
          if ( c == '>' ) { this.status = 0; rc = KEYEND; }
          break;
        }

        // -------------------------------------------------------------
        // ----------   Alone Key   ------------------------------------
        case 1750:  // Just after "<... /"
        {
          if ( c == '>' ) { this.status = 0; rc = KEYALONE; }
          break;
        }

        // -------------------------------------------------------------
        // ----------   Key value group   ------------------------------
        case 1800:  // Just after "<... >"
        {
          if ( c == '<' )
          {
            this.status = 1810;
          }
          else if ( c == '\\' )
          {
            this.status = 1830;
          }
          else
          {
            sbValue += c;
          }
          break;
        }
        case 1810:  // Just after "<... >...<"
        {
          if ( c == '!' )
          {
            this.status = 1250;
          }
          else if ( c == '/' )
          {
            this.status = 1820;
          }
          else
          {
            sbName += c;
            this.status = 1400;
          }
          break;
        }
        case 1820:  // Just after "<... >...</"
        {
          if ( c == '>' )
          {
            this.status = 0; rc = KEYVALUE;
          }
          break;
        }
        case 1830:  // Just after "<... >...\"
        {
          if ( c != '<' ) sbValue += '\\';
          sbValue += c;
          this.status = 1800;
          break;
        }
      }
    }

    if ( rc == UNKNOWN ) rc = ERROR;

    var token = new XmlToken ( rc, sbName, sbValue );
    return token;
  }
}