package BelajarConstruktor;

/**
 *
 * @author Layar Lipat
 */
public class Rumah {

    Rumah() {
        System.out.println("\nRumah pertama");
    }

    Rumah(String alamat) {
        System.out.println("\nRumah ke kedua");
        System.out.println("Alamat : " + alamat);
    }

    Rumah(int tingkat) {
        System.out.println("\nRumah ke tiga");
        System.out.println("Jumlah tingkat : " + tingkat);
    }

    Rumah(String alamat, int tingkat) {
        System.out.println("\nRumah ke Empat");
        System.out.println("Alamat : " + alamat + "Jumlah tingkat : " + tingkat);
    }
    
    Rumah(int Mtrm, int loteng){
        int hasil = Mtrm +loteng;
        System.out.println("jumlah rumah : " +hasil );    
    }

}
