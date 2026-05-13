package tugas1;
import java.util.ArrayList;
import java.util.List;

/*
 * File      : Teman.java
 * Deskripsi : Kelas untuk mengelola koleksi list nama teman dengan elemen String
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : Rabu, 06 Mei 2026
 */

public class Teman {
    private int nbelm;
    private List<String> Lnama;

    public Teman() {
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }

    public int getNbelm() {
        return Lnama.size();
    }

    public String getNama(int indeks) {
        return Lnama.get(indeks);
    }

    public void setNama(int indeks, String nama) {
        Lnama.set(indeks, nama);
    }

    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm--;
        }
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namabaru) {
        int index = Lnama.indexOf(nama);
        if (index != -1) {
            Lnama.set(index, namabaru);
        }
    }

    public int countNama(String nama) {
        int count = 0;
        for (String s : Lnama) {
            if (s.equals(nama)) {
                count++;
            }
        }
        return count;
    }

    public void showTeman() {
        System.out.println("Daftar Nama Teman: ");
        for (String s : Lnama) {
            System.out.println("- " + s);
        }
    }
}