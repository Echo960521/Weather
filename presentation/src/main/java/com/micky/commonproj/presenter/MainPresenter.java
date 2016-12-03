package com.micky.commonproj.presenter;


public interface MainPresenter extends BasePresenter {

    void getWeatherData(String place);

    void getPlaceData();

    void getPlaceAndWeatherData(String place);

    void onRefresh();
}
