package com.example.wiss;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class colloquia extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.colloquia,container,false);
        ImageView cs = (ImageView) view.findViewById(R.id.computer);
        ImageView electrical = (ImageView) view.findViewById(R.id.electrical);
        ImageView mechani = (ImageView) view.findViewById(R.id.mechanical);
        ImageView civil = (ImageView) view.findViewById(R.id.civil);


        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.compu);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,10);
            }
        });

        electrical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.compu);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,11);
            }
        });

        mechani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.compu);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,12);
            }
        });

        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.compu);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,13);
            }
        });
        return  view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
