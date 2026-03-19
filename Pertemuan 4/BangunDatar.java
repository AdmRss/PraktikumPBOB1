/* 
 * File      : BangunDatar.java
 * Deskripsi : Superclass bangun datar
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : 11/03/2026
 */

public class BangunDatar {

    // ATRIBUT
    protected String warna; // protected biar bisa diakses subclass
    protected String border;
    protected int jmlSisi;
    protected static int counterBangunDatar = 0; // ngitung jumlah objek BangunDatar

    /********** METHOD **********/
    // KONSTRUKTOR
    public BangunDatar() { // constructor default
        counterBangunDatar++;
    }

    public BangunDatar(String warna, String border) { // constructor dengan parameter
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // SELEKTOR (Getter)
    public void printInfo() { // method untuk print info bangun datar
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
        System.out.println("Jumlah sisi: " + jmlSisi);
    }

    public static void printCounterBangunDatar() { // method static untuk print jumlah objek BangunDatar
        System.out.println("Jumlah objek BangunDatar: " + counterBangunDatar);
    }
}