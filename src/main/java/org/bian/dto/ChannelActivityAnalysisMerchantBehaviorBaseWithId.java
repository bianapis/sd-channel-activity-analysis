package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ChannelActivityAnalysisMerchantBehaviorBaseWithId
 */
public class ChannelActivityAnalysisMerchantBehaviorBaseWithId   {
  private String channelActivityAnalysisReference = null;

  private String channelActivityServiceReference = null;

  private String channelActivityCustomerBehaviorAnalysisAlgorithmReference = null;

  private String channelActivityMerchantBehaviorAnalysisAlgorithmSpecification = null;

  private String channelActivityMerchantBehaviorAnalysisReference = null;

  private String channelActivityMerchantBehaviorAnalysisResult = null;


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
   * @return channelActivityCustomerBehaviorAnalysisAlgorithmReference
  **/

  public String getChannelActivityCustomerBehaviorAnalysisAlgorithmReference() {
    return channelActivityCustomerBehaviorAnalysisAlgorithmReference;
  }

  public void setChannelActivityCustomerBehaviorAnalysisAlgorithmReference(String channelActivityCustomerBehaviorAnalysisAlgorithmReference) {
    this.channelActivityCustomerBehaviorAnalysisAlgorithmReference = channelActivityCustomerBehaviorAnalysisAlgorithmReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: Defines required data and results 
   * @return channelActivityMerchantBehaviorAnalysisAlgorithmSpecification
  **/

  public String getChannelActivityMerchantBehaviorAnalysisAlgorithmSpecification() {
    return channelActivityMerchantBehaviorAnalysisAlgorithmSpecification;
  }

  public void setChannelActivityMerchantBehaviorAnalysisAlgorithmSpecification(String channelActivityMerchantBehaviorAnalysisAlgorithmSpecification) {
    this.channelActivityMerchantBehaviorAnalysisAlgorithmSpecification = channelActivityMerchantBehaviorAnalysisAlgorithmSpecification;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: Reference to analysis performed 
   * @return channelActivityMerchantBehaviorAnalysisReference
  **/

  public String getChannelActivityMerchantBehaviorAnalysisReference() {
    return channelActivityMerchantBehaviorAnalysisReference;
  }

  public void setChannelActivityMerchantBehaviorAnalysisReference(String channelActivityMerchantBehaviorAnalysisReference) {
    this.channelActivityMerchantBehaviorAnalysisReference = channelActivityMerchantBehaviorAnalysisReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: output from the applied algorithm 
   * @return channelActivityMerchantBehaviorAnalysisResult
  **/

  public String getChannelActivityMerchantBehaviorAnalysisResult() {
    return channelActivityMerchantBehaviorAnalysisResult;
  }

  public void setChannelActivityMerchantBehaviorAnalysisResult(String channelActivityMerchantBehaviorAnalysisResult) {
    this.channelActivityMerchantBehaviorAnalysisResult = channelActivityMerchantBehaviorAnalysisResult;
  }


}

