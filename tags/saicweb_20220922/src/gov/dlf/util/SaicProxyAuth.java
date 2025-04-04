package gov.dlf.util;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class SaicProxyAuth extends Authenticator{

	private String userName, password;

    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(userName, password.toCharArray());
    }

    public SaicProxyAuth(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

}
