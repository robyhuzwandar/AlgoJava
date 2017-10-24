
package BelajarOveraide1;

/**
 *
 * @author layarlipat
 */
public class OrangTua {
    
    private String mobil, rumah, uang, tanah;

    public void jumlahHarta() {
        System.out.println("Mobil : " + mobil + "\n"
                + "Rumah : " + rumah + "\n"
                + "Uang : " + uang + "\n"
                + "Tanah : " + tanah);
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public String getRumah() {
        return rumah;
    }

    public void setRumah(String rumah) {
        this.rumah = rumah;
    }

    public String getTanah() {
        return tanah;
    }

    public void setTanah(String tanah) {
        this.tanah = tanah;
    }

    public String getUang() {
        return uang;
    }

    public void setUang(String uang) {
        this.uang = uang;
    }

    
}
