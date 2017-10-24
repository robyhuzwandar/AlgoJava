
package BelajarParameter;

public class Main {
    public static void main(String[] args) {
        
        Manusia objek = new Manusia();
        
        //METHOD PROSEDUR
        objek.MemberiNama("Roby");
        
        //METHOD FUNGSI
        System.out.println("Penghabisan sehari : " + objek.totalPenghabisan(30000, 10000));
    }
    
    
}
