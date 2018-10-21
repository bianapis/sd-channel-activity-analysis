/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ChannelActivityAnalysisApiServiceImpl implements ChannelActivityAnalysisApiService {

	public GenericRecordActionResponse record(String crReferenceId, GenericRecordActionRequest request){
		return JsonReader.read("record-GenericRecordActionResponse.json",new TypeReference<GenericRecordActionResponse>(){});
	}
	
	public ChannelActivityAnalysisBaseWithId requestPost(ChannelActivityAnalysisBase request){
		return JsonReader.read("requestPost-ChannelActivityAnalysisBaseWithId.json",new TypeReference<ChannelActivityAnalysisBaseWithId>(){});
	}
	
	public ChannelActivityAnalysisBaseWithId requestPut(String crReferenceId, ChannelActivityAnalysisBase request){
		return JsonReader.read("requestPut-ChannelActivityAnalysisBaseWithId.json",new TypeReference<ChannelActivityAnalysisBaseWithId>(){});
	}
	
	public ChannelActivityAnalysisBaseWithId retrieve(String crReferenceId){
		return JsonReader.read("retrieve-ChannelActivityAnalysisBaseWithId.json",new TypeReference<ChannelActivityAnalysisBaseWithId>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public ChannelActivityAnalysisBotBaseWIthId retrieveBots(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ChannelActivityAnalysisBotBaseWIthId.json",new TypeReference<ChannelActivityAnalysisBotBaseWIthId>(){});
	}
	
	public ChannelActivityAnalysisCustomerBehaviorBaseWIthId retrieveCustomersBehaviors(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ChannelActivityAnalysisCustomerBehaviorBaseWIthId.json",new TypeReference<ChannelActivityAnalysisCustomerBehaviorBaseWIthId>(){});
	}
	
	public ChannelActivityAnalysisCustomerFraudBaseWithId retrieveCustomersFrauds(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ChannelActivityAnalysisCustomerFraudBaseWithId.json",new TypeReference<ChannelActivityAnalysisCustomerFraudBaseWithId>(){});
	}
	
	public ChannelActivityAnalysisDeviceErrorBaseWIthId retrieveDevicesErrors(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ChannelActivityAnalysisDeviceErrorBaseWIthId.json",new TypeReference<ChannelActivityAnalysisDeviceErrorBaseWIthId>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public ChannelActivityAnalysisMerchantBehaviorBaseWithId retrieveMerchantsBehaviors(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ChannelActivityAnalysisMerchantBehaviorBaseWithId.json",new TypeReference<ChannelActivityAnalysisMerchantBehaviorBaseWithId>(){});
	}
	
	public ChannelActivityAnalysisMerchantFraudBaseWithId retrieveMerchantsFrauds(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ChannelActivityAnalysisMerchantFraudBaseWithId.json",new TypeReference<ChannelActivityAnalysisMerchantFraudBaseWithId>(){});
	}
	
}
