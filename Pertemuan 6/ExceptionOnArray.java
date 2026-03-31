/*
 * File      : ExceptionOnArray.java
 * Deskripsi : Contoh penggunaan exception pada array
 * Pembuat   : Adam Mulya Rasyid
 * Tanggal   : 26/03/2026
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi kesalahan: " + e);
        }

        System.out.println("Program selesai");
    }
}