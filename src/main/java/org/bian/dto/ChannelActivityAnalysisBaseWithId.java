package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ChannelActivityAnalysisBaseWithId
 */
public class ChannelActivityAnalysisBaseWithId   {
  private String channelActivityAnalysisReference = null;

  private String channelType = null;

  private String channelActivityFromToAnalysis = null;

  private String channelActivityAnalysisType = null;

  private String channelActivityAnalysisResult = null;

  private Object channelActivityAnalysisRecord = null;

  private Object channelActivityHistoryReport = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return channelType
  **/

  public String getChannelType() {
    return channelType;
  }

  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Date 
   * @return channelActivityFromToAnalysis
  **/

  public String getChannelActivityFromToAnalysis() {
    return channelActivityFromToAnalysis;
  }

  public void setChannelActivityFromToAnalysis(String channelActivityFromToAnalysis) {
    this.channelActivityFromToAnalysis = channelActivityFromToAnalysis;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return channelActivityAnalysisType
  **/

  public String getChannelActivityAnalysisType() {
    return channelActivityAnalysisType;
  }

  public void setChannelActivityAnalysisType(String channelActivityAnalysisType) {
    this.channelActivityAnalysisType = channelActivityAnalysisType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: Refers to results from any type of analysis listed below 
   * @return channelActivityAnalysisResult
  **/

  public String getChannelActivityAnalysisResult() {
    return channelActivityAnalysisResult;
  }

  public void setChannelActivityAnalysisResult(String channelActivityAnalysisResult) {
    this.channelActivityAnalysisResult = channelActivityAnalysisResult;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: combines results of analysis in a single record 
   * @return channelActivityAnalysisRecord
  **/

  public Object getChannelActivityAnalysisRecord() {
    return channelActivityAnalysisRecord;
  }

  public void setChannelActivityAnalysisRecord(Object channelActivityAnalysisRecord) {
    this.channelActivityAnalysisRecord = channelActivityAnalysisRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: Report extracting channel activity records for analysis retrieved from SD-Channel Activity History 
   * @return channelActivityHistoryReport
  **/

  public Object getChannelActivityHistoryReport() {
    return channelActivityHistoryReport;
  }

  public void setChannelActivityHistoryReport(Object channelActivityHistoryReport) {
    this.channelActivityHistoryReport = channelActivityHistoryReport;
  }


}

