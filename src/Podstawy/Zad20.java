package Podstawy;

import java.util.Scanner;

public class Zad20 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int liczbaciastek;
        double szklankaCukruna1 = 0.0312;
        double szklankaMasłana1 = 0.0208;
        double szklankaMąkina1 = 0.0572;
        System.out.println("Podaj liczbę oczekiwanych ciastek");
        liczbaciastek = klawiatura.nextInt();
        double potrzebnycukier = szklankaCukruna1 * liczbaciastek;
        double potrzebnemaslo = szklankaMasłana1 * liczbaciastek;
        double potrzebnamaka = szklankaMąkina1 * liczbaciastek;
        System.out.println("Potrzeba " + potrzebnycukier + " szklanki cukru, " + potrzebnemaslo + " szklanki masła oraz " + potrzebnamaka + " szklanki mąki na tyle ciastek.");

    }
}

