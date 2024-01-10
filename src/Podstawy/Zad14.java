package Podstawy;

import java.util.Scanner;

public class Zad14 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int wynik1;
        int wynik2;
        int wynik3;
        System.out.println("Podaj wynik pierwszego testu: ");
        wynik1 = klawiatura.nextInt();
        System.out.println("Podaj wynik drugiego testu: ");
        wynik2 = klawiatura.nextInt();
        System.out.println("Podaj wynik trzeciego testu: ");
        wynik3 = klawiatura.nextInt();
        int srednia = (wynik1+wynik2+wynik3) / 3;
        System.out.println("Średnia wynikow to: " + srednia + "%");

    }
}