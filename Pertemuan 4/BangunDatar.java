/* 
 * File      : BangunDatar.java
 * Deskripsi : Superclass bangun datar
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : 11/03/2026
 */

public class BangunDatar {
    protected String warna;
    protected String border;
    protected int jmlSisi;
    protected static int counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(String warna, String border) {
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public void printInfo() {
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
        System.out.println("Jumlah sisi: " + jmlSisi);
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah objek BangunDatar: " + counterBangunDatar);
    }
}