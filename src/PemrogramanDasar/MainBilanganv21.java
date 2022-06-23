package PemrogramanDasar;

import java.util.Scanner;

public class MainBilanganv21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil1, bil2, fav, i;
        System.out.println("****************");
        System.out.println("Main Bilangan v2.1.a");
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
        i = bil1;
        if (bil1 > bil2) {
            while (i >= bil2){
                if (i == fav) {
                    if (fav % 2 == 0) {
                        System.out.println(i + "– bilangan favorit adalah bilangan genap");
                    } else {
                        System.out.println(i + "– bilangan favorit adalah bilangan ganjil");
                    }
                    i--;
                    continue;
                }
                System.out.println(i);
                i--;
            }          
        } else {
            while (i <= bil2){
                if (i == fav) {
                    if (fav % 2 == 0) {
                        System.out.println(i + "– bilangan favorit adalah bilangan genap");
                    } else {
                        System.out.println(i + "– bilangan favorit adalah bilangan ganjil");
                    }
                    i++;
                    continue;
                }
                System.out.println(i);
                i++;
            }
        }
        System.out.println("");
        System.out.println("Terima kasih, anda telah bermain dengan bilangan " + bil1 +", " + bil2 + ", dan " + fav + ".");
    }  
}