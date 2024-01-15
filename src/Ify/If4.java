package Ify;

import java.util.Scanner;

public class If4 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int ptest;
        int dtest;
        int ttest;
        System.out.println(" Podaj wynik pierwszego testu ");
        ptest = klawiatura.nextInt();
        System.out.println(" Podaj wynik drugiego testu ");
        dtest = klawiatura.nextInt();
        System.out.println(" Podaj wynik trzeciego testu    ");
        ttest = klawiatura.nextInt();
        int srednia = (ptest + dtest + ttest) / 3;

        if (srednia < 100 && srednia > 90   ){
            System.out.println(" Średnia to 5 ");
        }
        else if (srednia > 80 && srednia < 89   ){
            System.out.println(" Średnia to 4 ");
        }
        else if (srednia > 70 && srednia < 79   ){
            System.out.println(" Średnia to 3 ");
        }
        else if (srednia > 60 && srednia < 69   ){
            System.out.println(" Średnia to 2 ");
        }
        else if (srednia < 60 ){
            System.out.println(" Średnia to 1 ");
        }


    }







    }

