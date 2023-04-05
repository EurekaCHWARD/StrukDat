package strukturdata;

import java.util.Scanner;

/**
 *
 * @author Safira Nur Fatma Rikza_202010370311479
 */
public class Main {
public static void main(String[] args) {
        int hasiltInt;
        double hasilDouble;
        Scanner ambil = new Scanner(System.in);
        try {
            System.out.println(" -----------------------------");
            System.out.println(" === HITUNG LUAS SEGITIGA === ");
            System.out.println(" == Input Alas dan Tinggi! == ");
            System.out.println(" -----------------------------");
            do {
                mainMenu();
                System.out.print("Masukan pilihan 1/2 :");
                int pilihan = ambil.nextInt();
                if (pilihan == 1) {
                    try {
                        System.out.println("Masukan Nilai Alas Dan Tinggi");
                        int alas = ambil.nextInt();
                        int tinggi = ambil.nextInt();
                        Segitiga<Integer> luasTipeInt = new Segitiga<>(alas, tinggi);
                        hasiltInt = luasTipeInt.getResultAsInt();
                        System.out.println("Luas Segitiga dalam Integer : " + hasiltInt);

                    } catch (Exception e) {
                        System.out.println("Inputan harus berupa bilangan bulat");
                    }

                } else if (pilihan == 2) {
                    try {
                        System.out.println("Masukan Nilai Alas Dan Tinggi");
                        double alas = ambil.nextDouble();
                        double tinggi = ambil.nextDouble();
                        Segitiga<Double> luasTipeDouble = new Segitiga<>(alas, tinggi);
                        hasilDouble = luasTipeDouble.getResultAsDouble();
                        System.out.println("Luas Segitiga dalam Double : " + hasilDouble);

                    } catch (Exception e) {
                        System.out.println("Inputan harus berupa bilangan bulat");
                    }
                }
            } while (cekUlang());
        } catch (Exception e) {
            System.out.println(" ");
        } finally {
            System.out.println("\n Alhamulillah Selesai :) ");
        }
    }

    private static void mainMenu() {
        System.out.println("\nMau menampilkan hasil luas dalam bentuk   ?");
        System.out.println("1. Hasil Integer");
        System.out.println("2. Hasil Double");
    }

    private static boolean cekUlang() {
        boolean cekkUlang = false;
        String pilihan;
        Scanner input2 = new Scanner(System.in);
        System.out.println("Lanjut ?(Y/N)");
        System.out.print("Pilihan : ");
        pilihan = input2.next();

        switch (pilihan) {
            case "Y":
            case "y":
                cekkUlang = true;
                break;
            case "N":
            case "n":
                cekkUlang = false;
            default:
                break;
        }
        return cekkUlang;
    }
}
