public class persegi_panjang extends objek_geometris{
    // data field
    public double panjang;
    public double lebar;

    // constructor
    public persegi_panjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // a method that can be used to output an area   
    public double luas_bangun_datar(){
        return panjang * lebar;
    }
}
