package PemrogramanLanjut.PemrogramanLanjut;

/**
 *
 * @author dzikryaji
 */
public class Person {
    String Nama;
    String NoKTP;
    String Alamat;
        
    Person(){
        Nama = "John Doe";
        NoKTP = "1234567";
        Alamat = "Indonesia";
    }
        
    Person(String N, String NK, String A){
        Nama = N;
        NoKTP = NK;
        Alamat = A;
    }
}
