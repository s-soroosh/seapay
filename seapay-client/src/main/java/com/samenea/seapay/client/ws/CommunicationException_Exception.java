
package com.samenea.seapay.client.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "CommunicationException", targetNamespace = "http://transaction.seapay.samenea.com/")
public class CommunicationException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private CommunicationException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public CommunicationException_Exception(String message, CommunicationException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public CommunicationException_Exception(String message, CommunicationException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.samenea.seapay.client.ws.CommunicationException
     */
    public CommunicationException getFaultInfo() {
        return faultInfo;
    }

}