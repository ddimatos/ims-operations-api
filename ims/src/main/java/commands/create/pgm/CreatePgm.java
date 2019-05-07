
/**
* This program and the accompanying materials are made available under the terms of the
* Eclipse Public License v2.0 which accompanies this distribution, and is available at
* https://www.eclipse.org/legal/epl-v20.html
*
* SPDX-License-Identifier: EPL-2.0
*
* Copyright IBM Corporation 2019
*/

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.04 at 10:33:16 PM PST 
//


package commands.create.pgm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreatePgm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreatePgm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NAME" type="{commands/create/pgm}nameOptions" maxOccurs="unbounded"/>
 *         &lt;element name="LIKE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="DESC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="RSC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SET" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BMPTYPE" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Y"/>
 *                         &lt;enumeration value="N"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DOPT" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Y"/>
 *                         &lt;enumeration value="N"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FP" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="E"/>
 *                         &lt;enumeration value="N"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="GPSB" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Y"/>
 *                         &lt;enumeration value="N"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="LANG" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="ASSEM"/>
 *                         &lt;enumeration value="COBOL"/>
 *                         &lt;enumeration value="JAVA"/>
 *                         &lt;enumeration value="PASCAL"/>
 *                         &lt;enumeration value="PLI"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="RESIDENT" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="N"/>
 *                         &lt;enumeration value="Y"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SCHDTYPE" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="PARALLEL"/>
 *                         &lt;enumeration value="SERIAL"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TRANSTAT" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="N"/>
 *                         &lt;enumeration value="Y"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreatePgm", propOrder = {
    "name",
    "like",
    "set"
})
public class CreatePgm {

    @XmlElement(name = "NAME", required = true)
    protected List<String> name;
    @XmlElement(name = "LIKE")
    protected CreatePgm.LIKE like;
    @XmlElement(name = "SET")
    protected CreatePgm.SET set;

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNAME().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNAME() {
        if (name == null) {
            name = new ArrayList<String>();
        }
        return this.name;
    }

    /**
     * Gets the value of the like property.
     * 
     * @return
     *     possible object is
     *     {@link CreatePgm.LIKE }
     *     
     */
    public CreatePgm.LIKE getLIKE() {
        return like;
    }

    /**
     * Sets the value of the like property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreatePgm.LIKE }
     *     
     */
    public void setLIKE(CreatePgm.LIKE value) {
        this.like = value;
    }

    /**
     * Gets the value of the set property.
     * 
     * @return
     *     possible object is
     *     {@link CreatePgm.SET }
     *     
     */
    public CreatePgm.SET getSET() {
        return set;
    }

    /**
     * Sets the value of the set property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreatePgm.SET }
     *     
     */
    public void setSET(CreatePgm.SET value) {
        this.set = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="DESC" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="RSC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "desc",
        "rsc"
    })
    public static class LIKE {

        @XmlElement(name = "DESC")
        protected String desc;
        @XmlElement(name = "RSC")
        protected String rsc;

        /**
         * Gets the value of the desc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESC() {
            return desc;
        }

        /**
         * Sets the value of the desc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESC(String value) {
            this.desc = value;
        }

        /**
         * Gets the value of the rsc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRSC() {
            return rsc;
        }

        /**
         * Sets the value of the rsc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRSC(String value) {
            this.rsc = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="BMPTYPE" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Y"/>
     *               &lt;enumeration value="N"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DOPT" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Y"/>
     *               &lt;enumeration value="N"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FP" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="E"/>
     *               &lt;enumeration value="N"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="GPSB" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Y"/>
     *               &lt;enumeration value="N"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="LANG" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="ASSEM"/>
     *               &lt;enumeration value="COBOL"/>
     *               &lt;enumeration value="JAVA"/>
     *               &lt;enumeration value="PASCAL"/>
     *               &lt;enumeration value="PLI"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="RESIDENT" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="N"/>
     *               &lt;enumeration value="Y"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="SCHDTYPE" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="PARALLEL"/>
     *               &lt;enumeration value="SERIAL"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TRANSTAT" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="N"/>
     *               &lt;enumeration value="Y"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bmptype",
        "dopt",
        "fp",
        "gpsb",
        "lang",
        "resident",
        "schdtype",
        "transtat"
    })
    public static class SET {

        @XmlElement(name = "BMPTYPE")
        protected CreatePgm.SET.BmptypeOptions bmptype;
        @XmlElement(name = "DOPT")
        protected CreatePgm.SET.DoptOptions dopt;
        @XmlElement(name = "FP")
        protected CreatePgm.SET.FpOptions fp;
        @XmlElement(name = "GPSB")
        protected CreatePgm.SET.GpsbOptions gpsb;
        @XmlElement(name = "LANG")
        protected CreatePgm.SET.LangOptions lang;
        @XmlElement(name = "RESIDENT")
        protected CreatePgm.SET.ResidentOptions resident;
        @XmlElement(name = "SCHDTYPE")
        protected CreatePgm.SET.SchdtypeOptions schdtype;
        @XmlElement(name = "TRANSTAT")
        protected CreatePgm.SET.TranstatOptions transtat;

        /**
         * Gets the value of the bmptype property.
         * 
         * @return
         *     possible object is
         *     {@link CreatePgm.SET.BmptypeOptions }
         *     
         */
        public CreatePgm.SET.BmptypeOptions getBMPTYPE() {
            return bmptype;
        }

        /**
         * Sets the value of the bmptype property.
         * 
         * @param value
         *     allowed object is
         *     {@link CreatePgm.SET.BmptypeOptions }
         *     
         */
        public void setBMPTYPE(CreatePgm.SET.BmptypeOptions value) {
            this.bmptype = value;
        }

        /**
         * Gets the value of the dopt property.
         * 
         * @return
         *     possible object is
         *     {@link CreatePgm.SET.DoptOptions }
         *     
         */
        public CreatePgm.SET.DoptOptions getDOPT() {
            return dopt;
        }

        /**
         * Sets the value of the dopt property.
         * 
         * @param value
         *     allowed object is
         *     {@link CreatePgm.SET.DoptOptions }
         *     
         */
        public void setDOPT(CreatePgm.SET.DoptOptions value) {
            this.dopt = value;
        }

        /**
         * Gets the value of the fp property.
         * 
         * @return
         *     possible object is
         *     {@link CreatePgm.SET.FpOptions }
         *     
         */
        public CreatePgm.SET.FpOptions getFP() {
            return fp;
        }

        /**
         * Sets the value of the fp property.
         * 
         * @param value
         *     allowed object is
         *     {@link CreatePgm.SET.FpOptions }
         *     
         */
        public void setFP(CreatePgm.SET.FpOptions value) {
            this.fp = value;
        }

        /**
         * Gets the value of the gpsb property.
         * 
         * @return
         *     possible object is
         *     {@link CreatePgm.SET.GpsbOptions }
         *     
         */
        public CreatePgm.SET.GpsbOptions getGPSB() {
            return gpsb;
        }

        /**
         * Sets the value of the gpsb property.
         * 
         * @param value
         *     allowed object is
         *     {@link CreatePgm.SET.GpsbOptions }
         *     
         */
        public void setGPSB(CreatePgm.SET.GpsbOptions value) {
            this.gpsb = value;
        }

        /**
         * Gets the value of the lang property.
         * 
         * @return
         *     possible object is
         *     {@link CreatePgm.SET.LangOptions }
         *     
         */
        public CreatePgm.SET.LangOptions getLANG() {
            return lang;
        }

        /**
         * Sets the value of the lang property.
         * 
         * @param value
         *     allowed object is
         *     {@link CreatePgm.SET.LangOptions }
         *     
         */
        public void setLANG(CreatePgm.SET.LangOptions value) {
            this.lang = value;
        }

        /**
         * Gets the value of the resident property.
         * 
         * @return
         *     possible object is
         *     {@link CreatePgm.SET.ResidentOptions }
         *     
         */
        public CreatePgm.SET.ResidentOptions getRESIDENT() {
            return resident;
        }

        /**
         * Sets the value of the resident property.
         * 
         * @param value
         *     allowed object is
         *     {@link CreatePgm.SET.ResidentOptions }
         *     
         */
        public void setRESIDENT(CreatePgm.SET.ResidentOptions value) {
            this.resident = value;
        }

        /**
         * Gets the value of the schdtype property.
         * 
         * @return
         *     possible object is
         *     {@link CreatePgm.SET.SchdtypeOptions }
         *     
         */
        public CreatePgm.SET.SchdtypeOptions getSCHDTYPE() {
            return schdtype;
        }

        /**
         * Sets the value of the schdtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link CreatePgm.SET.SchdtypeOptions }
         *     
         */
        public void setSCHDTYPE(CreatePgm.SET.SchdtypeOptions value) {
            this.schdtype = value;
        }

        /**
         * Gets the value of the transtat property.
         * 
         * @return
         *     possible object is
         *     {@link CreatePgm.SET.TranstatOptions }
         *     
         */
        public CreatePgm.SET.TranstatOptions getTRANSTAT() {
            return transtat;
        }

        /**
         * Sets the value of the transtat property.
         * 
         * @param value
         *     allowed object is
         *     {@link CreatePgm.SET.TranstatOptions }
         *     
         */
        public void setTRANSTAT(CreatePgm.SET.TranstatOptions value) {
            this.transtat = value;
        }


        /**
         * <p>Java class for null.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;simpleType>
         *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *     &lt;enumeration value="Y"/>
         *     &lt;enumeration value="N"/>
         *   &lt;/restriction>
         * &lt;/simpleType>
         * </pre>
         * 
         */
        @XmlType(name = "")
        @XmlEnum
        public enum BmptypeOptions {

            Y,
            N;

            public String value() {
                return name();
            }

            public static CreatePgm.SET.BmptypeOptions fromValue(String v) {
                return valueOf(v);
            }

        }


        /**
         * <p>Java class for null.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;simpleType>
         *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *     &lt;enumeration value="Y"/>
         *     &lt;enumeration value="N"/>
         *   &lt;/restriction>
         * &lt;/simpleType>
         * </pre>
         * 
         */
        @XmlType(name = "")
        @XmlEnum
        public enum DoptOptions {

            Y,
            N;

            public String value() {
                return name();
            }

            public static CreatePgm.SET.DoptOptions fromValue(String v) {
                return valueOf(v);
            }

        }


        /**
         * <p>Java class for null.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;simpleType>
         *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *     &lt;enumeration value="E"/>
         *     &lt;enumeration value="N"/>
         *   &lt;/restriction>
         * &lt;/simpleType>
         * </pre>
         * 
         */
        @XmlType(name = "")
        @XmlEnum
        public enum FpOptions {

            E,
            N;

            public String value() {
                return name();
            }

            public static CreatePgm.SET.FpOptions fromValue(String v) {
                return valueOf(v);
            }

        }


        /**
         * <p>Java class for null.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;simpleType>
         *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *     &lt;enumeration value="Y"/>
         *     &lt;enumeration value="N"/>
         *   &lt;/restriction>
         * &lt;/simpleType>
         * </pre>
         * 
         */
        @XmlType(name = "")
        @XmlEnum
        public enum GpsbOptions {

            Y,
            N;

            public String value() {
                return name();
            }

            public static CreatePgm.SET.GpsbOptions fromValue(String v) {
                return valueOf(v);
            }

        }


        /**
         * <p>Java class for null.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;simpleType>
         *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *     &lt;enumeration value="ASSEM"/>
         *     &lt;enumeration value="COBOL"/>
         *     &lt;enumeration value="JAVA"/>
         *     &lt;enumeration value="PASCAL"/>
         *     &lt;enumeration value="PLI"/>
         *   &lt;/restriction>
         * &lt;/simpleType>
         * </pre>
         * 
         */
        @XmlType(name = "")
        @XmlEnum
        public enum LangOptions {

            ASSEM,
            COBOL,
            JAVA,
            PASCAL,
            PLI;

            public String value() {
                return name();
            }

            public static CreatePgm.SET.LangOptions fromValue(String v) {
                return valueOf(v);
            }

        }


        /**
         * <p>Java class for null.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;simpleType>
         *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *     &lt;enumeration value="N"/>
         *     &lt;enumeration value="Y"/>
         *   &lt;/restriction>
         * &lt;/simpleType>
         * </pre>
         * 
         */
        @XmlType(name = "")
        @XmlEnum
        public enum ResidentOptions {

            N,
            Y;

            public String value() {
                return name();
            }

            public static CreatePgm.SET.ResidentOptions fromValue(String v) {
                return valueOf(v);
            }

        }


        /**
         * <p>Java class for null.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;simpleType>
         *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *     &lt;enumeration value="PARALLEL"/>
         *     &lt;enumeration value="SERIAL"/>
         *   &lt;/restriction>
         * &lt;/simpleType>
         * </pre>
         * 
         */
        @XmlType(name = "")
        @XmlEnum
        public enum SchdtypeOptions {

            PARALLEL,
            SERIAL;

            public String value() {
                return name();
            }

            public static CreatePgm.SET.SchdtypeOptions fromValue(String v) {
                return valueOf(v);
            }

        }


        /**
         * <p>Java class for null.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;simpleType>
         *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *     &lt;enumeration value="N"/>
         *     &lt;enumeration value="Y"/>
         *   &lt;/restriction>
         * &lt;/simpleType>
         * </pre>
         * 
         */
        @XmlType(name = "")
        @XmlEnum
        public enum TranstatOptions {

            N,
            Y;

            public String value() {
                return name();
            }

            public static CreatePgm.SET.TranstatOptions fromValue(String v) {
                return valueOf(v);
            }

        }

    }

}
