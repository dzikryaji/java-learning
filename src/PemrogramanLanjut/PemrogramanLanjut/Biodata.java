package PemrogramanLanjut.PemrogramanLanjut;

/**
 *
 * @author dzikryaji
 */
public class Biodata {
    public String nama;
    public int umur;
    public String gender;
    public String prodi;
    public String angkatan;
    public String asalKota;
    public String asalSekolah;
    
    void print(){
        System.out.println(nama);
        System.out.println(umur);
        System.out.println(gender);
        System.out.println(prodi);
        System.out.println(angkatan);
        System.out.println(asalKota);
        System.out.println(asalSekolah);
    }
}

class app{
    public static void main(String[] args) {
        Biodata Biodata1 = new Biodata();
        Biodata1.nama = "Dzikry Aji Santoso";
        Biodata1.umur = 19;
        Biodata1.gender = "Laki-Laki";
        Biodata1.prodi = "Sistem Informasi";
        Biodata1.angkatan = "2021";
        Biodata1.asalKota = "Kota Bekasi";
        Biodata1.asalSekolah = "SMAN 1 Bekasi";
        Biodata1.print();
    }
}
