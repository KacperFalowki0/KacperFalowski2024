package Ify;

import java.util.Scanner;

public class If9 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int odleglosc ;
        System.out.println(" Podaj odleglosc w km ");
        odleglosc = klawiatura.nextInt();

        System.out.println("Podaj wage w kg ");
        double waga = klawiatura.nextDouble();

        double cena1 = odleglosc * 1.1;
        double cena2 = odleglosc * 2.2;
        double cena3 = odleglosc * 3.7;
        double cena4 = odleglosc * 3.8;

        if (waga < 1 || waga == 11){
            System.out.println(" Cena przy odleglosci " + odleglosc + " km bedzie wynosila" + cena1);
        }
        else if (waga > 1 && waga < 3  ){
            System.out.println(" Cena przy odleglosci " + odleglosc + " km bedzie wynosila" + cena2);

        }
        else if (waga > 3 && waga < 5  ){
            System.out.println(" Cena przy odleglosci " + odleglosc + " km bedzie wynosila" + cena3);

        }
        else if (waga > 5){
            System.out.println(" Cena przy odleglosci " + odleglosc + " km bedzie wynosila" + cena4);

        }








    }

}
