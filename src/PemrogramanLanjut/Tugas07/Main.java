package PemrogramanLanjut.Tugas07;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Manusia Man1 = new Manusia("Lewis Hamilton", "111", true, true);
        System.out.println(Man1);

        Manusia Man2 = new Manusia("Amelia Murray", "112", false, true);
        System.out.println(Man2);

        Manusia Man3 = new Manusia("Morissey", "112", true, false);
        System.out.println(Man3);

        MahasiswaFILKOM Maha1 = new MahasiswaFILKOM("215150400111029", 2.0, "Dzikry Aji Santoso", "113", true, false);
        System.out.println(Maha1);

        MahasiswaFILKOM Maha2 = new MahasiswaFILKOM("215150400111029", 3.2, "Dzikry Aji Santoso", "113", true, false);
        System.out.println(Maha2);

        MahasiswaFILKOM Maha3 = new MahasiswaFILKOM("215150400111029", 3.9, "Dzikry Aji Santoso", "113", true, false);
        System.out.println(Maha3);

        Pekerja P1 = new Pekerja(1000, LocalDate.parse("2020-03-02"), 2, "Walter White", "114", true, true);
        System.out.println(P1);

        Pekerja P2 = new Pekerja(1000, LocalDate.parse("2013-04-12"), 0, "Jesse Pinkman", "115", true, true);
        System.out.println(P2);

        Pekerja P3 = new Pekerja(1000, LocalDate.parse("2001-10-12"), 10, "Gus Fring", "116", true, true);
        System.out.println(P3);

        Manager M1 = new Manager("HRD", 7500, LocalDate.parse("2007-02-02"), 3, "Thom Yorke", "117", true, true);
        System.out.println(M1);
    }
}
