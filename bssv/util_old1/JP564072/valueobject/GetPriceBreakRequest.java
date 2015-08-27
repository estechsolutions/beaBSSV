package be.e1.bssv.util.JP564072.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Calendar;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class GetPriceBreakRequest
  extends ValueObject
  implements Serializable
{
  /**
   * Price Adjustment Name
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: AST <br>
   * EnterpriseOne field length:  8 <br>
   */
  private String priceAdjustmentName = null;

  /**
   * Address Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: AN8 <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer addressNumber = null;

  /**
   * 2nd Item Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: LITM <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String ndItemNumber = null;

  /**
   * From Level
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: DMNQ <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 4 <br>
   */
  private BigDecimal QuantityBreak1 = null;

  /**
   * From Level
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DMNQ <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 4 <br>
   */
  private BigDecimal QuantityBreak2 = null;

  /**
   * From Level
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DMNQ <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 4 <br>
   */
  private BigDecimal QuantityBreak3 = null;

  /**
   * From Level
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DMNQ <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 4 <br>
   */
  private BigDecimal QuantityBreak4 = null;

  /**
   * From Level
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DMNQ <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 4 <br>
   */
  private BigDecimal QuantityBreak5 = null;

  /**
   * Date - Effective
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EFTJ <br>
   * EnterpriseOne field length:  6 <br>
   */
  private Calendar dateEffective = null;

  /**
   * Currency Code - From
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CRCD <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String currencyCodeFrom = null;

  /**
   * TODO: Default public constructor for instantiating: GetPriceBreakRequest
   */
  public GetPriceBreakRequest()
  {
    this.QuantityBreak1= new BigDecimal(0);
    this.QuantityBreak2= new BigDecimal(0);
    this.QuantityBreak3= new BigDecimal(0);
    this.QuantityBreak4= new BigDecimal(0);
    this.QuantityBreak5= new BigDecimal(0);
  }

  public void setPriceAdjustmentName(String priceAdjustmentName)
  {
    this.priceAdjustmentName = priceAdjustmentName;
  }

  public String getPriceAdjustmentName()
  {
    return priceAdjustmentName;
  }

  public void setAddressNumber(Integer addressNumber)
  {
    this.addressNumber = addressNumber;
  }

  public Integer getAddressNumber()
  {
    return addressNumber;
  }

  public void setNdItemNumber(String ndItemNumber)
  {
    this.ndItemNumber = ndItemNumber;
  }

  public String getNdItemNumber()
  {
    return ndItemNumber;
  }

  public void setQuantityBreak1(BigDecimal QuantityBreak1)
  {
    this.QuantityBreak1 = QuantityBreak1;
  }

  public BigDecimal getQuantityBreak1()
  {
    return QuantityBreak1;
  }

  public void setQuantityBreak2(BigDecimal QuantityBreak2)
  {
    this.QuantityBreak2 = QuantityBreak2;
  }

  public BigDecimal getQuantityBreak2()
  {
    return QuantityBreak2;
  }

  public void setQuantityBreak3(BigDecimal QuantityBreak3)
  {
    this.QuantityBreak3 = QuantityBreak3;
  }

  public BigDecimal getQuantityBreak3()
  {
    return QuantityBreak3;
  }

  public void setQuantityBreak4(BigDecimal QuantityBreak4)
  {
    this.QuantityBreak4 = QuantityBreak4;
  }

  public BigDecimal getQuantityBreak4()
  {
    return QuantityBreak4;
  }

  public void setQuantityBreak5(BigDecimal QuantityBreak5)
  {
    this.QuantityBreak5 = QuantityBreak5;
  }

  public BigDecimal getQuantityBreak5()
  {
    return QuantityBreak5;
  }

  public void setDateEffective(Calendar dateEffective)
  {
    this.dateEffective = dateEffective;
  }

  public Calendar getDateEffective()
  {
    return dateEffective;
  }

  public void setCurrencyCodeFrom(String currencyCodeFrom)
  {
    this.currencyCodeFrom = currencyCodeFrom;
  }

  public String getCurrencyCodeFrom()
  {
    return currencyCodeFrom;
  }
}
