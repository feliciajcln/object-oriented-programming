public class layang_layang extends objek_geometris{
    // data field
    public double diagonal1;
    public double diagonal2;

    // constructor
    public layang_layang(double diagonal1, double diagonal2){
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    // a method that can be used to output an area 
    public double luas_bangun_datar(){
        return 0.5 * diagonal1 * diagonal2;
    }
}
