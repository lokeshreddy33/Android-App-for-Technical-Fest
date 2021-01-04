package com.example.wiss;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class executivesuite extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.executivesuite,container,false);


        ImageView auction = (ImageView) view.findViewById(R.id.auctionwar);
        ImageView pioneers = (ImageView) view.findViewById(R.id.pioneersplan);
        ImageView mad = (ImageView) view.findViewById(R.id.madads);



        auction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.auct);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,14);
            }
        });

        pioneers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.pio);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,15);
            }
        });

        mad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.mad);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,16);
            }
        });




        return  view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
