package com.company.lekcja2;

import java.awt.*;

public class Miasto {
    private int liczbaLudnosci;
    private String nazwa;
    private Point polozenie;

    public int getLiczbaLudnosci() {
        return liczbaLudnosci;
    }

    public void setLiczbaLudnosci(int liczbaLudnosci) {
        this.liczbaLudnosci = liczbaLudnosci;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Point getPolozenie() {
        return polozenie;
    }

    public void setPolozenie(Point polozenie) {
        this.polozenie = polozenie;
    }

    public Miasto(int liczbaLudnosci, String nazwa, Point polozenie) {
        this.liczbaLudnosci = liczbaLudnosci;
        this.nazwa = nazwa;
        this.polozenie = polozenie;
    }
}
