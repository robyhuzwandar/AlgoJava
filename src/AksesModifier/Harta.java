
package AksesModifier;

/**
 *
 * @author Layar Lipat
 */
public class Harta {
    
    String Rumah; //akses default
    private double uang; //akses private
    protected String motor; //akses protected
    public String jembatan; //akses public
    
    
    public void cek(){
        uang = 5000.00;
       System.out.println("Minta uang : " +uang);
    }
}
