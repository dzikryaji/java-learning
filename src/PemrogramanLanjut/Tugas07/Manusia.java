package PemrogramanLanjut.Tugas07;

public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public double getTunjangan(){
        if (menikah == true) {
            if (jenisKelamin == true) {
                return 25;
            } else {
                return 20;
            }
        } else {
            return 15;
        }
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    @Override
    public String toString(){
        String kelamin;
        if (jenisKelamin == true) {
            kelamin = "Laki-laki";
        } else {
            kelamin = "Perempuan";
        }
        return"Nama          :"+ this.nama
                + "\nNIK           :"+ this.nik
                + "\nJenis Kelamin :"+ kelamin
                + "\nPendapatan    :"+ getPendapatan() + "\n";
    }
}
