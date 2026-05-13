/*
 * File      : Kucing.java
 * Deskripsi : Kelas untuk merepresentasikan objek kucing
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : Rabu, 29 April 2026
 */
package anabul;
public class Kucing extends Anabul {
    private double bobot; 
    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }
    public double getBobot() { return bobot; }
    @Override
    public void gerak() { System.out.println(nama + " melata."); }
}