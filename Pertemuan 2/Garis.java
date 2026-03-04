/*
 * File      : Garis.java
 * Deskripsi : Berisi atribut dan method dalam class Garis
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : 01/03/2026
 */

public class Garis {
    /********** ATRIBUT **********/
    private Titik2 titikAwal;
    private Titik2 titikAkhir;
    private static int counterGaris = 0;

    /********** METHOD **********/
    // Konstruktor tanpa parameter (titik awal (0,0), titik akhir (1,1))
    public Garis() {
        this.titikAwal = new Titik2(0, 0);
        this.titikAkhir = new Titik2(1, 1);
        counterGaris++;
    }

    // Konstruktor dengan parameter titik awal dan titik akhir
    public Garis(Titik2 awal, Titik2 akhir) {
        this.titikAwal = awal;
        this.titikAkhir = akhir;
        counterGaris++;
    }

    // Selektor untuk titik awal
    public Titik2 getTitikAwal() {
        return titikAwal;
    }

    // Selektor untuk titik akhir
    public Titik2 getTitikAkhir() {
        return titikAkhir;
    }

    // Mutator untuk titik awal
    public void setTitikAwal(Titik2 awal) {
        this.titikAwal = awal;
    }

    // Mutator untuk titik akhir
    public void setTitikAkhir(Titik2 akhir) {
        this.titikAkhir = akhir;
    }

    // Selektor static untuk counterGaris
    public static int getCounterGaris() {
        return counterGaris;
    }

    // Method untuk mendapatkan panjang garis
    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    // Method untuk mendapatkan gradien garis
    public double getGradien() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        if (dx == 0) {
            throw new ArithmeticException("Garis vertikal, gradien tak terdefinisi");
        }
        return dy / dx;
    }

    // Method untuk mendapatkan titik tengah garis
    public Titik2 getTitikTengah() {
        double xTengah = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double yTengah = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik2(xTengah, yTengah);
    }

    // Method untuk mengecek apakah garis sejajar dengan garis lain
    public boolean isSejajar(Garis G) {
        try {
            double m1 = this.getGradien();
            double m2 = G.getGradien();
            return Math.abs(m1 - m2) < 1e-9;
        } catch (ArithmeticException e) {
            // Jika salah satu garis vertikal, cek apakah keduanya vertikal
            double dx1 = this.titikAkhir.getAbsis() - this.titikAwal.getAbsis();
            double dx2 = G.titikAkhir.getAbsis() - G.titikAwal.getAbsis();
            return (dx1 == 0 && dx2 == 0);
        }
    }

    // Method untuk mengecek apakah garis tegak lurus dengan garis lain
    public boolean isTegakLurus(Garis G) {
        try {
            double m1 = this.getGradien();
            double m2 = G.getGradien();
            return Math.abs(m1 * m2 + 1) < 1e-9;
        } catch (ArithmeticException e) {
            // Jika salah satu vertikal, cek apakah yang lain horizontal (gradien 0)
            double dx1 = this.titikAkhir.getAbsis() - this.titikAwal.getAbsis();
            double dx2 = G.titikAkhir.getAbsis() - G.titikAwal.getAbsis();
            if (dx1 == 0) { // this vertikal
                double dy2 = G.titikAkhir.getOrdinat() - G.titikAwal.getOrdinat();
                return dy2 == 0; // G horizontal
            } else if (dx2 == 0) { // G vertikal
                double dy1 = this.titikAkhir.getOrdinat() - this.titikAwal.getOrdinat();
                return dy1 == 0; //  horizontal
            }
            return false;
        }
    }

    // Method untuk menampilkan titik awal dan titik akhir garis
    public void printGaris() {
        System.out.print("Garis dari ");
        titikAwal.printTitik2();
        System.out.print(" ke ");
        titikAkhir.printTitik2();
    }

    // Method untuk menampilkan persamaan garis dalam bentuk y = mx + c
    public void printPersamaanGaris() {
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();

        if (x1 == x2) {
            System.out.println("x = " + x1); // garis vertikal
        } else {
            double m = (y2 - y1) / (x2 - x1);
            double c = y1 - m * x1;
            if (c >= 0) {
                System.out.printf("y = %.2fx + %.2f\n", m, c);
            } else {
                System.out.printf("y = %.2fx - %.2f\n", m, -c);
            }
        }
    }
}