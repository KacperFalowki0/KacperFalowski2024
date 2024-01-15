package Ify;

import java.util.Scanner;

public class If6 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int sekundy;
        System.out.println(" Podaj liczbe sekund ");
        sekundy = klawiatura.nextInt();


        if (sekundy >= 60  ){
            System.out.println(" Liczba minut to: " +sekundy/60);
        }
        else if (sekundy >= 3600  ){
            System.out.println("  Liczba godzin to: " +sekundy/3600);

        }
        else if (sekundy >= 86400  ){
            System.out.println("  Liczba dni to: " +sekundy/86400);

        }


    }

}