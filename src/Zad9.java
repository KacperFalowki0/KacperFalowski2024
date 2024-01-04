import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args){
        Scanner klawiatura = new Scanner(System.in);


        String name ;
        int age;
        double annualPay;

        System.out.println("Imie ");
        name = klawiatura.next();
        System.out.println("Wiek ");
        age = klawiatura.nextInt();
        //System.out.println("Chce zarabiac ");
        //annualPay = klawiatura.nextInt();

        System.out.println("Nazywam się " + name + " ,mam" + age + " lat");
        //System.out.println("i chce zarabiać" + annualPay + "złotych rocznie" );

    }
}
