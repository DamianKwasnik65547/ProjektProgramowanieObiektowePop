import java.util.ArrayList;
import java.util.List;
public class Biblioteka {
    private  List<Ksiazka> ksiazki = new ArrayList<>();
    private  List<Uzytkownik> uzytkownicy = new ArrayList<>();

    public  boolean dodajKsiazke(Ksiazka ksiazka){
        if(!ksiazki.contains(ksiazka)){
            return ksiazki.add(ksiazka);
        }
        return false;
    }
    public boolean usunKsiazke(String tytul){
        for(Ksiazka ksiazka : ksiazki){
            if(ksiazka.getTytul().equals(tytul)){
                return ksiazki.remove(ksiazka);
            }
        }
        return false;
    }
public  boolean dodajUzytkownika(Uzytkownik uzytkownik){
        if(!uzytkownicy.contains(uzytkownik)){
            return uzytkownicy.add(uzytkownik);
        }return false;

    }
    public  boolean usunUzytkownika(String imie){
        for ( Uzytkownik uzytkownik : uzytkownicy){
            if(uzytkownik.getImieUzy().equals(imie)){
                return  uzytkownicy.remove(uzytkownik);
            }
        }
        return false;
    }
    public boolean sprawdzDostepnoscKsiazki(String tytul){
        for (Ksiazka ksiazka : ksiazki){
            if (ksiazka.getTytul().equals(tytul)) {
                return true;
            }
        }
        return false;
    }
    public boolean wypozyczKsiazke(String tytul, String imieA){
        for(Ksiazka ksiazka : ksiazki){
            if(ksiazka.getTytul().equals(tytul)){
                ksiazki.remove(ksiazka);
                return true;
            }
        }
        return false;
    }
    public boolean zwrocKsiazke(String ksiazka){
      //  Ksiazka Ksiazka = null;

        return  ksiazki.add((Ksiazka) ksiazki);
    }
    public List<Ksiazka> pokazWszystkieKsiazki(){
        return ksiazki;
    }
    public  List<Uzytkownik> pokazWszystkichUzytkownikow(){
        return uzytkownicy;
    }


}
