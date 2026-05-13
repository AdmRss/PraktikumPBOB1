/*
 * File      : Data.java
 * Deskripsi : Kelas untuk merepresentasikan objek data dengan tipe data generik
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : Rabu, 29 April 2026
 */
package tugas3;

public class Data<T> {
    private T[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")
    public Data() {
        this.ruang = (T[]) new Object[100]; // Larik statik 100 elemen 
        this.banyak = 0;
    }

    public void setIsi(int pos, T obj) {
        if (pos >= 1 && pos <= 100) {
            ruang[pos - 1] = obj;
            if (pos > banyak) banyak = pos;
        }
    }

    public T getIsi(int pos) {
        return (pos >= 1 && pos <= banyak) ? ruang[pos - 1] : null;
    }

    public int getSize() { return banyak; }
}