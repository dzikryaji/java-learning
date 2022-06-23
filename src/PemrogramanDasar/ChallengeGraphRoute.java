package PemrogramanDasar;

public class ChallengeGraphRoute {
    public static void main(String[] args) {
        double[] jaraktotal = new double[3];////deklarasi array jaraktotal
        int[][] rute1 = {{0,0},{1,3},{2,1},{3,4},{5,2},{7,5}};//deklarasi dan assign array rute 1
        int[][] rute2 = {{0,0},{1,3},{3,10},{5,2},{7,5}};//deklarasi dan assign array rute 2
        int[][] rute3 = {{0,0},{2,1},{5,0},{5,2},{7,5}};//deklarasi dan assign array rute 3
        
        for (int i = 0; i < rute1.length-1; i++) {//looping perhitungan jaraktotal rute 1
            jaraktotal[0]+= jarak2titik(rute1[i][0], rute1[i][1], rute1[i+1][0], rute1[i+1][1]);//perhitungan jaraktotal dengan pemanggilan method jarak2titik
        }
        
        for (int i = 0; i < rute2.length-1; i++) {//looping perhitungan jaraktotal rute 2
            jaraktotal[1]+= jarak2titik(rute2[i][0], rute2[i][1], rute2[i+1][0], rute2[i+1][1]);//perhitungan jaraktotal dengan pemanggilan method jarak2titik
        }
        
        for (int i = 0; i < rute3.length-1; i++) {//looping perhitungan jaraktotal rute 3
            jaraktotal[2]+= jarak2titik(rute3[i][0], rute3[i][1], rute3[i+1][0], rute3[i+1][1]);//perhitungan jaraktotal dengan pemanggilan method jarak2titik
        }
        
        double rutependek = 1000;//deklarasi dan inisiasi rutependek
        int namarute=0;//deklarasi dan inisiasi namarute
        for (int i = 0; i < jaraktotal.length; i++) {
            double biaya = jaraktotal[i]*2000;
            System.out.printf("Jarak Total Rute ke-%d        = %8.3f \n", i+1, jaraktotal[i]);//output jaraktotal
            System.out.printf("Biaya Penghantaran Rute ke-%d = %8.3f \n", i+1, biaya);//output biaya
            if (rutependek > jaraktotal[i]) {//if untuk menentukan rute terpendek
                rutependek = jaraktotal[i];
                namarute = i+1;
            }
        }
        System.out.println("");
        System.out.printf("Rute terpendek adalah rute ke-%d\n", namarute);//output rute terpendek
    }
    public static double jarak2titik(int x1, int y1, int x2, int y2){//method perhitungan jarak 2 titik
        return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
    }
}
