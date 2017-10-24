package BelajarParameterObjek;

/**
 *
 * @author layarlipat
 */
public class Mobil_Parameter {

    /*
    variable ada 2 
    
    variable local : Di dalam method
    variable global : 
     */
    //global    
    int jarak;
    int waktu;
    double kecepatan;

    public Mobil_Parameter(int jarak, int waktu) { //CONSTRUKTOR
//        this.jarak = jarak;
//        this.waktu = waktu;

        kecepatan = jarak / waktu;
        System.out.println("kecepatan : " + kecepatan);

    }

//    
//
//    public double ukur() {
//
//        int jarak;
//        int waktu;
//
//        double kecepatan;
//
//        jarak = 100;
//        waktu = 50;
//
//        kecepatan = jarak / waktu;
//
//        return kecepatan;
//    }
//
//    public double ukur(int jarak, int waktu) {
//        double kecepatan = jarak / waktu;
//
//        return kecepatan;
//    }
//
//    void baru() {
//
//        System.out.println("method" + ukur());
//    }
//    public static void main(String[] args) {
//        Mobil m = new Mobil(100, 50);
//        System.out.println(m.kecepatan);
////        System.out.println(m.ukur());
////        System.out.println(m.ukur(1000, 50));
//
//    }
}
