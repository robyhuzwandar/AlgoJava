package AksesModifier;

/**
 *
 * @author Layar Lipat
 */
public class Main {

    public static void main(String[] args) {

        Harta harta = new Harta();

        //akses Default
        harta.Rumah = "Mataram";

        //akses protected
        harta.motor = "Ninja";

        //akses public
        harta.jembatan = "Kute";

        //menampilakan
        System.out.println("default : " + harta.Rumah);
        System.out.println("public : " + harta.jembatan);
        System.out.println("protected : " + harta.motor);
        harta.cek();
    }

}
