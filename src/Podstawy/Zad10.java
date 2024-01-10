package Podstawy;

import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
       String firstname;
        String middleName;
        String lastName;
        System.out.println("Podaj imie: ");
        firstname = klawiatura.next();
        System.out.println("Podaj drugie imie: ");
        middleName = klawiatura.next();
        System.out.println("Podaj nazwisko: ");
        lastName = klawiatura.next();

        char firstInitial = 'K';
        char middleInitial = 'J';
        char lastInitial = 'F';
        System.out.println("Inicjał imienia to: " + firstInitial );
        System.out.println("Inicjał drugiego imienia to: " + middleInitial );
        System.out.println("Inicjał nazwiska to: " + lastInitial );
    }
}
