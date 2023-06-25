package com.example.quora;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.widget.Toolbar;

public class HomeActivity extends AppCompatActivity {
    private DrawerLayout drawer_Layout;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        drawer_Layout = findViewById(R.id.drawer_layout);
        toolbar = findViewById(R.id.home_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Quora App");

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,drawer_Layout, toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer_Layout.addDrawerListener(toggle);
        toggle.syncState();


    }
}