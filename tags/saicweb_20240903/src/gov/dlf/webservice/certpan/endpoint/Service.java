/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.dlf.webservice.certpan.endpoint;

public class Service  implements java.io.Serializable {
    private int PAN;

    private int TANF;

    private java.lang.String PANTerm;

    private java.lang.String TANFTerm;

    public Service() {
    }

    public Service(
           int PAN,
           int TANF,
           java.lang.String PANTerm,
           java.lang.String TANFTerm) {
           this.PAN = PAN;
           this.TANF = TANF;
           this.PANTerm = PANTerm;
           this.TANFTerm = TANFTerm;
    }


    /**
     * Gets the PAN value for this Service.
     * 
     * @return PAN
     */
    public int getPAN() {
        return PAN;
    }


    /**
     * Sets the PAN value for this Service.
     * 
     * @param PAN
     */
    public void setPAN(int PAN) {
        this.PAN = PAN;
    }


    /**
     * Gets the TANF value for this Service.
     * 
     * @return TANF
     */
    public int getTANF() {
        return TANF;
    }


    /**
     * Sets the TANF value for this Service.
     * 
     * @param TANF
     */
    public void setTANF(int TANF) {
        this.TANF = TANF;
    }


    /**
     * Gets the PANTerm value for this Service.
     * 
     * @return PANTerm
     */
    public java.lang.String getPANTerm() {
        return PANTerm;
    }


    /**
     * Sets the PANTerm value for this Service.
     * 
     * @param PANTerm
     */
    public void setPANTerm(java.lang.String PANTerm) {
        this.PANTerm = PANTerm;
    }


    /**
     * Gets the TANFTerm value for this Service.
     * 
     * @return TANFTerm
     */
    public java.lang.String getTANFTerm() {
        return TANFTerm;
    }


    /**
     * Sets the TANFTerm value for this Service.
     * 
     * @param TANFTerm
     */
    public void setTANFTerm(java.lang.String TANFTerm) {
        this.TANFTerm = TANFTerm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Service)) return false;
        Service other = (Service) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.PAN == other.getPAN() &&
            this.TANF == other.getTANF() &&
            ((this.PANTerm==null && other.getPANTerm()==null) || 
             (this.PANTerm!=null &&
              this.PANTerm.equals(other.getPANTerm()))) &&
            ((this.TANFTerm==null && other.getTANFTerm()==null) || 
             (this.TANFTerm!=null &&
              this.TANFTerm.equals(other.getTANFTerm())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getPAN();
        _hashCode += getTANF();
        if (getPANTerm() != null) {
            _hashCode += getPANTerm().hashCode();
        }
        if (getTANFTerm() != null) {
            _hashCode += getTANFTerm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Service.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://endpoint.certpan.webservice.dlf.gov/", "Service"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TANF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TANF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PANTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PANTerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TANFTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TANFTerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
