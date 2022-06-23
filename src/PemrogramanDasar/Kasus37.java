package PemrogramanDasar;

public class Kasus37 {
    public static void main(String[] args) {
        int[][] rute = {{0,0},{1,3},{2,1},{3,4},{5,2},{7,5}};//deklarasi dan assign array rute
        double jaraktotal = 0;//deklarasi dan assign jaraktotal
        
        for (int i = 0; i < rute.length-1; i++) {//looping perhitungan jaraktotal
            jaraktotal+= jarak2titik(rute[i][0], rute[i][1], rute[i+1][0], rute[i+1][1]);//perhitungan jaraktotal dengan pemanggilan method jarak2titik
        }
        double biaya = jaraktotal*2000;//assign perhitungan biaya
        System.out.printf("Jarak Total        = %8.3f \n", jaraktotal);//output jaraktotal
        System.out.printf("Biaya Penghantaran = %8.3f \n", biaya);//output biaya
    }
    public static double jarak2titik(int x1, int y1, int x2, int y2){//method perhitungan jarak 2 titik
        return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
    }
}
