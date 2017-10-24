package BelajarThis;

public class Main {

    public static void main(String[] args) {

        Manusia objek = new Manusia();

        //METHOD PROCEDUR
        objek.Berinama("roby");
        System.out.println("Nama : " + objek.nama);

        //METHOD FUNGSI
        objek.BeriUmur(20);
        System.out.println("umur : " + objek.umur);
    }

}
