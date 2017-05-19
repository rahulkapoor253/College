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

    /**
     * @return return orientation;
     */
    public List<String> getOrientation() {
        return orientation;
    }

    /**
     * @param orientation set orientation;
     */
    public void setOrientation(final List<String> orientation) {
        this.orientation = orientation;
    }

    /**
     * @return relationship history;
     */
    public List<String> getRelationshipHistory() {
        return relationshipHistory;
    }

    /**
     * @param relationshipHistory set relationshiphistory;
     */
    public void setRelationshipHistory(final List<String> relationshipHistory) {
        this.relationshipHistory = relationshipHistory;
    }

    /**
     * @return ethnicity;
     */
    public List<String> getEthnicity() {
        return ethnicity;
    }

    /**
     * @param ethnicity set ethnicity;
     */
    public void setEthnicity(final List<String> ethnicity) {
        this.ethnicity = ethnicity;
    }

    /**
     * @return religion;
     */
    public List<String> getReligion() {
        return religion;
    }

    /**
     * @param religion
     */
    public void setReligion(final List<String> religion) {
        this.religion = religion;
    }

    /**
     * @return bodytype;
     */
    public List<String> getBodyType() {
        return bodyType;
    }

    /**
     * @param bodyType set bodyType;
     */
    public void setBodyType(final List<String> bodyType) {
        this.bodyType = bodyType;
    }

    /**
     * @return smoking;
     */
    public List<String> getSmoking() {
        return smoking;
    }

    /**
     * @param smoking set smoking;
     */
    public void setSmoking(final List<String> smoking) {
        this.smoking = smoking;
    }

    /**
     * @return drinking;
     */
    public List<String> getDrinking() {
        return drinking;
    }

    /**
     * @param drinking set drinking;
     */
    public void setDrinking(final List<String> drinking) {
        this.drinking = drinking;
    }

    /**
     * @return height;
     */
    public List<String> getHeight() {
        return height;
    }

    /**
     * @param height set height;
     */
    public void setHeight(final List<String> height) {
        this.height = height;
    }

}
