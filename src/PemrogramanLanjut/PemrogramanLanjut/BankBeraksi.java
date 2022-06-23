package PemrogramanLanjut.PemrogramanLanjut;

/**
 *
 * @author dzikryaji
 */
public class BankBeraksi {
    public static void main(String[] args) {
        Rekening rekA = new Rekening(100000, "2022-01");
        rekA.SimpanUang(500000);
        rekA.AmbilUang(150000);
        
        Rekening rekB = new Rekening(500000);
        rekB.setRekeningID("2022-10");
        rekB.SimpanUang(100000);
        rekB.AmbilUang(1500000);

    }
}
