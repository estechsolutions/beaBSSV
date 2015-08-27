package be.e1.bssv.util.JP560000.valueobject;

import be.e1.bssv.util.J560000.valueobject.SupDataF4211_D5600007C;

import be.e1.bssv.util.J560000.valueobject.SupDataF4311_D5600007B;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class F4311DataRequest extends ValueObject implements Serializable
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
  private String actionCode = null;

  /**
   * Order Company (Order Number)
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: KCOO <br>
   * EnterpriseOne field length:  5 <br>
   */
  private String orderCompanyPO = null;

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
  private Integer orderNumberPO = null;

  /**
   * Order Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DCTO <br>
   * EnterpriseOne field length:  2 <br>
   */
  private String orderTypePO = null;

  /**
   * Order Suffix
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: SFXO <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String orderSuffixPO = null;

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
  private BigDecimal orderLinePO = null;

  /**
   * Item Revision Level
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MERL <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String itemRevisionLevel = null;

  /**
   * Purchase Line Code 02
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PODC02 <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String bspStatus = null;

  /**
   * User ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: USER <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String auditUser = null;

  /**
   * Program ID
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PID <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String auditProgram = null;
  
  private String productionNumber = null;
  private String revControlLineSplitFlag = null;

  /**
   * TODO: Default public constructor for instantiating: F4311DataRequest
   */
  public F4311DataRequest()
  {
  }

  public void setActionCode(String actionCode)
  {
    this.actionCode = actionCode;
  }

  public String getActionCode()
  {
    return actionCode;
  }

  public void setOrderCompanyPO(String orderCompanyPO)
  {
    this.orderCompanyPO = orderCompanyPO;
  }

  public String getOrderCompanyPO()
  {
    return orderCompanyPO;
  }

  public void setOrderNumberPO(Integer orderNumberPO)
  {
    this.orderNumberPO = orderNumberPO;
  }

  public Integer getOrderNumberPO()
  {
    return orderNumberPO;
  }

  public void setOrderTypePO(String orderTypePO)
  {
    this.orderTypePO = orderTypePO;
  }

  public String getOrderTypePO()
  {
    return orderTypePO;
  }

  public void setOrderSuffixPO(String orderSuffixPO)
  {
    this.orderSuffixPO = orderSuffixPO;
  }

  public String getOrderSuffixPO()
  {
    return orderSuffixPO;
  }

  public void setOrderLinePO(BigDecimal orderLinePO)
  {
    this.orderLinePO = orderLinePO;
  }

  public BigDecimal getOrderLinePO()
  {
    return orderLinePO;
  }

  public void setItemRevisionLevel(String itemRevisionLevel)
  {
    this.itemRevisionLevel = itemRevisionLevel;
  }

  public String getItemRevisionLevel()
  {
    return itemRevisionLevel;
  }

  public void setBspStatus(String bspStatus)
  {
    this.bspStatus = bspStatus;
  }

  public String getBspStatus()
  {
    return bspStatus;
  }

  public void setAuditUser(String auditUser)
  {
    this.auditUser = auditUser;
  }

  public String getAuditUser()
  {
    return auditUser;
  }

  public void setAuditProgram(String auditProgram)
  {
    this.auditProgram = auditProgram;
  }

  public String getAuditProgram()
  {
    return auditProgram;
  }
  
  public void copyToInternalValueObject(SupDataF4311_D5600007B inData)
  {
    inData.setCActionCode(this.actionCode);
    inData.setSzAuditProgramId(this.auditProgram);
    inData.setSzAuditUserId(this.auditUser);
    inData.setSzOrderCompanyPO(this.orderCompanyPO);
    inData.setSzOrderTypePO(this.orderTypePO);
    inData.setSzOrderSuffixPO(this.orderSuffixPO);
    inData.setSzRevisionLevel(this.itemRevisionLevel);
    inData.setSzBSPStatus(this.bspStatus);
    inData.setSzRevisionLevel(this.itemRevisionLevel);
    inData.setSzProductionNumber(this.productionNumber);
    inData.setCRevControlLineSplitFlag(this.revControlLineSplitFlag);
    
    if(this.orderNumberPO != null)
    {
      inData.setMnOrderNumberPO(new MathNumeric(this.orderNumberPO));
    }
    if(this.orderLinePO != null)
    {
      inData.setMnOrderLineNumberPO(new MathNumeric(this.orderLinePO));
    }
  }

    public void setProductionNumber(String productionNumber) {
        this.productionNumber = productionNumber;
    }

    public String getProductionNumber() {
        return productionNumber;
    }

    public void setRevControlLineSplitFlag(String revControlLineSplitFlag) {
        this.revControlLineSplitFlag = revControlLineSplitFlag;
    }

    public String getRevControlLineSplitFlag() {
        return revControlLineSplitFlag;
    }
}
