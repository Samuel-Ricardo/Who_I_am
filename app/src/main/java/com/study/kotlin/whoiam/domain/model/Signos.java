package com.study.kotlin.whoiam.domain.model;

import com.study.kotlin.whoiam.R;

import org.jetbrains.annotations.Contract;

public enum Signos {

    ARIES(new Signo(
            "Áries",
            new LiteDate(2021, 3, 21),
            new LiteDate(2021, 4, 20),
            R.drawable.aries
    ));



    private Signo signo;

    Signos(Signo signo) {

        signo = signo;
    }

    @Contract(pure = true)
    public Signo getSigno() {
        return signo;
    }
}