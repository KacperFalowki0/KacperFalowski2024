package Ify;

import java.util.Scanner;

public class If5 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj mase obiektu ");
        double masa =  klawiatura.nextDouble();

        double ciezar = masa * 9.8;

        if (ciezar > 1000 ){
            System.out.println(" Obiekt jest zbyt ciężki ");
        }
        else if (ciezar < 10 ){
            System.out.println(" Obiekt jest zbyt lekki ");

        }








    }

}