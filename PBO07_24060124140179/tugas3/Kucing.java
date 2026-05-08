package tugas3;

// NIM     : 24060124140179
// Nama    : Adam Mulya Rasyid
// Tanggal : 22 April 2026

public class Kucing extends Anabul {
    public Kucing(String nama) { super(nama); }
    @Override
    public void gerak() { System.out.println(nama + "bergerak dengan melata"); }
    @Override
    public void bersuara() { System.out.println(nama + "bersuara meong"); }
}