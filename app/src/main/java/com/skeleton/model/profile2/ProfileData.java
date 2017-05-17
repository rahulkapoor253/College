package com.skeleton.model.profile2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.skeleton.model.Category;

import java.util.List;

/**
 * Created by rahulkapoor on 17/05/17.
 */

public class ProfileData {

    @SerializedName("categories")
    @Expose
    private List<ProfileCategory> categories = null;

    public List<ProfileCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<ProfileCategory> categories) {
        this.categories = categories;
    }


}
