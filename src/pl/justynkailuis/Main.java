package pl.justynkailuis;

import pl.justynkailuis.dziedziczenie.Jelen;
import pl.justynkailuis.dziedziczenie.Kot;
import pl.justynkailuis.dziedziczenie.Orka;
import pl.justynkailuis.dziedziczenie.Zwierze;
import pl.justynkailuis.lekcja2.Czlowiek;
import pl.justynkailuis.lekcja2.Miasto;
import pl.justynkailuis.lekcja2.Podroz;
import pl.justynkailuis.lekcja2.Samochod;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

public static double cenaPaliwa = 5.40;

    public static void main(String[] args) {
        Czlowiek daniel = new Czlowiek("Daniel","Tyran","nieoczywisty",180,76,false, true, 50.1);
        Czlowiek justynka = new Czlowiek("Justynka","Miła","niebieski",164,46,true,true, 0.1);
        Czlowiek tofik = new Czlowiek("Tofik","Mały","niebieski",184,66,false,true, 22);
        Czlowiek luis = new Czlowiek("Luis","Wspaniały","żółte",184,86,false,true,99.9);
        Czlowiek arus = new Czlowiek("Aruś","Biedny","czerwone",174,76,false,true, 3);
        Czlowiek magda = new Czlowiek("Magda","Ogromna","piwne",164,130,true, false, 10.1);

        Miasto turyn = new Miasto(22990, "turyn", new Point(0, 0));
        Miasto reczpol = new Miasto(1223340, "reczpol", new Point(3, 4));

        Kot jamnik = new Kot("mały" ,"polko" ," jamnik", "czarny", "spaslak");
        Kot dzastin = new Kot("duży","domek", " dzastin", "blond", "chudy");
        dzastin.usiadz(luis);
        /*
        Kot kjut = new Kot(" kjut", "czarny", "chudy");
        Kot melman = new Kot(" melman", "rudy", "spaslak");
        Kot andzik = new Kot(" andzik", "czarny", "chudy");
        Kot roksi = new Kot(" roksi", "blond", "chudogruba");
        Kot wieslaw = new Kot(" wieslaw", "rudy", "chudy");
        Kot jaro = new Kot(" jaro", "siwy", "spaslak");
        Kot klaudzik = new Kot(" klaudzik", "blond", "chudy");
        Kot lui = new Kot(" lui", "blond", "chudy");


         */
        Jelen wlodek = new Jelen("średni","bujne");
        wlodek.szarzuj(jamnik);
        Orka basia = new Orka("mała", "Czerwone");
        basia.plyn("ocean", 4);
        List<Zwierze> zwierzeta=new ArrayList<>();
        zwierzeta.add(jamnik);
        zwierzeta.add(dzastin);
        zwierzeta.add(wlodek);;
        zwierzeta.add(basia);
        for (Zwierze z: zwierzeta){
            z.dajGlos();


        }
        Samochod samochod = new Samochod("ford","focus","srebrny",2002, 5, 8, 8 );
        Podroz sca = new Podroz(turyn, reczpol, samochod);
        System.out.println(sca.obliczOdleglosc());
        //samochod.dodajPasazera(tofik);
        //samochod.dodajPasazera(luis);
        //samochod.dodajPasazera(arus);
        //samochod.dodajPasazera(justynka);
        samochod.dodajKierowce(luis);
        samochod.dodajKierowce(magda);
        //samochod.dodajPasazera(daniel);
        //System.out.println(samochod);
        //System.out.println(magda.czyMaszNadwage());
        samochod.dodajpasazerKot( jamnik);
        samochod.dodajpasazerKot( dzastin);
        /*
        samochod.dodajpasazerKot( kjut);
        samochod.dodajpasazerKot( melman);
        samochod.dodajpasazerKot( andzik);
        samochod.dodajpasazerKot( roksi);
        samochod.dodajpasazerKot( wieslaw);
        samochod.dodajpasazerKot( jaro);
        samochod.dodajpasazerKot( klaudzik);
        samochod.dodajpasazerKot( lui);


         */
    }

}