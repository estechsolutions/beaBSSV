package be.e1.bssv.util.J560000;

import be.e1.bssv.util.J560000.valueobject.SupDataF4211_D5600007C;

import be.e1.bssv.util.J560000.valueobject.SupDataF4311_D5600007B;

import oracle.e1.bssvfoundation.base.BSFNParameters;
import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.exception.BSFNServiceInvalidArgException;
import oracle.e1.bssvfoundation.exception.BSFNServiceSystemException;
import oracle.e1.bssvfoundation.services.IBSFNService;
import oracle.e1.bssvfoundation.util.E1Message;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class DataEnrichmentMgr extends BusinessService
{
  /**
   * TODO: Create Java Doc for: InternalF4211SupData
   * Method InternalF4211SupData is used for...?
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
   * @return an E1Message containing the text of any errors or warnings that may have occurred
   */
  public static E1MessageList InternalF4211SupData(IContext context, IConnection connection, SupDataF4211_D5600007C internalVO)
  {
    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "InternalF4211SupData", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();
    //call function business function
    callBE_F4211SupplementalData(context, connection, internalVO);

    //Call finish internal method passing context.
    finishInternalMethod(context, "InternalF4211SupData");
    //Call finish internal method passing context.
    return messages;
  }

  /**
   * TODO: Create Java Doc for: InternalF4311SupData
   * Method InternalF4311SupData is used for...?
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
   * @return an E1Message containing the text of any errors or warnings that may have occurred
   */
  public static E1MessageList InternalF4311SupData(IContext context, IConnection connection, SupDataF4311_D5600007B internalVO)
  {
    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "InternalF4311SupData", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();

    callBE_F4311SupplementalData(context, connection, internalVO);

    //Call finish internal method passing context.
    finishInternalMethod(context, "InternalF4311SupData");
    //Call finish internal method passing context.
    return messages;
  }

  /**
   * Calls the BE_F4211SupplementalData(N5600007) business function which has the D5600007C datastructure.
   * @param context conditionally provides the connection for the business function call and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param TODO document input parameters
   * @return A list of messages if there were application errors, warnings, or informational
   * messages. Returns null if there were no messages.
   */
  private static E1MessageList callBE_F4211SupplementalData(IContext context, IConnection connection, SupDataF4211_D5600007C internalVO)
  {
    BSFNParameters bsfnParams = new BSFNParameters();

    // map input parameters from input value object
    bsfnParams.setValue("cActionCode", internalVO.getCActionCode());
    bsfnParams.setValue("szOrderCompanySO", internalVO.getSzOrderCompanySO());
    bsfnParams.setValue("mnOrderNumberSO", internalVO.getMnOrderNumberSO());
    bsfnParams.setValue("szOrderTypeSO", internalVO.getSzOrderTypeSO());
    bsfnParams.setValue("mnOrderLineSO", internalVO.getMnOrderLineSO());
    bsfnParams.setValue("szAuditUser", internalVO.getSzAuditUser());
    bsfnParams.setValue("szAuditProgram", internalVO.getSzAuditProgram());
    bsfnParams.setValue("cErrorFlag", internalVO.getCErrorFlag());
    bsfnParams.setValue("szErrorMessage", internalVO.getSzErrorMessage());
    bsfnParams.setValue("szRevisionLevel", internalVO.getSzRevisionLevel());

    try
    {
      //get bsfnService from context
      IBSFNService bsfnService = context.getBSFNService();
      //execute business function
      bsfnService.execute(context, connection, "BE_F4211SupplementalData", bsfnParams);
    }
    catch (BSFNServiceInvalidArgException invalidArgEx)
    {
      //Create error message for Invalid Argument exception and return it in ErrorList
      E1MessageList returnMessages = new E1MessageList();
      returnMessages.addMessage(new E1Message(context, "018FIS", invalidArgEx.getMessage()));
      return returnMessages;
    }
    catch (BSFNServiceSystemException systemEx)
    {
      //Create error message for System exception and return it in ErrorList
      E1MessageList returnMessages = new E1MessageList();
      returnMessages.addMessage(new E1Message(context, "019FIS", systemEx.getMessage()));
      return returnMessages;
    }
    
    //map output parameters to output value object
    internalVO.setCActionCode(bsfnParams.getValue("cActionCode").toString());
    internalVO.setSzOrderCompanySO((String)bsfnParams.getValue("szOrderCompanySO"));
    internalVO.setMnOrderNumberSO((MathNumeric)bsfnParams.getValue("mnOrderNumberSO"));
    internalVO.setSzOrderTypeSO((String)bsfnParams.getValue("szOrderTypeSO"));
    internalVO.setMnOrderLineSO((MathNumeric)bsfnParams.getValue("mnOrderLineSO"));
    internalVO.setSzAuditUser((String)bsfnParams.getValue("szAuditUser"));
    internalVO.setSzAuditProgram((String)bsfnParams.getValue("szAuditProgram"));
    internalVO.setCErrorFlag(bsfnParams.getValue("cErrorFlag").toString());
    internalVO.setSzErrorMessage((String)bsfnParams.getValue("szErrorMessage"));
    internalVO.setSzRevisionLevel((String)bsfnParams.getValue("szRevisionLevel"));

    //return any errors, warnings, or informational messages to the caller
    return bsfnParams.getE1MessageList();
  }

  /**
   * Calls the BE_F4311SupplementalData(N5600007) business function which has the D5600007B datastructure.
   * @param context conditionally provides the connection for the business function call and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param TODO document input parameters
   * @return A list of messages if there were application errors, warnings, or informational
   * messages. Returns null if there were no messages.
   */
  private static E1MessageList callBE_F4311SupplementalData(IContext context, IConnection connection, SupDataF4311_D5600007B internalVO)
  {
    BSFNParameters bsfnParams = new BSFNParameters();

    // map input parameters from input value object
    bsfnParams.setValue("cActionCode", internalVO.getCActionCode());
    bsfnParams.setValue("szOrderCompanyPO", internalVO.getSzOrderCompanyPO());
    bsfnParams.setValue("mnOrderNumberPO", internalVO.getMnOrderNumberPO());
    bsfnParams.setValue("szOrderTypePO", internalVO.getSzOrderTypePO());
    bsfnParams.setValue("szOrderSuffixPO", internalVO.getSzOrderSuffixPO());
    bsfnParams.setValue("mnOrderLineNumberPO", internalVO.getMnOrderLineNumberPO());
    bsfnParams.setValue("szRevisionLevel", internalVO.getSzRevisionLevel());
    bsfnParams.setValue("szBSPStatus", internalVO.getSzBSPStatus());
    bsfnParams.setValue("szAuditUserId", internalVO.getSzAuditUserId());
    bsfnParams.setValue("szAuditProgramId", internalVO.getSzAuditProgramId());
    bsfnParams.setValue("cErrorFlag", internalVO.getCErrorFlag());
    bsfnParams.setValue("szErrorDescription", internalVO.getSzErrorDescription());

    try
    {
      //get bsfnService from context
      IBSFNService bsfnService = context.getBSFNService();
      //execute business function
      bsfnService.execute(context, connection, "BE_F4311SupplementalData", bsfnParams);
    }
    catch (BSFNServiceInvalidArgException invalidArgEx)
    {
      //Create error message for Invalid Argument exception and return it in ErrorList
      E1MessageList returnMessages = new E1MessageList();
      returnMessages.addMessage(new E1Message(context, "018FIS", invalidArgEx.getMessage()));
      return returnMessages;
    }
    catch (BSFNServiceSystemException systemEx)
    {
      //Create error message for System exception and return it in ErrorList
      E1MessageList returnMessages = new E1MessageList();
      returnMessages.addMessage(new E1Message(context, "019FIS", systemEx.getMessage()));
      return returnMessages;
    }

    //map output parameters to output value object
    internalVO.setCActionCode(bsfnParams.getValue("cActionCode").toString());
    internalVO.setSzOrderCompanyPO((String)bsfnParams.getValue("szOrderCompanyPO"));
    internalVO.setMnOrderNumberPO((MathNumeric)bsfnParams.getValue("mnOrderNumberPO"));
    internalVO.setSzOrderTypePO((String)bsfnParams.getValue("szOrderTypePO"));
    internalVO.setSzOrderSuffixPO((String)bsfnParams.getValue("szOrderSuffixPO"));
    internalVO.setMnOrderLineNumberPO((MathNumeric)bsfnParams.getValue("mnOrderLineNumberPO"));
    internalVO.setSzRevisionLevel((String)bsfnParams.getValue("szRevisionLevel"));
    internalVO.setSzBSPStatus((String)bsfnParams.getValue("szBSPStatus"));
    internalVO.setSzAuditUserId((String)bsfnParams.getValue("szAuditUserId"));
    internalVO.setSzAuditProgramId((String)bsfnParams.getValue("szAuditProgramId"));
    internalVO.setCErrorFlag(bsfnParams.getValue("cErrorFlag").toString());
    internalVO.setSzErrorDescription((String)bsfnParams.getValue("szErrorDescription"));

    //return any errors, warnings, or informational messages to the caller
    return bsfnParams.getE1MessageList();
  }
}
