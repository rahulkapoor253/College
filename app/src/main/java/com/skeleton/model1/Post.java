package com.skeleton.model1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by rahulkapoor on 05/05/17.
 */

public class Post {

    @SerializedName("userId")
    @Expose
    private Integer userId;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("body")
    @Expose
    private String body;

    /**
     *
     * @return userid
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     *
     * @param userId userid
     */
    public void setUserId(final Integer userId) {
        this.userId = userId;
    }

    /**
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id id
     */
    public void setId(final Integer id) {
        this.id = id;
    }

    /**
     *
     * @return getTitle
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title title
     */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     *
     * @return getbody
     */
    public String getBody() {
        return body;
    }

    /**
     *
     * @param body body
     */
    public void setBody(final String body) {
        this.body = body;
    }

}


