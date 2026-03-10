/*
 * File      : Mahasiswa.java
 * Deskripsi : Berisi atribut dan method dalam class Mahasiswa
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : 01/03/2026
*/

/********** CLASS **********/
public class Mahasiswa {
    // ATRIBUT
    private String nim;
    private String nama;
    private String prodi;
    private MataKuliah[] listMatKul = new MataKuliah[50];
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    // METHOD
    // Konstruktor tanpa parameter
    public Mahasiswa() {
    }

    // Konstruktor dengan parameter nim, nama, prodi
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Selektor
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public MataKuliah[] getListMatKul() {
        return listMatKul;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    // Mutator
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setListMatKul(MataKuliah[] listMatKul) {
        this.listMatKul = listMatKul;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // Method addMatKul
    public void addMatKul(MataKuliah mk) { // mastiin mk tidak null sebelum ditambahkan
        if (mk == null) { // pastikan mk tidak null sebelum ditambahkan
            System.out.println("Mata kuliah tidak valid.");
            return;
        }
        for (int i = 0; i < listMatKul.length; i++) { // mastiin si i < length
            if (listMatKul[i] == null) { // pastikan listMatKul[i] null sebelum diisi
                listMatKul[i] = mk; // nambahin mk ke listMatKul di index i
                break; // keluar dari loop setelah menambahkan mk
            }
        }
    }

    // Method getJumlahSKS (perbaiki jika pakai for biasa)
    public int getJumlahSKS() {
        int total = 0;
        for (int i = 0; i < listMatKul.length; i++) { // pastikan i < length
            if (listMatKul[i] != null) { // Mastiin listMatKul[i] gak null sebelum ngambil sks
                total += listMatKul[i].getSks(); // nambahin sks dari listMatKul[i] ke total
            }
        }
        return total; // balikin total sks yang udah dihitung
    }

    // Method getJumlahMatKul
    public int getJumlahMatKul() {
        int count = 0;
        for (int i = 0; i < listMatKul.length; i++) { // pastikan i < length
            if (listMatKul[i] != null) { // Mastiin listMatKul[i] gak null sebelum dihitung
                count++; // nambahin count setiap kali ketemu listMatKul[i] yang gak null
            }
        }
        return count;
    }

    // Method printMhs
    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    // Method printDetailMhs
    public void printDetailMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);

        // Daftar mata kuliah
        System.out.println("Daftar Mata Kuliah:");
        for (MataKuliah mk : listMatKul) { // pastikan mk tidak null sebelum ditampilkan
            if (mk != null) { // pastikan mk tidak null sebelum ditampilkan
                System.out.println("  " + mk.getNama()); // tampilkan nama matkul dari mk
            }
        }

        // Data dosen wali
        if (dosenWali != null) {
            System.out.println("Dosen Wali:");
            System.out.println("  NIP: " + dosenWali.getNip());
            System.out.println("  Nama: " + dosenWali.getNama());
            System.out.println("  Prodi: " + dosenWali.getProdi());
        } else {
            System.out.println("Dosen Wali: Belum ada");
        }

        // Data kendaraan
        if (kendaraan != null) {
            System.out.println("Kendaraan:");
            System.out.println("  No Plat: " + kendaraan.getNoPlat());
            System.out.println("  Jenis: " + kendaraan.getJenis());
        } else {
            System.out.println("Kendaraan: Tidak punya");
        }
    }
}