/**
 * InputManifestIPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.phy.manifest.webservices;

public interface InputManifestIPortType extends java.rmi.Remote {
    public String queryContaStatus(String in0, String in1, String in2, String in3, String in4) throws java.rmi.RemoteException;
    public String inPutMf(String in0) throws java.rmi.RemoteException;
    public String queryMfStatus(String in0, String in1, String in2, String in3, String in4, String in5) throws java.rmi.RemoteException;
    public String queryIFT(String in0, String in1, String in2, String in3) throws java.rmi.RemoteException;
}
