package Overloading;

/**
 *
 * @author layarlipat
 */
public class Main {

    public static void main(String[] args) {

        Menghitung hitung = new Menghitung();

        int hasil1 = hitung.penjumlahan(4, 5);
        int hasil2 = hitung.penjumlahan(4, 5, 6);
        int hasil3 = hitung.penjumlahan(4, 5, 6, 7);

        System.out.println(hasil1);
        System.out.println(hasil2);
        System.out.println(hasil3);

    }
}
