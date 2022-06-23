package PemrogramanDasar;

import java.util.Scanner;

/**
 *
 * @author dzikryaji
 */
public class SemuaTakSamav10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*********************");
        System.out.println("Semua Tak Sama");
        System.out.println("v1.0");
        System.out.println("*********************");
        System.out.println("");
        System.out.print("Berapa banyaknya bilangan dalam daftar bilangan? ");
        int banyak = input.nextInt();
        double[] ArrBil = new double[banyak];
        System.out.println("");
        int i = 0;
        while (i < banyak){
            System.out.print("  Masukkan bilanganke-" + (i+1) + ": ");
            double bil = input.nextDouble();
            ArrBil[i] = bil;
            i++;
        }
        System.out.println("");
        System.out.println("Daftar bilangan:");
        i = 0;
        int j = 1;
        while (i < banyak){
            if (ArrBil[i] % 1 == 0) {
                System.out.printf("    Bilangan ke-%d: %.0f\n",(i+1),ArrBil[i]*j);
            } else {
                System.out.println("    Bilangan ke-" + (i + 1) + ": " + ArrBil[i]*j);
            }
            j += 2;
            i++;
        }
    }
}
