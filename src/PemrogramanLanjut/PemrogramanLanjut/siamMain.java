package PemrogramanLanjut.PemrogramanLanjut;
/* ==============================================
Nama File : siam.java
Tugas : Tugas 4 Array Of Object
Versi : 1.0
Fungsi : Mendefiniskan Kelas Mahasiswa
       : Mendefinisikan Kelas MK
Author : Dzikry Aji Santoso (215150400111029)(SI-C)
Last Update : 23-Maret-2022
Update v1.0 : 23-Maret-2022
- Membuat kode implementasi dari file siam
================================================= */

import java.util.Scanner;

public class siamMain {
    //fungsi untuk mencetak garis
    public static void garis(){ 
        System.out.println("================================================================");
    }
    
    //fungsi mencetak garis tipis
    public static void garisTipis(){ 
        System.out.println("----------------------------------------------------------------");
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        garis();
        System.out.println("====================== PROGRAM SIAM UB =========================");
        garis();
        
        System.out.print("Masukkan Nama  : ");
        String Nama = input.nextLine();
        System.out.print("Masukkan NIM   : ");
        String NIM = input.nextLine();
        System.out.print("Masukkan Prodi : ");
        String Prodi = input.nextLine();
        System.out.println("");
        Mahasiswa MhsFILKOM = new Mahasiswa(Nama, NIM, Prodi);
        MK MKInput[] = new MK[6];
        
        for (int i = 0; i < 6; i++) {
            System.out.print("Kode Mata Kuliah ke- "+ (i+1) +" = ");
            String KodeMK = input.next();
            input.nextLine();
            System.out.print("Nama Mata Kuliah ke- "+ (i+1) +" = ");
            String NamaMK = input.nextLine();
            System.out.print("SKS                    = ");
            int SKS = input.nextInt();
            System.out.print("Nilai                  = ");
            String Nilai = input.next();
            System.out.println("\n");
            MKInput[i]= new MK(KodeMK, NamaMK, SKS, Nilai);
        }
        
        garis();
        System.out.println("                        KARTU HASIL STUDI                        ");
        garis();
        System.out.println("");
        
        System.out.println("Nama          = "+Mahasiswa.getNama());
        System.out.println("NIM           = "+Mahasiswa.getNIM());
        System.out.println("Program Studi = "+Mahasiswa.getProdi());
        System.out.println("Semester      = 1");
        System.out.println("");
        
        garisTipis();
        System.out.printf("%c %-10s %c %-25s %c %-3s %c %-7s %c %-7s " , '|', "KODE", '|', "MATA KULIAH", '|', "SKS", '|', "NILAI", '|',"N X K");
        System.out.println("");
        garisTipis();
        System.out.println("");
        
        for (int i = 0; i < MKInput.length; i++) {
            System.out.printf("%c %-10s %c %-25s %c %-3s %c %-7s %c %-7s " , '|', MKInput[i].getKodeMK(), '|', MKInput[i].getNamaMK(), '|', MKInput[i].getSKS(), '|', MKInput[i].getNilai(), '|',MKInput[i].getKali());
            System.out.println("");
        }
        
        garisTipis();
        System.out.printf("%40s %3s %17s" , "Jumlah :",(int)MK.getTotalSKS(), (int)MK.getTotalKali());
        System.out.println("");
        garisTipis();
        System.out.printf("%5s %1.3f", "IP = ", (MK.getTotalKali()/MK.getTotalSKS()));
        System.out.println("");
        garisTipis();
        System.out.println("");
    }
}
