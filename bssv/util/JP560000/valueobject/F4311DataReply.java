package be.e1.bssv.util.JP560000.valueobject;

import be.e1.bssv.util.J560000.valueobject.SupDataF4211_D5600007C;

import be.e1.bssv.util.J560000.valueobject.SupDataF4311_D5600007B;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.MessageValueObject;
import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class F4311DataReply extends MessageValueObject implements Serializable
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
   * Error Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ERRC <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String errorFlag = null;

  /**
   * Description
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DS01 <br>
   * EnterpriseOne field length:  80 <br>
   */
  private String errorDescription = null;
  
    private String productionNumber = null;
    private String revControlLineSplitFlag = null;

  /**
   * TODO: Default public constructor for instantiating: F4311DataReply
   */
  public F4311DataReply()
  {
  }

  public F4311DataReply(SupDataF4311_D5600007B inData)
  {
    this.actionCode = inData.getCActionCode();
    this.errorFlag = inData.getCErrorFlag();
    this.errorDescription = inData.getSzErrorDescription();
    this.itemRevisionLevel = inData.getSzRevisionLevel();
    this.orderCompanyPO = inData.getSzOrderCompanyPO();
    this.orderTypePO = inData.getSzOrderTypePO();
    this.orderSuffixPO = inData.getSzOrderSuffixPO();
    this.productionNumber = inData.getSzProductionNumber();
    this.revControlLineSplitFlag = inData.getCRevControlLineSplitFlag();
    
    this.orderNumberPO = 0;
    if(inData.getMnOrderNumberPO() != null)
    {
      this.orderNumberPO = inData.getMnOrderNumberPO().intValue();
    }
    
    this.orderLinePO = BigDecimal.ZERO;
    if(inData.getMnOrderLineNumberPO() != null)
    {
      this.orderLinePO = inData.getMnOrderLineNumberPO().asBigDecimal();
    }
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

  public void setErrorFlag(String errorFlag)
  {
    this.errorFlag = errorFlag;
  }

  public String getErrorFlag()
  {
    return errorFlag;
  }

  public void setErrorDescription(String errorDescription)
  {
    this.errorDescription = errorDescription;
  }

  public String getErrorDescription()
  {
    return errorDescription;
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
