package BelajarConstruktor;

/**
 *
 * @author Layar Lipat
 */
public class Main {

    public static void main(String[] args) {

        Rumah rumahbaru = new Rumah();
        Rumah rumahkedua = new Rumah("Mataram");
        Rumah rumahketiga = new Rumah(3);
        Rumah rumahKeEmpat = new Rumah("Lombok tengah", 2);
        Rumah jRumah = new Rumah(2, 3);
    }
}
