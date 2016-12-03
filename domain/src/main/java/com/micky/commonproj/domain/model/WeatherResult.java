package com.micky.commonproj.domain.model;

import java.util.List;


public class WeatherResult {
    public String currentCity;
    public String pm25;
    public List<WeatherExtra> index;
    public List<WeatherData> weather_data;
}
