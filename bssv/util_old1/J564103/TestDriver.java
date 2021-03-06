package be.e1.bssv.util.J564103;

import oracle.e1.bssvfoundation.base.TestBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;

public class TestDriver
{
  public static void main(String[] args)
  {
    String testClass = "be.e1.bssv.util.J564103.RunUBE_B5641042";
    String testFunction = "InternalLaunchR5641042";
    String testFile = "C:\\E910_1\\DV910\\java\\source\\be\\e1\\bssv\\util\\J564103\\valueobject\\LaunchUBE_D5641042A.xml";
    
    try
    {
      TestBusinessService.startTest();
      TestBusinessService.callBSSVWithXMLFile(testClass, testFunction, testFile, IConnection.AUTO);
    }
    finally
    {
      TestBusinessService.finishTest();
    }
  }
}
