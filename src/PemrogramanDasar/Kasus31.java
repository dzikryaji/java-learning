package PemrogramanDasar;

import java.util.Scanner;

public class Kasus31 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Berapa KM jarak yang anda tempuh?");
        int jarak = input.nextInt();
        int biaya = jarak * 2000;
        System.out.println("Biaya perjalanan anda adalah : " + biaya);
            
        
        
    }
    
}
