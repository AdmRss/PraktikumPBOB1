/* 
 * File      : MMain.java
 * Deskripsi : Main class untuk testing
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : 11/03/2026
 */

public class MMain {
    public static void main(String[] args) {
        Persegi p = new Persegi(5, "Merah", "Hitam");
        Lingkaran l = new Lingkaran(7, "Biru", "Putih");

        p.printInfo();
        System.out.println();

        l.printInfo();
        System.out.println();

        BangunDatar.printCounterBangunDatar(); 
    }
}