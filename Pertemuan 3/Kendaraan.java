/*
 * File      : Kendaraan.java
 * Deskripsi : Berisi atribut dan method dalam class Kendaraan
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : 01/03/2026
*/

/********** CLASS **********/
public class Kendaraan {

    // ATRIBUT
    private String noPlat; // nomor plat kendaraan, misal "B 1234 ABC", dll.
    private String jenis; // motor atau mobil

    /********** METHOD **********/
    // KONSTRUKTOR TANPA PARAMETER
    public Kendaraan(){
    }

    // KONSTRUKTOR DENGAN PARAMETER
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // SELEKTOR (Getter)
    public String getNoPlat(){ // Ngambil nilai noPlat class Kendaraan
        return noPlat;
    }

    public String getJenis(){ // Ngambil nilai jenis class Kendaraan
        return jenis;
    }

    // MUTATOR (Setter)
    public void setNoPlat(String noPlat){ // ngubah/memperbarui nilai dari variabel noPlat
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis){ // ngubah/memperbarui nilai dari variabel jenis
        this.jenis = jenis;
    }
}


