/*
 * File      : Asersi2.java
 * Deskripsi : Penggunaan asersi pada perhitungan keliling lingkaran
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : 26/03/2026
 */

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = -5;

        assert (jariJari > 0) : "Jari-jari harus positif";

        double keliling = 2 * Math.PI * jariJari;
        System.out.println("Keliling: " + keliling);
    }
}

/* jawab pertanyaan
Secara konsep, sebenernya asersi di sini kurang tepat, karna
asersi lebih buat debugging (buat developer), bukan buat
validasi input dari user. Tapi kalau misalnya kita anggap ini 
buat validasi, kalo jari-jari negatif, asersi bakal gagal dan 
munculin pesan "Jari-jari harus positif", jadi kalo buat ngecek input
kaya gini mungkin lebih baik pake if aja.
*/