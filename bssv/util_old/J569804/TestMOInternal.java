package be.e1.bssv.util;

import oracle.e1.bssvfoundation.base.TestBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;

public class TestMOInternal
{
  public static void main(String[] args)
  {
    TestBusinessService.startTest();
    String testFile = "C:\\E910_1\\DV910\\java\\source\\be\\e1\\bssv\\util\\J569804\\valueobject\\InternalMOValueObject.xml";
    String testClass = "be.e1.bssv.util.J569804.BE_MOProcess";
    String testFunction = "InternalSelectMO";

    try
    {
      int bSSVWithXMLFile = TestBusinessService.callBSSVWithXMLFile(testClass, testFunction, testFile, IConnection.AUTO);
    }
    finally
    {
      TestBusinessService.finishTest();
    }
  }
}
