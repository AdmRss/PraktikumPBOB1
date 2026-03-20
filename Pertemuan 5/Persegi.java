/* 
 * File      : Persegi.java
 * Deskripsi : Persegi sebagai turunan BangunDatar dan implementasi IResize
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : 18/03/2026
*/

/********** CLASS **********/
public class Persegi extends BangunDatar implements IResize {

    /********** ATRIBUT **********/
    private double sisi;

    /********** METHOD **********/
    // KONSTRUKTOR
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    // IMPLEMENTASI ABSTRACT METHOD
    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    // IMPLEMENTASI INTERFACE
    @Override
    public void zoomIn() {
        sisi *= 1.1;
    }

    @Override
    public void zoomOut() {
        sisi *= 0.9;
    }
}