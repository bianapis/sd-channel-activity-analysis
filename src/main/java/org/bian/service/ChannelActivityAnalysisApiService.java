/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ChannelActivityAnalysisApiService {

	GenericRecordActionResponse record(String crReferenceId, GenericRecordActionRequest request);
	
	ChannelActivityAnalysisBaseWithId requestPost(ChannelActivityAnalysisBase request);
	
	ChannelActivityAnalysisBaseWithId requestPut(String crReferenceId, ChannelActivityAnalysisBase request);
	
	ChannelActivityAnalysisBaseWithId retrieve(String crReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	ChannelActivityAnalysisBotBaseWIthId retrieveBots(String crReferenceId, String bqReferenceId);
	
	ChannelActivityAnalysisCustomerBehaviorBaseWIthId retrieveCustomersBehaviors(String crReferenceId, String bqReferenceId);
	
	ChannelActivityAnalysisCustomerFraudBaseWithId retrieveCustomersFrauds(String crReferenceId, String bqReferenceId);
	
	ChannelActivityAnalysisDeviceErrorBaseWIthId retrieveDevicesErrors(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	ChannelActivityAnalysisMerchantBehaviorBaseWithId retrieveMerchantsBehaviors(String crReferenceId, String bqReferenceId);
	
	ChannelActivityAnalysisMerchantFraudBaseWithId retrieveMerchantsFrauds(String crReferenceId, String bqReferenceId);
	
}
