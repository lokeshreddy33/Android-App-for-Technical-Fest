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

public class events extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.events,container,false);

        CardView qwisse = (CardView) view.findViewById(R.id.card1);
        CardView goldfifa = (CardView) view.findViewById(R.id.card2);
        CardView school = (CardView) view.findViewById(R.id.card3);
        CardView memorychallen = (CardView) view.findViewById(R.id.card5);
        CardView quizzaire = (CardView) view.findViewById(R.id.card6);
        CardView colloq = (CardView) view.findViewById(R.id.card7);
        CardView executive = (CardView) view.findViewById(R.id.card11);
        CardView grand = (CardView) view.findViewById(R.id.card9);
        CardView matrick = (CardView) view.findViewById(R.id.card10);
        CardView onnet = (CardView) view.findViewById(R.id.card12);
        CardView lanwar = (CardView) view.findViewById(R.id.card13);
        CardView techexp = (CardView) view.findViewById(R.id.card4);
        CardView yanthri = (CardView) view.findViewById(R.id.card8);

        qwisse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.qwiss);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,38);
            }
        });

        goldfifa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.fifae);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,6);
            }
        });

        school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.schoolc);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,7);
            }
        });

        memorychallen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.memoryc);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,8);
            }
        });

        quizzaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.quizzai);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,9);
            }
        });

        colloq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assert getFragmentManager() != null;
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new colloquia()).addToBackStack(null).commit();
            }
        });
        executive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assert getFragmentManager() != null;
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new executivesuite()).addToBackStack(null).commit();
            }
        });
        grand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assert getFragmentManager() != null;
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new grandarc()).addToBackStack(null).commit();
            }
        });
        matrick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assert getFragmentManager() != null;
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new matricks()).addToBackStack(null).commit();
            }
        });
        onnet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assert getFragmentManager() != null;
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new onnet()).addToBackStack(null).commit();
            }
        });
        lanwar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assert getFragmentManager() != null;
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new lanwars()).addToBackStack(null).commit();
            }
        });
        techexp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = getString(R.string.techex);
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,32);
            }
        });
        yanthri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assert getFragmentManager() != null;
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new yanthrix()).addToBackStack(null).commit();
            }
        });



        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
