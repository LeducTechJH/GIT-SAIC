/**
 * Amount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.dlf.webservice.certpan.endpoint;

public class Amount  implements java.io.Serializable {
    private double PANAmount;

    private double TANFAmount;

    public Amount() {
    }

    public Amount(
           double PANAmount,
           double TANFAmount) {
           this.PANAmount = PANAmount;
           this.TANFAmount = TANFAmount;
    }


    /**
     * Gets the PANAmount value for this Amount.
     * 
     * @return PANAmount
     */
    public double getPANAmount() {
        return PANAmount;
    }


    /**
     * Sets the PANAmount value for this Amount.
     * 
     * @param PANAmount
     */
    public void setPANAmount(double PANAmount) {
        this.PANAmount = PANAmount;
    }


    /**
     * Gets the TANFAmount value for this Amount.
     * 
     * @return TANFAmount
     */
    public double getTANFAmount() {
        return TANFAmount;
    }


    /**
     * Sets the TANFAmount value for this Amount.
     * 
     * @param TANFAmount
     */
    public void setTANFAmount(double TANFAmount) {
        this.TANFAmount = TANFAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Amount)) return false;
        Amount other = (Amount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.PANAmount == other.getPANAmount() &&
            this.TANFAmount == other.getTANFAmount();
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
        _hashCode += new Double(getPANAmount()).hashCode();
        _hashCode += new Double(getTANFAmount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Amount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://endpoint.certpan.webservice.dlf.gov/", "Amount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PANAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PANAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TANFAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TANFAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
