package PemrogramanLanjut.PemrogramanLanjut;

/**
 *
 * @author dzikryaji
 */
class Handphones {
    private String merek;
    private String nomorSeri;
    private static int count = 0;
    private int nomorUrut;
    
    public Handphones (String merek){
        count++;
        this.merek = merek;
        this.nomorUrut = count;
        this.nomorSeri = generateNomer(this.merek,this.nomorUrut);
    }
    
    String generateNomer(String merek, int nomorUrut){
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
        
        if (nomorUrut < 10) {
            nomorSeri = kodeDepan + "00" + nomorUrut;
        } else if (nomorUrut < 100) {
            nomorSeri = kodeDepan + "0" + nomorUrut;
        } else {
            nomorSeri = kodeDepan + nomorUrut;
        }
        return nomorSeri;
    }
    
    void print(){
        System.out.println("Handphone ke-" + nomorUrut);
        System.out.println("Merek       : " + merek);
        System.out.println("Nomor Seri  : " + nomorSeri);
        System.out.println();
    }
}

public class nomerseri {
    public static void main(String[] args) {
        Handphones HP1 = new Handphones("Apple");
        Handphones HP2 = new Handphones("Samsung");
        Handphones HP3 = new Handphones("Nokia");
        Handphones HP4 = new Handphones("Asus");
        Handphones HP5 = new Handphones("Xiaomi");
        Handphones HP6 = new Handphones("Oppo");
        
        HP1.print();
        HP2.print();
        HP3.print();
        HP4.print();
        HP5.print();
        HP6.print();
    }
}