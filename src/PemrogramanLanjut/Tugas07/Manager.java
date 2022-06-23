package PemrogramanLanjut.Tugas07;

import java.time.LocalDate;

public class Manager extends Pekerja{
    private String departemen;

    public Manager(String departemen, double gaji, LocalDate tahunMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahunMasuk, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + (getGaji()/10);
    }

    @Override
    public String toString(){
        String kelamin;
        if (isJenisKelamin() == true) {
            kelamin = "Laki-laki";
        } else {
            kelamin = "Perempuan";
        }
        return"Nama          :"+ getNama()
                + "\nNIK           :"+ getNik()
                + "\nJenis Kelamin :"+ kelamin
                + "\nPendapatan    :"+ getPendapatan()
                + "\nTahun Masuk   :"+ getFormattedDate()
                + "\nJumlah Anak   :"+ getJumlahAnak()
                + "\nGaji          :"+ getGaji()
                + "\nDepartemen    :"+ this.departemen + "\n";
    }
}
