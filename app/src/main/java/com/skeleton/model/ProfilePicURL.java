package com.skeleton.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by rahulkapoor on 09/05/17.
 */

public class ProfilePicURL {

    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("original")
    @Expose
    private String original;

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