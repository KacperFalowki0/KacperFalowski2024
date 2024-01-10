package Podstawy;

import java.util.Scanner;

public class Zad15 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int cenadetaliczna;
        System.out.println("Podaj cene detaliczną płytki ");
        cenadetaliczna = klawiatura.nextInt();
        double marza = 0.4;
        double zysk = cenadetaliczna * marza;
        System.out.println("Zysk to: "  + zysk + " zł");

    }
}
