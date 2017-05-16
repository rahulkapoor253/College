package com.skeleton.retrofit;


import com.skeleton.model.Data;
import com.skeleton.model.Example;

import java.util.HashMap;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Query;

import static com.skeleton.constant.ApiKeyConstant.AUTHORIZATION;
import static com.skeleton.retrofit.ApiInterface.LIST_ITEMS;
import static com.skeleton.retrofit.ApiInterface.OTP_VERIFY;
import static com.skeleton.retrofit.ApiInterface.SUB_URL_1;
import static com.skeleton.retrofit.ApiInterface.SUB_URL_2;
import static com.skeleton.retrofit.ApiInterface.VERIFY_ACCESS_TOKEN;

/**
 * Developer: Saurabh Verma
 * Dated: 27-09-2016.
 */
public interface ApiInterface {
    String UPDATE_LOCATION = "api/v1/user/updateLocation";

    String SUB_URL_1 = "api/user/register";
    String SUB_URL_2 = "api/user/login";
    String OTP_VERIFY = "api/user/getOTP";
    String VERIFY_ACCESS_TOKEN = "api/user/getProfile";
    String LIST_ITEMS = "api/profile/constants";

//    /**
//     * @param map
//     * @return
//     */
//    @Multipart
//    @POST("api/v1/user/createUser")
//    Call<LoginResponse> register(@PartMap HashMap<String, RequestBody> map);
//
//
//    /**
//     * @param map
//     * @return
//     */
//    @FormUrlEncoded
//    @PUT("api/v1/user/socialLogin")
//    Call<LoginResponse> socialLogin(@FieldMap HashMap<String, String> map);
//
//    /**
//     * @param authorization
//     * @param map
//     * @return
//     */
//    @FormUrlEncoded
//    @PUT("api/v1/user/loginToken")
//    Call<LoginResponse> accessTokenLogin(@Header(AUTHORIZATION) String authorization,
//                                         @FieldMap HashMap<String, String> map);
//
//
//    /**
//     * @param email
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("api/v1/user/forgotpassword")
//    Call<CommonResponse> forgotPassword(@Field("email") String email);
//
//    /**
//     * @param map
//     * @return
//     */
//    @FormUrlEncoded
//    @PUT("api/v1/user/loginCredential")
//    Call<LoginResponse> login(@FieldMap HashMap<String, String> map);


    /**
     * Update location call.
     *
     * @param authorization the authorization
     * @param map           the map
     * @return the call
     */
    @FormUrlEncoded
    @POST(UPDATE_LOCATION)
    Call<CommonParams> updateLocation(@Header(AUTHORIZATION) String authorization,
                                      @FieldMap HashMap<String, String> map);

    @Multipart
    @POST(SUB_URL_1)
    Call<Example> userSignUp(@PartMap HashMap<String, RequestBody> map);

    @FormUrlEncoded
    @POST(SUB_URL_2)
    Call<Example> login(@FieldMap HashMap<String, String> map);

    @GET(OTP_VERIFY)
    Call<Example> verifyOTP(@Query("email") String email);

    @GET(VERIFY_ACCESS_TOKEN)
    Call<Example> userProfile(@Header(AUTHORIZATION) String mAccessToken);

    @GET(LIST_ITEMS)
    Call<Data> getListData();


}

