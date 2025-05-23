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
 * DayOfWeekStats
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-29T19:02:02.404+06:00")
public class DayOfWeekStats   {
  @SerializedName("conversion")
  private Long conversion = null;

  @SerializedName("percentage")
  private Double percentage = null;

  @SerializedName("reach")
  private Long reach = null;

  @SerializedName("target")
  private Long target = null;

  public DayOfWeekStats conversion(Long conversion) {
    this.conversion = conversion;
    return this;
  }

   /**
   * Get conversion
   * @return conversion
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getConversion() {
    return conversion;
  }

  public void setConversion(Long conversion) {
    this.conversion = conversion;
  }

  public DayOfWeekStats percentage(Double percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getPercentage() {
    return percentage;
  }

  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }

  public DayOfWeekStats reach(Long reach) {
    this.reach = reach;
    return this;
  }

   /**
   * Get reach
   * @return reach
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getReach() {
    return reach;
  }

  public void setReach(Long reach) {
    this.reach = reach;
  }

  public DayOfWeekStats target(Long target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTarget() {
    return target;
  }

  public void setTarget(Long target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DayOfWeekStats dayOfWeekStats = (DayOfWeekStats) o;
    return Objects.equals(this.conversion, dayOfWeekStats.conversion) &&
        Objects.equals(this.percentage, dayOfWeekStats.percentage) &&
        Objects.equals(this.reach, dayOfWeekStats.reach) &&
        Objects.equals(this.target, dayOfWeekStats.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversion, percentage, reach, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DayOfWeekStats {\n");
    
    sb.append("    conversion: ").append(toIndentedString(conversion)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    reach: ").append(toIndentedString(reach)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

