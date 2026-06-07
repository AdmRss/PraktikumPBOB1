package jdbc.program;

import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;
import java.util.List;

public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) {
        System.out.println(" insert ");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("Berhasil insert: " + mhsAdd);
        displayAll();

        System.out.println("\n update ");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("Dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();

        System.out.println("\n delete ");
        System.out.println("Akan di-delete: " + service.getById(5));
        service.delete(5);
        displayAll();
    }

    static void displayAll() {
        System.out.println("--- displayAll ---");
        List<Mahasiswa> listmhs = service.getAll();
        for (Mahasiswa m : listmhs) {
            System.out.println(m);
        }
    }
}