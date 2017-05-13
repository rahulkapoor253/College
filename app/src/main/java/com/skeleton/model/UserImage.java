package com.skeleton.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by rahulkapoor on 09/05/17.
 */

public class UserImage {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("original")
    @Expose
    private String original;

    /**
     * @return return
     */
    public String getId() {
        return id;
    }

    /**
     * @param id id
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * @return return
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * @param thumbnail thumbnail
     */
    public void setThumbnail(final String thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * @return return
     */
    public String getOriginal() {
        return original;
    }

    /**
     * @param original original
     */
    public void setOriginal(final String original) {
        this.original = original;
    }

}