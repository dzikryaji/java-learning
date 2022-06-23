package PemrogramanLanjut.Tugas07;

public class MahasiswaFILKOM extends Manusia{
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getStatus(){
        String angkatan = "20" + nim.charAt(0) + nim.charAt(1);
        String prodi;
        if (nim.charAt(6) == '2') {
            prodi = "Teknik Informatika";
        } else if (nim.charAt(6) == '3') {
            prodi = "Teknik Komputer";
        } else if (nim.charAt(6) == '4') {
            prodi = "Sistem Informasi";
        } else if (nim.charAt(6) == '6') {
            prodi = "Pendidikan Teknologi Informasi";
        } else if (nim.charAt(6) == '7') {
            prodi = "Teknologi Informasi";
        } else{
            prodi = null;
        }
        return prodi + ", " + angkatan;
    }

    public double getBeasiswa(){
        if (ipk > 3 && ipk <= 3.5) {
            return 50;
        } else if (ipk > 3.5 && ipk <= 4) {
            return 75;
        } else {
            return 0;
        }
    }

    @Override
    public double getPendapatan(){
        return getTunjangan() + getBeasiswa();
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
                + "\nNIM           :"+ this.nim
                + "\nIPK           :"+ this.ipk
                + "\nStatus        :"+ getStatus() + "\n";
    }
}
