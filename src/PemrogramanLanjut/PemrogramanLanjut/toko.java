package PemrogramanLanjut.PemrogramanLanjut;

/**
 *
 * @author dzikryaji
 */
public class toko {
    pabrik kk;
    String merek;
    public static int counter = 0;
    
    public toko(String merk, String nama){
        counter++;
        kk = new pabrik(nama, counter);
        this.merek = merk;
    }
    
    @Override
    public String toString(){
        kk.setNomorSeri(merek);
        return  "==========Keyboard ke-"+counter+"=========="+
                "\nNama : "+kk.getNama()+
                "\nMerek : " +merek+
                "\nNomer seri : "+kk.getNomorSeri();
    }
    
}
