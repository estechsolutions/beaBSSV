package be.e1.bssv.util.JP569804;

import be.e1.bssv.util.J569804.valueobject.MOItem_Internal;
import be.e1.bssv.util.JP569804.valueobject.MOItem_Publish;
import be.e1.bssv.util.JP569804.valueobject.SelectMOReply;
import be.e1.bssv.util.JP569804.valueobject.SelectMORequest;

public class TestMOManager
{
  public static void main(String[] args)
  {
    SelectMORequest request = new SelectMORequest();
    
    request.setDownloadMediaObject(false);
    request.setSzMediaObjectKey("2401|SO|00200|1.000");
    request.setSzMoName("GT4201A");
    
    //MOItem_Publish pubItms[] = new MOItem_Publish[1];
    //pubItms[0] = new MOItem_Publish();
    //pubItms[0].setMoSeqNo(2);
    //request.setMoItems(pubItms);
    
    try
    {
      BE_MediaObjectManager moAccess = new BE_MediaObjectManager();
      SelectMOReply reply = moAccess.getMediaRecord(request);
      
      System.out.println("Media Object Name: " + reply.getSzMediaObjectName());
      System.out.println("Media Object Key: " + reply.getSzMediaObjectKey());
      pubItms = reply.getMoItems();
      
      if(pubItms != null)
      {
        for(int idx=0; idx<pubItms.length; idx++)
        {
          System.out.println("Item Name: " + pubItms[idx].getSzItemName());
          System.out.println("Item Sequence: " + pubItms[idx].getMoSeqNo());
          System.out.println("Item Type: " + pubItms[idx].getSzMoType());
          System.out.println("Item Data: " + pubItms[idx].getSzData());
        }
      }
      else
      {
        System.out.println("No Item Information exists");
      }
    }
    catch(Exception exp)
    {
      System.out.println("Error: Exception occured: " + exp.getMessage());
    }
  }
}
