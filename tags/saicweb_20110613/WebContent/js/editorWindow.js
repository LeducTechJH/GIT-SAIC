
var remote1;
var sourceTargetFieldId;
var sourceTargetFieldValue;


/**
 * 
 */
function openEditorWindow ( targetFielId, targetFielIdValue )
{
  var width   = 640;
  var height  = 480;
  var winTop  = ( screen.height - height ) / 2; 
  var winLeft = ( screen.width  - width  ) / 2; 

  sourceTargetFieldId = targetFielId;
  sourceTargetFieldValue = targetFielIdValue;        
  remote1 = window.open ( "texteditor/editor.html" , null, "toolbar=no, directories=no, status=no, menubar=no, resizable=yes, modal=yes, scrollbars=no, height=" + height + "px;, width=" + width + "px;, top=" + winTop + ", left=" + winLeft );                   
  if ( remote1.opener == null ) remote1.opener = window;
  remote1.focus ( );                        
}
