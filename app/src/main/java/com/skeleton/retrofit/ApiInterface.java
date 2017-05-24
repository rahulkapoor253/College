package com.skeleton.retrofit;


import com.skeleton.model.Example;
import com.skeleton.model.profile1.DataConstant;
import com.skeleton.model.profile2.ProfileExample;
import com.skeleton.model1.MainModel;
import com.skeleton.model1.Post;

import java.util.HashMap;
import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.PartMap;
import retrofit2.http.Query;

import static com.skeleton.constant.ApiKeyConstant.AUTHORIZATION;

/**
 * Developer: Saurabh Verma
 * Dated: 27-09-2016.
 */
public interface ApiInterface {
    String UPDATE_LOCATION = "api/v1/user/updateLocation";

    String  SUB_URL_1_users = "users";
    String SUB_URL_2_posts = "posts";

    String SUB_URL_1 = "api/user/register";
    String SUB_URL_2 = "api/user/login";
    String VERIFY_OTP = "api/user/verifyOTP";
    String VERIFY_ACCESS_TOKEN = "api/user/getProfile";
    String LIST_ITEMS = "api/profile/constants";
    String IMAGE_TEXT_ACCESS = "api/category/list";





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

    /**
     * @param map hash map ;
     * @return return
     */
    @Multipart
    @POST(SUB_URL_1)
    Call<Example> userSignUp(@PartMap HashMap<String, RequestBody> map);

    /**
     * @param authorization authorization
     * @param map           map
     * @return return
     */
    @FormUrlEncoded
    @POST(SUB_URL_2)
    Call<Example> login(@Header(AUTHORIZATION) String authorization, @FieldMap HashMap<String, String> map);

    /**
     * @param authorization Access Token generated by the server at the time of registration
     * @param hashMap       Request Body in the form of hash map
     * @return Response from server
     */
    @FormUrlEncoded
    @PUT(VERIFY_OTP)
    Call<Example> verifyOtp(@Header(AUTHORIZATION) String authorization,
                            @FieldMap HashMap<String, String> hashMap);

    /**
     * @param mAccessToken access token
     * @return return
     */
    @GET(VERIFY_ACCESS_TOKEN)
    Call<Example> userProfile(@Header(AUTHORIZATION) String mAccessToken);

    /**
     * @return return
     */
    @GET(LIST_ITEMS)
    Call<DataConstant> getListData();

    /**
     * @param mAccessToken access Token
     * @param request      request
     * @return return ;
     */
    @GET(IMAGE_TEXT_ACCESS)
    Call<ProfileExample> getImageText(@Header(AUTHORIZATION) String mAccessToken, @Query("requestType") String request);

    /**
     *
     * @return return
     */
    @GET(SUB_URL_1_users)
    Call<List<MainModel>> getUserData();

    /**
     *
     * @param userId userid
     * @return return
     */
    @GET(SUB_URL_2_posts)
    Call<List<Post>> getPosts(@Query("userId") int userId);




}

