/*
 * File      : Titik.java
 * Deskripsi : Class Titik merepresentasikan sebuah titik pada bidang
 *             kartesius dengan atribut absis dan ordinat serta
 *             berbagai method manipulasi titik.
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : 25/02/2026
 */

public class Titik {

    /*  Atribut  */
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /*  Konstruktor  */
    
    // Konstruktor default (0,0)
    public Titik() {
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    // Konstruktor dengan parameter
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    /*  Getter  */

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public static int getCounterTitik() {
        return counterTitik;
    }

    /*  Setter  */

    public void setAbsis(double x) {
        this.absis = x;
    }

    public void setOrdinat(double y) {
        this.ordinat = y;
    }

    /*  Method Lain  */

    // Geser titik
    public void geser(double x, double y) {
        this.absis += x;
        this.ordinat += y;
    }

    // Menentukan kuadran
    public int getKuadran() {
        if (absis > 0 && ordinat > 0) return 1;
        else if (absis < 0 && ordinat > 0) return 2;
        else if (absis < 0 && ordinat < 0) return 3;
        else if (absis > 0 && ordinat < 0) return 4;
        else return 0; // di sumbu
    }

    // Jarak ke pusat (0,0)
    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // Jarak ke titik lain
    public double getJarak(Titik T) {
        double dx = this.absis - T.absis;
        double dy = this.ordinat - T.ordinat;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Refleksi terhadap sumbu X (ubah langsung)
    public void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    // Refleksi terhadap sumbu Y (ubah langsung)
    public void refleksiY() {
        this.absis = -this.absis;
    }

    // Menghasilkan titik baru hasil refleksi X
    public Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    // Menghasilkan titik baru hasil refleksi Y
    public Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }

    // Print titik
    public void printTitik() {
        System.out.println("(" + absis + ", " + ordinat + ")");
    }
}