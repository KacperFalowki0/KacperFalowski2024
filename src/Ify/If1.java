package Ify;

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int liczba;
        System.out.println(" Podaj liczba z przedziału 1-10 ");
        liczba = klawiatura.nextInt();
        switch(liczba) {
            case 1:
                System.out.println(" Odpowiednikiem liczby 1 jest I  ");
                break;
            case 2:
                System.out.println(" Odpowiednikiem liczby 2 jest II  ");
                break;
            case 3:
                System.out.println(" Odpowiednikiem liczby 3 jest III  ");
                break;
            case 4:
                System.out.println(" Odpowiednikiem liczby 4 jest IV  ");
                break;
            case 5:
                System.out.println(" Odpowiednikiem liczby 5 jest V  ");
                break;
            case 6:
                System.out.println(" Odpowiednikiem liczby 6 jest VI  ");
                break;
            case 7:
                System.out.println(" Odpowiednikiem liczby 7 jest VII  ");
                break;
            case 8:
                System.out.println(" Odpowiednikiem liczby 8 jest VIII  ");
                break;
            case 9:
                System.out.println(" Odpowiednikiem liczby 8 jest IX  ");
                break;
            case 10:
                System.out.println(" Odpowiednikiem liczby 8 jest X ");
                break;
        }
        if (liczba > 10 ){
            System.out.println("BŁĄD ");
        }
    }
}













