package PemrogramanLanjut.PemrogramanLanjut;

/**
 *
 * @author dzikryaji
 */
public class Rekening {
    private double saldo;
    private String RekeningID;
    
    Rekening(double S){
        this.saldo = S;
        System.out.println("Selamat Datang di Bank ABC");
        cekSaldo();
    }
    
    Rekening(double S, String ID){
        this.saldo = S;
        this.RekeningID = ID;
        System.out.println("Selamat Datang di Bank ABC");
        cekSaldo();
    }
    
    public void setRekeningID(String ID){
        this.RekeningID = ID;
    }
    
    public void cekSaldo(){
        System.out.println("No Rekening : " + RekeningID);
        System.out.println("Saldo saat ini Rp" + saldo);
        System.out.println();
    }
    
    public void AmbilUang(double S){
        if (this.saldo - S >= 0) {
            this.saldo -= S;
            System.out.println("Ambil Uang Rp" + S);
            cekSaldo();
        } else {
            System.out.println("Saldo tidak mencukupi");
            this.cekSaldo();
        }
    }
    
    public void SimpanUang(double S){
        this.saldo += S;
        System.out.println("Simpan Uang Rp" + S);
        this.cekSaldo();
    }
    
}
