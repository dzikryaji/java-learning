package PemrogramanLanjut.PemrogramanLanjut;

/**
 *
 * @author dzikryaji
 */
public class pabrik {
    private String nomorSeri;
    private String nama;
    int counter = 0;
    public static final String VORTEXSERIES = "VORTEXSERIES";
    public static final String DUCKYONE = "DUCKYONE";
    public static final String KEYCHRON = "KEYCHRON";
    public static final String[] huruf = {"aa","bb"};
    
    public pabrik (String name, int count){
        this.nama = name;
        this.counter = count;
    }
    
    public String getNama(){
        return nama;
    }
   
    public void setNomorSeri(String merk){
        char b = merk.charAt(0);
        this.nomorSeri = b + String.valueOf(counter);
    }
    
    public String getNomorSeri(){
        return nomorSeri;
    }
}
