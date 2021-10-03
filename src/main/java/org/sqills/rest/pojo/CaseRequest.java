package org.sqills.rest.pojo;

import java.io.Serializable;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "inputStr"
})
@Generated("jsonschema2pojo")
public class CaseRequest implements Serializable {

    @JsonProperty("inputStr")
    private String inputStr;
    private final static long serialVersionUID = -6831391334765736520L;

    @JsonProperty("inputStr")
    public String getInputStr() {
        return inputStr;
    }

    @JsonProperty("inputStr")
    public void setInputStr(String inputStr) {
        this.inputStr = inputStr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaseRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("inputStr");
        sb.append('=');
        sb.append(((this.inputStr == null)?"<null>":this.inputStr));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }
}