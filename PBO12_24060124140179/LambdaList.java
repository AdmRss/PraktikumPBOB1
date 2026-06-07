/*
 * File      : LambdaList.java
 * Deskripsi : Implementasi lambda pada List, digunakan sebagai parameter pada method
 * Pembuat   : Adam Mulya Rasyid
 */

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        // Lambda di sini untuk nampilin semua nama mahasiswa dalam list
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}