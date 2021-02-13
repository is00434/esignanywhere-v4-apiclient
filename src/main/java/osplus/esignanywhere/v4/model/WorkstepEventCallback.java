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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Defines callbacks which are sent out from the WSC (WorkStepController).
 */
@ApiModel(description = "Defines callbacks which are sent out from the WSC (WorkStepController).")
@JsonPropertyOrder({
  WorkstepEventCallback.JSON_PROPERTY_URL,
  WorkstepEventCallback.JSON_PROPERTY_BLACKLIST,
  WorkstepEventCallback.JSON_PROPERTY_WHITE_LIST
})
@JsonTypeName("WorkstepEventCallback")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T11:25:21.496783+01:00[Europe/Berlin]")
public class WorkstepEventCallback {
  public static final String JSON_PROPERTY_URL = "Url";
  private String url;

  public static final String JSON_PROPERTY_BLACKLIST = "Blacklist";
  private List<String> blacklist = null;

  public static final String JSON_PROPERTY_WHITE_LIST = "WhiteList";
  private List<String> whiteList = null;


  public WorkstepEventCallback url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The callback URL.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The callback URL.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public WorkstepEventCallback blacklist(List<String> blacklist) {
    
    this.blacklist = blacklist;
    return this;
  }

  public WorkstepEventCallback addBlacklistItem(String blacklistItem) {
    if (this.blacklist == null) {
      this.blacklist = new ArrayList<String>();
    }
    this.blacklist.add(blacklistItem);
    return this;
  }

   /**
   * A list off callback types which are NOT sent.  An empty lists means are callback types should fire a callback.  You can either have a black OR white list.
   * @return blacklist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list off callback types which are NOT sent.  An empty lists means are callback types should fire a callback.  You can either have a black OR white list.")
  @JsonProperty(JSON_PROPERTY_BLACKLIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getBlacklist() {
    return blacklist;
  }


  public void setBlacklist(List<String> blacklist) {
    this.blacklist = blacklist;
  }


  public WorkstepEventCallback whiteList(List<String> whiteList) {
    
    this.whiteList = whiteList;
    return this;
  }

  public WorkstepEventCallback addWhiteListItem(String whiteListItem) {
    if (this.whiteList == null) {
      this.whiteList = new ArrayList<String>();
    }
    this.whiteList.add(whiteListItem);
    return this;
  }

   /**
   * A list of callbacks which should be sent.  An empty lists means are callback types should fire a callback.  You can either have a black OR white list.
   * @return whiteList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of callbacks which should be sent.  An empty lists means are callback types should fire a callback.  You can either have a black OR white list.")
  @JsonProperty(JSON_PROPERTY_WHITE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getWhiteList() {
    return whiteList;
  }


  public void setWhiteList(List<String> whiteList) {
    this.whiteList = whiteList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkstepEventCallback workstepEventCallback = (WorkstepEventCallback) o;
    return Objects.equals(this.url, workstepEventCallback.url) &&
        Objects.equals(this.blacklist, workstepEventCallback.blacklist) &&
        Objects.equals(this.whiteList, workstepEventCallback.whiteList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, blacklist, whiteList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkstepEventCallback {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    blacklist: ").append(toIndentedString(blacklist)).append("\n");
    sb.append("    whiteList: ").append(toIndentedString(whiteList)).append("\n");
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

