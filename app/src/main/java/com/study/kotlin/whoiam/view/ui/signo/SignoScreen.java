package com.study.kotlin.whoiam.view.ui.signo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.study.kotlin.whoiam.App;
import com.study.kotlin.whoiam.R;
import com.study.kotlin.whoiam.databinding.ActivitySignoScreenBinding;
import com.study.kotlin.whoiam.domain.model.Signo;
import com.study.kotlin.whoiam.domain.model.Signos;
import com.study.kotlin.whoiam.view.ui.main.MainActivity;

import static com.study.kotlin.whoiam.App.birthDate;

public class SignoScreen extends AppCompatActivity {

    private ActivitySignoScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignoScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setup();
    }

    private void setup() {

        Signo signo = new Signo(birthDate);

        binding.yourSigno.setText(signo.getName());
        binding.imgSigno.setImageResource(signo.getImage());
        binding.signoDate.setText(signo.duration());

        setupListeners();
    }

    private void setupListeners() {
        binding.btnAgain.setOnClickListener(view -> {
            startActivity(new Intent(this, MainActivity.class));
        });
    }


}
