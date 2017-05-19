package com.skeleton.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by rahulkapoor on 16/05/17.
 */

public class PicURL {

    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("original")
    @Expose
    private String original;

    /**
     * @return thumbnail;
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * @param thumbnail set Thumbnail;
     */
    public void setThumbnail(final String thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * @return original;
     */
    public String getOriginal() {
        return original;
    }

    /**
     * @param original set original;
     */
    public void setOriginal(final String original) {
        this.original = original;
    }

}
