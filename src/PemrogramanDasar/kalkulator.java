package PemrogramanDasar;

import java.util.Scanner;
public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hasil, bil1, bil2;
        int oper;
        hasil = 0;
        System.out.println("*************");
        System.out.println("Kalkulator v2.a");
        System.out.println("*************");
        System.out.println("");
        System.out.println("Menu operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("");
        System.out.print("Pilih operasi: ");
        oper = input.nextInt();
        System.out.println("");
        switch (oper) {
            case 1:
                System.out.println("Penjumlahan") ;
                break;
            case 2:
                System.out.println("Pengurangan");
                break;
            case 3:
                System.out.println("Perkalian"); 
                break;
            case 4:
                System.out.println("Pembagian");
                break;
        }
        System.out.print("Angka pertama: ");
        bil1 = input.nextDouble();
        System.out.print("Angka kedua: ");
        bil2 = input.nextDouble();
        System.out.println("");
        switch (oper) {
            case 1:
                hasil = bil1 + bil2;
                break;
            case 2:
                hasil = bil1 - bil2;
                break;
            case 3:
                hasil = bil1 * bil2;
                break;
            case 4:
                hasil = bil1 / bil2;
                break;
        }
        System.out.println("Hasil Operasi: " + hasil);
        System.out.println("");
    }
}
