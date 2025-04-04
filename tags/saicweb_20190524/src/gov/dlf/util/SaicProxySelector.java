package gov.dlf.util;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import net.maintrend.util.Compare;

public class SaicProxySelector extends java.net.ProxySelector {

	ProxySelector defsel = null;
    public SaicProxySelector(ProxySelector def) {
            defsel = def;
    }

    SocketAddress addrAdsef = new InetSocketAddress("10.200.10.1", 8080);
    Proxy proxyAdsef = new Proxy(Proxy.Type.HTTP, addrAdsef);

    SocketAddress addrOsi = new InetSocketAddress("10.200.15.5", 8002);
    Proxy proxyOsi = new Proxy(Proxy.Type.HTTP, addrOsi);



	@Override
	public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Proxy> select(URI uri) {

		if (uri == null)
		{
            throw new IllegalArgumentException("URI can't be null.");
		}

	//	String protocol = uri.getScheme();

		if ( Compare.equals(uri.getHost(), "serviciosenlinea.asume.pr.gov") )
		{
            ArrayList<Proxy> l = new ArrayList<Proxy>();

            l.add( proxyAdsef );
            l.add( proxyOsi );
            return l;
		}

		if (defsel != null)
		{

            return defsel.select(uri);

		}
		else
		{
            ArrayList<Proxy> l = new ArrayList<Proxy>();
            l.add(Proxy.NO_PROXY);
            return l;
		}
	}



}
