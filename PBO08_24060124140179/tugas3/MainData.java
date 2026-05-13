package tugas3;
import anabul.*;
public class MainData {
    public static void main(String[] args) {
        Data<Anabul> koleksi = new Data<>();
        
        // 4b. Prosedur setIsi keluarga Anabul
        koleksi.setIsi(1, new Kucing("Ligu", 3.0));
        koleksi.setIsi(2, new Anjing("Jigu"));
        koleksi.setIsi(3, new Burung("Perkutut"));
        
        // 4d. Fungsi getSize
        System.out.println("Banyak data efektif: " + koleksi.getSize());
        
        // 4c. Fungsi getIsi keluarga Anabul
        for (int i = 1; i <= koleksi.getSize(); i++) {
            System.out.println("Data posisi " + i + ": " + koleksi.getIsi(i).getNama());
            koleksi.getIsi(i).gerak();
        }
    }
}