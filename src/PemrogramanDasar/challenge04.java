package PemrogramanDasar;

import java.util.Scanner;

public class challenge04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //inisiasi scanner
        int jaraktotal, order, penghasilan, km, biaya, pemotongan; //deklarasi variabel
        System.out.print("Banyak order: "); //output "Banyak order: "
        order = input.nextInt(); //input nilai order
        jaraktotal = 0; //inisiasi variabel jaraktotal
        int i = 1; // deklarasi dan inisiasasi variabel i
        while (i <= order){ // while dengan syarat i <= order
            System.out.print("Jarak order ke-"+ i + ": "); // output
            km = input.nextInt(); // input nilai km
            jaraktotal += km; //assign pertambahan jarak total
            i++; //inkrementasi i
        }
        biaya = jaraktotal * 2000; //assign perhitungan biaya
        penghasilan = biaya * 4/5; //assign perhiitungan penghasilan
        pemotongan = biaya / 5; //assign perhitungan pemotongan
        if (order >= 5 ) { //if statement dengan syarat order >= 5
            penghasilan += 50000; //assign pertambahan penghasilan 
        }
        if (jaraktotal > 20) { //if statement dengan syarat jaraktotal > 20
            penghasilan += 50000; //assign pertambahan penghassilan
        }
        System.out.println("Jumlah total km: " + jaraktotal); //output jaraktotal
        System.out.println("Total biaya penghantaran ojek: " + biaya); //output biaya
        System.out.println("Penghasilan: " + penghasilan ); //output penghasilan
        System.out.println("Biaya yang dipotong: " + pemotongan); //output pemotongan
    } 
}
