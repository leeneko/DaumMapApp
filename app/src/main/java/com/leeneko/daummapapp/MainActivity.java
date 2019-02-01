package com.leeneko.daummapapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;

import net.daum.mf.map.api.MapPoint;
import net.daum.mf.map.api.MapView;

public class MainActivity extends AppCompatActivity {

    MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initMap();
    }

    private void initMap() {
        mapView = new MapView(this);
        mapView.setDaumMapApiKey("41b9868916c8f1bced39137cc5c72018"); // REST API KEY

        double centerLat = 35.160109;
        double centerLon = 126.851521;

        ViewGroup mapViewContainer = findViewById(R.id.mapView);
        MapPoint mapPoint = MapPoint.mapPointWithGeoCoord(centerLat, centerLon);
        mapView.setMapCenterPoint(mapPoint, true);
        mapViewContainer.addView(mapView);
    }

}
