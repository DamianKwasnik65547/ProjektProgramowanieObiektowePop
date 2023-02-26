import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

Biblioteka biblioteka = new Biblioteka();
 biblioteka.dodajKsiazke(new Ksiazka("Symfonia c++",new Autorzy("Jerzy Grebosz"),1993));
biblioteka.dodajKsiazke(new Ksiazka("Harry Potter i Kamień Filozoficzny", new Autorzy("J.K. Rowling"),1997));
biblioteka.dodajUzytkownika(new Uzytkownik("Damian Kwaśnik"));

while(true) {
    System.out.println("1. Sprawdz dostepnosc ksiazki");
    System.out.println("2. Wypozycz ksiazke");
    System.out.println("3. Zwroc ksiazke");
    System.out.println("4. Dodaje ksiazke");
    System.out.println("5. Usun ksiazke");
    System.out.println("6. Dodaj uzytkownika");
    System.out.println("7. Usun uzytkownika");
    System.out.println("8. Pokaz wszystkie ksiazki");
    System.out.println("9. Pokaz wszystkich uzytkownikow");
    System.out.print("Podaj wybór: ");

    int wybor = scanner.nextInt();
    scanner.nextLine();

    switch (wybor) {
        case 1:
            System.out.print("Podaj tytul ksiazki ");
            String tytul = scanner.nextLine();
            if (biblioteka.sprawdzDostepnoscKsiazki(tytul)) {
                System.out.println("Ksiazka jest dostepna!");
            } else {
                System.out.println("Ksiazka niejest dostepna");
            }
            break;
    case 2:
        System.out.print("Podan nazwe uzytkownika: ");
        String imieUzy = scanner.nextLine();
        System.out.print("Podaj tytul ksiazki: ");
         tytul = scanner.nextLine();
        if (biblioteka.wypozyczKsiazke(imieUzy, tytul)) {
            System.out.println("Ksiazka została wypozyczona!");
        } else {
            System.out.println("Ksiazka nie została wypozyczona");
        }
        break;
        case 3:
            System.out.print("Podaj nazwe uzytkownika: ");
             imieUzy = scanner.nextLine();
            System.out.print("Podaj tytul ksiazki: ");
            tytul = scanner.nextLine();
            if (biblioteka.zwrocKsiazke(tytul)){
                System.out.println("Ksiazka zwrocona poprawniey");
            } else {
                System.out.println("Ksiazka nie zostala zwrocona poprawnie ");
            }
            break;
        case 4:
            System.out.print("Podaj tytul ksiazki: ");
            tytul = scanner.nextLine();
            System.out.print("Podaj imie autora: ");
            String imie = scanner.nextLine();
            System.out.print("Podaj rok publikacji : ");
            int rokPublikacji = scanner.nextInt();
            if (biblioteka.dodajKsiazke(new Ksiazka(tytul, new Autorzy(imie), rokPublikacji))) {
            System.out.println("Ksiazka została dodana!");
        } else {
            System.out.println("Ksiazka juz istnieje");
        }
        break;
        case 5:
            System.out.print("Podaj tytul ksiazki: ");
            tytul = scanner.nextLine();
            if (biblioteka.usunKsiazke(tytul)) {
                System.out.println("Ksiazka usunieta prawidłowo !");
            } else {
                System.out.println("Ksiazki nie mozna usunać");
            }
            break;
        case 6:
            System.out.print("Podaj imie uzytkownika: ");
            imie = scanner.nextLine();
            if (biblioteka.dodajUzytkownika(new Uzytkownik(imie))) {
                System.out.println("Uzytkownik dodany prawidłowo");
            } else {
                System.out.println("Taki uzytkownik juz istniej!");
            }
            break;
        case 7:
        System.out.print("Podaj imie uzytkownika: ");
        imie = scanner.nextLine();
        if (biblioteka.usunUzytkownika(imie)) {
            System.out.println("Uzytkownik usuniety prawidlowo");
        } else {
            System.out.println("Uzytkownik nie moze zostac usuniety");
        }
        break;
      case 8:
          System.out.println("Wszystkie ksiazki");
    for (Ksiazka ksiazka : biblioteka.pokazWszystkieKsiazki()) {
        System.out.println(ksiazka);}break;
        case 9:
            System.out.println("Wszyscy uzytkownicy:");
            for (Uzytkownik uzytkownik : biblioteka.pokazWszystkichUzytkownikow()) {
                System.out.println(uzytkownik);
                break;
            }
        default:
          //  System.out.println("zływybor");
break;
    }

    System.out.println();
}
}}




