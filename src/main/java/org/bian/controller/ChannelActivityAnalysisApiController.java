/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Analyze;

@BianRestController
public class ChannelActivityAnalysisApiController {

	@Autowired
	ChannelActivityAnalysisApiService service;
	
	@Analyze.Record
	public BianResponse<GenericRecordActionResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<GenericRecordActionRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Analyze.RequestPost
	public BianResponse<ChannelActivityAnalysisBaseWithId> requestPost(@RequestBody BianRequest<ChannelActivityAnalysisBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Analyze.RequestPut
	public BianResponse<ChannelActivityAnalysisBaseWithId> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ChannelActivityAnalysisBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@Analyze.Retrieve
	public BianResponse<ChannelActivityAnalysisBaseWithId> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Analyze.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Analyze.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("bots")
	@Analyze.Retrieve
	public BianResponse<ChannelActivityAnalysisBotBaseWIthId> retrieveBots(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBots(crReferenceId, bqReferenceId));
	}
	
	@BQ("customers-behaviors")
	@Analyze.Retrieve
	public BianResponse<ChannelActivityAnalysisCustomerBehaviorBaseWIthId> retrieveCustomersBehaviors(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCustomersBehaviors(crReferenceId, bqReferenceId));
	}
	
	@BQ("customers-frauds")
	@Analyze.Retrieve
	public BianResponse<ChannelActivityAnalysisCustomerFraudBaseWithId> retrieveCustomersFrauds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCustomersFrauds(crReferenceId, bqReferenceId));
	}
	
	@BQ("devices-errors")
	@Analyze.Retrieve
	public BianResponse<ChannelActivityAnalysisDeviceErrorBaseWIthId> retrieveDevicesErrors(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDevicesErrors(crReferenceId, bqReferenceId));
	}
	
	@Analyze.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("merchants-behaviors")
	@Analyze.Retrieve
	public BianResponse<ChannelActivityAnalysisMerchantBehaviorBaseWithId> retrieveMerchantsBehaviors(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveMerchantsBehaviors(crReferenceId, bqReferenceId));
	}
	
	@BQ("merchants-frauds")
	@Analyze.Retrieve
	public BianResponse<ChannelActivityAnalysisMerchantFraudBaseWithId> retrieveMerchantsFrauds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveMerchantsFrauds(crReferenceId, bqReferenceId));
	}
	
}
