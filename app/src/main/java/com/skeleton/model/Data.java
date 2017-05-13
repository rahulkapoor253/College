package com.skeleton.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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


    public String getOTP() {
        return oTP;
    }

    public void setOTP(String oTP) {
        this.oTP = oTP;
    }


    /**
     * @return return
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
