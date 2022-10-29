package pojo;

import com.fasterxml.jackson.annotation.*;

import java.util.*;

public class ResponseUpdate {

    @JsonProperty("result")
    private Boolean result;

    @JsonProperty("requestId")
    private String requestId;

    @JsonProperty("errors")
    private List<String> errors;


    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
