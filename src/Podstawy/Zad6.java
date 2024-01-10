package Podstawy;

public class Zad6 {
    public static void main(String[] args) {
        int pokoj1i2 = 2*3*4;
        int pokoj3 = 2*3;
        int pokoj4 = 2*2;
        int calemieszkanie = pokoj1i2 + pokoj3 + pokoj4;
        double jednaosoba = calemieszkanie / 4;
        System.out.println("Powierzchnia pierwszego i drugiego pokoju to: " + pokoj1i2 + "m2");
        System.out.println("Powierzchnia trzeciego pokoju to: " + pokoj3 + "m2");
        System.out.println("Powierzchnia czwartego pokoju to: " + pokoj4 + "m2");
        System.out.print("Powierzchnia całego mieszkania to: " + calemieszkanie + "m2");
        System.out.print("Na jedna osobe przypada okolo " + jednaosoba + "m2");
    }
}
