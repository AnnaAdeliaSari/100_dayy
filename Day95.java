package day_100;

import java.util.HashSet;

public class Day95 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apel");
        set.add("Jeruk");
        set.add("Pisang");
        set.add("Mangga");

        for (String fruit : set) {
            System.out.println("Buah: " + fruit);
        }
    }
}
