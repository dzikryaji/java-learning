package PemrogramanLanjut.PemrogramanLanjut;

/**
 *
 * @author dzikryaji
 */
public class nomerseri3 {
    public static void main(String[] args) {
        tokoHP toko1 = new tokoHP("Apple","Angel");
        tokoHP toko2 = new tokoHP("Samsung","Bagas");
        tokoHP toko3 = new tokoHP("Xiaomi","Caroline");
        tokoHP toko4 = new tokoHP("Asus","Rangga");
        tokoHP toko5 = new tokoHP("Nokia","Rafif");
        tokoHP toko6 = new tokoHP("Oppo","Emma");
        
        tokoHP toks[] ={toko1, toko2, toko3, toko4, toko5, toko6};
        
        for (tokoHP tokons : toks){
            System.out.println(tokons);
        }
    }
}
