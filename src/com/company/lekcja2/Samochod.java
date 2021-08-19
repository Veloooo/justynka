package com.company.lekcja2;

public class Samochod {
    private String marka;
    private String model;
    private String kolor;
    private int rocznik;
    private Czlowiek kierowca;
    private Czlowiek[] pasazerowie;
    private int dostepneMiejsca;
    private int ogolnaLiczbaMiejsc;

    public Samochod(String marka, String model, String kolor, int rocznik, int liczbaMiejsc) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.rocznik = rocznik;
        this.pasazerowie = new Czlowiek[liczbaMiejsc - 1];
        this.dostepneMiejsca = liczbaMiejsc - 1;
        this.ogolnaLiczbaMiejsc = liczbaMiejsc - 1;
    }

    public void dodajPasazera(Czlowiek pasazer) {
        if (dostepneMiejsca > 0) {
            pasazerowie[ogolnaLiczbaMiejsc - dostepneMiejsca] = pasazer;
            dostepneMiejsca = dostepneMiejsca - 1;
            System.out.println("udało się dodać pasażera" + pasazer);
        } else {
            System.out.println("nie udało się dodać pasażera" + pasazer);
        }

    }

    public void dodajKierowce(Czlowiek kierowca) {
        if (this.kierowca == null) {
            this.kierowca = kierowca;
            System.out.println("udało się dodać kierowce"+kierowca);
        }else {
            System.out.println("już jest kierowca"+this.kierowca);
        }

    }
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append(marka).append("\n").append(model).append("\n").append("kolor: ").append(kolor)
                .append("\n").append("rocznik:").append(rocznik).append("\n").append("kierowca ").append(kierowca.getImie()).append("\n");
        for(int i = 0; i < ogolnaLiczbaMiejsc; i++){
            sb.append("pasażer "+ (i+1)+ " imie:"+ pasazerowie[i].getImie()).append("\n");
        }
        return sb.toString();
    }

}
