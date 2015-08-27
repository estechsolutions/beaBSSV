package be.e1.bssv.util.J569801;

import be.e1.bssv.util.J569801.valueobject.FtpRequest_D5698001A;
import be.e1.bssv.util.J569801.com.oracle.xmlns.ftpmanager.ftpmanager.ftpfilemanager.Process;
import be.e1.bssv.util.J569801.com.oracle.xmlns.ftpmanager.ftpmanager.ftpfilemanager.ProcessResponse;

import be.e1.bssv.util.J569801.proxy.ProcessFTPFiles;

import be.e1.bssv.util.J569801.proxy.ProcessFTPFilesPortClient;

import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;

import oracle.e1.bssvfoundation.util.SoftCodingRecordAccess;

import org.w3c.dom.Element;

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class BE_FtpRequest extends BusinessService
{
  /**
   * TODO: Create Java Doc for: InternalTransferFile_B5698001
   * Method InternalTransferFile_B5698001 is used for...?
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
   * @return an E1Message containing the text of any errors or warnings that may have occurred
   */
  public static E1MessageList InternalTransferFile_B5698001(IContext context, IConnection connection, FtpRequest_D5698001A internalVO)
  {
    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "InternalTransferFile_B5698001", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();

    Process inputVO = new Process();
    
    inputVO.setDeleteFlag(internalVO.getCDeleteSourceYN());
    
    inputVO.setFromHost(internalVO.getSzSourceHost());
    inputVO.setFromDir(internalVO.getSzSourcePath());
    inputVO.setFromFile(internalVO.getSzSourceFile());
    
    inputVO.setToHost(internalVO.getSzDestinationHost());
    inputVO.setToDir(internalVO.getSzDestinationPath());
    inputVO.setToFile(internalVO.getSzDestinationFile());
    
    try
    {
      ProcessFTPFilesPortClient ftpClient = new ProcessFTPFilesPortClient();
      initPortWithSoftCoding(context, ftpClient, messages);
      ProcessResponse outputVO = ftpClient.process(inputVO);
      
      internalVO.setCErrorFlag(outputVO.getStatus().toString());
      internalVO.setSzErrorMessage(outputVO.getResult());
    }
    catch(Exception exp)
    {
      internalVO.setCErrorFlag("1");
      internalVO.setSzErrorMessage("Call to web-service proxy failed.");
    }

    //Call finish internal method passing context.
    finishInternalMethod(context, "InternalTransferFile_B5698001");

    //Call finish internal method passing context.
    return messages;
  }
  
  public static E1MessageList initPortWithSoftCoding(IContext context, ProcessFTPFilesPortClient portClient, E1MessageList msgList) throws Exception
  {
    final String softCodeKey = "J569801";
    try
    {
      Element softCodingValue = SoftCodingRecordAccess.getSoftCodingRecord(context, softCodeKey);
      if(softCodingValue != null)
      {
        String serviceUrl = SoftCodingRecordAccess.getSoftcodingRecordFieldvalue(context, "endpoint", softCodingValue);
        if(serviceUrl != null)
          portClient.setEndpoint(serviceUrl);
      }
    }
    catch(Exception exp)
    {
      context.getBSSVLogger().app(context, "WEB_SERVICE_CALL", "Invalid Softcoding Record", null, exp);
      System.out.println("Error: Invalid softcoding record");
      E1Message e1Msg = new E1Message(context, "004FIS", "Invalid Softcoding Record");
      msgList.addMessage(e1Msg);
    }
    return msgList;
  }
}
