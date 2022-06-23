package PemrogramanDasar;

import java.util.Scanner;

public class Kalkulatorv1a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hasil, bil1, bil2;
        String oper;
        hasil = 0;
        System.out.println("*************");
        System.out.println("Kalkulator v1.b");
        System.out.println("*************");
        System.out.println("");
        System.out.print("Masukkan bilangan pertama: ");
        bil1 = input.nextDouble();
        System.out.print("Masukkan operator aritmetika (+, -, *, atau /): ");
        oper = input.next();
        System.out.print("Masukkan bilangan kedua: ");
        bil2 = input.nextDouble();
        System.out.println("");
        if ("+".equals(oper)) {
            hasil = bil1 + bil2;
        } else if ("-".equals(oper)) {
            hasil = bil1 - bil2;
        } else if ("*".equals(oper)) {
            hasil = bil1 * bil2;
        } else if ("/".equals(oper)) {
            hasil = bil1 / bil2;
        }
        System.out.println("Hasil operari: " + hasil);
        System.out.println("");
    }
}
