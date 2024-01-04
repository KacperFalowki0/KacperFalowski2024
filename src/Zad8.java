import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int a1;
        int b1;
        int a2;
        int b2;
        int a3;
        int b3;
        int a4;
        int b4;
        System.out.println("Podaj dlugosc pierwszego pokoju: ");
        a1 = klawiatura.nextInt();
        System.out.println("Podaj szerokosc pierwszego pokoju: ");
        b1 = klawiatura.nextInt();
        System.out.println("Powierzchnia pierwszego pokoju to: " + a1 * b1 + "m2");
        System.out.println("Podaj dlugosc drugiego pokoju: ");
        a2 = klawiatura.nextInt();
        System.out.println("Podaj szerokosc drugiego pokoju: ");
        b2 = klawiatura.nextInt();
        System.out.println("Powierzchnia drugiego pokoju to: " + a2 * b2 + "m2");
        System.out.println("Podaj dlugosc trzeciego pokoju: ");
        a3 = klawiatura.nextInt();
        System.out.println("Podaj szerokosc trzeciego pokoju: ");
        b3 = klawiatura.nextInt();
        System.out.println("Powierzchnia trzeciego pokoju to: " + a3 * b3 + "m2");
        System.out.println("Podaj dlugosc czwartego pokoju: ");
        a4 = klawiatura.nextInt();
        System.out.println("Podaj szerokosc czwartego pokoju: ");
        b4 = klawiatura.nextInt();
        System.out.println("Powierzchnia czwartego pokoju to: " + a4 * b4 + "m2");







    }
}