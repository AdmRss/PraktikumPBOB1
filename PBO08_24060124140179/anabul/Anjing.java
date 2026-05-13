/*
 * File      : Anjing.java
 * Deskripsi : Kelas untuk merepresentasikan objek anjing
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : Rabu, 29 April 2026
 */
package anabul;
public class Anjing extends Anabul {
    public Anjing(String nama) { super(nama); }
    @Override
    public void gerak() { System.out.println(nama + " (Anjing) melata."); }
}