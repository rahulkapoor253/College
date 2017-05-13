package com.skeleton.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rahulkapoor on 09/05/17.
 */

public class CurrentLocation {

    @SerializedName("coordinates")
    @Expose
    private List<Integer> coordinates = null;

    /**
     * @return return
     */
    public List<Integer> getCoordinates() {
        return coordinates;
    }

    /**
     * @param coordinates coordinates
     */
    public void setCoordinates(final List<Integer> coordinates) {
        this.coordinates = coordinates;
    }

}
