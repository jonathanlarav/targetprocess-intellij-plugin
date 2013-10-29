package com.switchfly.targetprocess.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Assignable {

    private final List<Comment> comments = new LinkedList<Comment>();

    @SerializedName("Id")
    private int id;
    @SerializedName("Name")
    private String name;
    @SerializedName("Description")
    private String description;
    @SerializedName("CreateDate")
    private Date createDate;
    @SerializedName("ModifyDate")
    private Date modifyDate;
    @SerializedName("EntityType")
    private TPObject entityType;
    @SerializedName("Project")
    private TPObject project;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public String getProjectName() {
        return project.name;
    }

    public String getEntityTypeName() {
        return entityType.name;
    }

    private class TPObject {
        @SerializedName("Name")
        private String name;
    }
}
