package com.example.retrofitsample;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Value {
    @SerializedName("BranchId")
    private int branchId;
    @SerializedName("BranchCode")
    private String branchCode;
    @SerializedName("BranchDesc")
    private String branchDesc;
    @SerializedName("CoId")
    private int coId;

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchDesc() {
        return branchDesc;
    }

    public void setBranchDesc(String branchDesc) {
        this.branchDesc = branchDesc;
    }

    public int getCoId() {
        return coId;
    }

    public void setCoId(int coId) {
        this.coId = coId;
    }
}
