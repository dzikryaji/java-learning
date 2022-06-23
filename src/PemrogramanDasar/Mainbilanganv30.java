package PemrogramanDasar;

import java.util.Scanner;

public class Mainbilanganv30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil1, bil2, out1, out2;
        System.out.println("****************");
        System.out.println("Main Bilangan v3.0");
        System.out.println("****************");
        System.out.println("");
        System.out.print("Masukkan bilangan bulat pertama: ");
        bil1 = input.nextInt();
        System.out.print("Masukkan bilangan bulat kedua: ");
        bil2 = input.nextInt();
        System.out.println("");
        System.out.println("Konfigurasi bilangan:");
        out1 = bil1;
        out2 = bil2;
        System.out.println(bil1 + " " + bil2);
        if (bil1 < bil2) {
            while(out1 < bil2){
                out1++;
                out2--;
                System.out.println(out1 + " " + out2);
            }
        } else if (bil1 > bil2){
            while(out1 > bil2){
                out1--;
                out2++;
                System.out.println(out1 + " " + out2);
            }
        }
        System.out.println("");
        if (bil1==bil2) {
            System.out.println("Terima kasih, anda telah bermain dengan bilangan " + bil1 + ".");
        } else {
            System.out.print("Terima kasih, anda telah bermain dengan bilangan " + bil1 + " dan " + bil2 + ".");
        }
    }
    
}
