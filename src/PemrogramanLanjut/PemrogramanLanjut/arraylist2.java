package PemrogramanLanjut.PemrogramanLanjut;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist2 {
    public static void main(String[] args) {
        ArrayList<Character> char2 = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int jmlhA;
        System.out.print("masukkan jumlah char =");
        jmlhA = in.nextInt();

        for (int i = 0; i < jmlhA; i++){
            char2.add(in.next().charAt(0));

        }
        System.out.println("========hasil sebelum=======");
        for (int i = 0; i < char2.size(); i++) {
            System.out.println(char2.get(i));
        }
        char2.remove(2);
        char2.set(0, 'p');
        System.out.println("=============hasil=============");
        for (Character character : char2) {
            System.out.println(character);
        }

        System.out.println(char2.size());
    }
}
