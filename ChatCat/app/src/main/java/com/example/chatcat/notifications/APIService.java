package com.example.chatcat.notifications;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAui1BKJU:APA91bH6O2WDiCfcjmUcUZa-Nb8m1AoqconHXlpmDNcbjg7js13D1wo3DvTJiKUeIunrqfcKnldZkPScc08drn2dlVAJPPwy9PDp85lHY0k4AcMQLb2LBK-vkeJi4b6MXAlMW6iaVcso"
    })

    @POST("fcm/send")
    Call<Response> sendNotification(@Body Sender body);

}
