package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ChannelActivityAnalysisDeviceErrorBaseWIthId
 */
public class ChannelActivityAnalysisDeviceErrorBaseWIthId   {
  private String channelActivityAnalysisReference = null;

  private String channelActivityDeviceErrorAnalysisAlgorithmReference = null;

  private String channelActivityDeviceErrorAnalysisAlgorithmSpecification = null;

  private String channelActivityDeviceErrorAnalysisReference = null;

  private String channelActivityDeviceErrorAnalysisResult = null;


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
   * @return channelActivityDeviceErrorAnalysisAlgorithmReference
  **/

  public String getChannelActivityDeviceErrorAnalysisAlgorithmReference() {
    return channelActivityDeviceErrorAnalysisAlgorithmReference;
  }

  public void setChannelActivityDeviceErrorAnalysisAlgorithmReference(String channelActivityDeviceErrorAnalysisAlgorithmReference) {
    this.channelActivityDeviceErrorAnalysisAlgorithmReference = channelActivityDeviceErrorAnalysisAlgorithmReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: Defines required data and results 
   * @return channelActivityDeviceErrorAnalysisAlgorithmSpecification
  **/

  public String getChannelActivityDeviceErrorAnalysisAlgorithmSpecification() {
    return channelActivityDeviceErrorAnalysisAlgorithmSpecification;
  }

  public void setChannelActivityDeviceErrorAnalysisAlgorithmSpecification(String channelActivityDeviceErrorAnalysisAlgorithmSpecification) {
    this.channelActivityDeviceErrorAnalysisAlgorithmSpecification = channelActivityDeviceErrorAnalysisAlgorithmSpecification;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: Reference to analysis performed 
   * @return channelActivityDeviceErrorAnalysisReference
  **/

  public String getChannelActivityDeviceErrorAnalysisReference() {
    return channelActivityDeviceErrorAnalysisReference;
  }

  public void setChannelActivityDeviceErrorAnalysisReference(String channelActivityDeviceErrorAnalysisReference) {
    this.channelActivityDeviceErrorAnalysisReference = channelActivityDeviceErrorAnalysisReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: output from the applied algorithm 
   * @return channelActivityDeviceErrorAnalysisResult
  **/

  public String getChannelActivityDeviceErrorAnalysisResult() {
    return channelActivityDeviceErrorAnalysisResult;
  }

  public void setChannelActivityDeviceErrorAnalysisResult(String channelActivityDeviceErrorAnalysisResult) {
    this.channelActivityDeviceErrorAnalysisResult = channelActivityDeviceErrorAnalysisResult;
  }


}

