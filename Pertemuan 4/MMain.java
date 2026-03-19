/* 
 * File      : MMain.java
 * Deskripsi : Main class untuk testing
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : 11/03/2026
 */

/********** CLASS **********/
public class MMain { // main class buat realisasi
    
    /********** METHOD **********/
    public static void main(String[] args) { // method main buat testing
        Persegi p = new Persegi(5, "Merah", "Hitam");
        Lingkaran l = new Lingkaran(7, "Biru", "Putih");

        p.printInfo(); // print info persegi
        System.out.println();

        l.printInfo(); // print info lingkaran
        System.out.println();

        BangunDatar.printCounterBangunDatar();  // print jumlah objek BangunDatar yang udah dibuat
    }
}