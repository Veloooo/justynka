package pl.justynkailuis.dziedziczenie;

public abstract class Zwierze {
    private int liczbaLapekLubPletw;
    private String rozmiar;
    private String srodowisko;

    // Konstruktor
    public Zwierze(int liczbaLapek, String rozmiar, String srodowisko) {
        this.liczbaLapekLubPletw = liczbaLapek;
        this.rozmiar = rozmiar;
        this.srodowisko = srodowisko;
    }
    /*
        Metoda abstrakcyjna którą musi zaimplementować każda klasa dziedzicząca po klasie zwierze
     */
    public abstract void dajGlos();
    public abstract String jakSieNazywam();

    /**
     * To jest metoda która zwraca wartość pola liczbaLapekLubPletw
     */
    public int getLiczbaLapekLubPletw() {
        return liczbaLapekLubPletw;
    }

    public void setLiczbaLapekLubPletw(int liczbaLapekLubPletw) {
        this.liczbaLapekLubPletw = liczbaLapekLubPletw;
    }

    public String getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(String rozmiar) {
        this.rozmiar = rozmiar;
    }

    public String getSrodowisko() {
        return srodowisko;
    }

    public void setSrodowisko(String srodowisko) {
        this.srodowisko = srodowisko;
    }
}
