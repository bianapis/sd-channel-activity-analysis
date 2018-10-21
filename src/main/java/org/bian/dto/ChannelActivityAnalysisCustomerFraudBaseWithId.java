package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ChannelActivityAnalysisCustomerFraudBaseWithId
 */
public class ChannelActivityAnalysisCustomerFraudBaseWithId   {
  private String channelActivityAnalysisReference = null;

  private String channelActivityCustomerFraudAnalysisAlgorithmReference = null;

  private String channelActivityCustomerFraudAnalysisAlgorithmSpecification = null;

  private String channelActivityCustomerFraudAnalysisReference = null;

  private String channelActivityCustomerFraudAnalysisResult = null;


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
   * @return channelActivityCustomerFraudAnalysisAlgorithmReference
  **/

  public String getChannelActivityCustomerFraudAnalysisAlgorithmReference() {
    return channelActivityCustomerFraudAnalysisAlgorithmReference;
  }

  public void setChannelActivityCustomerFraudAnalysisAlgorithmReference(String channelActivityCustomerFraudAnalysisAlgorithmReference) {
    this.channelActivityCustomerFraudAnalysisAlgorithmReference = channelActivityCustomerFraudAnalysisAlgorithmReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: Defines required data and results 
   * @return channelActivityCustomerFraudAnalysisAlgorithmSpecification
  **/

  public String getChannelActivityCustomerFraudAnalysisAlgorithmSpecification() {
    return channelActivityCustomerFraudAnalysisAlgorithmSpecification;
  }

  public void setChannelActivityCustomerFraudAnalysisAlgorithmSpecification(String channelActivityCustomerFraudAnalysisAlgorithmSpecification) {
    this.channelActivityCustomerFraudAnalysisAlgorithmSpecification = channelActivityCustomerFraudAnalysisAlgorithmSpecification;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: Reference to analysis performed 
   * @return channelActivityCustomerFraudAnalysisReference
  **/

  public String getChannelActivityCustomerFraudAnalysisReference() {
    return channelActivityCustomerFraudAnalysisReference;
  }

  public void setChannelActivityCustomerFraudAnalysisReference(String channelActivityCustomerFraudAnalysisReference) {
    this.channelActivityCustomerFraudAnalysisReference = channelActivityCustomerFraudAnalysisReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: output from the applied algorithm 
   * @return channelActivityCustomerFraudAnalysisResult
  **/

  public String getChannelActivityCustomerFraudAnalysisResult() {
    return channelActivityCustomerFraudAnalysisResult;
  }

  public void setChannelActivityCustomerFraudAnalysisResult(String channelActivityCustomerFraudAnalysisResult) {
    this.channelActivityCustomerFraudAnalysisResult = channelActivityCustomerFraudAnalysisResult;
  }


}

