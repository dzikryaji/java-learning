package PemrogramanLanjut.PemrogramanLanjut;

/**
 *
 * @author dzikryaji
 */
public class MobilBeraksi {
    public static void main(String[] args) {
        Mobil mobilDiah = new Mobil();
        
        mobilDiah.warna = "Pink";
        mobilDiah.tahunProduksi = 1960;
        
        System.out.println("Warna: " + mobilDiah.warna);
        System.out.println("Tahun Produksi: " + mobilDiah.tahunProduksi);            
    }
}
