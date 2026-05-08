package tugas4;
public class Dosen extends Civitasakademika {
    private String nip;
    public Dosen(String nip, String nama) {
        super(nama);
        this.nip = nip;
    }
    @Override
    public String getNomor() { return nip; }
}