package PemrogramanDasar;

import java.util.Scanner;

public class MainBilangan21b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil1, bil2, fav;
        System.out.println("****************");
        System.out.println("Main Bilangan v2.1.b");
        System.out.println("****************");
        System.out.println("");
        System.out.print("Masukkan bilangan bulat pertama: ");
        bil1 = input.nextInt();
        System.out.print("Masukkan bilangan bulat kedua: ");
        bil2 = input.nextInt();
        System.out.print("Masukkan bilangan bulat favorit: ");
        fav = input.nextInt();
        System.out.println("");
        System.out.println("Konfigurasi bilangan:");
        if (bil1 > bil2) {
            for (int i = bil1; i >= bil2; i--) {
                if (i == fav) {
                    if (fav % 2 == 0) {
                        System.out.println(i + "– bilangan favorit adalah bilangan genap");
                    } else {
                        System.out.println(i + "– bilangan favorit adalah bilangan ganjil");
                    }
                    continue;
                }
                System.out.println(i);
            }
        } else {
            for (int i = bil1; i <= bil2; i++) {
                if (i == fav) {
                    if (fav % 2 == 0) {
                        System.out.println(i + "– bilangan favorit adalah bilangan genap");
                    } else {
                        System.out.println(i + "– bilangan favorit adalah bilangan ganjil");
                    }
                    continue;
                }
                System.out.println(i);
            }
        }
        System.out.println("");
        System.out.println("Terima kasih, anda telah bermain dengan bilangan " + bil1 +", " + bil2 + ", dan " + fav + ".");
    }  
}
