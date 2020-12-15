package com.app.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        viewPager=findViewById( R.id.viewpager );
        Adapter adapter=new Adapter( getSupportFragmentManager() );
        viewPager.setAdapter( adapter );
    }
}