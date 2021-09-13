package com.study.kotlin.whoiam;

import android.app.Application;

import com.study.kotlin.whoiam.domain.model.LiteDate;

public class App extends Application {

    public static LiteDate birthDate = LiteDate.now();

}
