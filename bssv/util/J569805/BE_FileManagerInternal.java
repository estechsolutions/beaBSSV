package be.e1.bssv.util.J569805;

import be.e1.bssv.util.J560203.valueobject.BE_AddWorkFlowDetail_D5602000C;
import be.e1.bssv.util.J569805.valueobject.FileGlobInternal;

import java.util.ArrayList;

import oracle.e1.bssvfoundation.base.BSFNParameters;
import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BSFNServiceInvalidArgException;
import oracle.e1.bssvfoundation.exception.BSFNServiceSystemException;
import oracle.e1.bssvfoundation.services.IBSFNService;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class BE_FileManagerInternal
  extends BusinessService
{
  /**
   * TODO: Create Java Doc for: InternalFileGlob
   * Method InternalFileGlob is used for...?
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
   * @return an E1Message containing the text of any errors or warnings that may have occurred
   */
  public static E1MessageList InternalFileGlob(IContext context,
                                               IConnection connection,
                                               FileGlobInternal internalVO)
  {

    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "InternalFileGlob", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();

    messages.addMessages(FindMatchingFiles(context, connection,
                                           internalVO));
    //Call finish internal method passing context.
    finishInternalMethod(context, "InternalFileGlob");

    //Call finish internal method passing context.
    return messages;
  }

  private static E1MessageList FindMatchingFiles(IContext context,
                                                 IConnection connection,
                                                 FileGlobInternal internalVO)
  {
    String searchPath = internalVO.getSzSearchPath();
    String searchPattern = internalVO.getSzSearchPattern();
    String fileName = null;
    int idHandle = 0;
    E1MessageList returnMessages = new E1MessageList();

    if (searchPath != null && searchPattern != null)
    {
      BSFNParameters bsfnParams = new BSFNParameters();
      // map input parameters from input value object
      bsfnParams.setValue("szSearchPath", searchPath);
      bsfnParams.setValue("szSearchPattern", searchPattern);
      try
      {
        IBSFNService bsfnService = context.getBSFNService();
        bsfnService.execute(context, connection, "BE_FindMatchingFiles", bsfnParams);
        
        //now attempt to read any matching files
        boolean stopFlag = false;
        do
        {
          idHandle = ((Integer)bsfnParams.getValue("idFileList")).intValue();
          if(idHandle > 0)
          {
            //reallocate the bsfnParams
            bsfnParams = new BSFNParameters();
            bsfnParams.setValue("idFileList", new Integer(idHandle));
            
            bsfnService.execute(context, connection, "BE_GetNextMatchingFile", bsfnParams);
            fileName = (String) bsfnParams.getValue("szFileName");
            if (fileName == null)
              stopFlag = true;
            else
            {
              fileName = fileName.trim();
              if(fileName.isEmpty())
                stopFlag = true;
              else
                internalVO.addFileToList(fileName);
            }
          }
          else
            stopFlag = true;
        }
        while (stopFlag != true);

        //reallocate the bsfnParams
        bsfnParams = new BSFNParameters();
        bsfnParams.setValue("idFileList", new Integer(idHandle));
        
        bsfnService.execute(context, connection, "BE_TerminateMatchingFiles", bsfnParams);
        returnMessages.addMessages(bsfnParams.getE1MessageList());
      }
      catch (Exception exp)
      {
        returnMessages.addMessage(new E1Message(context, "018FIS", exp.getMessage()));
      }
    }
    //return any errors, warnings, or informational messages to the caller
    return returnMessages;
  }
}
