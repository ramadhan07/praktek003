
package praktek003;

public class bajuaksi {
    public static void main(String[] args) {
        baju b = new baju();
       
        b.setMerk("X8");
        b.setUkuran("L");
        b.setWarna("putih");
        b.setHarga(5000);
        
        b.cetakinfo();
        
        System.out.print("merknya \t: ");
        System.out.println(b.getMerk());
        System.out.print("ukurannya \t: ");
        System.out.println(b.getUkuran());
        System.out.print("warnanya \t: ");
        System.out.println(b.getWarna());
        System.out.print("harganya \t: ");
        System.out.println(b.getHarga());
    }
}
