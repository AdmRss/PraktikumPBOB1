package tugas4;
public abstract class Civitasakademika {
    protected String nama;
    public Civitasakademika(String nama) { this.nama = nama; }
    public abstract String getNomor();
    public String getNama() { return nama; }
}