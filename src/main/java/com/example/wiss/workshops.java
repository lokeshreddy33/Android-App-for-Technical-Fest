package com.example.wiss;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class workshops extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.workshops,container,false);
        CardView iot = (CardView) view.findViewById(R.id.card1);
        CardView merced = (CardView) view.findViewById(R.id.card2);
        CardView hexap = (CardView) view.findViewById(R.id.card3);
        CardView bigda = (CardView) view.findViewById(R.id.card4);
        CardView bridg = (CardView) view.findViewById(R.id.card5);
        CardView ml =(CardView) view.findViewById(R.id.card6);

        CardView web =(CardView) view.findViewById(R.id.card7);
        CardView digital =(CardView) view.findViewById(R.id.card8);
        iot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.iot_wo);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,39);
            }
        });

        merced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.mercedes_eng);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,40);
            }
        });

        hexap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.hexapod_robotics_work);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,41);
            }
        });
        bigda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.big_data_and);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,42);
            }
        });

        bridg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.bridge_de);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,43);
            }
        });
        ml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.ai);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,45);
            }
        });
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.web);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,46);
            }
        });
        digital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.digital);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,47);
            }
        });

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
