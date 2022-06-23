package PemrogramanLanjut.PemrogramanLanjut;

public class Handphone {
    private boolean hidup;
    private double jumlahPulsa;
    
    void hidupkan(){
        if (hidup == true) {
            System.out.println("...");
        } else {
            hidup = true;
            System.out.println("Handphone hidup");
        }
    }
    void lakukanPanggilan(){
        if (hidup == true) {
            if (jumlahPulsa < 2000) {
                System.out.println("Maaf pulsa anda tidak cukup");
            } else {
                jumlahPulsa -= 2000;
                System.out.println("Kring..Kring..Kring.. Panggilan dilakukan!");
            }
        } else {
            System.out.println("...");
        }
        
    }
    void kirimSMS(){
        if (hidup == true) {
            if (jumlahPulsa < 1000) {
                System.out.println("Maaf pulsa anda tidak cukup");
            } else {
                jumlahPulsa -= 1000;
                System.out.println("Dung,dung... sms berhasil terkirim");
            }
        } else {
            System.out.println("...");
        }
    }
    void cekPulsa(){
        if (hidup == true) {
            System.out.println("Pulsa anda :Rp." + jumlahPulsa);
        } else {
            System.out.println("...");
        }
    }
    void isiPulsa(double jumlah){
        if (hidup == true) {
            jumlahPulsa += jumlah;
            System.out.println("Pulsa anda sekarang :Rp." + jumlahPulsa);
        } else {
            System.out.println("...");
        }
    }
    void matikan(){
        if (hidup != true) {
            System.out.println("...");
        } else {
            hidup = false;
            System.out.println("Handphone mati");
        }
    }
}
