package BelajarInnerClass;

import BelajarInnerClass.Kampus.MahasiswaInner;



/**
 *
 * @author Layar Lipat
 */
public class Main {
    public static void main(String[] args) {
        
        Kampus kampus = new Kampus();
        
        kampus.setNamaKampus("Stmik BumiGora Mataram");
        kampus.setJumlahJurusan("4");
        
        kampus.Info();
        System.out.println("=============Mahasiswa===============");
        MahasiswaInner mhs = kampus.new MahasiswaInner();
        
        mhs.setNama("Roby Huzwandar");
        mhs.setJenjang("S1");
        mhs.setJurusan("TI");
        
        mhs.infoM();
    }
    
}
