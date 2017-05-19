package com.skeleton.model.profile2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by rahulkapoor on 17/05/17.
 */

public class ProfileCategory {

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
     * @return ID;
     */
    public String getId() {
        return id;
    }

    /**
     * @param id set ID;
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * @return categoryType;
     */
    public String getCategoryType() {
        return categoryType;
    }

    /**
     * @param categoryType set categoryType;
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
     * @param updatedAt setupdateAt;
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
     * @param createdAt created At;
     */
    public void setCreatedAt(final String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return isdeleted;
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * @param isDeleted isdeleted;
     */
    public void setIsDeleted(final Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * @return picurl
     */
    public PicURL getPicURL() {
        return picURL;
    }

    /**
     * @param picURL set pickURL;
     */
    public void setPicURL(final PicURL picURL) {
        this.picURL = picURL;
    }

    /**
     * @return getname;
     */
    public String getName() {
        return name;
    }

    /**
     * @param name set name
     */
    public void setName(final String name) {
        this.name = name;
    }

}
