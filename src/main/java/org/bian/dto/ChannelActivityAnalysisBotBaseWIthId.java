package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ChannelActivityAnalysisBotBaseWIthId
 */
public class ChannelActivityAnalysisBotBaseWIthId   {
  private String channelActivityAnalysisReference = null;

  private String channelActivityServiceReference = null;

  private String channelActivityBotAnalysisAlgorithmReference = null;

  private String channelActivityBotAnalysisAlgorithmSpecification = null;

  private String channelActivityBotAnalysisReference = null;

  private String channelActivityBotAnalysisResult = null;


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
   * @return channelActivityBotAnalysisAlgorithmReference
  **/

  public String getChannelActivityBotAnalysisAlgorithmReference() {
    return channelActivityBotAnalysisAlgorithmReference;
  }

  public void setChannelActivityBotAnalysisAlgorithmReference(String channelActivityBotAnalysisAlgorithmReference) {
    this.channelActivityBotAnalysisAlgorithmReference = channelActivityBotAnalysisAlgorithmReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: Defines required data and results 
   * @return channelActivityBotAnalysisAlgorithmSpecification
  **/

  public String getChannelActivityBotAnalysisAlgorithmSpecification() {
    return channelActivityBotAnalysisAlgorithmSpecification;
  }

  public void setChannelActivityBotAnalysisAlgorithmSpecification(String channelActivityBotAnalysisAlgorithmSpecification) {
    this.channelActivityBotAnalysisAlgorithmSpecification = channelActivityBotAnalysisAlgorithmSpecification;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: Reference to analysis performed 
   * @return channelActivityBotAnalysisReference
  **/

  public String getChannelActivityBotAnalysisReference() {
    return channelActivityBotAnalysisReference;
  }

  public void setChannelActivityBotAnalysisReference(String channelActivityBotAnalysisReference) {
    this.channelActivityBotAnalysisReference = channelActivityBotAnalysisReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: output from the applied algorithm 
   * @return channelActivityBotAnalysisResult
  **/

  public String getChannelActivityBotAnalysisResult() {
    return channelActivityBotAnalysisResult;
  }

  public void setChannelActivityBotAnalysisResult(String channelActivityBotAnalysisResult) {
    this.channelActivityBotAnalysisResult = channelActivityBotAnalysisResult;
  }


}

