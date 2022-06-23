package PemrogramanLanjut.PemrogramanLanjut;

/**
 *
 * @author dzikryaji
 */
public class RekeningBankBeraksi {
    public static void main(String[] args) {
        RekeningBank rekA = new RekeningBank(100000);
        rekA.SimpanUang(500000);
        rekA.AmbilUang(150000);
        rekA.getJumlahSaldo();
        
        
        RekeningBank rekB = new RekeningBank(500000, "Emmanulle Proulx", "ABC123890", "Jl. Veteran");
        rekB.SimpanUang(100000);
        rekB.AmbilUang(1500000);
        rekB.getJumlahSaldo();
        
        RekeningBank rekC = new RekeningBank(4000000, "Amelia Murray", "DEF890123", "Jl. Jakarta");
        rekC.SimpanUang(200000);
        rekC.AmbilUang(2000000);
        rekC.getJumlahSaldo();
        
        RekeningBank[] RekeningArray = {rekA, rekB, rekC};
        
        double saldo = 0;
        String Nama = "";
        for (int i = 0; i < RekeningArray.length; i++) {
            if (saldo < RekeningArray[i].getSaldo()) {
                saldo = RekeningArray[i].getSaldo();
                Nama = RekeningArray[i].getNasabah().Nama;
            }
        }
        
        System.out.println("Nasabah dengan saldo terbesar : " + Nama);
        System.out.println("Dengan saldo Rp" + saldo);
    }
}
