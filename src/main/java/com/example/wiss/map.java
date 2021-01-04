package com.example.wiss;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class map extends Fragment implements OnMapReadyCallback {

    private GoogleMap mMap;
    MapView mMapView;
    View mView;
    LocationManager locationManager;
    LocationListener locationListener;


    /* @Override
     public void onCreate( Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
     }
 */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.activity_maps, container, false);

        SupportMapFragment mapFragment = (SupportMapFragment) this.getChildFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        return mView;
    }

    /* @Override
     public void onViewCreated( View view,  Bundle savedInstanceState) {
         super.onViewCreated(view, savedInstanceState);
         mMapView = (MapView) mView.findViewById(R.id.map);
         if(mMapView != null){
             mMapView.onCreate(null);
             mMapView.onResume();
             mMapView.getMapAsync(this);
         }
     }
 */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        //   MapsInitializer.initialize(getContext());
        mMap = googleMap;

        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);



        // Add a marker in Sydney and move the camera
        LatLng mhr = new LatLng(20.1492, 85.6652);
        mMap.addMarker(new MarkerOptions().position(mhr).title("MHR"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mhr,15));

        LatLng cc = new LatLng(20.152820, 85.660502);
        mMap.addMarker(new MarkerOptions().position(cc).title("Community Centre"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cc,15));


        LatLng ses = new LatLng(20.149592, 85.674135);
        mMap.addMarker(new MarkerOptions().position(ses).title("SES"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ses,15));

        LatLng sbs = new LatLng(20.149731, 85.677648);
        mMap.addMarker(new MarkerOptions().position(sbs).title("SBS"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sbs,15));

        LatLng lbc = new LatLng(20.148123, 85.677656);
        mMap.addMarker(new MarkerOptions().position(lbc).title("Lab Complex"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lbc,15));

        LatLng ghr = new LatLng(20.152349, 85.667219);
        mMap.addMarker(new MarkerOptions().position(ghr).title("GHR"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ghr,15));

        LatLng main = new LatLng(20.148266, 85.671183);
        mMap.addMarker(new MarkerOptions().position(main).title("Main Building")).showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(main,15));


    }


}