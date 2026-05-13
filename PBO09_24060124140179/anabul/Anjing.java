package anabul;

/*
 * File      : Anjing.java
 * Deskripsi : Representasi hewan anjing sebagai turunan Anabul
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : Rabu, 06 Mei 2026
 */

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(panggilan + " (Anjing) melata.");
    }
}