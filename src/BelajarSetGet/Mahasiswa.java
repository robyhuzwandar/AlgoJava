/*
    Belajar set get , set untuk memberi nilai dan get untuk menampilkan atau mengambil nilai.
    set itu sifatnya procedur sedangkan get itu sifat itu sifat nya  fungsi yaitu mrngembalikan nilai.
 */
package BelajarSetGet;

/**
 *
 * @author Layar Lipat
 */
public class Mahasiswa {

    private String nim;
    private String nama;
    private String jurusan;
    private String jenjang;
    private int semester;

    public void info() {
        System.out.println("Nim : " + getNim() + "\n"
                + "Nama : " + getNama() + "\n"
                + "Jurusan : " + getJurusan() + "\n"
                + "Jejang : " + getJenjang() + "\n"
                + "Semester : " + getSemester());

    }

    //METHOD FUNGSI
    public String getNim() {
        return nim;
    }

    //METHOD PROCEDUR
    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getJenjang() {
        return jenjang;
    }

    public void setJenjang(String jenjang) {
        this.jenjang = jenjang;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

}
