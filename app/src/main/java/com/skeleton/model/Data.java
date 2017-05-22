package com.skeleton.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rahulkapoor on 09/05/17.
 */

public class Data {

    @SerializedName("accessToken")
    @Expose
    private String accessToken;
    @SerializedName("userDetails")
    @Expose
    private UserDetails userDetails;
    @SerializedName("OTP")
    @Expose
    private String oTP;
    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;

    /**
     * @return category;
     */
    public List<Category> getCategories() {
        return categories;
    }

    /**
     * @param categories set categories
     */
    public void setCategories(final List<Category> categories) {
        this.categories = categories;
    }

    /**
     * @return OTP;
     */
    public String getOTP() {
        return oTP;
    }

    /**
     * @param otp set OTP;
     */
    public void setOTP(final String otp) {
        this.oTP = otp;
    }


    /**
     * @return return accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * @param accessToken accessToken
     */
    public void setAccessToken(final String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * @return return
     */
    public UserDetails getUserDetails() {
        return userDetails;
    }

    /**
     * @param userDetails userDetails
     */
    public void setUserDetails(final UserDetails userDetails) {
        this.userDetails = userDetails;
    }


}
