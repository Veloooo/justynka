package pl.justynkailuis.dziedziczenie;

public class Orka extends Zwierze {
    private String morze;

    public Orka( String rozmiar, String morze) {
        super(4, rozmiar, "woda");
        this.morze = morze;
    }

    @Override
    public void dajGlos() {
        System.out.println("bulbul uwolnić orkę");
    }

    @Override
    public String jakSieNazywam() {
        return "orka";
    }
    public void plyn (String miejsce, int predkosc) {
        System.out.println("orka z morze "+ morze + " płynie do " + miejsce + " z prędkością: " + predkosc + "km/h");
    }
}
