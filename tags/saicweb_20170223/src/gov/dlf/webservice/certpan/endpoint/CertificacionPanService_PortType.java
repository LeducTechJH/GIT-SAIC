/**
 * CertificacionPanService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.dlf.webservice.certpan.endpoint;

public interface CertificacionPanService_PortType extends java.rmi.Remote {
    public gov.dlf.webservice.certpan.endpoint.Certificacion getCertificacion(int SSN, java.lang.String name, java.lang.String lastName, java.lang.String lastName2, java.lang.String address1, java.lang.String address2, java.lang.String city, java.lang.String zipCode, java.lang.String zipCode4, java.lang.String email, boolean printFlag) throws java.rmi.RemoteException;
    public gov.dlf.webservice.certpan.endpoint.CheckIfExistResult checkIfExists(int SSN, java.lang.String name, java.lang.String lastName) throws java.rmi.RemoteException;
    public gov.dlf.webservice.certpan.endpoint.Validacion getValidation(java.lang.String last4SSN, long id) throws java.rmi.RemoteException;
    public byte[] getPDFCert(int SSN, java.lang.String name, java.lang.String lastName, java.lang.String lastName2, java.lang.String address1, java.lang.String address2, java.lang.String city, java.lang.String zipCode, java.lang.String zipCode4) throws java.rmi.RemoteException;
}
