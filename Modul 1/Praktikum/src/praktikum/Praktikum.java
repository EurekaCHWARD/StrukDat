package praktikum;

import java.util.Scanner;

class Praktikum {
    
    private static void menu(){
        System.out.println("\nMau menampilkan hasil luas dalam bentuk? :");
        System.out.println("1. Hasil Integer");
        System.out.println("2. Hasil Double");
    }
    
    private static boolean ulang(){
        boolean cek = false;
        String pilihan;
        Scanner input = new Scanner(System.in);
        System.out.println("Lanjut ?(Y/N)");
        System.out.print("Pilihan : ");
        pilihan = input.next();

        switch (pilihan) {
            case "Y":
            case "y":
                cek = true;
                break;
            case "N":
            case "n":
                cek = false;
            default:
                break;
        }
        return cek;    
    }
    
    public static void main(String[] args) {
        int resultAsInt, hasil;
        double resultAsDouble;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println(" -----------------------------");
        System.out.println(" === HITUNG LUAS SEGITIGA === ");
        System.out.println(" == Input Alas dan Tinggi! == ");
        System.out.println(" -----------------------------");
        
        do{
            menu();
            System.out.println("Masukkan Pilihan 1 / 2");
            hasil = input.nextInt();
            if(hasil == 1){
                System.out.println("Masukan Nilai Alas Dan Tinggi Secara Berurutan : ");
                int alas = input.nextInt();
                int tinggi = input.nextInt();
                Segitiga<Integer> luasTipeInt = new Segitiga<>(alas, tinggi);
                resultAsInt = luasTipeInt.getResultAsInt();
                System.out.println("Luas Segitiga dalam Integer : " + resultAsInt);
            }else if(hasil == 2){
                System.out.println("Masukan Nilai Alas Dan Tinggi Secara Berurutan : ");
                double alas = input.nextDouble();
                double tinggi = input.nextDouble();
                Segitiga<Double> luasTipeDouble = new Segitiga<>(alas, tinggi);
                resultAsDouble = luasTipeDouble.getResultAsDouble();
                System.out.println("Luas Segitiga dalam Integer : " + resultAsDouble);
            }
        }while(ulang());
    }
}


