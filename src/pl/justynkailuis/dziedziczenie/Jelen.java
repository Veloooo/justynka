package pl.justynkailuis.dziedziczenie;

public class Jelen extends Zwierze{
    private String poroze;


    public Jelen( String rozmiar, String poroze) {
        super(4, rozmiar, "las");
        this.poroze = poroze;
    }

    @Override
    public void dajGlos() {
        System.out.println("auuu zjem ciem");
    }

    @Override
    public String jakSieNazywam() {
        return "jeleń";
    }

    public void szarzuj(Zwierze z) {
        System.out.println("jelen który ma "+ poroze + " poroże szarżuje na " + z.jakSieNazywam());
    }
}
