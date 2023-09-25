import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        int choose;
        
        do{
            System.out.println("KALKULATOR PENGHITUNG LUAS BANGUN DATAR");
            System.out.println("Silahkan pilih salah satu bangun datar di bawah ini");
            System.out.println("1. Lingkaran");
            System.out.println("2. Bujur Sangkar");
            System.out.println("3. Layang - Layang");
            System.out.println("4. Jajar Genjang");
            System.out.println("5. Persegi Panjang");
            System.out.println("6. Keluar");
            System.out.print(">> ");
            choose = scan.nextInt();
    
            switch(choose){
                case 1 :
                    double radius;
    
                    System.out.println("\n\nLINGKARAN");
                    System.out.print("Masukkan nilai jari-jari dari lingkaran : ");
                    radius = scan.nextDouble();
    
                    lingkaran circle = new lingkaran(radius);
                    System.out.println("Luas lingkaran yang mempunyai jari-jari " + radius + " adalah " + circle.luas_bangun_datar()
                                        + "\n\n\n");
                    
                    break;
                case 2 :
                    double sisi;
    
                    System.out.println("\n\nBUJUR SANGKAR");
                    System.out.print("Masukkan nilai sisi dari bujur sangkar : ");
                    sisi = scan.nextDouble();
    
                    bujur_sangkar square = new bujur_sangkar(sisi);
                    System.out.println("Luas bujur sangkar yang mempunyai sisi " + sisi + " adalah " + square.luas_bangun_datar() + "\n\n\n");
                    
                    break;
                case 3 :
                    double diagonal1, diagonal2;
    
                    System.out.println("\n\nLAYANG - LAYANG");
                    System.out.print("Masukkan nilai diagonal pertama dari layang - layang : ");
                    diagonal1 = scan.nextDouble();
                    System.out.print("Masukkan nilai diagonal kedua dari layang - layang : ");
                    diagonal2 = scan.nextDouble();
    
                    layang_layang kite = new layang_layang(diagonal1, diagonal2);
                    System.out.println("Luas layang - layang yang mempunyai diagonal pertama " + diagonal1 + " dan diagonal kedua " 
                                        + diagonal2 + " adalah " + kite.luas_bangun_datar() + "\n\n\n");
                    
                    break;
                case 4 :
                    double alas, tinggi;
    
                    System.out.println("\n\nJAJAR GENJANG");
                    System.out.print("Masukkan nilai alas dari jajar genjang : ");
                    alas = scan.nextDouble();
                    System.out.print("Masukkan nilai tinggi dari jajar genjang : ");
                    tinggi = scan.nextDouble();
    
                    jajar_genjang parallelogram = new jajar_genjang(alas, tinggi);
                    System.out.println("Luas jajar genjang yang mempunyai alas " + alas + " dan tinggi " + tinggi + " adalah " 
                                        + parallelogram.luas_bangun_datar() + "\n\n\n");
                    
                    break;
                case 5 :
                    double panjang, lebar;
    
                    System.out.println("\n\nPERSEGI PANJANG");
                    System.out.print("Masukkan nilai panjang dari persedi panjang : ");
                    panjang = scan.nextDouble();
                    System.out.print("Masukkan nilai lebar dari persegi panjang : ");
                    lebar = scan.nextDouble();
    
                    persegi_panjang rectangle = new persegi_panjang(panjang, lebar);
                    System.out.println("Luas persegi panjang yang mempunyai panjang " + panjang + " dan lebar " + lebar + " adalah " 
                                        + rectangle.luas_bangun_datar() + "\n\n\n");
                    
                    break;
                case 6 : {
                    System.exit(0);
                }
            }
        } while (choose != 6);
    }
}