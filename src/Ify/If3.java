package Ify;

import java.util.Scanner;

public class If3 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj wage w kg ");
        double waga = klawiatura.nextDouble();
        System.out.println("Podaj wzrost w cm  ");
        double wzrost = klawiatura.nextDouble();
        double BMI =  waga / Math.pow (wzrost,2);
        if (BMI < 18.5   ){
            System.out.println(" Masz niedowagę ");
        }
        else if (BMI > 18.5 && BMI < 25   ){
            System.out.println(" Masz prawidłową wage ");
        }
        else if (BMI > 25   ){
            System.out.println(" Masz nadwagę ");
        }


    }

}