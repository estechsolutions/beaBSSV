package be.e1.bssv.util.JP569805;

import be.e1.bssv.util.J569805.BE_FileManagerInternal;
import be.e1.bssv.util.J569805.valueobject.FileGlobInternal;
import be.e1.bssv.util.JP569805.valueobject.FileGlobReply;
import be.e1.bssv.util.JP569805.valueobject.FileGlobRequest;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class BE_FileManager
  extends PublishedBusinessService
{
  /**
   * TODO: PublishedBusinessService Public Constructor
   */
  public BE_FileManager()
  {
  }

  /**
   * Published method for FindMatchingFiles TODO: Document method
   * Acts as wrapper method, passing null context and null connection,
   * will call protected FindMatchingFiles
   * @param vo the value object representing input data for TODO:complete javadoc
   * @return confirmVO the response data from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  public FileGlobReply FindMatchingFiles(FileGlobRequest vo)
    throws BusinessServiceException
  {
    return FindMatchingFiles(null,null,vo);
  }

  /**
   * Protected method for BE_FileManager PublishedBusinessService. FindMatchingFiles will call make calls to BusinessService classes
   * for completing business process.
   * TODO: Comment parameters
   * @param vo the value object representing input data for TODO:complete javadoc
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @return response value object is the data returned from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  protected FileGlobReply FindMatchingFiles(IContext context, IConnection connection, FileGlobRequest vo)
    throws BusinessServiceException
  {
    //perform all work within try block, finally will clean up any connections.
    try
    {
      //Call start published method, passing context of null
      //will return context object so BSFN or DB operation can be called later.
      //Context will be used to indicate default transaction boundary, as well as access
      //to formatting and logging operations.
      context = startPublishedMethod(context, "FindMatchingFiles", vo);

      //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
      E1MessageList messages = new E1MessageList();
      //Copy inputs to internal value object
      FileGlobInternal fgi = new FileGlobInternal();
      fgi.setSzSearchPath(vo.getSzSearchPath());
      fgi.setSzSearchPattern(vo.getSzSearchPattern());
      //call internal function
      messages.addMessages(BE_FileManagerInternal.InternalFileGlob(context, connection, fgi));

      //PublishedBusinessService will send either warnings in the Confirm Value Object or throw a BusinessServiceException.
      //If messages contains errors, throw the exception
      if (messages.hasErrors())
      {
        //Get the string representation of all the messages.
        String error = messages.getMessagesAsString();
        //Throw new BusinessServiceException
        throw new BusinessServiceException(error, context);
      }

      //Exception was not thrown, so create the confirm VO from internal VO
      FileGlobReply confirmVO = new FileGlobReply();
      fgi.copyToFileGlobReply(confirmVO);
      
      confirmVO.setE1MessageList(messages);
      finishPublishedMethod(context, "FindMatchingFiles");
      //return outVO, filled with return values and messages
      return confirmVO;
    }
    finally
    {
      //Call close to clean up all remaining connections and resources.
      close(context, "FindMatchingFiles");
    }
  }
}
