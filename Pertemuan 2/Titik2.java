/*
 * File      : Titik2.java
 * Deskripsi : Berisi atribut dan method dalam class Titik2
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : 01/03/2026
 */

public class Titik2 {
    /********** ATRIBUT **********/
    private double absis;
    private double ordinat;
    private static int counterTitik2 = 0;

    /********** METHOD **********/
    // Konstruktor untuk membuat titik (0,0)
    public Titik2() {
        this(0, 0);
    }

    // Konstruktor untuk membuat titik (x,y)
    public Titik2(double x, double y) {
        this.absis = x;
        this.ordinat = y;
        counterTitik2++;
    }

    // Selektor untuk mendapatkan nilai absis
    public double getAbsis() {
        return absis;
    }

    // Selektor untuk mendapatkan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // Mutator untuk mengubah nilai absis
    public void setAbsis(double x) {
        this.absis = x;
    }

    // Mutator untuk mengubah nilai ordinat
    public void setOrdinat(double y) {
        this.ordinat = y;
    }

    // Selektor static untuk counterTitik2
    public static int getCounterTitik2() {
        return counterTitik2;
    }

    // Method untuk menggeser titik
    public void geser(double dx, double dy) {
        this.absis += dx;
        this.ordinat += dy;
    }

    // Method untuk mendapatkan kuadran (1,2,3,4, atau 0)
    public int getKuadran() {
        if (absis > 0 && ordinat > 0) return 1;
        else if (absis < 0 && ordinat > 0) return 2;
        else if (absis < 0 && ordinat < 0) return 3;
        else if (absis > 0 && ordinat < 0) return 4;
        else return 0; // berada di sumbu atau pusat
    }

    // Method untuk mendapatkan jarak titik ke pusat (0,0)
    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // Method untuk mendapatkan jarak antara dua titik
    public double getJarak(Titik2 T) {
        return Math.sqrt(Math.pow(this.absis - T.absis, 2) + Math.pow(this.ordinat - T.ordinat, 2));
    }

    // Prosedur refleksi terhadap sumbu X (mengubah titik)
    public void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    // Prosedur refleksi terhadap sumbu Y (mengubah titik)
    public void refleksiY() {
        this.absis = -this.absis;
    }

    // Fungsi untuk mendapatkan titik baru hasil refleksi X (tanpa mengubah titik asal)
    public Titik2 getRefleksiX() {
        return new Titik2(this.absis, -this.ordinat);
    }

    // Fungsi untuk mendapatkan titik baru hasil refleksi Y
    public Titik2 getRefleksiY() {
        return new Titik2(-this.absis, this.ordinat);
    }

    // Method untuk mencetak koordinat titik
    public void printTitik2() {
        System.out.println("Titik2: (" + absis + ", " + ordinat + ")");
    }
}