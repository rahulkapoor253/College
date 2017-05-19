package com.skeleton.model.profile2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by rahulkapoor on 17/05/17.
 */

public class ProfileExample {

    @SerializedName("statusCode")
    @Expose
    private Integer statusCode;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private ProfileData data;

    /**
     * @return status code;
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * @param statusCode set status code;
     */
    public void setStatusCode(final Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * @return message;
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message set message;
     */
    public void setMessage(final String message) {
        this.message = message;
    }

    /**
     * @return data;
     */
    public ProfileData getData() {
        return data;
    }

    /**
     * @param data setData;
     */
    public void setData(final ProfileData data) {
        this.data = data;
    }

}
