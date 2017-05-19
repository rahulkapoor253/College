package com.skeleton.model.profile1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by rahulkapoor on 17/05/17.
 */

public class DataConstant {

    @SerializedName("statusCode")
    @Expose
    private Integer statusCode;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private ItemsChooser data;

    /**
     * @return return status code;
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
     * @return return message;
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
     * @return return data;
     */
    public ItemsChooser getData() {
        return data;
    }

    /**
     * @param data set data;
     */
    public void setData(final ItemsChooser data) {
        this.data = data;
    }

}
