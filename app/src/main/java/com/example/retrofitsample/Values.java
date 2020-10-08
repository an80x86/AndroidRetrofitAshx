package com.example.retrofitsample;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Values {
    @SerializedName("Id")
    private int id;
    @SerializedName("Guid")
    private String guid;
    @SerializedName("Username")
    private String username;
    @SerializedName("Name")
    private String name;
    @SerializedName("Surname")
    private String surname;
    @SerializedName("FullName")
    private String fullName;
    @SerializedName("EmployeeId")
    private int employeeId;
    @SerializedName("RegisterId")
    private int registerId;
    @SerializedName("RegisterName")
    private Object registerName;
    @SerializedName("RegisterSurname")
    private Object registerSurname;
    @SerializedName("RegisterCode")
    private Object registerCode;
    @SerializedName("CommandList")
    private List<Object> commandList;
    @SerializedName("UserGroupList")
    private List<Object> userGroupList;
    @SerializedName("LicenceKey")
    private Object licenceKey;
    @SerializedName("CoId")
    private int coId;
    @SerializedName("CoCode")
    private String coCode;
    @SerializedName("CoDesc")
    private String coDesc;
    @SerializedName("BranchId")
    private int branchId;
    @SerializedName("BranchCode")
    private String branchCode;
    @SerializedName("BranchDesc")
    private String branchDesc;
    @SerializedName("UserGuid")
    private Object userGuid;
    @SerializedName("UserProfileId")
    private int userProfileId;
    @SerializedName("IsAdmin")
    private boolean isAdmin;

    public int getId() {
        return id;
    }

    public String getGuid() {
        return guid;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFullName() {
        return fullName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public int getRegisterId() {
        return registerId;
    }

    public Object getRegisterName() {
        return registerName;
    }

    public Object getRegisterSurname() {
        return registerSurname;
    }

    public Object getRegisterCode() {
        return registerCode;
    }

    public List<Object> getCommandList() {
        return commandList;
    }

    public List<Object> getUserGroupList() {
        return userGroupList;
    }

    public Object getLicenceKey() {
        return licenceKey;
    }

    public int getCoId() {
        return coId;
    }

    public String getCoCode() {
        return coCode;
    }

    public String getCoDesc() {
        return coDesc;
    }

    public int getBranchId() {
        return branchId;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public String getBranchDesc() {
        return branchDesc;
    }

    public Object getUserGuid() {
        return userGuid;
    }

    public int getUserProfileId() {
        return userProfileId;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
