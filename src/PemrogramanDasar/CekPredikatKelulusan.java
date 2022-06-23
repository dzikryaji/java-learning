package PemrogramanDasar;

import java.util.Scanner;
public class CekPredikatKelulusan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double ipk;
        int masastud;
        String nilaib;
        System.out.println("***********************");
        System.out.println("Cek Predikat Kelulusan v1.0");
        System.out.println("***********************");
        System.out.println("");
        System.out.print("Masukkan IPK mahasiswa: ");
        ipk = input.nextDouble();
        System.out.print("Masukkan masa studi mahasiswa (tahun): ");
        masastud = input.nextInt();
        System.out.print("Apakah mahasiswa memiliki nilai lulus di bawah B? (Y/T)");
        nilaib = input.next();
        System.out.println("");
        if (ipk > 3.5 && masastud <= 4 && "T".equals(nilaib)) {
            System.out.println("Mahasiswa lulus dengan predikat Dengan Pujian.");
        } else if (ipk > 2.75) {
            System.out.println("Mahasiswa lulus dengan predikat Sangat Memuaskan.");
        } else if (ipk <= 2.75 && ipk > 2.00) {
            System.out.println("Mahasiswa lulus dengan predikat Memuaskan");
        } 
        System.out.println("");
        System.out.println("Terima kasih telah menggunakan layanan ini.");
    }
    
}
