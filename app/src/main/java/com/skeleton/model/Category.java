package com.skeleton.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by rahulkapoor on 16/05/17.
 */

public class Category {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("categoryType")
    @Expose
    private String categoryType;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("isDeleted")
    @Expose
    private Boolean isDeleted;
    @SerializedName("picURL")
    @Expose
    private PicURL picURL;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id set ID
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * @return category type;
     */
    public String getCategoryType() {
        return categoryType;
    }

    /**
     * @param categoryType setCategoryType;
     */
    public void setCategoryType(final String categoryType) {
        this.categoryType = categoryType;
    }

    /**
     * @return updateAt;
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt set UpdateAt;
     */
    public void setUpdatedAt(final String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return created At;
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt setCreated At;
     */
    public void setCreatedAt(final String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return idDelted;
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * @param isDeleted set IsDeleted;
     */
    public void setIsDeleted(final Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * @return picURl;
     */
    public PicURL getPicURL() {
        return picURL;
    }

    /**
     * @param picURL setPicURL;
     */
    public void setPicURL(final PicURL picURL) {
        this.picURL = picURL;
    }

    /**
     * @return name;
     */
    public String getName() {
        return name;
    }

    /**
     * @param name set name;
     */
    public void setName(final String name) {
        this.name = name;
    }

}
