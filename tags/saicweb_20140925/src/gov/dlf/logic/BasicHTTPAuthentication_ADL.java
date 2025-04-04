package gov.dlf.logic;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/**
 *
 * @author Jorge Olmeda 5/8/2009
 */
public class BasicHTTPAuthentication_ADL extends Authenticator {

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("familia\\saicweb", "websaic".toCharArray());
    }
}
