package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ChannelActivityAnalysisCustomerBehaviorBaseWIthId
 */
public class ChannelActivityAnalysisCustomerBehaviorBaseWIthId   {
  private String channelActivityAnalysisReference = null;

  private String channelActivityServiceReference = null;

  private String channelActivityCustomerBehaviorAnalysisAlgorithmReference = null;

  private String channelActivityCustomerBehaviorAnalysisAlgorithmSpecification = null;

  private String channelActivityCustomerBehaviorAnalysisReference = null;

  private String channelActivityCustomerBehaviorAnalysisResult = null;


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
   * @return channelActivityCustomerBehaviorAnalysisAlgorithmSpecification
  **/

  public String getChannelActivityCustomerBehaviorAnalysisAlgorithmSpecification() {
    return channelActivityCustomerBehaviorAnalysisAlgorithmSpecification;
  }

  public void setChannelActivityCustomerBehaviorAnalysisAlgorithmSpecification(String channelActivityCustomerBehaviorAnalysisAlgorithmSpecification) {
    this.channelActivityCustomerBehaviorAnalysisAlgorithmSpecification = channelActivityCustomerBehaviorAnalysisAlgorithmSpecification;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: Reference to analysis performed 
   * @return channelActivityCustomerBehaviorAnalysisReference
  **/

  public String getChannelActivityCustomerBehaviorAnalysisReference() {
    return channelActivityCustomerBehaviorAnalysisReference;
  }

  public void setChannelActivityCustomerBehaviorAnalysisReference(String channelActivityCustomerBehaviorAnalysisReference) {
    this.channelActivityCustomerBehaviorAnalysisReference = channelActivityCustomerBehaviorAnalysisReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: output from the applied algorithm 
   * @return channelActivityCustomerBehaviorAnalysisResult
  **/

  public String getChannelActivityCustomerBehaviorAnalysisResult() {
    return channelActivityCustomerBehaviorAnalysisResult;
  }

  public void setChannelActivityCustomerBehaviorAnalysisResult(String channelActivityCustomerBehaviorAnalysisResult) {
    this.channelActivityCustomerBehaviorAnalysisResult = channelActivityCustomerBehaviorAnalysisResult;
  }


}

