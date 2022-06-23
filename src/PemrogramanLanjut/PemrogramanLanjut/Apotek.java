package PemrogramanLanjut.PemrogramanLanjut;

import java.util.ArrayList;
import java.util.Scanner;

class pasien{
    private String nama;
    private int umur;
    private String alamat;
    private String kelamin;
    private String keluhan;
    public obat[] obatPasien;
    public int banyakObat = 0;
    
    public pasien(String nama, int umur, String alamat, String kelamin, String keluhan) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
        this.kelamin = kelamin;
        this.keluhan = keluhan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKelamin() {
        return kelamin;
    }

    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }
}

class obat{
    private String nama;
    private String noSeri;
    private String kategori;
    private int ketersediaan;

    public obat(String nama, String noSeri, String kategori, int ketersediaan) {
        this.nama = nama;
        this.noSeri = noSeri;
        this.kategori = kategori;
        this.ketersediaan = ketersediaan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoSeri() {
        return noSeri;
    }

    public void setNoSeri(String noSeri) {
        this.noSeri = noSeri;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getKetersediaan() {
        return ketersediaan;
    }

    public void setKetersediaan(int ketersediaan) {
        this.ketersediaan = ketersediaan;
    }
}

public class Apotek {   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<pasien> arrPasien = new ArrayList<>();
        ArrayList<obat> arrObat = new ArrayList<>();
        int j = 0;
        while(j==0){
            System.out.println("Pilih Menu");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Lihat Daftar Pasien");
            System.out.println("3. Lihat Daftar Obat");
            System.out.println("4. Tambah Daftar Obat");
            System.out.println("5. Beri Obat ke Pasien");
            System.out.println("6. Keluar");
            System.out.print("Masukkan Pilihan Menu : ");
            int menu = input.nextInt();
            switch(menu){
                case 1:
                    input.nextLine();
                    System.out.print("Nama : ");
                    String nama = input.nextLine();
                    System.out.print("Umur : ");
                    int umur = input.nextInt();
                    System.out.print("Alamat : ");
                    input.nextLine();
                    String alamat = input.nextLine();
                    System.out.print("Jenis Kelamin : ");
                    String kelamin = input.nextLine();
                    System.out.print("keluhan : ");
                    String keluhan = input.nextLine();
                    
                    arrPasien.add(new pasien(nama,umur,alamat,kelamin,keluhan));
                    break;
                case 2:
                    for (int i = 0; i < arrPasien.size(); i++) {
                        System.out.println("Pasien ke-" + (i+1));
                        System.out.println("Nama : " + arrPasien.get(i).getNama());
                        System.out.println("Umur : " + arrPasien.get(i).getUmur());
                        System.out.println("Alamat : " + arrPasien.get(i).getAlamat());
                        System.out.println("Jenis Kelamin : " + arrPasien.get(i).getKelamin());
                        System.out.println("keluhan : " + arrPasien.get(i).getKeluhan());
                    }
                    break;
                case 3:
                    for (int i = 0; i < arrObat.size(); i++) {
                        System.out.println("Obat ke-" + (i+1));
                        System.out.println("Nama Obat: " + arrObat.get(i).getNama());
                        System.out.println("Nomor Seri : " + arrObat.get(i).getNoSeri());
                        System.out.println("Kategori : " + arrObat.get(i).getKategori());
                        System.out.println("Ketersediaan : " + arrObat.get(i).getKetersediaan());
                    }
                    break;
                case 4:
                    input.nextLine();
                    System.out.print("Nama Obat : ");
                    String namaObat = input.nextLine();
                    System.out.print("Nomor Seri : ");
                    String noSeri = input.nextLine();
                    System.out.print("Kategori : ");
                    String kategori = input.nextLine();
                    System.out.print("Ketersediaan : ");
                    int ketersediaan = input.nextInt();

                    arrObat.add(new obat(namaObat, noSeri, kategori, ketersediaan));
                    break;
                case 5:
                    input.nextLine();
                    System.out.print("Masukkan Nama Pasien : ");
                    nama = input.nextLine();
                    for (int i = 0; i < arrPasien.size(); i++) {
                        if (arrPasien.get(i).getNama().equals(nama)) {
                            if (arrPasien.get(i).obatPasien.length >= 3) {
                                System.out.println("Pasien sudah diberi 3 obat");
                            } else {
                                System.out.print("Masukkan no seri Obat");
                                String seriObat = input.next();
                                for (int k = 0; k < arrObat.size(); k++) {
                                    if (arrObat.get(k).getNoSeri().equals(seriObat)) {
                                        
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 6:
                    j = 2;
                    break;
                default :
                    System.out.println("error");
                    break;
            }
        }
    }
}
