package PemrogramanLanjut.PemrogramanLanjut;

/**
 *
 * @author dzikryaji
 */
public class Bola {
    private double jejari;
    private final double PI = 3.1415;
    private static int numberOfObject = 0;
    private double volume;
    
    public Bola (){
        jejari = 10;
        numberOfObject++;
    }
    public Bola (int R){
        jejari = R;
        numberOfObject++;
    }
    public void setJejari(double R){
        jejari = R;
    }
    private double hitungVolume(){
        return (4/3*PI*Math.pow(jejari, 3));
    }
    public void finalize(){
        numberOfObject--;
    }
    public static int getNumberOfObject(){
        return numberOfObject;
    }
    public void info(){
        volume = hitungVolume();
        System.out.println("Lingkaran dengan jejari = " + jejari);
        System.out.println("Memiliki volume = " + volume);
        System.out.println();
    }
    
    public static void main(String[] args) {
        Bola Bola1 = new Bola();
        
        Bola Bola2 = new Bola(100);
        
        Bola Bola3 = new Bola(70);
        
        int Banyak = Bola1.getNumberOfObject();
        System.out.println("Banyaknya bola adalah = " + Banyak );
        Bola1.info();
        Bola2.info();
        Bola3.info();
        
        Bola1.setJejari(50);
        Bola1.info();
        
        Bola1.finalize();
        Bola1 = null;
        System.gc();
        
        Banyak = Bola2.getNumberOfObject();
        System.out.println("Banyaknya bola adalah = " + Banyak );
    }
    
}
