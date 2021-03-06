/*
 * eSignAnywhere.Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: V4.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package osplus.esignanywhere.v4.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Configuration of WorkstepIdStamp.
 */
@ApiModel(description = "Configuration of WorkstepIdStamp.")
@JsonPropertyOrder({
  WorkstepIdStampConfiguration.JSON_PROPERTY_REFERENCE_CORNER,
  WorkstepIdStampConfiguration.JSON_PROPERTY_COLOR,
  WorkstepIdStampConfiguration.JSON_PROPERTY_LOCATION
})
@JsonTypeName("WorkstepIdStampConfiguration")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T10:42:13.714738+01:00[Europe/Berlin]")
public class WorkstepIdStampConfiguration {
  /**
   * Defines the corner to reference.
   */
  public enum ReferenceCornerEnum {
    UPPER_RIGHT("Upper_Right"),
    
    UPPER_LEFT("Upper_Left"),
    
    LOWER_RIGHT("Lower_Right"),
    
    LOWER_LEFT("Lower_Left");

    private String value;

    ReferenceCornerEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReferenceCornerEnum fromValue(String value) {
      for (ReferenceCornerEnum b : ReferenceCornerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REFERENCE_CORNER = "ReferenceCorner";
  private ReferenceCornerEnum referenceCorner;

  public static final String JSON_PROPERTY_COLOR = "Color";
  private String color;

  public static final String JSON_PROPERTY_LOCATION = "Location";
  private WorkstepIdStampConfigurationLocation location;


  public WorkstepIdStampConfiguration referenceCorner(ReferenceCornerEnum referenceCorner) {
    
    this.referenceCorner = referenceCorner;
    return this;
  }

   /**
   * Defines the corner to reference.
   * @return referenceCorner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines the corner to reference.")
  @JsonProperty(JSON_PROPERTY_REFERENCE_CORNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReferenceCornerEnum getReferenceCorner() {
    return referenceCorner;
  }


  public void setReferenceCorner(ReferenceCornerEnum referenceCorner) {
    this.referenceCorner = referenceCorner;
  }


  public WorkstepIdStampConfiguration color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * Defines the color. (e.g. \&quot;blue\&quot;)
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines the color. (e.g. \"blue\")")
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    this.color = color;
  }


  public WorkstepIdStampConfiguration location(WorkstepIdStampConfigurationLocation location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WorkstepIdStampConfigurationLocation getLocation() {
    return location;
  }


  public void setLocation(WorkstepIdStampConfigurationLocation location) {
    this.location = location;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkstepIdStampConfiguration workstepIdStampConfiguration = (WorkstepIdStampConfiguration) o;
    return Objects.equals(this.referenceCorner, workstepIdStampConfiguration.referenceCorner) &&
        Objects.equals(this.color, workstepIdStampConfiguration.color) &&
        Objects.equals(this.location, workstepIdStampConfiguration.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceCorner, color, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkstepIdStampConfiguration {\n");
    sb.append("    referenceCorner: ").append(toIndentedString(referenceCorner)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

