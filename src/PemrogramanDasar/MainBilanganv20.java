package PemrogramanDasar;

import java.util.Scanner;

public class MainBilanganv20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil1, bil2, out;
        System.out.println("****************");
        System.out.println("Main Bilangan v2.0");
        System.out.println("****************");
        System.out.println("");
        System.out.print("Masukkan bilangan bulat pertama: ");
        bil1 = input.nextInt();
        System.out.print("Masukkan bilangan bulat kedua: ");
        bil2 = input.nextInt();
        System.out.println("");
        System.out.println("Konfigurasi bilangan:");
        out = bil1;
        System.out.println(bil1);
        if (bil1 < bil2) {
            while(out < bil2){
                out++;
                System.out.println(out);
            }
        } else if (bil1 > bil2){
            while(out > bil2){
                out--;
                System.out.println(out);
            }
        }
        System.out.println("");
        System.out.print("Terima kasih, anda telah bermain dengan bilangan " + bil1 + " dan " + bil2 + ".");
    }  
}
