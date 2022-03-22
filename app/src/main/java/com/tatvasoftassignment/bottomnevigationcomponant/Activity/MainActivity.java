package com.tatvasoftassignment.bottomnevigationcomponant.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.tatvasoftassignment.bottomnevigationcomponant.R;
import com.tatvasoftassignment.bottomnevigationcomponant.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

       NavController navController = Navigation.findNavController(this,R.id.fragment);
        NavigationUI.setupWithNavController(binding.bottomNavigation,navController);

    }
}