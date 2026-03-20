/* 
 * File      : BangunDatar.java
 * Deskripsi : Abstract class BangunDatar
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : 18/03/2026
*/

/********** CLASS **********/
public abstract class BangunDatar {

    /********** ATRIBUT **********/
    protected String warna;
    protected String border;

    /********** METHOD **********/
    // KONSTRUKTOR
    public BangunDatar() {
    }

    public BangunDatar(String warna, String border) {
        this.warna = warna;
        this.border = border;
    }

    // ABSTRACT METHOD
    public abstract double getLuas(); // method abstract buat ngitung luas, harus diimplementasi di subclass
    public abstract double getKeliling();

    // METHOD
    public boolean isEqualLuas(BangunDatar X) { // method buat bandingin luas dua bangun datar, bisa dipake buat bandingin persegi sama lingkaran
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X) { // method buat bandingin keliling dua bangun datar, bisa dipake buat bandingin persegi sama lingkaran
        return this.getKeliling() == X.getKeliling();
    }
}