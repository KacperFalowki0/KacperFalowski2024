package Ify;

import java.util.Scanner;

public class If8 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int cena = 99;
        int sztuki ;
        System.out.println(" Podaj liczbe zakupionych pakietow ");
        sztuki = klawiatura.nextInt();
        int x = sztuki;
        double prabat = cena * 0.2;
        double cena1 = (cena - prabat) * sztuki;

        double drabat = cena * 0.3;
        double cena2 = (cena - drabat) * sztuki ;

        double trabat = cena * 0.5;
        double cena3 = (cena - trabat) * sztuki;

        double crabat = cena * 0.4;
        double cena4 = (cena - crabat) * sztuki;

        if (sztuki < 19 && sztuki > 10){
            System.out.println(" Rabat to 20% i cena wynosi: " + cena1);
        }
        else if (sztuki > 20 && sztuki < 49  ){
            System.out.println(" Rabat to 30% i cena wynosi: " + cena2);

        }
        else if (sztuki > 50 && sztuki < 99  ){
            System.out.println(" Rabat to 40% i cena wynosi: " + cena3);

        }
        else if (sztuki >= 100 ){
            System.out.println(" Rabat to 50% i cena wynosi: " + cena4);

        }

    }

}