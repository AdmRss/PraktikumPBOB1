package tugas2;
import anabul.*;
import java.util.LinkedList;
import java.util.Queue;

/*
 * File      : Piaraan.java
 * Deskripsi : Kelas untuk mengelola antrean (Queue) Anabul di klinik
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : Rabu, 06 Mei 2026
 */

public class Piaraan {
    private int nbelm;
    private Queue<Anabul> Lanabul;

    public Piaraan() {
        this.Lanabul = new LinkedList<>();
        this.nbelm = 0;
    }

    public int getNbelm() {
        return Lanabul.size();
    }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        nbelm++;
    }

    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    public Anabul dequeueAnabul() {
        Anabul a = Lanabul.poll();
        if (a != null) {
            nbelm--;
        }
        return a;
    }

    public void showAnabul() {
        System.out.println("Daftar Panggilan Anabul dalam antrean:");
        for (Anabul a : Lanabul) {
            System.out.println("- " + a.getNama());
        }
    }

    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public double bobotKucing() {
        double totalBobot = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                totalBobot += ((Kucing) a).getBobot();
            }
        }
        return totalBobot;
    }

    public void showJenisAnabul() {
        System.out.println("Antrean Anabul beserta Jenisnya:");
        for (Anabul a : Lanabul) {
            System.out.println("- " + a.getNama() + ", Jenis: " + a.getClass().getSimpleName());
        }
    }
}