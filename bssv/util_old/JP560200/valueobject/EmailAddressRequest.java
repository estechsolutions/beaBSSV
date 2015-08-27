package be.e1.bssv.util.JP560200.valueobject;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class EmailAddressRequest extends ValueObject implements Serializable
{
  /**
   * Address Search Type
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: Z56AST <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String addressSearchType = null;

  /**
   * Address Number
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: AN8 <br>
   * EnterpriseOne field length:  8 <br>
   * EnterpriseOne decimal places: 0 <br>
   */
  private Integer addressNumber = null;

  /**
   * Type Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: TYC <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String typeCode = null;

  /**
   * Function Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: FUCO <br>
   * EnterpriseOne field length:  10 <br>
   */
  private String functionCode = null;

  /**
   * Business Unit
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MCU <br>
   * EnterpriseOne field length:  12 <br>
   */
  private String businessUnit = null;

  /**
   * Parameter Data Item 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV01 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String stringParm01 = null;

  /**
   * Parameter Data Item 02
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV02 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String stringParm02 = null;

  /**
   * Parameter Data Item 03
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: PV03 <br>
   * EnterpriseOne field length:  40 <br>
   */
  private String stringParm03 = null;

  /**
   * Math Numeric 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MATH01 <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 2 <br>
   */
  private BigDecimal numParm01 = null;

  /**
   * Math Numeric 02
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: MATH02 <br>
   * EnterpriseOne field length:  15 <br>
   * EnterpriseOne decimal places: 2 <br>
   */
  private BigDecimal numParm02 = null;

  /**
   * J.D. EnterpriseOne Event Point 01
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: EV01 <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String charParm = null;

  /**
   * TODO: Default public constructor for instantiating: GetEmailRequest
   */
  public EmailAddressRequest()
  {
  }

  public void setAddressSearchType(String srchType)
  {
    this.addressSearchType = srchType;
  }

  public String getAddressSearchType()
  {
    return addressSearchType;
  }

  public void setAddressNumber(Integer num)
  {
    this.addressNumber = num;
  }

  public Integer getAddressNumber()
  {
    return addressNumber;
  }

  public void setTypeCode(String typeCode)
  {
    this.typeCode = typeCode;
  }

  public String getTypeCode()
  {
    return typeCode;
  }

  public void setFunctionCode(String functionCode)
  {
    this.functionCode = functionCode;
  }

  public String getFunctionCode()
  {
    return functionCode;
  }

  public void setBusinessUnit(String businessUnit)
  {
    this.businessUnit = businessUnit;
  }

  public String getBusinessUnit()
  {
    return businessUnit;
  }

  public void setStringParam01(String parm01)
  {
    this.stringParm01 = parm01;
  }

  public String getStringParm01()
  {
    return stringParm01;
  }

  public void setStringParm02(String parm02)
  {
    this.stringParm02 = parm02;
  }

  public String getStringParm02()
  {
    return stringParm02;
  }

  public void setStringParm03(String parm03)
  {
    this.stringParm03 = parm03;
  }

  public String getStringParm03()
  {
    return stringParm03;
  }

  public void setNumParm01(BigDecimal math01)
  {
    this.numParm01 = math01;
  }

  public BigDecimal getNumParm01()
  {
    return numParm01;
  }

  public void setNumParm02(BigDecimal math02)
  {
    this.numParm02 = math02;
  }

  public BigDecimal getNumParm02()
  {
    return numParm02;
  }

  public void setCharParm(String ch)
  {
    this.charParm = ch;
  }

  public String getCharParm()
  {
    return charParm;
  }
}
