package com.example.wiss;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class onnet extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.onnet,container,false);

        ImageView scienc = (ImageView) view.findViewById(R.id.science);
        ImageView sherloc = (ImageView) view.findViewById(R.id.sherlock);
        ImageView shutte = (ImageView) view.findViewById(R.id.shutter);

        scienc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.scienc);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,27);
            }
        });

        sherloc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.sherl);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,28);
            }
        });

        shutte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.shutt);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,29);
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
