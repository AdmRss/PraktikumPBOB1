/*
 * File      : OperatorGenerik.java
 * Deskripsi : Kelas untuk merepresentasikan objek operator generik
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : Rabu, 29 April 2026
 */
package tugas2;
import anabul.*;
import tugas1.Datum;

public class OperatorGenerik {
    // Prosedur nuker 
    public <T> void Tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }
    public <T extends Kucing> double Bobot2(T a, T b) {
        return a.getBobot() + b.getBobot();
    }
}