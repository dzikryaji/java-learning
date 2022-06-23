package PemrogramanLanjut.Tugas07;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Pekerja extends Manusia{
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, LocalDate tahunMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public String getFormattedDate(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        return formatter.format(tahunMasuk);
    }

    public double getBonus(){
        double bonus;
        Period lama = Period.between(tahunMasuk, LocalDate.now());
        if (lama.getYears()>=0 && lama.getYears()<=5) {
            bonus = gaji*5/100;
        } else if (lama.getYears()>5 && lama.getYears()<=10) {
            bonus = gaji*10/100;
        } else if (lama.getYears()> 10) {
            bonus = gaji*15/100;
        } else {
            bonus = 0;
        }
        return bonus;
    }

    @Override
    public double getTunjangan() {
        int tambahan = jumlahAnak*20;
        return super.getTunjangan()+tambahan;
    }

    @Override
    public double getPendapatan(){
        return getTunjangan() + getGaji() + getBonus();
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
                + "\nJumlah Anak   :"+ this.jumlahAnak
                + "\nGaji          :"+ this.gaji + "\n";
    }
}
