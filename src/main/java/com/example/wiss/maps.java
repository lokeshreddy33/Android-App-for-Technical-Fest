package com.example.wiss;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;




public class maps extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        // Add a marker in Sydney and move the camera
        LatLng mhr = new LatLng(20.1492, 85.6652);
        mMap.addMarker(new MarkerOptions().position(mhr).title("MHR"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mhr,14));

        LatLng cc = new LatLng(20.152820, 85.660502);
        mMap.addMarker(new MarkerOptions().position(cc).title("Community Centre"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cc,14));


        LatLng ses = new LatLng(20.149592, 85.674135);
        mMap.addMarker(new MarkerOptions().position(ses).title("SES"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ses,14));

        LatLng sbs = new LatLng(20.149731, 85.677648);
        mMap.addMarker(new MarkerOptions().position(sbs).title("SBS"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sbs,14));

        LatLng lbc = new LatLng(20.148123, 85.677656);
        mMap.addMarker(new MarkerOptions().position(lbc).title("Lab Complex"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lbc,14));

        LatLng ghr = new LatLng(20.152349, 85.667219);
        mMap.addMarker(new MarkerOptions().position(ghr).title("GHR"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ghr,14));

        LatLng main = new LatLng(20.148266, 85.671183);
        mMap.addMarker(new MarkerOptions().position(main).title("Main Building"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(main,14));

    }

    @Override
    public void onBackPressed(){
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new home()).addToBackStack(null).commit();
    }

}

