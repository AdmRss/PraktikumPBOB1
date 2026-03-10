public class MMahasiswa {
    public static void main(String[] args) {
        // Bikin objek Dosen
        Dosen dosenWali = new Dosen("12345678", "Teknik Informatika", "Rismiyati, B.Eng, M.Cs");

        // Bikin objek Kendaraan
        Kendaraan kendaraan = new Kendaraan("B 1234 ABC", "Mobil Ferarri");

        // Bikin objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa("Adam Mulya Rasyid", "2109106104", "Teknik Informatika");
        mahasiswa.setDosenWali(dosenWali); // Set dosen wali untuk mahasiswa
        mahasiswa.setKendaraan(kendaraan); // Set kendaraan untuk mahasiswa

        // Bikin beberapa objek MataKuliah
        MataKuliah matkul1 = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah matkul2 = new MataKuliah("Strukdat", "Struktur Data", 4);
        MataKuliah matkul3 = new MataKuliah("Algoritma", "Algoritma Pemrograman", 3);
        mahasiswa.addMatKul(matkul1); // Tambahkan matkul1 ke listMatKul mahasiswa
        mahasiswa.addMatKul(matkul2); // Tambahkan matkul2 ke listMatKul mahasiswa
        mahasiswa.addMatKul(matkul3); // Tambahkan matkul3 ke listMatKul mahasiswa

        // Tampilkan informasi mahasiswa
        System.out.println("Jumlah SKS: " + mahasiswa.getJumlahSKS());
        System.out.println("Jumlah Mata Kuliah: " + mahasiswa.getJumlahMatKul());
        System.out.println("\nDetail Mahasiswa: ");
        mahasiswa.printDetailMhs();

    }    
}
