package be.e1.bssv.util.J569801.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class FtpRequest_D5698001A extends ValueObject implements Serializable
{
  /**
   * Workflow Transport Data
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TRANDATA <br>
   * EnterpriseOne field length:  1024 <br>
   */
  private String szSourceHost = null;

  /**
   * Workflow Transport Data
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TRANDATA <br>
   * EnterpriseOne field length:  1024 <br>
   */
  private String szSourceFile = null;

  /**
   * Workflow Transport Data
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TRANDATA <br>
   * EnterpriseOne field length:  1024 <br>
   */
  private String szSourcePath = null;

  /**
   * Workflow Transport Data
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TRANDATA <br>
   * EnterpriseOne field length:  1024 <br>
   */
  private String szDestinationHost = null;

  /**
   * Workflow Transport Data
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TRANDATA <br>
   * EnterpriseOne field length:  1024 <br>
   */
  private String szDestinationFile = null;

  /**
   * Workflow Transport Data
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TRANDATA <br>
   * EnterpriseOne field length:  1024 <br>
   */
  private String szDestinationPath = null;

  /**
   * J.D. EnterpriseOne Event Point 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EV01 <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cDebugFlag = null;

  /**
   * J.D. EnterpriseOne Event Point 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EV01 <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cDeleteSourceYN = null;

  /**
   * Error Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ERRC <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cErrorFlag = null;

  /**
   * Error from BSSV
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: BSSVERR <br>
   * EnterpriseOne field length:  1999 <br>
   */
  private String szErrorMessage = null;

  public void setSzSourceHost(String szSourceHost)
  {
    this.szSourceHost = szSourceHost;
  }

  public String getSzSourceHost()
  {
    return szSourceHost;
  }

  public void setSzSourceFile(String szSourceFile)
  {
    this.szSourceFile = szSourceFile;
  }

  public String getSzSourceFile()
  {
    return szSourceFile;
  }

  public void setSzSourcePath(String szSourcePath)
  {
    this.szSourcePath = szSourcePath;
  }

  public String getSzSourcePath()
  {
    return szSourcePath;
  }

  public void setSzDestinationHost(String szDestinationHost)
  {
    this.szDestinationHost = szDestinationHost;
  }

  public String getSzDestinationHost()
  {
    return szDestinationHost;
  }

  public void setSzDestinationFile(String szDestinationFile)
  {
    this.szDestinationFile = szDestinationFile;
  }

  public String getSzDestinationFile()
  {
    return szDestinationFile;
  }

  public void setSzDestinationPath(String szDestinationPath)
  {
    this.szDestinationPath = szDestinationPath;
  }

  public String getSzDestinationPath()
  {
    return szDestinationPath;
  }

  public void setCDebugFlag(String cDebugFlag)
  {
    this.cDebugFlag = cDebugFlag;
  }

  public String getCDebugFlag()
  {
    return cDebugFlag;
  }

  public void setCDeleteSourceYN(String cDeleteSourceYN)
  {
    this.cDeleteSourceYN = cDeleteSourceYN;
  }

  public String getCDeleteSourceYN()
  {
    return cDeleteSourceYN;
  }

  public void setCErrorFlag(String cErrorFlag)
  {
    this.cErrorFlag = cErrorFlag;
  }

  public String getCErrorFlag()
  {
    return cErrorFlag;
  }

  public void setSzErrorMessage(String szErrorMessage)
  {
    this.szErrorMessage = szErrorMessage;
  }

  public String getSzErrorMessage()
  {
    return szErrorMessage;
  }
}
