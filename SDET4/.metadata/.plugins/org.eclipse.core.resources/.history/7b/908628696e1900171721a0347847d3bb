package com.fannie.soap.timeserver;

public class ITimeServerProxy implements com.fannie.soap.timeserver.ITimeServer {
  private String _endpoint = null;
  private com.fannie.soap.timeserver.ITimeServer iTimeServer = null;
  
  public ITimeServerProxy() {
    _initITimeServerProxy();
  }
  
  public ITimeServerProxy(String endpoint) {
    _endpoint = endpoint;
    _initITimeServerProxy();
  }
  
  private void _initITimeServerProxy() {
    try {
      iTimeServer = (new timeserver.fannie.TimeServerServiceLocator()).getTimeServerPort();
      if (iTimeServer != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iTimeServer)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iTimeServer)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iTimeServer != null)
      ((javax.xml.rpc.Stub)iTimeServer)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.fannie.soap.timeserver.ITimeServer getITimeServer() {
    if (iTimeServer == null)
      _initITimeServerProxy();
    return iTimeServer;
  }
  
  public java.lang.String getAddress() throws java.rmi.RemoteException{
    if (iTimeServer == null)
      _initITimeServerProxy();
    return iTimeServer.getAddress();
  }
  
  public java.lang.String checkCreditScore(java.lang.String arg0, int arg1) throws java.rmi.RemoteException{
    if (iTimeServer == null)
      _initITimeServerProxy();
    return iTimeServer.checkCreditScore(arg0, arg1);
  }
  
  public int getPrice(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (iTimeServer == null)
      _initITimeServerProxy();
    return iTimeServer.getPrice(arg0, arg1);
  }
  
  
}