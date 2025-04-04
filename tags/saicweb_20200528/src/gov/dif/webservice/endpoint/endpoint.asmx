<definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
    xmlns:tns="http://gov.dif.webservice.endpoint/" xmlns:xsd="http://www.w3.org/2001/XMLSchema"
    xmlns="http://schemas.xmlsoap.org/wsdl/" targetNamespace="http://http://gov.dif.webservice.endpoint/"
    name="strRMOImplService">
    <types>
        <xsd:schema>
            <xsd:import namespace="http://gov.dif.webservice.endpoint/"
                schemaLocation="http://127.0.0.1:10000/SaicServer?xsd=1" />
        </xsd:schema>
</types>
    <message name="setRMO">
        <part name="parameters" element="tns:setRMO" />
    </message>
    <message name="setRMOResponse">
        <part name="parameters" element="tns:setRMOResponse" />
    </message>
    <portType name="SaicServer">
        <operation name="setRMO">
            <input message="tns:setRMO" />
            <output message="tns:setRMOResponse" />
        </operation>
    </portType>
    <binding name="SaicServerImplPortBinding" type="tns:SaicServer">
        <soap:binding transport="http://schemas.xmlsoap.org/soap/http"
            style="document" />
        <operation name="setRMO">
            <soap:operation soapAction="" />
            <input>
                <soap:body use="literal" />
            </input>
            <output>
                <soap:body use="literal" />
            </output>
        </operation>
        
    </binding>
    <service name="SaicServerImplService">
        <port name="SaicServerImplPort" binding="tns:SaicServerImplPortBinding">
            <soap:address location="http://127.0.0.1:10000/SaicServer" />
        </port>
    </service>
</definitions>