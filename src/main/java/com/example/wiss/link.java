package com.example.wiss;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.LabelVisibilityMode;

public class link extends Fragment {

    private WebView webView;
    public ProgressBar progress;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.link,container,false);

        webView=(WebView) view.findViewById(R.id.webview);
        progress=(ProgressBar) view.findViewById(R.id.progressBar);




        Bundle bundle= getArguments();
        int num=bundle.getInt("check");
        if (num==7) {

            webView.loadUrl("https://www.wissenaire.org/");
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient() {

                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon) {
                    super.onPageStarted(view, url, favicon);
                    progress.setVisibility(view.VISIBLE);

                }

                @Override
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);
                    progress.setVisibility(view.GONE);
                }
            });
        }
            if (num==8){

                webView.loadUrl("https://www.wissenaire.org/index.php/App/Schedule");
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setWebViewClient(new WebViewClient(){

                    @Override
                    public void onPageStarted(WebView view, String url, Bitmap favicon) {
                        super.onPageStarted(view, url, favicon);
                        progress.setVisibility(view.VISIBLE);

                    }

                    @Override
                    public void onPageFinished(WebView view, String url) {
                        super.onPageFinished(view, url);
                        progress.setVisibility(view.GONE);
                    }
                });




        }
        if (num==1){

            webView.loadUrl("http://ca.wissenaire.org/");
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient(){

                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon) {
                    super.onPageStarted(view, url, favicon);
                    progress.setVisibility(view.VISIBLE);

                }

                @Override
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);
                    progress.setVisibility(view.GONE);
                }
            });




        }

        if (num==2){
            webView.loadUrl("https://www.wissenaire.org/index.php/home/guest_lectures");
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient(){

                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon) {
                    super.onPageStarted(view, url, favicon);
                    progress.setVisibility(view.VISIBLE);

                }

                @Override
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);
                    progress.setVisibility(view.GONE);
                }
            });



        }

        if (num==3){
            webView.loadUrl("https://www.wissenaire.org/index.php/home/starnites");
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon) {
                    super.onPageStarted(view, url, favicon);
                    progress.setVisibility(view.VISIBLE);
                }

                @Override
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);
                    progress.setVisibility(view.GONE);
                }
            });



        }

        if (num==4){
            webView.loadUrl("https://www.wissenaire.org/index.php/home/Sponsors");
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon) {
                    super.onPageStarted(view, url, favicon);
                    progress.setVisibility(view.VISIBLE);
                }

                @Override
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);
                    progress.setVisibility(view.GONE);
                }
            });



        }

        if (num==5){
            webView.loadUrl("https://www.wissenaire.org/index.php/home/team");
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon) {
                    super.onPageStarted(view, url, favicon);
                    progress.setVisibility(view.VISIBLE);
                }

                @Override
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);
                    progress.setVisibility(view.GONE);
                }
            });



        }
        if (num==6){
            webView.loadUrl("https://www.wissenaire.org/index.php/home/login");
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon) {
                    super.onPageStarted(view, url, favicon);
                    progress.setVisibility(view.VISIBLE);
                }

                @Override
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);
                    progress.setVisibility(view.GONE);
                }
            });



        }





        return view;

    }



}



