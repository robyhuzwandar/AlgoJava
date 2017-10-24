package BelajarInnerClass;

/**
 *
 * @author Layar Lipat
 */
public class Kampus {
    
    private String NamaKampus;
    private String jumlahJurusan;
    
    public void Info (){
        System.out.println("Nama kampus : " + NamaKampus);
        System.out.println("Jumlah jurusan : " + jumlahJurusan);
    }

    public String getNamaKampus() {
        return NamaKampus;
    }

    public void setNamaKampus(String NamaKampus) {
        this.NamaKampus = NamaKampus;
    }

    public String getJumlahJurusan() {
        return jumlahJurusan;
    }

    public void setJumlahJurusan(String jumlahJurusan) {
        this.jumlahJurusan = jumlahJurusan;
    }
      
    public class MahasiswaInner{
        
        private String nama;
        private String jurusan;
        private String jenjang;
        
        public void infoM(){
            System.out.println("Nama : " + nama);
            System.out.println("Jurursan : " + jurusan);
            System.out.println("Jenjang : " + jenjang);
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
        
        
    }
}
