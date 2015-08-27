package be.e1.bssv.util.JP564072.valueobject;

import be.e1.bssv.util.J564072.valueobject.BE_GetPriceBreaks_D564072A;
import java.io.Serializable;
import java.math.BigDecimal;
import oracle.e1.bssvfoundation.base.MessageValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class GetPriceBreakReply
  extends MessageValueObject
  implements Serializable
{
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
  private BigDecimal Price1 = null;

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
  private BigDecimal Price2 = null;

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
  private BigDecimal Price3 = null;

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
  private BigDecimal Price4 = null;

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
  private BigDecimal Price5 = null;

  /**
   * Error Code
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: ERRC <br>
   * EnterpriseOne field length:  1 <br>
   */
  private String errorCode = null;

  /**
   * Description
   * <p>
   * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
   * </p>
   * TODO: EnterpriseOne Key Field: false <br>
   * EnterpriseOne Alias: DS01 <br>
   * EnterpriseOne field length:  80 <br>
   */
  private String ErrorDescription = null;

  /**
   * TODO: Default public constructor for instantiating: GetPriceBreakReply
   */
  public GetPriceBreakReply()
  {
  }
    public GetPriceBreakReply (BE_GetPriceBreaks_D564072A vo) 
    {
      setErrorCode(vo.getCErrorCode());
      setErrorDescription(vo.getSzErrorDescription());
      setPrice1(vo.getMnPriceBreak1().asBigDecimal());
      setPrice2(vo.getMnPriceBreak2().asBigDecimal());
      setPrice3(vo.getMnPriceBreak3().asBigDecimal());
      setPrice4(vo.getMnPriceBreak4().asBigDecimal());
      setPrice5(vo.getMnPriceBreak5().asBigDecimal());
                                           
    }  
  
  public void setPrice1(BigDecimal Price1)
  {
    this.Price1 = Price1;
  }

  public BigDecimal getPrice1()
  {
    return Price1;
  }

  public void setPrice2(BigDecimal Price2)
  {
    this.Price2 = Price2;
  }

  public BigDecimal getPrice2()
  {
    return Price2;
  }

  public void setPrice3(BigDecimal Price3)
  {
    this.Price3 = Price3;
  }

  public BigDecimal getPrice3()
  {
    return Price3;
  }

  public void setPrice4(BigDecimal Price4)
  {
    this.Price4 = Price4;
  }

  public BigDecimal getPrice4()
  {
    return Price4;
  }

  public void setPrice5(BigDecimal Price5)
  {
    this.Price5 = Price5;
  }

  public BigDecimal getPrice5()
  {
    return Price5;
  }

  public void setErrorCode(String errorCode)
  {
    this.errorCode = errorCode;
  }

  public String getErrorCode()
  {
    return errorCode;
  }

  public void setErrorDescription(String ErrorDescription)
  {
    this.ErrorDescription = ErrorDescription;
  }

  public String getErrorDescription()
  {
    return ErrorDescription;
  }
}
