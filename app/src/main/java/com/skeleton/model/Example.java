package com.skeleton.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by rahulkapoor on 09/05/17.
 */

public class Example implements Parcelable {

    public static final Creator<Example> CREATOR = new Creator<Example>() {
        @Override
        public Example createFromParcel(final Parcel in) {
            return new Example(in);
        }

        @Override
        public Example[] newArray(final int size) {
            return new Example[size];
        }
    };

    @SerializedName("statusCode")
    @Expose
    private Integer statusCode;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private Data data;

    /**
     * @param in parcel in
     */
    protected Example(final Parcel in) {
        message = in.readString();
    }

    /**
     * @param dest  dest
     * @param flags flags
     */
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        dest.writeString(message);
    }

    /**
     * @return return
     */
    @Override
    public int describeContents() {
        return 0;
    }


    /**
     * @return return
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * @param statusCode status code
     */
    public void setStatusCode(final Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * @return return
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message message
     */
    public void setMessage(final String message) {
        this.message = message;
    }

    /**
     * @return return
     */
    public Data getData() {
        return data;
    }

    /**
     * @param data data
     */
    public void setData(final Data data) {
        this.data = data;
    }


}



