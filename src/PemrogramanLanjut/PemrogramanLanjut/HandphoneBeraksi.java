package PemrogramanLanjut.PemrogramanLanjut;

/**
 *
 * @author dzikryaji
 */
public class HandphoneBeraksi {
    public static void main(String[] args) {
        Handphone telponku = new Handphone();
        telponku.hidupkan();
        telponku.isiPulsa(10000);
        telponku.lakukanPanggilan();
        telponku.kirimSMS();
        telponku.cekPulsa();
        telponku.matikan();
    }
}
