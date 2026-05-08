package tugas4;

// NIM     : 24060124140179
// Nama    : Adam Mulya Rasyid
// Tanggal : 22 April 2026

public class MainSeminar {
    public static void main(String[] args) {
        Seminar sem = new Seminar();

        //2 objek Dosen
        Dosen d1 = new Dosen("19800101", "Dr. Yeva");
        Dosen d2 = new Dosen("19750202", "Prof. Soedarto ");

        //5 objek Mahasiswa
        Mahasiswa m1 = new Mahasiswa("240601", "Adam", d1);
        Mahasiswa m2 = new Mahasiswa("240602", "Fazl", d1);
        Mahasiswa m3 = new Mahasiswa("240603", "Raffa", d2);
        Mahasiswa m4 = new Mahasiswa("240604", "Rajib", d2);
        Mahasiswa m5 = new Mahasiswa("240605", "Ibrahim", d2);

        //regist peserta
        sem.registrasi(d1);
        sem.registrasi(d2);
        sem.registrasi(m1);
        sem.registrasi(m2);
        sem.registrasi(m3);
        sem.registrasi(m4);
        sem.registrasi(m5);

        //nampilin data seminar
        sem.tampilPeserta();
        System.out.println("Total Peserta Keseluruhan: " + sem.countPeserta());
        System.out.println("Total Peserta Mahasiswa: " + sem.countMahasiswa());
        
        System.out.println("\nNgubah Dosen Wali M1: ");
        m1.tampilDataMahasiswa();
        System.out.println(" "); //jarakkin
        m1.setWali(d2); //ngubah dari d1 ke d2
        System.out.println("Setelah diubah:");
        m1.tampilDataMahasiswa();
        
        // Kesimpulan Renungan:
        /*
         * Polimorfisme bekerja dengan cara mengizinkan satu antarmuka (interface/kelas induk)
         * digunakan untuk merepresentasikan berbagai tipe bentuk (kelas anak). 
         * Contohnya pada array 'pesertas' bertipe Civitasakademika, ia bisa menampung
         * objek Dosen maupun Mahasiswa secara bersamaan, dan saat metode getNomor() dipanggil,
         * sistem secara otomatis mengetahui versi mana (NIP atau NIM) yang harus dijalankan.
         */
    }
}