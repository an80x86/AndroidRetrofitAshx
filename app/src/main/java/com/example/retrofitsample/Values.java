package com.example.retrofitsample;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Values {
    @SerializedName("Id")
    public int id;
    @SerializedName("Guid")
    public String guid;
    @SerializedName("Username")
    public String username;
    @SerializedName("Name")
    public String name;
    @SerializedName("Surname")
    public String surname;
    @SerializedName("FullName")
    public String fullName;
    @SerializedName("EmployeeId")
    public int employeeId;
    @SerializedName("RegisterId")
    public int registerId;
    @SerializedName("RegisterName")
    public Object registerName;
    @SerializedName("RegisterSurname")
    public Object registerSurname;
    @SerializedName("RegisterCode")
    public Object registerCode;
    @SerializedName("CommandList")
    public List<Object> commandList;
    @SerializedName("UserGroupList")
    public List<Object> userGroupList;
    @SerializedName("LicenceKey")
    public Object licenceKey;
    @SerializedName("CoId")
    public int coId;
    @SerializedName("CoCode")
    public String coCode;
    @SerializedName("CoDesc")
    public String coDesc;
    @SerializedName("BranchId")
    public int branchId;
    @SerializedName("BranchCode")
    public String branchCode;
    @SerializedName("BranchDesc")
    public String branchDesc;
    @SerializedName("UserGuid")
    public Object userGuid;
    @SerializedName("UserProfileId")
    public int userProfileId;
    @SerializedName("IsAdmin")
    public boolean isAdmin;

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
