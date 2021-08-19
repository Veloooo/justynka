package com.company.lekcja2;

public class Czlowiek {
    private String imie;
    private String nazwisko;
    private String kolorOczu;
    private int wzrost;
    private int waga;
    private boolean czyKobieta;
    private boolean czyPrawoJazdy;
    private final int PROG_OTYLOSCI = 120;

    public Czlowiek(String imie, String nazwisko, String kolorOczu, int wzrost, int waga, boolean czyKobieta,
                    boolean czyPrawoJazdy) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.kolorOczu = kolorOczu;
        this.wzrost = wzrost;
        this.waga = waga;
        this.czyKobieta = czyKobieta;
        this.czyPrawoJazdy = czyPrawoJazdy;
    }

    public boolean czyMaszNadwage() {
        if (this.waga > PROG_OTYLOSCI)
            return true;
        else
            return false;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getKolorOczu() {
        return kolorOczu;
    }

    public void setKolorOczu(String kolorOczu) {
        this.kolorOczu = kolorOczu;
    }

    public int getWzrost() {
        return wzrost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(imie).append("\n").append(nazwisko).append("\n").append("kolor oczu: ").append(kolorOczu)
                .append("\n").append("wzrost:").append(wzrost).append("\n")
                .append("waga:").append(waga).append("\n").append("płeć ");
        if (czyKobieta) {
            sb.append("kobieta");
        } else {
            sb.append("mężczyzna");
        }
        sb.append("\n");
        if (czyPrawoJazdy) {
            sb.append("ma prawo jazdy");
        } else {
            sb.append("nie ma prawa jazdy");
        }
        return sb.toString();
    }

    public void setWzrost(int wzrost) {
        if (wzrost < 0 || wzrost > 250) {
            throw new RuntimeException("niepoprawne dane");
        } else {
            this.wzrost = wzrost;
        }
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public boolean isCzyKobieta() {
        return czyKobieta;
    }

    public void setCzyKobieta(boolean czyKobieta) {
        this.czyKobieta = czyKobieta;
    }
}
