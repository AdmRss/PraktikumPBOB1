package tugas2;

// NIM     : 24060124140179
// Nama    : Adam Mulya Rasyid
// Tanggal : 22 April 2026

public class Mahasiswa {
    private int nim;
    private String nama;
    private String programstudi;

    // c. Konstruktor tanpa parameter
    public Mahasiswa() {
        this.nim = -999;
        this.nama = "n/a";
        this.programstudi = "n/a";
    }

    // d. Konstruktor dengan 3 parameter
    public Mahasiswa(int nim, String nama, String programstudi) {
        this.nim = nim;
        this.nama = nama;
        this.programstudi = programstudi;
    }

    // e. Konstruktor kloning (1 parameter objek Mahasiswa lain)
    public Mahasiswa(Mahasiswa m) {
        this.nim = m.nim;
        this.nama = m.nama;
        this.programstudi = m.programstudi;
    }

    // Varian 1: Tanpa parameter
    public void setProgramStudi() {
        this.programstudi = "Kosong";
    }

    // Varian 2: Satu parameter string
    public void setProgramStudi(String programstudi) {
        this.programstudi = programstudi;
    }

    // Varian 3: Satu parameter objek Mahasiswa lain
    public void setProgramStudi(Mahasiswa m) {
        this.programstudi = m.programstudi;
    }

    public void tampilData() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + programstudi);
    }
}