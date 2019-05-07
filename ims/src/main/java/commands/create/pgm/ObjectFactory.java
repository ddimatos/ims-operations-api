
/**
* This program and the accompanying materials are made available under the terms of the
* Eclipse Public License v2.0 which accompanies this distribution, and is available at
* https://www.eclipse.org/legal/epl-v20.html
*
* SPDX-License-Identifier: EPL-2.0
*
* Copyright IBM Corporation 2019
*/


// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.04 at 10:33:16 PM PST 
//


package commands.create.pgm;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the commands.create.pgm package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: commands.create.pgm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreatePgm }
     * 
     */
    public CreatePgm createCreatePgm() {
        return new CreatePgm();
    }

    /**
     * Create an instance of {@link CreatePgm.SET }
     * 
     */
    public CreatePgm.SET createCreatePgmSET() {
        return new CreatePgm.SET();
    }

    /**
     * Create an instance of {@link CreatePgm.LIKE }
     * 
     */
    public CreatePgm.LIKE createCreatePgmLIKE() {
        return new CreatePgm.LIKE();
    }

}
