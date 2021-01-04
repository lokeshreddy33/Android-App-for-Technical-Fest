package com.example.wiss;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class helpdesk extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.helpdesk,container,false);

        ImageView call =(ImageView) view.findViewById(R.id.call);
        ImageView call1 =(ImageView) view.findViewById(R.id.call1);
        ImageView call2 =(ImageView) view.findViewById(R.id.call2);
        ImageView call3 =(ImageView) view.findViewById(R.id.call3);
        ImageView call4 =(ImageView) view.findViewById(R.id.call4);
        ImageView call5 =(ImageView) view.findViewById(R.id.call5);
        String text="Lokesh Reddy\nWeb and Design Core Head";
        SpannableString ss =new SpannableString(text);
        StyleSpan boldspan =new StyleSpan(Typeface.BOLD);
        ss.setSpan(boldspan,0,12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9494192852"));
                startActivity(intent);
                Toast.makeText(getActivity(),"Dialling Naveen",Toast.LENGTH_SHORT).show();
            }
        });
        call1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9491788179"));
                startActivity(intent);
                Toast.makeText(getActivity(),"Dialling Lokesh Reddy",Toast.LENGTH_SHORT).show();
            }
        });
        call2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9491788179"));
                startActivity(intent);
                Toast.makeText(getActivity(),"Dialling Lokesh Reddy",Toast.LENGTH_SHORT).show();
            }
        });
        call3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9491788179"));
                startActivity(intent);
                Toast.makeText(getActivity(),"Dialling Lokesh Reddy",Toast.LENGTH_SHORT).show();
            }
        });
        call4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9491788179"));
                startActivity(intent);
                Toast.makeText(getActivity(),"Dialling Lokesh Reddy",Toast.LENGTH_SHORT).show();
            }
        });
        call5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9491788179"));
                startActivity(intent);
                Toast.makeText(getActivity(),"Dialling Lokesh Reddy",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
