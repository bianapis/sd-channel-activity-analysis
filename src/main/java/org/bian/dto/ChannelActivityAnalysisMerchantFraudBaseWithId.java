package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ChannelActivityAnalysisMerchantFraudBaseWithId
 */
public class ChannelActivityAnalysisMerchantFraudBaseWithId   {
  private String channelActivityAnalysisReference = null;

  private String channelActivityServiceReference = null;

  private String channelActivityMerchantFraudAnalysisAlgorithmReference = null;

  private String channelActivityMerchantFraudAnalysisAlgorithmSpecification = null;

  private String channelActivityMerchantFraudAnalysisReference = null;

  private String channelActivityMerchantFraudAnalysisResult = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return channelActivityAnalysisReference
  **/

  public String getChannelActivityAnalysisReference() {
    return channelActivityAnalysisReference;
  }

  public void setChannelActivityAnalysisReference(String channelActivityAnalysisReference) {
    this.channelActivityAnalysisReference = channelActivityAnalysisReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return channelActivityServiceReference
  **/

  public String getChannelActivityServiceReference() {
    return channelActivityServiceReference;
  }

  public void setChannelActivityServiceReference(String channelActivityServiceReference) {
    this.channelActivityServiceReference = channelActivityServiceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return channelActivityMerchantFraudAnalysisAlgorithmReference
  **/

  public String getChannelActivityMerchantFraudAnalysisAlgorithmReference() {
    return channelActivityMerchantFraudAnalysisAlgorithmReference;
  }

  public void setChannelActivityMerchantFraudAnalysisAlgorithmReference(String channelActivityMerchantFraudAnalysisAlgorithmReference) {
    this.channelActivityMerchantFraudAnalysisAlgorithmReference = channelActivityMerchantFraudAnalysisAlgorithmReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: Defines required data and results 
   * @return channelActivityMerchantFraudAnalysisAlgorithmSpecification
  **/

  public String getChannelActivityMerchantFraudAnalysisAlgorithmSpecification() {
    return channelActivityMerchantFraudAnalysisAlgorithmSpecification;
  }

  public void setChannelActivityMerchantFraudAnalysisAlgorithmSpecification(String channelActivityMerchantFraudAnalysisAlgorithmSpecification) {
    this.channelActivityMerchantFraudAnalysisAlgorithmSpecification = channelActivityMerchantFraudAnalysisAlgorithmSpecification;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: Reference to analysis performed 
   * @return channelActivityMerchantFraudAnalysisReference
  **/

  public String getChannelActivityMerchantFraudAnalysisReference() {
    return channelActivityMerchantFraudAnalysisReference;
  }

  public void setChannelActivityMerchantFraudAnalysisReference(String channelActivityMerchantFraudAnalysisReference) {
    this.channelActivityMerchantFraudAnalysisReference = channelActivityMerchantFraudAnalysisReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: output from the applied algorithm 
   * @return channelActivityMerchantFraudAnalysisResult
  **/

  public String getChannelActivityMerchantFraudAnalysisResult() {
    return channelActivityMerchantFraudAnalysisResult;
  }

  public void setChannelActivityMerchantFraudAnalysisResult(String channelActivityMerchantFraudAnalysisResult) {
    this.channelActivityMerchantFraudAnalysisResult = channelActivityMerchantFraudAnalysisResult;
  }


}

