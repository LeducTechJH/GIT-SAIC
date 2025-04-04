<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://tempuri.org/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://tempuri.org/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://tempuri.org/">
      <s:element name="CrearTokenXUsuario">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="strUsuarioID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CrearTokenXUsuarioResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CrearTokenXUsuarioResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Version">
        <s:complexType />
      </s:element>
      <s:element name="VersionResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="VersionResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="CrearTokenXUsuarioSoapIn">
    <wsdl:part name="parameters" element="tns:CrearTokenXUsuario" />
  </wsdl:message>
  <wsdl:message name="CrearTokenXUsuarioSoapOut">
    <wsdl:part name="parameters" element="tns:CrearTokenXUsuarioResponse" />
  </wsdl:message>
  <wsdl:message name="VersionSoapIn">
    <wsdl:part name="parameters" element="tns:Version" />
  </wsdl:message>
  <wsdl:message name="VersionSoapOut">
    <wsdl:part name="parameters" element="tns:VersionResponse" />
  </wsdl:message>
  <wsdl:portType name="UsuariosSoap">
    <wsdl:operation name="CrearTokenXUsuario">
      <wsdl:input message="tns:CrearTokenXUsuarioSoapIn" />
      <wsdl:output message="tns:CrearTokenXUsuarioSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Version">
      <wsdl:input message="tns:VersionSoapIn" />
      <wsdl:output message="tns:VersionSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="UsuariosSoap" type="tns:UsuariosSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="CrearTokenXUsuario">
      <soap:operation soapAction="http://tempuri.org/CrearTokenXUsuario" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Version">
      <soap:operation soapAction="http://tempuri.org/Version" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="UsuariosSoap12" type="tns:UsuariosSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="CrearTokenXUsuario">
      <soap12:operation soapAction="http://tempuri.org/CrearTokenXUsuario" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Version">
      <soap12:operation soapAction="http://tempuri.org/Version" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="Usuarios">
    <wsdl:port name="UsuariosSoap" binding="tns:UsuariosSoap">
      <soap:address location="http://10.201.10.72/SIBIFCALENDARIO/Usuarios.asmx" />
    </wsdl:port>
    <wsdl:port name="UsuariosSoap12" binding="tns:UsuariosSoap12">
      <soap12:address location="http://10.201.10.72/SIBIFCALENDARIO/Usuarios.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>