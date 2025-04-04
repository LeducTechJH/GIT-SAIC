document.write ( '<script src="js/jquery.js" type="text/javascript"></script>\r\n' );
document.write ( '<script src="js/jquery.maskedinput.js" type="text/javascript"></script>\r\n' );

document.write ( '<script language="javascript">\r\n' );
document.write ( '  $(document).ready(function(){\r\n' );
document.write ( '    $("[name=TELEFONO_HOGAR.0]").mask("(999) 999-9999");\r\n' );
document.write ( '    $("[name=TELEFONO_TRABAJO.0]").mask("(999) 999-9999");\r\n' );
document.write ( '  });\r\n' );
document.write ( '</script>\r\n' );
