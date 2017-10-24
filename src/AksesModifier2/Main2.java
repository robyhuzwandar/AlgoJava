package AksesModifier2;

import AksesModifier.Harta;

/**
 *
 * @author Layar Lipat
 */
public class Main2 {

    public static void main(String[] args) {

        Harta harta2 = new Harta();

        //akses public
        harta2.jembatan = "kute";
        harta2.cek();
        System.out.println(harta2.jembatan);
    }

}
