/*
 * File      : Datum.java
 * Deskripsi : Kelas untuk merepresentasikan objek datum dengan tipe data generik
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : Rabu, 29 April 2026
 */
package tugas1;
public class Datum<T> {
    private T isi;
    public void setIsi(T isibaru) { this.isi = isibaru; }
    public T getIsi() { return isi; } 
}