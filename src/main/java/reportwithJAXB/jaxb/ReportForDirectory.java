//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.21 at 07:51:36 PM IDT 
//


package reportwithJAXB.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



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
 *         &lt;element name="nameOfDirectory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filesInDirectory">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="file">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="nameOfFile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ifSucceeded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="timeInMillis" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ifFailed">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ExceptionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ExceptionMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ExceptionStacktrace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
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
@XmlType(name = "", propOrder = {
    "nameOfDirectory",
    "filesInDirectory"
})
@XmlRootElement(name = "reportForDirectory")
public class ReportForDirectory {

    @XmlElement(required = true)
    protected String nameOfDirectory;
    @XmlElement(required = true)
    protected ReportForDirectory.FilesInDirectory filesInDirectory;

    /**
     * Gets the value of the nameOfDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfDirectory() {
        return nameOfDirectory;
    }

    /**
     * Sets the value of the nameOfDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfDirectory(String value) {
        this.nameOfDirectory = value;
    }

    /**
     * Gets the value of the filesInDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link ReportForDirectory.FilesInDirectory }
     *     
     */
    public ReportForDirectory.FilesInDirectory getFilesInDirectory() {
        return filesInDirectory;
    }

    /**
     * Sets the value of the filesInDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportForDirectory.FilesInDirectory }
     *     
     */
    public void setFilesInDirectory(ReportForDirectory.FilesInDirectory value) {
        this.filesInDirectory = value;
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
     *         &lt;element name="file">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="nameOfFile" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ifSucceeded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="timeInMillis" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ifFailed">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ExceptionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ExceptionMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ExceptionStacktrace" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
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
    @XmlType(name = "", propOrder = {
        "file"
    })
    public static class FilesInDirectory {

        @XmlElement(name = "file")
        protected List<ReportForDirectory.FilesInDirectory.File> file =null;

        /**
         * Gets the value of the file property.
         * 
         * @return
         *     possible object is
         *     {@link ReportForDirectory.FilesInDirectory.File }
         *     
         */
        public List<ReportForDirectory.FilesInDirectory.File> getFiles() {
            return file;
        }

        /**
         * Sets the value of the file property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportForDirectory.FilesInDirectory.File }
         *     
         */
        public void setFiles(List<ReportForDirectory.FilesInDirectory.File> value) {
            this.file = value;
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
         *         &lt;element name="nameOfFile" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ifSucceeded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="timeInMillis" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ifFailed">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ExceptionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ExceptionMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ExceptionStacktrace" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        @XmlType(name = "", propOrder = {
            "nameOfFile",
            "action",
            "status",
            "ifSucceeded",
            "ifFailed"
        })
        public static class File {

            @XmlElement(required = true)
            protected String nameOfFile;
            @XmlElement(name = "Action", required = true)
            protected String action;
            @XmlElement(required = true)
            protected String status;
            @XmlElement(required = true)
            protected ReportForDirectory.FilesInDirectory.File.IfSucceeded ifSucceeded;
            @XmlElement(required = true)
            protected ReportForDirectory.FilesInDirectory.File.IfFailed ifFailed;

            /**
             * Gets the value of the nameOfFile property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNameOfFile() {
                return nameOfFile;
            }

            /**
             * Sets the value of the nameOfFile property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNameOfFile(String value) {
                this.nameOfFile = value;
            }

            /**
             * Gets the value of the action property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAction() {
                return action;
            }

            /**
             * Sets the value of the action property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAction(String value) {
                this.action = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

            /**
             * Gets the value of the ifSucceeded property.
             * 
             * @return
             *     possible object is
             *     {@link ReportForDirectory.FilesInDirectory.File.IfSucceeded }
             *     
             */
            public ReportForDirectory.FilesInDirectory.File.IfSucceeded getIfSucceeded() {
                return ifSucceeded;
            }

            /**
             * Sets the value of the ifSucceeded property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportForDirectory.FilesInDirectory.File.IfSucceeded }
             *     
             */
            public void setIfSucceeded(ReportForDirectory.FilesInDirectory.File.IfSucceeded value) {
                this.ifSucceeded = value;
            }

            /**
             * Gets the value of the ifFailed property.
             * 
             * @return
             *     possible object is
             *     {@link ReportForDirectory.FilesInDirectory.File.IfFailed }
             *     
             */
            public ReportForDirectory.FilesInDirectory.File.IfFailed getIfFailed() {
                return ifFailed;
            }

            /**
             * Sets the value of the ifFailed property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportForDirectory.FilesInDirectory.File.IfFailed }
             *     
             */
            public void setIfFailed(ReportForDirectory.FilesInDirectory.File.IfFailed value) {
                this.ifFailed = value;
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
             *         &lt;element name="ExceptionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ExceptionMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ExceptionStacktrace" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "exceptionName",
                "exceptionMessage",
                "exceptionStacktrace"
            })
            public static class IfFailed {

                @XmlElement(name = "ExceptionName", required = true)
                protected String exceptionName;
                @XmlElement(name = "ExceptionMessage", required = true)
                protected String exceptionMessage;
                @XmlElement(name = "ExceptionStacktrace", required = true)
                protected String exceptionStacktrace;

                /**
                 * Gets the value of the exceptionName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExceptionName() {
                    return exceptionName;
                }

                /**
                 * Sets the value of the exceptionName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExceptionName(String value) {
                    this.exceptionName = value;
                }

                /**
                 * Gets the value of the exceptionMessage property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExceptionMessage() {
                    return exceptionMessage;
                }

                /**
                 * Sets the value of the exceptionMessage property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExceptionMessage(String value) {
                    this.exceptionMessage = value;
                }

                /**
                 * Gets the value of the exceptionStacktrace property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExceptionStacktrace() {
                    return exceptionStacktrace;
                }

                /**
                 * Sets the value of the exceptionStacktrace property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExceptionStacktrace(String value) {
                    this.exceptionStacktrace = value;
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
             *         &lt;element name="timeInMillis" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
                "timeInMillis"
            })
            public static class IfSucceeded {

                protected long timeInMillis;

                /**
                 * Gets the value of the timeInMillis property.
                 * 
                 */
                public long getTimeInMillis() {
                    return timeInMillis;
                }

                /**
                 * Sets the value of the timeInMillis property.
                 * 
                 */
                public void setTimeInMillis(long value) {
                    this.timeInMillis = value;
                }

            }

        }

    }

}
