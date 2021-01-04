package com.example.wiss;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class lanwars extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.lanwars,container,false);

        ImageView cod = (ImageView) view.findViewById(R.id.cod);
        ImageView csgo = (ImageView) view.findViewById(R.id.csgo);


        cod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.co);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,30);
            }
        });

        csgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.csgo);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,31);
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
