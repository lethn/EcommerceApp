package com.example.ecommerceapp;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ecommerceapp.R;
import com.example.ecommerceapp.ShopViewModel;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MapFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MapFragment extends Fragment implements OnMapReadyCallback{

    private GoogleMap mMap;
    private List<LatLng> markerData;
    private Polyline polyline;
    private ShopViewModel shopViewModel;
    private float zoomLevel = 15.0f;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Initialize view
        View view=inflater.inflate(R.layout.fragment_map, container, false);

        // Initialize map fragment
        SupportMapFragment supportMapFragment=(SupportMapFragment)
                getChildFragmentManager().findFragmentById(R.id.google_map);

        // Async map
        supportMapFragment.getMapAsync(this);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //Initiate view model
        shopViewModel = new ViewModelProvider(requireActivity()).get(ShopViewModel.class);
    }

    @Override
    public void onMapReady(final GoogleMap googleMap) {
        mMap = googleMap;

        if(markerData == null){
            //get data from shoprepository
            markerData = shopViewModel.getLatLngList();
        }

        for(int i = 0; i < markerData.size(); i++){
            createMarker(markerData.get(i), "Family Mart");
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(markerData.get(i), zoomLevel));
        }
    }

    private Marker createMarker(LatLng position, String title) {
        return mMap.addMarker(new MarkerOptions()
                .title(title)
                .position(position)
                .draggable(true));
    }
}