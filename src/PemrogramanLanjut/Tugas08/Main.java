package PemrogramanLanjut.Tugas08;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Kue [] arrKue = new Kue[20];
        arrKue[0] = new KueJadi(10, "Onde-Onde", 2000);
        arrKue[1] = new KuePesanan(1, "Kue Bolu", 30000);
        arrKue[2] = new KueJadi(19, "Lapis Legit", 7000);
        arrKue[3] = new KuePesanan(2, "Bika Ambon", 75000);
        arrKue[4] = new KueJadi(50, "Cucur", 1000);
        arrKue[5] = new KuePesanan(1, "Apple Pie", 80000);
        arrKue[6] = new KueJadi(3, "Macaron", 10000);
        arrKue[7] = new KuePesanan(0.5, "Cheese Cake", 50000);
        arrKue[8] = new KueJadi(100, "Cucur", 1000);
        arrKue[9] = new KuePesanan(0.75, "Red Velvet", 200000);
        arrKue[10] = new KueJadi(9, "Pancong", 5000);
        arrKue[11] = new KuePesanan(1.5, "Black Forest", 250000);
        arrKue[12] = new KueJadi(15, "Pukis", 2000);
        arrKue[13] = new KuePesanan(2, "Rainbow Cake", 175000);
        arrKue[14] = new KueJadi(52, "Serabi", 3000);
        arrKue[15] = new KuePesanan(2, "Chocolate Cake", 300000);
        arrKue[16] = new KueJadi(3, "Klepon", 5000);
        arrKue[17] = new KuePesanan(4, "Tiramisu", 110000);
        arrKue[18] = new KueJadi(10, "Taiyaki", 12000);
        arrKue[19] = new KuePesanan(2.2, "Matcha Cake", 160000);

        for (int i = 0; i < arrKue.length; i++) {
            System.out.println(arrKue[i]);
        }
        System.out.println();

        int total = 0;
        for (int i = 0; i < arrKue.length; i++) {
            total += arrKue[i].getHarga();
        }
        System.out.println("Total Harga Semua Jenis Kue = " + total);

        ArrayList<KuePesanan> arrKueP = new ArrayList<>();
        ArrayList<KueJadi> arrKueJ = new ArrayList<>();
        for (int i = 0; i < arrKue.length; i++) {
            if (arrKue[i] instanceof KuePesanan) {
                arrKueP.add((KuePesanan)arrKue[i]);
            }else {
                arrKueJ.add((KueJadi)arrKue[i]);
            }
        }

        int totalP = 0;
        int totalBerat = 0;
        for (int i = 0; i < arrKueP.size(); i++) {
            totalP += arrKueP.get(i).getHarga();
            totalBerat += arrKueP.get(i).getBerat();
        }
        System.out.println("Total Harga Kue Pesanan     = " + totalP);
        System.out.println("Total Berat Kue Pesanan     = " + totalBerat);

        int totalJ = 0;
        int totalJumlah = 0;
        for (int i = 0; i < arrKueJ.size(); i++) {
            totalJ += arrKueJ.get(i).getHarga();
            totalJumlah += arrKueJ.get(i).getJumlah();
        }
        System.out.println("Total Harga Kue Jadi        = " + totalJ);
        System.out.println("Total Jumlah Kue Jadi       = " + totalJumlah);

        Kue max = arrKue[0];
        for (int i = 0; i < arrKue.length; i++) {
            if (arrKue[i].getHarga() > max.getHarga()) {
                max = arrKue[i];
            }
        }
        System.out.println();
        System.out.println("Kue dengan Harga Terbesar");
        System.out.println(max);
    }
}

