package be.e1.bssv.util.JP560000;

import be.e1.bssv.util.JP560000.valueobject.F4311DataReply;
import be.e1.bssv.util.JP560000.valueobject.F4311DataRequest;

import java.math.BigDecimal;

public class TestDriver 
{
  public static void main(String[] args)
  {
    F4311DataRequest poData = new F4311DataRequest();
    poData.setActionCode("S");
    poData.setAuditUser("SCHANDOC");
    //poData.setBspStatus("SN");
    poData.setAuditProgram("TESTDRIVER");
    poData.setOrderCompanyPO("00262");
    poData.setOrderNumberPO(5514);
    poData.setOrderLinePO(new BigDecimal(1.000));
    poData.setOrderTypePO("OP");
    poData.setOrderSuffixPO("000");
    
    try
    {
      DataEnrichmentManager dem = new DataEnrichmentManager();
      F4311DataReply poReply = dem.BE_F4311SupplementalData(poData);
        
        System.out.println("Production Number: " + poReply.getProductionNumber());
        System.out.println("Rev Control Split Flag: " + poReply.getRevControlLineSplitFlag());
    }
    catch(Exception exp)
    {
      System.out.println("Some exception occured.");
      System.out.println(exp.getMessage());
    }
  }
}
