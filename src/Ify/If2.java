package Ify;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int dzien;
        int miesiac;
        int rok;
        System.out.println(" Podaj dzień ");
        dzien = klawiatura.nextInt();
        System.out.println(" Podaj miesiąc ");
        miesiac = klawiatura.nextInt();
        System.out.println(" Podaj dwie ostatnie cyfry roku   ");
        rok = klawiatura.nextInt();
        int iloczyn = dzien * miesiac;
        if (iloczyn < rok || iloczyn < rok){
            System.out.println(" Data nie jest magiczna ");
        }
        else if (iloczyn == rok ){
            System.out.println(" Data jest magiczna ");

        }








    }

}
