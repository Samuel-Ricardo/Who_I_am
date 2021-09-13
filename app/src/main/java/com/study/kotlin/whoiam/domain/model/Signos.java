package com.study.kotlin.whoiam.domain.model;

import com.study.kotlin.whoiam.R;

import org.jetbrains.annotations.Contract;

public enum Signos {

    AQUARIO(new Signo(
            "Aquário",
            new LiteDate(2021, 1, 20),
            new LiteDate(2022, 2, 18),
            R.drawable.aquario
    )),

    PEIXES(new Signo(
            "Peixes",
            new LiteDate(2021, 2, 19),
            new LiteDate(2022, 3, 20),
            R.drawable.peixes
    )),

    ARIES(new Signo(
            "Áries",
            new LiteDate(2021, 3, 21),
            new LiteDate(2021, 4, 20),
            R.drawable.aries
    )),

    TOURO(new Signo(
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

    LEAO(new Signo(
            "Leão",
            new LiteDate(2021, 7, 23),
            new LiteDate(2021, 8, 22),
            R.drawable.lion
    )),

    VIRGEM(new Signo(
            "Virgem",
            new LiteDate(2021, 8, 23),
            new LiteDate(2021, 9, 22),
            R.drawable.virgem
    )),

    LIBRA(new Signo(
            "Virgem",
            new LiteDate(2021, 9, 23),
            new LiteDate(2021, 10, 22),
            R.drawable.libra
    )),

    ESCORPIAO(new Signo(
            "Escorpião",
            new LiteDate(2021, 10, 23),
            new LiteDate(2021, 11, 21),
            R.drawable.scorpion
    )),

    SAGITARIO(new Signo(
            "Sagitário",
            new LiteDate(2021, 11, 22),
            new LiteDate(2021, 12, 21),
            R.drawable.sagittarius
    )),

    CAPRICORNIO(new Signo(
            "Capricórnio",
            new LiteDate(2021, 12, 22),
            new LiteDate(2022, 1, 19),
            R.drawable.capricornio
    ));

    private Signo signo;

    Signos(Signo signo) {

        signo = signo;
    }

    @Contract(pure = true)
    public Signo getSigno() {
        return signo;
    }


    public static Signos get(LiteDate birthDate){
        switch (birthDate.getMonth()){

            case 1: {
                if (birthDate.getDay() < Signos.AQUARIO.getSigno().getStartDate().getDay()) return Signos.CAPRICORNIO;

                return Signos.AQUARIO;
            }

            case 2: {
                if (birthDate.getDay() < Signos.PEIXES.getSigno().getStartDate().getDay()) return Signos.AQUARIO;

                return Signos.PEIXES;
            }

            case 3: {
                if (birthDate.getDay() < Signos.ARIES.getSigno().getStartDate().getDay()) return Signos.PEIXES;

                return Signos.ARIES;
            }

            case 4: {
                if (birthDate.getDay() < Signos.TOURO.getSigno().getStartDate().getDay()) return Signos.ARIES;

                return Signos.TOURO;
            }

            case 5: {
                if (birthDate.getDay() < Signos.GEMEOS.getSigno().getStartDate().getDay()) return Signos.TOURO;

                return Signos.GEMEOS;
            }

            case 6: {
                if (birthDate.getDay() < Signos.CANCER.getSigno().getStartDate().getDay()) return Signos.GEMEOS;

                return Signos.CANCER;
            }

            case 7: {
                if (birthDate.getDay() < Signos.LEAO.getSigno().getStartDate().getDay()) return Signos.CANCER;

                return Signos.LEAO;
            }

            case 8: {
                if (birthDate.getDay() < Signos.VIRGEM.getSigno().getStartDate().getDay()) return Signos.LEAO;

                return Signos.VIRGEM;
            }

            case 9: {
                if (birthDate.getDay() < Signos.LIBRA.getSigno().getStartDate().getDay()) return Signos.VIRGEM;

                return Signos.LIBRA;
            }

            case 10: {
                if (birthDate.getDay() < Signos.ESCORPIAO.getSigno().getStartDate().getDay()) return Signos.LIBRA;

                return Signos.ESCORPIAO;
            }

            case 11: {
                if (birthDate.getDay() < Signos.SAGITARIO.getSigno().getStartDate().getDay()) return Signos.ESCORPIAO;

                return Signos.SAGITARIO;
            }

            case 12: {
                if (birthDate.getDay() < Signos.CAPRICORNIO.getSigno().getStartDate().getDay()) return Signos.SAGITARIO;

                return Signos.CAPRICORNIO;
            }

            default: {
                return ARIES;
            }
        }
    }
}