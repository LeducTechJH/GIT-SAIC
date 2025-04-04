/**
 * MiembroFamilia.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.dlf.webservice.certpan.endpoint;

public class MiembroFamilia  implements java.io.Serializable {
    private java.lang.String cod_Rel;

    private java.lang.String nombre;

    private java.lang.String pan;

    private java.lang.String tanf;

    private java.lang.String fact_eleg;

    private java.lang.String motivo;

    public MiembroFamilia() {
    }

    public MiembroFamilia(
           java.lang.String cod_Rel,
           java.lang.String nombre,
           java.lang.String pan,
           java.lang.String tanf,
           java.lang.String fact_eleg,
           java.lang.String motivo) {
           this.cod_Rel = cod_Rel;
           this.nombre = nombre;
           this.pan = pan;
           this.tanf = tanf;
           this.fact_eleg = fact_eleg;
           this.motivo = motivo;
    }


    /**
     * Gets the cod_Rel value for this MiembroFamilia.
     * 
     * @return cod_Rel
     */
    public java.lang.String getCod_Rel() {
        return cod_Rel;
    }


    /**
     * Sets the cod_Rel value for this MiembroFamilia.
     * 
     * @param cod_Rel
     */
    public void setCod_Rel(java.lang.String cod_Rel) {
        this.cod_Rel = cod_Rel;
    }


    /**
     * Gets the nombre value for this MiembroFamilia.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this MiembroFamilia.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the pan value for this MiembroFamilia.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this MiembroFamilia.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }


    /**
     * Gets the tanf value for this MiembroFamilia.
     * 
     * @return tanf
     */
    public java.lang.String getTanf() {
        return tanf;
    }


    /**
     * Sets the tanf value for this MiembroFamilia.
     * 
     * @param tanf
     */
    public void setTanf(java.lang.String tanf) {
        this.tanf = tanf;
    }


    /**
     * Gets the fact_eleg value for this MiembroFamilia.
     * 
     * @return fact_eleg
     */
    public java.lang.String getFact_eleg() {
        return fact_eleg;
    }


    /**
     * Sets the fact_eleg value for this MiembroFamilia.
     * 
     * @param fact_eleg
     */
    public void setFact_eleg(java.lang.String fact_eleg) {
        this.fact_eleg = fact_eleg;
    }


    /**
     * Gets the motivo value for this MiembroFamilia.
     * 
     * @return motivo
     */
    public java.lang.String getMotivo() {
        return motivo;
    }


    /**
     * Sets the motivo value for this MiembroFamilia.
     * 
     * @param motivo
     */
    public void setMotivo(java.lang.String motivo) {
        this.motivo = motivo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MiembroFamilia)) return false;
        MiembroFamilia other = (MiembroFamilia) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cod_Rel==null && other.getCod_Rel()==null) || 
             (this.cod_Rel!=null &&
              this.cod_Rel.equals(other.getCod_Rel()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan()))) &&
            ((this.tanf==null && other.getTanf()==null) || 
             (this.tanf!=null &&
              this.tanf.equals(other.getTanf()))) &&
            ((this.fact_eleg==null && other.getFact_eleg()==null) || 
             (this.fact_eleg!=null &&
              this.fact_eleg.equals(other.getFact_eleg()))) &&
            ((this.motivo==null && other.getMotivo()==null) || 
             (this.motivo!=null &&
              this.motivo.equals(other.getMotivo())));
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
        if (getCod_Rel() != null) {
            _hashCode += getCod_Rel().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getPan() != null) {
            _hashCode += getPan().hashCode();
        }
        if (getTanf() != null) {
            _hashCode += getTanf().hashCode();
        }
        if (getFact_eleg() != null) {
            _hashCode += getFact_eleg().hashCode();
        }
        if (getMotivo() != null) {
            _hashCode += getMotivo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MiembroFamilia.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://endpoint.certpan.webservice.dlf.gov/", "MiembroFamilia"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cod_Rel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Cod_Rel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tanf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tanf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fact_eleg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fact_eleg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "motivo"));
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
