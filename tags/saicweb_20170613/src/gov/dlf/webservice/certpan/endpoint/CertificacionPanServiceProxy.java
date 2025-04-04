package gov.dlf.webservice.certpan.endpoint;

public class CertificacionPanServiceProxy implements gov.dlf.webservice.certpan.endpoint.CertificacionPanService_PortType {
  private String _endpoint = null;
  private gov.dlf.webservice.certpan.endpoint.CertificacionPanService_PortType certificacionPanService_PortType = null;
  
  public CertificacionPanServiceProxy() {
    _initCertificacionPanServiceProxy();
  }
  
  public CertificacionPanServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCertificacionPanServiceProxy();
  }
  
  private void _initCertificacionPanServiceProxy() {
    try {
      certificacionPanService_PortType = (new gov.dlf.webservice.certpan.endpoint.CertificacionPanService_ServiceLocator()).getCertificacionPanServicePort();
      if (certificacionPanService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)certificacionPanService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)certificacionPanService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (certificacionPanService_PortType != null)
      ((javax.xml.rpc.Stub)certificacionPanService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public gov.dlf.webservice.certpan.endpoint.CertificacionPanService_PortType getCertificacionPanService_PortType() {
    if (certificacionPanService_PortType == null)
      _initCertificacionPanServiceProxy();
    return certificacionPanService_PortType;
  }
  
  public gov.dlf.webservice.certpan.endpoint.CheckIfExistResult checkIfExists(int SSN, java.lang.String name, java.lang.String lastName) throws java.rmi.RemoteException{
    if (certificacionPanService_PortType == null)
      _initCertificacionPanServiceProxy();
    return certificacionPanService_PortType.checkIfExists(SSN, name, lastName);
  }
  
  public byte[] getPDFCert(int SSN, java.lang.String name, java.lang.String lastName, java.lang.String lastName2, java.lang.String address1, java.lang.String address2, java.lang.String city, java.lang.String zipCode, java.lang.String zipCode4, java.lang.String language) throws java.rmi.RemoteException{
    if (certificacionPanService_PortType == null)
      _initCertificacionPanServiceProxy();
    return certificacionPanService_PortType.getPDFCert(SSN, name, lastName, lastName2, address1, address2, city, zipCode, zipCode4, language);
  }
  
  public gov.dlf.webservice.certpan.endpoint.Certificacion getCertificacion(int SSN, java.lang.String name, java.lang.String lastName, java.lang.String lastName2, java.lang.String address1, java.lang.String address2, java.lang.String city, java.lang.String zipCode, java.lang.String zipCode4, java.lang.String email, boolean printFlag, java.lang.String language) throws java.rmi.RemoteException{
    if (certificacionPanService_PortType == null)
      _initCertificacionPanServiceProxy();
    return certificacionPanService_PortType.getCertificacion(SSN, name, lastName, lastName2, address1, address2, city, zipCode, zipCode4, email, printFlag, language);
  }
  
  public gov.dlf.webservice.certpan.endpoint.Validacion getValidation(java.lang.String last4SSN, long id) throws java.rmi.RemoteException{
    if (certificacionPanService_PortType == null)
      _initCertificacionPanServiceProxy();
    return certificacionPanService_PortType.getValidation(last4SSN, id);
  }
  
  
}