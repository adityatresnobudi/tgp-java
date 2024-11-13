package id.co.cimbniaga;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Alice");
        uniqueNames.add("Adit");
        uniqueNames.add("Alice");

        System.out.println("Daftar nama siswa: " + uniqueNames);
    }
}
