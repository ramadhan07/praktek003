
package praktek003;


public class baju {
    private String merk;
    private String ukuran;
    private String warna;
    private double harga;
    
    void cetakinfo(){
        System.out.println("merk \t: "+merk+"\n"+
                "ukuran \t: "+ukuran+"\n"+
                "warna \t: "+warna+"\n"+
                "harga \t: "+harga);
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
}
