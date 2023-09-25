public class jajar_genjang extends objek_geometris{
    // data field
    public double alas;
    public double tinggi;

    // constructor
    public jajar_genjang(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // a method that can be used to output an area 
    public double luas_bangun_datar(){
        return alas * tinggi;
    }
}
