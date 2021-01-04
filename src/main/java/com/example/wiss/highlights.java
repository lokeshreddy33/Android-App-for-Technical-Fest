package com.example.wiss;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class highlights extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.highlights, container, false);

        ImageView imageView=(ImageView) view.findViewById(R.id.imageView2);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fbpage = new Intent(Intent.ACTION_VIEW);
                fbpage.setData(Uri.parse("https://www.youtube.com/watch?v=yAhJe8Tq9NU&t=9s"));
                startActivity(fbpage);
            }
        });
        return view;
    }
}
