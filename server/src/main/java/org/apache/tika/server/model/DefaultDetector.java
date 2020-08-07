package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DefaultDetectorChildren;
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

public class DefaultDetector  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<DefaultDetectorChildren> children = null;

  @ApiModelProperty(example = "true", value = "")
  private Boolean composite;

  @ApiModelProperty(example = "org.apache.tika.detect.DefaultDetector", value = "")
  private String name;
 /**
   * Get children
   * @return children
  **/
  @JsonProperty("children")
  public List<DefaultDetectorChildren> getChildren() {
    return children;
  }

  public void setChildren(List<DefaultDetectorChildren> children) {
    this.children = children;
  }

  public DefaultDetector children(List<DefaultDetectorChildren> children) {
    this.children = children;
    return this;
  }

  public DefaultDetector addChildrenItem(DefaultDetectorChildren childrenItem) {
    this.children.add(childrenItem);
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

  public DefaultDetector composite(Boolean composite) {
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

  public DefaultDetector name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultDetector {\n");
    
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    composite: ").append(toIndentedString(composite)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

