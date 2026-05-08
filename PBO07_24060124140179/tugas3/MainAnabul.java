package tugas3;

// NIM     : 24060124140179
// Nama    : Adam Mulya Rasyid
// Tanggal : 22 April 2026

public class MainAnabul {
    public static void main(String[] args) {
        Anabul[] peliharaan = new Anabul[3];
        peliharaan[0] = new Kucing("Meng ");
        peliharaan[1] = new Anjing("Anjuy ");
        peliharaan[2] = new Burung("Buwung ");

        for (Anabul hewan : peliharaan) {
            hewan.gerak();
            hewan.bersuara();
            System.out.println(" "); //ngejarakkin
        }
    }
}