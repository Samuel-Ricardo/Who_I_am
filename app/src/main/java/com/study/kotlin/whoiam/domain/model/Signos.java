package com.study.kotlin.whoiam.domain.model;

import com.study.kotlin.whoiam.R;

import org.jetbrains.annotations.Contract;

public enum Signos {

    ARIES(new Signo(
            "Áries",
            new LiteDate(2021, 3, 21),
            new LiteDate(2021, 4, 20),
            R.drawable.aries
    )),

    TOUROS(new Signo(
      "Touro",
         new LiteDate(2021, 4, 21),
         new LiteDate(2021, 5, 20),
         R.drawable.taurus
    )),

    GEMEOS(new Signo(
            "Gêmeos",
            new LiteDate(2021, 5, 21),
            new LiteDate(2021, 6, 20),
            R.drawable.gemeos
    )),

    CANCER(new Signo(
            "Câncer",
            new LiteDate(2021, 6, 21),
            new LiteDate(2021, 7, 22),
            R.drawable.cancer
    )),



    private Signo signo;

    Signos(Signo signo) {

        signo = signo;
    }

    @Contract(pure = true)
    public Signo getSigno() {
        return signo;
    }
}