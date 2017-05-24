package com.skeleton.model1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by rahulkapoor on 04/05/17.
 */

public class Company {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("catchPhrase")
    @Expose
    private String catchPhrase;
    @SerializedName("bs")
    @Expose
    private String bs;

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     *
     * @return catchphrase
     */
    public String getCatchPhrase() {
        return catchPhrase;
    }

    /**
     *
     * @param catchPhrase catchphrase
     */
    public void setCatchPhrase(final String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    /**
     *
     * @return bs
     */
    public String getBs() {
        return bs;
    }

    /**
     *
     * @param bs bs
     */
    public void setBs(final String bs) {
        this.bs = bs;
    }

}