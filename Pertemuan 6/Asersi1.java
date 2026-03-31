/*
 * File      : Asersi1.java
 * Deskripsi : Contoh penggunaan asersi sederhana
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : 26/03/2026
 */

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;

        assert (x > 0) : "Nilai x harus lebih besar dari 0";

        System.out.println("Nilai x: " + x);
    }
}