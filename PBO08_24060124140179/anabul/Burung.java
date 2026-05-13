/*
 * File      : Burung.java
 * Deskripsi : Kelas untuk merepresentasikan objek burung
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : Rabu, 29 April 2026
 */
package anabul;
public class Burung extends Anabul {
    public Burung(String nama) { super(nama); }
    @Override
    public void gerak() { System.out.println(nama + " (Burung) terbang."); }
}