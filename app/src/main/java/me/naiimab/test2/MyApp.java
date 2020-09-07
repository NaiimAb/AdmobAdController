package me.naiimab.test2;

import android.app.Application;
import android.os.Bundle;

import me.naiimab.admobinvalidclick.library.AdsController;

public class MyApp extends Application {

    public static AdsController adsController;

    @Override
    public void onCreate() {
        super.onCreate();

        adsController = new AdsController.Builder(this)
                .setServerURL("http://192.168.0.213/android/adclicks.json")
                .build();
    }
}
