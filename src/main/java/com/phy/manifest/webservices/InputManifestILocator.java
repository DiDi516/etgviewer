/**
 * InputManifestILocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.phy.manifest.webservices;

public class InputManifestILocator extends org.apache.axis.client.Service implements InputManifestI {

    public InputManifestILocator() {
    }


    public InputManifestILocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public InputManifestILocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for InputManifestIHttpPort
    private String InputManifestIHttpPort_address = "http://mf.szedi.com.cn/PhyWebServices/services/InputManifestI";

    public String getInputManifestIHttpPortAddress() {
        return InputManifestIHttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private String InputManifestIHttpPortWSDDServiceName = "InputManifestIHttpPort";

    public String getInputManifestIHttpPortWSDDServiceName() {
        return InputManifestIHttpPortWSDDServiceName;
    }

    public void setInputManifestIHttpPortWSDDServiceName(String name) {
        InputManifestIHttpPortWSDDServiceName = name;
    }

    public com.phy.manifest.webservices.InputManifestIPortType getInputManifestIHttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(InputManifestIHttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getInputManifestIHttpPort(endpoint);
    }

    public com.phy.manifest.webservices.InputManifestIPortType getInputManifestIHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.phy.manifest.webservices.InputManifestIHttpBindingStub _stub = new com.phy.manifest.webservices.InputManifestIHttpBindingStub(portAddress, this);
            _stub.setPortName(getInputManifestIHttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setInputManifestIHttpPortEndpointAddress(String address) {
        InputManifestIHttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.phy.manifest.webservices.InputManifestIPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.phy.manifest.webservices.InputManifestIHttpBindingStub _stub = new com.phy.manifest.webservices.InputManifestIHttpBindingStub(new java.net.URL(InputManifestIHttpPort_address), this);
                _stub.setPortName(getInputManifestIHttpPortWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("InputManifestIHttpPort".equals(inputPortName)) {
            return getInputManifestIHttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices.manifest.phy.com", "InputManifestI");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices.manifest.phy.com", "InputManifestIHttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("InputManifestIHttpPort".equals(portName)) {
            setInputManifestIHttpPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
