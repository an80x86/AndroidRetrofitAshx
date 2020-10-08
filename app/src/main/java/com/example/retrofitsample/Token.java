package com.example.retrofitsample;

import com.google.gson.annotations.SerializedName;

public class Token {
    @SerializedName("Success")
    private boolean success;
    @SerializedName("Message")
    private String message;

    @SerializedName("Values")
    private Values values;

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public Values getValues() {
        return values;
    }

    //public void setValues(Values values) {
    //    this.values = values;
    //}
}
