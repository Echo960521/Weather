package com.micky.commonproj.domain.service;


import com.micky.commonproj.domain.service.response.WeatherResponse;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;


public interface WeatherService {

    /*@GET("service/getIpInfo.php")
    Call<GetIpInfoResponse> getIpInfo(@Query("ip") String ip);*/

//    @GET("service/getIpInfo.php")
//    Observable<GetIpInfoResponse> getIpInfo(@Query("ip") String ip);


    //http://api.map.baidu.com/telematics/v3/weather?location=%E6%88%90%E9%83%BD&output=json&ak=MPDgj92wUYvRmyaUdQs1XwCf
    @POST("/telematics/v3/weather?output=json")
    Observable<WeatherResponse> getWeatherInfo(@Query("location") String location, @Query("ak") String ak);
}
