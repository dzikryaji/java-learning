package PemrogramanLanjut.PemrogramanLanjut;

/**
 *
 * @author dzikryaji
 */


class Handphone1{
    private String merek; 
    private String nomerSeri; 
    private static int count = 0; 
    private int nomorUrut;
    private int lamaPemakaian;
    private int harga;
    private boolean kondisiBaru;

    public Handphone1 (String merek){ 
        count++; 
        this.kondisiBaru = true;
        this.merek = merek; 
        this.nomorUrut = count; 
        this.nomerSeri = generateNomer(this.merek,this.nomorUrut);
        this.harga = cekHarga();
    }
    
    public Handphone1 (String merek, String nomerSeri, int lamaPemakaian){ 
        this.kondisiBaru = false;
        this.merek = merek;  
        this.nomerSeri = nomerSeri;
        this.lamaPemakaian = lamaPemakaian;
        this.harga = cekHarga()*7/10;
    }
    
    private int cekHarga(){
        int harga;
        if ("Apple".equals(this.merek)) { 
            harga = 1000000;
        } else if ("Samsung".equals(this.merek)) { 
            harga = 800000; 
        } else if ("Nokia".equals(this.merek)) { 
            harga = 300000; 
        } else if ("Asus".equals(this.merek)) { 
            harga = 700000; 
        } else if ("Xiaomi".equals(this.merek)) { 
            harga = 500000; 
        } else if ("Oppo".equals(this.merek)) { 
            harga = 600000; 
        } else{
            harga = 0;
        }
        return harga;
    }
    
    private int cekHarga(String hpBekas){
        int harga;
        if ("Apple".equals(hpBekas)) { 
            harga = 1000000;
        } else if ("Samsung".equals(hpBekas)) { 
            harga = 800000; 
        } else if ("Nokia".equals(hpBekas)) { 
            harga = 300000; 
        } else if ("Asus".equals(hpBekas)) { 
            harga = 700000; 
        } else if ("Xiaomi".equals(hpBekas)) { 
            harga = 500000; 
        } else if ("Oppo".equals(hpBekas)) { 
            harga = 600000; 
        } else{
            harga = 0;
        }
        return (harga*7/10);
    }

    String generateNomer(String merek, int nomorUrut){  
        String kodeDepan; 
        String nomerSeri; 

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
            nomerSeri = kodeDepan + "00" + nomorUrut;  } else if (nomorUrut < 100) { 
            nomerSeri = kodeDepan + "0" + nomorUrut;  } else { 
            nomerSeri = kodeDepan + nomorUrut; 
        } 
        return nomerSeri; 
    }
    
    public void beliHp(){ 
        if (kondisiBaru == true) {
            System.out.println("Beli Baru");
            System.out.println("Merek           : " + merek);
            System.out.println("Nomer Seri      : " + nomerSeri);
            System.out.println("Harga           : " + harga);
        } else {
            System.out.println("Beli Bekas");
            System.out.println("Merek           : " + merek);
            System.out.println("Nomer Seri      : " + nomerSeri);
            System.out.println("Lama Pemakaian  : " + lamaPemakaian + " hari");
            System.out.println("Harga           : " + harga);
        }
        System.out.println("");
    }
    
    public void beliHp(String hpBekas, String nomerSeri, int lamaPemakaian){
        if (kondisiBaru == true) {
            int harga = cekHarga(hpBekas);
            int bayar = this.harga-harga;
            System.out.println("Tukar Tambah");
            System.out.println("_Hp lama_");
            System.out.println("Merek awal      : " + hpBekas);
            System.out.println("Nomer Seri      : " + nomerSeri);
            System.out.println("Lama Pemakaian  : " + lamaPemakaian + " hari");
            System.out.println("_Hp baru_");
            System.out.println("Merek           : " + this.merek);
            System.out.println("Nomer Seri      : " + this.nomerSeri);
            System.out.println("Harga yang dibayar: " + bayar);
        } else {
            System.out.println("Error");
        }
        System.out.println("");
    }
}

public class nomerseri2 {
    public static void main(String[] args) {
        Handphone1 HP1 = new Handphone1("Nokia"); 
        Handphone1 HP2 = new Handphone1("Samsung", "SS069", 90); 
        Handphone1 HP3 = new Handphone1("Apple"); 
        
        HP1.beliHp();
        HP2.beliHp();
        HP3.beliHp("Asus", "AS900", 12);
    }
}
