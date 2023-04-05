package keg1;

import java.util.ArrayList;
import java.util.Collections;

public class Keg1 {

    public static void main(String[] args) {
        //Nomor 1
        ArrayList<String> namaHewan = new ArrayList<>();
        namaHewan.add("Angsa");
        namaHewan.add("Bebek");
        namaHewan.add("Cicak");
        namaHewan.add("Domba");
        namaHewan.add("Elang");
        namaHewan.add("Gajah");

        //Nomor 2
        namaHewan.add("Badak");
        namaHewan.add("Bebek");
        System.out.println("Output\t\t\t: " + namaHewan);
        int totalBebek = Collections.frequency(namaHewan, "Bebek");
        System.out.printf("Posisi Index Bebek\t: ");
        for (int i = 0; i < namaHewan.size(); i++) {
            if (namaHewan.get(i) == "Bebek"){
                System.out.print(i + " ");
            }
        }
        System.out.println("\nJumlah Bebek\t\t: " + totalBebek);

        //Nomor 3
        namaHewan.remove(1);
        System.out.println("\nOutput\t\t\t: " + namaHewan);

        //Nomor 4
        System.out.println("\nIndex ke-0\t\t: " + namaHewan.get(0));
        System.out.println("Index ke-2\t\t: " + namaHewan.get(2));
        namaHewan.remove(0);
        System.out.println("Output\t\t\t: " + namaHewan);

        //Nomor 5
        namaHewan.set(0, "Ular");
        System.out.println("\nOutput\t\t\t: " + namaHewan);
        namaHewan.add(2, "Itik");
        System.out.println("Output\t\t\t: " + namaHewan);

        //Nomor 6
        namaHewan.subList(1, 5).clear();
        System.out.println("\nOutput\t\t\t: " + namaHewan);

        //Nomor 7
        System.out.println("\nElemen Pertama\t\t: " + namaHewan.get(0));
        System.out.println("Elemen Yerakhir\t\t: " + namaHewan.get(namaHewan.size() - 1));

        //Nomor 8
        System.out.println("\nJumlah Elemen\t\t: " + namaHewan.size());

        //Nomor 9
        int indexBadak = namaHewan.indexOf("Badak");
        System.out.println("\nIndex Badak\t\t: " + indexBadak);
    }
    
}
