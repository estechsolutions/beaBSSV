package be.e1.bssv.util.JP564303;

import be.e1.bssv.util.JP564303.valueobject.POReply;
import be.e1.bssv.util.JP564303.valueobject.PORequest;

public class TestPOManager {
    public static void main(String[] args) {
        
        PORequest req = new PORequest();
        req.setBiLinkFlag("1");
        req.setOrderCompanyOrderNumber("00001");
        req.setOrderNumber(new Integer(5606));
        req.setOrderType("OP");
        req.setReportName("R43500");
        req.setReportVersion("BEA0001");
        req.setOrderSuffix("000");
        
        POReply rep = new POReply();
        
        BE_RunPOManager mgr = new BE_RunPOManager();
        
        try{
            rep = mgr.runPO(req);
            
        }catch(Exception exp){
            System.out.println(exp.getMessage());
        }
        
    }
}
