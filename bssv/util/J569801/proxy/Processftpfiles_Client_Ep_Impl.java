package be.e1.bssv.util.J569801.proxy;

/**
 * Generated class, do not edit.
 *
 * This service class was generated by weblogic
 * webservice stub gen on Wed Dec 05 12:57:58 EST 2012 */

public class Processftpfiles_Client_Ep_Impl     extends weblogic.wsee.jaxrpc.ServiceImpl
     implements be.e1.bssv.util.J569801.proxy.Processftpfiles_Client_Ep {

  public Processftpfiles_Client_Ep_Impl() throws javax.xml.rpc.ServiceException {
    this("be/e1/bssv/util/J569801/proxy/Processftpfiles_Client_Ep_saved_wsdl.wsdl", null);
  }
  
  public Processftpfiles_Client_Ep_Impl(String wsdlurl) throws javax.xml.rpc.ServiceException {
    this(wsdlurl, null);
  }
  
  public Processftpfiles_Client_Ep_Impl(String wsdlurl, weblogic.wsee.connection.transport.TransportInfo transportInfo) throws javax.xml.rpc.ServiceException {
    super(wsdlurl,
          new javax.xml.namespace.QName("http://xmlns.oracle.com/FTPManager/FTPManager/ProcessFTPFiles", "processftpfiles_client_ep"),
          "be/e1/bssv/util/J569801/proxy/Processftpfiles_Client_Ep_internaldd.xml", transportInfo);
  }
  
  //***********************************
  // Port Name: ProcessFTPFiles_Pt 
  // Port Type: ProcessFTPFiles 
  //***********************************

  be.e1.bssv.util.J569801.proxy.ProcessFTPFiles mvar_ProcessFTPFiles_Pt;

  /**
   * returns ProcessFTPFiles_Pt port in this service 
   */
  public be.e1.bssv.util.J569801.proxy.ProcessFTPFiles getProcessFTPFiles_Pt() 
    throws javax.xml.rpc.ServiceException
  {

    if (mvar_ProcessFTPFiles_Pt == null) {
      mvar_ProcessFTPFiles_Pt =
        new be.e1.bssv.util.J569801.proxy.ProcessFTPFiles_Stub(_getPort("ProcessFTPFiles_pt"), this);
    }

    if (transportInfo != null && 
        transportInfo instanceof weblogic.wsee.connection.transport.http.HttpTransportInfo) {
      ((javax.xml.rpc.Stub)mvar_ProcessFTPFiles_Pt)._setProperty(
        "weblogic.wsee.connection.transportinfo", 
        (weblogic.wsee.connection.transport.http.HttpTransportInfo)transportInfo);
    }
    
    return mvar_ProcessFTPFiles_Pt;
  }

  /**
   * @Deprecated  Use getProcessFTPFiles_Pt(byte[] username, byte[] password)
   */
  public be.e1.bssv.util.J569801.proxy.ProcessFTPFiles getProcessFTPFiles_Pt(String username, String password) 
    throws javax.xml.rpc.ServiceException
  {
    if (username != null & password != null) {
      weblogic.wsee.connection.transport.http.HttpTransportInfo httpInfo = 
        new weblogic.wsee.connection.transport.http.HttpTransportInfo();
      httpInfo.setUsername(username.getBytes());
      httpInfo.setPassword(password.getBytes());
      transportInfo = httpInfo;
    }
    return getProcessFTPFiles_Pt();
  }

  public be.e1.bssv.util.J569801.proxy.ProcessFTPFiles getProcessFTPFiles_Pt(byte[] username, byte[] password) 
    throws javax.xml.rpc.ServiceException
  {
    if (username != null & password != null) {
      weblogic.wsee.connection.transport.http.HttpTransportInfo httpInfo = 
        new weblogic.wsee.connection.transport.http.HttpTransportInfo();
      httpInfo.setUsername(username);
      httpInfo.setPassword(password);
      transportInfo = httpInfo;
    }
    return getProcessFTPFiles_Pt();
  }
  
      public be.e1.bssv.util.J569801.proxy.ProcessFTPFiles getProcessFTPFiles_Pt(
    java.io.InputStream policyInputStream) 
    throws javax.xml.rpc.ServiceException
  {
    _loadPolicy("ProcessFTPFiles_pt", policyInputStream, true, true);
    return getProcessFTPFiles_Pt();
  }

  public be.e1.bssv.util.J569801.proxy.ProcessFTPFiles getProcessFTPFiles_Pt(
    java.io.InputStream policyInputStream, 
    boolean inbound, 
    boolean outbound) 
    throws javax.xml.rpc.ServiceException
  {
    _loadPolicy("ProcessFTPFiles_pt", policyInputStream, inbound, outbound);
    return getProcessFTPFiles_Pt();
  }
 
  public be.e1.bssv.util.J569801.proxy.ProcessFTPFiles getProcessFTPFiles_Pt(
    java.io.InputStream[] inboundPolicies, 
    java.io.InputStream[] outboundPolicies) 
    throws javax.xml.rpc.ServiceException
  {
    _loadPolicy("ProcessFTPFiles_pt", null, inboundPolicies, outboundPolicies);
    return getProcessFTPFiles_Pt();
  }
  
  public be.e1.bssv.util.J569801.proxy.ProcessFTPFiles getProcessFTPFiles_Pt(
    java.util.Set<java.io.InputStream> inboundPolicies, 
    java.util.Set<java.io.InputStream> outboundPolicies) 
    throws javax.xml.rpc.ServiceException
  {
    _loadPolicy("ProcessFTPFiles_pt", null, inboundPolicies, outboundPolicies);
    return getProcessFTPFiles_Pt();
  }
  
  public be.e1.bssv.util.J569801.proxy.ProcessFTPFiles getProcessFTPFiles_Pt(
    String operationName,
    java.io.InputStream[] inboundPolicies, 
    java.io.InputStream[] outboundPolicies) 
    throws javax.xml.rpc.ServiceException
  {
    _loadPolicy("ProcessFTPFiles_pt", operationName, inboundPolicies, outboundPolicies);
    return getProcessFTPFiles_Pt();
  }
  
  public be.e1.bssv.util.J569801.proxy.ProcessFTPFiles getProcessFTPFiles_Pt(
    String operationName,
    java.util.Set<java.io.InputStream> inboundPolicies, 
    java.util.Set<java.io.InputStream> outboundPolicies) 
    throws javax.xml.rpc.ServiceException
  {
    _loadPolicy("ProcessFTPFiles_pt", operationName, inboundPolicies, outboundPolicies);
    return getProcessFTPFiles_Pt();
  }
    
}