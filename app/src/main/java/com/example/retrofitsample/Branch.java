package com.example.retrofitsample;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Branch {
    @SerializedName("Success")
    private boolean success;
    @SerializedName("Message")
    private String message;
    @SerializedName("Values")
    private List<Value> values;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }
}
