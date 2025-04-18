package gov.dlf.util;
import okhttp3.OkHttpClient;
import javax.net.ssl.*;

import java.net.Proxy;
import java.security.cert.CertificateException;

public class OkHttpClientTLSBypass {

	public static OkHttpClient getBypassOkHttpClient() {
		try {
				// Create a trust manager that does not validate certificate chains
				final TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() 
				{
						@Override
						public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType)
						throws CertificateException 
						{
						}

						@Override
						public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType)
						throws CertificateException 
						{
						}

						@Override
						public java.security.cert.X509Certificate[] getAcceptedIssuers()
						{
							return new java.security.cert.X509Certificate[] {};
						}
				} 
			};

				// Install the all-trusting trust manager
				final SSLContext sslContext = SSLContext.getInstance("SSL");
				sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
				// Create an ssl socket factory with our all-trusting manager
				final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

            	OkHttpClient.Builder builder = new OkHttpClient.Builder();
            	builder.proxy(Proxy.NO_PROXY);
	        	builder.sslSocketFactory(sslSocketFactory, (X509TrustManager) trustAllCerts[0]);
	        	builder.hostnameVerifier(new javax.net.ssl.HostnameVerifier() {
	        	    @Override
	        	    public boolean verify(String hostname, javax.net.ssl.SSLSession session) {
	        	        return true;
	        	    }
	        	});

	            return builder.build();
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	    }
	}


