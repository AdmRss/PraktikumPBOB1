/*
 * File      : MTitik.java
 * Deskripsi : Main class untuk menguji seluruh method pada class Titik.
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : 25/02/2026
 */

public class MTitik {
    public static void main(String[] args) {

        Titik T1 = new Titik();
        Titik T2 = new Titik(3, 4);

        System.out.println("Kondisi awal");
        T1.printTitik();
        T2.printTitik();

        // Setter
        T1.setAbsis(5);
        T1.setOrdinat(6);

        System.out.println("\nDiubah Jadi");
        T1.printTitik();

        // Geser
        T1.geser(2, 3);
        System.out.println("\nDigeser Jadi");
        T1.printTitik();

        // Kuadran
        System.out.println("\nKuadran T1: " + T1.getKuadran());

        // Jarak
        System.out.println("Jarak T1 ke pusat: " + T1.getJarakPusat());
        System.out.println("Jarak T1 ke T2: " + T1.getJarak(T2));

        // Refleksi
        Titik T3 = T1.getRefleksiX();
        System.out.println("\nRefleksi X T1:");
        T3.printTitik();

        // Tes
        System.out.println("\nHasil");
        Titik T4 = T1;
        T4.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T4.printTitik(); // akan ikut berubah

    }
}