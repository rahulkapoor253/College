package com.skeleton.model.profile2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rahulkapoor on 17/05/17.
 */

public class ProfileData {

    @SerializedName("categories")
    @Expose
    private List<ProfileCategory> categories = null;

    /**
     * @return categories;
     */
    public List<ProfileCategory> getCategories() {
        return categories;
    }

    /**
     * @param categories set Categories;
     */
    public void setCategories(final List<ProfileCategory> categories) {
        this.categories = categories;
    }


}
