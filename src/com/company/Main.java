package com.company;

import com.company.lekcja2.Czlowiek;
import com.company.lekcja2.Samochod;

public class Main {

    public static void main(String[] args) {
        Czlowiek daniel = new Czlowiek("Daniel","Tyran","nieoczywisty",180,76,false, true);
        Czlowiek justynka = new Czlowiek("Justynka","Miła","niebieski",164,46,true,true);
        Czlowiek tofik = new Czlowiek("Tofik","Mały","niebieski",184,66,false,true);
        Czlowiek luis = new Czlowiek("Luis","Wspaniały","żółte",184,86,false,true);
        Czlowiek arus = new Czlowiek("Aruś","Biedny","czerwone",174,76,false,true);
        Czlowiek magda = new Czlowiek("Magda","Ogromna","piwne",164,130,true, false);


        Samochod samochod = new Samochod("ford","focus","srebrny",2002, 5);

        samochod.dodajPasazera(tofik);
        samochod.dodajPasazera(luis);
        samochod.dodajPasazera(arus);
        samochod.dodajPasazera(magda);
        samochod.dodajKierowce(justynka);
        samochod.dodajKierowce(daniel);
        System.out.println(samochod);
        System.out.println(magda.czyMaszNadwage());
    }

}