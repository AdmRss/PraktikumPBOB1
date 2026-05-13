package anabul;

/*
 * File      : Burung.java
 * Deskripsi : Representasi hewan burung sebagai turunan Anabul
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : Rabu, 06 Mei 2026
 */

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(panggilan + " (Burung) terbang.");
    }
}