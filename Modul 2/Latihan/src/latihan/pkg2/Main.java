package latihan.pkg2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Hewan> hewan = new ArrayList<>();
        hewan.add(new Hewan("[Sapi, ", "Putih"));
        hewan.add(new Hewan("Kelinci, ", "Hitam"));
        hewan.add(new Hewan("Kambing, ", "Abu"));
        hewan.add(new Hewan("Unta, ", "Cokelat"));
        hewan.add(new Hewan("Domba]", "Pink"));

        List<String> deleteHewan = new ArrayList<>();
        deleteHewan.add("Hitam");
        deleteHewan.add("Abu");
        deleteHewan.add("Cokelat");

        System.out.println("Hewan : ");
        for (Hewan h: hewan){
            System.out.print(h.getJenis());
        }

        System.out.println("\nWarna hewan yang dihapus : ");
        for (String h: deleteHewan){
            System.out.println(h);
        }

        for (int i = hewan.size() - 1; i > 0; i--){
            Hewan h = hewan.get(i);
            if(deleteHewan.contains(h.getWarna())){
                hewan.remove(h);
            }
        }

        System.out.println("\nOutput hewan : ");
        for (Hewan h: hewan){
            System.out.print(h.getJenis());
        }
    }
}
