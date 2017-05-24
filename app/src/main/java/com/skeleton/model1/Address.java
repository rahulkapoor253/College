package com.skeleton.model1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by rahulkapoor on 04/05/17.
 */

public class Address {

    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("suite")
    @Expose
    private String suite;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("zipcode")
    @Expose
    private String zipcode;
    @SerializedName("geo")
    @Expose
    private Geo geo;

    /**
     *
     * @return street
     */
    public String getStreet() {
        return street;
    }

    /**
     *
     * @param street street
     */
    public void setStreet(final String street) {
        this.street = street;
    }

    /**
     *
     * @return suite
     */
    public String getSuite() {
        return suite;
    }

    /**
     *
     * @param suite suite
     */
    public void setSuite(final String suite) {
        this.suite = suite;
    }

    /**
     *
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city city
     */
    public void setCity(final String city) {
        this.city = city;
    }

    /**
     *
     * @return zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     *
     * @param zipcode zipcode
     */
    public void setZipcode(final String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     *
     * @return geo
     */
    public Geo getGeo() {
        return geo;
    }

    /**
     *
     * @param geo geo
     */
    public void setGeo(final Geo geo) {
        this.geo = geo;
    }

}