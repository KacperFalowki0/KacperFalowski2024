package Podstawy;

import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int zjedzone;
        int porcja=75;
        System.out.println("Podaj ilość zjedzonych ciasteczek: ");
        zjedzone = klawiatura.nextInt();
        int kalorie = zjedzone * porcja ;
        System.out.println("Zjadłeś "+ kalorie + " kalorii");
    }
}