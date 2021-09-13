package com.study.kotlin.whoiam.view.ui.signo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.study.kotlin.whoiam.App;
import com.study.kotlin.whoiam.R;
import com.study.kotlin.whoiam.databinding.ActivitySignoScreenBinding;
import com.study.kotlin.whoiam.domain.model.Signo;
import com.study.kotlin.whoiam.domain.model.Signos;

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

        Signo mySigno = Signos.get(birthDate).getSigno();

    }


}
