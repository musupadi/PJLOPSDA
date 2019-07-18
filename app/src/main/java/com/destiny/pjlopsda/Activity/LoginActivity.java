package com.destiny.pjlopsda.Activity;

import android.os.Bundle;

import com.destiny.pjlopsda.Fragment.AdminLoginFragment;
import com.destiny.pjlopsda.R;
import com.destiny.pjlopsda.Fragment.UserLoginFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.MenuItem;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_user:
                    selectedFragment = new UserLoginFragment();
                    break;
                case R.id.navigation_admin:
                    selectedFragment = new AdminLoginFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.loginFrame,
                    selectedFragment).commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.loginFrame,
                new UserLoginFragment()).commit();
    }

}
