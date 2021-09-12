package com.study.kotlin.whoiam.domain.model;

import android.graphics.drawable.Drawable;

import org.jetbrains.annotations.Contract;

public class Signo {

    /*
    public enum Signos {

        ARIES(new Signo());

        private Signo signo;

        Signos(Signo signo) {

            signo = signo;
        }

        @Contract(pure = true)
        public Signo getSigno() {
            return signo;
        }
    }
    */

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

