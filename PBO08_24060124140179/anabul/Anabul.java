/*
 * File      : Anabul.java
 * Deskripsi : Kelas abstrak untuk merepresentasikan objek anabul
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : Rabu, 29 April 2026
 */
package anabul;
public abstract class Anabul {
    protected String nama;
    public Anabul(String nama) { this.nama = nama; }
    public String getNama() { return nama; }
    public abstract void gerak();
}