
package BelajarParameterObjek;

/**
 *
 * @author layarlipat
 */
public class MainManusia {
    public static void main(String[] args) {
        //memanggil method dengan objek
        Manusia manusia1 = new Manusia();
        
        manusia1.nama = "roby";
        manusia1.umur = 70;
        
        //procedur
        manusia1.Makan();
        
    }
    
}
