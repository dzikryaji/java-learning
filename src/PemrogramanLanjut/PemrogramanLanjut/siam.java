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
- Membuat class Mahasiswa
- Membuat class MK
================================================= */
class Mahasiswa{
    private static String Nama; //Nama Mahasiswa
    private static String NIM;  //NIM Mahasiswa
    private static String Prodi; //Prodi Mahasiswa
    private MK[] KRS = new MK[10]; //array dari MK yang diambil Mahasiswa
    
    //Konstraktor Mahasiswa
    Mahasiswa(String Nama, String NIM, String Prodi) {
    this.Nama = Nama;
    this.NIM = NIM;
    this.Prodi = Prodi;
    }
    
    //fungsi untuk mengembalikan nilai variabel Nama
    public static String getNama(){
        return Nama;
    }
    
    //fungsi untuk mengembalikan nilai variabel NIM
    public static String getNIM() {
        return NIM;
    }
    
    //fungsi untuk mengembalikan nilai variabel Prodi
    public static String getProdi() {
        return Prodi;
    } 
}

class MK{
    private String KodeMK; //Kode dari MK
    private String NamaMK; //Nama dari MK
    private int SKS; //SKS dari MK
    private String Nilai; //Nilai dari MK
    private double kali; // nilai kali sks dan ip dari MK
    //total kali dan total SKS dari MK
    private static double totalKali, totalSKS;
    
    //Konstruktor MK
    MK(String KodeMK, String NamaMK, int SKS, String Nilai) {
        this.KodeMK = KodeMK;
        this.NamaMK = NamaMK;
        this.SKS = SKS;
        this.Nilai = Nilai;
        kali = (getSKS() * getConvertIP());
        totalKali +=kali;
        totalSKS+=SKS;
    }
    
    //fungsi untuk mengembalikan nilai variabel KodeMK
    public String getKodeMK() {
        return KodeMK;
    }
    
    //fungsi untuk mengembalikan nilai variabel NamaMK
    public String getNamaMK() {
        return NamaMK;
    }
    
    //fungsi untuk mengembalikan nilai variabel SKS
    public int getSKS() {
        return SKS;
    }
    
    //fungsi untuk mengembalikan nilai variabel Nilai
    public String getNilai() {
        return Nilai;
    }
    
    //fungsi untuk mengembalikan nilai variabel KodeMK
    public static double getTotalKali() {
        return totalKali;
    }
    
    //fungsi untuk mengembalikan nilai variabel totalSKS
    public static double getTotalSKS() {
        return totalSKS;
    }
    
    //fungsi untuk mengembalikan nilai variabel kali
    public double getKali(){
        return kali;
    }
    
    //fungsi untuk mengubah nilai menjadi IP
    public double getConvertIP() {
        if("A".equals(Nilai)){
            return 4;
        }
        else if("B+".equals(Nilai)){
            return 3.5;
        }
        else if("B".equals(Nilai)){
            return 3;
        }
        else if("C+".equals(Nilai)){
            return 2.5;
        }
        else if("C".equals(Nilai)){
            return 2;
        }
        else if("D+".equals(Nilai)){
            return 1.5;
        }
        else if("D".equals(Nilai)){
            return 1;
        }
        else if("E".equals(Nilai)){
            return 0;
        }
        else{
            return 0;
        }
    }
}
