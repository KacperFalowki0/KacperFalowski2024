package Ify;

import java.util.Scanner;

public class If10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int kalorie;
        int gramy;
        System.out.println("Podaj ilosc tluczu w produkcie ");
        kalorie = klawiatura.nextInt();
        System.out.println("Podaj liczbe gramow tluszczu w produkcie");
        gramy = klawiatura.nextInt();


        int kalorieztluszczu = gramy * 9;
        double procent = kalorieztluszczu/gramy;


        if (kalorieztluszczu > kalorie  ){
            System.out.println(" Niepoprawne dane");
        }
        else if (procent <= 30  ){
            System.out.println("Produkt jest niskotłuszczowy");

        }



    }

}