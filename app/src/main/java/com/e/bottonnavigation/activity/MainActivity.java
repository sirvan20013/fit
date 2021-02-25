package com.e.bottonnavigation.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.e.bottonnavigation.R;
import com.e.bottonnavigation.fragment.AboutFragment;
import com.e.bottonnavigation.fragment.FoodFragment;
import com.e.bottonnavigation.fragment.MoveFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    FrameLayout frameLayout;
    AboutFragment aboutFragment;
    FoodFragment foodFragment;
    MoveFragment moveFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
8484        frameLayout = findViewById(R.id.frame_layout_main);
        bottomNavigationView = findViewById(R.id.nav_main);
        aboutFragment = new AboutFragment();
        moveFragment = new MoveFragment();
        foodFragment = new FoodFragment();

        setFragment(moveFragment);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.item_move:
                        setFragment(moveFragment);
                        return  true;
                    case R.id.item_food:
                        setFragment(foodFragment);
                        return true;
                    case R.id.item_about:
                        setFragment(aboutFragment);
                        return true;
                }
                return false;
            }
        });

    }


    private void setFragment(Fragment fragment) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout_main,fragment);
        fragmentTransaction.commit();

    }

}