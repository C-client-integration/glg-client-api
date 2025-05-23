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


/**
 * TrackingRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-29T19:02:02.404+06:00")
public class TrackingRequest   {
  @SerializedName("experimentId")
  private Long experimentId = null;

  @SerializedName("messageId")
  private Long messageId = null;

  @SerializedName("originalMessage")
  private String originalMessage = null;

  @SerializedName("userId")
  private String userId = null;

  public TrackingRequest experimentId(Long experimentId) {
    this.experimentId = experimentId;
    return this;
  }

   /**
   * Get experimentId
   * @return experimentId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getExperimentId() {
    return experimentId;
  }

  public void setExperimentId(Long experimentId) {
    this.experimentId = experimentId;
  }

  public TrackingRequest messageId(Long messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * Get messageId
   * @return messageId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getMessageId() {
    return messageId;
  }

  public void setMessageId(Long messageId) {
    this.messageId = messageId;
  }

  public TrackingRequest originalMessage(String originalMessage) {
    this.originalMessage = originalMessage;
    return this;
  }

   /**
   * Get originalMessage
   * @return originalMessage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOriginalMessage() {
    return originalMessage;
  }

  public void setOriginalMessage(String originalMessage) {
    this.originalMessage = originalMessage;
  }

  public TrackingRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackingRequest trackingRequest = (TrackingRequest) o;
    return Objects.equals(this.experimentId, trackingRequest.experimentId) &&
        Objects.equals(this.messageId, trackingRequest.messageId) &&
        Objects.equals(this.originalMessage, trackingRequest.originalMessage) &&
        Objects.equals(this.userId, trackingRequest.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId, messageId, originalMessage, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingRequest {\n");
    
    sb.append("    experimentId: ").append(toIndentedString(experimentId)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    originalMessage: ").append(toIndentedString(originalMessage)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

