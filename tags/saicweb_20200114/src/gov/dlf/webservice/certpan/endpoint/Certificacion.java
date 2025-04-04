/**
 * Certificacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.dlf.webservice.certpan.endpoint;

public class Certificacion  implements java.io.Serializable {
    private long ID;

    private int statusCode;

    private int beneficiary;

    private int socialSecurity;

    private java.lang.String name;

    private java.lang.String lastName;

    private java.lang.String lastName2;

    private java.lang.String address1;

    private java.lang.String address2;

    private java.lang.String city;

    private java.lang.String zipCode;

    private java.lang.String zipCode4;

    private java.lang.String email;

    private gov.dlf.webservice.certpan.endpoint.Service services;

    private gov.dlf.webservice.certpan.endpoint.Amount amounts;

    private java.lang.Double income;

    private int partPan;

    private int partTanf;

    private int compFamily;

    private int RMO;

    private java.lang.String CSI;

    private java.lang.String fechaSolicitudCertificado;

    private java.lang.String fechaExpiraCertificado;

    private int ingreso;

    private int ingresoT;

    private int otrosingresopan;

    private int otrosingresopae;

    private int cant_recae;

    private int cant_recpan;

    private gov.dlf.webservice.certpan.endpoint.MiembroFamilia[] compFamilia;

    public Certificacion() {
    }

    public Certificacion(
           long ID,
           int statusCode,
           int beneficiary,
           int socialSecurity,
           java.lang.String name,
           java.lang.String lastName,
           java.lang.String lastName2,
           java.lang.String address1,
           java.lang.String address2,
           java.lang.String city,
           java.lang.String zipCode,
           java.lang.String zipCode4,
           java.lang.String email,
           gov.dlf.webservice.certpan.endpoint.Service services,
           gov.dlf.webservice.certpan.endpoint.Amount amounts,
           java.lang.Double income,
           int partPan,
           int partTanf,
           int compFamily,
           int RMO,
           java.lang.String CSI,
           java.lang.String fechaSolicitudCertificado,
           java.lang.String fechaExpiraCertificado,
           int ingreso,
           int ingresoT,
           int otrosingresopan,
           int otrosingresopae,
           int cant_recae,
           int cant_recpan,
           gov.dlf.webservice.certpan.endpoint.MiembroFamilia[] compFamilia) {
           this.ID = ID;
           this.statusCode = statusCode;
           this.beneficiary = beneficiary;
           this.socialSecurity = socialSecurity;
           this.name = name;
           this.lastName = lastName;
           this.lastName2 = lastName2;
           this.address1 = address1;
           this.address2 = address2;
           this.city = city;
           this.zipCode = zipCode;
           this.zipCode4 = zipCode4;
           this.email = email;
           this.services = services;
           this.amounts = amounts;
           this.income = income;
           this.partPan = partPan;
           this.partTanf = partTanf;
           this.compFamily = compFamily;
           this.RMO = RMO;
           this.CSI = CSI;
           this.fechaSolicitudCertificado = fechaSolicitudCertificado;
           this.fechaExpiraCertificado = fechaExpiraCertificado;
           this.ingreso = ingreso;
           this.ingresoT = ingresoT;
           this.otrosingresopan = otrosingresopan;
           this.otrosingresopae = otrosingresopae;
           this.cant_recae = cant_recae;
           this.cant_recpan = cant_recpan;
           this.compFamilia = compFamilia;
    }


    /**
     * Gets the ID value for this Certificacion.
     * 
     * @return ID
     */
    public long getID() {
        return ID;
    }


    /**
     * Sets the ID value for this Certificacion.
     * 
     * @param ID
     */
    public void setID(long ID) {
        this.ID = ID;
    }


    /**
     * Gets the statusCode value for this Certificacion.
     * 
     * @return statusCode
     */
    public int getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this Certificacion.
     * 
     * @param statusCode
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the beneficiary value for this Certificacion.
     * 
     * @return beneficiary
     */
    public int getBeneficiary() {
        return beneficiary;
    }


    /**
     * Sets the beneficiary value for this Certificacion.
     * 
     * @param beneficiary
     */
    public void setBeneficiary(int beneficiary) {
        this.beneficiary = beneficiary;
    }


    /**
     * Gets the socialSecurity value for this Certificacion.
     * 
     * @return socialSecurity
     */
    public int getSocialSecurity() {
        return socialSecurity;
    }


    /**
     * Sets the socialSecurity value for this Certificacion.
     * 
     * @param socialSecurity
     */
    public void setSocialSecurity(int socialSecurity) {
        this.socialSecurity = socialSecurity;
    }


    /**
     * Gets the name value for this Certificacion.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Certificacion.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the lastName value for this Certificacion.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this Certificacion.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the lastName2 value for this Certificacion.
     * 
     * @return lastName2
     */
    public java.lang.String getLastName2() {
        return lastName2;
    }


    /**
     * Sets the lastName2 value for this Certificacion.
     * 
     * @param lastName2
     */
    public void setLastName2(java.lang.String lastName2) {
        this.lastName2 = lastName2;
    }


    /**
     * Gets the address1 value for this Certificacion.
     * 
     * @return address1
     */
    public java.lang.String getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this Certificacion.
     * 
     * @param address1
     */
    public void setAddress1(java.lang.String address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this Certificacion.
     * 
     * @return address2
     */
    public java.lang.String getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this Certificacion.
     * 
     * @param address2
     */
    public void setAddress2(java.lang.String address2) {
        this.address2 = address2;
    }


    /**
     * Gets the city value for this Certificacion.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Certificacion.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the zipCode value for this Certificacion.
     * 
     * @return zipCode
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this Certificacion.
     * 
     * @param zipCode
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the zipCode4 value for this Certificacion.
     * 
     * @return zipCode4
     */
    public java.lang.String getZipCode4() {
        return zipCode4;
    }


    /**
     * Sets the zipCode4 value for this Certificacion.
     * 
     * @param zipCode4
     */
    public void setZipCode4(java.lang.String zipCode4) {
        this.zipCode4 = zipCode4;
    }


    /**
     * Gets the email value for this Certificacion.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Certificacion.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the services value for this Certificacion.
     * 
     * @return services
     */
    public gov.dlf.webservice.certpan.endpoint.Service getServices() {
        return services;
    }


    /**
     * Sets the services value for this Certificacion.
     * 
     * @param services
     */
    public void setServices(gov.dlf.webservice.certpan.endpoint.Service services) {
        this.services = services;
    }


    /**
     * Gets the amounts value for this Certificacion.
     * 
     * @return amounts
     */
    public gov.dlf.webservice.certpan.endpoint.Amount getAmounts() {
        return amounts;
    }


    /**
     * Sets the amounts value for this Certificacion.
     * 
     * @param amounts
     */
    public void setAmounts(gov.dlf.webservice.certpan.endpoint.Amount amounts) {
        this.amounts = amounts;
    }


    /**
     * Gets the income value for this Certificacion.
     * 
     * @return income
     */
    public java.lang.Double getIncome() {
        return income;
    }


    /**
     * Sets the income value for this Certificacion.
     * 
     * @param income
     */
    public void setIncome(java.lang.Double income) {
        this.income = income;
    }


    /**
     * Gets the partPan value for this Certificacion.
     * 
     * @return partPan
     */
    public int getPartPan() {
        return partPan;
    }


    /**
     * Sets the partPan value for this Certificacion.
     * 
     * @param partPan
     */
    public void setPartPan(int partPan) {
        this.partPan = partPan;
    }


    /**
     * Gets the partTanf value for this Certificacion.
     * 
     * @return partTanf
     */
    public int getPartTanf() {
        return partTanf;
    }


    /**
     * Sets the partTanf value for this Certificacion.
     * 
     * @param partTanf
     */
    public void setPartTanf(int partTanf) {
        this.partTanf = partTanf;
    }


    /**
     * Gets the compFamily value for this Certificacion.
     * 
     * @return compFamily
     */
    public int getCompFamily() {
        return compFamily;
    }


    /**
     * Sets the compFamily value for this Certificacion.
     * 
     * @param compFamily
     */
    public void setCompFamily(int compFamily) {
        this.compFamily = compFamily;
    }


    /**
     * Gets the RMO value for this Certificacion.
     * 
     * @return RMO
     */
    public int getRMO() {
        return RMO;
    }


    /**
     * Sets the RMO value for this Certificacion.
     * 
     * @param RMO
     */
    public void setRMO(int RMO) {
        this.RMO = RMO;
    }


    /**
     * Gets the CSI value for this Certificacion.
     * 
     * @return CSI
     */
    public java.lang.String getCSI() {
        return CSI;
    }


    /**
     * Sets the CSI value for this Certificacion.
     * 
     * @param CSI
     */
    public void setCSI(java.lang.String CSI) {
        this.CSI = CSI;
    }


    /**
     * Gets the fechaSolicitudCertificado value for this Certificacion.
     * 
     * @return fechaSolicitudCertificado
     */
    public java.lang.String getFechaSolicitudCertificado() {
        return fechaSolicitudCertificado;
    }


    /**
     * Sets the fechaSolicitudCertificado value for this Certificacion.
     * 
     * @param fechaSolicitudCertificado
     */
    public void setFechaSolicitudCertificado(java.lang.String fechaSolicitudCertificado) {
        this.fechaSolicitudCertificado = fechaSolicitudCertificado;
    }


    /**
     * Gets the fechaExpiraCertificado value for this Certificacion.
     * 
     * @return fechaExpiraCertificado
     */
    public java.lang.String getFechaExpiraCertificado() {
        return fechaExpiraCertificado;
    }


    /**
     * Sets the fechaExpiraCertificado value for this Certificacion.
     * 
     * @param fechaExpiraCertificado
     */
    public void setFechaExpiraCertificado(java.lang.String fechaExpiraCertificado) {
        this.fechaExpiraCertificado = fechaExpiraCertificado;
    }


    /**
     * Gets the ingreso value for this Certificacion.
     * 
     * @return ingreso
     */
    public int getIngreso() {
        return ingreso;
    }


    /**
     * Sets the ingreso value for this Certificacion.
     * 
     * @param ingreso
     */
    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }


    /**
     * Gets the ingresoT value for this Certificacion.
     * 
     * @return ingresoT
     */
    public int getIngresoT() {
        return ingresoT;
    }


    /**
     * Sets the ingresoT value for this Certificacion.
     * 
     * @param ingresoT
     */
    public void setIngresoT(int ingresoT) {
        this.ingresoT = ingresoT;
    }


    /**
     * Gets the otrosingresopan value for this Certificacion.
     * 
     * @return otrosingresopan
     */
    public int getOtrosingresopan() {
        return otrosingresopan;
    }


    /**
     * Sets the otrosingresopan value for this Certificacion.
     * 
     * @param otrosingresopan
     */
    public void setOtrosingresopan(int otrosingresopan) {
        this.otrosingresopan = otrosingresopan;
    }


    /**
     * Gets the otrosingresopae value for this Certificacion.
     * 
     * @return otrosingresopae
     */
    public int getOtrosingresopae() {
        return otrosingresopae;
    }


    /**
     * Sets the otrosingresopae value for this Certificacion.
     * 
     * @param otrosingresopae
     */
    public void setOtrosingresopae(int otrosingresopae) {
        this.otrosingresopae = otrosingresopae;
    }


    /**
     * Gets the cant_recae value for this Certificacion.
     * 
     * @return cant_recae
     */
    public int getCant_recae() {
        return cant_recae;
    }


    /**
     * Sets the cant_recae value for this Certificacion.
     * 
     * @param cant_recae
     */
    public void setCant_recae(int cant_recae) {
        this.cant_recae = cant_recae;
    }


    /**
     * Gets the cant_recpan value for this Certificacion.
     * 
     * @return cant_recpan
     */
    public int getCant_recpan() {
        return cant_recpan;
    }


    /**
     * Sets the cant_recpan value for this Certificacion.
     * 
     * @param cant_recpan
     */
    public void setCant_recpan(int cant_recpan) {
        this.cant_recpan = cant_recpan;
    }


    /**
     * Gets the compFamilia value for this Certificacion.
     * 
     * @return compFamilia
     */
    public gov.dlf.webservice.certpan.endpoint.MiembroFamilia[] getCompFamilia() {
        return compFamilia;
    }


    /**
     * Sets the compFamilia value for this Certificacion.
     * 
     * @param compFamilia
     */
    public void setCompFamilia(gov.dlf.webservice.certpan.endpoint.MiembroFamilia[] compFamilia) {
        this.compFamilia = compFamilia;
    }

    public gov.dlf.webservice.certpan.endpoint.MiembroFamilia getCompFamilia(int i) {
        return this.compFamilia[i];
    }

    public void setCompFamilia(int i, gov.dlf.webservice.certpan.endpoint.MiembroFamilia _value) {
        this.compFamilia[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Certificacion)) return false;
        Certificacion other = (Certificacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ID == other.getID() &&
            this.statusCode == other.getStatusCode() &&
            this.beneficiary == other.getBeneficiary() &&
            this.socialSecurity == other.getSocialSecurity() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.lastName2==null && other.getLastName2()==null) || 
             (this.lastName2!=null &&
              this.lastName2.equals(other.getLastName2()))) &&
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              this.address1.equals(other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              this.address2.equals(other.getAddress2()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
            ((this.zipCode4==null && other.getZipCode4()==null) || 
             (this.zipCode4!=null &&
              this.zipCode4.equals(other.getZipCode4()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.services==null && other.getServices()==null) || 
             (this.services!=null &&
              this.services.equals(other.getServices()))) &&
            ((this.amounts==null && other.getAmounts()==null) || 
             (this.amounts!=null &&
              this.amounts.equals(other.getAmounts()))) &&
            ((this.income==null && other.getIncome()==null) || 
             (this.income!=null &&
              this.income.equals(other.getIncome()))) &&
            this.partPan == other.getPartPan() &&
            this.partTanf == other.getPartTanf() &&
            this.compFamily == other.getCompFamily() &&
            this.RMO == other.getRMO() &&
            ((this.CSI==null && other.getCSI()==null) || 
             (this.CSI!=null &&
              this.CSI.equals(other.getCSI()))) &&
            ((this.fechaSolicitudCertificado==null && other.getFechaSolicitudCertificado()==null) || 
             (this.fechaSolicitudCertificado!=null &&
              this.fechaSolicitudCertificado.equals(other.getFechaSolicitudCertificado()))) &&
            ((this.fechaExpiraCertificado==null && other.getFechaExpiraCertificado()==null) || 
             (this.fechaExpiraCertificado!=null &&
              this.fechaExpiraCertificado.equals(other.getFechaExpiraCertificado()))) &&
            this.ingreso == other.getIngreso() &&
            this.ingresoT == other.getIngresoT() &&
            this.otrosingresopan == other.getOtrosingresopan() &&
            this.otrosingresopae == other.getOtrosingresopae() &&
            this.cant_recae == other.getCant_recae() &&
            this.cant_recpan == other.getCant_recpan() &&
            ((this.compFamilia==null && other.getCompFamilia()==null) || 
             (this.compFamilia!=null &&
              java.util.Arrays.equals(this.compFamilia, other.getCompFamilia())));
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
        _hashCode += new Long(getID()).hashCode();
        _hashCode += getStatusCode();
        _hashCode += getBeneficiary();
        _hashCode += getSocialSecurity();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getLastName2() != null) {
            _hashCode += getLastName2().hashCode();
        }
        if (getAddress1() != null) {
            _hashCode += getAddress1().hashCode();
        }
        if (getAddress2() != null) {
            _hashCode += getAddress2().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        if (getZipCode4() != null) {
            _hashCode += getZipCode4().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getServices() != null) {
            _hashCode += getServices().hashCode();
        }
        if (getAmounts() != null) {
            _hashCode += getAmounts().hashCode();
        }
        if (getIncome() != null) {
            _hashCode += getIncome().hashCode();
        }
        _hashCode += getPartPan();
        _hashCode += getPartTanf();
        _hashCode += getCompFamily();
        _hashCode += getRMO();
        if (getCSI() != null) {
            _hashCode += getCSI().hashCode();
        }
        if (getFechaSolicitudCertificado() != null) {
            _hashCode += getFechaSolicitudCertificado().hashCode();
        }
        if (getFechaExpiraCertificado() != null) {
            _hashCode += getFechaExpiraCertificado().hashCode();
        }
        _hashCode += getIngreso();
        _hashCode += getIngresoT();
        _hashCode += getOtrosingresopan();
        _hashCode += getOtrosingresopae();
        _hashCode += getCant_recae();
        _hashCode += getCant_recpan();
        if (getCompFamilia() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompFamilia());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompFamilia(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Certificacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://endpoint.certpan.webservice.dlf.gov/", "Certificacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beneficiary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Beneficiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("socialSecurity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SocialSecurity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastName2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZipCode4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("services");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Services"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://endpoint.certpan.webservice.dlf.gov/", "Service"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Amounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://endpoint.certpan.webservice.dlf.gov/", "Amount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("income");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Income"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partPan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PartPan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partTanf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PartTanf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compFamily");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CompFamily"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RMO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CSI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaSolicitudCertificado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FechaSolicitudCertificado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaExpiraCertificado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FechaExpiraCertificado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingreso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Ingreso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingresoT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IngresoT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otrosingresopan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Otrosingresopan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otrosingresopae");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Otrosingresopae"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cant_recae");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Cant_recae"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cant_recpan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Cant_recpan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compFamilia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CompFamilia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://endpoint.certpan.webservice.dlf.gov/", "MiembroFamilia"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
