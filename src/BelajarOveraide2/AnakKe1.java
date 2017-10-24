package BelajarOveraide2;

import BelajarPewarisan1.OrangTua;

/**
 *
 * @author layarlipat
 */
public class AnakKe1 extends OrangTua {
    
    String apartemen;
    @Override
    public void jumlahHarta() {
        super.jumlahHarta();
        System.out.println("Apartemen : " + apartemen);
    }

    public String getApartemen() {
        return apartemen;
    }

    public void setApartemen(String apartemen) {
        this.apartemen = apartemen;
    }
    
    
   
}
