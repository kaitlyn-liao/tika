package org.openapitools.model;

import org.openapitools.model.ParsersORParsersDetails;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ParsersORParsersDetailsChildren  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ParsersORParsersDetails children;

  @ApiModelProperty(example = "true", value = "")
  private Boolean composite;

  @ApiModelProperty(example = "org.apache.tika.parser.apple.AppleSingleFileParser", value = "")
  private String name;

  @ApiModelProperty(example = "true", value = "")
  private Boolean decorated;
 /**
   * Get children
   * @return children
  **/
  @JsonProperty("children")
  public ParsersORParsersDetails getChildren() {
    return children;
  }

  public void setChildren(ParsersORParsersDetails children) {
    this.children = children;
  }

  public ParsersORParsersDetailsChildren children(ParsersORParsersDetails children) {
    this.children = children;
    return this;
  }

 /**
   * Get composite
   * @return composite
  **/
  @JsonProperty("composite")
  public Boolean getComposite() {
    return composite;
  }

  public void setComposite(Boolean composite) {
    this.composite = composite;
  }

  public ParsersORParsersDetailsChildren composite(Boolean composite) {
    this.composite = composite;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ParsersORParsersDetailsChildren name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get decorated
   * @return decorated
  **/
  @JsonProperty("decorated")
  public Boolean getDecorated() {
    return decorated;
  }

  public void setDecorated(Boolean decorated) {
    this.decorated = decorated;
  }

  public ParsersORParsersDetailsChildren decorated(Boolean decorated) {
    this.decorated = decorated;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParsersORParsersDetailsChildren {\n");
    
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    composite: ").append(toIndentedString(composite)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    decorated: ").append(toIndentedString(decorated)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

