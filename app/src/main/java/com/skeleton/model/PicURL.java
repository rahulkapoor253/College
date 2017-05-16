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

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

}
