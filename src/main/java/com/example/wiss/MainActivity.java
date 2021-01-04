package com.example.wiss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new home()).commit();
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.



        final BottomNavigationView bottomnav=(BottomNavigationView)findViewById(R.id.bot_nav);
        bottomnav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menu) {


                switch (menu.getItemId()){

                    case R.id.action_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new home()).addToBackStack(null).commit();
                        break;
                    case R.id.action_events:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new events()).addToBackStack(null).commit();
                        break;
                    case R.id.action_map:
                       getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new map()).addToBackStack(null).commit();
                       // Intent intent = new Intent(getApplicationContext(),maps.class);
                        //startActivity(intent);

                        break;
                    case R.id.action_workshops:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new workshops()).addToBackStack(null).commit();
                        break;
                    case R.id.action_helpdesk:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new helpdesk()).addToBackStack(null).commit();
                        break;
                }


                return true;
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }





    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();

        if (id == R.id.nav_home) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new home()).addToBackStack(null).commit();
        } else if (id == R.id.nav_ca) {
            calllink(1);
        }
        else if (id == R.id.nav_gl) {
            calllink(2);

        } else if (id == R.id.nav_starnites) {
            calllink(3);

        } else if (id == R.id.nav_sponsors) {
            calllink(4);

        }
        else if (id == R.id.nav_team) {
            calllink(5);

        }
        else if (id == R.id.nav_schedule) {
            calllink(8);

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



    public void function(String s1,int i1) {
        FragmentManager fmm = getSupportFragmentManager();
        FragmentTransaction t = fmm.beginTransaction();
        content c= new content();
        Bundle b = new Bundle();
        b.putString("description", s1);
        b.putInt("check", i1);
        c.setArguments(b);
        t.replace(R.id.fragment_container, c).addToBackStack(null).commit();
    }


    public void calllink(int i) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        link reddy = new link();
        Bundle vaka = new Bundle();
        vaka.putInt("check", i);
        reddy.setArguments(vaka);
        fragmentTransaction.replace(R.id.fragment_container, reddy).addToBackStack(null).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main1, menu);
        return true;
    }

}
