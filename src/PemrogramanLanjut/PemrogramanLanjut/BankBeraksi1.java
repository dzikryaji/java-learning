package PemrogramanLanjut.PemrogramanLanjut;

/**
 *
 * @author dzikryaji
 */
public class BankBeraksi1 {
    public static void main(String[] args) {
        Rekening1 rekA = new Rekening1(100000);
        rekA.SimpanUang(500000);
        rekA.getJumlahSaldo();
        rekA.AmbilUang(150000);
        
        
        Rekening1 rekB = new Rekening1(500000);
        rekB.SimpanUang(100000);
        rekB.getJumlahSaldo();
        rekB.AmbilUang(1500000);

    }
}

