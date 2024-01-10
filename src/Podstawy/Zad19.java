package Podstawy;

import java.util.Scanner;

public class Zad19 {
    public static void main(String[] args) {
        int liczbaankietowanych = 12467;
        double jedentyg = liczbaankietowanych * 0.14;
        System.out.println("Przybliżona liczba osób które kupują napoje energetyki przynajmniej raz w tygodniu to: " + (int)jedentyg);
        double smak = liczbaankietowanych * 0.64;
        System.out.println("Przybliżona liczba osób które wolą smak cytrusowy to: " + (int)smak);


    }
}
