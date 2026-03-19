/* 
 * File      : Persegi.java
 * Deskripsi : Subclass Persegi dari BangunDatar
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : 11/03/2026
 */

/********** CLASS **********/
public class Persegi extends BangunDatar { // subclass dari BangunDatar
    // ATRIBUT
    private double sisi;

    /********** METHOD **********/
    // KONSTRUKTOR
    public Persegi(double sisi, String warna, String border) { // constructor dengan parameter
        super(warna, border);
        this.jmlSisi = 4;
        this.sisi = sisi;
    }

    // SELEKTOR (Getter)
    public double getLuas() { // method buat ngitung luas persegi
        return sisi * sisi;
    }

    public double getKeliling() { // method buat ngitung keliling persegi
        return 4 * sisi;
    }

    // OVERRIDE METHOD SUPERCLASS (BangunDatar)
    @Override // override method printInfo buat nambahin info sisi, luas, dan keliling
    public void printInfo() { // method buat print info persegi
        super.printInfo();
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}