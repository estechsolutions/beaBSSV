package be.e1.bssv.J560201.proxy;

/**
 * Generated class, do not edit.
 *
 * This service class was generated by weblogic
 * webservice stub gen on Mon Nov 05 16:22:30 EST 2012 */

public class Processapprovalgateway_Client_Ep_Impl     extends weblogic.wsee.jaxrpc.ServiceImpl
     implements be.e1.bssv.J560201.proxy.Processapprovalgateway_Client_Ep {

  public Processapprovalgateway_Client_Ep_Impl() throws javax.xml.rpc.ServiceException {
    this("be/e1/bssv/J560201/proxy/Processapprovalgateway_Client_Ep_saved_wsdl.wsdl", null);
  }
  
  public Processapprovalgateway_Client_Ep_Impl(String wsdlurl) throws javax.xml.rpc.ServiceException {
    this(wsdlurl, null);
  }
  
  public Processapprovalgateway_Client_Ep_Impl(String wsdlurl, weblogic.wsee.connection.transport.TransportInfo transportInfo) throws javax.xml.rpc.ServiceException {
    super(wsdlurl,
          new javax.xml.namespace.QName("http://xmlns.oracle.com/ApprovalGatewayManager/ApprovalGateway/ProcessApprovalGateway", "processapprovalgateway_client_ep"),
          "be/e1/bssv/J560201/proxy/Processapprovalgateway_Client_Ep_internaldd.xml", transportInfo);
  }
  
  //***********************************
  // Port Name: ProcessApprovalGateway_Pt 
  // Port Type: ProcessApprovalGateway 
  //***********************************

  be.e1.bssv.J560201.proxy.ProcessApprovalGateway mvar_ProcessApprovalGateway_Pt;

  /**
   * returns ProcessApprovalGateway_Pt port in this service 
   */
  public be.e1.bssv.J560201.proxy.ProcessApprovalGateway getProcessApprovalGateway_Pt() 
    throws javax.xml.rpc.ServiceException
  {

    if (mvar_ProcessApprovalGateway_Pt == null) {
      mvar_ProcessApprovalGateway_Pt =
        new be.e1.bssv.J560201.proxy.ProcessApprovalGateway_Stub(_getPort("ProcessApprovalGateway_pt"), this);
    }

    if (transportInfo != null && 
        transportInfo instanceof weblogic.wsee.connection.transport.http.HttpTransportInfo) {
      ((javax.xml.rpc.Stub)mvar_ProcessApprovalGateway_Pt)._setProperty(
        "weblogic.wsee.connection.transportinfo", 
        (weblogic.wsee.connection.transport.http.HttpTransportInfo)transportInfo);
    }
    
    return mvar_ProcessApprovalGateway_Pt;
  }

  /**
   * @Deprecated  Use getProcessApprovalGateway_Pt(byte[] username, byte[] password)
   */
  public be.e1.bssv.J560201.proxy.ProcessApprovalGateway getProcessApprovalGateway_Pt(String username, String password) 
    throws javax.xml.rpc.ServiceException
  {
    if (username != null & password != null) {
      weblogic.wsee.connection.transport.http.HttpTransportInfo httpInfo = 
        new weblogic.wsee.connection.transport.http.HttpTransportInfo();
      httpInfo.setUsername(username.getBytes());
      httpInfo.setPassword(password.getBytes());
      transportInfo = httpInfo;
    }
    return getProcessApprovalGateway_Pt();
  }

  public be.e1.bssv.J560201.proxy.ProcessApprovalGateway getProcessApprovalGateway_Pt(byte[] username, byte[] password) 
    throws javax.xml.rpc.ServiceException
  {
    if (username != null & password != null) {
      weblogic.wsee.connection.transport.http.HttpTransportInfo httpInfo = 
        new weblogic.wsee.connection.transport.http.HttpTransportInfo();
      httpInfo.setUsername(username);
      httpInfo.setPassword(password);
      transportInfo = httpInfo;
    }
    return getProcessApprovalGateway_Pt();
  }
  
      public be.e1.bssv.J560201.proxy.ProcessApprovalGateway getProcessApprovalGateway_Pt(
    java.io.InputStream policyInputStream) 
    throws javax.xml.rpc.ServiceException
  {
    _loadPolicy("ProcessApprovalGateway_pt", policyInputStream, true, true);
    return getProcessApprovalGateway_Pt();
  }

  public be.e1.bssv.J560201.proxy.ProcessApprovalGateway getProcessApprovalGateway_Pt(
    java.io.InputStream policyInputStream, 
    boolean inbound, 
    boolean outbound) 
    throws javax.xml.rpc.ServiceException
  {
    _loadPolicy("ProcessApprovalGateway_pt", policyInputStream, inbound, outbound);
    return getProcessApprovalGateway_Pt();
  }
 
  public be.e1.bssv.J560201.proxy.ProcessApprovalGateway getProcessApprovalGateway_Pt(
    java.io.InputStream[] inboundPolicies, 
    java.io.InputStream[] outboundPolicies) 
    throws javax.xml.rpc.ServiceException
  {
    _loadPolicy("ProcessApprovalGateway_pt", null, inboundPolicies, outboundPolicies);
    return getProcessApprovalGateway_Pt();
  }
  
  public be.e1.bssv.J560201.proxy.ProcessApprovalGateway getProcessApprovalGateway_Pt(
    java.util.Set<java.io.InputStream> inboundPolicies, 
    java.util.Set<java.io.InputStream> outboundPolicies) 
    throws javax.xml.rpc.ServiceException
  {
    _loadPolicy("ProcessApprovalGateway_pt", null, inboundPolicies, outboundPolicies);
    return getProcessApprovalGateway_Pt();
  }
  
  public be.e1.bssv.J560201.proxy.ProcessApprovalGateway getProcessApprovalGateway_Pt(
    String operationName,
    java.io.InputStream[] inboundPolicies, 
    java.io.InputStream[] outboundPolicies) 
    throws javax.xml.rpc.ServiceException
  {
    _loadPolicy("ProcessApprovalGateway_pt", operationName, inboundPolicies, outboundPolicies);
    return getProcessApprovalGateway_Pt();
  }
  
  public be.e1.bssv.J560201.proxy.ProcessApprovalGateway getProcessApprovalGateway_Pt(
    String operationName,
    java.util.Set<java.io.InputStream> inboundPolicies, 
    java.util.Set<java.io.InputStream> outboundPolicies) 
    throws javax.xml.rpc.ServiceException
  {
    _loadPolicy("ProcessApprovalGateway_pt", operationName, inboundPolicies, outboundPolicies);
    return getProcessApprovalGateway_Pt();
  }
    
}