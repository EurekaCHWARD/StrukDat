package latihan;

import java.util.HashMap;
import java.util.Scanner;

public class Latihan {
    String nama, kelas, matkulpraktikum;
    int nim;
    
    public Latihan(String nm, String kl, String mat, int ni){
        nama = nm;
        kelas = kl;
        matkulpraktikum = mat;
        nim = ni;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Latihan> mhs = new HashMap<>();
        String input;
        Latihan data;
        
        mhs.put("1", new Latihan("Eureka", "3B", "Struktur Data", 2021345));
        mhs.put("2", new Latihan("Diaandisy", "3H", "Matematika", 2021678));
        mhs.put("3", new Latihan( "Supri", "3D", "Pemrograman", 20213910));
        
        System.out.println("Masukin ID: ");
        input = in.nextLine();
        data = mhs.get(input);
        
        if(data != null){
            System.out.println("Data Mahasiswa : " + data.nama + ", kelas : " +
                    data.kelas + ", mata kuliah praktikum : " + data.matkulpraktikum +
                    ", nim : " + data.nim);
        }
    }
    
}
