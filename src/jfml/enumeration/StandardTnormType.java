package jfml.enumeration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for standardTnormType.
 * 
 * <pre>
 * &lt;simpleType name="standardTnormType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MIN"/>
 *     &lt;enumeration value="PROD"/>
 *     &lt;enumeration value="BSUM"/>
 *     &lt;enumeration value="DRS"/>
 *     &lt;enumeration value="EPROD"/>
 *     &lt;enumeration value="HPROD"/>
 *     &lt;enumeration value="NILMIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * 
 * 	 * 	- MIN for implementing the operator and with the minimum as defined from Equation (A.14);
		- PROD for implementing the operator and with the product as defined from Equation (A.15);
		- BDIF for implementing the operator and with bounded difference as defined from Equation (A.16);
		- DRP for implementing the operator and with the drastic product as defined from Equation (A.17);
		- EPROD for implementing the operator and with the Einstein product as defined from Equation (A.18);
		- HPROD for implementing the operator and with the Hamacher product as defined from Equation (A.19);
		- NILMIN for implementing the operator and with the Nilpotent minimum as defined from Equation (A.20); 
 */
@XmlType(name = "standardTnormType")
@XmlEnum
public enum StandardTnormType {

    MIN,
    PROD,
    BSUM,
    DRS,
    EPROD,
    HPROD,
    NILMIN;

    public String value() {
        return name();
    }

    public static StandardTnormType fromValue(String v) {
        return valueOf(v);
    }

}