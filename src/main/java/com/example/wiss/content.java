package com.example.wiss;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class content extends Fragment {
    private String url;
    private String ur1;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content_main, container, false);


        Bundle bundle = getArguments();
        String data = bundle.getString("description");
        int num = bundle.getInt("check");
        TextView text = (TextView) view.findViewById(R.id.contenttext);
        TextView tex = (TextView) view.findViewById(R.id.tectvi);
        ImageView imageView = (ImageView) view.findViewById(R.id.contentimage);
        ImageView imae = (ImageView) view.findViewById(R.id.image);
        text.setText(data);

        if (num == 6) {
            imageView.setImageResource(R.drawable.fifa1);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }

        if (num == 7) {
            imageView.setImageResource(R.drawable.schoolchamp);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }
        if (num == 8) {
            imageView.setImageResource(R.drawable.memorychallenge);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }
        if (num == 9) {
            imageView.setImageResource(R.drawable.quizzaire);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }
        if (num == 10) {
            imageView.setImageResource(R.drawable.computer);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }

        if (num == 11) {
            imageView.setImageResource(R.drawable.electrical);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }
        if (num == 12) {
            imageView.setImageResource(R.drawable.mechanical);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }
        if (num == 13) {
            imageView.setImageResource(R.drawable.civil);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }
        if (num == 14) {
            imageView.setImageResource(R.drawable.auctionwar);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }
        if (num == 15) {
            imageView.setImageResource(R.drawable.pioneersplan);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }
        if (num == 16) {
            imageView.setImageResource(R.drawable.madads);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }
        if (num == 17) {
            imageView.setImageResource(R.drawable.electrade);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }
        if (num == 18) {
            imageView.setImageResource(R.drawable.electronix);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }
        if (num == 19) {
            imageView.setImageResource(R.drawable.replica);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }
        if (num == 20) {
            imageView.setImageResource(R.drawable.stimulant);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }
        if (num == 21) {
            imageView.setImageResource(R.drawable.smart);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }
        if (num == 22) {
            imageView.setImageResource(R.drawable.mathsoly);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }
        if (num == 23) {
            imageView.setImageResource(R.drawable.archim);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }
        if (num == 24) {
            imageView.setImageResource(R.drawable.counter);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }
        if (num == 25) {
            imageView.setImageResource(R.drawable.blind);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }
        if (num == 26) {
            imageView.setImageResource(R.drawable.caded);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }
        if (num == 27) {
            imageView.setImageResource(R.drawable.sciencetoons);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }
        if (num == 28) {
            imageView.setImageResource(R.drawable.sherlock);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }
        if (num == 29) {
            imageView.setImageResource(R.drawable.shutter);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }
        if (num == 30) {
            imageView.setImageResource(R.drawable.cod);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }
        if (num == 31) {
            imageView.setImageResource(R.drawable.csgo);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }
        if (num == 32) {
            imageView.setImageResource(R.drawable.techexpo);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }
        if (num == 33) {
            imageView.setImageResource(R.drawable.dronechallenge);

            imae.setVisibility(View.VISIBLE);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Box_Maze";
        }
        if (num == 34) {
            imageView.setImageResource(R.drawable.trekkon);
            imae.setVisibility(View.VISIBLE);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#Trekkon";
        }
        if (num == 35) {
            imageView.setImageResource(R.drawable.robowars);
            imae.setVisibility(View.VISIBLE);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#robo_wars";
        }
        if (num == 36) {
            imageView.setImageResource(R.drawable.mazesolver);
            imae.setVisibility(View.VISIBLE);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#maze_solver";
        }
        if (num == 37) {
            imageView.setImageResource(R.drawable.kickoff);
            imae.setVisibility(View.VISIBLE);
            url="https://www.wissenaire.org/index.php/Events/Yanthrix#kick";
        }
        if (num == 38) {
            imageView.setImageResource(R.drawable.qwissenaire);
            imae.setVisibility(View.VISIBLE);
            url="https://www.wissenaire.org/qwissenaire/";
        }

        if (num == 39) {
            imageView.setImageResource(R.drawable.iot);
            tex.setVisibility(View.GONE);
            imae.setVisibility(View.VISIBLE);
            url="https://www.wissenaire.org/workshops.php";
        }
        if (num == 40) {
            imageView.setImageResource(R.drawable.mercedes);
            tex.setVisibility(View.GONE);
            imae.setVisibility(View.VISIBLE);
            url="https://www.wissenaire.org/workshops.php";
        }
        if (num == 41) {
            imageView.setImageResource(R.drawable.hex);
            tex.setVisibility(View.GONE);
            imae.setVisibility(View.VISIBLE);
            url="https://www.wissenaire.org/workshops.php";
        }
        if (num == 42) {
            imageView.setImageResource(R.drawable.big);
            tex.setVisibility(View.GONE);
            imae.setVisibility(View.VISIBLE);
            url="https://www.wissenaire.org/workshops.php";
        }
        if (num == 43) {
            imageView.setImageResource(R.drawable.bridge);
            tex.setVisibility(View.GONE);
            imae.setVisibility(View.VISIBLE);
            url="https://www.wissenaire.org/workshops.php";
        }
        if (num == 44) {
            imageView.setImageResource(R.drawable.be);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ur1="https://www.youtube.com/watch?v=KZ495bWE9gE";
                    click(ur1);
                }
            });
            tex.setVisibility(View.GONE);
            imae.setVisibility(View.VISIBLE);
            url="https://www.wissenaire.org/aboutus.php";
        }
        if (num == 45) {
            imageView.setImageResource(R.drawable.ai);
            tex.setVisibility(View.GONE);
            imae.setVisibility(View.VISIBLE);
            url="https://www.wissenaire.org/workshops.php";
        }
        if (num == 46) {
            imageView.setImageResource(R.drawable.web);
            tex.setVisibility(View.GONE);
            imae.setVisibility(View.VISIBLE);
            url="https://www.wissenaire.org/workshops.php";
        }
        if (num == 47) {
            imageView.setImageResource(R.drawable.digital);
            tex.setVisibility(View.GONE);
            imae.setVisibility(View.VISIBLE);
            url="https://www.wissenaire.org/workshops.php";
        }
        imae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn(url);
            }
        });

        return view;
    }

    public void click(String ur1){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(ur1));
        startActivity(intent);

    }
        public void clicked_btn(String url){
            Intent intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
