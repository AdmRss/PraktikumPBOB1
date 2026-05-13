package tugas1;
import anabul.*;
public class MainDatum {
    public static void main(String[] args) {
        Datum<Anabul> d = new Datum<>();
        d.setIsi(new Kucing("Garfield", 5.2));
        System.out.println("Isi Datum: " + d.getIsi().getNama());
        d.getIsi().gerak();
    }
}