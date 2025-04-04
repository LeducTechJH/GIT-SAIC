/**
 * Overrides the empty function in jdp.js
 */
function afterInit ( )
{
  var fields = new Array ( );
  var k = 0;
  fields [ k ++ ] = "SEGURO_SOCIAL_JEFE_FAM1.0";
  fields [ k ++ ] = "SEGURO_SOCIAL_JEFE_SERV.0.0";
  fields [ k ++ ] = "SEGURO_SOCIAL_ADMN.0.0";
  fields [ k ++ ] = "SEGURO_SOCIAL_REPRE.0.0";
  
  for ( var m = 0; m < 10; m ++ )
  {
    fields [ k ++ ] = "SEGURO_SOCIAL_BENEFICIARIO.0.0." + m;
  }

  for ( k = 0; k < fields.length; k ++ )
  {
    var element = document.getElementById ( fields [ k ] );
    if ( element )
    {
      element.onkeydown = numericOnKeyDown;
      element.onkeyup   = numericOnKeyUp;
    }
  }

  for ( k = 0; k < 5; k ++ )
  {
    var index = fields [ k ].indexOf ( "." );
    if ( index > 0 ) fields [ k ] = fields [ k ].substring ( 0, index );
    setMinimum ( fields [ k ], "1" );
    setMaximum ( fields [ k ], "999999999" );
  }

  setArrowField ( "NUCLEO_PARK", "-->" );
}


/**
 * Overrides the empty function in jdp.js
 * 
 * Occurs just at the start of the focusField ( ) 
 * function in jdp.js ( "onfocus" event handler ).
 */
function preFocusField ( obj )
{
  if ( obj == null || ! obj ) return false;

  var field = model.getInDepth ( obj.name );
  if ( field && field.name == "SEGURO_SOCIAL_BENEFICIARIO" )
  {
    var group = field.container;
    if ( group )
    {
      var index = obj.name.indexOf ( "." );
      var instPath = "";
      if ( index > 0 ) instPath = obj.name.substring ( index );
      var instance = document.getElementById ( group.name + instPath );
      if ( instance )
      {
        var rowState = instance.value;
        if ( rowState != "New" && rowState != "NewModified" )
        {
          if ( objectInFocus ) 
          {
            var ind = objectInFocus.name.indexOf ( "." );
            var insPath = "";
            if ( ind > 0 ) insPath = objectInFocus.name.substring ( 0, ind );
            if ( insPath == "NUCLEO_PARK" )
            {
              var cod_parent = document.getElementById ( "COD_PARENTESCO_RELACION_SERV" + instPath );
              if ( cod_parent )
              {
                cod_parent.focus ( );
              }
              else
              {
                objectInFocus.focus ( );
              }
            }
            else
            {
              objectInFocus.focus ( );
            }
          }
          return true;
        }
      }
    }
  }

  return false;
}