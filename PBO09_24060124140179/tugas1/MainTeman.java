package tugas1;

/*
 * File      : MainTeman.java
 * Deskripsi : Program utama untuk menguji fungsionalitas kelas Teman (List)
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : Rabu, 06 Mei 2026
 */

public class MainTeman {
    public static void main(String[] args) {
        Teman koleksiTeman = new Teman();

        koleksiTeman.addNama("Fazl");
        koleksiTeman.addNama("Raffa");
        koleksiTeman.addNama("Rajib");
        koleksiTeman.addNama("Ibrahim");
        koleksiTeman.addNama("Fazl");

        koleksiTeman.showTeman();
        System.out.println("Banyak elemen: " + koleksiTeman.getNbelm());

        System.out.println("\nsetelah perubahan: ");
        koleksiTeman.delNama("Rajib");
        koleksiTeman.gantiNama("Ibrahim", "Baim");
        koleksiTeman.showTeman();
        
        System.out.println("Apakah Raffa member? " + koleksiTeman.isMember("Raffa"));
        System.out.println("Jumlah nama 'Fazl': " + koleksiTeman.countNama("Fazl"));
    }
}