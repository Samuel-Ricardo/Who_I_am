package com.study.kotlin.whoiam.domain.model;

import android.graphics.drawable.Drawable;

import com.study.kotlin.whoiam.R;

import org.jetbrains.annotations.Contract;

public class Signo {

    private String name;
    private LiteDate startDate;
    private LiteDate endDate;
    private int image;

    public Signo(String name, LiteDate startDate, LiteDate endDate, int image) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.image = image;
    }
}

