/**
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.MessageReportDto;
import java.util.ArrayList;
import java.util.List;


/**
 * ReportIterationDto
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-29T19:02:02.404+06:00")
public class ReportIterationDto   {
  @SerializedName("iterationId")
  private Long iterationId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("reportMessages")
  private List<MessageReportDto> reportMessages = new ArrayList<MessageReportDto>();

  public ReportIterationDto iterationId(Long iterationId) {
    this.iterationId = iterationId;
    return this;
  }

   /**
   * Get iterationId
   * @return iterationId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getIterationId() {
    return iterationId;
  }

  public void setIterationId(Long iterationId) {
    this.iterationId = iterationId;
  }

  public ReportIterationDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ReportIterationDto reportMessages(List<MessageReportDto> reportMessages) {
    this.reportMessages = reportMessages;
    return this;
  }

  public ReportIterationDto addReportMessagesItem(MessageReportDto reportMessagesItem) {
    this.reportMessages.add(reportMessagesItem);
    return this;
  }

   /**
   * Get reportMessages
   * @return reportMessages
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<MessageReportDto> getReportMessages() {
    return reportMessages;
  }

  public void setReportMessages(List<MessageReportDto> reportMessages) {
    this.reportMessages = reportMessages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportIterationDto reportIterationDto = (ReportIterationDto) o;
    return Objects.equals(this.iterationId, reportIterationDto.iterationId) &&
        Objects.equals(this.name, reportIterationDto.name) &&
        Objects.equals(this.reportMessages, reportIterationDto.reportMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iterationId, name, reportMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportIterationDto {\n");
    
    sb.append("    iterationId: ").append(toIndentedString(iterationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reportMessages: ").append(toIndentedString(reportMessages)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

