package com.skeleton.model1;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by rahulkapoor on 25/05/17.
 */

public class MainModel implements Parcelable {



        @SerializedName("ID")
        @Expose
        private Integer iD;
        @SerializedName("Title")
        @Expose
        private String title;
        @SerializedName("DueDate")
        @Expose
        private String dueDate;
        @SerializedName("Completed")
        @Expose
        private Boolean completed;

    protected MainModel(Parcel in) {
        title = in.readString();
        dueDate = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(dueDate);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<MainModel> CREATOR = new Creator<MainModel>() {
        @Override
        public MainModel createFromParcel(Parcel in) {
            return new MainModel(in);
        }

        @Override
        public MainModel[] newArray(int size) {
            return new MainModel[size];
        }
    };

    public Integer getID() {
            return iD;
        }

        public void setID(Integer iD) {
            this.iD = iD;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDueDate() {
            return dueDate;
        }

        public void setDueDate(String dueDate) {
            this.dueDate = dueDate;
        }

        public Boolean getCompleted() {
            return completed;
        }

        public void setCompleted(Boolean completed) {
            this.completed = completed;
        }

    }

