package com.example.wiss;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class yanthrix extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.yanthrix,container,false);
        ImageView drone = (ImageView) view.findViewById(R.id.dronechallenge);
        ImageView trekk = (ImageView) view.findViewById(R.id.trekkon);
        ImageView robowa = (ImageView) view.findViewById(R.id.robowars);
        ImageView mazesol = (ImageView) view.findViewById(R.id.mazesolver);
        ImageView kickof = (ImageView) view.findViewById(R.id.kickoff);

        drone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.drone);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,33);
            }
        });

        trekk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.trekko);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,34);
            }
        });

        robowa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.robo_w);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,35);
            }
        });

        mazesol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.maze_s);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,36);
            }
        });

        kickof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.kick_o);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,37);
            }
        });


        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
