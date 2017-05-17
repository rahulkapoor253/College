package com.skeleton.model.profile1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rahulkapoor on 17/05/17.
 */

public class ItemsChooser {

    @SerializedName("Orientation")
    @Expose
    private List<String> orientation = null;
    @SerializedName("RelationshipHistory")
    @Expose
    private List<String> relationshipHistory = null;
    @SerializedName("Ethnicity")
    @Expose
    private List<String> ethnicity = null;
    @SerializedName("Religion")
    @Expose
    private List<String> religion = null;
    @SerializedName("BodyType")
    @Expose
    private List<String> bodyType = null;
    @SerializedName("Smoking")
    @Expose
    private List<String> smoking = null;
    @SerializedName("Drinking")
    @Expose
    private List<String> drinking = null;
    @SerializedName("Height")
    @Expose
    private List<String> height = null;

    public List<String> getOrientation() {
        return orientation;
    }

    public void setOrientation(List<String> orientation) {
        this.orientation = orientation;
    }

    public List<String> getRelationshipHistory() {
        return relationshipHistory;
    }

    public void setRelationshipHistory(List<String> relationshipHistory) {
        this.relationshipHistory = relationshipHistory;
    }

    public List<String> getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(List<String> ethnicity) {
        this.ethnicity = ethnicity;
    }

    public List<String> getReligion() {
        return religion;
    }

    public void setReligion(List<String> religion) {
        this.religion = religion;
    }

    public List<String> getBodyType() {
        return bodyType;
    }

    public void setBodyType(List<String> bodyType) {
        this.bodyType = bodyType;
    }

    public List<String> getSmoking() {
        return smoking;
    }

    public void setSmoking(List<String> smoking) {
        this.smoking = smoking;
    }

    public List<String> getDrinking() {
        return drinking;
    }

    public void setDrinking(List<String> drinking) {
        this.drinking = drinking;
    }

    public List<String> getHeight() {
        return height;
    }

    public void setHeight(List<String> height) {
        this.height = height;
    }

}
