package com.company.lekcja2;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Podroz {
    private Miasto miastoStartowe;
    private Miasto miastoDocelowe;
    private Samochod samochod;

    public Podroz(Miasto miastoStartowe, Miasto miastoDocelowe, Samochod samochod) {
        this.miastoStartowe = miastoStartowe;
        this.miastoDocelowe = miastoDocelowe;
        this.samochod = samochod;
    }


    public double obliczOdleglosc() {
        double odleglosc = sqrt(pow(miastoDocelowe.getPolozenie().x - miastoStartowe.getPolozenie().x, 2) + (pow(miastoDocelowe.getPolozenie().y - miastoStartowe.getPolozenie().y, 2)));

        return odleglosc;
    }
}
