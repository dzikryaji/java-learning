package PemrogramanLanjut.PemrogramanLanjut;

/**
 *
 * @author dzikryaji
 */
public class Segitiga {
    private int Alas;
    private int Tinggi;
    private double Luas;
    private double Keliling;
    
    public Segitiga (){
        Alas = 5;
        Tinggi = 10;
        cetak();
    }
    public Segitiga (int A, int T){
        Alas = A;
        Tinggi = T;
        cetak();
    }
    public int getTinggi(){
        return Tinggi;
    }
    public void setTinggi(int T){
        Tinggi = T;
        cetak();
    }
    public int getAlas(){
        return Alas;
    }
    public void setAlas(int A){
        Alas = A;
        cetak();
    }
    public double hitungLuas(){
        return (Alas*Tinggi/2);
    }
    public double hitungKeliling(){
        double Sisi = Math.sqrt(Alas*Alas + Tinggi*Tinggi);
        return (Alas + Tinggi + Sisi);
    }
    public void cetak(){
        Luas = hitungLuas();
        Keliling = hitungKeliling();
        System.out.println("Segitiga dengan Tinggi = " + Tinggi + " dan Alas = " + Alas);
        System.out.printf("Memiliki Luas = %.2f dan Keliling = %.2f\n\n",Luas,Keliling);
    }
    public static void main(String[] args) {
        Segitiga Segitiga1 = new Segitiga(10,20);
        
        Segitiga Segitiga2 = new Segitiga();
        
        Segitiga1.setTinggi(12);
        Segitiga1.setAlas(50);
        Segitiga2.setTinggi(19);
        Segitiga2.setAlas(5);
        
        int Alas1 = Segitiga1.getAlas();
        int Tinggi1 = Segitiga1.getTinggi();
        int Alas2 = Segitiga2.getAlas();
        int Tinggi2 = Segitiga2.getTinggi();
        
        System.out.println("Tinggi Segitiga 1 = " + Tinggi1);
        System.out.println("Alas Segitiga 1 = " + Alas1);
        System.out.println("Tinggi Segitiga 2 = " + Tinggi2);
        System.out.println("Alas Segitiga 2 = " + Alas2);
    }
}
