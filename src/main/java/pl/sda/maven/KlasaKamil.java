package pl.sda.maven;

import java.util.Scanner;

public class KlasaKamil {
    public static void main(String[] args) {
        String imie = "";
        String nazwisko = "";
        int numerButa = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoję imię: ");
        imie = scanner.next();
        System.out.println("Podaj swoję nazwisko: ");
        nazwisko = scanner.next();
        System.out.println("Podaj swój rozmiar buta: ");
        numerButa = scanner.nextInt();

        System.out.println("Oj, " + imie + " " + nazwisko + " - ale masz nogę! Twój rozmiar to " + numerButa + " ?!");


    }
}
