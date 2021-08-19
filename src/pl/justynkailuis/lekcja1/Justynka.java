package pl.justynkailuis.lekcja1;

public class Justynka {
    public void lekcja(){
        String imie = "Justynka";
        System.out.println("twoje imie to: " + imie);
        int wiek = 23;
        System.out.println("twoj wiek to:" + wiek);
        if (wiek >= 18) {
            System.out.println("możesz kupić alkohol");
        } else {
            System.out.println("nie możesz kupić alkoholu");
        }
        boolean zaszczepiona = false;
        if (zaszczepiona == true) {
            System.out.println("nie musisz mieć kwarantanny");
        } else {
            System.out.println("musisz odbyć kwarantanne");
        }
        String formaZatrudnienia = "umowa zlecenie";
        int zarobki = 65000;
        double podatek = 0;
        if (formaZatrudnienia.equals("umowa zlecenie")) {
            if (zarobki <= 85000) {
                podatek = zarobki * 0.17;
            } else {
                podatek = 85000 * 0.17 + (zarobki - 85000) * 0.32;
            }
        } else if (formaZatrudnienia.equals("działalność gospodarcza")) {
            podatek = zarobki * 0.19;
        }
        System.out.println("zapłacisz " + podatek + " podatku");

    }
}
