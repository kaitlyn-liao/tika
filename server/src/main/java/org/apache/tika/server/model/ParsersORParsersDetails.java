package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ParsersORParsersDetailsChildren;
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

public class ParsersORParsersDetails  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<ParsersORParsersDetailsChildren> children = null;
 /**
   * Get children
   * @return children
  **/
  @JsonProperty("children")
  public List<ParsersORParsersDetailsChildren> getChildren() {
    return children;
  }

  public void setChildren(List<ParsersORParsersDetailsChildren> children) {
    this.children = children;
  }

  public ParsersORParsersDetails children(List<ParsersORParsersDetailsChildren> children) {
    this.children = children;
    return this;
  }

  public ParsersORParsersDetails addChildrenItem(ParsersORParsersDetailsChildren childrenItem) {
    this.children.add(childrenItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParsersORParsersDetails {\n");
    
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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

