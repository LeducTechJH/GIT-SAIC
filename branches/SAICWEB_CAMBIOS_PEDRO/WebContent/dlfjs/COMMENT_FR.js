document.write ( '<script language="JavaScript" src="js/header.js"></script>\r\n' );



disableNotFocused = true;


/**
 * Overrides the empty function in jdp.js
 */
function afterInit ( )
{
  var elem = document.getElementById ( "COMMENT.0" );
    elem.readOnly = false;
    elem.setAttribute ( "readonly", false );    

}




