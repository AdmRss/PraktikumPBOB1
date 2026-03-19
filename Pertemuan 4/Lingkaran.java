/* 
 * File      : Lingkaran.java
 * Deskripsi : Subclass Lingkaran dari BangunDatar
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : 11/03/2026
 */

/********** CLASS **********/
public class Lingkaran extends BangunDatar { // subclass dari BangunDatar
    
    // ATRIBUT
    private double jariJari;

    /********** METHOD **********/
    // KONSTRUKTOR
    public Lingkaran(double jariJari, String warna, String border) { // constructor dengan parameter
        super(warna, border); // panggil constructor superclass buat nginisialisasi warna dan border
        this.jmlSisi = 1;
        this.jariJari = jariJari;
    }

    // SELEKTOR (Getter)
    public double getLuas() { // method buat ngitung luas lingkaran
        return Math.PI * jariJari * jariJari;
    }

    public double getKeliling() { // method buat ngitung keliling lingkaran
        return 2 * Math.PI * jariJari;
    }

    // OVERRIDE METHOD SUPERCLASS (BangunDatar)
    @Override // override method printInfo buat nambahin info jari-jari, luas, dan keliling
    public void printInfo() { // method buat print info lingkaran
        super.printInfo(); // manggil method printInfo superclass buat print warna, border, dan jumlah sisi
        System.out.println("Jari-jari: " + jariJari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}