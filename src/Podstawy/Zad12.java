package Podstawy;

import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbe przejechanych kilometrow: ");
        double liczbakilometrow = klawiatura.nextDouble();
        System.out.println("Podaj ilosc zużytego paliwa: ");
        double liczbapaliwa = klawiatura.nextDouble();
        double kmnalitr = liczbakilometrow/liczbapaliwa;
        System.out.println("Przejedziesz: " + kmnalitr + "kilometrow na litr paliwa");
    }
}