/*
 * File      : MataKuliah.java
 * Deskripsi : Berisi atribut dan method dalam class MataKuliah
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : 01/03/2026
*/

/********** CLASS **********/
public class MataKuliah {

    // ATTRIBUTE
    private String idMatKul; // kode unik untuk tiap MatKul, misalnya "PBO", "Strukdat", dll.
    private String nama; // nama lengkap dari MataKuliah, misalnya "Pemrograman Berorientasi Objek", "Struktur Data", dll.
    private int sks; // jumlah sks dalam MataKuliah, misalnya 2, 3, atau 4

    /********** METHOD **********/
    // KONSTURKTOR TANPA PARAMETER
    public MataKuliah(){
    }

    // KONSTRUKTOR DENGAN PARAMETER
    public MataKuliah(String idMatKul, String nama, int sks){ 
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    // SELEKTOR (Getter)
    public String getIdMatKul(){ // Ngambil nilai idMatKul class MataKuliah
        return idMatKul;
    }

    public String getNama(){ // Ngambil nilai nama class MataKuliah
        return nama;
    }

    public Integer getSks(){ // Ngambil nilai sks class MataKuliah
        return sks;
    }

    // MUTATOR (Setter)
    public void setIdMatKul(String idMatKul){ // ngubah/memperbarui nilai dari variabel idMatKul
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama){ // ngubah/memperbarui nilai dari variabel nama
        this.nama = nama;
    }

    public void setSks(int sks){ // ngubah/memperbarui nilai dari variabel sks
        this.sks = sks;
    }
}
