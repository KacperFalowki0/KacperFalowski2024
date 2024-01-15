package Ify;

import java.util.Scanner;

public class If11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double czas1;
        double czas2;
        double czas3;
        String pierwszybiegacz;
        String drugibiegacz;
        String trzecibiegacz;
        System.out.println("Podaj nazwisko pierwszego biegacza ");
        pierwszybiegacz = klawiatura.next();
        System.out.println("Podaj nazwisko drugiego biegacza ");
        drugibiegacz = klawiatura.next();
        System.out.println("Podaj nazwisko trzeciego biegacza ");
        trzecibiegacz = klawiatura.next();
        System.out.println("Podaj czas ukonczenia biegu przez pierwszego biegacza w minutach ");
        czas1 = klawiatura.nextInt();
        System.out.println("Podaj czas ukonczenia biegu przez drugiego biegacza w minutach ");
        czas2 = klawiatura.nextInt();
        System.out.println("Podaj czas ukonczenia biegu przez trzeciego biegacza w minutach ");
        czas3 = klawiatura.nextInt();

        if (czas1 < czas2 && czas1 < czas3 && czas2 < czas3) {
            System.out.println(" " + pierwszybiegacz + " " + drugibiegacz + " " + trzecibiegacz);
        }
        else if (czas1 < czas2 && czas1 < czas3 && czas3 < czas2) {
            System.out.println("" + pierwszybiegacz + "" + trzecibiegacz + "" + drugibiegacz);
        }
       else if (czas2 < czas1 && czas2 < czas3 && czas1 < czas3) {
            System.out.println("" + drugibiegacz + "" + pierwszybiegacz + "" + trzecibiegacz);
        }
        else if (czas3 < czas1 && czas3 < czas2 && czas2 < czas1) {
            System.out.println("" + trzecibiegacz + "" + drugibiegacz + "" + pierwszybiegacz);
        }
        else if (czas2 < czas1 && czas2 < czas3 && czas3 < czas1) {
            System.out.println("" + drugibiegacz + "" + trzecibiegacz + "" + pierwszybiegacz);
        }


    }

}