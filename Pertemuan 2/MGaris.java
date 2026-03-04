/*
 * File      : MGaris.java
 * Deskripsi : Main class untuk menguji seluruh method pada class Garis
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : 01/03/2026
 */

public class MGaris {
    public static void main(String[] args) {
        System.out.println("=== Pengujian Class Garis ===");

        // Membuat beberapa titik
        Titik2 t1 = new Titik2(1, 2);
        Titik2 t2 = new Titik2(4, 6);

        // Membuat garis menggunakan konstruktor default
        Garis g1 = new Garis();
        System.out.println("Garis g1 (default):");
        g1.printGaris();
        System.out.print("Panjang g1: " + g1.getPanjang());
        try {
            System.out.println(" | Gradien: " + g1.getGradien());
        } catch (ArithmeticException e) {
            System.out.println(" | Gradien: " + e.getMessage());
        }
        System.out.print("Titik tengah g1: ");
        g1.getTitikTengah().printTitik2();
        System.out.print("Persamaan g1: ");
        g1.printPersamaanGaris();

        // Membuat garis dengan konstruktor berparameter
        Garis g2 = new Garis(t1, t2);
        System.out.println("\nGaris g2 (dari (1,2) ke (4,6)):");
        g2.printGaris();
        System.out.print("Panjang g2: " + g2.getPanjang());
        System.out.println(" | Gradien: " + g2.getGradien());
        System.out.print("Titik tengah g2: ");
        g2.getTitikTengah().printTitik2();
        System.out.print("Persamaan g2: ");
        g2.printPersamaanGaris();

        // Membuat garis vertikal untuk pengujian
        Garis g3 = new Garis(new Titik2(2, 1), new Titik2(2, 5));
        System.out.println("\nGaris g3 (vertikal):");
        g3.printGaris();
        System.out.print("Panjang g3: " + g3.getPanjang());
        try {
            System.out.println(" | Gradien: " + g3.getGradien());
        } catch (ArithmeticException e) {
            System.out.println(" | Gradien: " + e.getMessage());
        }
        System.out.print("Persamaan g3: ");
        g3.printPersamaanGaris();

        // Membuat garis horizontal
        Garis g4 = new Garis(new Titik2(0, 3), new Titik2(5, 3));
        System.out.println("\nGaris g4 (horizontal):");
        g4.printGaris();
        System.out.print("Panjang g4: " + g4.getPanjang());
        System.out.println(" | Gradien: " + g4.getGradien());
        System.out.print("Persamaan g4: ");
        g4.printPersamaanGaris();

        // Pengujian method isSejajar dan isTegakLurus
        System.out.println("\n=== Pengujian hubungan antar garis ===");
        System.out.println("Apakah g2 sejajar dengan g1? " + g2.isSejajar(g1));
        System.out.println("Apakah g3 (vertikal) sejajar dengan garis vertikal lain? " 
                            + g3.isSejajar(new Garis(new Titik2(2,0), new Titik2(2,10))));
        System.out.println("Apakah g3 tegak lurus dengan g4? " + g3.isTegakLurus(g4));
        System.out.println("Apakah g2 tegak lurus dengan garis yang gradiennya -1? " 
                            + g2.isTegakLurus(new Garis(new Titik2(0,0), new Titik2(4,-2))));

        // Menampilkan jumlah objek Garis yang telah dibuat
        System.out.println("\nJumlah objek Garis yang telah dibuat: " + Garis.getCounterGaris());
    }
}