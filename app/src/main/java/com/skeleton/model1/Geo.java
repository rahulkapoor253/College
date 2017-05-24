package com.skeleton.model1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by rahulkapoor on 04/05/17.
 */

public class Geo {

    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lng")
    @Expose
    private String lng;

    /**
     *
     * @return lat;
     */
    public String getLat() {
        return lat;
    }

    /**
     *
     * @param lat lat
     */
    public void setLat(final String lat) {
        this.lat = lat;
    }

    /**
     *
     * @return lng
     */
    public String getLng() {
        return lng;
    }

    /**
     *
     * @param lng lng
     */
    public void setLng(final String lng) {
        this.lng = lng;
    }

}