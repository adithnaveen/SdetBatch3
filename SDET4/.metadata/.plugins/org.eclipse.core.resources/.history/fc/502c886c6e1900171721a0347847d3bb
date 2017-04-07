/**
 * TimeServerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package timeserver.fannie;

public class TimeServerServiceLocator extends org.apache.axis.client.Service implements timeserver.fannie.TimeServerService {

    public TimeServerServiceLocator() {
    }


    public TimeServerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TimeServerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TimeServerPort
    private java.lang.String TimeServerPort_address = "http://127.0.0.1:9876/fannie";

    public java.lang.String getTimeServerPortAddress() {
        return TimeServerPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TimeServerPortWSDDServiceName = "TimeServerPort";

    public java.lang.String getTimeServerPortWSDDServiceName() {
        return TimeServerPortWSDDServiceName;
    }

    public void setTimeServerPortWSDDServiceName(java.lang.String name) {
        TimeServerPortWSDDServiceName = name;
    }

    public com.fannie.soap.timeserver.ITimeServer getTimeServerPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TimeServerPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTimeServerPort(endpoint);
    }

    public com.fannie.soap.timeserver.ITimeServer getTimeServerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            timeserver.fannie.TimeServerPortBindingStub _stub = new timeserver.fannie.TimeServerPortBindingStub(portAddress, this);
            _stub.setPortName(getTimeServerPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTimeServerPortEndpointAddress(java.lang.String address) {
        TimeServerPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.fannie.soap.timeserver.ITimeServer.class.isAssignableFrom(serviceEndpointInterface)) {
                timeserver.fannie.TimeServerPortBindingStub _stub = new timeserver.fannie.TimeServerPortBindingStub(new java.net.URL(TimeServerPort_address), this);
                _stub.setPortName(getTimeServerPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
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
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TimeServerPort".equals(inputPortName)) {
            return getTimeServerPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:fannie.timeserver/ws", "TimeServerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:fannie.timeserver/ws", "TimeServerPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TimeServerPort".equals(portName)) {
            setTimeServerPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
