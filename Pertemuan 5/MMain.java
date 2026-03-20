/* 
 * File      : MMain.java
 * Deskripsi : Main class untuk testing abstract class dan interface
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : 18/03/2026
*/

/********** CLASS **********/
public class MMain {

    /********** METHOD **********/
    public static void main(String[] args) {

        // BangunDatar B = new BangunDatar(); // ERROR (abstract)

        BangunDatar p1 = new Persegi(10);
        Persegi p2 = new Persegi(5);
        BangunDatar l1 = new Lingkaran(7);
        Lingkaran l2 = new Lingkaran(14);

        System.out.println("Luas p1: " + p1.getLuas());
        System.out.println("Luas l1: " + l1.getLuas());

        System.out.println("Apakah luas sama? " + p1.isEqualLuas(l1));

        // Resize
        p2.zoomIn();
        l2.zoomOut();

        System.out.println("Luas p2 setelah zoomIn: " + p2.getLuas());
        System.out.println("Luas l2 setelah zoomOut: " + l2.getLuas());
    }
}