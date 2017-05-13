package com.skeleton.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rahulkapoor on 09/05/17.
 */

public class UserDetails {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("dob")
    @Expose
    private String dob;
    @SerializedName("countryCode")
    @Expose
    private String countryCode;
    @SerializedName("phoneNo")
    @Expose
    private String phoneNo;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("newNumber")
    @Expose
    private String newNumber;
    @SerializedName("userImages")
    @Expose
    private List<UserImage> userImages = null;
    @SerializedName("admin_deactivateAccount")
    @Expose
    private Boolean adminDeactivateAccount;
    @SerializedName("timeOffset")
    @Expose
    private Integer timeOffset;
    @SerializedName("gender")
    @Expose
    private Object gender;
    @SerializedName("aboutMe")
    @Expose
    private String aboutMe;
    @SerializedName("step2CompleteOrSkip")
    @Expose
    private Boolean step2CompleteOrSkip;
    @SerializedName("step1CompleteOrSkip")
    @Expose
    private Boolean step1CompleteOrSkip;
    @SerializedName("interestCategories")
    @Expose
    private List<Object> interestCategories = null;
    @SerializedName("profilePicURL")
    @Expose
    private ProfilePicURL profilePicURL;
    @SerializedName("defaultAddressId")
    @Expose
    private Object defaultAddressId;
    @SerializedName("currentLocation")
    @Expose
    private CurrentLocation currentLocation;

    /**
     * @return return
     */
    public String getId() {
        return id;
    }

    /**
     * @param id id
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * @return return
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt created at
     */
    public void setCreatedAt(final String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return return
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt updatedAt
     */
    public void setUpdatedAt(final String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return return
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob dob
     */
    public void setDob(final String dob) {
        this.dob = dob;
    }

    /**
     * @return return
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * @param countryCode country code
     */
    public void setCountryCode(final String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * @return return
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * @param phoneNo phoneno
     */
    public void setPhoneNo(final String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * @return return
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email email
     */
    public void setEmail(final String email) {
        this.email = email;
    }

    /**
     * @return return
     */
    public String getNewNumber() {
        return newNumber;
    }

    /**
     * @param newNumber new Number
     */
    public void setNewNumber(final String newNumber) {
        this.newNumber = newNumber;
    }

    /**
     * @return return userImage
     */
    public List<UserImage> getUserImages() {
        return userImages;
    }

    /**
     * @param userImages userImages
     */
    public void setUserImages(final List<UserImage> userImages) {
        this.userImages = userImages;
    }

    /**
     * @return return
     */
    public Boolean getAdminDeactivateAccount() {
        return adminDeactivateAccount;
    }

    /**
     * @param adminDeactivateAccount adminDeactivate Account
     */
    public void setAdminDeactivateAccount(final Boolean adminDeactivateAccount) {
        this.adminDeactivateAccount = adminDeactivateAccount;
    }

    /**
     * @return time offset
     */
    public Integer getTimeOffset() {
        return timeOffset;
    }

    /**
     * @param timeOffset timeoffset
     */
    public void setTimeOffset(final Integer timeOffset) {
        this.timeOffset = timeOffset;
    }

    /**
     * @return return
     */
    public Object getGender() {
        return gender;
    }

    /**
     * @param gender gender
     */
    public void setGender(final Object gender) {
        this.gender = gender;
    }

    /**
     * @return return
     */
    public String getAboutMe() {
        return aboutMe;
    }

    /**
     * @param aboutMe aboutMe
     */
    public void setAboutMe(final String aboutMe) {
        this.aboutMe = aboutMe;
    }

    /**
     * @return return boolean
     */
    public Boolean getStep2CompleteOrSkip() {
        return step2CompleteOrSkip;
    }

    /**
     * @param step2CompleteOrSkip Step2Compelte or skip
     */
    public void setStep2CompleteOrSkip(final Boolean step2CompleteOrSkip) {
        this.step2CompleteOrSkip = step2CompleteOrSkip;
    }

    /**
     * @return return
     */
    public Boolean getStep1CompleteOrSkip() {
        return step1CompleteOrSkip;
    }

    /**
     * @param step1CompleteOrSkip Step2Compelte or skip
     */
    public void setStep1CompleteOrSkip(final Boolean step1CompleteOrSkip) {
        this.step1CompleteOrSkip = step1CompleteOrSkip;
    }

    /**
     * @return return
     */
    public List<Object> getInterestCategories() {
        return interestCategories;
    }

    /**
     * @param interestCategories interest Categories
     */
    public void setInterestCategories(final List<Object> interestCategories) {
        this.interestCategories = interestCategories;
    }

    /**
     * @return return
     */
    public ProfilePicURL getProfilePicURL() {
        return profilePicURL;
    }

    /**
     * @param profilePicURL profile picture URL
     */
    public void setProfilePicURL(final ProfilePicURL profilePicURL) {
        this.profilePicURL = profilePicURL;
    }

    /**
     * @return return
     */
    public Object getDefaultAddressId() {
        return defaultAddressId;
    }

    /**
     * @param defaultAddressId deafaualt address ID
     */
    public void setDefaultAddressId(final Object defaultAddressId) {
        this.defaultAddressId = defaultAddressId;
    }

    /**
     * @return return
     */
    public CurrentLocation getCurrentLocation() {
        return currentLocation;
    }

    /**
     * @param currentLocation current location;
     */
    public void setCurrentLocation(final CurrentLocation currentLocation) {
        this.currentLocation = currentLocation;
    }

}
