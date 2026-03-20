/* 
 * File      : Lingkaran.java
 * Deskripsi : Lingkaran sebagai turunan BangunDatar dan implementasi IResize
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : 18/03/2026
*/

/********** CLASS **********/
public class Lingkaran extends BangunDatar implements IResize {

    /********** ATRIBUT **********/
    private double jariJari;

    /********** METHOD **********/
    // KONSTRUKTOR
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    // IMPLEMENTASI ABSTRACT METHOD
    @Override
    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * jariJari;
    }

    // IMPLEMENTASI INTERFACE
    @Override
    public void zoomIn() {
        jariJari *= 1.1;
    }

    @Override
    public void zoomOut() {
        jariJari *= 0.9;
    }
}