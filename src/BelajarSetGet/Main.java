package BelajarSetGet;

/**
 *
 * @author Layar Lipat
 */
public class Main {

    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa();

        mhs.setNim("1510530161");
        mhs.setNama("Roby Huzwandar");
        mhs.setJurusan("Teknik informatika");
        mhs.setJenjang("S1");
        mhs.setSemester(3);

        mhs.info();
    }

}
