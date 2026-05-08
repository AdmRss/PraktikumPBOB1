package tugas2;

// NIM     : 24060124140179
// Nama    : Adam Mulya Rasyid
// Tanggal : 22 April 2026

public class MainMahasiswa {
    public static void main(String[] args) {
        //konstruktor c (Tanpa Parameter)
        Mahasiswa m1 = new Mahasiswa();
        System.out.print("M1: Default ");
        m1.tampilData();

        //konstruktor d (3 Parameter)
        Mahasiswa m2 = new Mahasiswa(2406012, "Adam Mulya", "Informatika");
        System.out.print("M2: 3 parameter ");
        m2.tampilData();

        //konstruktor e (Kloning)
        Mahasiswa m3 = new Mahasiswa(m2);
        System.out.print("M3: kloning  M2 ");
        m3.tampilData();

        //Overloading setProgramStudi
        m1.setProgramStudi(); // Varian 1
        System.out.print("M1: set tanpa parameter ");
        m1.tampilData();

        m1.setProgramStudi("Sistem Informasi"); // Varian 2
        System.out.print("M1: set dengan parameter ");
        m1.tampilData();

        m1.setProgramStudi(m2); // Varian 3
        System.out.print("M1: set dengan objek M2");
        m1.tampilData();
    }
}