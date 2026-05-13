/*
 * File      : MainOperator.java
 * Deskripsi : Kelas untuk merepresentasikan objek operator generik
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : Rabu, 29 April 2026
 */
package tugas2;
import anabul.*;
import tugas1.Datum;
public class MainOperator {
    public static void main(String[] args) {
        OperatorGenerik op = new OperatorGenerik();

        // 3b. uji tuker integer
        Datum<Integer> d1 = new Datum<>(); d1.setIsi(3);
        Datum<Integer> d2 = new Datum<>(); d2.setIsi(6);
        op.Tukar(d1, d2);
        System.out.println("Setelah tuker Integer: d1 = " + d1.getIsi() + ", d2 = " + d2.getIsi());

        // 3b. uji tuker string
        Datum<String> s1 = new Datum<>(); s1.setIsi("Adam");
        Datum<String> s2 = new Datum<>(); s2.setIsi("Rasyid");
        op.Tukar(s1, s2);
        System.out.println("Setelah tuker String: s1 = " + s1.getIsi() + ", s2 = " + s2.getIsi());

        // 3b. uji tuker keluarga anabul
        Datum<Anabul> a1 = new Datum<>(); a1.setIsi(new Anjing("BolaUbi"));
        Datum<Anabul> a2 = new Datum<>(); a2.setIsi(new Kucing("Fanny", 3.0));
        op.Tukar(a1, a2);
        System.out.println("Setelah tuker Anabul: a1 = " + a1.getIsi().getNama() + ", a2 = " + a2.getIsi().getNama());

        // 3c. uji bobot 2
        Anggora cat1 = new Anggora("BunBun", 4.0);
        Kembangtelon cat2 = new Kembangtelon("Gacor", 3.5);
        System.out.println("Total bobot Cat1 & Cat2: " + op.Bobot2(cat1, cat2) + " kg");
    }
}