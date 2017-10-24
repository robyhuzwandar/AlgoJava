package BelajarMethod;

public class Manusia {

    String nama;
    int umur;
    double ju = 50000, minum = 5000, makan = 10000, tb;

    //procedur
    public void makan() {
        tb = ju - (minum + makan);
        System.out.println("total bayar : " + tb);

    }

    //fungsi
    public double hitung() {

        double penghabisan = minum + minum;
        return penghabisan;

    }

}
