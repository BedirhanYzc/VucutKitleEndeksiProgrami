import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, kilo, vki;

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu kilogram cinsinden giriniz: ");
        kilo = input.nextDouble();

        vki = kilo / (boy * boy);
        System.out.print("Vücut kitle endeksiniz: " + vki);

    }
}