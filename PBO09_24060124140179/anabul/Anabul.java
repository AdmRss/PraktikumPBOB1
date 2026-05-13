package anabul;

/*
 * File      : Anabul.java
 * Deskripsi : Kelas abstrak hewan peliharaan dengan atribut panggilan
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : Rabu, 06 Mei 2026
 */

public abstract class Anabul {
    protected String panggilan;

    public Anabul(String panggilan) {
        this.panggilan = panggilan;
    }

    public String getNama() {
        return panggilan;
    }

    public void setNama(String nama) {
        this.panggilan = nama;
    }

    public abstract void gerak();
}