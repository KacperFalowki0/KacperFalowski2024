package Podstawy;

import java.util.Scanner;

public class Zad18 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double cenaakacji = 600 * 21.77;
        System.out.println("Cena bez prowizji to: " + cenaakacji);
        double prowizja = cenaakacji * 0.02;
        System.out.println("Cena prowizji to: " + prowizja);


    }
}
