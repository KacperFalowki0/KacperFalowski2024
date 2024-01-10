package Podstawy;

import java.util.Scanner;

public class Zad22 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double cenazakupuakcji = 32.87;
        int akcje = 1000;
        double cenazaakcje = akcje * cenazakupuakcji ;
        double prowizjaprzy = cenazaakcje * 0.02;
        System.out.println("Kwota ktorą Jacek zapłacił za akcje to: " + cenazaakcje);
        System.out.println("Wartość prowizji przy zakupie: " + prowizjaprzy);
        double cenasprzedazyakcji = 33.92;
        double cenazasprzedarz = cenasprzedazyakcji * akcje;
        System.out.println("Cena sprzedaży akcji to: " + cenazasprzedarz);
        System.out.println("Wartość prowizji przy sprzedazy: " + prowizjaprzy);
        double zysklubstrata = cenazaakcje - cenazasprzedarz;
        System.out.println("Jacek zyskał " + zysklubstrata);
    }
}
