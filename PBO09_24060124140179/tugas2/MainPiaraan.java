package tugas2;
import anabul.*;

/*
 * File      : MainPiaraan.java
 * Deskripsi : Program utama untuk mensimulasikan antrean (Queue) di klinik hewan
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : Rabu, 06 Mei 2026
 */

public class MainPiaraan {
    public static void main(String[] args) {
        Piaraan klinik = new Piaraan();

        Anggora c1 = new Anggora("Meng", 4.5);
        Anjing d1 = new Anjing("SiapaYak");
        Kembangtelon c2 = new Kembangtelon("Campuran", 3.2);
        Burung b1 = new Burung("Twitter");

        klinik.enqueueAnabul(c1);
        klinik.enqueueAnabul(d1);
        klinik.enqueueAnabul(c2);
        klinik.enqueueAnabul(b1);

        klinik.showJenisAnabul();
        System.out.println("Total Pasien Kucing: " + klinik.countKucing());
        System.out.println("Total Bobot Kucing: " + klinik.bobotKucing() + " kg");

        System.out.println("\nManggil pasien pertama");
        Anabul pasien = klinik.dequeueAnabul();
        System.out.println(pasien.getNama() + " diperiksa & keluar antrean.\n");
        klinik.showAnabul();
    }
}