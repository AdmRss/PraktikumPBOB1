/* 
 * File      : Lingkaran.java
 * Deskripsi : Subclass Lingkaran dari BangunDatar
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : 11/03/2026
 */

public class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari, String warna, String border) {
        super(warna, border);
        this.jmlSisi = 1;
        this.jariJari = jariJari;
    }

    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jariJari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jariJari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}