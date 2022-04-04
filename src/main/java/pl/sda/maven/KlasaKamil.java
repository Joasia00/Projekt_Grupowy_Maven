package pl.sda.maven;

import java.util.Scanner;

public class KlasaKamil {
    public static void main(String[] args) {
        String imie = "";
        String nazwisko = "";
        float liczba1 = 0;
        float liczba2 = 0;
        float roznica, suma;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoję imie: ");
        imie = scanner.next();
        System.out.println("Podaj swoję nazwisko: ");
        nazwisko = scanner.next();
        System.out.println("Podaj pierwszą liczbę: ");
        liczba1 = scanner.nextFloat();
        System.out.println("Podaj drugą liczbę: ");
        liczba2 = scanner.nextFloat();

        suma = liczba1+liczba2;
        roznica = liczba1-liczba2;

        System.out.println("Hej " + imie + " " + nazwisko + " ! Suma tych liczb wynosi: " + suma + ",a różnica " + roznica);


    }
}
