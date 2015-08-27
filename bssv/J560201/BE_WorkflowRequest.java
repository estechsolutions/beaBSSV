package be.e1.bssv.J560201;

import be.e1.bssv.J560201.com.beaerospace.approvalgateway.ApprovalGatewayReply;
import be.e1.bssv.J560201.com.beaerospace.approvalgateway.ApprovalGatewayRequest;
import be.e1.bssv.J560201.proxy.ProcessApprovalGatewayPortClient;
import be.e1.bssv.J560201.valueobject.WrkFlowReq_D5602000F;

import oracle.e1.bssvfoundation.base.BusinessService;
import oracle.e1.bssvfoundation.base.IContext;
import oracle.e1.bssvfoundation.connection.IConnection;
import oracle.e1.bssvfoundation.util.E1MessageList;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc for BusinessService
 */
public abstract class BE_WorkflowRequest
  extends BusinessService
{
  /**
   * TODO: Create Java Doc for: InternalWorkflowRequest_B5602000
   * Method InternalWorkflowRequest_B5602000 is used for...?
   * @param context conditionally provides the connection for the database operation and logging information
   * @param connection can either be an explicit connection or null. If null the default connection is used.
   * @param internalVO represents data that is passed to EnterpriseOne for processing TODO: complete javadoc for VO.
   * @return an E1Message containing the text of any errors or warnings that may have occurred
   */
  public static E1MessageList InternalWorkflowRequest_B5602000(IContext context, IConnection connection, WrkFlowReq_D5602000F internalVO)
  {

    //Call start internal method, passing the context (which was passed from PublishedBusinessService).
    startInternalMethod(context, "InternalWorkflowRequest_B5602000", internalVO);
    //Create new message list for BusinessService processing.
    E1MessageList messages = new E1MessageList();

    //TODO: call method (created by the wizard), which then executes Business Function or Database operation.
    ApprovalGatewayRequest request = new ApprovalGatewayRequest();
    request.setMessageId(internalVO.getMnMessageId().intValue());
    request.setOriginalProcess(internalVO.getSzProcessOrigin());
    request.setProcessType(internalVO.getSzProcessType());
    request.setProcessPayload(internalVO.getSzPayload());
    
    try
    {
      ProcessApprovalGatewayPortClient client = new ProcessApprovalGatewayPortClient();
      ApprovalGatewayReply reply = client.process(request);  
      internalVO.setCStatusFlag(Integer.toString(reply.getStatus()));
      internalVO.setSzStatusMessage(reply.getMessage());
      internalVO.setSzCompositeId(reply.getInstanceId());
    }
    catch(Exception exp)
    {
      internalVO.setCStatusFlag("1");
      internalVO.setSzStatusMessage("Call to web-service proxy failed");
    }

    //Call finish internal method passing context.
    finishInternalMethod(context, "InternalWorkflowRequest_B5602000");

    //Call finish internal method passing context.
    return messages;
  }
}
