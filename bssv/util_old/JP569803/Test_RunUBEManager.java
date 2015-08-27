package be.e1.bssv.util.JP569803;

import be.e1.bssv.util.JP569803.valueobject.UBEReply;
import be.e1.bssv.util.JP569803.valueobject.UBERequest;

public class Test_RunUBEManager {
 
 
    public static void main(String[] args){   
  

/*  Create an instance of the request value object and then */
/*  using the set methods populate the necessary fiels for the test */
  
    UBERequest req = new UBERequest();
    req.setObjectName("some string replace");
    req.setJDEnterpriseOneEventPoint01("some string replace");
    req.setVersionHistory("some string replace");
    
/* Create an instance of the reply value object */
    
    UBEReply reply = new UBEReply();
    
    
/* Create a try/catch since the call to invoke the methods is throwable */    
    try{
        /*  Create an instance of the Main Program BE_RunUBEManager and call the method passing paramter req */
        BE_RunUBEManager mgr = new BE_RunUBEManager();
        
        reply=mgr.runUBE(req);
        
        /* output one of the reply fields just to confirm */
        System.out.println(reply.getDescription());
        
        
    }catch (Exception exp){
        System.out.println(exp.getMessage());
    }

    }
    
}
