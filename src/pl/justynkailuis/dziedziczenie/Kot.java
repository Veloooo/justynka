package pl.justynkailuis.dziedziczenie;

import pl.justynkailuis.lekcja2.Czlowiek;

public class Kot extends Zwierze {
    private String imie;
    private String kolor;
    private String puszystosc;

    @Override
    public String toString() {
        return imie;
    }

    public Kot ( String rozmiar, String srodowisko, String imie, String kolor, String puszystosc) {
        super(4, rozmiar, srodowisko);
        this.imie = imie;
        this.kolor = kolor;
        this.puszystosc = puszystosc;

    }

    @Override
    public void dajGlos() {
        System.out.println("mur mur mur");
    }

    @Override
    public String jakSieNazywam() {
        return "kot "+ imie;
    }
    public void usiadz (Czlowiek c) {
        System.out.println("kot " + imie + " siada na kolanach człowieka " + c.getImie());
    }
}

