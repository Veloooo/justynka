package com.company.lekcja2;

public class Kot {
    private String imie;
    private String kolor;
    private String puszystosc;

    @Override
    public String toString() {
        return imie;
    }

    public Kot (String imie, String kolor, String puszystosc) {

        this.imie = imie;
        this.kolor = kolor;
        this.puszystosc = puszystosc;
    }

    }

