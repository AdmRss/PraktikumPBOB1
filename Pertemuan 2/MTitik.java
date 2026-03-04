/*
 * File      : MTitik.java
 * Deskripsi : Main class untuk menguji seluruh method pada class Titik2
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : 01/03/2026
 */

public class MTitik {
    public static void main(String[] args) {
        System.out.println("=== Pengujian Class Titik2 ===");

        // Membuat objek titik
        Titik2 T1 = new Titik2();
        Titik2 T2 = new Titik2(3, 4);

        System.out.println("Jumlah titik yang telah dibuat: " + Titik2.getCounterTitik2());

        // Menggunakan method setter dan getter
        T1.setAbsis(5);
        T1.setOrdinat(6);
        System.out.print("T1 setelah di-set: ");
        T1.printTitik2();

        // Geser titik
        T1.geser(2, 3);
        System.out.print("T1 setelah digeser (2,3): ");
        T1.printTitik2();

        // Kuadran
        System.out.println("Kuadran T2: " + T2.getKuadran());

        // Jarak
        System.out.println("Jarak T1 ke pusat: " + T1.getJarakPusat());
        System.out.println("Jarak T1 ke T2: " + T1.getJarak(T2));

        // Refleksi
        T2.refleksiX();
        System.out.print("T2 setelah refleksi X: ");
        T2.printTitik2();

        Titik2 T3 = T1.getRefleksiY();
        System.out.print("T3 (hasil refleksi Y dari T1): ");
        T3.printTitik2();

        System.out.println("Jumlah titik setelah operasi: " + Titik2.getCounterTitik2());
    }
}