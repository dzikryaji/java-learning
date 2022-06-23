package PemrogramanLanjut.PemrogramanLanjut;

/**
 *
 * @author dzikryaji
 */
public class Televisi1 {
    public static void main(String[] args) {
        Televisi tvKu = new Televisi();
        tvKu.hidupkan();//menghidupkan televisi
        tvKu.upChannel();//menaikkan channel sebanyak satu
        tvKu.upChannel(10);//menaikkan channel sesuai input yaitu 10
        tvKu.upVolume(10);//menambah volume sesuai input yaitu 10
        tvKu.upVolume();//menambah volume sebanyak 1
        tvKu.downChannel();//menurunkan channel sebanyak 1 
        tvKu.downChannel(5);//menurunkan channel sesuai input yaitu 5
        tvKu.downVolume();//mengurangi volume sebanyak 1
        tvKu.downVolume(5);//mengurangi volume sesuai input yaitu 5
        tvKu.gantiChannel(7);//mengganti channel sesuai input yaitu 7
        tvKu.matikan();//mematikan televisi
    }
}
