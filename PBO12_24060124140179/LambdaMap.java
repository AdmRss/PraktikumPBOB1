/*
 * File      : LambdaMap.java
 * Deskripsi : Menggunakan ekspresi lambda untuk menampilkan key (NIM) dan value (Nama) dari Map
 * Pembuat   : Adam Mulya Rasyid
 */

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>(); // bikin Map baru pake tipe data String untuk key dan value
        
        // Ngisi data Map
        mahasiswaMap.put("24060124130001", "Adi");
        mahasiswaMap.put("24060124140002", "Bambang");
        mahasiswaMap.put("24060124140003", "Cici");
        mahasiswaMap.put("24060124130004", "Didi");

        // Pakai ekspresi lambda forEach pada Map
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + " | Nama: " + nama);
        });
    }
}