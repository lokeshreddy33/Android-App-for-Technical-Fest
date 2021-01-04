package com.example.wiss;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class matricks extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.matricks,container,false);

        ImageView counte = (ImageView) view.findViewById(R.id.counter);
        ImageView blin = (ImageView) view.findViewById(R.id.blind);
        ImageView cad = (ImageView) view.findViewById(R.id.caded);

        counte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.coun);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,24);
            }
        });

        blin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.blind);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,25);
            }
        });

        cad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.cade);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,26);
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
