package PemrogramanDasar;

import java.util.Scanner;

public class MainBilanganv10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil, byk;
        int out = 0;
        System.out.println("****************");
        System.out.println("Main Bilangan v1.0");
        System.out.println("****************");
        System.out.println("");
        System.out.print("Masukkan sebuah bilangan bulat: ");
        bil = input.nextInt();
        System.out.print("Berapa kali bilangan ingin dicetak? ");
        byk = input.nextInt();
        System.out.println("Hasil:");
        while (out < byk){
            System.out.println(bil);
            out++;
        }
    }
}
