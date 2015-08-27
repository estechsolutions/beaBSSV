package be.e1.bssv.util.JP564103;

import be.e1.bssv.util.J564103.PLMReportsLauncher;
import be.e1.bssv.util.J564103.valueobject.DSR5641042;
import be.e1.bssv.util.JP564103.valueobject.LaunchR5641042Reply;
import be.e1.bssv.util.JP564103.valueobject.LaunchR5641042Request;

import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.base.PublishedBusinessService;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BusinessServiceException;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc for PublishedBusinessService
 */
public class BE_PLMReportsManager extends PublishedBusinessService
{
  /**
   * TODO: PublishedBusinessService Public Constructor
   */
  public BE_PLMReportsManager()
  {
  }

  /**
   * Published method for LaunchR5641042 TODO: Document method
   * Acts as wrapper method, passing null context and null connection,
   * will call protected LaunchR5641042
   * @param vo the value object representing input data for TODO:complete javadoc
   * @return confirmVO the response data from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  public LaunchR5641042Reply LaunchR5641042(LaunchR5641042Request vo)
    throws BusinessServiceException
  {
    return LaunchR5641042(null,null,vo);
  }

  /**
   * Protected method for BE_RunBatchApplication PublishedBusinessService. LaunchR5641042 will call make calls to BusinessService classes
   * for completing business process.
   * TODO: Comment parameters
   * @param vo the value object representing input data for TODO:complete javadoc
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @return response value object is the data returned from the business process TODO:complete javadoc
   * @throws BusinessServiceException
   */
  protected LaunchR5641042Reply LaunchR5641042(IContext context, IConnection connection, LaunchR5641042Request request)
    throws BusinessServiceException
  {
    //perform all work within try block, finally will clean up any connections.
    try
    {
      //Call start published method, passing context of null
      //will return context object so BSFN or DB operation can be called later.
      //Context will be used to indicate default transaction boundary, as well as access
      //to formatting and logging operations.
      context = startPublishedMethod(context, "LaunchR5641042", request);

      //Create new PublishedBusinessService messages object for holding errors and warnings that occur during processing.
      E1MessageList messages = new E1MessageList();
      
      //Create a new internal value object.
      DSR5641042 internalVO = new DSR5641042();
      internalVO.setMnTransactionID(new MathNumeric(request.getTransactionID()));
      internalVO.setSzReportName(request.getReportName());
      internalVO.setSzReportVersion(request.getReportVersion());
      internalVO.setSzPrintQueue(request.getPrintQueue());
      internalVO.setCRunAsynchronous(request.getCRunAsynchronousYN());
      
      //Call BusinessService passing context, connection and internal VO
      messages.addMessages(PLMReportsLauncher.InternalLaunchR5641042(context, connection, internalVO));

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
      LaunchR5641042Reply confirmVO = new LaunchR5641042Reply(internalVO);
      confirmVO.setE1MessageList(messages);
      finishPublishedMethod(context, "LaunchR5641042");
      
      //return outVO, filled with return values and messages
      return confirmVO;
    }
    finally
    {
      //Call close to clean up all remaining connections and resources.
      close(context, "LaunchR5641042");
    }
  }
}
