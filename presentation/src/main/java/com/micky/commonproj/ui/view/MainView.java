package com.micky.commonproj.ui.view;

import com.micky.commonproj.domain.model.Place;
import com.micky.commonproj.domain.service.response.WeatherResponse;

import java.util.List;

public interface MainView {
    void showProgress();
    void hideProgress();
    void setupPlaceData(List<Place> placeList);
    void setupWeatherData(WeatherResponse response);
}