package ru.lazydevelop.theeldrichhorrorcardgamehelper;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


import ru.lazydevelop.theeldrichhorrorcardgamehelper.databinding.ActivityMainBinding;



public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    SharedPreferences mySharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mySharedPreferences = getSharedPreferences("APP_PREFERENCES", Context.MODE_PRIVATE);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard)
                .build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
        getSupportActionBar().hide();
    }
}