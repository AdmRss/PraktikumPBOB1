package anabul;

/*
 * File      : Kucing.java
 * Deskripsi : Representasi hewan kucing yang memiliki atribut bobot
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : Rabu, 06 Mei 2026
 */

public class Kucing extends Anabul {
    private double bobot;

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    @Override
    public void gerak() {
        System.out.println(panggilan + " melata.");
    }
}