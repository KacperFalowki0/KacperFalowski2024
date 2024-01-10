package Podstawy;

import java.util.Scanner;

public class Zad23 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int dlugosc;
        int iloscmiejsca;
        int odleglosc;
        System.out.println("Podaj długość rzędów w metrach");
        dlugosc = klawiatura.nextInt();
        System.out.println("Podaj ilość miejsca zajmowanego przez okratowanie w metrach");
        iloscmiejsca = klawiatura.nextInt();
        System.out.println("Podaj odległości między sadzonkami w metrach");
        odleglosc = klawiatura.nextInt();
        double liczbasadzonek = (dlugosc - 2*iloscmiejsca) / odleglosc;
        System.out.println("Liczba sadzonek ktore zmieszcza sie w rzedzie to: " + (int)liczbasadzonek  );


    }
}
