/*
 * File      : AngkaSial.java
 * Deskripsi : Penggunaan custom exception (AngkaSialException)
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : 26/03/2026
 */

public class AngkaSial {

    public static void cekAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException("Angka sial ditemukan!");
        }
        System.out.println("Angka: " + angka);
    }

    public static void main(String[] args) {
        try {
            cekAngka(10);
            cekAngka(13);
            cekAngka(5);
        } catch (AngkaSialException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program selesai");
    }
}

/* jawab pertanyaan
1. Ketika eksepsi terjadi, apakah baris 12 dieksekusi?
Gabisa, karna saat exception (13), program langsung lompat ke catch,
jadi baris setelah cekAngka(13) tidak dieksekusi



2. Apakah baris 21 dieksekusi?
ya, habis nanganin exception, program lanjut ke baris 21, 
jadi "Program selesai" tetap dicetak
*/