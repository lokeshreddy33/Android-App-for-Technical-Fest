package com.example.wiss;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class grandarc extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.grandarc,container,false);
        ImageView electrade = (ImageView) view.findViewById(R.id.electra);
        ImageView electronix = (ImageView) view.findViewById(R.id.electron);
        ImageView replica = (ImageView) view.findViewById(R.id.repli);
        ImageView stimulant = (ImageView) view.findViewById(R.id.stimulan);
        ImageView smart = (ImageView) view.findViewById(R.id.smartcity);
        ImageView mathsol = (ImageView) view.findViewById(R.id.mathaolym);
        ImageView archimid = (ImageView) view.findViewById(R.id.archimedes);
        electrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.electrad);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,17);
            }
        });

        electronix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.electroni);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,18);
            }
        });

        replica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.replic);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,19);
            }
        });

        stimulant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.stimulan);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,20);
            }
        });

        mathsol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.smart_city);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,21);
            }
        });

        smart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.maths_ol);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,22);
            }
        });

        archimid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.archimede);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,23);
            }
        });



        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
