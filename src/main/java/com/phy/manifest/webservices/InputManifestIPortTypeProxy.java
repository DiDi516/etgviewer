package com.phy.manifest.webservices;

public class InputManifestIPortTypeProxy implements InputManifestIPortType {
  private String _endpoint = null;
  private InputManifestIPortType inputManifestIPortType = null;
  
  public InputManifestIPortTypeProxy() {
    _initInputManifestIPortTypeProxy();
  }
  
  public InputManifestIPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initInputManifestIPortTypeProxy();
  }
  
  private void _initInputManifestIPortTypeProxy() {
    try {
      inputManifestIPortType = (new InputManifestILocator()).getInputManifestIHttpPort();
      if (inputManifestIPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)inputManifestIPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)inputManifestIPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (inputManifestIPortType != null)
      ((javax.xml.rpc.Stub)inputManifestIPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public InputManifestIPortType getInputManifestIPortType() {
    if (inputManifestIPortType == null)
      _initInputManifestIPortTypeProxy();
    return inputManifestIPortType;
  }
  
  public String queryContaStatus(String in0, String in1, String in2, String in3, String in4) throws java.rmi.RemoteException{
    if (inputManifestIPortType == null)
      _initInputManifestIPortTypeProxy();
    return inputManifestIPortType.queryContaStatus(in0, in1, in2, in3, in4);
  }
  
  public String inPutMf(String in0) throws java.rmi.RemoteException{
    if (inputManifestIPortType == null)
      _initInputManifestIPortTypeProxy();
    return inputManifestIPortType.inPutMf(in0);
  }
  
  public String queryMfStatus(String in0, String in1, String in2, String in3, String in4, String in5) throws java.rmi.RemoteException{
    if (inputManifestIPortType == null)
      _initInputManifestIPortTypeProxy();
    return inputManifestIPortType.queryMfStatus(in0, in1, in2, in3, in4, in5);
  }
  
  public String queryIFT(String in0, String in1, String in2, String in3) throws java.rmi.RemoteException{
    if (inputManifestIPortType == null)
      _initInputManifestIPortTypeProxy();
    return inputManifestIPortType.queryIFT(in0, in1, in2, in3);
  }
  
  
}