package PemrogramanDasar;

import java.util.Scanner;

public class SemuaSamav10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("******************");
        System.out.println("Semua Sama");
        System.out.println("v1.0");
        System.out.println("******************");
        System.out.println("");
        System.out.print("Berapa banyaknya bilangan dalam daftar bilangan? ");
        int banyak = input.nextInt();
        System.out.print("Masukkan sebuah bilangan: ");
        double bil = input.nextDouble();
        double[] ArrBil = new double[banyak];
        System.out.println("Daftar bilangan:");
        int i = 0;
        while (i < banyak){
            ArrBil[i] = bil;
            System.out.println("    Bilangan ke-" + (i + 1) + ": " + ArrBil[i]);
            i++;
        }
    }
}