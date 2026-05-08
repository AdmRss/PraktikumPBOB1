package tugas4;

// NIM     : 24060124140179
// Nama    : Adam Mulya Rasyid
// Tanggal : 22 April 2026

public class Seminar {
    private Civitasakademika[] pesertas;
    private int banyakpeserta;

    public Seminar() {
        this.pesertas = new Civitasakademika[100];
        this.banyakpeserta = 0;
    }

    public int countPeserta() {
        return banyakpeserta;
    }

    public void registrasi(Civitasakademika peserta) {
        if (banyakpeserta < pesertas.length) {
            pesertas[banyakpeserta] = peserta;
            banyakpeserta++;
        } else {
            System.out.println("Kapasitas seminar sudah penuh");
        }
    }

    public void tampilPeserta() {
        System.out.println("Daftar Peserta Seminar:");
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println((i + 1) + ". " + pesertas[i].getNomor() + ", " + pesertas[i].getNama());
        }
    }

    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}