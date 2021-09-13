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
        setSigno(name, startDate, endDate, image);
    }

    public Signo(LiteDate birthDate) {
        Signo signo = Signos.get(birthDate).getSigno();
        setSigno(signo.name, signo.startDate, signo.endDate, signo.image);
    }

    private void setSigno(String name, LiteDate startDate, LiteDate endDate, int image) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LiteDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LiteDate startDate) {
        this.startDate = startDate;
    }

    public LiteDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LiteDate endDate) {
        this.endDate = endDate;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

