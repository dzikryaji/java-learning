package PemrogramanLanjut.PemrogramanLanjut;

/**
 *
 * @author dzikryaji
 */
public class pabrikHP {
    private String nomorSeri;
    private String nama;
    private String merek;
    private int counter;
    
    public pabrikHP (String name, String merek, int count){
        this.nama = name;
        this.counter = count;
        this.merek = merek;
        this.nomorSeri = setNomorSeri(merek);
    }
    
    public String getNama(){
        return nama;
    }
    
    public int getCounter(){
        return counter;
    } 
    
    public String setNomorSeri(String merk){
        String kodeDepan;
        String nomorSeri;
        
        if ("Apple".equals(merek)) {
            kodeDepan = "AP";
        } else if ("Samsung".equals(merek)) {
            kodeDepan = "SS";
        } else if ("Nokia".equals(merek)) {
            kodeDepan = "NK";
        } else if ("Asus".equals(merek)) {
            kodeDepan = "AS";
        } else if ("Xiaomi".equals(merek)) {
            kodeDepan = "XI";
        } else if ("Oppo".equals(merek)) {
            kodeDepan = "OP";
        } else {
            kodeDepan = "XX";
        }
        
        if (counter < 10) {
            nomorSeri = kodeDepan + "00" + counter;
        } else if (counter < 100) {
            nomorSeri = kodeDepan + "0" + counter;
        } else {
            nomorSeri = kodeDepan + counter;
        }
        return nomorSeri;
    }
    
    public String getNomorSeri(){
        return nomorSeri;
    }
}
