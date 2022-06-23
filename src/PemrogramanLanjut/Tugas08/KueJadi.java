package PemrogramanLanjut.Tugas08;

public class KueJadi extends Kue {
    private double jumlah;

    public KueJadi(double jumlah, String nama, double harga) {
        super(nama, harga);
        this.jumlah = jumlah;
        setHarga(hitungHarga());
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public double hitungHarga(){
        return (getHarga()*jumlah*2);
    }

    @Override
    public String toString() {
        return super.toString() + ", Jenis Kue = Kue Jadi";
    }
}
