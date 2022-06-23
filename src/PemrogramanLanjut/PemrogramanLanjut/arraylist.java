package PemrogramanLanjut.PemrogramanLanjut;

/**
 *
 * @author dzikryaji
 */
public class arraylist {
    public static void main(String[] args) {
        // ArrayList<Integer> list1 = new ArrayList<Integer>();
        // int jmlhK;
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Berapa keyboard yang ingin dibeli");
        // jmlhK = scan.nextInt();

        toko foo2 = new toko(pabrik.DUCKYONE,"Farel");
        toko foo4 = new toko(pabrik.KEYCHRON,"danu");
        toko foo6 = new toko(pabrik.DUCKYONE,"lucky");
        toko foo8 = new toko(pabrik.VORTEXSERIES,"budi");
        
        toko toks[] ={foo2,foo4,foo6,foo8};
        
        for (toko tokons : toks){
            System.out.println(tokons);
        }
    }
    
}
