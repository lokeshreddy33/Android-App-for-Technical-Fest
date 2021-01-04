package com.example.wiss;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class home extends Fragment {

    private TextView txttimerday, txttimerhour, txttimerminute, txttimersecond;
    private TextView tvevent;
    private Handler handler;
    private Runnable runnable;
    int num;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home, container, false);
ImageView imageView =(ImageView) view.findViewById(R.id.theme);
        ImageView fblogo = (ImageView) view.findViewById(R.id.fblogo);
        ImageView insta = (ImageView) view.findViewById(R.id.insta);
        ImageView youtube = (ImageView) view.findViewById(R.id.you);

        txttimerday = (TextView) view.findViewById(R.id.txttimerday);
        txttimerhour = (TextView) view.findViewById(R.id.txttimerhour);
        txttimerminute = (TextView) view.findViewById(R.id.txttimerminute);
        txttimersecond = (TextView) view.findViewById(R.id.txttimersecond);
        CardView cardView=(CardView) view.findViewById(R.id.card);
        CardView cardVie=(CardView) view.findViewById(R.id.car);
imageView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        MainActivity mn=(MainActivity) getActivity();
        mn.calllink(7);
    }
});
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = "Wissenaire, the annual techno-management fest of IIT Bhubaneswar is one of the biggest of its kind in East India. Every year Wissenaire comes up with a theme and in 2019 Wissenaire has got some unique ideas in store for you with the theme\n\nCosmic Expeditions: Astounding Odysseys Ensuring Humanity's Existence.";
                MainActivity mainActivity=(MainActivity) getActivity();
                mainActivity.function(description,44);
            }
        });
        cardVie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assert getFragmentManager() != null;
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new highlights()).addToBackStack(null).commit();
            }
        });


        fblogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fbpage = new Intent(Intent.ACTION_VIEW);
                fbpage.setData(Uri.parse(getString(R.string.fbpage)));
                startActivity(fbpage);

            }
        });
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent insta = new Intent(Intent.ACTION_VIEW);
                insta.setData(Uri.parse(getString(R.string.insta)));
                startActivity(insta);

            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yt = new Intent(Intent.ACTION_VIEW);
                yt.setData(Uri.parse(getString(R.string.youtube)));
                startActivity(yt);

            }
        });


        countDownStart();

        if (num == 1) {
            view.findViewById(R.id.linearlayout10).setVisibility(View.INVISIBLE);
            view.findViewById(R.id.linearlayout11).setVisibility(View.INVISIBLE);
            view.findViewById(R.id.linearlayout12).setVisibility(View.INVISIBLE);
            view.findViewById(R.id.linearlayout13).setVisibility(View.INVISIBLE);

            view.findViewById(R.id.txt_timerday).setVisibility(View.INVISIBLE);
            view.findViewById(R.id.txt_timerhour).setVisibility(View.INVISIBLE);
            view.findViewById(R.id.txt_timerminute).setVisibility(View.INVISIBLE);
            view.findViewById(R.id.txt_timersecond).setVisibility(View.INVISIBLE);
        }


        return view;
    }
        private void countDownStart(){
            handler =new Handler();
            runnable=new Runnable() {
                @Override
                public void run() {
                    handler.postDelayed(this,1000);
                    try {
                        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
                        Date futureDate= dateFormat.parse("2020-01-31");
                        Date currentDate= new Date();
                        if (!currentDate.after(futureDate)){
                            long diff=futureDate.getTime()-currentDate.getTime();
                            long days=diff/(24*60*60*1000);
                            diff-= days*(24*60*60*1000);
                            long hours=diff/(60*60*1000);
                            diff-=hours*(60*60*1000);
                            long minute=diff/(60*1000);
                            diff-=minute*(60*1000);
                            long second=diff/1000;
                            txttimerday.setText(""+ String.format("%02d", days));
                            txttimerhour.setText(""+ String.format("%02d", hours));
                            txttimerminute.setText(""+ String.format("%02d", minute));
                            txttimersecond.setText(""+ String.format("%02d", second));
                        }else {

                            num=10;
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }

            };
            handler.postDelayed(runnable,1*1000);
        }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
