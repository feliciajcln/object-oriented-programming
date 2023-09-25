public class bujur_sangkar extends objek_geometris{
    // data field
    public double sisi;

    // constructor
    public bujur_sangkar(double sisi){
        this.sisi = sisi;
    }

    // a method that can be used to output an area 
    public double luas_bangun_datar(){
        return sisi * sisi;
    }
}
