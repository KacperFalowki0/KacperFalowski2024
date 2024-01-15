package Ify;

import java.util.Scanner;

public class If12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int odleglosc;
        String slowa = "powietrze" ;
        String slowa1 = "woda" ;
        String slowa2 = "stal" ;



        System.out.println("Wprowadź jedno słowo z podanych: 'powietrze', 'woda', 'stal'  ");
        slowa = klawiatura.next();
        System.out.println("Podaj odleglosc jaką ma pokonać dźwięk");
        odleglosc = klawiatura.nextInt();

        double powietrze=  odleglosc/343;
        double woda=  odleglosc/1490;
        double stal=  odleglosc/5100;


        switch(slowa) {
            case "woda":
                System.out.println(powietrze);
                break;
        }

        switch(slowa1) {
            case "powietrze":
                System.out.println(powietrze);
                break;
        }
        switch(slowa2) {
            case "stal":
                System.out.println(powietrze);
                break;
        }



    }

}