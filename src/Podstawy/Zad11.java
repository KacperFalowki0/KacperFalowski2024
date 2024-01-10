package Podstawy;

import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj cene wybranego produktu: ");
        double cenaproduktu = klawiatura.nextDouble();
        double podatekstanowy = cenaproduktu * 0.04 ;
        double podateklokalny = cenaproduktu * 0.02;
        double cenapostanowym = cenaproduktu + podatekstanowy ;
        double cenaoststanowym = cenapostanowym - cenaproduktu ;
        double cenapolokalnym = cenaproduktu + podateklokalny ;
        double cenaostlokalny = cenapolokalnym - cenaproduktu ;
        double lacznacena = cenaostlokalny + cenaoststanowym + cenaproduktu;
        System.out.println("Cena z podatkiem stanowym to: " + cenaoststanowym );
        System.out.println("Cena z podatkiem lokalnym to: " + cenaostlokalny );
        System.out.println("Łączna wartość to: " + lacznacena );

        klawiatura.nextLine();
    }
}
