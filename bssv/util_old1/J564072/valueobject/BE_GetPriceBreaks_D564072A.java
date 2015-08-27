package be.e1.bssv.util.J564072.valueobject;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class BE_GetPriceBreaks_D564072A
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
   * EnterpriseOne User Defined Code: 40/TY <br>
   */
  private String szPriceAdjustmentName = null;

  /**
   * Address Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: AN8 <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   * EnterpriseOne Next Number: 01/1 <br>
   */
  private MathNumeric mnAddressNumber = null;

  /**
   * 2nd Item Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: true <br>
   * EnterpriseOne Alias: LITM <br>
   * EnterpriseOne field length:  25 <br>
   */
  private String szIdentifier2ndItem = null;

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
  private MathNumeric mnQuantityBreak1 = null;

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
  private MathNumeric mnQuantityBreak2 = null;

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
  private MathNumeric mnQuantityBreak3 = null;

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
  private MathNumeric mnQuantityBreak4 = null;

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
  private MathNumeric mnQuantityBreak5 = null;

  /**
   * Date - Effective
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EFTJ <br>
   * EnterpriseOne field length:  6 <br>
   */
  private Date jdDateEffective = null;

  /**
   * Factor Value
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: FVTR <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 4 <br>
   */
  private MathNumeric mnPriceBreak1 = null;

  /**
   * Factor Value
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: FVTR <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 4 <br>
   */
  private MathNumeric mnPriceBreak2 = null;

  /**
   * Factor Value
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: FVTR <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 4 <br>
   */
  private MathNumeric mnPriceBreak3 = null;

  /**
   * Factor Value
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: FVTR <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 4 <br>
   */
  private MathNumeric mnPriceBreak4 = null;

  /**
   * Factor Value
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: FVTR <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 4 <br>
   */
  private MathNumeric mnPriceBreak5 = null;

  /**
   * Currency Code - From
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: CRCD <br>
   * EnterpriseOne field length:  3 <br>
   */
  private String szCurrencyCodeFrom = null;

  /**
   * Error Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ERRC <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String cErrorCode = null;

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

  public void setSzPriceAdjustmentName(String szPriceAdjustmentName)
  {
    this.szPriceAdjustmentName = szPriceAdjustmentName;
  }

  public String getSzPriceAdjustmentName()
  {
    return szPriceAdjustmentName;
  }

  public void setMnAddressNumber(MathNumeric mnAddressNumber)
  {
    this.mnAddressNumber = mnAddressNumber;
  }

  public MathNumeric getMnAddressNumber()
  {
    return mnAddressNumber;
  }

  public void setSzIdentifier2ndItem(String szIdentifier2ndItem)
  {
    this.szIdentifier2ndItem = szIdentifier2ndItem;
  }

  public String getSzIdentifier2ndItem()
  {
    return szIdentifier2ndItem;
  }

  public void setMnQuantityBreak1(MathNumeric mnQuantityBreak1)
  {
    this.mnQuantityBreak1 = mnQuantityBreak1;
  }

  public MathNumeric getMnQuantityBreak1()
  {
    return mnQuantityBreak1;
  }

  public void setMnQuantityBreak2(MathNumeric mnQuantityBreak2)
  {
    this.mnQuantityBreak2 = mnQuantityBreak2;
  }

  public MathNumeric getMnQuantityBreak2()
  {
    return mnQuantityBreak2;
  }

  public void setMnQuantityBreak3(MathNumeric mnQuantityBreak3)
  {
    this.mnQuantityBreak3 = mnQuantityBreak3;
  }

  public MathNumeric getMnQuantityBreak3()
  {
    return mnQuantityBreak3;
  }

  public void setMnQuantityBreak4(MathNumeric mnQuantityBreak4)
  {
    this.mnQuantityBreak4 = mnQuantityBreak4;
  }

  public MathNumeric getMnQuantityBreak4()
  {
    return mnQuantityBreak4;
  }

  public void setMnQuantityBreak5(MathNumeric mnQuantityBreak5)
  {
    this.mnQuantityBreak5 = mnQuantityBreak5;
  }

  public MathNumeric getMnQuantityBreak5()
  {
    return mnQuantityBreak5;
  }

  public void setJdDateEffective(Date jdDateEffective)
  {
    this.jdDateEffective = jdDateEffective;
  }

  public Date getJdDateEffective()
  {
    return jdDateEffective;
  }

  public void setMnPriceBreak1(MathNumeric mnPriceBreak1)
  {
    this.mnPriceBreak1 = mnPriceBreak1;
  }

  public MathNumeric getMnPriceBreak1()
  {
    return mnPriceBreak1;
  }

  public void setMnPriceBreak2(MathNumeric mnPriceBreak2)
  {
    this.mnPriceBreak2 = mnPriceBreak2;
  }

  public MathNumeric getMnPriceBreak2()
  {
    return mnPriceBreak2;
  }

  public void setMnPriceBreak3(MathNumeric mnPriceBreak3)
  {
    this.mnPriceBreak3 = mnPriceBreak3;
  }

  public MathNumeric getMnPriceBreak3()
  {
    return mnPriceBreak3;
  }

  public void setMnPriceBreak4(MathNumeric mnPriceBreak4)
  {
    this.mnPriceBreak4 = mnPriceBreak4;
  }

  public MathNumeric getMnPriceBreak4()
  {
    return mnPriceBreak4;
  }

  public void setMnPriceBreak5(MathNumeric mnPriceBreak5)
  {
    this.mnPriceBreak5 = mnPriceBreak5;
  }

  public MathNumeric getMnPriceBreak5()
  {
    return mnPriceBreak5;
  }

  public void setSzCurrencyCodeFrom(String szCurrencyCodeFrom)
  {
    this.szCurrencyCodeFrom = szCurrencyCodeFrom;
  }

  public String getSzCurrencyCodeFrom()
  {
    return szCurrencyCodeFrom;
  }

  public void setCErrorCode(String cErrorCode)
  {
    this.cErrorCode = cErrorCode;
  }

  public String getCErrorCode()
  {
    return cErrorCode;
  }

  public void setSzErrorDescription(String szErrorDescription)
  {
    this.szErrorDescription = szErrorDescription;
  }

  public String getSzErrorDescription()
  {
    return szErrorDescription;
  }
}
