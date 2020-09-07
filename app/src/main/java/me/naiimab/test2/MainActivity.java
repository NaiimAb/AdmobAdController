package me.naiimab.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import me.naiimab.admobinvalidclick.library.AdsController;

public class MainActivity extends AppCompatActivity {

    Button showInterBtn;
//    AdsController adsController;
    RelativeLayout adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showInterBtn = findViewById(R.id.showInterBtn);
        adView = findViewById(R.id.adView);

        List<String> bannerList = new ArrayList<>();
        bannerList.add("ca-app-pub-3940256099942544/6300978111");

        List<String> interList = new ArrayList<>();
        interList.add("ca-app-pub-3940256099942544/1033173712");

        List<String> activitiesList = new ArrayList<>();
        activitiesList.add("me.naiimab.test2.SecondActivity");
        activitiesList.add("me.naiimab.test2.ThirdActivity");


       /* adsController = new AdsController.Builder(this)
                .setLimitAdmobBannerClicks(true)
                .setBannerMaxClick(2)
                .setBannerDuration(3600)
                .setLimitAdmobInterClicks(true)
                .setInterstitialMaxClick(2)
                .setInterstitialDuration(3600)
                .setTestAds(true)
                .setBannerIDList(bannerList)
                .setInterstitialIDList(interList)
                .setLoadingTimer(10)
                .setShowProgressBar(true)
                .setAutoMoveActivities(true)
                .setNextActivityName(activitiesList)

                .build();*/



        MyApp.adsController.showBanner(adView);

        showInterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MyApp.adsController.isInterstitialClickLimited()) {

                }
                else {
                    MyApp.adsController.showInterstitial(view, 1);
                }

            }
        });


    }
}