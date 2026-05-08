package tugas1;

// NIM     : 24060124140179
// Nama    : Adam Mulya Rasyid
// Tanggal : 22 April 2026

public class PolimorfismeCoercion {
    public static void main(String[] args) {
        // a. Ilustrasi Polimorfisme Coercion (Integer ke Char, Double, String)
        int nilaiInt = 65;
        System.out.println("Nilai Integer: " + nilaiInt);
        System.out.println("Nilai Karakter: " + (char) nilaiInt);
        System.out.println("Nilai Double: " + (double) nilaiInt);
        System.out.println("Nilai String: " + String.valueOf(nilaiInt));
        
        System.out.println("------------------------------------------------");

        // b. Integer -> Real -> Integer
        double nilaiReal = (double) nilaiInt;
        int kembaliKeInt = (int) nilaiReal;
        System.out.println("Nilai Real: " + nilaiReal);
        System.out.println("Dikembalikan ke Integer: " + kembaliKeInt);

        System.out.println("------------------------------------------------");

        // c. Objek String X dan Y
        String X = "1234";
        String Y = "5678";
        String S = X + Y; // Konkatenasi
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y); // Penjumlahan angka
        System.out.println("Hasil Konkatenasi S (X+Y): " + S);
        System.out.println("Hasil Penjumlahan Z (X+Y): " + Z);

        System.out.println("------------------------------------------------");

        // d. Objek String P dan Q
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q; // Konkatenasi
        Double D = Double.parseDouble(P) + Double.parseDouble(Q); // Penjumlahan angka
        System.out.println("Hasil Konkatenasi R (P+Q): " + R);
        System.out.println("Hasil Penjumlahan D (P+Q): " + D);

        System.out.println("------------------------------------------------");

        // e. Objek Integer A yang diisi hasil konversi nilai S
        Integer A = Integer.parseInt(S);
        System.out.println("Nilai Objek Integer A: " + A);

        System.out.println("------------------------------------------------");

        // f. Objek String T yang diisi hasil konversi nilai A
        String T = A.toString();
        System.out.println("Nilai Objek String T: " + T);
    }
}