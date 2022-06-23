package PemrogramanDasar;

import java.util.Scanner;

public class kasus32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//inisiasi scanner
        System.out.println("Titik A :");//output "Titik A:"
        System.out.print("X1 : ");//output "X1 : "
        int x1 = input.nextInt();//deklarasi x1 dan input x1
        System.out.print("Y1 : ");//output "Y1 : "
        int y1 = input.nextInt();//deklarasi y1 dan input y1
        System.out.println("Titik B :");//output "Titik B : "
        System.out.print("X2 : ");//output "X2 : "
        int x2 = input.nextInt();//deklarasi x2 dan input x2
        System.out.print("Y2 : ");//output "Y2 : "
        int y2 = input.nextInt();//deklarasi y2 dan input y2
        double jarak = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));//assign perhitungan jarak
        double biaya = jarak*2000;//assign perhitungan biaya
        
        System.out.println("Biaya Perjalanan adalah : " + biaya);//output nilai biaya
        
    }
 
}
