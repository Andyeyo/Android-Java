package com.mivilsoft.chatapp.Fragments;

import com.mivilsoft.chatapp.Notifications.MyResponse;
import com.mivilsoft.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=YOUR_FIREBASE_API_KEY"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotifiaction(@Body Sender body);
}
