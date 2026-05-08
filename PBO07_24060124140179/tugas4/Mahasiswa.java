package tugas4;

// NIM     : 24060124140179
// Nama    : Adam Mulya Rasyid
// Tanggal : 22 April 2026

public class Mahasiswa extends Civitasakademika {
    private String nim;
    private Dosen dosenwali;

    public Mahasiswa(String nim, String nama, Dosen dosenwali) {
        super(nama);
        this.nim = nim;
        this.dosenwali = dosenwali;
    }

    @Override
    public String getNomor() { return nim; }

    public void setWali(Dosen d) {
        this.dosenwali = d;
    }

    public void tampilDataMahasiswa() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Dosen Wali: " + (dosenwali != null ? dosenwali.getNama() : "Belum ada"));
    }
}