package be.e1.bssv.JP564102;

import be.e1.bssv.JP564102.valueobject.InputVOCreateItemReg;
import be.e1.bssv.JP564102.valueobject.ReturnVOCreateItemReg;

public class TestItemRegistry {
    public static void main(String[] args) {
        InputVOCreateItemReg req = new InputVOCreateItemReg();
        req.setNdItemNumber("0305842");
        req.setDescription("0305842NAME");
        req.setDescriptionLine2("0305842NAME");
        req.setItemGroup("REG");
        
        ReturnVOCreateItemReg resp = new ReturnVOCreateItemReg();
        
        
        try{
            CreateItemRegistryManager mgr = new CreateItemRegistryManager();
            
            resp = mgr.CreateItemRegPubMethod(req);
        }catch(Exception exp){
            System.out.println(exp.getMessage());
        }        
        
    }
}
