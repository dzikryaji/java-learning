package PemrogramanLanjut.PemrogramanLanjut;

/**
 *
 * @author dzikryaji
 */
public class Rekening1 {
    private double saldo;
    private String RekeningID;
    private static int jumlahNasabah = 0;
    private static int jumlahSaldo = 0;
    
    Rekening1(double S){
        jumlahNasabah++;
        jumlahSaldo += S;
        RekeningID = buatID(jumlahNasabah);
        this.saldo = S;
        System.out.println("Selamat Datang di Bank ABC");
        cekSaldo();
    }
    
    public void getJumlahSaldo(){
        System.out.println("Jumlah seluruh Saldo di Bank = Rp" + jumlahSaldo);
    }
    
    private String buatID(int count){
        String ID;
        if (count < 10) {
            ID = "0" + String.valueOf(count);
        } else {
            ID = String.valueOf(count);
        }
        return("2022-" + ID);
    }
    
    public void cekSaldo(){
        System.out.println("No Rekening : " + RekeningID);
        System.out.println("Saldo saat ini Rp" + saldo);
        System.out.println();
    }
    
    public void AmbilUang(double S){
        if (this.saldo - S >= 0) {
            jumlahSaldo -= S;
            this.saldo -= S;
            System.out.println("Ambil Uang Rp" + S);
            cekSaldo();
        } else {
            System.out.println("Saldo tidak mencukupi");
            this.cekSaldo();
        }
    }
    
    public void SimpanUang(double S){
        jumlahSaldo +=S;
        this.saldo += S;
        System.out.println("Simpan Uang Rp" + S);
        this.cekSaldo();
    }
    
}

