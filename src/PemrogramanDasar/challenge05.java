package PemrogramanDasar;

import java.util.Scanner;

public class challenge05 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //inisiasi scanner
        int jaraktotal, order, penghasilan, biaya, pemotongan; //deklarasi variabel
        jaraktotal = 0; //inisiasi jaraktotal
        order = 0;//insiasi order
        int j = 0; // deklarasi dan inisiasasi variabel j
        while(j < 3){ // while dengan syarat j < 3
            System.out.println("Hari ke-" + (j+1));
            System.out.print("Banyak order: "); //output "Banyak order: "
            order = input.nextInt(); //input nilai order
            int[] km = new int [order]; //assign panjang array
            int i = 0; // deklarasi dan inisiasasi variabel i
            while(i < order){
                System.out.print("Jarak order ke-"+ (i+1) + ": "); // output
                km[i] = input.nextInt(); // input nilai km
                jaraktotal += km[i]; //assign pertambahan jarak total
                i++; //inkrementasi i
            }
            j++;
            System.out.println(""); //output
        }
        biaya = jaraktotal * 2000; //assign perhitungan biaya
        penghasilan = biaya * 4/5; //assign perhiitungan penghasilan
        pemotongan = biaya / 5; //assign perhitungan pemotongan
        if (order >= 5 ) { //if statement dengan syarat order >= 5
            penghasilan += 50000; //assign pertambahan penghasilan 
        }
        System.out.println("Jumlah total km: " + jaraktotal); //output jaraktotal
        System.out.println("Total biaya penghantaran ojek: " + biaya); //output biaya
        System.out.println("Penghasilan: " + penghasilan ); //output penghasilan
        System.out.println("Biaya yang dipotong: " + pemotongan); //output pemotongan
   } 
}
