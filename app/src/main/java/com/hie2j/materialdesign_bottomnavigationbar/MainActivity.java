package com.hie2j.materialdesign_bottomnavigationbar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationBar mBottomNavigationBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initBottomNavigationBar();




    }

    private void initBottomNavigationBar() {
        mBottomNavigationBar = findViewById(R.id.id_bnb);
        mBottomNavigationBar.addItem(new BottomNavigationItem(R.drawable.up, "about")
                .setActiveColorResource(R.color.feise));
        mBottomNavigationBar.addItem(
                new BottomNavigationItem(R.drawable.up, "before")
                        .setActiveColorResource(R.color.yase));
        mBottomNavigationBar.addItem(
                new BottomNavigationItem(R.drawable.up, "card")
                        .setActiveColorResource(R.color.jietelan));
        mBottomNavigationBar.addItem(
                new BottomNavigationItem(R.drawable.up, "dall")
                        .setActiveColorResource(R.color.jietelan));
        mBottomNavigationBar.addItem(
                new BottomNavigationItem(R.drawable.up, "element")
                        .setActiveColorResource(R.color.yuebai));
        mBottomNavigationBar.initialise();//初始化!!!!!

        mBottomNavigationBar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                switch (position){
                    case 0:
                        Toast.makeText(MainActivity.this, "about click", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "before click", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "card click", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "dall click", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(MainActivity.this, "element click", Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onTabUnselected(int position) {

            }

            @Override
            public void onTabReselected(int position) {

            }
        });
    }
}
