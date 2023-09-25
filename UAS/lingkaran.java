import java.lang.Math;

public class lingkaran extends objek_geometris{
    // data field
    public double radius;

    // constructor
    public lingkaran(double radius){
        this.radius = radius;
    }

    // a method that can be used to output an area 
    public double luas_bangun_datar(){
        return Math.PI * radius * radius;
    }
}
