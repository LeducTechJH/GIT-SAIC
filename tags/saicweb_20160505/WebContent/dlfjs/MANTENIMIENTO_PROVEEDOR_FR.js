


/**
 *
 */


/**
 * 
 */
function getRowState ( obj )
{
  if ( obj )
  {
    var field = model.getInDepth ( obj.name );
    if ( field )
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
          return rowState;
        }
      }
    }
  }
  return "";
}


/**
 * 
 */
function getGroupName ( obj )
{
  if ( obj )
  {
    var field = model.getInDepth ( obj.name );
    if ( field )
    {
      var group = field.container;
      if ( group )
      { 
        return group.name;
      }
    }
  }
  return "";
}


/**
 * Overrides the empty function in jdp.js
 *
 * Occurs just at the start of the focusField ( )
 * function in jdp.js ( "onfocus" event handler ).
 *
 * objectInFocus is still a field, being in focus previously
 */
function preFocusField ( obj )
{


    return true;
 
}


/**
 * Overrides the empty function in jdp.js
 */
function applicationPreEventHandler ( eventCode )
{
  if ( eventCode == null || eventCode == "" || ! eventCode ) return false;

  if ( eventCode == "QUIT_ACTION" || eventCode == "DELINSTANCE" ) return false;

  if ( objectInFocus )
  {
    var elem = null;
    var id = objectInFocus.id;

  
    var value = elem.value;
   
      return true;
  }

  return false;
}


/**
 * Overrides ancestor's script 
 * 
 * @param obj
 */
function nextInstance ( obj )
{
  if ( obj == null || ! obj ) return;
  doAppRequest ( "command=" + prepareCommand ( "NEXTINSTANCE", obj, model.getInDepth ( obj.name ) ) );
}


/**
 * Overrides ancestor's script 
 *
 * @param obj
 */
function prevInstance ( obj )
{
  if ( obj == null || ! obj ) return;
  doAppRequest ( "command=" + prepareCommand ( "PREVINSTANCE", obj, model.getInDepth ( obj.name ) ) );
}

