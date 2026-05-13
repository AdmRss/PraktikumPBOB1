package anabul;
public class Burung extends Anabul {
    public Burung(String nama) { super(nama); }
    @Override
    public void gerak() { System.out.println(nama + " (Burung) terbang."); }
}