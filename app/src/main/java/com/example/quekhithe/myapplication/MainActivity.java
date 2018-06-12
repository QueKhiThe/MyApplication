package com.example.quekhithe.myapplication;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;
import android.widget.ViewFlipper;

import static com.example.quekhithe.myapplication.R.id.recyclerView;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbarTrangChinh;
    ViewFlipper viewFlipper;
    NavigationView navigationTrangChinh;
    ListView lvTrangChinh;
    RecyclerView recyclerView;
    DrawerLayout drawerTrangChinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        components();
        actionbar();
    }

    private void actionbar() {
        setSupportActionBar(toolbarTrangChinh);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbarTrangChinh.setNavigationIcon(android.R.drawable.ic_menu_sort_by_size);
        toolbarTrangChinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerTrangChinh.openDrawer(GravityCompat.START);
            }
        });
    }

    private void components() {
        toolbarTrangChinh = findViewById(R.id.toobarTrangChinh);
        viewFlipper = findViewById(R.id.viewFlipper);
        navigationTrangChinh = findViewById(R.id.navigationTrangChinh);
        lvTrangChinh = findViewById(R.id.lvTrangChinh);
        recyclerView = findViewById(R.id.recyclerView);
        drawerTrangChinh = findViewById(R.id.drawerTrangChinh);
    }
}
