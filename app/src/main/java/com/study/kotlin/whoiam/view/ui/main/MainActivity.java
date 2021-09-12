package com.study.kotlin.whoiam.view.ui.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.study.kotlin.whoiam.R;
import com.study.kotlin.whoiam.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater())
        View view = binding.getRoot();
        setContentView(view);
        
        setup();
    }

    private void setup() {
        setupListeners();
    }

    private void setupListeners() {
    }


}
