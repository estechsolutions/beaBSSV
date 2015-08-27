package be.e1.bssv.util.JP569805;

import be.e1.bssv.util.JP569805.valueobject.FileGlobReply;
import be.e1.bssv.util.JP569805.valueobject.FileGlobRequest;

public class TestDriver
{
  public static void main(String[] args)
  {
    try
    {
      FileGlobRequest fgRequest = new FileGlobRequest();
      fgRequest.setSzSearchPath("c:\\casely\\");
      fgRequest.setSzSearchPattern("*.c");
      
      BE_FileManager fmgr = new BE_FileManager();
      FileGlobReply fgReply = fmgr.FindMatchingFiles(fgRequest);
      
      int count = fgReply.getFileCount().intValue();
      String[] fileList = fgReply.getFileList();
      for(int x=0; x<count; x++)
      {
        System.out.println(fileList[x]);
      }
    }
    catch(Exception exp)
    {
      System.out.println("Some exception occurred");
      System.out.println(exp.getMessage());
    }
  }
}
