package PemrogramanLanjut.PemrogramanLanjut;

public class tokoHP {
    pabrikHP pabrik;
    String merek;
    public static int counter = 0;
    
    public tokoHP(String merk, String nama){
        counter++;
        this.merek = merk;
        pabrik = new pabrikHP(nama, merek, counter);
    }
    
    @Override
    public String toString(){
        return  "==========Handphone ke-"+pabrik.getCounter()+"=========="+
                "\nNama : "+pabrik.getNama()+
                "\nMerek : " +merek+
                "\nNomer seri : "+pabrik.getNomorSeri();
    }
}
