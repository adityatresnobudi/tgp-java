package id.co.cimbniaga.sesi2;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Alice");
        students.put(2, "Bob");

        System.out.println("Daftar siswa: " + students);
    }
}
