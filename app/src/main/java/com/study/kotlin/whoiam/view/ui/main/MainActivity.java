package com.study.kotlin.whoiam.view.ui.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.study.kotlin.whoiam.databinding.ActivityMainBinding;
import com.study.kotlin.whoiam.domain.model.LiteDate;
import com.study.kotlin.whoiam.view.ui.signo.SignoScreen;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    public static LiteDate birthDate = LiteDate.now();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        
        setup();
    }

    private void setup() {
        setupListeners();
    }

    private void setupListeners() {

        binding.inputDate.getEditText().setOnClickListener(view -> {

            MaterialDatePicker datePicker = MaterialDatePicker.Builder.datePicker().build();

            datePicker.addOnPositiveButtonClickListener(selection -> {
                TimeZone timeZone = TimeZone.getDefault();
                int offSet = timeZone.getOffset(new Date().getTime()) * -1;

                binding.inputDate.getEditText().setText(
                        new SimpleDateFormat(
                                "dd/MM/yyyy",
                                new Locale("pt", "BR"))
                                    .format(
                                            new Date((long) selection + offSet)
                                    ));
            });

            datePicker.show(getSupportFragmentManager(), "DATE_PICKER_TAG");
        });


        binding.btnMySigno.setOnClickListener(view -> {

           birthDate = new LiteDate(binding.inputDate.getEditText().getText().toString());

           startActivity(new Intent(this, SignoScreen.class));
        });

    }


}
