package operatoraritmatika;
import static java.lang.System.out;
public class Operatoraritmatika {
    public static void main(String[] args) {
        int mawar = 21;
        int melati = 3;
        int matahari = 5;
        double harga;
        
        harga = 4500.5;
        double total, bayar;
        mawar += melati;
        total=mawar+matahari;
        bayar=total*harga;
        
        System.out.println("jumlah barang yang dibeli (mawar dan melati) = " + melati);
        System.out.println("jumlah barang yang dibeli = (keseluruhan) = " + total);
        System.out.println("total yang dibayar  = Rp"+bayar);   
        
        System.out.println ("Bunga Mawar > Bunga Melati= " + (mawar > melati));
        System.out.println ("Bunga Matahari > Bunga Melati= " + (matahari > melati));
        System.out.println ("Bunga Melati < Bunga Matahari= " + (melati < matahari));
        System.out.println ("Bunga Matahari < Bunga Mawar= " + (matahari < mawar));
        System.out.println ("Bunga Mawar < Bunga Matahari= " + (mawar < matahari));

    }
    
}
