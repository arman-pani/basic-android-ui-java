package com.example.constraintlayoutbasics.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import androidx.appcompat.widget.Toolbar;

import com.example.constraintlayoutbasics.R;
import com.example.constraintlayoutbasics.fragments.ProfileFragment;
import com.example.constraintlayoutbasics.fragments.SettingsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class RegisterUser1Activity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView drawerNavigationView;

    private Toolbar appbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find NavHostFragment from the layout
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.nav_host_fragment);

        NavController navController = navHostFragment.getNavController();

        drawerLayout = findViewById(R.id.drawer_layout);
        drawerNavigationView = findViewById(R.id.drawer_nav_view);
        appbar = findViewById(R.id.appbar);

        setSupportActionBar(appbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle
                (this, drawerLayout, appbar, R.string.open_drawer, R.string.close_drawer);

        toggle.setDrawerIndicatorEnabled(false);
        appbar.setNavigationIcon(R.drawable.menu);
        appbar.setNavigationOnClickListener(v -> drawerLayout.openDrawer(GravityCompat.START));
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        drawerNavigationView.setNavigationItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.nav_profile){
                navController.navigate(R.id.profileFragment);
            } else if (id == R.id.nav_settings){
                navController.navigate(R.id.settingsFragment);
            } else if (id == R.id.nav_logout){
                Toast.makeText(this, "User is logout!!", Toast.LENGTH_SHORT).show();
            }
            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        });



        // Setup BottomNavigationView with NavController
        BottomNavigationView bottomNavigationView =  findViewById(R.id.bottom_navigation);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.appbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.profileActionButton) {
            // Handle profile action
            return true;
        } else if (id == R.id.action_call) {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:7008017866"));
            startActivity(intent);
            return true;

        }
        return super.onOptionsItemSelected(item);
    }
}