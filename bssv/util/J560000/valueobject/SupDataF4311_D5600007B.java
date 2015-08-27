package be.e1.bssv.util.J560000.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class SupDataF4311_D5600007B extends ValueObject implements Serializable
{
  /**
   * J.D. EnterpriseOne Event Point 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EV01 <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cActionCode = null;

  /**
   * Order Company (Order Number)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: KCOO <br>
   * EnterpriseOne field length:  5 <br>
   */
  private String szOrderCompanyPO = null;

  /**
   * Document (Order No, Invoice, etc.)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DOCO <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private MathNumeric mnOrderNumberPO = null;

  /**
   * Order Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DCTO <br>
   * EnterpriseOne field length:  2 <br>
   * EnterpriseOne User Defined Code: 00/DT <br>
   */
  private String szOrderTypePO = null;

  /**
   * Order Suffix
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SFXO <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String szOrderSuffixPO = null;

  /**
   * Line Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: LNID <br>
   * EnterpriseOne field length:  6 <br>
   * EnterpriseOne decimal places: 3 <br>
   */
  private MathNumeric mnOrderLineNumberPO = null;

  /**
   * Item Revision Level
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MERL <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String szRevisionLevel = null;

  /**
   * Purchase Line Code 02
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PODC02 <br>
   * EnterpriseOne field length:  3 <br>
   * EnterpriseOne User Defined Code: 43/C8 <br>
   */
  private String szBSPStatus = null;

  /**
   * User ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: USER <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String szAuditUserId = null;

  /**
   * Program ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PID <br>
   * EnterpriseOne field length:  10 <br>
   * EnterpriseOne Edit Rule:CHKOBJ <br>
   */
  private String szAuditProgramId = null;

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
   * Description
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DS01 <br>
   * EnterpriseOne field length:  80 <br>
   */
  private String szErrorDescription = null;
  
  private String szProductionNumber = null;
  private String cRevControlLineSplitFlag = null;

  public void setCActionCode(String cActionCode)
  {
    this.cActionCode = cActionCode;
  }

  public String getCActionCode()
  {
    return cActionCode;
  }

  public void setSzOrderCompanyPO(String szOrderCompanyPO)
  {
    this.szOrderCompanyPO = szOrderCompanyPO;
  }

  public String getSzOrderCompanyPO()
  {
    return szOrderCompanyPO;
  }

  public void setMnOrderNumberPO(MathNumeric mnOrderNumberPO)
  {
    this.mnOrderNumberPO = mnOrderNumberPO;
  }

  public MathNumeric getMnOrderNumberPO()
  {
    return mnOrderNumberPO;
  }

  public void setSzOrderTypePO(String szOrderTypePO)
  {
    this.szOrderTypePO = szOrderTypePO;
  }

  public String getSzOrderTypePO()
  {
    return szOrderTypePO;
  }

  public void setSzOrderSuffixPO(String szOrderSuffixPO)
  {
    this.szOrderSuffixPO = szOrderSuffixPO;
  }

  public String getSzOrderSuffixPO()
  {
    return szOrderSuffixPO;
  }

  public void setMnOrderLineNumberPO(MathNumeric mnOrderLineNumberPO)
  {
    this.mnOrderLineNumberPO = mnOrderLineNumberPO;
  }

  public MathNumeric getMnOrderLineNumberPO()
  {
    return mnOrderLineNumberPO;
  }

  public void setSzRevisionLevel(String szRevisionLevel)
  {
    this.szRevisionLevel = szRevisionLevel;
  }

  public String getSzRevisionLevel()
  {
    return szRevisionLevel;
  }

  public void setSzBSPStatus(String szBSPStatus)
  {
    this.szBSPStatus = szBSPStatus;
  }

  public String getSzBSPStatus()
  {
    return szBSPStatus;
  }

  public void setSzAuditUserId(String szAuditUserId)
  {
    this.szAuditUserId = szAuditUserId;
  }

  public String getSzAuditUserId()
  {
    return szAuditUserId;
  }

  public void setSzAuditProgramId(String szAuditProgramId)
  {
    this.szAuditProgramId = szAuditProgramId;
  }

  public String getSzAuditProgramId()
  {
    return szAuditProgramId;
  }

  public void setCErrorFlag(String cErrorFlag)
  {
    this.cErrorFlag = cErrorFlag;
  }

  public String getCErrorFlag()
  {
    return cErrorFlag;
  }

  public void setSzErrorDescription(String szErrorDescription)
  {
    this.szErrorDescription = szErrorDescription;
  }

  public String getSzErrorDescription()
  {
    return szErrorDescription;
  }

    public void setSzProductionNumber(String szProductionNumber) {
        this.szProductionNumber = szProductionNumber;
    }

    public String getSzProductionNumber() {
        return szProductionNumber;
    }

    public void setCRevControlLineSplitFlag(String cRevControlLineSplitFlag) {
        this.cRevControlLineSplitFlag = cRevControlLineSplitFlag;
    }

    public String getCRevControlLineSplitFlag() {
        return cRevControlLineSplitFlag;
    }
}
