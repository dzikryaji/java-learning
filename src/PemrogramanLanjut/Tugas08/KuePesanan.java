package PemrogramanLanjut.Tugas08;

public class KuePesanan extends Kue{
    private double berat;

    public KuePesanan(double berat, String nama, double harga) {
        super(nama, harga);
        this.berat = berat;
        setHarga(hitungHarga());
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }


    @Override
    public double hitungHarga(){
        return getHarga()*berat;
    }

    @Override
    public String toString() {
        return super.toString() + ", Jenis Kue = Kue Pesanan";
    }
}
