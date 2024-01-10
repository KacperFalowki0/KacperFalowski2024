package Podstawy;

import java.util.Scanner;

public class Zad17 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj cenę posiłku: ");
        double cenaposilku = klawiatura.nextDouble();
        double cenaprzedpodatek = cenaposilku * 0.675;
        System.out.println(cenaposilku);
        double podatek = cenaposilku - cenaprzedpodatek;
        System.out.println(podatek);
        double napiwek = (cenaposilku + podatek) * 0.2;
        System.out.println("Wartość podatku to: " + podatek);
        System.out.println("Wysokość napiwku: " + napiwek);
        double łączna = cenaposilku + podatek + napiwek;
        System.out.println("Łączna cena: " + łączna);

    }
}
