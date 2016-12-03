package com.micky.commonproj.domain.service.response;

import com.micky.commonproj.domain.model.WeatherResult;

import java.util.List;

public class WeatherResponse extends BaseResponse {
    public int error;
    public String status;
    public String date;
    public List<WeatherResult> results;
}
