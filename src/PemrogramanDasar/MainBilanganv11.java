package PemrogramanDasar;

import java.util.Scanner;

public class MainBilanganv11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil, total, rata2, min, max, banyak;
        String konfir;
        System.out.println("****************");
        System.out.println("Main Bilangan v1.1");
        System.out.println("****************");
        System.out.println("");
        System.out.print("Masukkan sebuah bilangan bulat: ");
        bil = input.nextInt();
        min = bil;
        max = bil;
        total = bil;
        System.out.println("Ingin bermain lagi?");
        System.out.print("(masukkan huruf ‘y’ (tanpa tanda kutip) jika setuju, atau huruf lainnya jika tidak setuju):");
        konfir = input.next();
        System.out.println("");
        banyak = 1;
        if ("y".equals(konfir)) {
            while (true) {
                System.out.print("Masukkan sebuah bilangan bulat: ");
                bil = input.nextInt();
                if (min > bil) {
                    min = bil;
                }
                if (max < bil) {
                    max = bil;
                }
                total += bil;
                banyak++;
                System.out.println("Ingin bermain lagi?");
                System.out.print("(masukkan huruf ‘y’ (tanpa tanda kutip) jika setuju, atau huruf lainnya jika tidak setuju): ");
                konfir = input.next();
                System.out.println("");
                if (!"y".equals(konfir)) {
                    break;
                }
            }
        }
        rata2 = total / banyak;
        System.out.println("Jumlah nilai seluruh bilangan: " + total);
        System.out.println("Nilai rata-rata dari seluruh bilangan: " + rata2);
        System.out.println("Nilai terbesar: " + max);
        System.out.println("Nilai terkecil: " + min);
    }  
}
