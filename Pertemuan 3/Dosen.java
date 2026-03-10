/*
 * File      : Dosen.java
 * Deskripsi : Berisi atribut dan method dalam class Dosen
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : 01/03/2026
*/

/********** CLASS **********/
public class Dosen {

    /********** ATRIBUT **********/
    private String nip; // kode unik tiap dosen, misal "12345678", dll.
    private String nama; // nama lengkap Dosen, misal "Rismiyati, B.Eng, M.Cs", dll.
    private String prodi; // program studi Dosen, misal "Bahasa Inggris", dll.

/********** METODE **********/
// KONSTRUKTOR TANPA PARAMETER 
public Dosen() {
}

// KONSTRUKTOR DENGAN PARAMETER 
public Dosen(String nip, String prodi, String nama){
    this.nip = nip;
    this.nama = nama;
    this.prodi = prodi;
    }

// SELEKTOR (Getter)
public String getNip(){ // Ngambil nilai nip class dosen
    return nip; 
    }

public String getNama(){ // Ngambil nilai nama class dosen
    return nama;
    }

public String getProdi(){ // Ngambil nilai prodi class dosen
    return prodi;
    }

// MUTATOR (Setter)
public void setNip(String nip){ // ngubah/memperbarui nilai dari variabel nip
    this.nip = nip;
    }

public void setNama(String nama){ // ngubah/memperbarui nilai dari variabel nama
    this.nama = nama;
    }

public void setProdi(String prodi){ // ngubah/memperbarui nilai dari variabel prodi
    this.prodi = prodi;
    }
}