package com.example.safeguard.MainHome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.safeguard.MainHome.adapter.HomeAdaper;
import com.example.safeguard.R;

public class HomeActivity extends AppCompatActivity {

    private GridView gv_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        gv_home = (GridView)findViewById(R.id.gv_home);
        gv_home.setAdapter(new HomeAdaper(HomeActivity.this));

        gv_home.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:

                }
            }
        });
    }

}
