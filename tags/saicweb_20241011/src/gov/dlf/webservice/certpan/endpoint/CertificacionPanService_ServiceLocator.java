/**
 * CertificacionPanService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.dlf.webservice.certpan.endpoint;

public class CertificacionPanService_ServiceLocator extends org.apache.axis.client.Service implements gov.dlf.webservice.certpan.endpoint.CertificacionPanService_Service {

    public CertificacionPanService_ServiceLocator() {
    }


    public CertificacionPanService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CertificacionPanService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CertificacionPanServicePort
    private java.lang.String CertificacionPanServicePort_address = "http://10.200.255.172:8080/CERT_PART_WS_V2/CertClientService";

    public java.lang.String getCertificacionPanServicePortAddress() {
        return CertificacionPanServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CertificacionPanServicePortWSDDServiceName = "CertificacionPanServicePort";

    public java.lang.String getCertificacionPanServicePortWSDDServiceName() {
        return CertificacionPanServicePortWSDDServiceName;
    }

    public void setCertificacionPanServicePortWSDDServiceName(java.lang.String name) {
        CertificacionPanServicePortWSDDServiceName = name;
    }

    public gov.dlf.webservice.certpan.endpoint.CertificacionPanService_PortType getCertificacionPanServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CertificacionPanServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCertificacionPanServicePort(endpoint);
    }

    public gov.dlf.webservice.certpan.endpoint.CertificacionPanService_PortType getCertificacionPanServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            gov.dlf.webservice.certpan.endpoint.CertificacionPanServicePortBindingStub _stub = new gov.dlf.webservice.certpan.endpoint.CertificacionPanServicePortBindingStub(portAddress, this);
            _stub.setPortName(getCertificacionPanServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCertificacionPanServicePortEndpointAddress(java.lang.String address) {
        CertificacionPanServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (gov.dlf.webservice.certpan.endpoint.CertificacionPanService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                gov.dlf.webservice.certpan.endpoint.CertificacionPanServicePortBindingStub _stub = new gov.dlf.webservice.certpan.endpoint.CertificacionPanServicePortBindingStub(new java.net.URL(CertificacionPanServicePort_address), this);
                _stub.setPortName(getCertificacionPanServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CertificacionPanServicePort".equals(inputPortName)) {
            return getCertificacionPanServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://endpoint.certpan.webservice.dlf.gov/", "CertificacionPanService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://endpoint.certpan.webservice.dlf.gov/", "CertificacionPanServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CertificacionPanServicePort".equals(portName)) {
            setCertificacionPanServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
